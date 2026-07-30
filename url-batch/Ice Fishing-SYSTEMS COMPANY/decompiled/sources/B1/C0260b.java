package B1;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.C3112dq;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: B1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260b implements s1.k {

    /* renamed from: u, reason: collision with root package name */
    public static final s1.g f85u = s1.g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: v, reason: collision with root package name */
    public static final s1.g f86v = new s1.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, s1.g.f40421e);

    /* renamed from: n, reason: collision with root package name */
    public final C3112dq f87n;

    public C0260b(C3112dq c3112dq) {
        this.f87n = c3112dq;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // s1.InterfaceC4989b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj, File file, s1.h hVar) {
        boolean z8;
        Bitmap bitmap = (Bitmap) ((u1.x) obj).get();
        s1.g gVar = f86v;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(gVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = N1.j.f1965b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) hVar.c(f85u)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                C3112dq c3112dq = this.f87n;
                if (c3112dq != null) {
                    try {
                        outputStream = new com.bumptech.glide.load.data.b(fileOutputStream, c3112dq);
                    } catch (IOException e6) {
                        e = e6;
                        outputStream = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        z8 = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z8;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    outputStream = fileOutputStream;
                }
                bitmap.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                }
                z8 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + N1.p.c(bitmap) + " in " + N1.j.a(elapsedRealtimeNanos) + ", options format: " + hVar.c(gVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z8;
    }

    @Override // s1.k
    public final int q(s1.h hVar) {
        return 2;
    }
}
