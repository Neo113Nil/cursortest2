package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3517a;

    /* renamed from: e, reason: collision with root package name */
    public float f3520e;

    /* renamed from: l, reason: collision with root package name */
    public int f3525l;

    /* renamed from: b, reason: collision with root package name */
    public int f3518b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3519c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3521f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3522g = new float[9];
    public final float[] h = new float[9];
    public C0287b[] i = new C0287b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3523j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3524k = 0;

    public C0291f(int i) {
        this.f3525l = i;
    }

    public final void a(C0287b c0287b) {
        int i = 0;
        while (true) {
            int i2 = this.f3523j;
            if (i >= i2) {
                C0287b[] c0287bArr = this.i;
                if (i2 >= c0287bArr.length) {
                    this.i = (C0287b[]) Arrays.copyOf(c0287bArr, c0287bArr.length * 2);
                }
                C0287b[] c0287bArr2 = this.i;
                int i3 = this.f3523j;
                c0287bArr2[i3] = c0287b;
                this.f3523j = i3 + 1;
                return;
            }
            if (this.i[i] == c0287b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0287b c0287b) {
        int i = this.f3523j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0287b) {
                while (i2 < i - 1) {
                    C0287b[] c0287bArr = this.i;
                    int i3 = i2 + 1;
                    c0287bArr[i2] = c0287bArr[i3];
                    i2 = i3;
                }
                this.f3523j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3525l = 5;
        this.d = 0;
        this.f3518b = -1;
        this.f3519c = -1;
        this.f3520e = 0.0f;
        this.f3521f = false;
        int i = this.f3523j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3523j = 0;
        this.f3524k = 0;
        this.f3517a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3518b - ((C0291f) obj).f3518b;
    }

    public final void d(C0288c c0288c, float f2) {
        this.f3520e = f2;
        this.f3521f = true;
        int i = this.f3523j;
        this.f3519c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0288c, this, false);
        }
        this.f3523j = 0;
    }

    public final void e(C0288c c0288c, C0287b c0287b) {
        int i = this.f3523j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0288c, c0287b, false);
        }
        this.f3523j = 0;
    }

    public final String toString() {
        return "" + this.f3518b;
    }
}
