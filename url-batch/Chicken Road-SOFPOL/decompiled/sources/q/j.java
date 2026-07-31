package q;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements u1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f5854a;

    public j(p pVar) {
        this.f5854a = pVar;
    }

    @Override // u1.e0
    public final u1.f0 e(w1.n0 n0Var, List list, long j7) {
        u1.l0 l0Var;
        int i;
        u1.l0 l0Var2;
        int i8;
        int i9;
        int size = list.size();
        u1.l0[] l0VarArr = new u1.l0[size];
        int size2 = list.size();
        long j8 = 0;
        int i10 = 0;
        while (true) {
            l0Var = null;
            i = 1;
            if (i10 >= size2) {
                break;
            }
            u1.d0 d0Var = (u1.d0) list.get(i10);
            Object g3 = d0Var.g();
            l lVar = g3 instanceof l ? (l) g3 : null;
            if (lVar != null && ((Boolean) lVar.f5860a.getValue()).booleanValue()) {
                l0VarArr[i10] = d0Var.e(j7);
                j8 = (r7.f7231e & 4294967295L) | (r7.f7230d << 32);
            }
            i10++;
        }
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            u1.d0 d0Var2 = (u1.d0) list.get(i11);
            if (l0VarArr[i11] == null) {
                l0VarArr[i11] = d0Var2.e(j7);
            }
        }
        if (n0Var.p()) {
            i8 = (int) (j8 >> 32);
        } else {
            if (size == 0) {
                l0Var2 = null;
            } else {
                l0Var2 = l0VarArr[0];
                int i12 = size - 1;
                if (i12 != 0) {
                    int i13 = l0Var2 != null ? l0Var2.f7230d : 0;
                    if (1 <= i12) {
                        int i14 = 1;
                        while (true) {
                            u1.l0 l0Var3 = l0VarArr[i14];
                            int i15 = l0Var3 != null ? l0Var3.f7230d : 0;
                            if (i13 < i15) {
                                l0Var2 = l0Var3;
                                i13 = i15;
                            }
                            if (i14 == i12) {
                                break;
                            }
                            i14++;
                        }
                    }
                }
            }
            i8 = l0Var2 != null ? l0Var2.f7230d : 0;
        }
        if (n0Var.p()) {
            i9 = (int) (j8 & 4294967295L);
        } else {
            if (size != 0) {
                l0Var = l0VarArr[0];
                int i16 = size - 1;
                if (i16 != 0) {
                    int i17 = l0Var != null ? l0Var.f7231e : 0;
                    if (1 <= i16) {
                        while (true) {
                            u1.l0 l0Var4 = l0VarArr[i];
                            int i18 = l0Var4 != null ? l0Var4.f7231e : 0;
                            if (i17 < i18) {
                                l0Var = l0Var4;
                                i17 = i18;
                            }
                            if (i == i16) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i9 = l0Var != null ? l0Var.f7231e : 0;
        }
        if (!n0Var.p()) {
            this.f5854a.f5888c.setValue(new r2.k((i8 << 32) | (i9 & 4294967295L)));
        }
        return n0Var.e0(i8, i9, d6.v.f2327d, new i(l0VarArr, this, i8, i9));
    }
}
