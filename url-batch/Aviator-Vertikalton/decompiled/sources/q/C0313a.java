package q;

import T.r;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313a {

    /* renamed from: b, reason: collision with root package name */
    public final C0314b f3890b;

    /* renamed from: c, reason: collision with root package name */
    public final r f3891c;

    /* renamed from: a, reason: collision with root package name */
    public int f3889a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3892d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3893e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3894f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3895g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3896j = false;

    public C0313a(C0314b c0314b, r rVar) {
        this.f3890b = c0314b;
        this.f3891c = rVar;
    }

    public final void a(C0318f c0318f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0314b c0314b = this.f3890b;
            if (i == -1) {
                this.h = 0;
                this.f3895g[0] = f2;
                this.f3893e[0] = c0318f.f3921b;
                this.f3894f[0] = -1;
                c0318f.f3928k++;
                c0318f.a(c0314b);
                this.f3889a++;
                if (this.f3896j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3893e;
                if (i2 >= iArr.length) {
                    this.f3896j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3889a; i4++) {
                int i5 = this.f3893e[i];
                int i6 = c0318f.f3921b;
                if (i5 == i6) {
                    float[] fArr = this.f3895g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f3894f[i];
                        } else {
                            int[] iArr2 = this.f3894f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0318f.b(c0314b);
                        }
                        if (this.f3896j) {
                            this.i = i;
                        }
                        c0318f.f3928k--;
                        this.f3889a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3894f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3896j) {
                int[] iArr3 = this.f3893e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3893e;
            if (i7 >= iArr4.length && this.f3889a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3893e;
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
            int[] iArr6 = this.f3893e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f3892d * 2;
                this.f3892d = i10;
                this.f3896j = false;
                this.i = i7 - 1;
                this.f3895g = Arrays.copyOf(this.f3895g, i10);
                this.f3893e = Arrays.copyOf(this.f3893e, this.f3892d);
                this.f3894f = Arrays.copyOf(this.f3894f, this.f3892d);
            }
            this.f3893e[i7] = c0318f.f3921b;
            this.f3895g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3894f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3894f[i7] = this.h;
                this.h = i7;
            }
            c0318f.f3928k++;
            c0318f.a(c0314b);
            this.f3889a++;
            if (!this.f3896j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3893e;
            if (i11 >= iArr8.length) {
                this.f3896j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3889a; i2++) {
            C0318f c0318f = ((C0318f[]) this.f3891c.f812d)[this.f3893e[i]];
            if (c0318f != null) {
                c0318f.b(this.f3890b);
            }
            i = this.f3894f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3896j = false;
        this.f3889a = 0;
    }

    public final float c(C0318f c0318f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3889a; i2++) {
            if (this.f3893e[i] == c0318f.f3921b) {
                return this.f3895g[i];
            }
            i = this.f3894f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f3889a;
    }

    public final C0318f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3889a; i3++) {
            if (i3 == i) {
                return ((C0318f[]) this.f3891c.f812d)[this.f3893e[i2]];
            }
            i2 = this.f3894f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3889a; i3++) {
            if (i3 == i) {
                return this.f3895g[i2];
            }
            i2 = this.f3894f[i2];
        }
        return 0.0f;
    }

    public final void g(C0318f c0318f, float f2) {
        if (f2 == 0.0f) {
            h(c0318f, true);
            return;
        }
        int i = this.h;
        C0314b c0314b = this.f3890b;
        if (i == -1) {
            this.h = 0;
            this.f3895g[0] = f2;
            this.f3893e[0] = c0318f.f3921b;
            this.f3894f[0] = -1;
            c0318f.f3928k++;
            c0318f.a(c0314b);
            this.f3889a++;
            if (this.f3896j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3893e;
            if (i2 >= iArr.length) {
                this.f3896j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3889a; i4++) {
            int i5 = this.f3893e[i];
            int i6 = c0318f.f3921b;
            if (i5 == i6) {
                this.f3895g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3894f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3896j) {
            int[] iArr2 = this.f3893e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3893e;
        if (i7 >= iArr3.length && this.f3889a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3893e;
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
        int[] iArr5 = this.f3893e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f3892d * 2;
            this.f3892d = i10;
            this.f3896j = false;
            this.i = i7 - 1;
            this.f3895g = Arrays.copyOf(this.f3895g, i10);
            this.f3893e = Arrays.copyOf(this.f3893e, this.f3892d);
            this.f3894f = Arrays.copyOf(this.f3894f, this.f3892d);
        }
        this.f3893e[i7] = c0318f.f3921b;
        this.f3895g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3894f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3894f[i7] = this.h;
            this.h = i7;
        }
        c0318f.f3928k++;
        c0318f.a(c0314b);
        int i11 = this.f3889a + 1;
        this.f3889a = i11;
        if (!this.f3896j) {
            this.i++;
        }
        int[] iArr7 = this.f3893e;
        if (i11 >= iArr7.length) {
            this.f3896j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3896j = true;
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
        while (i != -1 && i2 < this.f3889a) {
            if (this.f3893e[i] == c0318f.f3921b) {
                if (i == this.h) {
                    this.h = this.f3894f[i];
                } else {
                    int[] iArr = this.f3894f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0318f.b(this.f3890b);
                }
                c0318f.f3928k--;
                this.f3889a--;
                this.f3893e[i] = -1;
                if (this.f3896j) {
                    this.i = i;
                }
                return this.f3895g[i];
            }
            i2++;
            i3 = i;
            i = this.f3894f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3889a; i2++) {
            str = (X0.e.e(str, " -> ") + this.f3895g[i] + " : ") + ((C0318f[]) this.f3891c.f812d)[this.f3893e[i]];
            i = this.f3894f[i];
        }
        return str;
    }
}
