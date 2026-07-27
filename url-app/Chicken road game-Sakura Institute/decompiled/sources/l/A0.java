package l;

/* loaded from: classes.dex */
public final class A0 implements y0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f7552d;

    public A0(int i2) {
        this.f7552d = i2;
    }

    @Override // l.x0
    public final AbstractC0792s f(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return j4 < ((long) this.f7552d) * 1000000 ? abstractC0792s : abstractC0792s2;
    }

    @Override // l.x0
    public final AbstractC0792s g(long j4, AbstractC0792s abstractC0792s, AbstractC0792s abstractC0792s2, AbstractC0792s abstractC0792s3) {
        return abstractC0792s3;
    }

    @Override // l.y0
    public final int i() {
        return 0;
    }

    @Override // l.y0
    public final int q() {
        return this.f7552d;
    }
}
