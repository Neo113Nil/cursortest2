package s;

import A1.j;
import java.util.Arrays;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263a {

    /* renamed from: b, reason: collision with root package name */
    public final C0264b f3568b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3569c;

    /* renamed from: a, reason: collision with root package name */
    public int f3567a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3570e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3571f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3572g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3573j = false;

    public C0263a(C0264b c0264b, j jVar) {
        this.f3568b = c0264b;
        this.f3569c = jVar;
    }

    public final void a(C0268f c0268f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0264b c0264b = this.f3568b;
            if (i == -1) {
                this.h = 0;
                this.f3572g[0] = f2;
                this.f3570e[0] = c0268f.f3596b;
                this.f3571f[0] = -1;
                c0268f.f3602k++;
                c0268f.a(c0264b);
                this.f3567a++;
                if (this.f3573j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3570e;
                if (i2 >= iArr.length) {
                    this.f3573j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3567a; i4++) {
                int i5 = this.f3570e[i];
                int i6 = c0268f.f3596b;
                if (i5 == i6) {
                    float[] fArr = this.f3572g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3571f[i];
                        } else {
                            int[] iArr2 = this.f3571f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0268f.b(c0264b);
                        }
                        if (this.f3573j) {
                            this.i = i;
                        }
                        c0268f.f3602k--;
                        this.f3567a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3571f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3573j) {
                int[] iArr3 = this.f3570e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3570e;
            if (i7 >= iArr4.length && this.f3567a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3570e;
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
            int[] iArr6 = this.f3570e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3573j = false;
                this.i = i7 - 1;
                this.f3572g = Arrays.copyOf(this.f3572g, i10);
                this.f3570e = Arrays.copyOf(this.f3570e, this.d);
                this.f3571f = Arrays.copyOf(this.f3571f, this.d);
            }
            this.f3570e[i7] = c0268f.f3596b;
            this.f3572g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3571f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3571f[i7] = this.h;
                this.h = i7;
            }
            c0268f.f3602k++;
            c0268f.a(c0264b);
            this.f3567a++;
            if (!this.f3573j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3570e;
            if (i11 >= iArr8.length) {
                this.f3573j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3567a; i2++) {
            C0268f c0268f = ((C0268f[]) this.f3569c.d)[this.f3570e[i]];
            if (c0268f != null) {
                c0268f.b(this.f3568b);
            }
            i = this.f3571f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3573j = false;
        this.f3567a = 0;
    }

    public final float c(C0268f c0268f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3567a; i2++) {
            if (this.f3570e[i] == c0268f.f3596b) {
                return this.f3572g[i];
            }
            i = this.f3571f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3567a;
    }

    public final C0268f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3567a; i3++) {
            if (i3 == i) {
                return ((C0268f[]) this.f3569c.d)[this.f3570e[i2]];
            }
            i2 = this.f3571f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3567a; i3++) {
            if (i3 == i) {
                return this.f3572g[i2];
            }
            i2 = this.f3571f[i2];
        }
        return 0.0f;
    }

    public final void g(C0268f c0268f, float f2) {
        if (f2 == 0.0f) {
            h(c0268f, true);
            return;
        }
        int i = this.h;
        C0264b c0264b = this.f3568b;
        if (i == -1) {
            this.h = 0;
            this.f3572g[0] = f2;
            this.f3570e[0] = c0268f.f3596b;
            this.f3571f[0] = -1;
            c0268f.f3602k++;
            c0268f.a(c0264b);
            this.f3567a++;
            if (this.f3573j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3570e;
            if (i2 >= iArr.length) {
                this.f3573j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3567a; i4++) {
            int i5 = this.f3570e[i];
            int i6 = c0268f.f3596b;
            if (i5 == i6) {
                this.f3572g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3571f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3573j) {
            int[] iArr2 = this.f3570e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3570e;
        if (i7 >= iArr3.length && this.f3567a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3570e;
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
        int[] iArr5 = this.f3570e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3573j = false;
            this.i = i7 - 1;
            this.f3572g = Arrays.copyOf(this.f3572g, i10);
            this.f3570e = Arrays.copyOf(this.f3570e, this.d);
            this.f3571f = Arrays.copyOf(this.f3571f, this.d);
        }
        this.f3570e[i7] = c0268f.f3596b;
        this.f3572g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3571f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3571f[i7] = this.h;
            this.h = i7;
        }
        c0268f.f3602k++;
        c0268f.a(c0264b);
        int i11 = this.f3567a + 1;
        this.f3567a = i11;
        if (!this.f3573j) {
            this.i++;
        }
        int[] iArr7 = this.f3570e;
        if (i11 >= iArr7.length) {
            this.f3573j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3573j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0268f c0268f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3567a) {
            if (this.f3570e[i] == c0268f.f3596b) {
                if (i == this.h) {
                    this.h = this.f3571f[i];
                } else {
                    int[] iArr = this.f3571f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0268f.b(this.f3568b);
                }
                c0268f.f3602k--;
                this.f3567a--;
                this.f3570e[i] = -1;
                if (this.f3573j) {
                    this.i = i;
                }
                return this.f3572g[i];
            }
            i2++;
            i3 = i;
            i = this.f3571f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3567a; i2++) {
            str = (X0.a.f(str, " -> ") + this.f3572g[i] + " : ") + ((C0268f[]) this.f3569c.d)[this.f3570e[i]];
            i = this.f3571f[i];
        }
        return str;
    }
}
