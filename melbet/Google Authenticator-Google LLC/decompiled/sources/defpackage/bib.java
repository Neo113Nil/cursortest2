package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bib implements baz {
    @Override // defpackage.baz
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.baz
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.baz
    public final int c(InputStream inputStream, bek bekVar) {
        adj adjVar = new adj(inputStream);
        adh a = adjVar.a("Orientation");
        int i = 1;
        if (a != null) {
            try {
                i = a.a(adjVar.j);
            } catch (NumberFormatException unused) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.baz
    public final int d(ByteBuffer byteBuffer, bek bekVar) {
        int i = blv.a;
        return c(new blt(byteBuffer), bekVar);
    }

    @Override // defpackage.baz
    public final boolean e(InputStream inputStream, bek bekVar) {
        return false;
    }

    @Override // defpackage.baz
    public final boolean f(ByteBuffer byteBuffer, bek bekVar) {
        return false;
    }
}
