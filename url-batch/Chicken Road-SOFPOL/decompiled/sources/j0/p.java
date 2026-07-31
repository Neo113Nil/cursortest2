package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p implements d7.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0.p f3845e;

    public /* synthetic */ p(w0.p pVar, int i) {
        this.f3844d = i;
        this.f3845e = pVar;
    }

    @Override // d7.g
    public final Object a(Object obj, g6.c cVar) {
        switch (this.f3844d) {
            case 0:
                v.h hVar = (v.h) obj;
                boolean z3 = hVar instanceof v.f;
                w0.p pVar = this.f3845e;
                if (z3) {
                    pVar.add(hVar);
                } else if (hVar instanceof v.g) {
                    pVar.remove(((v.g) hVar).f7418a);
                } else if (hVar instanceof v.d) {
                    pVar.add(hVar);
                } else if (hVar instanceof v.e) {
                    pVar.remove(((v.e) hVar).f7417a);
                } else if (hVar instanceof v.l) {
                    pVar.add(hVar);
                } else if (hVar instanceof v.m) {
                    pVar.remove(((v.m) hVar).f7422a);
                } else if (hVar instanceof v.k) {
                    pVar.remove(((v.k) hVar).f7420a);
                }
                break;
            default:
                v.h hVar2 = (v.h) obj;
                boolean z7 = hVar2 instanceof v.f;
                w0.p pVar2 = this.f3845e;
                if (z7) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof v.g) {
                    pVar2.remove(((v.g) hVar2).f7418a);
                } else if (hVar2 instanceof v.d) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof v.e) {
                    pVar2.remove(((v.e) hVar2).f7417a);
                } else if (hVar2 instanceof v.l) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof v.m) {
                    pVar2.remove(((v.m) hVar2).f7422a);
                } else if (hVar2 instanceof v.k) {
                    pVar2.remove(((v.k) hVar2).f7420a);
                } else if (hVar2 instanceof v.b) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof v.c) {
                    pVar2.remove(((v.c) hVar2).f7416a);
                } else if (hVar2 instanceof v.a) {
                    pVar2.remove(((v.a) hVar2).f7415a);
                }
                break;
        }
        return c6.m.f1757a;
    }
}
