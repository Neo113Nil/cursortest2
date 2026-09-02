package t;

import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f3262f;

    /* renamed from: j, reason: collision with root package name */
    public float f3265j;

    /* renamed from: q, reason: collision with root package name */
    public int f3272q;

    /* renamed from: g, reason: collision with root package name */
    public int f3263g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f3264h = -1;
    public int i = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3266k = false;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f3267l = new float[9];

    /* renamed from: m, reason: collision with root package name */
    public final float[] f3268m = new float[9];

    /* renamed from: n, reason: collision with root package name */
    public b[] f3269n = new b[16];

    /* renamed from: o, reason: collision with root package name */
    public int f3270o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3271p = 0;

    public f(int i) {
        this.f3272q = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i4 = this.f3270o;
            if (i >= i4) {
                b[] bVarArr = this.f3269n;
                if (i4 >= bVarArr.length) {
                    this.f3269n = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3269n;
                int i5 = this.f3270o;
                bVarArr2[i5] = bVar;
                this.f3270o = i5 + 1;
                return;
            }
            if (this.f3269n[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.f3270o;
        int i4 = 0;
        while (i4 < i) {
            if (this.f3269n[i4] == bVar) {
                while (i4 < i - 1) {
                    b[] bVarArr = this.f3269n;
                    int i5 = i4 + 1;
                    bVarArr[i4] = bVarArr[i5];
                    i4 = i5;
                }
                this.f3270o--;
                return;
            }
            i4++;
        }
    }

    public final void c() {
        this.f3272q = 5;
        this.i = 0;
        this.f3263g = -1;
        this.f3264h = -1;
        this.f3265j = 0.0f;
        this.f3266k = false;
        int i = this.f3270o;
        for (int i4 = 0; i4 < i; i4++) {
            this.f3269n[i4] = null;
        }
        this.f3270o = 0;
        this.f3271p = 0;
        this.f3262f = false;
        Arrays.fill(this.f3268m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3263g - ((f) obj).f3263g;
    }

    public final void d(c cVar, float f2) {
        this.f3265j = f2;
        this.f3266k = true;
        int i = this.f3270o;
        this.f3264h = -1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f3269n[i4].h(cVar, this, false);
        }
        this.f3270o = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.f3270o;
        for (int i4 = 0; i4 < i; i4++) {
            this.f3269n[i4].i(cVar, bVar, false);
        }
        this.f3270o = 0;
    }

    public final String toString() {
        return "" + this.f3263g;
    }
}
