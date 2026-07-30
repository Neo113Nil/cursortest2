package l5;

import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends t5.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ androidx.room.c f6049j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ HashMap f6050k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l1.x f6051l;

    public l(androidx.room.c cVar, HashMap hashMap, l1.x xVar) {
        this.f6049j = cVar;
        this.f6050k = hashMap;
        this.f6051l = xVar;
    }

    @Override // t5.e
    public final void h0(t5.c cVar, t5.s sVar) {
        t5.s M = t6.a.M(sVar, this.f6049j.u(cVar), this.f6050k);
        if (M != sVar) {
            f fVar = new f(cVar.f8889f);
            l1.x xVar = this.f6051l;
            xVar.f5847g = ((t5.s) xVar.f5847g).u(fVar, M);
        }
    }
}
