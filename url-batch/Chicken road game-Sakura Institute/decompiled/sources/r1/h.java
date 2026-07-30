package r1;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.n2;
import s1.l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final h f7772h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f7773i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f7774j;

    /* renamed from: k, reason: collision with root package name */
    public static final h f7775k;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7776g;

    static {
        int i7 = 2;
        f7772h = new h(i7, 0);
        f7773i = new h(i7, 1);
        f7774j = new h(i7, 2);
        f7775k = new h(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i8) {
        super(i7);
        this.f7776g = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f7776g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                ((j) obj).getClass();
                break;
            case 1:
                ((d0) ((j) obj)).Y((p1.f0) obj2);
                break;
            case 2:
                ((d0) ((j) obj)).Z((s0.o) obj2);
                break;
            default:
                g0.x xVar = (g0.x) obj2;
                d0 d0Var = (d0) ((j) obj);
                d0Var.f7738y = xVar;
                n2 n2Var = s1.f1.f8217f;
                o0.d dVar = (o0.d) xVar;
                dVar.getClass();
                d0Var.W((m2.b) g0.d.K(dVar, n2Var));
                m2.k kVar = (m2.k) g0.d.K(dVar, s1.f1.f8223l);
                if (d0Var.f7736w != kVar) {
                    d0Var.f7736w = kVar;
                    d0Var.B();
                    d0 s5 = d0Var.s();
                    if (s5 != null) {
                        s5.y();
                    }
                    d0Var.A();
                    s0.n nVar = (s0.n) d0Var.A.f3895f;
                    if ((nVar.f8107i & 4) != 0) {
                        while (nVar != null) {
                            if ((nVar.f8106h & 4) != 0) {
                                m mVar = nVar;
                                ?? r32 = 0;
                                while (mVar != 0) {
                                    if (mVar instanceof o) {
                                        o oVar = (o) mVar;
                                        if (oVar instanceof w0.b) {
                                            ((w0.b) oVar).A0();
                                        }
                                    } else if ((mVar.f8106h & 4) != 0 && (mVar instanceof m)) {
                                        s0.n nVar2 = mVar.f7853t;
                                        int i7 = 0;
                                        mVar = mVar;
                                        r32 = r32;
                                        while (nVar2 != null) {
                                            if ((nVar2.f8106h & 4) != 0) {
                                                i7++;
                                                r32 = r32;
                                                if (i7 == 1) {
                                                    mVar = nVar2;
                                                } else {
                                                    if (r32 == 0) {
                                                        r32 = new i0.d(new s0.n[16]);
                                                    }
                                                    if (mVar != 0) {
                                                        r32.b(mVar);
                                                        mVar = 0;
                                                    }
                                                    r32.b(nVar2);
                                                }
                                            }
                                            nVar2 = nVar2.f8109k;
                                            mVar = mVar;
                                            r32 = r32;
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    mVar = f.f(r32);
                                }
                            }
                            if ((nVar.f8107i & 4) != 0) {
                                nVar = nVar.f8109k;
                            }
                        }
                    }
                }
                l2 l2Var = (l2) g0.d.K(dVar, s1.f1.f8228q);
                if (!r6.k.a(d0Var.f7737x, l2Var)) {
                    d0Var.f7737x = l2Var;
                    s0.n nVar3 = (s0.n) d0Var.A.f3895f;
                    if ((nVar3.f8107i & 16) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f8106h & 16) != 0) {
                                m mVar2 = nVar3;
                                ?? r33 = 0;
                                while (mVar2 != 0) {
                                    if (mVar2 instanceof l1) {
                                        ((l1) mVar2).W();
                                    } else if ((mVar2.f8106h & 16) != 0 && (mVar2 instanceof m)) {
                                        s0.n nVar4 = mVar2.f7853t;
                                        int i8 = 0;
                                        mVar2 = mVar2;
                                        r33 = r33;
                                        while (nVar4 != null) {
                                            if ((nVar4.f8106h & 16) != 0) {
                                                i8++;
                                                r33 = r33;
                                                if (i8 == 1) {
                                                    mVar2 = nVar4;
                                                } else {
                                                    if (r33 == 0) {
                                                        r33 = new i0.d(new s0.n[16]);
                                                    }
                                                    if (mVar2 != 0) {
                                                        r33.b(mVar2);
                                                        mVar2 = 0;
                                                    }
                                                    r33.b(nVar4);
                                                }
                                            }
                                            nVar4 = nVar4.f8109k;
                                            mVar2 = mVar2;
                                            r33 = r33;
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    mVar2 = f.f(r33);
                                }
                            }
                            if ((nVar3.f8107i & 16) != 0) {
                                nVar3 = nVar3.f8109k;
                            }
                        }
                    }
                }
                s0.n nVar5 = (s0.n) d0Var.A.f3895f;
                if ((nVar5.f8107i & 32768) != 0) {
                    while (nVar5 != null) {
                        if ((nVar5.f8106h & 32768) != 0) {
                            m mVar3 = nVar5;
                            ?? r22 = 0;
                            while (mVar3 != 0) {
                                if (mVar3 instanceof k) {
                                    s0.n nVar6 = ((s0.n) ((k) mVar3)).f8104f;
                                    if (nVar6.f8116r) {
                                        b1.d(nVar6);
                                    } else {
                                        nVar6.f8113o = true;
                                    }
                                } else if ((mVar3.f8106h & 32768) != 0 && (mVar3 instanceof m)) {
                                    s0.n nVar7 = mVar3.f7853t;
                                    int i9 = 0;
                                    mVar3 = mVar3;
                                    r22 = r22;
                                    while (nVar7 != null) {
                                        if ((nVar7.f8106h & 32768) != 0) {
                                            i9++;
                                            r22 = r22;
                                            if (i9 == 1) {
                                                mVar3 = nVar7;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new i0.d(new s0.n[16]);
                                                }
                                                if (mVar3 != 0) {
                                                    r22.b(mVar3);
                                                    mVar3 = 0;
                                                }
                                                r22.b(nVar7);
                                            }
                                        }
                                        nVar7 = nVar7.f8109k;
                                        mVar3 = mVar3;
                                        r22 = r22;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                mVar3 = f.f(r22);
                            }
                        }
                        if ((nVar5.f8107i & 32768) != 0) {
                            nVar5 = nVar5.f8109k;
                        }
                    }
                }
                break;
        }
        return d6.z.f2639a;
    }
}
