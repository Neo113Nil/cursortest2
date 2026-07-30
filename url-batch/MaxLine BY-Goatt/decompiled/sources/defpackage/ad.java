package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ad implements oj1 {
    public final gd a;
    public boolean b;

    public ad(gd gdVar) {
        this.a = gdVar;
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
        Object obj;
        pj1 G;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((jj1) list.get(i)).c(j));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i2 = ((n12) obj).m;
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i3);
                    int i4 = ((n12) obj3).m;
                    if (i2 < i4) {
                        obj = obj3;
                        i2 = i4;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        n12 n12Var = (n12) obj;
        int i5 = n12Var != null ? n12Var.m : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i6 = ((n12) obj2).n;
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                int i7 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i7);
                    int i8 = ((n12) obj4).n;
                    if (i6 < i8) {
                        obj2 = obj4;
                        i6 = i8;
                    }
                    if (i7 == size3) {
                        break;
                    }
                    i7++;
                }
            }
        }
        n12 n12Var2 = (n12) obj2;
        int i9 = n12Var2 != null ? n12Var2.n : 0;
        boolean w = qj1Var.w();
        gd gdVar = this.a;
        if (w) {
            this.b = true;
            gdVar.a.setValue(new x31(zm3.d(i5, i9)));
        } else if (!this.b) {
            gdVar.a.setValue(new x31(zm3.d(i5, i9)));
        }
        G = qj1Var.G(i5, i9, mi1.c(), new j9(2, arrayList));
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
