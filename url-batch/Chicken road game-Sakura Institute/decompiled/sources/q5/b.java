package q5;

import l5.w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final l5.f f7516a;

    /* renamed from: b, reason: collision with root package name */
    public final w f7517b;

    /* renamed from: c, reason: collision with root package name */
    public final g5.a f7518c;

    public b(w wVar, g5.a aVar, l5.f fVar) {
        this.f7517b = wVar;
        this.f7516a = fVar;
        this.f7518c = aVar;
    }

    @Override // q5.e
    public final void a() {
        this.f7517b.f6089e.m(this.f7518c);
    }

    @Override // q5.e
    public final String toString() {
        return this.f7516a + ":CANCEL";
    }
}
