package je;

import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5196e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5197i;

    public /* synthetic */ l(int i3, Object obj, Object obj2) {
        this.f5195d = i3;
        this.f5196e = obj;
        this.f5197i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [nd.c] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // je.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f fVar, ld.a aVar) {
        k kVar;
        md.a aVar2;
        ?? r22;
        ke.q qVar;
        int i3;
        e eVar;
        o oVar;
        int i10;
        i0.g gVar;
        switch (this.f5195d) {
            case 0:
                try {
                    if (aVar instanceof k) {
                        kVar = (k) aVar;
                        int i11 = kVar.f5182e;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            kVar.f5182e = i11 - Integer.MIN_VALUE;
                            Object obj = kVar.f5181d;
                            aVar2 = md.a.f6622d;
                            r22 = kVar.f5182e;
                            if (r22 != 0) {
                                cf.c.M(obj);
                                qVar = new ke.q(fVar, kVar.getContext());
                                x3.l lVar = (x3.l) this.f5196e;
                                kVar.f5184r = fVar;
                                kVar.f5185s = qVar;
                                i3 = 0;
                                kVar.f5186t = 0;
                                kVar.f5182e = 1;
                                if (lVar.invoke(qVar, kVar) == aVar2) {
                                    return aVar2;
                                }
                            } else {
                                if (r22 != 1) {
                                    if (r22 == 2) {
                                        cf.c.M(obj);
                                        return Unit.f5554a;
                                    }
                                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                int i12 = kVar.f5186t;
                                qVar = kVar.f5185s;
                                f fVar2 = kVar.f5184r;
                                cf.c.M(obj);
                                i3 = i12;
                                fVar = fVar2;
                            }
                            qVar.releaseIntercepted();
                            eVar = (e) this.f5197i;
                            r22 = 0;
                            kVar.f5184r = null;
                            kVar.f5185s = null;
                            kVar.f5186t = i3;
                            kVar.f5182e = 2;
                            if (eVar.c(fVar, kVar) == aVar2) {
                                return aVar2;
                            }
                            return Unit.f5554a;
                        }
                    }
                    if (r22 != 0) {
                    }
                    qVar.releaseIntercepted();
                    eVar = (e) this.f5197i;
                    r22 = 0;
                    kVar.f5184r = null;
                    kVar.f5185s = null;
                    kVar.f5186t = i3;
                    kVar.f5182e = 2;
                    if (eVar.c(fVar, kVar) == aVar2) {
                    }
                    return Unit.f5554a;
                } catch (Throwable th) {
                    r22.releaseIntercepted();
                    throw th;
                }
                kVar = new k(this, aVar);
                Object obj2 = kVar.f5181d;
                aVar2 = md.a.f6622d;
                r22 = kVar.f5182e;
            default:
                if (aVar instanceof o) {
                    oVar = (o) aVar;
                    int i13 = oVar.f5211e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        oVar.f5211e = i13 - Integer.MIN_VALUE;
                        Object obj3 = oVar.f5210d;
                        md.a aVar3 = md.a.f6622d;
                        i10 = oVar.f5211e;
                        if (i10 != 0) {
                            cf.c.M(obj3);
                            l lVar2 = (l) this.f5196e;
                            i0.g gVar2 = new i0.g(2, (h0) this.f5197i, fVar);
                            try {
                                oVar.f5213r = gVar2;
                                oVar.f5211e = 1;
                                if (lVar2.c(gVar2, oVar) == aVar3) {
                                    return aVar3;
                                }
                            } catch (ke.a e2) {
                                e = e2;
                                gVar = gVar2;
                                if (e.f5505d == gVar) {
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gVar = oVar.f5213r;
                            try {
                                cf.c.M(obj3);
                            } catch (ke.a e9) {
                                e = e9;
                                if (e.f5505d == gVar) {
                                    throw e;
                                }
                                ge.a0.j(oVar.getContext());
                                return Unit.f5554a;
                            }
                        }
                        return Unit.f5554a;
                    }
                }
                oVar = new o(this, aVar);
                Object obj32 = oVar.f5210d;
                md.a aVar32 = md.a.f6622d;
                i10 = oVar.f5211e;
                if (i10 != 0) {
                }
                return Unit.f5554a;
        }
    }
}
