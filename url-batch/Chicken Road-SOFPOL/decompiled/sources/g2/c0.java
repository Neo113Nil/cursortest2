package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2921a = r2.o.Q(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f2922b = r2.o.Q(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2923c = f1.s.f2703g;

    /* renamed from: d, reason: collision with root package name */
    public static final q2.o f2924d;

    static {
        long j7 = f1.s.f2698b;
        f2924d = j7 != 16 ? new q2.c(j7) : q2.n.f6060a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00b6, code lost:
    
        if (r15.equals(r24.i) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00c5, code lost:
    
        if (r39.equals(r24.f2911j) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00d4, code lost:
    
        if (r40.equals(r24.f2912k) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b0 a(b0 b0Var, long j7, f1.p pVar, float f6, long j8, j2.k kVar, j2.i iVar, j2.j jVar, j2.p pVar2, String str, long j9, q2.a aVar, q2.p pVar3, m2.b bVar, long j10, q2.l lVar, f1.h0 h0Var, h1.c cVar) {
        q2.a aVar2;
        long j11;
        f1.h0 h0Var2;
        h1.c cVar2;
        q2.o cVar3;
        q2.o oVar;
        boolean z3;
        j2.i iVar2 = iVar;
        j2.j jVar2 = jVar;
        j2.p pVar4 = pVar2;
        String str2 = str;
        long j12 = j9;
        r2.p[] pVarArr = r2.n.f6533b;
        long j13 = j8 & 1095216660480L;
        if ((j13 == 0 || r2.n.a(j8, b0Var.f2904b)) && ((pVar != null || j7 == 16 || f1.s.c(j7, b0Var.f2903a.b())) && ((iVar2 == null || iVar2.equals(b0Var.f2906d)) && ((kVar == null || kVar.equals(b0Var.f2905c)) && ((pVar4 == null || pVar4 == b0Var.f2908f) && (((j12 & 1095216660480L) == 0 || r2.n.a(j12, b0Var.f2910h)) && ((lVar == null || lVar.equals(b0Var.f2914m)) && q6.i.a(pVar, b0Var.f2903a.c()) && ((pVar == null || f6 == b0Var.f2903a.a()) && ((jVar2 == null || jVar2.equals(b0Var.f2907e)) && (str2 == null || str2.equals(b0Var.f2909g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
            }
            if (pVar3 == null) {
            }
            if (bVar == null) {
            }
            j11 = j10;
            if (j11 == 16 || f1.s.c(j11, b0Var.f2913l)) {
                h0Var2 = h0Var;
                if (h0Var2 == null || h0Var2.equals(b0Var.f2915n)) {
                    cVar2 = cVar;
                    if (cVar2 == null || cVar2.equals(b0Var.f2916o)) {
                        return b0Var;
                    }
                    q2.n nVar = q2.n.f6060a;
                    if (pVar != null) {
                        if (j7 != 16) {
                            cVar3 = new q2.c(j7);
                        }
                        cVar3 = nVar;
                    } else if (pVar instanceof f1.k0) {
                        long O = h0.a.O(((f1.k0) pVar).f2682e, f6);
                        if (O != 16) {
                            cVar3 = new q2.c(O);
                        }
                        cVar3 = nVar;
                    } else {
                        if (!(pVar instanceof f1.b0)) {
                            throw new a5.c();
                        }
                        cVar3 = new q2.b((f1.b0) pVar, f6);
                    }
                    oVar = b0Var.f2903a;
                    oVar.getClass();
                    z3 = cVar3 instanceof q2.b;
                    if (!z3 && (oVar instanceof q2.b)) {
                        q2.b bVar2 = (q2.b) cVar3;
                        f1.b0 b0Var2 = bVar2.f6038a;
                        float f8 = bVar2.f6039b;
                        if (Float.isNaN(f8)) {
                            f8 = ((q2.b) oVar).f6039b;
                        }
                        cVar3 = new q2.b(b0Var2, f8);
                    } else if ((z3 || (oVar instanceof q2.b)) && ((!z3 && (oVar instanceof q2.b)) || cVar3.equals(nVar))) {
                        cVar3 = oVar;
                    }
                    if (pVar4 == null) {
                        pVar4 = b0Var.f2908f;
                    }
                    long j14 = j13 != 0 ? b0Var.f2904b : j8;
                    j2.k kVar2 = kVar != null ? b0Var.f2905c : kVar;
                    if (iVar2 == null) {
                        iVar2 = b0Var.f2906d;
                    }
                    if (jVar2 == null) {
                        jVar2 = b0Var.f2907e;
                    }
                    if (str2 == null) {
                        str2 = b0Var.f2909g;
                    }
                    if ((j12 & 1095216660480L) == 0) {
                        j12 = b0Var.f2910h;
                    }
                    if (aVar2 == null) {
                        aVar2 = b0Var.i;
                    }
                    long j15 = j14;
                    q2.p pVar5 = pVar3 != null ? b0Var.f2911j : pVar3;
                    m2.b bVar3 = bVar != null ? b0Var.f2912k : bVar;
                    if (j11 == 16) {
                        j11 = b0Var.f2913l;
                    }
                    q2.p pVar6 = pVar5;
                    q2.l lVar2 = lVar != null ? b0Var.f2914m : lVar;
                    if (h0Var2 == null) {
                        h0Var2 = b0Var.f2915n;
                    }
                    return new b0(cVar3, j15, kVar2, iVar2, jVar2, pVar4, str2, j12, aVar2, pVar6, bVar3, j11, lVar2, h0Var2, cVar2 != null ? b0Var.f2916o : cVar2);
                }
                cVar2 = cVar;
                q2.n nVar2 = q2.n.f6060a;
                if (pVar != null) {
                }
                oVar = b0Var.f2903a;
                oVar.getClass();
                z3 = cVar3 instanceof q2.b;
                if (!z3) {
                }
                if (z3) {
                }
                cVar3 = oVar;
                if (pVar4 == null) {
                }
                if (j13 != 0) {
                }
                if (kVar != null) {
                }
                if (iVar2 == null) {
                }
                if (jVar2 == null) {
                }
                if (str2 == null) {
                }
                if ((j12 & 1095216660480L) == 0) {
                }
                if (aVar2 == null) {
                }
                long j152 = j14;
                if (pVar3 != null) {
                }
                if (bVar != null) {
                }
                if (j11 == 16) {
                }
                q2.p pVar62 = pVar5;
                if (lVar != null) {
                }
                if (h0Var2 == null) {
                }
                return new b0(cVar3, j152, kVar2, iVar2, jVar2, pVar4, str2, j12, aVar2, pVar62, bVar3, j11, lVar2, h0Var2, cVar2 != null ? b0Var.f2916o : cVar2);
            }
            h0Var2 = h0Var;
            cVar2 = cVar;
            q2.n nVar22 = q2.n.f6060a;
            if (pVar != null) {
            }
            oVar = b0Var.f2903a;
            oVar.getClass();
            z3 = cVar3 instanceof q2.b;
            if (!z3) {
            }
            if (z3) {
            }
            cVar3 = oVar;
            if (pVar4 == null) {
            }
            if (j13 != 0) {
            }
            if (kVar != null) {
            }
            if (iVar2 == null) {
            }
            if (jVar2 == null) {
            }
            if (str2 == null) {
            }
            if ((j12 & 1095216660480L) == 0) {
            }
            if (aVar2 == null) {
            }
            long j1522 = j14;
            if (pVar3 != null) {
            }
            if (bVar != null) {
            }
            if (j11 == 16) {
            }
            q2.p pVar622 = pVar5;
            if (lVar != null) {
            }
            if (h0Var2 == null) {
            }
            return new b0(cVar3, j1522, kVar2, iVar2, jVar2, pVar4, str2, j12, aVar2, pVar622, bVar3, j11, lVar2, h0Var2, cVar2 != null ? b0Var.f2916o : cVar2);
        }
        aVar2 = aVar;
        j11 = j10;
        h0Var2 = h0Var;
        cVar2 = cVar;
        q2.n nVar222 = q2.n.f6060a;
        if (pVar != null) {
        }
        oVar = b0Var.f2903a;
        oVar.getClass();
        z3 = cVar3 instanceof q2.b;
        if (!z3) {
        }
        if (z3) {
        }
        cVar3 = oVar;
        if (pVar4 == null) {
        }
        if (j13 != 0) {
        }
        if (kVar != null) {
        }
        if (iVar2 == null) {
        }
        if (jVar2 == null) {
        }
        if (str2 == null) {
        }
        if ((j12 & 1095216660480L) == 0) {
        }
        if (aVar2 == null) {
        }
        long j15222 = j14;
        if (pVar3 != null) {
        }
        if (bVar != null) {
        }
        if (j11 == 16) {
        }
        q2.p pVar6222 = pVar5;
        if (lVar != null) {
        }
        if (h0Var2 == null) {
        }
        return new b0(cVar3, j15222, kVar2, iVar2, jVar2, pVar4, str2, j12, aVar2, pVar6222, bVar3, j11, lVar2, h0Var2, cVar2 != null ? b0Var.f2916o : cVar2);
    }
}
