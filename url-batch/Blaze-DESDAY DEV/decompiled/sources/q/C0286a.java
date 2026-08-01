package q;

import K.C0014l;
import Y.V;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286a {

    /* renamed from: b, reason: collision with root package name */
    public final C0287b f3348b;

    /* renamed from: c, reason: collision with root package name */
    public final C0014l f3349c;

    /* renamed from: a, reason: collision with root package name */
    public int f3347a = 0;
    public int d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3350e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3351f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3352g = new float[8];
    public int h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3353j = false;

    public C0286a(C0287b c0287b, C0014l c0014l) {
        this.f3348b = c0287b;
        this.f3349c = c0014l;
    }

    public final void a(C0291f c0291f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            C0287b c0287b = this.f3348b;
            if (i == -1) {
                this.h = 0;
                this.f3352g[0] = f2;
                this.f3350e[0] = c0291f.f3376b;
                this.f3351f[0] = -1;
                c0291f.f3382k++;
                c0291f.a(c0287b);
                this.f3347a++;
                if (this.f3353j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f3350e;
                if (i2 >= iArr.length) {
                    this.f3353j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f3347a; i4++) {
                int i5 = this.f3350e[i];
                int i6 = c0291f.f3376b;
                if (i5 == i6) {
                    float[] fArr = this.f3352g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == RecyclerView.f1559A0) {
                        if (i == this.h) {
                            this.h = this.f3351f[i];
                        } else {
                            int[] iArr2 = this.f3351f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c0291f.b(c0287b);
                        }
                        if (this.f3353j) {
                            this.i = i;
                        }
                        c0291f.f3382k--;
                        this.f3347a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f3351f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.f3353j) {
                int[] iArr3 = this.f3350e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f3350e;
            if (i7 >= iArr4.length && this.f3347a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f3350e;
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
            int[] iArr6 = this.f3350e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.f3353j = false;
                this.i = i7 - 1;
                this.f3352g = Arrays.copyOf(this.f3352g, i10);
                this.f3350e = Arrays.copyOf(this.f3350e, this.d);
                this.f3351f = Arrays.copyOf(this.f3351f, this.d);
            }
            this.f3350e[i7] = c0291f.f3376b;
            this.f3352g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f3351f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f3351f[i7] = this.h;
                this.h = i7;
            }
            c0291f.f3382k++;
            c0291f.a(c0287b);
            this.f3347a++;
            if (!this.f3353j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.f3350e;
            if (i11 >= iArr8.length) {
                this.f3353j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3347a; i2++) {
            C0291f c0291f = ((C0291f[]) this.f3349c.f493c)[this.f3350e[i]];
            if (c0291f != null) {
                c0291f.b(this.f3348b);
            }
            i = this.f3351f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f3353j = false;
        this.f3347a = 0;
    }

    public final float c(C0291f c0291f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f3347a; i2++) {
            if (this.f3350e[i] == c0291f.f3376b) {
                return this.f3352g[i];
            }
            i = this.f3351f[i];
        }
        return RecyclerView.f1559A0;
    }

    public final int d() {
        return this.f3347a;
    }

    public final C0291f e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3347a; i3++) {
            if (i3 == i) {
                return ((C0291f[]) this.f3349c.f493c)[this.f3350e[i2]];
            }
            i2 = this.f3351f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3347a; i3++) {
            if (i3 == i) {
                return this.f3352g[i2];
            }
            i2 = this.f3351f[i2];
        }
        return RecyclerView.f1559A0;
    }

    public final void g(C0291f c0291f, float f2) {
        if (f2 == RecyclerView.f1559A0) {
            h(c0291f, true);
            return;
        }
        int i = this.h;
        C0287b c0287b = this.f3348b;
        if (i == -1) {
            this.h = 0;
            this.f3352g[0] = f2;
            this.f3350e[0] = c0291f.f3376b;
            this.f3351f[0] = -1;
            c0291f.f3382k++;
            c0291f.a(c0287b);
            this.f3347a++;
            if (this.f3353j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f3350e;
            if (i2 >= iArr.length) {
                this.f3353j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f3347a; i4++) {
            int i5 = this.f3350e[i];
            int i6 = c0291f.f3376b;
            if (i5 == i6) {
                this.f3352g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f3351f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.f3353j) {
            int[] iArr2 = this.f3350e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f3350e;
        if (i7 >= iArr3.length && this.f3347a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f3350e;
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
        int[] iArr5 = this.f3350e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.f3353j = false;
            this.i = i7 - 1;
            this.f3352g = Arrays.copyOf(this.f3352g, i10);
            this.f3350e = Arrays.copyOf(this.f3350e, this.d);
            this.f3351f = Arrays.copyOf(this.f3351f, this.d);
        }
        this.f3350e[i7] = c0291f.f3376b;
        this.f3352g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f3351f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f3351f[i7] = this.h;
            this.h = i7;
        }
        c0291f.f3382k++;
        c0291f.a(c0287b);
        int i11 = this.f3347a + 1;
        this.f3347a = i11;
        if (!this.f3353j) {
            this.i++;
        }
        int[] iArr7 = this.f3350e;
        if (i11 >= iArr7.length) {
            this.f3353j = true;
        }
        if (this.i >= iArr7.length) {
            this.f3353j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C0291f c0291f, boolean z2) {
        int i = this.h;
        if (i == -1) {
            return RecyclerView.f1559A0;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f3347a) {
            if (this.f3350e[i] == c0291f.f3376b) {
                if (i == this.h) {
                    this.h = this.f3351f[i];
                } else {
                    int[] iArr = this.f3351f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c0291f.b(this.f3348b);
                }
                c0291f.f3382k--;
                this.f3347a--;
                this.f3350e[i] = -1;
                if (this.f3353j) {
                    this.i = i;
                }
                return this.f3352g[i];
            }
            i2++;
            i3 = i;
            i = this.f3351f[i];
        }
        return RecyclerView.f1559A0;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f3347a; i2++) {
            str = (V.f(str, " -> ") + this.f3352g[i] + " : ") + ((C0291f[]) this.f3349c.f493c)[this.f3350e[i]];
            i = this.f3351f[i];
        }
        return str;
    }
}
