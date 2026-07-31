package B0;

import a.AbstractC0157a;
import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0265P;
import b0.C0284q;
import b0.C0288u;
import d0.AbstractC0322c;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final long f380a = AbstractC0157a.I(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f381b = AbstractC0157a.I(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f382c = C0288u.f4295e;

    /* renamed from: d, reason: collision with root package name */
    public static final L0.j f383d;

    static {
        long j3 = C0288u.f4292b;
        f383d = j3 != 16 ? new L0.c(j3) : L0.i.f2686a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0073, code lost:
    
        if (M0.l.a(r31, r19.f372h) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (M0.l.a(r24, r19.f366b) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0049, code lost:
    
        if (b0.C0288u.c(r20, r19.f365a.b()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0053, code lost:
    
        if (r27.equals(r19.f368d) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x005d, code lost:
    
        if (r26.equals(r19.f367c) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0063, code lost:
    
        if (r29 != r19.f370f) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w a(w wVar, long j3, AbstractC0259J abstractC0259J, float f3, long j4, F0.l lVar, F0.j jVar, F0.k kVar, F0.r rVar, String str, long j5, L0.a aVar, L0.k kVar2, H0.b bVar, long j6, L0.g gVar, C0262M c0262m, AbstractC0322c abstractC0322c) {
        L0.k kVar3;
        long j7;
        AbstractC0322c abstractC0322c2;
        L0.j cVar;
        L0.j jVar2;
        boolean z3;
        L0.a aVar2 = aVar;
        if (AbstractC0157a.L(j4)) {
        }
        if (abstractC0259J == null) {
            if (j3 != 16) {
            }
        }
        if (jVar != null) {
        }
        if (lVar != null) {
        }
        if (rVar != null) {
        }
        if (AbstractC0157a.L(j5)) {
        }
        if ((gVar == null || gVar.equals(wVar.f377m)) && Z1.i.a(abstractC0259J, wVar.f365a.c()) && ((abstractC0259J == null || f3 == wVar.f365a.a()) && ((kVar == null || kVar.equals(wVar.f369e)) && ((str == null || str.equals(wVar.f371g)) && (aVar2 == null || aVar2.equals(wVar.f373i)))))) {
            kVar3 = kVar2;
            if ((kVar3 == null || kVar3.equals(wVar.f374j)) && (bVar == null || bVar.equals(wVar.f375k))) {
                j7 = j6;
                if ((j7 == 16 || C0288u.c(j7, wVar.f376l)) && (c0262m == null || c0262m.equals(wVar.f378n))) {
                    abstractC0322c2 = abstractC0322c;
                    if (abstractC0322c2 == null || abstractC0322c2.equals(wVar.f379o)) {
                        return wVar;
                    }
                    L0.i iVar = L0.i.f2686a;
                    if (abstractC0259J != null) {
                        if (j3 != 16) {
                            cVar = new L0.c(j3);
                        }
                        cVar = iVar;
                    } else if (abstractC0259J instanceof C0265P) {
                        long I3 = I2.l.I(((C0265P) abstractC0259J).f4257e, f3);
                        if (I3 != 16) {
                            cVar = new L0.c(I3);
                        }
                        cVar = iVar;
                    } else {
                        if (!(abstractC0259J instanceof C0284q)) {
                            throw new L1.f();
                        }
                        cVar = new L0.b((C0284q) abstractC0259J, f3);
                    }
                    jVar2 = wVar.f365a;
                    jVar2.getClass();
                    z3 = cVar instanceof L0.b;
                    if (!z3 && (jVar2 instanceof L0.b)) {
                        L0.b bVar2 = (L0.b) cVar;
                        float f4 = ((L0.b) cVar).f2673b;
                        if (Float.isNaN(f4)) {
                            f4 = jVar2.a();
                        }
                        cVar = new L0.b(bVar2.f2672a, f4);
                    } else if ((z3 || (jVar2 instanceof L0.b)) && ((!z3 && (jVar2 instanceof L0.b)) || cVar.equals(iVar))) {
                        cVar = jVar2;
                    }
                    F0.r rVar2 = rVar != null ? wVar.f370f : rVar;
                    long j8 = AbstractC0157a.L(j4) ? j4 : wVar.f366b;
                    F0.l lVar2 = lVar != null ? wVar.f367c : lVar;
                    F0.j jVar3 = jVar != null ? wVar.f368d : jVar;
                    F0.k kVar4 = kVar != null ? wVar.f369e : kVar;
                    String str2 = str != null ? wVar.f371g : str;
                    long j9 = AbstractC0157a.L(j5) ? j5 : wVar.f372h;
                    if (aVar2 == null) {
                        aVar2 = wVar.f373i;
                    }
                    if (kVar3 == null) {
                        kVar3 = wVar.f374j;
                    }
                    H0.b bVar3 = bVar != null ? wVar.f375k : bVar;
                    if (j7 == 16) {
                        j7 = wVar.f376l;
                    }
                    long j10 = j7;
                    L0.g gVar2 = gVar != null ? wVar.f377m : gVar;
                    C0262M c0262m2 = c0262m != null ? wVar.f378n : c0262m;
                    if (abstractC0322c2 == null) {
                        abstractC0322c2 = wVar.f379o;
                    }
                    return new w(cVar, j8, lVar2, jVar3, kVar4, rVar2, str2, j9, aVar2, kVar3, bVar3, j10, gVar2, c0262m2, abstractC0322c2);
                }
                abstractC0322c2 = abstractC0322c;
                L0.i iVar2 = L0.i.f2686a;
                if (abstractC0259J != null) {
                }
                jVar2 = wVar.f365a;
                jVar2.getClass();
                z3 = cVar instanceof L0.b;
                if (!z3) {
                }
                if (z3) {
                }
                cVar = jVar2;
                F0.r rVar22 = rVar != null ? wVar.f370f : rVar;
                if (AbstractC0157a.L(j4)) {
                }
                if (lVar != null) {
                }
                if (jVar != null) {
                }
                if (kVar != null) {
                }
                if (str != null) {
                }
                if (AbstractC0157a.L(j5)) {
                }
                if (aVar2 == null) {
                }
                if (kVar3 == null) {
                }
                if (bVar != null) {
                }
                if (j7 == 16) {
                }
                long j102 = j7;
                if (gVar != null) {
                }
                if (c0262m != null) {
                }
                if (abstractC0322c2 == null) {
                }
                return new w(cVar, j8, lVar2, jVar3, kVar4, rVar22, str2, j9, aVar2, kVar3, bVar3, j102, gVar2, c0262m2, abstractC0322c2);
            }
            j7 = j6;
            abstractC0322c2 = abstractC0322c;
            L0.i iVar22 = L0.i.f2686a;
            if (abstractC0259J != null) {
            }
            jVar2 = wVar.f365a;
            jVar2.getClass();
            z3 = cVar instanceof L0.b;
            if (!z3) {
            }
            if (z3) {
            }
            cVar = jVar2;
            F0.r rVar222 = rVar != null ? wVar.f370f : rVar;
            if (AbstractC0157a.L(j4)) {
            }
            if (lVar != null) {
            }
            if (jVar != null) {
            }
            if (kVar != null) {
            }
            if (str != null) {
            }
            if (AbstractC0157a.L(j5)) {
            }
            if (aVar2 == null) {
            }
            if (kVar3 == null) {
            }
            if (bVar != null) {
            }
            if (j7 == 16) {
            }
            long j1022 = j7;
            if (gVar != null) {
            }
            if (c0262m != null) {
            }
            if (abstractC0322c2 == null) {
            }
            return new w(cVar, j8, lVar2, jVar3, kVar4, rVar222, str2, j9, aVar2, kVar3, bVar3, j1022, gVar2, c0262m2, abstractC0322c2);
        }
        kVar3 = kVar2;
        j7 = j6;
        abstractC0322c2 = abstractC0322c;
        L0.i iVar222 = L0.i.f2686a;
        if (abstractC0259J != null) {
        }
        jVar2 = wVar.f365a;
        jVar2.getClass();
        z3 = cVar instanceof L0.b;
        if (!z3) {
        }
        if (z3) {
        }
        cVar = jVar2;
        F0.r rVar2222 = rVar != null ? wVar.f370f : rVar;
        if (AbstractC0157a.L(j4)) {
        }
        if (lVar != null) {
        }
        if (jVar != null) {
        }
        if (kVar != null) {
        }
        if (str != null) {
        }
        if (AbstractC0157a.L(j5)) {
        }
        if (aVar2 == null) {
        }
        if (kVar3 == null) {
        }
        if (bVar != null) {
        }
        if (j7 == 16) {
        }
        long j10222 = j7;
        if (gVar != null) {
        }
        if (c0262m != null) {
        }
        if (abstractC0322c2 == null) {
        }
        return new w(cVar, j8, lVar2, jVar3, kVar4, rVar2222, str2, j9, aVar2, kVar3, bVar3, j10222, gVar2, c0262m2, abstractC0322c2);
    }
}
