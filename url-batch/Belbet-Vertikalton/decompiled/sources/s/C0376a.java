package s;

import G1.AbstractC0001b;
import I0.h;
import java.util.Arrays;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376a {

    /* renamed from: b, reason: collision with root package name */
    public final C0377b f4103b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4104c;

    /* renamed from: a, reason: collision with root package name */
    public int f4102a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4105d = 8;
    public int[] e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f4106f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f4107g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f4108h = -1;
    public int i = -1;
    public boolean j = false;

    public C0376a(C0377b c0377b, h hVar) {
        this.f4103b = c0377b;
        this.f4104c = hVar;
    }

    public final void a(C0381f c0381f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f4108h;
            C0377b c0377b = this.f4103b;
            if (i == -1) {
                this.f4108h = 0;
                this.f4107g[0] = f2;
                this.e[0] = c0381f.f4132b;
                this.f4106f[0] = -1;
                c0381f.f4138k++;
                c0381f.a(c0377b);
                this.f4102a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f4102a; i4++) {
                int i5 = this.e[i];
                int i6 = c0381f.f4132b;
                if (i5 == i6) {
                    float[] fArr = this.f4107g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f4108h) {
                            this.f4108h = this.f4106f[i];
                        } else {
                            int[] iArr2 = this.f4106f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0381f.b(c0377b);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        c0381f.f4138k--;
                        this.f4102a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f4106f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.j) {
                int[] iArr3 = this.e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.e;
            if (i7 >= iArr4.length && this.f4102a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f4105d * 2;
                this.f4105d = i10;
                this.j = false;
                this.i = i7 - 1;
                this.f4107g = Arrays.copyOf(this.f4107g, i10);
                this.e = Arrays.copyOf(this.e, this.f4105d);
                this.f4106f = Arrays.copyOf(this.f4106f, this.f4105d);
            }
            this.e[i7] = c0381f.f4132b;
            this.f4107g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f4106f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f4106f[i7] = this.f4108h;
                this.f4108h = i7;
            }
            c0381f.f4138k++;
            c0381f.a(c0377b);
            this.f4102a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.e;
            if (i11 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f4108h;
        for (int i2 = 0; i != -1 && i2 < this.f4102a; i2++) {
            C0381f c0381f = ((C0381f[]) this.f4104c.f593d)[this.e[i]];
            if (c0381f != null) {
                c0381f.b(this.f4103b);
            }
            i = this.f4106f[i];
        }
        this.f4108h = -1;
        this.i = -1;
        this.j = false;
        this.f4102a = 0;
    }

    public final float c(C0381f c0381f) {
        int i = this.f4108h;
        for (int i2 = 0; i != -1 && i2 < this.f4102a; i2++) {
            if (this.e[i] == c0381f.f4132b) {
                return this.f4107g[i];
            }
            i = this.f4106f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f4102a;
    }

    public final C0381f e(int i) {
        int i2 = this.f4108h;
        for (int i3 = 0; i2 != -1 && i3 < this.f4102a; i3++) {
            if (i3 == i) {
                return ((C0381f[]) this.f4104c.f593d)[this.e[i2]];
            }
            i2 = this.f4106f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.f4108h;
        for (int i3 = 0; i2 != -1 && i3 < this.f4102a; i3++) {
            if (i3 == i) {
                return this.f4107g[i2];
            }
            i2 = this.f4106f[i2];
        }
        return 0.0f;
    }

    public final void g(C0381f c0381f, float f2) {
        if (f2 == 0.0f) {
            h(c0381f, true);
            return;
        }
        int i = this.f4108h;
        C0377b c0377b = this.f4103b;
        if (i == -1) {
            this.f4108h = 0;
            this.f4107g[0] = f2;
            this.e[0] = c0381f.f4132b;
            this.f4106f[0] = -1;
            c0381f.f4138k++;
            c0381f.a(c0377b);
            this.f4102a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.e;
            if (i2 >= iArr.length) {
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f4102a; i4++) {
            int i5 = this.e[i];
            int i6 = c0381f.f4132b;
            if (i5 == i6) {
                this.f4107g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f4106f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.e;
        if (i7 >= iArr3.length && this.f4102a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f4105d * 2;
            this.f4105d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.f4107g = Arrays.copyOf(this.f4107g, i10);
            this.e = Arrays.copyOf(this.e, this.f4105d);
            this.f4106f = Arrays.copyOf(this.f4106f, this.f4105d);
        }
        this.e[i7] = c0381f.f4132b;
        this.f4107g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f4106f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f4106f[i7] = this.f4108h;
            this.f4108h = i7;
        }
        c0381f.f4138k++;
        c0381f.a(c0377b);
        int i11 = this.f4102a + 1;
        this.f4102a = i11;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i11 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0381f c0381f, boolean z2) {
        int i = this.f4108h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f4102a) {
            if (this.e[i] == c0381f.f4132b) {
                if (i == this.f4108h) {
                    this.f4108h = this.f4106f[i];
                } else {
                    int[] iArr = this.f4106f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0381f.b(this.f4103b);
                }
                c0381f.f4138k--;
                this.f4102a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.f4107g[i];
            }
            i2++;
            i3 = i;
            i = this.f4106f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f4108h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f4102a; i2++) {
            str = (AbstractC0001b.f(str, " -> ") + this.f4107g[i] + " : ") + ((C0381f[]) this.f4104c.f593d)[this.e[i]];
            i = this.f4106f[i];
        }
        return str;
    }
}
