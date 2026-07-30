package androidx.lifecycle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public o f1040a;

    /* renamed from: b, reason: collision with root package name */
    public t f1041b;

    public final void a(v vVar, n nVar) {
        o a3 = nVar.a();
        o oVar = this.f1040a;
        r6.k.f(oVar, "state1");
        if (a3.compareTo(oVar) < 0) {
            oVar = a3;
        }
        this.f1040a = oVar;
        this.f1041b.c(vVar, nVar);
        this.f1040a = a3;
    }
}
