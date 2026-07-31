package t0;

import I.C0143d;
import I.InterfaceC0180w;
import I.X0;
import e2.InterfaceC0426e;
import r0.InterfaceC0885G;
import u0.AbstractC1101g0;
import u0.O0;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995h extends f2.k implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0995h f8748f = new C0995h(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0995h f8749g = new C0995h(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0995h f8750h = new C0995h(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0995h f8751i = new C0995h(2, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0995h(int i3, int i4) {
        super(i3);
        this.f8752e = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [U.p] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [U.p] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [U.p] */
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
    /* JADX WARN: Type inference failed for: r2v9, types: [U.p] */
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
    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f8752e) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0997j) obj).getClass();
                break;
            case 1:
                ((E) ((InterfaceC0997j) obj)).Y((InterfaceC0885G) obj2);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((E) ((InterfaceC0997j) obj)).Z((U.q) obj2);
                break;
            default:
                InterfaceC0180w interfaceC0180w = (InterfaceC0180w) obj2;
                E e3 = (E) ((InterfaceC0997j) obj);
                e3.f8559w = interfaceC0180w;
                X0 x02 = AbstractC1101g0.f9354f;
                Q.d dVar = (Q.d) interfaceC0180w;
                dVar.getClass();
                e3.W((O0.b) C0143d.L(dVar, x02));
                O0.k kVar = (O0.k) C0143d.L(dVar, AbstractC1101g0.f9360l);
                if (e3.f8557u != kVar) {
                    e3.f8557u = kVar;
                    e3.A();
                    E s3 = e3.s();
                    if (s3 != null) {
                        s3.y();
                    }
                    e3.z();
                    U.p pVar = (U.p) e3.f8561y.f2915f;
                    if ((pVar.f4492g & 4) != 0) {
                        while (pVar != null) {
                            if ((pVar.f4491f & 4) != 0) {
                                AbstractC1000m abstractC1000m = pVar;
                                ?? r3 = 0;
                                while (abstractC1000m != 0) {
                                    if (abstractC1000m instanceof InterfaceC1002o) {
                                        InterfaceC1002o interfaceC1002o = (InterfaceC1002o) abstractC1000m;
                                        if (interfaceC1002o instanceof Y.b) {
                                            ((Y.b) interfaceC1002o).y0();
                                        }
                                    } else if ((abstractC1000m.f4491f & 4) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                        U.p pVar2 = abstractC1000m.f8771r;
                                        int i3 = 0;
                                        abstractC1000m = abstractC1000m;
                                        r3 = r3;
                                        while (pVar2 != null) {
                                            if ((pVar2.f4491f & 4) != 0) {
                                                i3++;
                                                r3 = r3;
                                                if (i3 == 1) {
                                                    abstractC1000m = pVar2;
                                                } else {
                                                    if (r3 == 0) {
                                                        r3 = new K.d(new U.p[16]);
                                                    }
                                                    if (abstractC1000m != 0) {
                                                        r3.b(abstractC1000m);
                                                        abstractC1000m = 0;
                                                    }
                                                    r3.b(pVar2);
                                                }
                                            }
                                            pVar2 = pVar2.f4494i;
                                            abstractC1000m = abstractC1000m;
                                            r3 = r3;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    abstractC1000m = AbstractC0993f.f(r3);
                                }
                            }
                            if ((pVar.f4492g & 4) != 0) {
                                pVar = pVar.f4494i;
                            }
                        }
                    }
                }
                O0 o02 = (O0) C0143d.L(dVar, AbstractC1101g0.f9365q);
                if (!f2.j.a(e3.f8558v, o02)) {
                    e3.f8558v = o02;
                    U.p pVar3 = (U.p) e3.f8561y.f2915f;
                    if ((pVar3.f4492g & 16) != 0) {
                        while (pVar3 != null) {
                            if ((pVar3.f4491f & 16) != 0) {
                                AbstractC1000m abstractC1000m2 = pVar3;
                                ?? r32 = 0;
                                while (abstractC1000m2 != 0) {
                                    if (abstractC1000m2 instanceof m0) {
                                        ((m0) abstractC1000m2).I();
                                    } else if ((abstractC1000m2.f4491f & 16) != 0 && (abstractC1000m2 instanceof AbstractC1000m)) {
                                        U.p pVar4 = abstractC1000m2.f8771r;
                                        int i4 = 0;
                                        abstractC1000m2 = abstractC1000m2;
                                        r32 = r32;
                                        while (pVar4 != null) {
                                            if ((pVar4.f4491f & 16) != 0) {
                                                i4++;
                                                r32 = r32;
                                                if (i4 == 1) {
                                                    abstractC1000m2 = pVar4;
                                                } else {
                                                    if (r32 == 0) {
                                                        r32 = new K.d(new U.p[16]);
                                                    }
                                                    if (abstractC1000m2 != 0) {
                                                        r32.b(abstractC1000m2);
                                                        abstractC1000m2 = 0;
                                                    }
                                                    r32.b(pVar4);
                                                }
                                            }
                                            pVar4 = pVar4.f4494i;
                                            abstractC1000m2 = abstractC1000m2;
                                            r32 = r32;
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    abstractC1000m2 = AbstractC0993f.f(r32);
                                }
                            }
                            if ((pVar3.f4492g & 16) != 0) {
                                pVar3 = pVar3.f4494i;
                            }
                        }
                    }
                }
                U.p pVar5 = (U.p) e3.f8561y.f2915f;
                if ((pVar5.f4492g & 32768) != 0) {
                    while (pVar5 != null) {
                        if ((pVar5.f4491f & 32768) != 0) {
                            AbstractC1000m abstractC1000m3 = pVar5;
                            ?? r22 = 0;
                            while (abstractC1000m3 != 0) {
                                if (abstractC1000m3 instanceof InterfaceC0998k) {
                                    U.p pVar6 = ((U.p) ((InterfaceC0998k) abstractC1000m3)).f4489d;
                                    if (pVar6.f4501p) {
                                        c0.d(pVar6);
                                    } else {
                                        pVar6.f4498m = true;
                                    }
                                } else if ((abstractC1000m3.f4491f & 32768) != 0 && (abstractC1000m3 instanceof AbstractC1000m)) {
                                    U.p pVar7 = abstractC1000m3.f8771r;
                                    int i5 = 0;
                                    abstractC1000m3 = abstractC1000m3;
                                    r22 = r22;
                                    while (pVar7 != null) {
                                        if ((pVar7.f4491f & 32768) != 0) {
                                            i5++;
                                            r22 = r22;
                                            if (i5 == 1) {
                                                abstractC1000m3 = pVar7;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new K.d(new U.p[16]);
                                                }
                                                if (abstractC1000m3 != 0) {
                                                    r22.b(abstractC1000m3);
                                                    abstractC1000m3 = 0;
                                                }
                                                r22.b(pVar7);
                                            }
                                        }
                                        pVar7 = pVar7.f4494i;
                                        abstractC1000m3 = abstractC1000m3;
                                        r22 = r22;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC1000m3 = AbstractC0993f.f(r22);
                            }
                        }
                        if ((pVar5.f4492g & 32768) != 0) {
                            pVar5 = pVar5.f4494i;
                        }
                    }
                }
                break;
        }
        return R1.y.f4171a;
    }
}
