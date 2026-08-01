package q;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3375a;

    /* renamed from: e, reason: collision with root package name */
    public float f3378e;

    /* renamed from: l, reason: collision with root package name */
    public int f3383l;

    /* renamed from: b, reason: collision with root package name */
    public int f3376b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3377c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3379f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3380g = new float[9];
    public final float[] h = new float[9];
    public C0287b[] i = new C0287b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3381j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3382k = 0;

    public C0291f(int i) {
        this.f3383l = i;
    }

    public final void a(C0287b c0287b) {
        int i = 0;
        while (true) {
            int i2 = this.f3381j;
            if (i >= i2) {
                C0287b[] c0287bArr = this.i;
                if (i2 >= c0287bArr.length) {
                    this.i = (C0287b[]) Arrays.copyOf(c0287bArr, c0287bArr.length * 2);
                }
                C0287b[] c0287bArr2 = this.i;
                int i3 = this.f3381j;
                c0287bArr2[i3] = c0287b;
                this.f3381j = i3 + 1;
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
        int i = this.f3381j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0287b) {
                while (i2 < i - 1) {
                    C0287b[] c0287bArr = this.i;
                    int i3 = i2 + 1;
                    c0287bArr[i2] = c0287bArr[i3];
                    i2 = i3;
                }
                this.f3381j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.f3383l = 5;
        this.d = 0;
        this.f3376b = -1;
        this.f3377c = -1;
        this.f3378e = RecyclerView.f1559A0;
        this.f3379f = false;
        int i = this.f3381j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.f3381j = 0;
        this.f3382k = 0;
        this.f3375a = false;
        Arrays.fill(this.h, RecyclerView.f1559A0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3376b - ((C0291f) obj).f3376b;
    }

    public final void d(C0288c c0288c, float f2) {
        this.f3378e = f2;
        this.f3379f = true;
        int i = this.f3381j;
        this.f3377c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(c0288c, this, false);
        }
        this.f3381j = 0;
    }

    public final void e(C0288c c0288c, C0287b c0287b) {
        int i = this.f3381j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(c0288c, c0287b, false);
        }
        this.f3381j = 0;
    }

    public final String toString() {
        return "" + this.f3376b;
    }
}
