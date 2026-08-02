package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ry implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    ru[] j = new ru[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public ry(int i) {
        this.n = i;
    }

    public final void a(ru ruVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            ru[] ruVarArr = this.j;
            if (i >= i2) {
                int length = ruVarArr.length;
                if (i2 >= length) {
                    ruVarArr = (ru[]) Arrays.copyOf(ruVarArr, length + length);
                    this.j = ruVarArr;
                }
                int i3 = this.k;
                ruVarArr[i3] = ruVar;
                this.k = i3 + 1;
                return;
            }
            if (ruVarArr[i] == ruVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(ru ruVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == ruVar) {
                while (i2 < i - 1) {
                    ru[] ruVarArr = this.j;
                    int i3 = i2 + 1;
                    ruVarArr[i2] = ruVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((ry) obj).c;
    }

    public final void d(rv rvVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(rvVar, this, false);
        }
        this.k = 0;
    }

    public final void e(rv rvVar, ru ruVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(rvVar, ruVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
