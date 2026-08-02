package w0;

import java.util.Arrays;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1497d {

    /* renamed from: a, reason: collision with root package name */
    public long f15785a;

    /* renamed from: b, reason: collision with root package name */
    public long f15786b;

    /* renamed from: c, reason: collision with root package name */
    public long f15787c;

    /* renamed from: d, reason: collision with root package name */
    public long f15788d;

    /* renamed from: e, reason: collision with root package name */
    public long f15789e;

    /* renamed from: f, reason: collision with root package name */
    public long f15790f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f15791g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f15792h;

    public final boolean a() {
        return this.f15788d > 15 && this.f15792h == 0;
    }

    public final void b(long j4) {
        long j5 = this.f15788d;
        if (j5 == 0) {
            this.f15785a = j4;
        } else if (j5 == 1) {
            long j6 = j4 - this.f15785a;
            this.f15786b = j6;
            this.f15790f = j6;
            this.f15789e = 1L;
        } else {
            long j7 = j4 - this.f15787c;
            int i4 = (int) (j5 % 15);
            long abs = Math.abs(j7 - this.f15786b);
            boolean[] zArr = this.f15791g;
            if (abs <= 1000000) {
                this.f15789e++;
                this.f15790f += j7;
                if (zArr[i4]) {
                    zArr[i4] = false;
                    this.f15792h--;
                }
            } else if (!zArr[i4]) {
                zArr[i4] = true;
                this.f15792h++;
            }
        }
        this.f15788d++;
        this.f15787c = j4;
    }

    public final void c() {
        this.f15788d = 0L;
        this.f15789e = 0L;
        this.f15790f = 0L;
        this.f15792h = 0;
        Arrays.fill(this.f15791g, false);
    }
}
