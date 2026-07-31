package I;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2752a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2753b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2754c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2755d;

    public S() {
        this.f2753b = new Object();
        this.f2754c = new ArrayList();
        this.f2755d = new ArrayList();
        this.f2752a = true;
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (!this.f2752a) {
                    return null;
                }
                long[] jArr = (long[]) this.f2753b;
                int length = jArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    int i6 = 1;
                    boolean z3 = jArr[i3] > 0;
                    boolean[] zArr = (boolean[]) this.f2754c;
                    if (z3 != zArr[i4]) {
                        int[] iArr = (int[]) this.f2755d;
                        if (!z3) {
                            i6 = 2;
                        }
                        iArr[i4] = i6;
                    } else {
                        ((int[]) this.f2755d)[i4] = 0;
                    }
                    zArr[i4] = z3;
                    i3++;
                    i4 = i5;
                }
                this.f2752a = false;
                return (int[]) ((int[]) this.f2755d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public S(int i3) {
        this.f2753b = new long[i3];
        this.f2754c = new boolean[i3];
        this.f2755d = new int[i3];
    }
}
