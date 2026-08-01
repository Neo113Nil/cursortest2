package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p30 implements Comparable {
    public boolean f;
    public float j;
    public int q;
    public int g = -1;
    public int h = -1;
    public int i = 0;
    public boolean k = false;
    public final float[] l = new float[9];
    public final float[] m = new float[9];
    public f7[] n = new f7[16];
    public int o = 0;
    public int p = 0;

    public p30(int i) {
        this.q = i;
    }

    public final void a(f7 f7Var) {
        int i = 0;
        while (true) {
            int i2 = this.o;
            f7[] f7VarArr = this.n;
            if (i >= i2) {
                if (i2 >= f7VarArr.length) {
                    this.n = (f7[]) Arrays.copyOf(f7VarArr, f7VarArr.length * 2);
                }
                f7[] f7VarArr2 = this.n;
                int i3 = this.o;
                f7VarArr2[i3] = f7Var;
                this.o = i3 + 1;
                return;
            }
            if (f7VarArr[i] == f7Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(f7 f7Var) {
        int i = this.o;
        int i2 = 0;
        while (i2 < i) {
            if (this.n[i2] == f7Var) {
                while (i2 < i - 1) {
                    f7[] f7VarArr = this.n;
                    int i3 = i2 + 1;
                    f7VarArr[i2] = f7VarArr[i3];
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
        return this.g - ((p30) obj).g;
    }

    public final void d(xq xqVar, float f) {
        this.j = f;
        this.k = true;
        int i = this.o;
        this.h = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].h(xqVar, this, false);
        }
        this.o = 0;
    }

    public final void e(xq xqVar, f7 f7Var) {
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            this.n[i2].i(xqVar, f7Var, false);
        }
        this.o = 0;
    }

    public final String toString() {
        return "" + this.g;
    }
}
