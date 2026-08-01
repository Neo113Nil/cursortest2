package q;

import T.r;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315a {

    /* renamed from: b, reason: collision with root package name */
    public final C0316b f3894b;

    /* renamed from: c, reason: collision with root package name */
    public final r f3895c;

    /* renamed from: a, reason: collision with root package name */
    public int f3893a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3896d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3897e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3898f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3899g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3900j = false;

    public C0315a(C0316b c0316b, r rVar) {
        this.f3894b = c0316b;
        this.f3895c = rVar;
    }

    public final void a(C0320f c0320f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0316b c0316b = this.f3894b;
            if (i == -1) {
                this.h = 0;
                this.f3899g[0] = f2;
                this.f3897e[0] = c0320f.f3925b;
                this.f3898f[0] = -1;
                c0320f.f3932k++;
                c0320f.a(c0316b);
                this.f3893a++;
                if (this.f3900j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3897e;
                if (i2 >= iArr.length) {
                    this.f3900j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3893a; i4++) {
                int i5 = this.f3897e[i];
                int i6 = c0320f.f3925b;
                if (i5 == i6) {
                    float[] fArr = this.f3899g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3898f[i];
                        } else {
                            int[] iArr2 = this.f3898f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0320f.b(c0316b);
                        }
                        if (this.f3900j) {
                            this.i = i;
                        }
                        c0320f.f3932k--;
                        this.f3893a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3898f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3900j) {
                int[] iArr3 = this.f3897e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3897e;
            if (i7 >= iArr4.length && this.f3893a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3897e;
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
            int[] iArr6 = this.f3897e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f3896d * 2;
                this.f3896d = i10;
                this.f3900j = false;
                this.i = i7 - 1;
                this.f3899g = Arrays.copyOf(this.f3899g, i10);
                this.f3897e = Arrays.copyOf(this.f3897e, this.f3896d);
                this.f3898f = Arrays.copyOf(this.f3898f, this.f3896d);
            }
            this.f3897e[i7] = c0320f.f3925b;
            this.f3899g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3898f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3898f[i7] = this.h;
                this.h = i7;
            }
            c0320f.f3932k++;
            c0320f.a(c0316b);
            this.f3893a++;
            if (!this.f3900j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3897e;
            if (i11 >= iArr8.length) {
                this.f3900j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3893a; i2++) {
            C0320f c0320f = ((C0320f[]) this.f3895c.f813d)[this.f3897e[i]];
            if (c0320f != null) {
                c0320f.b(this.f3894b);
            }
            i = this.f3898f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3900j = false;
        this.f3893a = 0;
    }

    public final float c(C0320f c0320f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3893a; i2++) {
            if (this.f3897e[i] == c0320f.f3925b) {
                return this.f3899g[i];
            }
            i = this.f3898f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3893a;
    }

    public final C0320f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3893a; i3++) {
            if (i3 == i) {
                return ((C0320f[]) this.f3895c.f813d)[this.f3897e[i2]];
            }
            i2 = this.f3898f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3893a; i3++) {
            if (i3 == i) {
                return this.f3899g[i2];
            }
            i2 = this.f3898f[i2];
        }
        return 0.0f;
    }

    public final void g(C0320f c0320f, float f2) {
        if (f2 == 0.0f) {
            h(c0320f, true);
            return;
        }
        int i = this.h;
        C0316b c0316b = this.f3894b;
        if (i == -1) {
            this.h = 0;
            this.f3899g[0] = f2;
            this.f3897e[0] = c0320f.f3925b;
            this.f3898f[0] = -1;
            c0320f.f3932k++;
            c0320f.a(c0316b);
            this.f3893a++;
            if (this.f3900j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3897e;
            if (i2 >= iArr.length) {
                this.f3900j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3893a; i4++) {
            int i5 = this.f3897e[i];
            int i6 = c0320f.f3925b;
            if (i5 == i6) {
                this.f3899g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3898f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3900j) {
            int[] iArr2 = this.f3897e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3897e;
        if (i7 >= iArr3.length && this.f3893a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3897e;
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
        int[] iArr5 = this.f3897e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f3896d * 2;
            this.f3896d = i10;
            this.f3900j = false;
            this.i = i7 - 1;
            this.f3899g = Arrays.copyOf(this.f3899g, i10);
            this.f3897e = Arrays.copyOf(this.f3897e, this.f3896d);
            this.f3898f = Arrays.copyOf(this.f3898f, this.f3896d);
        }
        this.f3897e[i7] = c0320f.f3925b;
        this.f3899g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3898f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3898f[i7] = this.h;
            this.h = i7;
        }
        c0320f.f3932k++;
        c0320f.a(c0316b);
        int i11 = this.f3893a + 1;
        this.f3893a = i11;
        if (!this.f3900j) {
            this.i++;
        }
        int[] iArr7 = this.f3897e;
        if (i11 >= iArr7.length) {
            this.f3900j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3900j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0320f c0320f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3893a) {
            if (this.f3897e[i] == c0320f.f3925b) {
                if (i == this.h) {
                    this.h = this.f3898f[i];
                } else {
                    int[] iArr = this.f3898f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0320f.b(this.f3894b);
                }
                c0320f.f3932k--;
                this.f3893a--;
                this.f3897e[i] = -1;
                if (this.f3900j) {
                    this.i = i;
                }
                return this.f3899g[i];
            }
            i2++;
            i3 = i;
            i = this.f3898f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3893a; i2++) {
            str = (X0.e.e(str, " -> ") + this.f3899g[i] + " : ") + ((C0320f[]) this.f3895c.f813d)[this.f3897e[i]];
            i = this.f3898f[i];
        }
        return str;
    }
}
