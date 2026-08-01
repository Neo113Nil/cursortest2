package j0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m2.h0;
import n0.i0;
import n0.p1;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.v f4804a = new n0.v(new a1.k(19));

    public static final void a(h0 h0Var, x0.d dVar, i0 i0Var, int i3) {
        i0Var.X(15327438);
        int i10 = (i0Var.f(h0Var) ? 4 : 2) | i3 | (i0Var.h(dVar) ? 32 : 16);
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            p1 p1Var = f4804a;
            h0 h0Var2 = (h0) i0Var.j(p1Var);
            h0Var2.getClass();
            if (h0Var != null && !h0Var.equals(h0.f6480d)) {
                h0Var2 = new h0(h0Var2.f6481a.c(h0Var.f6481a), h0Var2.f6482b.a(h0Var.f6482b));
            }
            n0.h.a(p1Var.a(h0Var2), dVar, i0Var, (i10 & 112) | 8);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new b0.u(i3, 2, h0Var, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005e  */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, d1.l lVar, final long j, long j3, p2.s sVar, long j10, w2.k kVar, long j11, int i3, boolean z10, int i10, int i11, h0 h0Var, i0 i0Var, final int i12, final int i13) {
        String str2;
        int i14;
        d1.l lVar2;
        int i15;
        p2.s sVar2;
        int i16;
        int i17;
        w2.k kVar2;
        h0 h0Var2;
        int i18;
        int i19;
        final long j12;
        final long j13;
        final int i20;
        final int i21;
        final p2.s sVar3;
        final d1.l lVar3;
        final w2.k kVar3;
        final h0 h0Var3;
        final long j14;
        final boolean z11;
        final int i22;
        s1 r9;
        d1.l lVar4;
        long j15;
        long j16;
        int i23;
        h0 h0Var4;
        boolean z12;
        int i24;
        long j17;
        long b10;
        d1.l lVar5;
        boolean z13;
        i0Var.X(1809465675);
        char c10 = 2;
        if ((i12 & 6) == 0) {
            str2 = str;
            i14 = (i0Var.f(str2) ? 4 : 2) | i12;
        } else {
            str2 = str;
            i14 = i12;
        }
        int i25 = i13 & 2;
        if (i25 != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            lVar2 = lVar;
            i14 |= i0Var.f(lVar2) ? 32 : 16;
            if ((i12 & 384) == 0) {
                i14 |= i0Var.e(j) ? 256 : 128;
            }
            int i26 = 224256 | i14;
            i15 = i13 & 64;
            if (i15 == 0) {
                i26 = 1797120 | i14;
            } else if ((1572864 & i12) == 0) {
                sVar2 = sVar;
                i26 |= i0Var.f(sVar2) ? 1048576 : 524288;
                i16 = i26 | 918552576;
                i17 = i13 & 1024;
                if (i17 != 0) {
                    c10 = 6;
                    kVar2 = kVar;
                } else {
                    kVar2 = kVar;
                    if (i0Var.f(kVar2)) {
                        c10 = 4;
                    }
                }
                int i27 = c10 | 28080;
                if ((i13 & 131072) == 0) {
                    h0Var2 = h0Var;
                    if (i0Var.f(h0Var2)) {
                        i18 = 8388608;
                        i19 = i27 | i18;
                        int i28 = 1;
                        if (i0Var.O(i16 & 1, (i16 & 306783379) == 306783378 || (4793491 & i19) != 4793490)) {
                            i0Var.R();
                            j12 = j3;
                            j13 = j11;
                            i20 = i3;
                            i21 = i11;
                            sVar3 = sVar2;
                            lVar3 = lVar2;
                            kVar3 = kVar2;
                            h0Var3 = h0Var2;
                            j14 = j10;
                            z11 = z10;
                            i22 = i10;
                        } else {
                            i0Var.T();
                            if ((i12 & 1) == 0 || i0Var.y()) {
                                lVar4 = i25 != 0 ? d1.i.f3304a : lVar2;
                                j15 = x2.n.f10335c;
                                if (i15 != 0) {
                                    sVar2 = null;
                                }
                                if (i17 != 0) {
                                    kVar2 = null;
                                }
                                if ((i13 & 131072) != 0) {
                                    j16 = j15;
                                    h0Var4 = (h0) i0Var.j(f4804a);
                                    i23 = Integer.MAX_VALUE;
                                } else {
                                    j16 = j15;
                                    i23 = Integer.MAX_VALUE;
                                    h0Var4 = h0Var2;
                                }
                                z12 = true;
                                i24 = 1;
                                j17 = j16;
                            } else {
                                i0Var.R();
                                j15 = j3;
                                j16 = j11;
                                i28 = i3;
                                i23 = i10;
                                i24 = i11;
                                lVar4 = lVar2;
                                h0Var4 = h0Var2;
                                j17 = j10;
                                z12 = z10;
                            }
                            i0Var.q();
                            i0Var.W(-565217106);
                            if (j != 16) {
                                lVar5 = lVar4;
                                b10 = j;
                                z13 = false;
                            } else {
                                i0Var.W(-565216333);
                                b10 = h0Var4.b();
                                if (b10 != 16) {
                                    lVar5 = lVar4;
                                } else {
                                    lVar5 = lVar4;
                                    b10 = ((k1.p) i0Var.j(d.f4803a)).f5342a;
                                }
                                z13 = false;
                                i0Var.p(false);
                            }
                            i0Var.p(z13);
                            long j18 = j17;
                            long j19 = j16;
                            h0 h0Var5 = h0Var4;
                            d1.l lVar6 = lVar5;
                            boolean z14 = z12;
                            int i29 = i23;
                            int i30 = i24;
                            a.a.a(str2, lVar6, h0.c(h0Var5, b10, j15, sVar2, j18, kVar2 != null ? kVar2.f10043a : z13, j19, 16609104), i28, z14, i29, i30, i0Var, (i16 & 126) | 14380032 | ((i16 << 18) & 1879048192));
                            j12 = j15;
                            sVar3 = sVar2;
                            h0Var3 = h0Var5;
                            i22 = i29;
                            j14 = j18;
                            kVar3 = kVar2;
                            i20 = i28;
                            j13 = j19;
                            z11 = z14;
                            i21 = i30;
                            lVar3 = lVar6;
                        }
                        r9 = i0Var.r();
                        if (r9 == null) {
                            r9.f6812d = new Function2() { // from class: j0.c0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int z15 = n0.h.z(i12 | 1);
                                    d0.b(str, lVar3, j, j12, sVar3, j14, kVar3, j13, i20, z11, i22, i21, h0Var3, (i0) obj, z15, i13);
                                    return Unit.f5554a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                } else {
                    h0Var2 = h0Var;
                }
                i18 = 4194304;
                i19 = i27 | i18;
                int i282 = 1;
                if (i0Var.O(i16 & 1, (i16 & 306783379) == 306783378 || (4793491 & i19) != 4793490)) {
                }
                r9 = i0Var.r();
                if (r9 == null) {
                }
            }
            sVar2 = sVar;
            i16 = i26 | 918552576;
            i17 = i13 & 1024;
            if (i17 != 0) {
            }
            int i272 = c10 | 28080;
            if ((i13 & 131072) == 0) {
            }
            i18 = 4194304;
            i19 = i272 | i18;
            int i2822 = 1;
            if (i0Var.O(i16 & 1, (i16 & 306783379) == 306783378 || (4793491 & i19) != 4793490)) {
            }
            r9 = i0Var.r();
            if (r9 == null) {
            }
        }
        lVar2 = lVar;
        if ((i12 & 384) == 0) {
        }
        int i262 = 224256 | i14;
        i15 = i13 & 64;
        if (i15 == 0) {
        }
        sVar2 = sVar;
        i16 = i262 | 918552576;
        i17 = i13 & 1024;
        if (i17 != 0) {
        }
        int i2722 = c10 | 28080;
        if ((i13 & 131072) == 0) {
        }
        i18 = 4194304;
        i19 = i2722 | i18;
        int i28222 = 1;
        if (i0Var.O(i16 & 1, (i16 & 306783379) == 306783378 || (4793491 & i19) != 4793490)) {
        }
        r9 = i0Var.r();
        if (r9 == null) {
        }
    }
}
