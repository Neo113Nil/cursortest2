package P0;

import R0.AbstractC0068a;
import s0.J;
import s0.K;
import u0.C0247g;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f799e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f800f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f801g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f802h;

    public l(F0.n nVar, e eVar, D.r rVar) {
        this.f800f = nVar;
        this.f801g = eVar;
        this.f802h = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // P0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, w0.d dVar) {
        k kVar;
        int i2;
        l lVar;
        s0.q qVar;
        int i3;
        switch (this.f799e) {
            case 0:
                if (dVar instanceof k) {
                    kVar = (k) dVar;
                    int i4 = kVar.f798l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kVar.f798l = i4 - Integer.MIN_VALUE;
                        Object obj2 = kVar.f796j;
                        x0.a aVar = x0.a.f3094e;
                        i2 = kVar.f798l;
                        C0247g c0247g = C0247g.f3005a;
                        if (i2 != 0) {
                            o.g.z(obj2);
                            if (((F0.n) this.f800f).f322e) {
                                kVar.f798l = 1;
                                if (((e) this.f801g).a(obj, kVar) == aVar) {
                                    return aVar;
                                }
                                return c0247g;
                            }
                            kVar.f794h = this;
                            kVar.f795i = obj;
                            kVar.f798l = 2;
                            obj2 = ((D.r) this.f802h).f(obj, kVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            lVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return c0247g;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                obj = kVar.f795i;
                                lVar = kVar.f794h;
                                o.g.z(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((F0.n) lVar.f800f).f322e = true;
                                    kVar.f794h = null;
                                    kVar.f795i = null;
                                    kVar.f798l = 3;
                                    if (((e) lVar.f801g).a(obj, kVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                return c0247g;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        o.g.z(obj2);
                        return c0247g;
                    }
                }
                kVar = new k(this, dVar);
                Object obj22 = kVar.f796j;
                x0.a aVar2 = x0.a.f3094e;
                i2 = kVar.f798l;
                C0247g c0247g2 = C0247g.f3005a;
                if (i2 != 0) {
                }
            case 1:
                Object b2 = Q0.l.b((w0.i) this.f800f, obj, this.f801g, (Q0.t) this.f802h, dVar);
                return b2 == x0.a.f3094e ? b2 : C0247g.f3005a;
            default:
                if (dVar instanceof s0.q) {
                    qVar = (s0.q) dVar;
                    int i5 = qVar.f2924i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qVar.f2924i = i5 - Integer.MIN_VALUE;
                        Object obj3 = qVar.f2923h;
                        x0.a aVar3 = x0.a.f3094e;
                        i3 = qVar.f2924i;
                        if (i3 != 0) {
                            o.g.z(obj3);
                            Double d2 = (Double) K.c(((G.b) obj).c((G.d) this.f800f), ((J) this.f802h).f2874g);
                            qVar.f2924i = 1;
                            if (((e) this.f801g).a(d2, qVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj3);
                        }
                        return C0247g.f3005a;
                    }
                }
                qVar = new s0.q(this, dVar);
                Object obj32 = qVar.f2923h;
                x0.a aVar32 = x0.a.f3094e;
                i3 = qVar.f2924i;
                if (i3 != 0) {
                }
                return C0247g.f3005a;
        }
    }

    public l(e eVar, G.d dVar, J j2) {
        this.f801g = eVar;
        this.f800f = dVar;
        this.f802h = j2;
    }

    public l(e eVar, w0.i iVar) {
        this.f800f = iVar;
        this.f801g = AbstractC0068a.m(iVar);
        this.f802h = new Q0.t(eVar, null);
    }
}
