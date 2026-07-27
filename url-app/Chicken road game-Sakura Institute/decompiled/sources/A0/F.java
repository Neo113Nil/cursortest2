package A0;

import Z.AbstractC0319p;
import Z.C0323u;
import Z.O;
import Z.S;
import b0.AbstractC0497e;
import kotlin.jvm.internal.Intrinsics;
import y2.C1338m;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final long f273a = u3.l.k0(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f274b = u3.l.k0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f275c = C0323u.f4546f;

    /* renamed from: d, reason: collision with root package name */
    public static final L0.n f276d;

    static {
        long j4 = C0323u.f4542b;
        f276d = j4 != 16 ? new L0.c(j4) : L0.l.f3515a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x005d, code lost:
    
        if (r26.equals(r19.f258c) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0063, code lost:
    
        if (r29 != r19.f261f) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0073, code lost:
    
        if (M0.m.a(r31, r19.f263h) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (M0.m.a(r24, r19.f257b) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0049, code lost:
    
        if (Z.C0323u.c(r20, r19.f256a.b()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0053, code lost:
    
        if (r27.equals(r19.f259d) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final D a(D d4, long j4, AbstractC0319p abstractC0319p, float f4, long j5, F0.k kVar, F0.i iVar, F0.j jVar, F0.r rVar, String str, long j6, L0.a aVar, L0.o oVar, H0.b bVar, long j7, L0.j jVar2, O o4, x xVar, AbstractC0497e abstractC0497e) {
        L0.o oVar2;
        long j8;
        L0.l lVar;
        L0.n cVar;
        L0.n nVar;
        boolean z4;
        x xVar2;
        String str2 = str;
        L0.a aVar2 = aVar;
        if (u3.l.m0(j5)) {
        }
        if (abstractC0319p == null) {
            if (j4 != 16) {
            }
        }
        if (iVar != null) {
        }
        if (kVar != null) {
        }
        if (rVar != null) {
        }
        if (u3.l.m0(j6)) {
        }
        if ((jVar2 == null || jVar2.equals(d4.f268m)) && Intrinsics.a(abstractC0319p, d4.f256a.c()) && ((abstractC0319p == null || f4 == d4.f256a.a()) && ((jVar == null || jVar.equals(d4.f260e)) && ((str2 == null || str2.equals(d4.f262g)) && (aVar2 == null || aVar2.equals(d4.f264i)))))) {
            oVar2 = oVar;
            if ((oVar2 == null || oVar2.equals(d4.f265j)) && (bVar == null || bVar.equals(d4.f266k))) {
                j8 = j7;
                if ((j8 == 16 || C0323u.c(j8, d4.f267l)) && ((o4 == null || o4.equals(d4.f269n)) && (xVar == null || xVar.equals(d4.f270o)))) {
                    if (abstractC0497e == null || abstractC0497e.equals(d4.f271p)) {
                        return d4;
                    }
                    lVar = L0.l.f3515a;
                    if (abstractC0319p != null) {
                        if (j4 != 16) {
                            cVar = new L0.c(j4);
                        }
                        cVar = lVar;
                    } else if (abstractC0319p instanceof S) {
                        long P3 = u3.d.P(f4, ((S) abstractC0319p).f4508a);
                        if (P3 != 16) {
                            cVar = new L0.c(P3);
                        }
                        cVar = lVar;
                    } else {
                        if (!(abstractC0319p instanceof Z.N)) {
                            throw new C1338m();
                        }
                        cVar = new L0.b((Z.N) abstractC0319p, f4);
                    }
                    nVar = d4.f256a;
                    nVar.getClass();
                    z4 = cVar instanceof L0.b;
                    if (!z4 && (nVar instanceof L0.b)) {
                        L0.b bVar2 = (L0.b) cVar;
                        L0.m mVar = new L0.m(nVar, 0);
                        float f5 = ((L0.b) cVar).f3495b;
                        if (Float.isNaN(f5)) {
                            f5 = ((Number) mVar.invoke()).floatValue();
                        }
                        cVar = new L0.b(bVar2.f3494a, f5);
                    } else if (z4 || (nVar instanceof L0.b)) {
                        if (z4 && (nVar instanceof L0.b)) {
                            cVar = nVar;
                        } else {
                            L0.m mVar2 = new L0.m(nVar, 1);
                            if (cVar.equals(lVar)) {
                                cVar = (L0.n) mVar2.invoke();
                            }
                        }
                    }
                    F0.r rVar2 = rVar != null ? d4.f261f : rVar;
                    long j9 = u3.l.m0(j5) ? j5 : d4.f257b;
                    F0.k kVar2 = kVar != null ? d4.f258c : kVar;
                    F0.i iVar2 = iVar != null ? d4.f259d : iVar;
                    F0.j jVar3 = jVar != null ? d4.f260e : jVar;
                    if (str2 == null) {
                        str2 = d4.f262g;
                    }
                    long j10 = u3.l.m0(j6) ? j6 : d4.f263h;
                    if (aVar2 == null) {
                        aVar2 = d4.f264i;
                    }
                    if (oVar2 == null) {
                        oVar2 = d4.f265j;
                    }
                    H0.b bVar3 = bVar != null ? d4.f266k : bVar;
                    if (j8 == 16) {
                        j8 = d4.f267l;
                    }
                    long j11 = j8;
                    L0.j jVar4 = jVar2 != null ? d4.f268m : jVar2;
                    O o5 = o4 != null ? d4.f269n : o4;
                    xVar2 = d4.f270o;
                    if (xVar2 == null) {
                        xVar2 = xVar;
                    }
                    return new D(cVar, j9, kVar2, iVar2, jVar3, rVar2, str2, j10, aVar2, oVar2, bVar3, j11, jVar4, o5, xVar2, abstractC0497e != null ? d4.f271p : abstractC0497e);
                }
                lVar = L0.l.f3515a;
                if (abstractC0319p != null) {
                }
                nVar = d4.f256a;
                nVar.getClass();
                z4 = cVar instanceof L0.b;
                if (!z4) {
                }
                if (z4) {
                }
                if (z4) {
                }
                L0.m mVar22 = new L0.m(nVar, 1);
                if (cVar.equals(lVar)) {
                }
                if (rVar != null) {
                }
                if (u3.l.m0(j5)) {
                }
                if (kVar != null) {
                }
                if (iVar != null) {
                }
                if (jVar != null) {
                }
                if (str2 == null) {
                }
                if (u3.l.m0(j6)) {
                }
                if (aVar2 == null) {
                }
                if (oVar2 == null) {
                }
                if (bVar != null) {
                }
                if (j8 == 16) {
                }
                long j112 = j8;
                if (jVar2 != null) {
                }
                if (o4 != null) {
                }
                xVar2 = d4.f270o;
                if (xVar2 == null) {
                }
                return new D(cVar, j9, kVar2, iVar2, jVar3, rVar2, str2, j10, aVar2, oVar2, bVar3, j112, jVar4, o5, xVar2, abstractC0497e != null ? d4.f271p : abstractC0497e);
            }
            j8 = j7;
            lVar = L0.l.f3515a;
            if (abstractC0319p != null) {
            }
            nVar = d4.f256a;
            nVar.getClass();
            z4 = cVar instanceof L0.b;
            if (!z4) {
            }
            if (z4) {
            }
            if (z4) {
            }
            L0.m mVar222 = new L0.m(nVar, 1);
            if (cVar.equals(lVar)) {
            }
            if (rVar != null) {
            }
            if (u3.l.m0(j5)) {
            }
            if (kVar != null) {
            }
            if (iVar != null) {
            }
            if (jVar != null) {
            }
            if (str2 == null) {
            }
            if (u3.l.m0(j6)) {
            }
            if (aVar2 == null) {
            }
            if (oVar2 == null) {
            }
            if (bVar != null) {
            }
            if (j8 == 16) {
            }
            long j1122 = j8;
            if (jVar2 != null) {
            }
            if (o4 != null) {
            }
            xVar2 = d4.f270o;
            if (xVar2 == null) {
            }
            return new D(cVar, j9, kVar2, iVar2, jVar3, rVar2, str2, j10, aVar2, oVar2, bVar3, j1122, jVar4, o5, xVar2, abstractC0497e != null ? d4.f271p : abstractC0497e);
        }
        oVar2 = oVar;
        j8 = j7;
        lVar = L0.l.f3515a;
        if (abstractC0319p != null) {
        }
        nVar = d4.f256a;
        nVar.getClass();
        z4 = cVar instanceof L0.b;
        if (!z4) {
        }
        if (z4) {
        }
        if (z4) {
        }
        L0.m mVar2222 = new L0.m(nVar, 1);
        if (cVar.equals(lVar)) {
        }
        if (rVar != null) {
        }
        if (u3.l.m0(j5)) {
        }
        if (kVar != null) {
        }
        if (iVar != null) {
        }
        if (jVar != null) {
        }
        if (str2 == null) {
        }
        if (u3.l.m0(j6)) {
        }
        if (aVar2 == null) {
        }
        if (oVar2 == null) {
        }
        if (bVar != null) {
        }
        if (j8 == 16) {
        }
        long j11222 = j8;
        if (jVar2 != null) {
        }
        if (o4 != null) {
        }
        xVar2 = d4.f270o;
        if (xVar2 == null) {
        }
        return new D(cVar, j9, kVar2, iVar2, jVar3, rVar2, str2, j10, aVar2, oVar2, bVar3, j11222, jVar4, o5, xVar2, abstractC0497e != null ? d4.f271p : abstractC0497e);
    }

    public static final Object b(Object obj, Object obj2, float f4) {
        return ((double) f4) < 0.5d ? obj : obj2;
    }

    public static final long c(long j4, long j5, float f4) {
        if (u3.l.m0(j4) || u3.l.m0(j5)) {
            return ((M0.m) b(new M0.m(j4), new M0.m(j5), f4)).f3561a;
        }
        if (u3.l.m0(j4) || u3.l.m0(j5)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (M0.n.a(M0.m.b(j4), M0.m.b(j5))) {
            return u3.l.p0(u3.d.N(M0.m.c(j4), M0.m.c(j5), f4), 1095216660480L & j4);
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) M0.n.b(M0.m.b(j4))) + " and " + ((Object) M0.n.b(M0.m.b(j5)))).toString());
    }
}
