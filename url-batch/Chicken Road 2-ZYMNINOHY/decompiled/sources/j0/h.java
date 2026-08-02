package j0;

import a.AbstractC0124a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h extends Z.f {

    /* renamed from: j, reason: collision with root package name */
    public long f13759j;

    /* renamed from: k, reason: collision with root package name */
    public int f13760k;

    /* renamed from: l, reason: collision with root package name */
    public int f13761l;

    @Override // Z.f
    public final void h() {
        super.h();
        this.f13760k = 0;
    }

    public final boolean l(Z.f fVar) {
        ByteBuffer byteBuffer;
        AbstractC0124a.h(!fVar.g(1073741824));
        AbstractC0124a.h(!fVar.g(268435456));
        AbstractC0124a.h(!fVar.g(4));
        if (m()) {
            if (this.f13760k >= this.f13761l) {
                return false;
            }
            ByteBuffer byteBuffer2 = fVar.f3781e;
            if (byteBuffer2 != null && (byteBuffer = this.f3781e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i4 = this.f13760k;
        this.f13760k = i4 + 1;
        if (i4 == 0) {
            this.f3783g = fVar.f3783g;
            if (fVar.g(1)) {
                this.f3496b = 1;
            }
        }
        ByteBuffer byteBuffer3 = fVar.f3781e;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f3781e.put(byteBuffer3);
        }
        this.f13759j = fVar.f3783g;
        return true;
    }

    public final boolean m() {
        return this.f13760k > 0;
    }
}
