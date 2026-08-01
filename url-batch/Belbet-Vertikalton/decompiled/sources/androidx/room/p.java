package androidx.room;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2112a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f2113b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2114c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2115d;

    public p(int i) {
        this.f2112a = new long[i];
        this.f2113b = new boolean[i];
        this.f2114c = new int[i];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.f2115d) {
                    return null;
                }
                long[] jArr = this.f2112a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z2 = jArr[i] > 0;
                    boolean[] zArr = this.f2113b;
                    if (z2 != zArr[i2]) {
                        int[] iArr = this.f2114c;
                        if (!z2) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f2114c[i2] = 0;
                    }
                    zArr[i2] = z2;
                    i++;
                    i2 = i3;
                }
                this.f2115d = false;
                return (int[]) this.f2114c.clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
