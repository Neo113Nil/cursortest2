package k;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements p1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f5220a;

    public h(m mVar) {
        this.f5220a = mVar;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        p1.n0 n0Var;
        p1.n0 n0Var2;
        int i7;
        int i8;
        int i9;
        int size = list.size();
        p1.n0[] n0VarArr = new p1.n0[size];
        int size2 = list.size();
        long j9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            n0Var = null;
            if (i11 >= size2) {
                break;
            }
            p1.e0 e0Var = (p1.e0) list.get(i11);
            Object g9 = e0Var.g();
            j jVar = g9 instanceof j ? (j) g9 : null;
            if (jVar != null && ((Boolean) jVar.f5226a.getValue()).booleanValue()) {
                p1.n0 b9 = e0Var.b(j8);
                long G = j1.c.G(b9.f7063f, b9.f7064g);
                n0VarArr[i11] = b9;
                j9 = G;
            }
            i11++;
        }
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            p1.e0 e0Var2 = (p1.e0) list.get(i12);
            if (n0VarArr[i12] == null) {
                n0VarArr[i12] = e0Var2.b(j8);
            }
        }
        if (h0Var.v()) {
            i8 = (int) (j9 >> 32);
        } else {
            if (size == 0) {
                n0Var2 = null;
            } else {
                n0Var2 = n0VarArr[0];
                int i13 = size - 1;
                if (i13 != 0) {
                    int i14 = n0Var2 != null ? n0Var2.f7063f : 0;
                    w6.d dVar = new w6.d(1, i13, 1);
                    int i15 = dVar.f9522g;
                    int i16 = dVar.f9523h;
                    boolean z8 = i16 <= 0 ? 1 >= i15 : 1 <= i15;
                    int i17 = z8 ? 1 : i15;
                    while (z8) {
                        if (i17 != i15) {
                            i7 = i17 + i16;
                            z8 = z8;
                        } else {
                            if (!z8) {
                                throw new NoSuchElementException();
                            }
                            z8 = false;
                            i7 = i17;
                        }
                        p1.n0 n0Var3 = n0VarArr[i17];
                        int i18 = n0Var3 != null ? n0Var3.f7063f : 0;
                        if (i14 < i18) {
                            n0Var2 = n0Var3;
                            i17 = i7;
                            i14 = i18;
                        } else {
                            i17 = i7;
                        }
                    }
                }
            }
            i8 = n0Var2 != null ? n0Var2.f7063f : 0;
        }
        if (h0Var.v()) {
            i10 = (int) (4294967295L & j9);
        } else {
            if (size != 0) {
                n0Var = n0VarArr[0];
                int i19 = size - 1;
                if (i19 != 0) {
                    int i20 = n0Var != null ? n0Var.f7064g : 0;
                    w6.d dVar2 = new w6.d(1, i19, 1);
                    int i21 = dVar2.f9522g;
                    int i22 = dVar2.f9523h;
                    boolean z9 = i22 <= 0 ? 1 >= i21 : 1 <= i21;
                    int i23 = z9 ? 1 : i21;
                    while (z9) {
                        if (i23 != i21) {
                            i9 = i23 + i22;
                            z9 = z9;
                        } else {
                            if (!z9) {
                                throw new NoSuchElementException();
                            }
                            z9 = false;
                            i9 = i23;
                        }
                        p1.n0 n0Var4 = n0VarArr[i23];
                        int i24 = n0Var4 != null ? n0Var4.f7064g : 0;
                        i23 = i9;
                        if (i20 < i24) {
                            n0Var = n0Var4;
                            i20 = i24;
                        }
                    }
                }
            }
            if (n0Var != null) {
                i10 = n0Var.f7064g;
            }
        }
        if (!h0Var.v()) {
            this.f5220a.f5241c.setValue(new m2.j(j1.c.G(i8, i10)));
        }
        return h0Var.C(i8, i10, e6.v.f2827f, new g(n0VarArr, this, i8, i10));
    }

    @Override // p1.f0
    public final int b(p1.m mVar, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((p1.e0) list.get(0)).e0(i7));
            int W = e6.m.W(list);
            int i8 = 1;
            if (1 <= W) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((p1.e0) list.get(i8)).e0(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == W) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // p1.f0
    public final int c(p1.m mVar, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((p1.e0) list.get(0)).a0(i7));
            int W = e6.m.W(list);
            int i8 = 1;
            if (1 <= W) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((p1.e0) list.get(i8)).a0(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == W) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // p1.f0
    public final int e(p1.m mVar, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((p1.e0) list.get(0)).d0(i7));
            int W = e6.m.W(list);
            int i8 = 1;
            if (1 <= W) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((p1.e0) list.get(i8)).d0(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == W) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // p1.f0
    public final int g(p1.m mVar, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((p1.e0) list.get(0)).c(i7));
            int W = e6.m.W(list);
            int i8 = 1;
            if (1 <= W) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((p1.e0) list.get(i8)).c(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == W) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
