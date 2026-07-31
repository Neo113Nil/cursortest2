package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t2 implements j4 {

    /* renamed from: a, reason: collision with root package name */
    private final List<c0> f12055a = e73.w();

    public t2(int i7) {
    }

    private final y3 b(i4 i4Var) {
        return new y3(d(i4Var));
    }

    private final n4 c(i4 i4Var) {
        return new n4(d(i4Var));
    }

    private final List<c0> d(i4 i4Var) {
        String str;
        int i7;
        List<byte[]> list;
        dr2 dr2Var = new dr2(i4Var.f6530d);
        List<c0> list2 = this.f12055a;
        while (dr2Var.i() > 0) {
            int s7 = dr2Var.s();
            int k7 = dr2Var.k() + dr2Var.s();
            if (s7 == 134) {
                list2 = new ArrayList<>();
                int s8 = dr2Var.s() & 31;
                for (int i8 = 0; i8 < s8; i8++) {
                    String F = dr2Var.F(3, c43.f3729c);
                    int s9 = dr2Var.s();
                    int i9 = s9 & 128;
                    if (i9 != 0) {
                        i7 = s9 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte s10 = (byte) dr2Var.s();
                    dr2Var.g(1);
                    if (i9 != 0) {
                        int i10 = zw1.f15278c;
                        list = Collections.singletonList((s10 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    bf4 bf4Var = new bf4();
                    bf4Var.s(str);
                    bf4Var.k(F);
                    bf4Var.c0(i7);
                    bf4Var.i(list);
                    list2.add(bf4Var.y());
                }
            }
            dr2Var.f(k7);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.j4
    public final l4 a(int i7, i4 i4Var) {
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                return new o3(new l3(i4Var.f6528b));
            }
            if (i7 == 21) {
                return new o3(new j3());
            }
            if (i7 == 27) {
                return new o3(new g3(b(i4Var), false, false));
            }
            if (i7 == 36) {
                return new o3(new i3(b(i4Var)));
            }
            if (i7 == 89) {
                return new o3(new v2(i4Var.f6529c));
            }
            if (i7 == 138) {
                return new o3(new u2(i4Var.f6528b));
            }
            if (i7 == 172) {
                return new o3(new p2(i4Var.f6528b));
            }
            if (i7 == 257) {
                return new x3(new n3("application/vnd.dvb.ait"));
            }
            if (i7 != 128) {
                if (i7 != 129) {
                    if (i7 == 134) {
                        return new x3(new n3("application/x-scte35"));
                    }
                    if (i7 != 135) {
                        switch (i7) {
                            case 15:
                                return new o3(new s2(false, i4Var.f6528b));
                            case 16:
                                return new o3(new b3(c(i4Var)));
                            case 17:
                                return new o3(new k3(i4Var.f6528b));
                            default:
                                return null;
                        }
                    }
                }
                return new o3(new m2(i4Var.f6528b));
            }
        }
        return new o3(new y2(c(i4Var)));
    }
}
