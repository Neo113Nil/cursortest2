package r0;

import G.C0192d;
import G.InterfaceC0229w;
import G.Y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import s0.AbstractC1144g0;
import s0.P0;

/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067h extends M2.p implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1067h f9798e = new C1067h(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1067h f9799i = new C1067h(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1067h f9800j = new C1067h(2, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C1067h f9801k = new C1067h(2, 3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1067h(int i2, int i4) {
        super(i2);
        this.f9802d = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [S.n] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [S.n] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [I.d] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [I.d] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [I.d] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [I.d] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f9802d) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC1070k) obj).getClass();
                break;
            case 1:
                ((E) ((InterfaceC1070k) obj)).Y((InterfaceC0945F) obj2);
                break;
            case 2:
                ((E) ((InterfaceC1070k) obj)).Z((S.o) obj2);
                break;
            default:
                InterfaceC0229w interfaceC0229w = (InterfaceC0229w) obj2;
                E e4 = (E) ((InterfaceC1070k) obj);
                e4.f9613z = interfaceC0229w;
                Y0 y02 = AbstractC1144g0.f10218f;
                O.d dVar = (O.d) interfaceC0229w;
                dVar.getClass();
                e4.W((M0.b) C0192d.L(dVar, y02));
                M0.k kVar = (M0.k) C0192d.L(dVar, AbstractC1144g0.f10224l);
                if (e4.f9611x != kVar) {
                    e4.f9611x = kVar;
                    e4.A();
                    E s4 = e4.s();
                    if (s4 != null) {
                        s4.y();
                    }
                    e4.z();
                    S.n nVar = (S.n) e4.B.f2912f;
                    if ((nVar.f3981j & 4) != 0) {
                        while (nVar != null) {
                            if ((nVar.f3980i & 4) != 0) {
                                AbstractC1073n abstractC1073n = nVar;
                                ?? r32 = 0;
                                while (abstractC1073n != 0) {
                                    if (abstractC1073n instanceof InterfaceC1074o) {
                                        InterfaceC1074o interfaceC1074o = (InterfaceC1074o) abstractC1073n;
                                        if (interfaceC1074o instanceof W.b) {
                                            ((W.b) interfaceC1074o).B0();
                                        }
                                    } else if ((abstractC1073n.f3980i & 4) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                        S.n nVar2 = abstractC1073n.f9826u;
                                        int i2 = 0;
                                        abstractC1073n = abstractC1073n;
                                        r32 = r32;
                                        while (nVar2 != null) {
                                            if ((nVar2.f3980i & 4) != 0) {
                                                i2++;
                                                r32 = r32;
                                                if (i2 == 1) {
                                                    abstractC1073n = nVar2;
                                                } else {
                                                    if (r32 == 0) {
                                                        r32 = new I.d(new S.n[16]);
                                                    }
                                                    if (abstractC1073n != 0) {
                                                        r32.b(abstractC1073n);
                                                        abstractC1073n = 0;
                                                    }
                                                    r32.b(nVar2);
                                                }
                                            }
                                            nVar2 = nVar2.f3983l;
                                            abstractC1073n = abstractC1073n;
                                            r32 = r32;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC1073n = AbstractC1065f.f(r32);
                                }
                            }
                            if ((nVar.f3981j & 4) != 0) {
                                nVar = nVar.f3983l;
                            }
                        }
                    }
                }
                P0 p02 = (P0) C0192d.L(dVar, AbstractC1144g0.f10229q);
                if (!Intrinsics.a(e4.f9612y, p02)) {
                    e4.f9612y = p02;
                    S.n nVar3 = (S.n) e4.B.f2912f;
                    if ((nVar3.f3981j & 16) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f3980i & 16) != 0) {
                                AbstractC1073n abstractC1073n2 = nVar3;
                                ?? r33 = 0;
                                while (abstractC1073n2 != 0) {
                                    if (abstractC1073n2 instanceof l0) {
                                        ((l0) abstractC1073n2).K();
                                    } else if ((abstractC1073n2.f3980i & 16) != 0 && (abstractC1073n2 instanceof AbstractC1073n)) {
                                        S.n nVar4 = abstractC1073n2.f9826u;
                                        int i4 = 0;
                                        abstractC1073n2 = abstractC1073n2;
                                        r33 = r33;
                                        while (nVar4 != null) {
                                            if ((nVar4.f3980i & 16) != 0) {
                                                i4++;
                                                r33 = r33;
                                                if (i4 == 1) {
                                                    abstractC1073n2 = nVar4;
                                                } else {
                                                    if (r33 == 0) {
                                                        r33 = new I.d(new S.n[16]);
                                                    }
                                                    if (abstractC1073n2 != 0) {
                                                        r33.b(abstractC1073n2);
                                                        abstractC1073n2 = 0;
                                                    }
                                                    r33.b(nVar4);
                                                }
                                            }
                                            nVar4 = nVar4.f3983l;
                                            abstractC1073n2 = abstractC1073n2;
                                            r33 = r33;
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    abstractC1073n2 = AbstractC1065f.f(r33);
                                }
                            }
                            if ((nVar3.f3981j & 16) != 0) {
                                nVar3 = nVar3.f3983l;
                            }
                        }
                    }
                }
                S.n nVar5 = (S.n) e4.B.f2912f;
                if ((nVar5.f3981j & 32768) != 0) {
                    while (nVar5 != null) {
                        if ((nVar5.f3980i & 32768) != 0) {
                            AbstractC1073n abstractC1073n3 = nVar5;
                            ?? r2 = 0;
                            while (abstractC1073n3 != 0) {
                                if (abstractC1073n3 instanceof InterfaceC1071l) {
                                    S.n nVar6 = ((S.n) ((InterfaceC1071l) abstractC1073n3)).f3978d;
                                    if (nVar6.f3990s) {
                                        b0.d(nVar6);
                                    } else {
                                        nVar6.f3987p = true;
                                    }
                                } else if ((abstractC1073n3.f3980i & 32768) != 0 && (abstractC1073n3 instanceof AbstractC1073n)) {
                                    S.n nVar7 = abstractC1073n3.f9826u;
                                    int i5 = 0;
                                    abstractC1073n3 = abstractC1073n3;
                                    r2 = r2;
                                    while (nVar7 != null) {
                                        if ((nVar7.f3980i & 32768) != 0) {
                                            i5++;
                                            r2 = r2;
                                            if (i5 == 1) {
                                                abstractC1073n3 = nVar7;
                                            } else {
                                                if (r2 == 0) {
                                                    r2 = new I.d(new S.n[16]);
                                                }
                                                if (abstractC1073n3 != 0) {
                                                    r2.b(abstractC1073n3);
                                                    abstractC1073n3 = 0;
                                                }
                                                r2.b(nVar7);
                                            }
                                        }
                                        nVar7 = nVar7.f3983l;
                                        abstractC1073n3 = abstractC1073n3;
                                        r2 = r2;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC1073n3 = AbstractC1065f.f(r2);
                            }
                        }
                        if ((nVar5.f3981j & 32768) != 0) {
                            nVar5 = nVar5.f3983l;
                        }
                    }
                }
                break;
        }
        return Unit.f7487a;
    }
}
