package b;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 implements c {

    /* renamed from: f, reason: collision with root package name */
    public final y f1157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f1158g;

    public g0(i0 i0Var, y yVar) {
        r6.k.f(yVar, "onBackPressedCallback");
        this.f1158g = i0Var;
        this.f1157f = yVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [q6.a, r6.h] */
    @Override // b.c
    public final void cancel() {
        i0 i0Var = this.f1158g;
        e6.j jVar = i0Var.f1162b;
        y yVar = this.f1157f;
        jVar.remove(yVar);
        if (r6.k.a(i0Var.f1163c, yVar)) {
            yVar.a();
            i0Var.f1163c = null;
        }
        yVar.f1221b.remove(this);
        ?? r02 = yVar.f1222c;
        if (r02 != 0) {
            r02.a();
        }
        yVar.f1222c = null;
    }
}
