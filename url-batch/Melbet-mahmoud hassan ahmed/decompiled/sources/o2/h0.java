package o2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f19723a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f19724b;

    /* renamed from: c, reason: collision with root package name */
    private int f19725c;

    /* renamed from: d, reason: collision with root package name */
    private int f19726d;

    public h0() {
        this(10);
    }

    public h0(int i7) {
        this.f19723a = new long[i7];
        this.f19724b = (V[]) f(i7);
    }

    private void b(long j7, V v6) {
        int i7 = this.f19725c;
        int i8 = this.f19726d;
        V[] vArr = this.f19724b;
        int length = (i7 + i8) % vArr.length;
        this.f19723a[length] = j7;
        vArr[length] = v6;
        this.f19726d = i8 + 1;
    }

    private void d(long j7) {
        if (this.f19726d > 0) {
            if (j7 <= this.f19723a[((this.f19725c + r0) - 1) % this.f19724b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f19724b.length;
        if (this.f19726d < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        V[] vArr = (V[]) f(i7);
        int i8 = this.f19725c;
        int i9 = length - i8;
        System.arraycopy(this.f19723a, i8, jArr, 0, i9);
        System.arraycopy(this.f19724b, this.f19725c, vArr, 0, i9);
        int i10 = this.f19725c;
        if (i10 > 0) {
            System.arraycopy(this.f19723a, 0, jArr, i9, i10);
            System.arraycopy(this.f19724b, 0, vArr, i9, this.f19725c);
        }
        this.f19723a = jArr;
        this.f19724b = vArr;
        this.f19725c = 0;
    }

    private static <V> V[] f(int i7) {
        return (V[]) new Object[i7];
    }

    private V g(long j7, boolean z6) {
        V v6 = null;
        long j8 = Long.MAX_VALUE;
        while (this.f19726d > 0) {
            long j9 = j7 - this.f19723a[this.f19725c];
            if (j9 < 0 && (z6 || (-j9) >= j8)) {
                break;
            }
            v6 = j();
            j8 = j9;
        }
        return v6;
    }

    private V j() {
        a.f(this.f19726d > 0);
        V[] vArr = this.f19724b;
        int i7 = this.f19725c;
        V v6 = vArr[i7];
        vArr[i7] = null;
        this.f19725c = (i7 + 1) % vArr.length;
        this.f19726d--;
        return v6;
    }

    public synchronized void a(long j7, V v6) {
        d(j7);
        e();
        b(j7, v6);
    }

    public synchronized void c() {
        this.f19725c = 0;
        this.f19726d = 0;
        Arrays.fill(this.f19724b, (Object) null);
    }

    public synchronized V h() {
        return this.f19726d == 0 ? null : j();
    }

    public synchronized V i(long j7) {
        return g(j7, true);
    }

    public synchronized int k() {
        return this.f19726d;
    }
}
