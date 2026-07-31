package B0;

import a.AbstractC0086a;
import b1.AbstractC0115a;

/* renamed from: B0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018t implements Z0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f117e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final Object f118f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f119g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f120h;

    public C0018t(P0.m mVar, Z0.e eVar, F.r rVar) {
        this.f119g = mVar;
        this.f118f = eVar;
        this.f120h = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    @Override // Z0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, I0.b bVar) {
        C0017s c0017s;
        int i2;
        Z0.k kVar;
        Object obj2;
        int i3;
        C0018t c0018t;
        switch (this.f117e) {
            case 0:
                if (bVar instanceof C0017s) {
                    c0017s = (C0017s) bVar;
                    int i4 = c0017s.f115i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0017s.f115i = i4 - Integer.MIN_VALUE;
                        Object obj3 = c0017s.f114h;
                        i2 = c0017s.f115i;
                        if (i2 != 0) {
                            AbstractC0086a.I(obj3);
                            Z0.e eVar = (Z0.e) this.f118f;
                            Double d2 = (Double) P.c(((I.b) obj).c((I.d) this.f119g), ((O) this.f120h).f56g);
                            c0017s.f115i = 1;
                            Object a2 = eVar.a(d2, c0017s);
                            H0.a aVar = H0.a.f511e;
                            if (a2 == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0086a.I(obj3);
                        }
                        return D0.h.f206a;
                    }
                }
                c0017s = new C0017s(this, bVar);
                Object obj32 = c0017s.f114h;
                i2 = c0017s.f115i;
                if (i2 != 0) {
                }
                return D0.h.f206a;
            case 1:
                if (bVar instanceof Z0.k) {
                    kVar = (Z0.k) bVar;
                    int i5 = kVar.f1107l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kVar.f1107l = i5 - Integer.MIN_VALUE;
                        obj2 = kVar.f1105j;
                        i3 = kVar.f1107l;
                        D0.h hVar = D0.h.f206a;
                        H0.a aVar2 = H0.a.f511e;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    obj = kVar.f1104i;
                                    c0018t = kVar.f1103h;
                                    AbstractC0086a.I(obj2);
                                } else if (i3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            AbstractC0086a.I(obj2);
                            return hVar;
                        }
                        AbstractC0086a.I(obj2);
                        if (((P0.m) this.f119g).f805e) {
                            Z0.e eVar2 = (Z0.e) this.f118f;
                            kVar.f1107l = 1;
                            if (eVar2.a(obj, kVar) != aVar2) {
                                return hVar;
                            }
                        } else {
                            F.r rVar = (F.r) this.f120h;
                            kVar.f1103h = this;
                            kVar.f1104i = obj;
                            kVar.f1107l = 2;
                            obj2 = rVar.i(obj, kVar);
                            if (obj2 != aVar2) {
                                c0018t = this;
                            }
                        }
                        return aVar2;
                        if (!((Boolean) obj2).booleanValue()) {
                            return hVar;
                        }
                        ((P0.m) c0018t.f119g).f805e = true;
                        Z0.e eVar3 = (Z0.e) c0018t.f118f;
                        kVar.f1103h = null;
                        kVar.f1104i = null;
                        kVar.f1107l = 3;
                        if (eVar3.a(obj, kVar) != aVar2) {
                            return hVar;
                        }
                        return aVar2;
                    }
                }
                kVar = new Z0.k(this, bVar);
                obj2 = kVar.f1105j;
                i3 = kVar.f1107l;
                D0.h hVar2 = D0.h.f206a;
                H0.a aVar22 = H0.a.f511e;
                if (i3 == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            default:
                Object b2 = a1.l.b((G0.i) this.f118f, obj, this.f119g, (a1.t) this.f120h, bVar);
                return b2 == H0.a.f511e ? b2 : D0.h.f206a;
        }
    }

    public C0018t(Z0.e eVar, I.d dVar, O o2) {
        this.f118f = eVar;
        this.f119g = dVar;
        this.f120h = o2;
    }

    public C0018t(Z0.e eVar, G0.i iVar) {
        this.f118f = iVar;
        this.f119g = AbstractC0115a.k(iVar);
        this.f120h = new a1.t(eVar, null);
    }
}
