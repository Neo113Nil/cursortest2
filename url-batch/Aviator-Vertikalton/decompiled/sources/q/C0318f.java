package q;

import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3920a;

    /* renamed from: e, reason: collision with root package name */
    public float f3924e;

    /* renamed from: l, reason: collision with root package name */
    public int f3929l;

    /* renamed from: b, reason: collision with root package name */
    public int f3921b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3922c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f3923d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3925f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3926g = new float[9];
    public final float[] h = new float[9];
    public C0314b[] i = new C0314b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3927j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3928k = 0;

    public C0318f(int i) {
        this.f3929l = i;
    }

    public final void a(C0314b c0314b) {
        int i = 0;
        while (true) {
            int i2 = this.f3927j;
            if (i >= i2) {
                C0314b[] c0314bArr = this.i;
                if (i2 >= c0314bArr.length) {
                    this.i = (C0314b[]) Arrays.copyOf(c0314bArr, c0314bArr.length * 2);
                }
                C0314b[] c0314bArr2 = this.i;
                int i3 = this.f3927j;
                c0314bArr2[i3] = c0314b;
                this.f3927j = i3 + 1;
                return;
            }
            if (this.i[i] == c0314b) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0314b c0314b) {
        int i = this.f3927j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0314b) {
                while (i2 < i - 1) {
                    C0314b[] c0314bArr = this.i;
                    int i3 = i2 + 1;
                    c0314bArr[i2] = c0314bArr[i3];
                    i2 = i3;
                }
                this.f3927j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3929l = 5;
        this.f3923d = 0;
        this.f3921b = -1;
        this.f3922c = -1;
        this.f3924e = 0.0f;
        this.f3925f = false;
        int i = this.f3927j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3927j = 0;
        this.f3928k = 0;
        this.f3920a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3921b - ((C0318f) obj).f3921b;
    }

    public final void d(C0315c c0315c, float f2) {
        this.f3924e = f2;
        this.f3925f = true;
        int i = this.f3927j;
        this.f3922c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0315c, this, false);
        }
        this.f3927j = 0;
    }

    public final void e(C0315c c0315c, C0314b c0314b) {
        int i = this.f3927j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0315c, c0314b, false);
        }
        this.f3927j = 0;
    }

    public final String toString() {
        return "" + this.f3921b;
    }
}
