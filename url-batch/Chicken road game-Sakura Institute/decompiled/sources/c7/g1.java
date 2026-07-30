package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g1 extends m1 {

    /* renamed from: i, reason: collision with root package name */
    public final h6.d f1697i;

    public g1(h6.i iVar, q6.e eVar) {
        super(iVar, false);
        this.f1697i = a8.m.q(this, this, eVar);
    }

    @Override // c7.f1
    public final void W() {
        try {
            h7.a.h(a8.m.A(this.f1697i), d6.z.f2639a);
        } catch (Throwable th) {
            resumeWith(d6.a.b(th));
            throw th;
        }
    }
}
