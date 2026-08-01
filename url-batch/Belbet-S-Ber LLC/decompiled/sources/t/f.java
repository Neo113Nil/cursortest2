package t;

import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f3375f;

    /* renamed from: j, reason: collision with root package name */
    public float f3377j;

    /* renamed from: q, reason: collision with root package name */
    public int f3384q;

    /* renamed from: g, reason: collision with root package name */
    public int f3376g = -1;
    public int h = -1;
    public int i = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3378k = false;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f3379l = new float[9];

    /* renamed from: m, reason: collision with root package name */
    public final float[] f3380m = new float[9];

    /* renamed from: n, reason: collision with root package name */
    public b[] f3381n = new b[16];

    /* renamed from: o, reason: collision with root package name */
    public int f3382o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3383p = 0;

    public f(int i) {
        this.f3384q = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i4 = this.f3382o;
            if (i >= i4) {
                b[] bVarArr = this.f3381n;
                if (i4 >= bVarArr.length) {
                    this.f3381n = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3381n;
                int i5 = this.f3382o;
                bVarArr2[i5] = bVar;
                this.f3382o = i5 + 1;
                return;
            }
            if (this.f3381n[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.f3382o;
        int i4 = 0;
        while (i4 < i) {
            if (this.f3381n[i4] == bVar) {
                while (i4 < i - 1) {
                    b[] bVarArr = this.f3381n;
                    int i5 = i4 + 1;
                    bVarArr[i4] = bVarArr[i5];
                    i4 = i5;
                }
                this.f3382o--;
                return;
            }
            i4++;
        }
    }

    public final void c() {
        this.f3384q = 5;
        this.i = 0;
        this.f3376g = -1;
        this.h = -1;
        this.f3377j = 0.0f;
        this.f3378k = false;
        int i = this.f3382o;
        for (int i4 = 0; i4 < i; i4++) {
            this.f3381n[i4] = null;
        }
        this.f3382o = 0;
        this.f3383p = 0;
        this.f3375f = false;
        Arrays.fill(this.f3380m, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3376g - ((f) obj).f3376g;
    }

    public final void d(c cVar, float f5) {
        this.f3377j = f5;
        this.f3378k = true;
        int i = this.f3382o;
        this.h = -1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f3381n[i4].h(cVar, this, false);
        }
        this.f3382o = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.f3382o;
        for (int i4 = 0; i4 < i; i4++) {
            this.f3381n[i4].i(cVar, bVar, false);
        }
        this.f3382o = 0;
    }

    public final String toString() {
        return "" + this.f3376g;
    }
}
