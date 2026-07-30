package p1;

import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f7093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f7094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f7095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q6.c f7096f;

    public v(int i7, int i8, Map map, w wVar, b0 b0Var, q6.c cVar) {
        this.f7091a = i7;
        this.f7092b = i8;
        this.f7093c = map;
        this.f7094d = wVar;
        this.f7095e = b0Var;
        this.f7096f = cVar;
    }

    @Override // p1.g0
    public final int f() {
        return this.f7092b;
    }

    @Override // p1.g0
    public final int n() {
        return this.f7091a;
    }

    @Override // p1.g0
    public final Map o() {
        return this.f7093c;
    }

    @Override // p1.g0
    public final void p() {
        r1.s sVar;
        r1.d0 d0Var = this.f7095e.f7018f;
        boolean v5 = this.f7094d.v();
        q6.c cVar = this.f7096f;
        if (!v5 || (sVar = ((r1.t) d0Var.A.f3892c).P) == null) {
            cVar.f(((r1.t) d0Var.A.f3892c).f7866n);
        } else {
            cVar.f(sVar.f7866n);
        }
    }

    @Override // p1.g0
    public final q6.c q() {
        return null;
    }
}
