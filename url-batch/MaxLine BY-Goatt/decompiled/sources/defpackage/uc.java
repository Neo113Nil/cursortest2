package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uc implements oj1 {
    public final zc a;

    public uc(zc zcVar) {
        this.a = zcVar;
    }

    @Override // defpackage.oj1
    public final int a(h41 h41Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((jj1) list.get(0)).e(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((jj1) list.get(i2)).e(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.oj1
    public final int b(h41 h41Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((jj1) list.get(0)).Y(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((jj1) list.get(i2)).Y(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        n12 n12Var;
        n12 n12Var2;
        int i;
        pj1 G;
        int size = list.size();
        n12[] n12VarArr = new n12[size];
        int size2 = list.size();
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            n12Var = null;
            if (i3 >= size2) {
                break;
            }
            jj1 jj1Var = (jj1) list.get(i3);
            Object i4 = jj1Var.i();
            wc wcVar = i4 instanceof wc ? (wc) i4 : null;
            if (wcVar != null && ((Boolean) wcVar.a.getValue()).booleanValue()) {
                n12 c = jj1Var.c(j);
                long d = zm3.d(c.m, c.n);
                Unit unit = Unit.a;
                n12VarArr[i3] = c;
                j2 = d;
            }
            i3++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            jj1 jj1Var2 = (jj1) list.get(i5);
            if (n12VarArr[i5] == null) {
                n12VarArr[i5] = jj1Var2.c(j);
            }
        }
        if (qj1Var.w()) {
            i = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                n12Var2 = null;
            } else {
                n12Var2 = n12VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = n12Var2 != null ? n12Var2.m : 0;
                    t31 it = new IntRange(1, i6, 1).iterator();
                    while (it.o) {
                        n12 n12Var3 = n12VarArr[it.nextInt()];
                        int i8 = n12Var3 != null ? n12Var3.m : 0;
                        if (i7 < i8) {
                            n12Var2 = n12Var3;
                            i7 = i8;
                        }
                    }
                }
            }
            i = n12Var2 != null ? n12Var2.m : 0;
        }
        if (qj1Var.w()) {
            i2 = (int) (4294967295L & j2);
        } else {
            if (size != 0) {
                n12Var = n12VarArr[0];
                int i9 = size - 1;
                if (i9 != 0) {
                    int i10 = n12Var != null ? n12Var.n : 0;
                    t31 it2 = new IntRange(1, i9, 1).iterator();
                    while (it2.o) {
                        n12 n12Var4 = n12VarArr[it2.nextInt()];
                        int i11 = n12Var4 != null ? n12Var4.n : 0;
                        if (i10 < i11) {
                            n12Var = n12Var4;
                            i10 = i11;
                        }
                    }
                }
            }
            if (n12Var != null) {
                i2 = n12Var.n;
            }
        }
        if (!qj1Var.w()) {
            this.a.c.setValue(new x31(zm3.d(i, i2)));
        }
        G = qj1Var.G(i, i2, mi1.c(), new tc(n12VarArr, this, i, i2));
        return G;
    }

    @Override // defpackage.oj1
    public final int g(h41 h41Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((jj1) list.get(0)).a0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((jj1) list.get(i2)).a0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.oj1
    public final int i(h41 h41Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((jj1) list.get(0)).V(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((jj1) list.get(i2)).V(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
