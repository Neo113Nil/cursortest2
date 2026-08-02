package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhc implements bbo {
    public static final bbk a = new bbk("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, bbk.a);
    public static final bbk b = new bbk("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, bbk.a);
    private final bek c;

    public bhc(bek bekVar) {
        this.c = bekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.bax
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, bbl bblVar) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) ((bdv) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) bblVar.b(b);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        double d = bmd.a;
        SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) bblVar.b(a)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused2) {
        }
        try {
            outputStream = new bbs(fileOutputStream, this.c);
            bitmap.compress(compressFormat, intValue, outputStream);
            outputStream.close();
            outputStream.close();
            return true;
        } catch (IOException unused3) {
            outputStream = fileOutputStream;
            this = 0;
            this = 0;
            if (outputStream != null) {
                outputStream.close();
            }
            return this;
        } catch (Throwable th2) {
            th = th2;
            outputStream = fileOutputStream;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.bbo
    public final int b() {
        return 2;
    }
}
