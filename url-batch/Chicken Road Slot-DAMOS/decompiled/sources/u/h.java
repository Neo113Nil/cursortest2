package u;

import a2.o0;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements a2.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f9515a;

    public h(o oVar) {
        this.f9515a = oVar;
    }

    @Override // a2.g0
    public final a2.h0 a(a2.i0 i0Var, List list, long j) {
        o0 o0Var;
        int i3;
        o0 o0Var2;
        int i10;
        int i11;
        int size = list.size();
        o0[] o0VarArr = new o0[size];
        int size2 = list.size();
        long j3 = 0;
        int i12 = 0;
        while (true) {
            o0Var = null;
            i3 = 1;
            if (i12 >= size2) {
                break;
            }
            a2.f0 f0Var = (a2.f0) list.get(i12);
            Object h10 = f0Var.h();
            j jVar = h10 instanceof j ? (j) h10 : null;
            if (jVar != null && ((Boolean) jVar.f9521a.getValue()).booleanValue()) {
                o0VarArr[i12] = f0Var.c(j);
                j3 = (r7.f132e & 4294967295L) | (r7.f131d << 32);
            }
            i12++;
        }
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            a2.f0 f0Var2 = (a2.f0) list.get(i13);
            if (o0VarArr[i13] == null) {
                o0VarArr[i13] = f0Var2.c(j);
            }
        }
        if (i0Var.j()) {
            i10 = (int) (j3 >> 32);
        } else {
            if (size == 0) {
                o0Var2 = null;
            } else {
                o0Var2 = o0VarArr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = o0Var2 != null ? o0Var2.f131d : 0;
                    if (1 <= i14) {
                        int i16 = 1;
                        while (true) {
                            o0 o0Var3 = o0VarArr[i16];
                            int i17 = o0Var3 != null ? o0Var3.f131d : 0;
                            if (i15 < i17) {
                                o0Var2 = o0Var3;
                                i15 = i17;
                            }
                            if (i16 == i14) {
                                break;
                            }
                            i16++;
                        }
                    }
                }
            }
            i10 = o0Var2 != null ? o0Var2.f131d : 0;
        }
        if (i0Var.j()) {
            i11 = (int) (j3 & 4294967295L);
        } else {
            if (size != 0) {
                o0Var = o0VarArr[0];
                int i18 = size - 1;
                if (i18 != 0) {
                    int i19 = o0Var != null ? o0Var.f132e : 0;
                    if (1 <= i18) {
                        while (true) {
                            o0 o0Var4 = o0VarArr[i3];
                            int i20 = o0Var4 != null ? o0Var4.f132e : 0;
                            if (i19 < i20) {
                                o0Var = o0Var4;
                                i19 = i20;
                            }
                            if (i3 == i18) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            i11 = o0Var != null ? o0Var.f132e : 0;
        }
        if (!i0Var.j()) {
            this.f9515a.f9538c.setValue(new x2.k((i10 << 32) | (i11 & 4294967295L)));
        }
        return a2.i0.V(i0Var, i10, i11, new g(o0VarArr, this, i10, i11));
    }
}
