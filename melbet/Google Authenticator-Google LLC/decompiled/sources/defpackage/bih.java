package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bih implements bij {
    private final ByteBuffer a;
    private final List b;
    private final boolean c;
    private final bek d;

    public bih(ByteBuffer byteBuffer, List list, bek bekVar, boolean z) {
        this.a = byteBuffer;
        this.b = list;
        this.d = bekVar;
        this.c = z;
    }

    @Override // defpackage.bij
    public final int a() {
        ByteBuffer b = blv.b(this.a);
        if (b == null) {
            return -1;
        }
        return afn.l(this.b, new bbc(b, this.d, 1));
    }

    @Override // defpackage.bij
    public final Bitmap b(BitmapFactory.Options options) {
        boolean z = this.c;
        ByteBuffer byteBuffer = this.a;
        if (!z) {
            return ajz.k(new blt(blv.b(byteBuffer)), options, this);
        }
        blv.b(byteBuffer);
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly()) {
            return ajz.j(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), options, this);
        }
        byte[] d = blv.d(byteBuffer);
        return ajz.j(d, 0, d.length, options, this);
    }

    @Override // defpackage.bij
    public final ImageHeaderParser$ImageType c() {
        return afn.m(this.b, blv.b(this.a));
    }

    @Override // defpackage.bij
    public final boolean e() {
        ByteBuffer b = blv.b(this.a);
        if (b == null) {
            return false;
        }
        return afn.o(this.b, new bbd(b, this.d, 1));
    }

    @Override // defpackage.bij
    public final void d() {
    }
}
