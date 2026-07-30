package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l70 extends w {
    public final j0 e;
    public final int g;
    public final int h;

    public l70(j0 j0Var, int i, int i2) {
        this.e = j0Var;
        this.g = i;
        y90.l(i, i2, j0Var.size());
        this.h = i2 - i;
    }

    @Override // defpackage.m
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y90.c(i, this.h);
        return this.e.get(this.g + i);
    }

    @Override // defpackage.w, java.util.List
    public final List subList(int i, int i2) {
        y90.l(i, i2, this.h);
        int i3 = this.g;
        return new l70(this.e, i + i3, i3 + i2);
    }
}
