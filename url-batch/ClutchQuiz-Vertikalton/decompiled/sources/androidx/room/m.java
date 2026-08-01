package androidx.room;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f1663a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f1664b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1665c;
    public boolean d;

    public m(int i) {
        this.f1663a = new long[i];
        this.f1664b = new boolean[i];
        this.f1665c = new int[i];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.d) {
                    return null;
                }
                long[] jArr = this.f1663a;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z2 = jArr[i] > 0;
                    boolean[] zArr = this.f1664b;
                    if (z2 != zArr[i2]) {
                        int[] iArr = this.f1665c;
                        if (!z2) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f1665c[i2] = 0;
                    }
                    zArr[i2] = z2;
                    i++;
                    i2 = i3;
                }
                this.d = false;
                return (int[]) this.f1665c.clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
