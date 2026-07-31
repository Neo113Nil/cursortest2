package t0;

import I.C0089d;
import I.InterfaceC0126w;
import I.Y0;
import h1.C0438i;
import r0.InterfaceC0827A;
import u0.AbstractC0963b0;
import u0.D0;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900h extends Z1.j implements Y1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0900h f7914f = new C0900h(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0900h f7915g = new C0900h(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0900h f7916h = new C0900h(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0900h f7917i = new C0900h(2, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0900h(int i3, int i4) {
        super(i3);
        this.f7918e = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [U.k] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [U.k] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [K.d] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [K.d] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [K.d] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [K.d] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7918e) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0902j) obj).getClass();
                break;
            case 1:
                InterfaceC0827A interfaceC0827A = (InterfaceC0827A) obj2;
                D d3 = (D) ((InterfaceC0902j) obj);
                if (!Z1.i.a(d3.f7729r, interfaceC0827A)) {
                    d3.f7729r = interfaceC0827A;
                    d3.y();
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((D) ((InterfaceC0902j) obj)).W((U.l) obj2);
                break;
            default:
                InterfaceC0126w interfaceC0126w = (InterfaceC0126w) obj2;
                D d4 = (D) ((InterfaceC0902j) obj);
                d4.f7733v = interfaceC0126w;
                Y0 y02 = AbstractC0963b0.f8296f;
                Q.d dVar = (Q.d) interfaceC0126w;
                dVar.getClass();
                d4.U((M0.b) C0089d.K(dVar, y02));
                M0.j jVar = (M0.j) C0089d.K(dVar, AbstractC0963b0.f8302l);
                if (d4.f7731t != jVar) {
                    d4.f7731t = jVar;
                    d4.y();
                    D q2 = d4.q();
                    if (q2 != null) {
                        q2.w();
                    }
                    d4.x();
                    U.k kVar = (U.k) d4.f7735x.f2356f;
                    if ((kVar.f3306g & 4) != 0) {
                        while (kVar != null) {
                            if ((kVar.f3305f & 4) != 0) {
                                AbstractC0905m abstractC0905m = kVar;
                                ?? r3 = 0;
                                while (abstractC0905m != 0) {
                                    if (abstractC0905m instanceof InterfaceC0907o) {
                                        InterfaceC0907o interfaceC0907o = (InterfaceC0907o) abstractC0905m;
                                        if (interfaceC0907o instanceof Y.b) {
                                            ((Y.b) interfaceC0907o).v0();
                                        }
                                    } else if ((abstractC0905m.f3305f & 4) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                        U.k kVar2 = abstractC0905m.f7937r;
                                        int i3 = 0;
                                        abstractC0905m = abstractC0905m;
                                        r3 = r3;
                                        while (kVar2 != null) {
                                            if ((kVar2.f3305f & 4) != 0) {
                                                i3++;
                                                r3 = r3;
                                                if (i3 == 1) {
                                                    abstractC0905m = kVar2;
                                                } else {
                                                    if (r3 == 0) {
                                                        r3 = new K.d(new U.k[16]);
                                                    }
                                                    if (abstractC0905m != 0) {
                                                        r3.b(abstractC0905m);
                                                        abstractC0905m = 0;
                                                    }
                                                    r3.b(kVar2);
                                                }
                                            }
                                            kVar2 = kVar2.f3308i;
                                            abstractC0905m = abstractC0905m;
                                            r3 = r3;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    abstractC0905m = AbstractC0898f.f(r3);
                                }
                            }
                            if ((kVar.f3306g & 4) != 0) {
                                kVar = kVar.f3308i;
                            }
                        }
                    }
                }
                D0 d02 = (D0) C0089d.K(dVar, AbstractC0963b0.f8306q);
                if (!Z1.i.a(d4.f7732u, d02)) {
                    d4.f7732u = d02;
                    U.k kVar3 = (U.k) d4.f7735x.f2356f;
                    if ((kVar3.f3306g & 16) != 0) {
                        while (kVar3 != null) {
                            if ((kVar3.f3305f & 16) != 0) {
                                AbstractC0905m abstractC0905m2 = kVar3;
                                ?? r32 = 0;
                                while (abstractC0905m2 != 0) {
                                    if (abstractC0905m2 instanceof l0) {
                                        ((l0) abstractC0905m2).E();
                                    } else if ((abstractC0905m2.f3305f & 16) != 0 && (abstractC0905m2 instanceof AbstractC0905m)) {
                                        U.k kVar4 = abstractC0905m2.f7937r;
                                        int i4 = 0;
                                        abstractC0905m2 = abstractC0905m2;
                                        r32 = r32;
                                        while (kVar4 != null) {
                                            if ((kVar4.f3305f & 16) != 0) {
                                                i4++;
                                                r32 = r32;
                                                if (i4 == 1) {
                                                    abstractC0905m2 = kVar4;
                                                } else {
                                                    if (r32 == 0) {
                                                        r32 = new K.d(new U.k[16]);
                                                    }
                                                    if (abstractC0905m2 != 0) {
                                                        r32.b(abstractC0905m2);
                                                        abstractC0905m2 = 0;
                                                    }
                                                    r32.b(kVar4);
                                                }
                                            }
                                            kVar4 = kVar4.f3308i;
                                            abstractC0905m2 = abstractC0905m2;
                                            r32 = r32;
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    abstractC0905m2 = AbstractC0898f.f(r32);
                                }
                            }
                            if ((kVar3.f3306g & 16) != 0) {
                                kVar3 = kVar3.f3308i;
                            }
                        }
                    }
                }
                U.k kVar5 = (U.k) d4.f7735x.f2356f;
                if ((kVar5.f3306g & 32768) != 0) {
                    while (kVar5 != null) {
                        if ((kVar5.f3305f & 32768) != 0) {
                            AbstractC0905m abstractC0905m3 = kVar5;
                            ?? r22 = 0;
                            while (abstractC0905m3 != 0) {
                                if (abstractC0905m3 instanceof InterfaceC0903k) {
                                    U.k kVar6 = ((U.k) ((InterfaceC0903k) abstractC0905m3)).f3303d;
                                    if (kVar6.p) {
                                        b0.d(kVar6);
                                    } else {
                                        kVar6.f3312m = true;
                                    }
                                } else if ((abstractC0905m3.f3305f & 32768) != 0 && (abstractC0905m3 instanceof AbstractC0905m)) {
                                    U.k kVar7 = abstractC0905m3.f7937r;
                                    int i5 = 0;
                                    abstractC0905m3 = abstractC0905m3;
                                    r22 = r22;
                                    while (kVar7 != null) {
                                        if ((kVar7.f3305f & 32768) != 0) {
                                            i5++;
                                            r22 = r22;
                                            if (i5 == 1) {
                                                abstractC0905m3 = kVar7;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new K.d(new U.k[16]);
                                                }
                                                if (abstractC0905m3 != 0) {
                                                    r22.b(abstractC0905m3);
                                                    abstractC0905m3 = 0;
                                                }
                                                r22.b(kVar7);
                                            }
                                        }
                                        kVar7 = kVar7.f3308i;
                                        abstractC0905m3 = abstractC0905m3;
                                        r22 = r22;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC0905m3 = AbstractC0898f.f(r22);
                            }
                        }
                        if ((kVar5.f3306g & 32768) != 0) {
                            kVar5 = kVar5.f3308i;
                        }
                    }
                }
                break;
        }
        return L1.z.f2729a;
    }
}
