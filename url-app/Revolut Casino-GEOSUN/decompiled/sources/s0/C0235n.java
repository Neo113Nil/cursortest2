package s0;

import D.C0016q;
import u0.C0247g;

/* renamed from: s0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235n implements P0.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P0.e f2913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2914g;

    public /* synthetic */ C0235n(P0.e eVar, G.d dVar, int i2) {
        this.f2912e = i2;
        this.f2913f = eVar;
        this.f2914g = dVar;
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
    @Override // P0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, w0.d dVar) {
        C0234m c0234m;
        int i2;
        s sVar;
        int i3;
        w wVar;
        int i4;
        y yVar;
        int i5;
        P0.n nVar;
        int i6;
        boolean z2;
        Object obj2;
        Object obj3;
        C0235n c0235n;
        switch (this.f2912e) {
            case 0:
                if (dVar instanceof C0234m) {
                    c0234m = (C0234m) dVar;
                    int i7 = c0234m.f2910i;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0234m.f2910i = i7 - Integer.MIN_VALUE;
                        Object obj4 = c0234m.f2909h;
                        x0.a aVar = x0.a.f3094e;
                        i2 = c0234m.f2910i;
                        if (i2 != 0) {
                            o.g.z(obj4);
                            Object c2 = ((G.b) obj).c((G.d) this.f2914g);
                            c0234m.f2910i = 1;
                            if (this.f2913f.a(c2, c0234m) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj4);
                        }
                        return C0247g.f3005a;
                    }
                }
                c0234m = new C0234m(this, dVar);
                Object obj42 = c0234m.f2909h;
                x0.a aVar2 = x0.a.f3094e;
                i2 = c0234m.f2910i;
                if (i2 != 0) {
                }
                return C0247g.f3005a;
            case 1:
                if (dVar instanceof s) {
                    sVar = (s) dVar;
                    int i8 = sVar.f2932i;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        sVar.f2932i = i8 - Integer.MIN_VALUE;
                        Object obj5 = sVar.f2931h;
                        x0.a aVar3 = x0.a.f3094e;
                        i3 = sVar.f2932i;
                        if (i3 != 0) {
                            o.g.z(obj5);
                            Object c3 = ((G.b) obj).c((G.d) this.f2914g);
                            sVar.f2932i = 1;
                            if (this.f2913f.a(c3, sVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj5);
                        }
                        return C0247g.f3005a;
                    }
                }
                sVar = new s(this, dVar);
                Object obj52 = sVar.f2931h;
                x0.a aVar32 = x0.a.f3094e;
                i3 = sVar.f2932i;
                if (i3 != 0) {
                }
                return C0247g.f3005a;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (dVar instanceof w) {
                    wVar = (w) dVar;
                    int i9 = wVar.f2951i;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        wVar.f2951i = i9 - Integer.MIN_VALUE;
                        Object obj6 = wVar.f2950h;
                        x0.a aVar4 = x0.a.f3094e;
                        i4 = wVar.f2951i;
                        if (i4 != 0) {
                            o.g.z(obj6);
                            Object c4 = ((G.b) obj).c((G.d) this.f2914g);
                            wVar.f2951i = 1;
                            if (this.f2913f.a(c4, wVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj6);
                        }
                        return C0247g.f3005a;
                    }
                }
                wVar = new w(this, dVar);
                Object obj62 = wVar.f2950h;
                x0.a aVar42 = x0.a.f3094e;
                i4 = wVar.f2951i;
                if (i4 != 0) {
                }
                return C0247g.f3005a;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (dVar instanceof y) {
                    yVar = (y) dVar;
                    int i10 = yVar.f2959i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        yVar.f2959i = i10 - Integer.MIN_VALUE;
                        Object obj7 = yVar.f2958h;
                        x0.a aVar5 = x0.a.f3094e;
                        i5 = yVar.f2959i;
                        if (i5 != 0) {
                            o.g.z(obj7);
                            Object c5 = ((G.b) obj).c((G.d) this.f2914g);
                            yVar.f2959i = 1;
                            if (this.f2913f.a(c5, yVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.g.z(obj7);
                        }
                        return C0247g.f3005a;
                    }
                }
                yVar = new y(this, dVar);
                Object obj72 = yVar.f2958h;
                x0.a aVar52 = x0.a.f3094e;
                i5 = yVar.f2959i;
                if (i5 != 0) {
                }
                return C0247g.f3005a;
            default:
                if (dVar instanceof P0.n) {
                    nVar = (P0.n) dVar;
                    int i11 = nVar.f809j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nVar.f809j = i11 - Integer.MIN_VALUE;
                        Object obj8 = nVar.f808i;
                        x0.a aVar6 = x0.a.f3094e;
                        i6 = nVar.f809j;
                        z2 = true;
                        if (i6 != 0) {
                            o.g.z(obj8);
                            nVar.f807h = this;
                            nVar.f811l = obj;
                            nVar.f809j = 1;
                            Object f2 = ((C0016q) this.f2914g).f(obj, nVar);
                            if (f2 == aVar6) {
                                return aVar6;
                            }
                            obj2 = f2;
                            obj3 = obj;
                            c0235n = this;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0235n = nVar.f807h;
                                o.g.z(obj8);
                                if (z2) {
                                    return C0247g.f3005a;
                                }
                                throw new Q0.a(c0235n);
                            }
                            Object obj9 = nVar.f811l;
                            C0235n c0235n2 = nVar.f807h;
                            o.g.z(obj8);
                            obj3 = obj9;
                            c0235n = c0235n2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z2 = false;
                        } else {
                            P0.e eVar = c0235n.f2913f;
                            nVar.f807h = c0235n;
                            nVar.f811l = null;
                            nVar.f809j = 2;
                            if (eVar.a(obj3, nVar) == aVar6) {
                                return aVar6;
                            }
                        }
                        if (z2) {
                        }
                    }
                }
                nVar = new P0.n(this, dVar);
                Object obj82 = nVar.f808i;
                x0.a aVar62 = x0.a.f3094e;
                i6 = nVar.f809j;
                z2 = true;
                if (i6 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
        }
    }

    public C0235n(C0016q c0016q, P0.e eVar) {
        this.f2912e = 4;
        this.f2914g = c0016q;
        this.f2913f = eVar;
    }
}
