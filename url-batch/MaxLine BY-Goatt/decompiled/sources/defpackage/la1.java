package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class la1 {
    public final t21 a;
    public final int b;
    public final int c;
    public final ka1 d;
    public final sa1 e;
    public final /* synthetic */ t21 f;

    public la1(t21 t21Var, int i, int i2, ka1 ka1Var, sa1 sa1Var) {
        this.f = t21Var;
        this.a = t21Var;
        this.b = i;
        this.c = i2;
        this.d = ka1Var;
        this.e = sa1Var;
    }

    public final long a(int i, int i2) {
        int i3;
        t21 t21Var = this.a;
        int[] iArr = (int[]) t21Var.n;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) t21Var.o;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            j21.a("width must be >= 0");
        }
        return v10.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public final pa1 b(int i) {
        lq0 c = this.e.c(i);
        int i2 = c.a;
        int size = c.b.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        oa1[] oa1VarArr = new oa1[size];
        int i5 = 0;
        while (true) {
            List list = c.b;
            if (i3 >= size) {
                return new pa1(i, oa1VarArr, this.f, list, i4);
            }
            int i6 = (int) ((mw0) list.get(i3)).a;
            int i7 = i4;
            oa1 a = this.d.a(i2 + i3, a(i5, i6), i5, i6, i7);
            i5 += i6;
            Unit unit = Unit.a;
            oa1VarArr[i3] = a;
            i3++;
            i4 = i7;
        }
    }
}
