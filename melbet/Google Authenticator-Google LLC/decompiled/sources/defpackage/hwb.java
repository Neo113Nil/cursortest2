package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hwb extends hvg {
    final /* synthetic */ hwd a;
    private final htq b;

    public hwb(hwd hwdVar, htq htqVar) {
        this.a = hwdVar;
        htqVar.getClass();
        this.b = htqVar;
    }

    @Override // defpackage.hvg
    public final /* bridge */ /* synthetic */ Object a() {
        hvi a = this.b.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.hvg
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.hvg
    public final void d(Throwable th) {
        this.a.p(th);
    }

    @Override // defpackage.hvg
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.q((hvi) obj);
    }

    @Override // defpackage.hvg
    public final boolean g() {
        return this.a.isDone();
    }
}
