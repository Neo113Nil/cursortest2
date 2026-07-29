package com.facebook.ads.internal.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.facebook.ads.internal.p.a.p;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5072a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static c f5073b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5074c;

    private c(Context context) {
        this.f5074c = context;
    }

    private Bitmap a(String str) {
        byte[] d2 = com.facebook.ads.internal.q.c.d.a(this.f5074c).a(str, (p) null).d();
        return BitmapFactory.decodeByteArray(d2, 0, d2.length);
    }

    public static c a(Context context) {
        if (f5073b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (c.class) {
                if (f5073b == null) {
                    f5073b = new c(applicationContext);
                }
            }
        }
        return f5073b;
    }

    private static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.ByteArrayOutputStream, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v9 */
    private void a(String str, Bitmap bitmap) {
        Object obj;
        Closeable closeable;
        Object obj2;
        Closeable closeable2;
        ?? byteArrayOutputStream;
        File file = new File(this.f5074c.getCacheDir(), str.hashCode() + ".png");
        Closeable closeable3 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                } catch (FileNotFoundException e) {
                    e = e;
                    bitmap = 0;
                } catch (IOException e2) {
                    e = e2;
                    closeable = null;
                    closeable3 = byteArrayOutputStream;
                } catch (OutOfMemoryError e3) {
                    e = e3;
                    bitmap = 0;
                } catch (Throwable th) {
                    th = th;
                    bitmap = 0;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            obj2 = null;
        } catch (IOException e5) {
            e = e5;
            closeable = null;
        } catch (OutOfMemoryError e6) {
            e = e6;
            obj = null;
        } catch (Throwable th3) {
            th = th3;
            bitmap = 0;
        }
        if (byteArrayOutputStream.size() >= 3145728) {
            Log.d(f5072a, "Bitmap size exceeds max size for storage");
            a((Closeable) byteArrayOutputStream);
            a((Closeable) null);
            return;
        }
        bitmap = new FileOutputStream(file);
        try {
            byteArrayOutputStream.writeTo(bitmap);
            bitmap.flush();
            a((Closeable) byteArrayOutputStream);
            closeable2 = bitmap;
        } catch (FileNotFoundException e7) {
            e = e7;
            closeable3 = byteArrayOutputStream;
            obj2 = bitmap;
            Log.e(f5072a, "Bad output destination (file=" + file.getAbsolutePath() + ").", e);
            bitmap = obj2;
            a(closeable3);
            closeable2 = bitmap;
            a(closeable2);
        } catch (IOException e8) {
            closeable3 = byteArrayOutputStream;
            closeable = bitmap;
            e = e8;
            try {
                Log.e(f5072a, "Unable to write bitmap to file (url=" + str + ").", e);
                a(closeable3);
                a(closeable);
                return;
            } catch (Throwable th4) {
                th = th4;
                bitmap = closeable;
                a(closeable3);
                a((Closeable) bitmap);
                throw th;
            }
        } catch (OutOfMemoryError e9) {
            e = e9;
            closeable3 = byteArrayOutputStream;
            obj = bitmap;
            Log.e(f5072a, "Unable to write bitmap to output stream", e);
            bitmap = obj;
            a(closeable3);
            closeable2 = bitmap;
            a(closeable2);
        } catch (Throwable th5) {
            th = th5;
            closeable3 = byteArrayOutputStream;
            a(closeable3);
            a((Closeable) bitmap);
            throw th;
        }
        a(closeable2);
    }

    private boolean a(int i, int i2) {
        return i > 0 && i2 > 0 && com.facebook.ads.internal.l.a.d(this.f5074c);
    }

    private Bitmap b(String str, int i, int i2) {
        try {
            Bitmap a2 = a(i, i2) ? com.facebook.ads.internal.q.b.c.a(str.substring("file://".length()), i, i2) : BitmapFactory.decodeStream(new FileInputStream(str.substring("file://".length())), null, null);
            a(str, a2);
            return a2;
        } catch (IOException e) {
            Log.e(f5072a, "Failed to copy local image into cache (url=" + str + ").", e);
            return null;
        }
    }

    private Bitmap c(String str, int i, int i2) {
        Bitmap d2;
        InputStream inputStream;
        if (str.startsWith("asset:///")) {
            InputStream inputStream2 = null;
            try {
                inputStream = this.f5074c.getAssets().open(str.substring(9, str.length()));
                try {
                    d2 = a(i, i2) ? com.facebook.ads.internal.q.b.c.a(inputStream, i, i2) : BitmapFactory.decodeStream(inputStream);
                    if (inputStream != null) {
                        a(inputStream);
                    }
                } catch (IOException unused) {
                    if (inputStream != null) {
                        a(inputStream);
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        a(inputStream2);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (a(i, i2)) {
                try {
                    d2 = d(str, i, i2);
                } catch (IOException unused3) {
                }
            }
            d2 = a(str);
        }
        a(str, d2);
        return d2;
    }

    private Bitmap d(String str, int i, int i2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        Bitmap a2 = com.facebook.ads.internal.q.b.c.a(inputStream, i, i2);
        a(inputStream);
        return a2;
    }

    public Bitmap a(String str, int i, int i2) {
        File file = new File(this.f5074c.getCacheDir(), str.hashCode() + ".png");
        return !file.exists() ? str.startsWith("file://") ? b(str, i, i2) : c(str, i, i2) : a(i, i2) ? com.facebook.ads.internal.q.b.c.a(file.getAbsolutePath(), i, i2) : BitmapFactory.decodeFile(file.getAbsolutePath());
    }
}
