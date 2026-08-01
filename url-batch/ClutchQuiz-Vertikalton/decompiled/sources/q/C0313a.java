package q;

import K.C0012m;
import X.V;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313a {

    /* renamed from: b, reason: collision with root package name */
    public final C0314b f3400b;

    /* renamed from: c, reason: collision with root package name */
    public final C0012m f3401c;

    /* renamed from: a, reason: collision with root package name */
    public int f3399a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3402e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3403f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3404g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3405j = false;

    public C0313a(C0314b c0314b, C0012m c0012m) {
        this.f3400b = c0314b;
        this.f3401c = c0012m;
    }

    public final void a(C0318f c0318f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0314b c0314b = this.f3400b;
            if (i == -1) {
                this.h = 0;
                this.f3404g[0] = f2;
                this.f3402e[0] = c0318f.f3427b;
                this.f3403f[0] = -1;
                c0318f.f3433k++;
                c0318f.a(c0314b);
                this.f3399a++;
                if (this.f3405j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3402e;
                if (i2 >= iArr.length) {
                    this.f3405j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3399a; i4++) {
                int i5 = this.f3402e[i];
                int i6 = c0318f.f3427b;
                if (i5 == i6) {
                    float[] fArr = this.f3404g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3403f[i];
                        } else {
                            int[] iArr2 = this.f3403f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0318f.b(c0314b);
                        }
                        if (this.f3405j) {
                            this.i = i;
                        }
                        c0318f.f3433k--;
                        this.f3399a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3403f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3405j) {
                int[] iArr3 = this.f3402e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3402e;
            if (i7 >= iArr4.length && this.f3399a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3402e;
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
            int[] iArr6 = this.f3402e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3405j = false;
                this.i = i7 - 1;
                this.f3404g = Arrays.copyOf(this.f3404g, i10);
                this.f3402e = Arrays.copyOf(this.f3402e, this.d);
                this.f3403f = Arrays.copyOf(this.f3403f, this.d);
            }
            this.f3402e[i7] = c0318f.f3427b;
            this.f3404g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3403f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3403f[i7] = this.h;
                this.h = i7;
            }
            c0318f.f3433k++;
            c0318f.a(c0314b);
            this.f3399a++;
            if (!this.f3405j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3402e;
            if (i11 >= iArr8.length) {
                this.f3405j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3399a; i2++) {
            C0318f c0318f = ((C0318f[]) this.f3401c.d)[this.f3402e[i]];
            if (c0318f != null) {
                c0318f.b(this.f3400b);
            }
            i = this.f3403f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3405j = false;
        this.f3399a = 0;
    }

    public final float c(C0318f c0318f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3399a; i2++) {
            if (this.f3402e[i] == c0318f.f3427b) {
                return this.f3404g[i];
            }
            i = this.f3403f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3399a;
    }

    public final C0318f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3399a; i3++) {
            if (i3 == i) {
                return ((C0318f[]) this.f3401c.d)[this.f3402e[i2]];
            }
            i2 = this.f3403f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3399a; i3++) {
            if (i3 == i) {
                return this.f3404g[i2];
            }
            i2 = this.f3403f[i2];
        }
        return 0.0f;
    }

    public final void g(C0318f c0318f, float f2) {
        if (f2 == 0.0f) {
            h(c0318f, true);
            return;
        }
        int i = this.h;
        C0314b c0314b = this.f3400b;
        if (i == -1) {
            this.h = 0;
            this.f3404g[0] = f2;
            this.f3402e[0] = c0318f.f3427b;
            this.f3403f[0] = -1;
            c0318f.f3433k++;
            c0318f.a(c0314b);
            this.f3399a++;
            if (this.f3405j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3402e;
            if (i2 >= iArr.length) {
                this.f3405j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3399a; i4++) {
            int i5 = this.f3402e[i];
            int i6 = c0318f.f3427b;
            if (i5 == i6) {
                this.f3404g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3403f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3405j) {
            int[] iArr2 = this.f3402e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3402e;
        if (i7 >= iArr3.length && this.f3399a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3402e;
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
        int[] iArr5 = this.f3402e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3405j = false;
            this.i = i7 - 1;
            this.f3404g = Arrays.copyOf(this.f3404g, i10);
            this.f3402e = Arrays.copyOf(this.f3402e, this.d);
            this.f3403f = Arrays.copyOf(this.f3403f, this.d);
        }
        this.f3402e[i7] = c0318f.f3427b;
        this.f3404g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3403f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3403f[i7] = this.h;
            this.h = i7;
        }
        c0318f.f3433k++;
        c0318f.a(c0314b);
        int i11 = this.f3399a + 1;
        this.f3399a = i11;
        if (!this.f3405j) {
            this.i++;
        }
        int[] iArr7 = this.f3402e;
        if (i11 >= iArr7.length) {
            this.f3405j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3405j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0318f c0318f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3399a) {
            if (this.f3402e[i] == c0318f.f3427b) {
                if (i == this.h) {
                    this.h = this.f3403f[i];
                } else {
                    int[] iArr = this.f3403f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0318f.b(this.f3400b);
                }
                c0318f.f3433k--;
                this.f3399a--;
                this.f3402e[i] = -1;
                if (this.f3405j) {
                    this.i = i;
                }
                return this.f3404g[i];
            }
            i2++;
            i3 = i;
            i = this.f3403f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3399a; i2++) {
            str = (V.e(str, " -> ") + this.f3404g[i] + " : ") + ((C0318f[]) this.f3401c.d)[this.f3402e[i]];
            i = this.f3403f[i];
        }
        return str;
    }
}
