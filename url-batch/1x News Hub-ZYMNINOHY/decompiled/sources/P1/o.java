package P1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final f f1268a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1269b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1270c;

    /* renamed from: d, reason: collision with root package name */
    public final K0.j f1271d;

    public o(f fVar, String str) {
        this(fVar, str, u.f1272b, null);
    }

    public final void a(String str, Object obj, O1.j jVar) {
        this.f1268a.q(this.f1269b, this.f1270c.a(new l(obj, str)), jVar == null ? null : new a(this, 1, jVar));
    }

    public final void b(m mVar) {
        String str = this.f1269b;
        f fVar = this.f1268a;
        K0.j jVar = this.f1271d;
        if (jVar != null) {
            fVar.d(str, mVar != null ? new V0.e(this, mVar, 25, false) : null, jVar);
        } else {
            fVar.b(str, mVar != null ? new V0.e(this, mVar, 25, false) : null);
        }
    }

    public o(f fVar, String str, p pVar, K0.j jVar) {
        this.f1268a = fVar;
        this.f1269b = str;
        this.f1270c = pVar;
        this.f1271d = jVar;
    }
}
