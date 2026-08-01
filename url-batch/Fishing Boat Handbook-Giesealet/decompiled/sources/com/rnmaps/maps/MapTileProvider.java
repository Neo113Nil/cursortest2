package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.android.gms.maps.model.UrlTileProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class MapTileProvider implements TileProvider {
    protected static final int BUFFER_SIZE = 16384;
    protected static final int TARGET_TILE_SIZE = 512;
    protected Context context;
    protected boolean customMode;
    protected boolean doubleTileSize;
    protected boolean flipY;
    protected int maximumNativeZ;
    protected int maximumZ;
    protected int minimumZ;
    protected boolean offlineMode;
    protected int tileCacheMaxAge;
    protected String tileCachePath;
    protected UrlTileProvider tileProvider;
    protected int tileSize;
    protected String urlTemplate;

    public void setCustomMode() {
    }

    class AIRMapUrlTileProvider extends UrlTileProvider {
        private String urlTemplate;

        public AIRMapUrlTileProvider(int i, int i2, String str) {
            super(i, i2);
            this.urlTemplate = str;
        }

        @Override // com.google.android.gms.maps.model.UrlTileProvider
        public URL getTileUrl(int i, int i2, int i3) {
            if (MapTileProvider.this.flipY) {
                i2 = ((1 << i3) - i2) - 1;
            }
            String replace = this.urlTemplate.replace("{x}", Integer.toString(i)).replace("{y}", Integer.toString(i2)).replace("{z}", Integer.toString(i3));
            if (MapTileProvider.this.maximumZ > 0 && i3 > MapTileProvider.this.maximumZ) {
                return null;
            }
            if (MapTileProvider.this.minimumZ > 0 && i3 < MapTileProvider.this.minimumZ) {
                return null;
            }
            try {
                return new URL(replace);
            } catch (MalformedURLException e) {
                throw new AssertionError(e);
            }
        }

        public void setUrlTemplate(String str) {
            this.urlTemplate = str;
        }
    }

    public MapTileProvider(int i, boolean z, String str, int i2, int i3, int i4, boolean z2, String str2, int i5, boolean z3, Context context, boolean z4) {
        this.tileProvider = new AIRMapUrlTileProvider(i, i, str);
        this.tileSize = i;
        this.doubleTileSize = z;
        this.urlTemplate = str;
        this.maximumZ = i2;
        this.maximumNativeZ = i3;
        this.minimumZ = i4;
        this.flipY = z2;
        this.tileCachePath = str2;
        this.tileCacheMaxAge = i5;
        this.offlineMode = z3;
        this.context = context;
        this.customMode = z4;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public Tile getTile(int i, int i2, int i3) {
        byte[] bArr;
        int i4;
        if (!this.customMode) {
            return this.tileProvider.getTile(i, i2, i3);
        }
        int i5 = this.maximumZ;
        if (i5 <= 0) {
            i5 = Integer.MAX_VALUE;
        }
        if (this.tileSize != 256 || !this.doubleTileSize || (i4 = i3 + 1) > this.maximumNativeZ || i4 > i5) {
            bArr = null;
        } else {
            Log.d("urlTile", "pullTilesFromHigherZoom");
            bArr = pullTilesFromHigherZoom(i, i2, i3);
        }
        if (i3 > this.maximumNativeZ) {
            Log.d("urlTile", "scaleLowerZoomTile");
            bArr = scaleLowerZoomTile(i, i2, i3, this.maximumNativeZ);
        }
        if (bArr == null && i3 <= i5) {
            Log.d("urlTile", "getTileImage");
            bArr = getTileImage(i, i2, i3);
        }
        if (bArr == null && this.tileCachePath != null && this.offlineMode) {
            Log.d("urlTile", "findLowerZoomTileForScaling");
            int i6 = this.maximumNativeZ;
            int max = Math.max(this.minimumZ, i3 - 3);
            for (int i7 = i3 > i6 ? i6 - 1 : i3 - 1; i7 >= max; i7--) {
                bArr = scaleLowerZoomTile(i, i2, i3, i7);
                if (bArr != null) {
                    break;
                }
            }
        }
        if (bArr == null) {
            return null;
        }
        int i8 = this.tileSize;
        return new Tile(i8, i8, bArr);
    }

    byte[] getTileImage(int i, int i2, int i3) {
        byte[] bArr;
        if (this.tileCachePath != null) {
            bArr = readTileImage(i, i2, i3);
            if (bArr != null) {
                Log.d("urlTile", "tile cache HIT for " + i3 + "/" + i + "/" + i2);
            } else {
                Log.d("urlTile", "tile cache MISS for " + i3 + "/" + i + "/" + i2);
            }
            if (bArr != null && !this.offlineMode) {
                checkForRefresh(i, i2, i3);
            }
        } else {
            bArr = null;
        }
        if (bArr == null && !this.offlineMode && this.tileCachePath != null) {
            String tileFilename = getTileFilename(i, i2, i3);
            OneTimeWorkRequest build = new OneTimeWorkRequest.Builder(MapTileWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).addTag(tileFilename).setInputData(new Data.Builder().putString(ImagesContract.URL, getTileUrl(i, i2, i3).toString()).putString("filename", tileFilename).putInt("maxAge", -1).build()).build();
            WorkManager workManager = WorkManager.getInstance(this.context.getApplicationContext());
            try {
                workManager.enqueueUniqueWork(tileFilename, ExistingWorkPolicy.KEEP, build).getResult().get(1L, TimeUnit.SECONDS);
                Thread.sleep(500L);
                Log.d("urlTile: ", workManager.getWorkInfosByTag(tileFilename).get(1L, TimeUnit.SECONDS).get(0).toString());
                if (this.tileCachePath != null) {
                    bArr = readTileImage(i, i2, i3);
                    if (bArr != null) {
                        Log.d("urlTile", "tile cache fetch HIT for " + i3 + "/" + i + "/" + i2);
                    } else {
                        Log.d("urlTile", "tile cache fetch MISS for " + i3 + "/" + i + "/" + i2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (bArr == null && !this.offlineMode) {
            Log.d("urlTile", "Normal fetch");
            bArr = fetchTile(i, i2, i3);
            if (bArr == null) {
                Log.d("urlTile", "tile fetch TIMEOUT / FAIL for " + i3 + "/" + i + "/" + i2);
            }
        }
        return bArr;
    }

    byte[] pullTilesFromHigherZoom(int i, int i2, int i3) {
        Bitmap newBitmap = getNewBitmap();
        Canvas canvas = new Canvas(newBitmap);
        Paint paint = new Paint();
        int i4 = i * 2;
        int i5 = i2 * 2;
        int i6 = i3 + 1;
        byte[] tileImage = getTileImage(i4, i5, i6);
        int i7 = i5 + 1;
        byte[] tileImage2 = getTileImage(i4, i7, i6);
        int i8 = i4 + 1;
        byte[] tileImage3 = getTileImage(i8, i5, i6);
        byte[] tileImage4 = getTileImage(i8, i7, i6);
        if (tileImage == null || tileImage2 == null || tileImage3 == null || tileImage4 == null) {
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(tileImage, 0, tileImage.length);
        canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, paint);
        decodeByteArray.recycle();
        Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(tileImage2, 0, tileImage2.length);
        canvas.drawBitmap(decodeByteArray2, 0.0f, 256.0f, paint);
        decodeByteArray2.recycle();
        Bitmap decodeByteArray3 = BitmapFactory.decodeByteArray(tileImage3, 0, tileImage3.length);
        canvas.drawBitmap(decodeByteArray3, 256.0f, 0.0f, paint);
        decodeByteArray3.recycle();
        Bitmap decodeByteArray4 = BitmapFactory.decodeByteArray(tileImage4, 0, tileImage4.length);
        canvas.drawBitmap(decodeByteArray4, 256.0f, 256.0f, paint);
        decodeByteArray4.recycle();
        byte[] bitmapToByteArray = bitmapToByteArray(newBitmap);
        newBitmap.recycle();
        return bitmapToByteArray;
    }

    Bitmap getNewBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    byte[] bitmapToByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArray;
    }

    byte[] scaleLowerZoomTile(int i, int i2, int i3, int i4) {
        int i5 = i3 - i4;
        int i6 = 1 << i5;
        int i7 = i >> i5;
        int i8 = i2 >> i5;
        int i9 = i3 - i5;
        int i10 = i % i6;
        int i11 = i2 % i6;
        Bitmap newBitmap = getNewBitmap();
        Canvas canvas = new Canvas(newBitmap);
        Paint paint = new Paint();
        byte[] tileImage = getTileImage(i7, i8, i9);
        if (tileImage == null) {
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(tileImage, 0, tileImage.length);
        int i12 = this.tileSize / i6;
        int i13 = i10 * i12;
        int i14 = i11 * i12;
        canvas.drawBitmap(decodeByteArray, new Rect(i13, i14, i13 + i12, i12 + i14), new Rect(0, 0, 512, 512), paint);
        decodeByteArray.recycle();
        byte[] bitmapToByteArray = bitmapToByteArray(newBitmap);
        newBitmap.recycle();
        return bitmapToByteArray;
    }

    void checkForRefresh(int i, int i2, int i3) {
        String tileFilename = getTileFilename(i, i2, i3);
        if ((System.currentTimeMillis() - new File(tileFilename).lastModified()) / 1000 > this.tileCacheMaxAge) {
            Log.d("urlTile", "Refreshing");
            WorkManager.getInstance(this.context.getApplicationContext()).enqueueUniqueWork(tileFilename, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(MapTileWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).addTag(tileFilename).setInputData(new Data.Builder().putString(ImagesContract.URL, getTileUrl(i, i2, i3).toString()).putString("filename", tileFilename).putInt("maxAge", this.tileCacheMaxAge).build()).build());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    byte[] fetchTile(int i, int i2, int i3) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? tileUrl = getTileUrl(i, i2, i3);
        try {
            try {
                tileUrl = tileUrl.openConnection().getInputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e) {
            e = e;
            tileUrl = 0;
            byteArrayOutputStream = null;
            e.printStackTrace();
            if (tileUrl != 0) {
            }
            if (byteArrayOutputStream != null) {
            }
            return null;
        } catch (OutOfMemoryError e2) {
            e = e2;
            tileUrl = 0;
            byteArrayOutputStream = null;
            e.printStackTrace();
            if (tileUrl != 0) {
            }
            if (byteArrayOutputStream != null) {
            }
            return null;
        } catch (Throwable th3) {
            i3 = 0;
            th = th3;
            tileUrl = 0;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = tileUrl.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (tileUrl != 0) {
                    try {
                        tileUrl.close();
                    } catch (Exception unused) {
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused2) {
                }
                return byteArray;
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                if (tileUrl != 0) {
                    try {
                        tileUrl.close();
                    } catch (Exception unused3) {
                    }
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                return null;
            } catch (OutOfMemoryError e4) {
                e = e4;
                e.printStackTrace();
                if (tileUrl != 0) {
                }
                if (byteArrayOutputStream != null) {
                }
                return null;
            }
        } catch (IOException e5) {
            e = e5;
            byteArrayOutputStream = null;
            e.printStackTrace();
            if (tileUrl != 0) {
            }
            if (byteArrayOutputStream != null) {
            }
            return null;
        } catch (OutOfMemoryError e6) {
            e = e6;
            byteArrayOutputStream = null;
            e.printStackTrace();
            if (tileUrl != 0) {
            }
            if (byteArrayOutputStream != null) {
            }
            return null;
        } catch (Throwable th4) {
            i3 = 0;
            th = th4;
            if (tileUrl != 0) {
                try {
                    tileUrl.close();
                } catch (Exception unused5) {
                }
            }
            if (i3 != 0) {
                try {
                    i3.close();
                    throw th;
                } catch (Exception unused6) {
                    throw th;
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.FileInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    byte[] readTileImage(int i, int i2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream2;
        ?? tileFilename = getTileFilename(i, i2, i3);
        if (tileFilename == 0) {
            return null;
        }
        File file = new File((String) tileFilename);
        try {
            try {
                tileFilename = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e) {
            e = e;
            tileFilename = 0;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (tileFilename != 0) {
                try {
                    tileFilename.close();
                } catch (Exception unused) {
                }
            }
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception unused2) {
                }
            }
            return null;
        } catch (OutOfMemoryError e2) {
            e = e2;
            tileFilename = 0;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (tileFilename != 0) {
            }
            if (byteArrayOutputStream2 != null) {
            }
            return null;
        } catch (Throwable th3) {
            byteArrayOutputStream = null;
            th = th3;
            tileFilename = 0;
        }
        try {
            byteArrayOutputStream2 = new ByteArrayOutputStream();
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (tileFilename != 0) {
            }
            if (byteArrayOutputStream2 != null) {
            }
            return null;
        } catch (OutOfMemoryError e4) {
            e = e4;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (tileFilename != 0) {
            }
            if (byteArrayOutputStream2 != null) {
            }
            return null;
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            if (tileFilename != 0) {
                try {
                    tileFilename.close();
                } catch (Exception unused3) {
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (Exception unused4) {
                    throw th;
                }
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = tileFilename.read(bArr, 0, 16384);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream2.write(bArr, 0, read);
            }
            byteArrayOutputStream2.flush();
            if (this.tileCacheMaxAge == 0) {
                file.setLastModified(System.currentTimeMillis());
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            try {
                tileFilename.close();
            } catch (Exception unused5) {
            }
            try {
                byteArrayOutputStream2.close();
            } catch (Exception unused6) {
            }
            return byteArray;
        } catch (IOException e5) {
            e = e5;
            e.printStackTrace();
            if (tileFilename != 0) {
            }
            if (byteArrayOutputStream2 != null) {
            }
            return null;
        } catch (OutOfMemoryError e6) {
            e = e6;
            e.printStackTrace();
            if (tileFilename != 0) {
            }
            if (byteArrayOutputStream2 != null) {
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean writeTileImage(byte[] bArr, int i, int i2, int i3) {
        FileOutputStream fileOutputStream;
        String tileFilename = getTileFilename(i, i2, i3);
        if (tileFilename == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(tileFilename);
                file.getParentFile().mkdirs();
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(bArr);
                try {
                    fileOutputStream.close();
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused2) {
                    }
                }
                return false;
            } catch (OutOfMemoryError e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (OutOfMemoryError e4) {
            e = e4;
        }
    }

    String getTileFilename(int i, int i2, int i3) {
        if (this.tileCachePath == null) {
            return null;
        }
        return this.tileCachePath + '/' + i3 + "/" + i + "/" + i2;
    }

    protected URL getTileUrl(int i, int i2, int i3) {
        return this.tileProvider.getTileUrl(i, i2, i3);
    }

    public void setUrlTemplate(String str) {
        this.urlTemplate = str;
    }

    public void setTileSize(int i) {
        if (this.tileSize != i) {
            this.tileProvider = new AIRMapUrlTileProvider(i, i, this.urlTemplate);
        }
        this.tileSize = i;
    }

    public void setDoubleTileSize(boolean z) {
        this.doubleTileSize = z;
    }

    public void setMaximumZ(int i) {
        this.maximumZ = i;
    }

    public void setMaximumNativeZ(int i) {
        this.maximumNativeZ = i;
    }

    public void setMinimumZ(int i) {
        this.minimumZ = i;
    }

    public void setFlipY(boolean z) {
        this.flipY = z;
    }

    public void setTileCachePath(String str) {
        this.tileCachePath = str;
    }

    public void setTileCacheMaxAge(int i) {
        this.tileCacheMaxAge = i;
    }

    public void setOfflineMode(boolean z) {
        this.offlineMode = z;
    }
}
