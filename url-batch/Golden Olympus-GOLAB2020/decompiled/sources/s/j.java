package s;

import com.ironsource.b9;
import java.util.Arrays;
import s.C3402b;

/* loaded from: classes.dex */
public class j implements C3402b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f45939n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f45940a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f45941b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f45942c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f45943d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f45944e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f45945f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f45946g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f45947h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f45948i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f45949j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f45950k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final C3402b f45951l;

    /* renamed from: m, reason: collision with root package name */
    protected final C3403c f45952m;

    j(C3402b c3402b, C3403c c3403c) {
        this.f45951l = c3402b;
        this.f45952m = c3403c;
        clear();
    }

    private void l(i iVar, int i4) {
        int[] iArr;
        int i5 = iVar.f45921c % this.f45942c;
        int[] iArr2 = this.f45943d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            iArr2[i5] = i4;
        } else {
            while (true) {
                iArr = this.f45944e;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                } else {
                    i6 = i7;
                }
            }
            iArr[i6] = i4;
        }
        this.f45944e[i4] = -1;
    }

    private void m(int i4, i iVar, float f4) {
        this.f45945f[i4] = iVar.f45921c;
        this.f45946g[i4] = f4;
        this.f45947h[i4] = -1;
        this.f45948i[i4] = -1;
        iVar.a(this.f45951l);
        iVar.f45931m++;
        this.f45949j++;
    }

    private int n() {
        for (int i4 = 0; i4 < this.f45941b; i4++) {
            if (this.f45945f[i4] == -1) {
                return i4;
            }
        }
        return -1;
    }

    private void o() {
        int i4 = this.f45941b * 2;
        this.f45945f = Arrays.copyOf(this.f45945f, i4);
        this.f45946g = Arrays.copyOf(this.f45946g, i4);
        this.f45947h = Arrays.copyOf(this.f45947h, i4);
        this.f45948i = Arrays.copyOf(this.f45948i, i4);
        this.f45944e = Arrays.copyOf(this.f45944e, i4);
        for (int i5 = this.f45941b; i5 < i4; i5++) {
            this.f45945f[i5] = -1;
            this.f45944e[i5] = -1;
        }
        this.f45941b = i4;
    }

    private void q(int i4, i iVar, float f4) {
        int n4 = n();
        m(n4, iVar, f4);
        if (i4 != -1) {
            this.f45947h[n4] = i4;
            int[] iArr = this.f45948i;
            iArr[n4] = iArr[i4];
            iArr[i4] = n4;
        } else {
            this.f45947h[n4] = -1;
            if (this.f45949j > 0) {
                this.f45948i[n4] = this.f45950k;
                this.f45950k = n4;
            } else {
                this.f45948i[n4] = -1;
            }
        }
        int i5 = this.f45948i[n4];
        if (i5 != -1) {
            this.f45947h[i5] = n4;
        }
        l(iVar, n4);
    }

    private void r(i iVar) {
        int[] iArr;
        int i4;
        int i5 = iVar.f45921c;
        int i6 = i5 % this.f45942c;
        int[] iArr2 = this.f45943d;
        int i7 = iArr2[i6];
        if (i7 == -1) {
            return;
        }
        if (this.f45945f[i7] == i5) {
            int[] iArr3 = this.f45944e;
            iArr2[i6] = iArr3[i7];
            iArr3[i7] = -1;
            return;
        }
        while (true) {
            iArr = this.f45944e;
            i4 = iArr[i7];
            if (i4 == -1 || this.f45945f[i4] == i5) {
                break;
            } else {
                i7 = i4;
            }
        }
        if (i4 == -1 || this.f45945f[i4] != i5) {
            return;
        }
        iArr[i7] = iArr[i4];
        iArr[i4] = -1;
    }

    @Override // s.C3402b.a
    public void a(i iVar, float f4) {
        float f5 = f45939n;
        if (f4 > (-f5) && f4 < f5) {
            d(iVar, true);
            return;
        }
        if (this.f45949j == 0) {
            m(0, iVar, f4);
            l(iVar, 0);
            this.f45950k = 0;
            return;
        }
        int p4 = p(iVar);
        if (p4 != -1) {
            this.f45946g[p4] = f4;
            return;
        }
        if (this.f45949j + 1 >= this.f45941b) {
            o();
        }
        int i4 = this.f45949j;
        int i5 = this.f45950k;
        int i6 = -1;
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.f45945f[i5];
            int i9 = iVar.f45921c;
            if (i8 == i9) {
                this.f45946g[i5] = f4;
                return;
            }
            if (i8 < i9) {
                i6 = i5;
            }
            i5 = this.f45948i[i5];
            if (i5 == -1) {
                break;
            }
        }
        q(i6, iVar, f4);
    }

    @Override // s.C3402b.a
    public int b() {
        return this.f45949j;
    }

    @Override // s.C3402b.a
    public float c(C3402b c3402b, boolean z4) {
        float f4 = f(c3402b.f45875a);
        d(c3402b.f45875a, z4);
        j jVar = (j) c3402b.f45879e;
        int b4 = jVar.b();
        int i4 = 0;
        int i5 = 0;
        while (i4 < b4) {
            int i6 = jVar.f45945f[i5];
            if (i6 != -1) {
                k(this.f45952m.f45884d[i6], jVar.f45946g[i5] * f4, z4);
                i4++;
            }
            i5++;
        }
        return f4;
    }

    @Override // s.C3402b.a
    public void clear() {
        int i4 = this.f45949j;
        for (int i5 = 0; i5 < i4; i5++) {
            i e4 = e(i5);
            if (e4 != null) {
                e4.c(this.f45951l);
            }
        }
        for (int i6 = 0; i6 < this.f45941b; i6++) {
            this.f45945f[i6] = -1;
            this.f45944e[i6] = -1;
        }
        for (int i7 = 0; i7 < this.f45942c; i7++) {
            this.f45943d[i7] = -1;
        }
        this.f45949j = 0;
        this.f45950k = -1;
    }

    @Override // s.C3402b.a
    public float d(i iVar, boolean z4) {
        int p4 = p(iVar);
        if (p4 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f4 = this.f45946g[p4];
        if (this.f45950k == p4) {
            this.f45950k = this.f45948i[p4];
        }
        this.f45945f[p4] = -1;
        int[] iArr = this.f45947h;
        int i4 = iArr[p4];
        if (i4 != -1) {
            int[] iArr2 = this.f45948i;
            iArr2[i4] = iArr2[p4];
        }
        int i5 = this.f45948i[p4];
        if (i5 != -1) {
            iArr[i5] = iArr[p4];
        }
        this.f45949j--;
        iVar.f45931m--;
        if (z4) {
            iVar.c(this.f45951l);
        }
        return f4;
    }

    @Override // s.C3402b.a
    public i e(int i4) {
        int i5 = this.f45949j;
        if (i5 == 0) {
            return null;
        }
        int i6 = this.f45950k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4 && i6 != -1) {
                return this.f45952m.f45884d[this.f45945f[i6]];
            }
            i6 = this.f45948i[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // s.C3402b.a
    public float f(i iVar) {
        int p4 = p(iVar);
        if (p4 != -1) {
            return this.f45946g[p4];
        }
        return 0.0f;
    }

    @Override // s.C3402b.a
    public void g() {
        int i4 = this.f45949j;
        int i5 = this.f45950k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f45946g;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.f45948i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // s.C3402b.a
    public float h(int i4) {
        int i5 = this.f45949j;
        int i6 = this.f45950k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4) {
                return this.f45946g[i6];
            }
            i6 = this.f45948i[i6];
            if (i6 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // s.C3402b.a
    public boolean i(i iVar) {
        return p(iVar) != -1;
    }

    @Override // s.C3402b.a
    public void j(float f4) {
        int i4 = this.f45949j;
        int i5 = this.f45950k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f45946g;
            fArr[i5] = fArr[i5] / f4;
            i5 = this.f45948i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // s.C3402b.a
    public void k(i iVar, float f4, boolean z4) {
        float f5 = f45939n;
        if (f4 <= (-f5) || f4 >= f5) {
            int p4 = p(iVar);
            if (p4 == -1) {
                a(iVar, f4);
                return;
            }
            float[] fArr = this.f45946g;
            float f6 = fArr[p4] + f4;
            fArr[p4] = f6;
            float f7 = f45939n;
            if (f6 <= (-f7) || f6 >= f7) {
                return;
            }
            fArr[p4] = 0.0f;
            d(iVar, z4);
        }
    }

    public int p(i iVar) {
        if (this.f45949j == 0) {
            return -1;
        }
        int i4 = iVar.f45921c;
        int i5 = this.f45943d[i4 % this.f45942c];
        if (i5 == -1) {
            return -1;
        }
        if (this.f45945f[i5] == i4) {
            return i5;
        }
        do {
            i5 = this.f45944e[i5];
            if (i5 == -1) {
                break;
            }
        } while (this.f45945f[i5] != i4);
        if (i5 != -1 && this.f45945f[i5] == i4) {
            return i5;
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i4 = this.f45949j;
        for (int i5 = 0; i5 < i4; i5++) {
            i e4 = e(i5);
            if (e4 != null) {
                String str2 = str + e4 + " = " + h(i5) + " ";
                int p4 = p(e4);
                String str3 = str2 + "[p: ";
                String str4 = (this.f45947h[p4] != -1 ? str3 + this.f45952m.f45884d[this.f45945f[this.f45947h[p4]]] : str3 + "none") + ", n: ";
                str = (this.f45948i[p4] != -1 ? str4 + this.f45952m.f45884d[this.f45945f[this.f45948i[p4]]] : str4 + "none") + b9.i.f15552e;
            }
        }
        return str + " }";
    }
}
