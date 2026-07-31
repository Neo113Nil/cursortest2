package m6;

/* loaded from: classes.dex */
final class l1 extends i {

    /* renamed from: f, reason: collision with root package name */
    private final f6.l<Throwable, v5.q> f19305f;

    /* JADX WARN: Multi-variable type inference failed */
    public l1(f6.l<? super Throwable, v5.q> lVar) {
        this.f19305f = lVar;
    }

    @Override // m6.j
    public void a(Throwable th) {
        this.f19305f.invoke(th);
    }

    @Override // f6.l
    public /* bridge */ /* synthetic */ v5.q invoke(Throwable th) {
        a(th);
        return v5.q.f22838a;
    }

    public String toString() {
        return "InvokeOnCancel[" + q0.a(this.f19305f) + '@' + q0.b(this) + ']';
    }
}
