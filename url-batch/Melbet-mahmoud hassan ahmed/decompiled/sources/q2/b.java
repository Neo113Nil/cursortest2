package q2;

import java.nio.ByteBuffer;
import o2.a0;
import o2.m0;
import r0.f3;
import r0.s1;
import u0.g;

/* loaded from: classes.dex */
public final class b extends r0.f {

    /* renamed from: s, reason: collision with root package name */
    private final g f20203s;

    /* renamed from: t, reason: collision with root package name */
    private final a0 f20204t;

    /* renamed from: u, reason: collision with root package name */
    private long f20205u;

    /* renamed from: v, reason: collision with root package name */
    private a f20206v;

    /* renamed from: w, reason: collision with root package name */
    private long f20207w;

    public b() {
        super(6);
        this.f20203s = new g(1);
        this.f20204t = new a0();
    }

    private float[] U(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f20204t.M(byteBuffer.array(), byteBuffer.limit());
        this.f20204t.O(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i7 = 0; i7 < 3; i7++) {
            fArr[i7] = Float.intBitsToFloat(this.f20204t.p());
        }
        return fArr;
    }

    private void V() {
        a aVar = this.f20206v;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // r0.f
    protected void K() {
        V();
    }

    @Override // r0.f
    protected void M(long j7, boolean z6) {
        this.f20207w = Long.MIN_VALUE;
        V();
    }

    @Override // r0.f
    protected void Q(s1[] s1VarArr, long j7, long j8) {
        this.f20205u = j8;
    }

    @Override // r0.g3
    public int b(s1 s1Var) {
        return f3.a("application/x-camera-motion".equals(s1Var.f20956q) ? 4 : 0);
    }

    @Override // r0.e3
    public boolean c() {
        return k();
    }

    @Override // r0.e3, r0.g3
    public String h() {
        return "CameraMotionRenderer";
    }

    @Override // r0.e3
    public boolean i() {
        return true;
    }

    @Override // r0.e3
    public void o(long j7, long j8) {
        while (!k() && this.f20207w < 100000 + j7) {
            this.f20203s.h();
            if (R(F(), this.f20203s, 0) != -4 || this.f20203s.m()) {
                return;
            }
            g gVar = this.f20203s;
            this.f20207w = gVar.f22413j;
            if (this.f20206v != null && !gVar.l()) {
                this.f20203s.s();
                float[] U = U((ByteBuffer) m0.j(this.f20203s.f22411h));
                if (U != null) {
                    ((a) m0.j(this.f20206v)).b(this.f20207w - this.f20205u, U);
                }
            }
        }
    }

    @Override // r0.f, r0.z2.b
    public void p(int i7, Object obj) {
        if (i7 == 8) {
            this.f20206v = (a) obj;
        } else {
            super.p(i7, obj);
        }
    }
}
