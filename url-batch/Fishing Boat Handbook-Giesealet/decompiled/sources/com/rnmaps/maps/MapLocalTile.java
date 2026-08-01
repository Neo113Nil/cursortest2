package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class MapLocalTile extends MapFeature {
    private String pathTemplate;
    private TileOverlay tileOverlay;
    private TileOverlayOptions tileOverlayOptions;
    private AIRMapLocalTileProvider tileProvider;
    private float tileSize;
    private boolean useAssets;
    private float zIndex;

    class AIRMapLocalTileProvider implements TileProvider {
        private static final int BUFFER_SIZE = 16384;
        private String pathTemplate;
        private int tileSize;
        private final boolean useAssets;

        public AIRMapLocalTileProvider(int i, String str, boolean z) {
            this.tileSize = i;
            this.pathTemplate = str;
            this.useAssets = z;
        }

        @Override // com.google.android.gms.maps.model.TileProvider
        public Tile getTile(int i, int i2, int i3) {
            byte[] readTileImage = readTileImage(i, i2, i3);
            if (readTileImage == null) {
                return TileProvider.NO_TILE;
            }
            int i4 = this.tileSize;
            return new Tile(i4, i4, readTileImage);
        }

        public void setPathTemplate(String str) {
            this.pathTemplate = str;
        }

        public void setTileSize(int i) {
            this.tileSize = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private byte[] readTileImage(int i, int i2, int i3) {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            String tileFilename = getTileFilename(i, i2, i3);
            InputStream inputStream2 = null;
            try {
                InputStream open = this.useAssets ? MapLocalTile.this.getContext().getAssets().open(tileFilename) : new FileInputStream(tileFilename);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int read = open.read(bArr, 0, 16384);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Exception unused) {
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        return byteArray;
                    } catch (IOException e) {
                        e = e;
                        inputStream = open;
                        e = e;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            e.printStackTrace();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (byteArrayOutputStream2 != null) {
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Exception unused4) {
                                }
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception unused5) {
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Exception unused6) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        inputStream = open;
                        e = e;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        e.printStackTrace();
                        if (inputStream != null) {
                        }
                        if (byteArrayOutputStream2 != null) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        inputStream2 = open;
                        th = th2;
                        if (inputStream2 != null) {
                        }
                        if (byteArrayOutputStream == null) {
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    byteArrayOutputStream2 = null;
                    Throwable th3 = e;
                    inputStream = open;
                    e = th3;
                    e.printStackTrace();
                    if (inputStream != null) {
                    }
                    if (byteArrayOutputStream2 != null) {
                    }
                    return null;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    byteArrayOutputStream2 = null;
                    Throwable th32 = e;
                    inputStream = open;
                    e = th32;
                    e.printStackTrace();
                    if (inputStream != null) {
                    }
                    if (byteArrayOutputStream2 != null) {
                    }
                    return null;
                } catch (Throwable th4) {
                    inputStream2 = open;
                    th = th4;
                    byteArrayOutputStream = null;
                }
            } catch (IOException e5) {
                e = e5;
                inputStream = null;
                byteArrayOutputStream2 = null;
                e.printStackTrace();
                if (inputStream != null) {
                }
                if (byteArrayOutputStream2 != null) {
                }
                return null;
            } catch (OutOfMemoryError e6) {
                e = e6;
                inputStream = null;
                byteArrayOutputStream2 = null;
                e.printStackTrace();
                if (inputStream != null) {
                }
                if (byteArrayOutputStream2 != null) {
                }
                return null;
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
            }
        }

        private String getTileFilename(int i, int i2, int i3) {
            return this.pathTemplate.replace("{x}", Integer.toString(i)).replace("{y}", Integer.toString(i2)).replace("{z}", Integer.toString(i3));
        }
    }

    public MapLocalTile(Context context) {
        super(context);
    }

    public void setPathTemplate(String str) {
        this.pathTemplate = str;
        AIRMapLocalTileProvider aIRMapLocalTileProvider = this.tileProvider;
        if (aIRMapLocalTileProvider != null) {
            aIRMapLocalTileProvider.setPathTemplate(str);
        }
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setZIndex(float f) {
        this.zIndex = f;
        TileOverlay tileOverlay = this.tileOverlay;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f);
        }
    }

    public void setTileSize(float f) {
        this.tileSize = f;
        AIRMapLocalTileProvider aIRMapLocalTileProvider = this.tileProvider;
        if (aIRMapLocalTileProvider != null) {
            aIRMapLocalTileProvider.setTileSize((int) f);
        }
    }

    public void setUseAssets(boolean z) {
        this.useAssets = z;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.tileOverlayOptions == null) {
            this.tileOverlayOptions = createTileOverlayOptions();
        }
        return this.tileOverlayOptions;
    }

    private TileOverlayOptions createTileOverlayOptions() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.zIndex);
        AIRMapLocalTileProvider aIRMapLocalTileProvider = new AIRMapLocalTileProvider((int) this.tileSize, this.pathTemplate, this.useAssets);
        this.tileProvider = aIRMapLocalTileProvider;
        tileOverlayOptions.tileProvider(aIRMapLocalTileProvider);
        return tileOverlayOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.tileOverlay;
    }

    @Override // com.rnmaps.maps.MapFeature
    public void addToMap(Object obj) {
        this.tileOverlay = ((GoogleMap) obj).addTileOverlay(getTileOverlayOptions());
    }

    @Override // com.rnmaps.maps.MapFeature
    public void removeFromMap(Object obj) {
        this.tileOverlay.remove();
    }
}
