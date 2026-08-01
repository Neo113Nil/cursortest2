package h0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2967a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f2968b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2969c;
    public boolean d;

    public j(int i) {
        this.f2967a = new long[i];
        this.f2968b = new boolean[i];
        this.f2969c = new int[i];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.d) {
                    return null;
                }
                long[] jArr = this.f2967a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z2 = jArr[i] > 0;
                    boolean[] zArr = this.f2968b;
                    if (z2 != zArr[i2]) {
                        int[] iArr = this.f2969c;
                        if (!z2) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f2969c[i2] = 0;
                    }
                    zArr[i2] = z2;
                    i++;
                    i2 = i3;
                }
                this.d = false;
                return (int[]) this.f2969c.clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
