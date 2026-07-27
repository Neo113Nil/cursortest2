package l;

/* loaded from: classes.dex */
public final class B0 implements y0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f7555d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7556e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7557i;

    public B0() {
        this.f7557i = new B0[256];
        this.f7555d = 0;
        this.f7556e = 0;
    }

    @Override // l.x0
    public AbstractC0792s f(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return ((Y0.b) this.f7557i).f(j4, abstractC0792s, abstractC0792s2, abstractC0792s3);
    }

    @Override // l.x0
    public AbstractC0792s g(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return ((Y0.b) this.f7557i).g(j4, abstractC0792s, abstractC0792s2, abstractC0792s3);
    }

    @Override // l.y0
    public int i() {
        return this.f7555d;
    }

    @Override // l.y0
    public int q() {
        return this.f7556e;
    }

    public B0(int i2, int i4) {
        this.f7557i = null;
        this.f7555d = i2;
        int i5 = i4 & 7;
        this.f7556e = i5 == 0 ? 8 : i5;
    }

    public B0(int i2, int i4, InterfaceC0797x interfaceC0797x) {
        this.f7555d = i2;
        this.f7556e = i4;
        this.f7557i = new Y0.b(new C0758C(i2, i4, interfaceC0797x));
    }
}
