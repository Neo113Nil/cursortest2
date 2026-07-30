package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends a8.d {

    /* renamed from: j, reason: collision with root package name */
    public boolean f8890j = false;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f8891k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f8892l;

    public d(f fVar, e eVar) {
        this.f8892l = fVar;
        this.f8891k = eVar;
    }

    @Override // a8.d
    public final void f0(Object obj, Object obj2) {
        c cVar = (c) obj;
        s sVar = (s) obj2;
        boolean z8 = this.f8890j;
        e eVar = this.f8891k;
        if (!z8) {
            c cVar2 = c.f8888i;
            if (cVar.compareTo(cVar2) > 0) {
                this.f8890j = true;
                eVar.h0(cVar2, this.f8892l.c());
            }
        }
        eVar.h0(cVar, sVar);
    }
}
