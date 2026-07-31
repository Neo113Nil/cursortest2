package o2;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class u {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, p2.c cVar) {
        if (cVar != null) {
            d(mediaFormat, "color-transfer", cVar.f19982h);
            d(mediaFormat, "color-standard", cVar.f19980f);
            d(mediaFormat, "color-range", cVar.f19981g);
            a(mediaFormat, "hdr-static-info", cVar.f19983i);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f7) {
        if (f7 != -1.0f) {
            mediaFormat.setFloat(str, f7);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer("csd-" + i7, ByteBuffer.wrap(list.get(i7)));
        }
    }
}
