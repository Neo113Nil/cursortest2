package s;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i {

    /* renamed from: o, reason: collision with root package name */
    private static int f45918o = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f45919a;

    /* renamed from: b, reason: collision with root package name */
    private String f45920b;

    /* renamed from: f, reason: collision with root package name */
    public float f45924f;

    /* renamed from: j, reason: collision with root package name */
    a f45928j;

    /* renamed from: c, reason: collision with root package name */
    public int f45921c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f45922d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f45923e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45925g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f45926h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f45927i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    C3402b[] f45929k = new C3402b[16];

    /* renamed from: l, reason: collision with root package name */
    int f45930l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f45931m = 0;

    /* renamed from: n, reason: collision with root package name */
    HashSet f45932n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f45928j = aVar;
    }

    static void b() {
        f45918o++;
    }

    public final void a(C3402b c3402b) {
        int i4 = 0;
        while (true) {
            int i5 = this.f45930l;
            if (i4 >= i5) {
                C3402b[] c3402bArr = this.f45929k;
                if (i5 >= c3402bArr.length) {
                    this.f45929k = (C3402b[]) Arrays.copyOf(c3402bArr, c3402bArr.length * 2);
                }
                C3402b[] c3402bArr2 = this.f45929k;
                int i6 = this.f45930l;
                c3402bArr2[i6] = c3402b;
                this.f45930l = i6 + 1;
                return;
            }
            if (this.f45929k[i4] == c3402b) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void c(C3402b c3402b) {
        int i4 = this.f45930l;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f45929k[i5] == c3402b) {
                while (i5 < i4 - 1) {
                    C3402b[] c3402bArr = this.f45929k;
                    int i6 = i5 + 1;
                    c3402bArr[i5] = c3402bArr[i6];
                    i5 = i6;
                }
                this.f45930l--;
                return;
            }
            i5++;
        }
    }

    public void d() {
        this.f45920b = null;
        this.f45928j = a.UNKNOWN;
        this.f45923e = 0;
        this.f45921c = -1;
        this.f45922d = -1;
        this.f45924f = 0.0f;
        this.f45925g = false;
        int i4 = this.f45930l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f45929k[i5] = null;
        }
        this.f45930l = 0;
        this.f45931m = 0;
        this.f45919a = false;
        Arrays.fill(this.f45927i, 0.0f);
    }

    public void e(C3404d c3404d, float f4) {
        this.f45924f = f4;
        this.f45925g = true;
        int i4 = this.f45930l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f45929k[i5].B(c3404d, this, false);
        }
        this.f45930l = 0;
    }

    public void f(a aVar, String str) {
        this.f45928j = aVar;
    }

    public final void g(C3402b c3402b) {
        int i4 = this.f45930l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f45929k[i5].C(c3402b, false);
        }
        this.f45930l = 0;
    }

    public String toString() {
        if (this.f45920b != null) {
            return "" + this.f45920b;
        }
        return "" + this.f45921c;
    }
}
