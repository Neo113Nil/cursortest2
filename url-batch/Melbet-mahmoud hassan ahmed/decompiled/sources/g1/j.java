package g1;

import android.util.SparseArray;
import g1.i0;
import java.util.ArrayList;
import java.util.List;
import r0.s1;

/* loaded from: classes.dex */
public final class j implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f16378a;

    /* renamed from: b, reason: collision with root package name */
    private final List<s1> f16379b;

    public j(int i7) {
        this(i7, m4.q.x());
    }

    public j(int i7, List<s1> list) {
        this.f16378a = i7;
        this.f16379b = list;
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<s1> e(i0.b bVar) {
        String str;
        int i7;
        if (f(32)) {
            return this.f16379b;
        }
        o2.a0 a0Var = new o2.a0(bVar.f16372d);
        List<s1> list = this.f16379b;
        while (a0Var.a() > 0) {
            int C = a0Var.C();
            int e7 = a0Var.e() + a0Var.C();
            if (C == 134) {
                list = new ArrayList<>();
                int C2 = a0Var.C() & 31;
                for (int i8 = 0; i8 < C2; i8++) {
                    String z6 = a0Var.z(3);
                    int C3 = a0Var.C();
                    boolean z7 = (C3 & 128) != 0;
                    if (z7) {
                        i7 = C3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte C4 = (byte) a0Var.C();
                    a0Var.P(1);
                    List<byte[]> list2 = null;
                    if (z7) {
                        list2 = o2.e.b((C4 & 64) != 0);
                    }
                    list.add(new s1.b().e0(str).V(z6).F(i7).T(list2).E());
                }
            }
            a0Var.O(e7);
        }
        return list;
    }

    private boolean f(int i7) {
        return (i7 & this.f16378a) != 0;
    }

    @Override // g1.i0.c
    public SparseArray<i0> a() {
        return new SparseArray<>();
    }

    @Override // g1.i0.c
    public i0 b(int i7, i0.b bVar) {
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                return new w(new t(bVar.f16370b));
            }
            if (i7 == 21) {
                return new w(new r());
            }
            if (i7 == 27) {
                if (f(4)) {
                    return null;
                }
                return new w(new p(c(bVar), f(1), f(8)));
            }
            if (i7 == 36) {
                return new w(new q(c(bVar)));
            }
            if (i7 == 89) {
                return new w(new l(bVar.f16371c));
            }
            if (i7 != 138) {
                if (i7 == 172) {
                    return new w(new f(bVar.f16370b));
                }
                if (i7 == 257) {
                    return new c0(new v("application/vnd.dvb.ait"));
                }
                if (i7 == 134) {
                    if (f(16)) {
                        return null;
                    }
                    return new c0(new v("application/x-scte35"));
                }
                if (i7 != 135) {
                    switch (i7) {
                        case 15:
                            if (!f(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!f(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i7) {
                                case 130:
                                    if (!f(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new w(new c(bVar.f16370b));
            }
            return new w(new k(bVar.f16370b));
        }
        return new w(new n(d(bVar)));
    }
}
