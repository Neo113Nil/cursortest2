package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nr extends ahe {
    public boolean a;
    private final ns g;

    public nr(ns nsVar, ahg ahgVar) {
        super(ahgVar, nsVar.c);
        this.g = nsVar;
        this.a = true;
    }

    @Override // defpackage.ahe
    protected final void a() {
        this.g.a();
    }

    @Override // defpackage.ahe
    protected final void b() {
        this.g.b();
    }

    @Override // defpackage.ahe
    protected final void c(ahd ahdVar) {
        this.g.c(new mx(ahdVar.c, ahdVar.d, ahdVar.b, ahdVar.a, ahdVar.e));
    }

    public final void d(boolean z) {
        this.a = z;
        boolean z2 = false;
        if (z && this.g.c) {
            z2 = true;
        }
        g(z2);
    }

    @Override // defpackage.ahe
    public final void e() {
        this.g.d();
    }
}
