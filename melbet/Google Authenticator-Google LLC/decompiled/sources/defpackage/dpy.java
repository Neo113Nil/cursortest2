package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dpy implements dtx {
    final /* synthetic */ dpz a;
    public final dze b;
    private final Object c;

    public dpy(dpz dpzVar, Object obj, dze dzeVar) {
        this.a = dpzVar;
        this.c = obj;
        this.b = dzeVar;
    }

    @Override // defpackage.dtx
    public final void a(jfq jfqVar) {
        int i;
        jfqVar.getClass();
        jho jhoVar = jfqVar.e;
        if (jhoVar != null) {
            i = jhoVar.a();
        } else {
            dox b = this.a.a.b(this.c);
            i = (b == null || !b.a) ? 0 : 2;
        }
        this.b.d(((bse) this.a.b.a).c(i));
    }
}
