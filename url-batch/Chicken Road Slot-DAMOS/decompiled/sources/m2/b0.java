package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6435a = z4.v.c(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f6436b = z4.v.c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f6437c = k1.p.f5340f;

    /* renamed from: d, reason: collision with root package name */
    public static final w2.o f6438d;

    static {
        long j = k1.p.f5336b;
        f6438d = j != 16 ? new w2.c(j) : w2.n.f10048a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00b6, code lost:
    
        if (r15.equals(r24.f6429i) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00c5, code lost:
    
        if (r39.equals(r24.j) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00d4, code lost:
    
        if (r40.equals(r24.f6430k) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a0 a(a0 a0Var, long j, k1.v vVar, float f3, long j3, p2.s sVar, p2.o oVar, p2.p pVar, p2.i iVar, String str, long j10, w2.a aVar, w2.p pVar2, s2.b bVar, long j11, w2.l lVar, k1.e0 e0Var, m1.c cVar) {
        w2.a aVar2;
        long j12;
        k1.e0 e0Var2;
        m1.c cVar2;
        w2.o cVar3;
        w2.o oVar2;
        boolean z10;
        p2.o oVar3 = oVar;
        p2.p pVar3 = pVar;
        p2.i iVar2 = iVar;
        String str2 = str;
        long j13 = j10;
        x2.o[] oVarArr = x2.n.f10334b;
        long j14 = j3 & 1095216660480L;
        if ((j14 == 0 || x2.n.a(j3, a0Var.f6423b)) && ((vVar != null || j == 16 || k1.p.c(j, a0Var.f6422a.b())) && ((oVar3 == null || oVar3.equals(a0Var.f6425d)) && ((sVar == null || sVar.equals(a0Var.f6424c)) && ((iVar2 == null || iVar2 == a0Var.f6427f) && (((j13 & 1095216660480L) == 0 || x2.n.a(j13, a0Var.f6428h)) && ((lVar == null || lVar.equals(a0Var.f6432m)) && Intrinsics.a(vVar, a0Var.f6422a.c()) && ((vVar == null || f3 == a0Var.f6422a.a()) && ((pVar3 == null || pVar3.equals(a0Var.f6426e)) && (str2 == null || str2.equals(a0Var.g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
            }
            if (pVar2 == null) {
            }
            if (bVar == null) {
            }
            j12 = j11;
            if (j12 == 16 || k1.p.c(j12, a0Var.f6431l)) {
                e0Var2 = e0Var;
                if (e0Var2 == null || e0Var2.equals(a0Var.f6433n)) {
                    cVar2 = cVar;
                    if (cVar2 == null || cVar2.equals(a0Var.f6434o)) {
                        return a0Var;
                    }
                    w2.n nVar = w2.n.f10048a;
                    if (vVar != null) {
                        if (j != 16) {
                            cVar3 = new w2.c(j);
                        }
                        cVar3 = nVar;
                    } else if (vVar instanceof k1.h0) {
                        long A = k7.e.A(((k1.h0) vVar).f5325f, f3);
                        if (A != 16) {
                            cVar3 = new w2.c(A);
                        }
                        cVar3 = nVar;
                    } else {
                        if (!(vVar instanceof k1.m)) {
                            a2.r.p();
                            return null;
                        }
                        cVar3 = new w2.b((k1.m) vVar, f3);
                    }
                    oVar2 = a0Var.f6422a;
                    oVar2.getClass();
                    z10 = cVar3 instanceof w2.b;
                    if (!z10 && (oVar2 instanceof w2.b)) {
                        w2.b bVar2 = (w2.b) cVar3;
                        k1.m mVar = bVar2.f10024a;
                        float f10 = bVar2.f10025b;
                        if (Float.isNaN(f10)) {
                            f10 = ((w2.b) oVar2).f10025b;
                        }
                        cVar3 = new w2.b(mVar, f10);
                    } else if ((z10 || (oVar2 instanceof w2.b)) && ((!z10 && (oVar2 instanceof w2.b)) || cVar3.equals(nVar))) {
                        cVar3 = oVar2;
                    }
                    if (iVar2 == null) {
                        iVar2 = a0Var.f6427f;
                    }
                    long j15 = j14 != 0 ? a0Var.f6423b : j3;
                    p2.s sVar2 = sVar != null ? a0Var.f6424c : sVar;
                    if (oVar3 == null) {
                        oVar3 = a0Var.f6425d;
                    }
                    if (pVar3 == null) {
                        pVar3 = a0Var.f6426e;
                    }
                    if (str2 == null) {
                        str2 = a0Var.g;
                    }
                    if ((j13 & 1095216660480L) == 0) {
                        j13 = a0Var.f6428h;
                    }
                    if (aVar2 == null) {
                        aVar2 = a0Var.f6429i;
                    }
                    long j16 = j15;
                    w2.p pVar4 = pVar2 != null ? a0Var.j : pVar2;
                    s2.b bVar3 = bVar != null ? a0Var.f6430k : bVar;
                    if (j12 == 16) {
                        j12 = a0Var.f6431l;
                    }
                    w2.p pVar5 = pVar4;
                    w2.l lVar2 = lVar != null ? a0Var.f6432m : lVar;
                    if (e0Var2 == null) {
                        e0Var2 = a0Var.f6433n;
                    }
                    return new a0(cVar3, j16, sVar2, oVar3, pVar3, iVar2, str2, j13, aVar2, pVar5, bVar3, j12, lVar2, e0Var2, cVar2 != null ? a0Var.f6434o : cVar2);
                }
                cVar2 = cVar;
                w2.n nVar2 = w2.n.f10048a;
                if (vVar != null) {
                }
                oVar2 = a0Var.f6422a;
                oVar2.getClass();
                z10 = cVar3 instanceof w2.b;
                if (!z10) {
                }
                if (z10) {
                }
                cVar3 = oVar2;
                if (iVar2 == null) {
                }
                if (j14 != 0) {
                }
                if (sVar != null) {
                }
                if (oVar3 == null) {
                }
                if (pVar3 == null) {
                }
                if (str2 == null) {
                }
                if ((j13 & 1095216660480L) == 0) {
                }
                if (aVar2 == null) {
                }
                long j162 = j15;
                if (pVar2 != null) {
                }
                if (bVar != null) {
                }
                if (j12 == 16) {
                }
                w2.p pVar52 = pVar4;
                if (lVar != null) {
                }
                if (e0Var2 == null) {
                }
                return new a0(cVar3, j162, sVar2, oVar3, pVar3, iVar2, str2, j13, aVar2, pVar52, bVar3, j12, lVar2, e0Var2, cVar2 != null ? a0Var.f6434o : cVar2);
            }
            e0Var2 = e0Var;
            cVar2 = cVar;
            w2.n nVar22 = w2.n.f10048a;
            if (vVar != null) {
            }
            oVar2 = a0Var.f6422a;
            oVar2.getClass();
            z10 = cVar3 instanceof w2.b;
            if (!z10) {
            }
            if (z10) {
            }
            cVar3 = oVar2;
            if (iVar2 == null) {
            }
            if (j14 != 0) {
            }
            if (sVar != null) {
            }
            if (oVar3 == null) {
            }
            if (pVar3 == null) {
            }
            if (str2 == null) {
            }
            if ((j13 & 1095216660480L) == 0) {
            }
            if (aVar2 == null) {
            }
            long j1622 = j15;
            if (pVar2 != null) {
            }
            if (bVar != null) {
            }
            if (j12 == 16) {
            }
            w2.p pVar522 = pVar4;
            if (lVar != null) {
            }
            if (e0Var2 == null) {
            }
            return new a0(cVar3, j1622, sVar2, oVar3, pVar3, iVar2, str2, j13, aVar2, pVar522, bVar3, j12, lVar2, e0Var2, cVar2 != null ? a0Var.f6434o : cVar2);
        }
        aVar2 = aVar;
        j12 = j11;
        e0Var2 = e0Var;
        cVar2 = cVar;
        w2.n nVar222 = w2.n.f10048a;
        if (vVar != null) {
        }
        oVar2 = a0Var.f6422a;
        oVar2.getClass();
        z10 = cVar3 instanceof w2.b;
        if (!z10) {
        }
        if (z10) {
        }
        cVar3 = oVar2;
        if (iVar2 == null) {
        }
        if (j14 != 0) {
        }
        if (sVar != null) {
        }
        if (oVar3 == null) {
        }
        if (pVar3 == null) {
        }
        if (str2 == null) {
        }
        if ((j13 & 1095216660480L) == 0) {
        }
        if (aVar2 == null) {
        }
        long j16222 = j15;
        if (pVar2 != null) {
        }
        if (bVar != null) {
        }
        if (j12 == 16) {
        }
        w2.p pVar5222 = pVar4;
        if (lVar != null) {
        }
        if (e0Var2 == null) {
        }
        return new a0(cVar3, j16222, sVar2, oVar3, pVar3, iVar2, str2, j13, aVar2, pVar5222, bVar3, j12, lVar2, e0Var2, cVar2 != null ? a0Var.f6434o : cVar2);
    }
}
