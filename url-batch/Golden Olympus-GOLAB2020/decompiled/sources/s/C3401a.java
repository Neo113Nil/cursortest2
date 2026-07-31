package s;

import java.util.Arrays;
import s.C3402b;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3401a implements C3402b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f45863l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final C3402b f45865b;

    /* renamed from: c, reason: collision with root package name */
    protected final C3403c f45866c;

    /* renamed from: a, reason: collision with root package name */
    int f45864a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f45867d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f45868e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f45869f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f45870g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f45871h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f45872i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f45873j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f45874k = false;

    C3401a(C3402b c3402b, C3403c c3403c) {
        this.f45865b = c3402b;
        this.f45866c = c3403c;
    }

    @Override // s.C3402b.a
    public final void a(i iVar, float f4) {
        if (f4 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i4 = this.f45872i;
        if (i4 == -1) {
            this.f45872i = 0;
            this.f45871h[0] = f4;
            this.f45869f[0] = iVar.f45921c;
            this.f45870g[0] = -1;
            iVar.f45931m++;
            iVar.a(this.f45865b);
            this.f45864a++;
            if (this.f45874k) {
                return;
            }
            int i5 = this.f45873j + 1;
            this.f45873j = i5;
            int[] iArr = this.f45869f;
            if (i5 >= iArr.length) {
                this.f45874k = true;
                this.f45873j = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f45864a; i7++) {
            int i8 = this.f45869f[i4];
            int i9 = iVar.f45921c;
            if (i8 == i9) {
                this.f45871h[i4] = f4;
                return;
            }
            if (i8 < i9) {
                i6 = i4;
            }
            i4 = this.f45870g[i4];
        }
        int i10 = this.f45873j;
        int i11 = i10 + 1;
        if (this.f45874k) {
            int[] iArr2 = this.f45869f;
            if (iArr2[i10] != -1) {
                i10 = iArr2.length;
            }
        } else {
            i10 = i11;
        }
        int[] iArr3 = this.f45869f;
        if (i10 >= iArr3.length && this.f45864a < iArr3.length) {
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f45869f;
                if (i12 >= iArr4.length) {
                    break;
                }
                if (iArr4[i12] == -1) {
                    i10 = i12;
                    break;
                }
                i12++;
            }
        }
        int[] iArr5 = this.f45869f;
        if (i10 >= iArr5.length) {
            i10 = iArr5.length;
            int i13 = this.f45867d * 2;
            this.f45867d = i13;
            this.f45874k = false;
            this.f45873j = i10 - 1;
            this.f45871h = Arrays.copyOf(this.f45871h, i13);
            this.f45869f = Arrays.copyOf(this.f45869f, this.f45867d);
            this.f45870g = Arrays.copyOf(this.f45870g, this.f45867d);
        }
        this.f45869f[i10] = iVar.f45921c;
        this.f45871h[i10] = f4;
        if (i6 != -1) {
            int[] iArr6 = this.f45870g;
            iArr6[i10] = iArr6[i6];
            iArr6[i6] = i10;
        } else {
            this.f45870g[i10] = this.f45872i;
            this.f45872i = i10;
        }
        iVar.f45931m++;
        iVar.a(this.f45865b);
        int i14 = this.f45864a + 1;
        this.f45864a = i14;
        if (!this.f45874k) {
            this.f45873j++;
        }
        int[] iArr7 = this.f45869f;
        if (i14 >= iArr7.length) {
            this.f45874k = true;
        }
        if (this.f45873j >= iArr7.length) {
            this.f45874k = true;
            this.f45873j = iArr7.length - 1;
        }
    }

    @Override // s.C3402b.a
    public int b() {
        return this.f45864a;
    }

    @Override // s.C3402b.a
    public float c(C3402b c3402b, boolean z4) {
        float f4 = f(c3402b.f45875a);
        d(c3402b.f45875a, z4);
        C3402b.a aVar = c3402b.f45879e;
        int b4 = aVar.b();
        for (int i4 = 0; i4 < b4; i4++) {
            i e4 = aVar.e(i4);
            k(e4, aVar.f(e4) * f4, z4);
        }
        return f4;
    }

    @Override // s.C3402b.a
    public final void clear() {
        int i4 = this.f45872i;
        for (int i5 = 0; i4 != -1 && i5 < this.f45864a; i5++) {
            i iVar = this.f45866c.f45884d[this.f45869f[i4]];
            if (iVar != null) {
                iVar.c(this.f45865b);
            }
            i4 = this.f45870g[i4];
        }
        this.f45872i = -1;
        this.f45873j = -1;
        this.f45874k = false;
        this.f45864a = 0;
    }

    @Override // s.C3402b.a
    public final float d(i iVar, boolean z4) {
        if (this.f45868e == iVar) {
            this.f45868e = null;
        }
        int i4 = this.f45872i;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f45864a) {
            if (this.f45869f[i4] == iVar.f45921c) {
                if (i4 == this.f45872i) {
                    this.f45872i = this.f45870g[i4];
                } else {
                    int[] iArr = this.f45870g;
                    iArr[i6] = iArr[i4];
                }
                if (z4) {
                    iVar.c(this.f45865b);
                }
                iVar.f45931m--;
                this.f45864a--;
                this.f45869f[i4] = -1;
                if (this.f45874k) {
                    this.f45873j = i4;
                }
                return this.f45871h[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f45870g[i4];
        }
        return 0.0f;
    }

    @Override // s.C3402b.a
    public i e(int i4) {
        int i5 = this.f45872i;
        for (int i6 = 0; i5 != -1 && i6 < this.f45864a; i6++) {
            if (i6 == i4) {
                return this.f45866c.f45884d[this.f45869f[i5]];
            }
            i5 = this.f45870g[i5];
        }
        return null;
    }

    @Override // s.C3402b.a
    public final float f(i iVar) {
        int i4 = this.f45872i;
        for (int i5 = 0; i4 != -1 && i5 < this.f45864a; i5++) {
            if (this.f45869f[i4] == iVar.f45921c) {
                return this.f45871h[i4];
            }
            i4 = this.f45870g[i4];
        }
        return 0.0f;
    }

    @Override // s.C3402b.a
    public void g() {
        int i4 = this.f45872i;
        for (int i5 = 0; i4 != -1 && i5 < this.f45864a; i5++) {
            float[] fArr = this.f45871h;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f45870g[i4];
        }
    }

    @Override // s.C3402b.a
    public float h(int i4) {
        int i5 = this.f45872i;
        for (int i6 = 0; i5 != -1 && i6 < this.f45864a; i6++) {
            if (i6 == i4) {
                return this.f45871h[i5];
            }
            i5 = this.f45870g[i5];
        }
        return 0.0f;
    }

    @Override // s.C3402b.a
    public boolean i(i iVar) {
        int i4 = this.f45872i;
        if (i4 == -1) {
            return false;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f45864a; i5++) {
            if (this.f45869f[i4] == iVar.f45921c) {
                return true;
            }
            i4 = this.f45870g[i4];
        }
        return false;
    }

    @Override // s.C3402b.a
    public void j(float f4) {
        int i4 = this.f45872i;
        for (int i5 = 0; i4 != -1 && i5 < this.f45864a; i5++) {
            float[] fArr = this.f45871h;
            fArr[i4] = fArr[i4] / f4;
            i4 = this.f45870g[i4];
        }
    }

    @Override // s.C3402b.a
    public void k(i iVar, float f4, boolean z4) {
        float f5 = f45863l;
        if (f4 <= (-f5) || f4 >= f5) {
            int i4 = this.f45872i;
            if (i4 == -1) {
                this.f45872i = 0;
                this.f45871h[0] = f4;
                this.f45869f[0] = iVar.f45921c;
                this.f45870g[0] = -1;
                iVar.f45931m++;
                iVar.a(this.f45865b);
                this.f45864a++;
                if (this.f45874k) {
                    return;
                }
                int i5 = this.f45873j + 1;
                this.f45873j = i5;
                int[] iArr = this.f45869f;
                if (i5 >= iArr.length) {
                    this.f45874k = true;
                    this.f45873j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i4 != -1 && i7 < this.f45864a; i7++) {
                int i8 = this.f45869f[i4];
                int i9 = iVar.f45921c;
                if (i8 == i9) {
                    float[] fArr = this.f45871h;
                    float f6 = fArr[i4] + f4;
                    float f7 = f45863l;
                    if (f6 > (-f7) && f6 < f7) {
                        f6 = 0.0f;
                    }
                    fArr[i4] = f6;
                    if (f6 == 0.0f) {
                        if (i4 == this.f45872i) {
                            this.f45872i = this.f45870g[i4];
                        } else {
                            int[] iArr2 = this.f45870g;
                            iArr2[i6] = iArr2[i4];
                        }
                        if (z4) {
                            iVar.c(this.f45865b);
                        }
                        if (this.f45874k) {
                            this.f45873j = i4;
                        }
                        iVar.f45931m--;
                        this.f45864a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i6 = i4;
                }
                i4 = this.f45870g[i4];
            }
            int i10 = this.f45873j;
            int i11 = i10 + 1;
            if (this.f45874k) {
                int[] iArr3 = this.f45869f;
                if (iArr3[i10] != -1) {
                    i10 = iArr3.length;
                }
            } else {
                i10 = i11;
            }
            int[] iArr4 = this.f45869f;
            if (i10 >= iArr4.length && this.f45864a < iArr4.length) {
                int i12 = 0;
                while (true) {
                    int[] iArr5 = this.f45869f;
                    if (i12 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i12] == -1) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                }
            }
            int[] iArr6 = this.f45869f;
            if (i10 >= iArr6.length) {
                i10 = iArr6.length;
                int i13 = this.f45867d * 2;
                this.f45867d = i13;
                this.f45874k = false;
                this.f45873j = i10 - 1;
                this.f45871h = Arrays.copyOf(this.f45871h, i13);
                this.f45869f = Arrays.copyOf(this.f45869f, this.f45867d);
                this.f45870g = Arrays.copyOf(this.f45870g, this.f45867d);
            }
            this.f45869f[i10] = iVar.f45921c;
            this.f45871h[i10] = f4;
            if (i6 != -1) {
                int[] iArr7 = this.f45870g;
                iArr7[i10] = iArr7[i6];
                iArr7[i6] = i10;
            } else {
                this.f45870g[i10] = this.f45872i;
                this.f45872i = i10;
            }
            iVar.f45931m++;
            iVar.a(this.f45865b);
            this.f45864a++;
            if (!this.f45874k) {
                this.f45873j++;
            }
            int i14 = this.f45873j;
            int[] iArr8 = this.f45869f;
            if (i14 >= iArr8.length) {
                this.f45874k = true;
                this.f45873j = iArr8.length - 1;
            }
        }
    }

    public String toString() {
        int i4 = this.f45872i;
        String str = "";
        for (int i5 = 0; i4 != -1 && i5 < this.f45864a; i5++) {
            str = ((str + " -> ") + this.f45871h[i4] + " : ") + this.f45866c.f45884d[this.f45869f[i4]];
            i4 = this.f45870g[i4];
        }
        return str;
    }
}
