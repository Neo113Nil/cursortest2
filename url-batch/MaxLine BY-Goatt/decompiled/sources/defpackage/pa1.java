package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pa1 {
    public final int a;
    public final oa1[] b;
    public final t21 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public pa1(int i, oa1[] oa1VarArr, t21 t21Var, List list, int i2) {
        this.a = i;
        this.b = oa1VarArr;
        this.c = t21Var;
        this.d = list;
        this.e = i2;
        int i3 = 0;
        for (oa1 oa1Var : oa1VarArr) {
            i3 = Math.max(i3, oa1Var.k);
        }
        this.f = i3;
        int i4 = i3 + this.e;
        this.g = i4 >= 0 ? i4 : 0;
    }

    public final oa1[] a(int i, int i2, int i3) {
        oa1[] oa1VarArr = this.b;
        int length = oa1VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            oa1 oa1Var = oa1VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((mw0) this.d.get(i5)).a;
            int i9 = i;
            oa1Var.a(i9, ((int[]) this.c.o)[i6], i2, i3, this.a, i6);
            Unit unit = Unit.a;
            i6 += i8;
            i4++;
            i = i9;
            i5 = i7;
        }
        return oa1VarArr;
    }
}
