package B0;

import I.C0082q;

/* renamed from: B0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038p implements b1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1.e f174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f175g;

    public /* synthetic */ C0038p(b1.e eVar, L.d dVar, int i2) {
        this.f173e = i2;
        this.f174f = eVar;
        this.f175g = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    @Override // b1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, H0.d dVar) {
        C0037o c0037o;
        int i2;
        v vVar;
        int i3;
        z zVar;
        int i4;
        B b2;
        int i5;
        b1.m mVar;
        int i6;
        boolean z2;
        Object obj2;
        Object obj3;
        C0038p c0038p;
        switch (this.f173e) {
            case 0:
                if (dVar instanceof C0037o) {
                    c0037o = (C0037o) dVar;
                    int i7 = c0037o.f171i;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0037o.f171i = i7 - Integer.MIN_VALUE;
                        Object obj4 = c0037o.f170h;
                        I0.a aVar = I0.a.f733e;
                        i2 = c0037o.f171i;
                        if (i2 != 0) {
                            i1.a.G(obj4);
                            Object c2 = ((L.b) obj).c((L.d) this.f175g);
                            c0037o.f171i = 1;
                            if (this.f174f.a(c2, c0037o) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i1.a.G(obj4);
                        }
                        return F0.h.f469a;
                    }
                }
                c0037o = new C0037o(this, dVar);
                Object obj42 = c0037o.f170h;
                I0.a aVar2 = I0.a.f733e;
                i2 = c0037o.f171i;
                if (i2 != 0) {
                }
                return F0.h.f469a;
            case 1:
                if (dVar instanceof v) {
                    vVar = (v) dVar;
                    int i8 = vVar.f197i;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        vVar.f197i = i8 - Integer.MIN_VALUE;
                        Object obj5 = vVar.f196h;
                        I0.a aVar3 = I0.a.f733e;
                        i3 = vVar.f197i;
                        if (i3 != 0) {
                            i1.a.G(obj5);
                            Object c3 = ((L.b) obj).c((L.d) this.f175g);
                            vVar.f197i = 1;
                            if (this.f174f.a(c3, vVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i1.a.G(obj5);
                        }
                        return F0.h.f469a;
                    }
                }
                vVar = new v(this, dVar);
                Object obj52 = vVar.f196h;
                I0.a aVar32 = I0.a.f733e;
                i3 = vVar.f197i;
                if (i3 != 0) {
                }
                return F0.h.f469a;
            case 2:
                if (dVar instanceof z) {
                    zVar = (z) dVar;
                    int i9 = zVar.f216i;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zVar.f216i = i9 - Integer.MIN_VALUE;
                        Object obj6 = zVar.f215h;
                        I0.a aVar4 = I0.a.f733e;
                        i4 = zVar.f216i;
                        if (i4 != 0) {
                            i1.a.G(obj6);
                            Object c4 = ((L.b) obj).c((L.d) this.f175g);
                            zVar.f216i = 1;
                            if (this.f174f.a(c4, zVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i1.a.G(obj6);
                        }
                        return F0.h.f469a;
                    }
                }
                zVar = new z(this, dVar);
                Object obj62 = zVar.f215h;
                I0.a aVar42 = I0.a.f733e;
                i4 = zVar.f216i;
                if (i4 != 0) {
                }
                return F0.h.f469a;
            case 3:
                if (dVar instanceof B) {
                    b2 = (B) dVar;
                    int i10 = b2.f85i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        b2.f85i = i10 - Integer.MIN_VALUE;
                        Object obj7 = b2.f84h;
                        I0.a aVar5 = I0.a.f733e;
                        i5 = b2.f85i;
                        if (i5 != 0) {
                            i1.a.G(obj7);
                            Object c5 = ((L.b) obj).c((L.d) this.f175g);
                            b2.f85i = 1;
                            if (this.f174f.a(c5, b2) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i1.a.G(obj7);
                        }
                        return F0.h.f469a;
                    }
                }
                b2 = new B(this, dVar);
                Object obj72 = b2.f84h;
                I0.a aVar52 = I0.a.f733e;
                i5 = b2.f85i;
                if (i5 != 0) {
                }
                return F0.h.f469a;
            default:
                if (dVar instanceof b1.m) {
                    mVar = (b1.m) dVar;
                    int i11 = mVar.f1942j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        mVar.f1942j = i11 - Integer.MIN_VALUE;
                        Object obj8 = mVar.f1941i;
                        I0.a aVar6 = I0.a.f733e;
                        i6 = mVar.f1942j;
                        z2 = true;
                        if (i6 != 0) {
                            i1.a.G(obj8);
                            mVar.f1940h = this;
                            mVar.f1944l = obj;
                            mVar.f1942j = 1;
                            Object h2 = ((C0082q) this.f175g).h(obj, mVar);
                            if (h2 == aVar6) {
                                return aVar6;
                            }
                            obj2 = h2;
                            obj3 = obj;
                            c0038p = this;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0038p = mVar.f1940h;
                                i1.a.G(obj8);
                                if (z2) {
                                    return F0.h.f469a;
                                }
                                throw new c1.a(c0038p);
                            }
                            Object obj9 = mVar.f1944l;
                            C0038p c0038p2 = mVar.f1940h;
                            i1.a.G(obj8);
                            obj3 = obj9;
                            c0038p = c0038p2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z2 = false;
                        } else {
                            b1.e eVar = c0038p.f174f;
                            mVar.f1940h = c0038p;
                            mVar.f1944l = null;
                            mVar.f1942j = 2;
                            if (eVar.a(obj3, mVar) == aVar6) {
                                return aVar6;
                            }
                        }
                        if (z2) {
                        }
                    }
                }
                mVar = new b1.m(this, dVar);
                Object obj82 = mVar.f1941i;
                I0.a aVar62 = I0.a.f733e;
                i6 = mVar.f1942j;
                z2 = true;
                if (i6 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
        }
    }

    public C0038p(C0082q c0082q, b1.e eVar) {
        this.f173e = 4;
        this.f175g = c0082q;
        this.f174f = eVar;
    }
}
