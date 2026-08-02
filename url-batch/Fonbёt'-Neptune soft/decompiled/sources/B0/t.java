package B0;

import d1.AbstractC0184a;

/* loaded from: classes.dex */
public final class t implements b1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final Object f188f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f189g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f190h;

    public t(Q0.m mVar, b1.e eVar, I.r rVar) {
        this.f189g = mVar;
        this.f188f = eVar;
        this.f190h = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    @Override // b1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, H0.d dVar) {
        C0040s c0040s;
        int i2;
        b1.k kVar;
        int i3;
        t tVar;
        switch (this.f187e) {
            case 0:
                if (dVar instanceof C0040s) {
                    c0040s = (C0040s) dVar;
                    int i4 = c0040s.f185i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0040s.f185i = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0040s.f184h;
                        I0.a aVar = I0.a.f733e;
                        i2 = c0040s.f185i;
                        if (i2 != 0) {
                            i1.a.G(obj2);
                            Double d2 = (Double) O.c(((L.b) obj).c((L.d) this.f189g), ((N) this.f190h).f127g);
                            c0040s.f185i = 1;
                            if (((b1.e) this.f188f).a(d2, c0040s) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i1.a.G(obj2);
                        }
                        return F0.h.f469a;
                    }
                }
                c0040s = new C0040s(this, dVar);
                Object obj22 = c0040s.f184h;
                I0.a aVar2 = I0.a.f733e;
                i2 = c0040s.f185i;
                if (i2 != 0) {
                }
                return F0.h.f469a;
            case 1:
                if (dVar instanceof b1.k) {
                    kVar = (b1.k) dVar;
                    int i5 = kVar.f1935l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kVar.f1935l = i5 - Integer.MIN_VALUE;
                        Object obj3 = kVar.f1933j;
                        I0.a aVar3 = I0.a.f733e;
                        i3 = kVar.f1935l;
                        F0.h hVar = F0.h.f469a;
                        if (i3 != 0) {
                            i1.a.G(obj3);
                            if (((Q0.m) this.f189g).f981e) {
                                kVar.f1935l = 1;
                                if (((b1.e) this.f188f).a(obj, kVar) == aVar3) {
                                    return aVar3;
                                }
                                return hVar;
                            }
                            kVar.f1931h = this;
                            kVar.f1932i = obj;
                            kVar.f1935l = 2;
                            obj3 = ((I.r) this.f190h).h(obj, kVar);
                            if (obj3 == aVar3) {
                                return aVar3;
                            }
                            tVar = this;
                            if (!((Boolean) obj3).booleanValue()) {
                            }
                            return hVar;
                        }
                        if (i3 != 1) {
                            if (i3 == 2) {
                                obj = kVar.f1932i;
                                tVar = kVar.f1931h;
                                i1.a.G(obj3);
                                if (!((Boolean) obj3).booleanValue()) {
                                    ((Q0.m) tVar.f189g).f981e = true;
                                    kVar.f1931h = null;
                                    kVar.f1932i = null;
                                    kVar.f1935l = 3;
                                    if (((b1.e) tVar.f188f).a(obj, kVar) == aVar3) {
                                        return aVar3;
                                    }
                                }
                                return hVar;
                            }
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        i1.a.G(obj3);
                        return hVar;
                    }
                }
                kVar = new b1.k(this, dVar);
                Object obj32 = kVar.f1933j;
                I0.a aVar32 = I0.a.f733e;
                i3 = kVar.f1935l;
                F0.h hVar2 = F0.h.f469a;
                if (i3 != 0) {
                }
            default:
                Object b2 = c1.l.b((H0.i) this.f188f, obj, this.f189g, (c1.t) this.f190h, dVar);
                return b2 == I0.a.f733e ? b2 : F0.h.f469a;
        }
    }

    public t(b1.e eVar, L.d dVar, N n2) {
        this.f188f = eVar;
        this.f189g = dVar;
        this.f190h = n2;
    }

    public t(b1.e eVar, H0.i iVar) {
        this.f188f = iVar;
        this.f189g = AbstractC0184a.l(iVar);
        this.f190h = new c1.t(eVar, null);
    }
}
