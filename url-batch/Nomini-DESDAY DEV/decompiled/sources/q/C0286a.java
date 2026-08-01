package q;

import K.C0012l;
import X.V;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286a {

    /* renamed from: b, reason: collision with root package name */
    public final C0287b f3490b;

    /* renamed from: c, reason: collision with root package name */
    public final C0012l f3491c;

    /* renamed from: a, reason: collision with root package name */
    public int f3489a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3492e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3493f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3494g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3495j = false;

    public C0286a(C0287b c0287b, C0012l c0012l) {
        this.f3490b = c0287b;
        this.f3491c = c0012l;
    }

    public final void a(C0291f c0291f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0287b c0287b = this.f3490b;
            if (i == -1) {
                this.h = 0;
                this.f3494g[0] = f2;
                this.f3492e[0] = c0291f.f3518b;
                this.f3493f[0] = -1;
                c0291f.f3524k++;
                c0291f.a(c0287b);
                this.f3489a++;
                if (this.f3495j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3492e;
                if (i2 >= iArr.length) {
                    this.f3495j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3489a; i4++) {
                int i5 = this.f3492e[i];
                int i6 = c0291f.f3518b;
                if (i5 == i6) {
                    float[] fArr = this.f3494g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3493f[i];
                        } else {
                            int[] iArr2 = this.f3493f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0291f.b(c0287b);
                        }
                        if (this.f3495j) {
                            this.i = i;
                        }
                        c0291f.f3524k--;
                        this.f3489a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3493f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3495j) {
                int[] iArr3 = this.f3492e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3492e;
            if (i7 >= iArr4.length && this.f3489a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3492e;
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
            int[] iArr6 = this.f3492e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3495j = false;
                this.i = i7 - 1;
                this.f3494g = Arrays.copyOf(this.f3494g, i10);
                this.f3492e = Arrays.copyOf(this.f3492e, this.d);
                this.f3493f = Arrays.copyOf(this.f3493f, this.d);
            }
            this.f3492e[i7] = c0291f.f3518b;
            this.f3494g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3493f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3493f[i7] = this.h;
                this.h = i7;
            }
            c0291f.f3524k++;
            c0291f.a(c0287b);
            this.f3489a++;
            if (!this.f3495j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3492e;
            if (i11 >= iArr8.length) {
                this.f3495j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3489a; i2++) {
            C0291f c0291f = ((C0291f[]) this.f3491c.d)[this.f3492e[i]];
            if (c0291f != null) {
                c0291f.b(this.f3490b);
            }
            i = this.f3493f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3495j = false;
        this.f3489a = 0;
    }

    public final float c(C0291f c0291f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3489a; i2++) {
            if (this.f3492e[i] == c0291f.f3518b) {
                return this.f3494g[i];
            }
            i = this.f3493f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3489a;
    }

    public final C0291f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3489a; i3++) {
            if (i3 == i) {
                return ((C0291f[]) this.f3491c.d)[this.f3492e[i2]];
            }
            i2 = this.f3493f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3489a; i3++) {
            if (i3 == i) {
                return this.f3494g[i2];
            }
            i2 = this.f3493f[i2];
        }
        return 0.0f;
    }

    public final void g(C0291f c0291f, float f2) {
        if (f2 == 0.0f) {
            h(c0291f, true);
            return;
        }
        int i = this.h;
        C0287b c0287b = this.f3490b;
        if (i == -1) {
            this.h = 0;
            this.f3494g[0] = f2;
            this.f3492e[0] = c0291f.f3518b;
            this.f3493f[0] = -1;
            c0291f.f3524k++;
            c0291f.a(c0287b);
            this.f3489a++;
            if (this.f3495j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3492e;
            if (i2 >= iArr.length) {
                this.f3495j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3489a; i4++) {
            int i5 = this.f3492e[i];
            int i6 = c0291f.f3518b;
            if (i5 == i6) {
                this.f3494g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3493f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3495j) {
            int[] iArr2 = this.f3492e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3492e;
        if (i7 >= iArr3.length && this.f3489a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3492e;
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
        int[] iArr5 = this.f3492e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3495j = false;
            this.i = i7 - 1;
            this.f3494g = Arrays.copyOf(this.f3494g, i10);
            this.f3492e = Arrays.copyOf(this.f3492e, this.d);
            this.f3493f = Arrays.copyOf(this.f3493f, this.d);
        }
        this.f3492e[i7] = c0291f.f3518b;
        this.f3494g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3493f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3493f[i7] = this.h;
            this.h = i7;
        }
        c0291f.f3524k++;
        c0291f.a(c0287b);
        int i11 = this.f3489a + 1;
        this.f3489a = i11;
        if (!this.f3495j) {
            this.i++;
        }
        int[] iArr7 = this.f3492e;
        if (i11 >= iArr7.length) {
            this.f3495j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3495j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0291f c0291f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3489a) {
            if (this.f3492e[i] == c0291f.f3518b) {
                if (i == this.h) {
                    this.h = this.f3493f[i];
                } else {
                    int[] iArr = this.f3493f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0291f.b(this.f3490b);
                }
                c0291f.f3524k--;
                this.f3489a--;
                this.f3492e[i] = -1;
                if (this.f3495j) {
                    this.i = i;
                }
                return this.f3494g[i];
            }
            i2++;
            i3 = i;
            i = this.f3493f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3489a; i2++) {
            str = (V.e(str, " -> ") + this.f3494g[i] + " : ") + ((C0291f[]) this.f3491c.d)[this.f3492e[i]];
            i = this.f3493f[i];
        }
        return str;
    }
}
