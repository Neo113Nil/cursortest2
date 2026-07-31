package d7;

import java.util.List;
import m0.d1;
import m0.q1;
import m0.z0;
import r.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2403d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2404e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2405f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2406g;

    public /* synthetic */ o(z0 z0Var, Object obj, z0 z0Var2, int i) {
        this.f2403d = i;
        this.f2404e = z0Var;
        this.f2405f = obj;
        this.f2406g = z0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Type inference failed for: r9v6, types: [i6.i, p6.e] */
    @Override // d7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, g6.c cVar) {
        n nVar;
        Object obj2;
        int i;
        o oVar;
        switch (this.f2403d) {
            case 0:
                if (cVar instanceof n) {
                    nVar = (n) cVar;
                    int i8 = nVar.f2401k;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        nVar.f2401k = i8 - Integer.MIN_VALUE;
                        obj2 = nVar.i;
                        i = nVar.f2401k;
                        c6.m mVar = c6.m.f1757a;
                        h6.a aVar = h6.a.f3204d;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    obj = nVar.f2399h;
                                    oVar = nVar.f2398g;
                                    s6.a.K(obj2);
                                } else if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            s6.a.K(obj2);
                            return mVar;
                        }
                        s6.a.K(obj2);
                        if (((q6.o) this.f2404e).f6201d) {
                            g gVar = (g) this.f2405f;
                            nVar.f2401k = 1;
                            if (gVar.a(obj, nVar) != aVar) {
                                return mVar;
                            }
                        } else {
                            ?? r9 = (i6.i) this.f2406g;
                            nVar.f2398g = this;
                            nVar.f2399h = obj;
                            nVar.f2401k = 2;
                            obj2 = r9.g(obj, nVar);
                            if (obj2 != aVar) {
                                oVar = this;
                            }
                        }
                        return aVar;
                        if (!((Boolean) obj2).booleanValue()) {
                            return mVar;
                        }
                        ((q6.o) oVar.f2404e).f6201d = true;
                        g gVar2 = (g) oVar.f2405f;
                        nVar.f2398g = null;
                        nVar.f2399h = null;
                        nVar.f2401k = 3;
                        if (gVar2.a(obj, nVar) != aVar) {
                            return mVar;
                        }
                        return aVar;
                    }
                }
                nVar = new n(this, cVar);
                obj2 = nVar.i;
                i = nVar.f2401k;
                c6.m mVar2 = c6.m.f1757a;
                h6.a aVar2 = h6.a.f3204d;
                if (i == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            case 1:
                Object a8 = e7.c.a((g6.h) this.f2404e, obj, this.f2405f, (b0.d) this.f2406g, cVar);
                return a8 == h6.a.f3204d ? a8 : c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                b.a aVar3 = (b.a) obj;
                if (((List) ((z0) this.f2404e).getValue()).size() > 1) {
                    ((z0) this.f2405f).setValue(Boolean.TRUE);
                    ((d1) this.f2406g).h(aVar3.f961c);
                }
                return c6.m.f1757a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                l1 l1Var = (l1) this.f2405f;
                ((q1) this.f2404e).setValue(Boolean.valueOf(booleanValue ? ((Boolean) ((p6.e) ((z0) this.f2406g).getValue()).g(l1Var.f6346a.b(), l1Var.f6349d.getValue())).booleanValue() : false));
                return c6.m.f1757a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(q6.o oVar, g gVar, p6.e eVar) {
        this.f2403d = 0;
        this.f2404e = oVar;
        this.f2405f = gVar;
        this.f2406g = (i6.i) eVar;
    }

    public o(g gVar, g6.h hVar) {
        this.f2403d = 1;
        this.f2404e = hVar;
        this.f2405f = f7.a.k(hVar);
        this.f2406g = new b0.d(gVar, (g6.c) null, 5);
    }
}
