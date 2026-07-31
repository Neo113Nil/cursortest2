package i1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class h extends u0.g {

    /* renamed from: n, reason: collision with root package name */
    private long f16928n;

    /* renamed from: o, reason: collision with root package name */
    private int f16929o;

    /* renamed from: p, reason: collision with root package name */
    private int f16930p;

    public h() {
        super(2);
        this.f16930p = 32;
    }

    private boolean x(u0.g gVar) {
        ByteBuffer byteBuffer;
        if (!B()) {
            return true;
        }
        if (this.f16929o >= this.f16930p || gVar.l() != l()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f22411h;
        return byteBuffer2 == null || (byteBuffer = this.f22411h) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public int A() {
        return this.f16929o;
    }

    public boolean B() {
        return this.f16929o > 0;
    }

    public void C(int i7) {
        o2.a.a(i7 > 0);
        this.f16930p = i7;
    }

    @Override // u0.g, u0.a
    public void h() {
        super.h();
        this.f16929o = 0;
    }

    public boolean w(u0.g gVar) {
        o2.a.a(!gVar.t());
        o2.a.a(!gVar.k());
        o2.a.a(!gVar.m());
        if (!x(gVar)) {
            return false;
        }
        int i7 = this.f16929o;
        this.f16929o = i7 + 1;
        if (i7 == 0) {
            this.f22413j = gVar.f22413j;
            if (gVar.o()) {
                p(1);
            }
        }
        if (gVar.l()) {
            p(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f22411h;
        if (byteBuffer != null) {
            r(byteBuffer.remaining());
            this.f22411h.put(byteBuffer);
        }
        this.f16928n = gVar.f22413j;
        return true;
    }

    public long y() {
        return this.f22413j;
    }

    public long z() {
        return this.f16928n;
    }
}
