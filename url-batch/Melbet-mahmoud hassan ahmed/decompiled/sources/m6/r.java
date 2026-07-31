package m6;

/* loaded from: classes.dex */
public final class r extends q1 implements q {

    /* renamed from: j, reason: collision with root package name */
    public final s f19325j;

    public r(s sVar) {
        this.f19325j = sVar;
    }

    @Override // m6.q
    public boolean g(Throwable th) {
        return z().A(th);
    }

    @Override // m6.q
    public o1 getParent() {
        return z();
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ v5.q invoke(Throwable th) {
        y(th);
        return v5.q.f22838a;
    }

    @Override // m6.a0
    public void y(Throwable th) {
        this.f19325j.O(z());
    }
}
