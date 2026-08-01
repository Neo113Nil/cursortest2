package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3433a;

    /* renamed from: e, reason: collision with root package name */
    public float f3436e;

    /* renamed from: l, reason: collision with root package name */
    public int f3441l;

    /* renamed from: b, reason: collision with root package name */
    public int f3434b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3435c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3437f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3438g = new float[9];
    public final float[] h = new float[9];
    public C0285b[] i = new C0285b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3439j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3440k = 0;

    public C0289f(int i) {
        this.f3441l = i;
    }

    public final void a(C0285b c0285b) {
        int i = 0;
        while (true) {
            int i2 = this.f3439j;
            if (i >= i2) {
                C0285b[] c0285bArr = this.i;
                if (i2 >= c0285bArr.length) {
                    this.i = (C0285b[]) Arrays.copyOf(c0285bArr, c0285bArr.length * 2);
                }
                C0285b[] c0285bArr2 = this.i;
                int i3 = this.f3439j;
                c0285bArr2[i3] = c0285b;
                this.f3439j = i3 + 1;
                return;
            }
            if (this.i[i] == c0285b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0285b c0285b) {
        int i = this.f3439j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0285b) {
                while (i2 < i - 1) {
                    C0285b[] c0285bArr = this.i;
                    int i3 = i2 + 1;
                    c0285bArr[i2] = c0285bArr[i3];
                    i2 = i3;
                }
                this.f3439j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3441l = 5;
        this.d = 0;
        this.f3434b = -1;
        this.f3435c = -1;
        this.f3436e = 0.0f;
        this.f3437f = false;
        int i = this.f3439j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3439j = 0;
        this.f3440k = 0;
        this.f3433a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3434b - ((C0289f) obj).f3434b;
    }

    public final void d(C0286c c0286c, float f2) {
        this.f3436e = f2;
        this.f3437f = true;
        int i = this.f3439j;
        this.f3435c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0286c, this, false);
        }
        this.f3439j = 0;
    }

    public final void e(C0286c c0286c, C0285b c0285b) {
        int i = this.f3439j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0286c, c0285b, false);
        }
        this.f3439j = 0;
    }

    public final String toString() {
        return "" + this.f3434b;
    }
}
