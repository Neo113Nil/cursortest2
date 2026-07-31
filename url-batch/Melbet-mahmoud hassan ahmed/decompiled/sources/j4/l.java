package j4;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f18168f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ m f18169g;

    l(m mVar, h hVar) {
        this.f18169g = mVar;
        this.f18168f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        a aVar;
        b0 b0Var4;
        b0 b0Var5;
        if (this.f18168f.k()) {
            b0Var5 = this.f18169g.f18172c;
            b0Var5.r();
            return;
        }
        try {
            aVar = this.f18169g.f18171b;
            Object a7 = aVar.a(this.f18168f);
            b0Var4 = this.f18169g.f18172c;
            b0Var4.n(a7);
        } catch (g e7) {
            if (e7.getCause() instanceof Exception) {
                b0Var3 = this.f18169g.f18172c;
                b0Var3.p((Exception) e7.getCause());
            } else {
                b0Var2 = this.f18169g.f18172c;
                b0Var2.p(e7);
            }
        } catch (Exception e8) {
            b0Var = this.f18169g.f18172c;
            b0Var.p(e8);
        }
    }
}
