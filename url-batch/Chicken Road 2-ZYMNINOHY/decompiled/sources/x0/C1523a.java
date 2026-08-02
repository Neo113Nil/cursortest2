package x0;

import T.C0097o;
import W.J;
import W.u;
import Z.f;
import a0.AbstractC0135a;
import a0.C0126B;
import java.nio.ByteBuffer;
import l2.e;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1523a extends AbstractC0135a {

    /* renamed from: s, reason: collision with root package name */
    public final f f15977s;

    /* renamed from: t, reason: collision with root package name */
    public final u f15978t;

    /* renamed from: u, reason: collision with root package name */
    public C0126B f15979u;
    public long v;

    public C1523a() {
        super(6);
        this.f15977s = new f(1);
        this.f15978t = new u();
    }

    @Override // a0.AbstractC0135a
    public final int D(C0097o c0097o) {
        return "application/x-camera-motion".equals(c0097o.n) ? AbstractC0135a.f(4, 0, 0, 0) : AbstractC0135a.f(0, 0, 0, 0);
    }

    @Override // a0.AbstractC0135a, a0.i0
    public final void c(int i4, Object obj) {
        if (i4 == 8) {
            this.f15979u = (C0126B) obj;
        }
    }

    @Override // a0.AbstractC0135a
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // a0.AbstractC0135a
    public final boolean m() {
        return l();
    }

    @Override // a0.AbstractC0135a
    public final boolean o() {
        return true;
    }

    @Override // a0.AbstractC0135a
    public final void p() {
        C0126B c0126b = this.f15979u;
        if (c0126b != null) {
            c0126b.d();
        }
    }

    @Override // a0.AbstractC0135a
    public final void r(long j4, boolean z, boolean z4) {
        this.v = Long.MIN_VALUE;
        C0126B c0126b = this.f15979u;
        if (c0126b != null) {
            c0126b.d();
        }
    }

    @Override // a0.AbstractC0135a
    public final void z(long j4, long j5) {
        float[] fArr;
        while (!l() && this.v < 100000 + j4) {
            f fVar = this.f15977s;
            fVar.h();
            e eVar = this.f4039c;
            eVar.k();
            if (y(eVar, fVar, 0) != -4 || fVar.g(4)) {
                return;
            }
            long j6 = fVar.f3783g;
            this.v = j6;
            boolean z = j6 < this.f4048l;
            if (this.f15979u != null && !z) {
                fVar.k();
                ByteBuffer byteBuffer = fVar.f3781e;
                String str = J.f3263a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    u uVar = this.f15978t;
                    uVar.K(limit, array);
                    uVar.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i4 = 0; i4 < 3; i4++) {
                        fArr2[i4] = Float.intBitsToFloat(uVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f15979u.b();
                }
            }
        }
    }
}
