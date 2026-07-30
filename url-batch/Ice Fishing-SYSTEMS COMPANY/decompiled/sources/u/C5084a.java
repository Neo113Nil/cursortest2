package u;

import com.google.android.gms.internal.ads.CL;
import java.util.Arrays;
import m.Q0;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5084a {

    /* renamed from: b, reason: collision with root package name */
    public final C5085b f40956b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0 f40957c;

    /* renamed from: a, reason: collision with root package name */
    public int f40955a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f40958d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f40959e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f40960f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f40961g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f40962h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40963j = false;

    public C5084a(C5085b c5085b, Q0 q02) {
        this.f40956b = c5085b;
        this.f40957c = q02;
    }

    public final void a(C5089f c5089f, float f6, boolean z8) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i = this.f40962h;
            C5085b c5085b = this.f40956b;
            if (i == -1) {
                this.f40962h = 0;
                this.f40961g[0] = f6;
                this.f40959e[0] = c5089f.f40995u;
                this.f40960f[0] = -1;
                c5089f.f40992D++;
                c5089f.a(c5085b);
                this.f40955a++;
                if (this.f40963j) {
                    return;
                }
                int i4 = this.i + 1;
                this.i = i4;
                int[] iArr = this.f40959e;
                if (i4 >= iArr.length) {
                    this.f40963j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i != -1 && i10 < this.f40955a; i10++) {
                int i11 = this.f40959e[i];
                int i12 = c5089f.f40995u;
                if (i11 == i12) {
                    float[] fArr = this.f40961g;
                    float f9 = fArr[i] + f6;
                    if (f9 > -0.001f && f9 < 0.001f) {
                        f9 = 0.0f;
                    }
                    fArr[i] = f9;
                    if (f9 == 0.0f) {
                        if (i == this.f40962h) {
                            this.f40962h = this.f40960f[i];
                        } else {
                            int[] iArr2 = this.f40960f;
                            iArr2[i9] = iArr2[i];
                        }
                        if (z8) {
                            c5089f.b(c5085b);
                        }
                        if (this.f40963j) {
                            this.i = i;
                        }
                        c5089f.f40992D--;
                        this.f40955a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i;
                }
                i = this.f40960f[i];
            }
            int i13 = this.i;
            int i14 = i13 + 1;
            if (this.f40963j) {
                int[] iArr3 = this.f40959e;
                if (iArr3[i13] != -1) {
                    i13 = iArr3.length;
                }
            } else {
                i13 = i14;
            }
            int[] iArr4 = this.f40959e;
            if (i13 >= iArr4.length && this.f40955a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f40959e;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f40959e;
            if (i13 >= iArr6.length) {
                i13 = iArr6.length;
                int i16 = this.f40958d * 2;
                this.f40958d = i16;
                this.f40963j = false;
                this.i = i13 - 1;
                this.f40961g = Arrays.copyOf(this.f40961g, i16);
                this.f40959e = Arrays.copyOf(this.f40959e, this.f40958d);
                this.f40960f = Arrays.copyOf(this.f40960f, this.f40958d);
            }
            this.f40959e[i13] = c5089f.f40995u;
            this.f40961g[i13] = f6;
            if (i9 != -1) {
                int[] iArr7 = this.f40960f;
                iArr7[i13] = iArr7[i9];
                iArr7[i9] = i13;
            } else {
                this.f40960f[i13] = this.f40962h;
                this.f40962h = i13;
            }
            c5089f.f40992D++;
            c5089f.a(c5085b);
            this.f40955a++;
            if (!this.f40963j) {
                this.i++;
            }
            int i17 = this.i;
            int[] iArr8 = this.f40959e;
            if (i17 >= iArr8.length) {
                this.f40963j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f40962h;
        for (int i4 = 0; i != -1 && i4 < this.f40955a; i4++) {
            C5089f c5089f = ((C5089f[]) this.f40957c.f39327d)[this.f40959e[i]];
            if (c5089f != null) {
                c5089f.b(this.f40956b);
            }
            i = this.f40960f[i];
        }
        this.f40962h = -1;
        this.i = -1;
        this.f40963j = false;
        this.f40955a = 0;
    }

    public final float c(C5089f c5089f) {
        int i = this.f40962h;
        for (int i4 = 0; i != -1 && i4 < this.f40955a; i4++) {
            if (this.f40959e[i] == c5089f.f40995u) {
                return this.f40961g[i];
            }
            i = this.f40960f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f40955a;
    }

    public final C5089f e(int i) {
        int i4 = this.f40962h;
        for (int i9 = 0; i4 != -1 && i9 < this.f40955a; i9++) {
            if (i9 == i) {
                return ((C5089f[]) this.f40957c.f39327d)[this.f40959e[i4]];
            }
            i4 = this.f40960f[i4];
        }
        return null;
    }

    public final float f(int i) {
        int i4 = this.f40962h;
        for (int i9 = 0; i4 != -1 && i9 < this.f40955a; i9++) {
            if (i9 == i) {
                return this.f40961g[i4];
            }
            i4 = this.f40960f[i4];
        }
        return 0.0f;
    }

    public final void g(C5089f c5089f, float f6) {
        if (f6 == 0.0f) {
            h(c5089f, true);
            return;
        }
        int i = this.f40962h;
        C5085b c5085b = this.f40956b;
        if (i == -1) {
            this.f40962h = 0;
            this.f40961g[0] = f6;
            this.f40959e[0] = c5089f.f40995u;
            this.f40960f[0] = -1;
            c5089f.f40992D++;
            c5089f.a(c5085b);
            this.f40955a++;
            if (this.f40963j) {
                return;
            }
            int i4 = this.i + 1;
            this.i = i4;
            int[] iArr = this.f40959e;
            if (i4 >= iArr.length) {
                this.f40963j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i != -1 && i10 < this.f40955a; i10++) {
            int i11 = this.f40959e[i];
            int i12 = c5089f.f40995u;
            if (i11 == i12) {
                this.f40961g[i] = f6;
                return;
            }
            if (i11 < i12) {
                i9 = i;
            }
            i = this.f40960f[i];
        }
        int i13 = this.i;
        int i14 = i13 + 1;
        if (this.f40963j) {
            int[] iArr2 = this.f40959e;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f40959e;
        if (i13 >= iArr3.length && this.f40955a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f40959e;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f40959e;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.f40958d * 2;
            this.f40958d = i16;
            this.f40963j = false;
            this.i = i13 - 1;
            this.f40961g = Arrays.copyOf(this.f40961g, i16);
            this.f40959e = Arrays.copyOf(this.f40959e, this.f40958d);
            this.f40960f = Arrays.copyOf(this.f40960f, this.f40958d);
        }
        this.f40959e[i13] = c5089f.f40995u;
        this.f40961g[i13] = f6;
        if (i9 != -1) {
            int[] iArr6 = this.f40960f;
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            this.f40960f[i13] = this.f40962h;
            this.f40962h = i13;
        }
        c5089f.f40992D++;
        c5089f.a(c5085b);
        int i17 = this.f40955a + 1;
        this.f40955a = i17;
        if (!this.f40963j) {
            this.i++;
        }
        int[] iArr7 = this.f40959e;
        if (i17 >= iArr7.length) {
            this.f40963j = true;
        }
        if (this.i >= iArr7.length) {
            this.f40963j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(C5089f c5089f, boolean z8) {
        int i = this.f40962h;
        if (i == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i9 = -1;
        while (i != -1 && i4 < this.f40955a) {
            if (this.f40959e[i] == c5089f.f40995u) {
                if (i == this.f40962h) {
                    this.f40962h = this.f40960f[i];
                } else {
                    int[] iArr = this.f40960f;
                    iArr[i9] = iArr[i];
                }
                if (z8) {
                    c5089f.b(this.f40956b);
                }
                c5089f.f40992D--;
                this.f40955a--;
                this.f40959e[i] = -1;
                if (this.f40963j) {
                    this.i = i;
                }
                return this.f40961g[i];
            }
            i4++;
            i9 = i;
            i = this.f40960f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f40962h;
        String str = "";
        for (int i4 = 0; i != -1 && i4 < this.f40955a; i4++) {
            StringBuilder b9 = AbstractC5088e.b(CL.j(str, " -> "));
            b9.append(this.f40961g[i]);
            b9.append(" : ");
            StringBuilder b10 = AbstractC5088e.b(b9.toString());
            b10.append(((C5089f[]) this.f40957c.f39327d)[this.f40959e[i]]);
            str = b10.toString();
            i = this.f40960f[i];
        }
        return str;
    }
}
