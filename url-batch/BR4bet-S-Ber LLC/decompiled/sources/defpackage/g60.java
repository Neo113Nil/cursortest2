package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class g60 implements Comparable {
    public boolean f;
    public float j;
    public int q;
    public int g = -1;
    public int h = -1;
    public int i = 0;
    public boolean k = false;
    public final float[] l = new float[9];
    public final float[] m = new float[9];
    public y6[] n = new y6[16];
    public int o = 0;
    public int p = 0;

    public g60(int i) {
        this.q = i;
    }

    public final void a(y6 y6Var) {
        int i = 0;
        while (true) {
            int i2 = this.o;
            y6[] y6VarArr = this.n;
            if (i >= i2) {
                if (i2 >= y6VarArr.length) {
                    this.n = (y6[]) Arrays.copyOf(y6VarArr, y6VarArr.length * 2);
                }
                y6[] y6VarArr2 = this.n;
                int i3 = this.o;
                y6VarArr2[i3] = y6Var;
                this.o = i3 + 1;
                return;
            }
            if (y6VarArr[i] == y6Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(y6 y6Var) {
        int i = this.o;
        int i2 = 0;
        while (i2 < i) {
            if (this.n[i2] == y6Var) {
                while (i2 < i - 1) {
                    y6[] y6VarArr = this.n;
                    int i3 = i2 + 1;
                    y6VarArr[i2] = y6VarArr[i3];
                    i2 = i3;
                }
                this.o--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.q = 5;
        this.i = 0;
        this.g = -1;
        this.h = -1;
        this.j = 0.0f;
        this.k = false;
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2] = null;
        }
        this.o = 0;
        this.p = 0;
        this.f = false;
        Arrays.fill(this.m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.g - ((g60) obj).g;
    }

    public final void d(ys ysVar, float f) {
        this.j = f;
        this.k = true;
        int i = this.o;
        this.h = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].h(ysVar, this, false);
        }
        this.o = 0;
    }

    public final void e(ys ysVar, y6 y6Var) {
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].i(ysVar, y6Var, false);
        }
        this.o = 0;
    }

    public final String toString() {
        return "" + this.g;
    }
}
