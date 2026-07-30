package l5;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends a8.d {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t5.s f6062j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.room.c f6063k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l3.g f6064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6065m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l.v f6066n;

    public p(l.v vVar, t5.s sVar, androidx.room.c cVar, l3.g gVar, ArrayList arrayList) {
        this.f6066n = vVar;
        this.f6062j = sVar;
        this.f6063k = cVar;
        this.f6064l = gVar;
        this.f6065m = arrayList;
    }

    @Override // a8.d
    public final void f0(Object obj, Object obj2) {
        t5.c cVar = (t5.c) obj;
        o5.e eVar = (o5.e) obj2;
        t5.s sVar = this.f6062j;
        t5.s d8 = sVar != null ? sVar.d(cVar) : null;
        androidx.room.c cVar2 = this.f6063k;
        androidx.room.c cVar3 = new androidx.room.c(((f) cVar2.f1069g).m(cVar), 23, (x) cVar2.f1070h);
        l3.g a3 = this.f6064l.a(cVar);
        if (a3 != null) {
            this.f6065m.addAll(this.f6066n.j(a3, eVar, d8, cVar3));
        }
    }
}
