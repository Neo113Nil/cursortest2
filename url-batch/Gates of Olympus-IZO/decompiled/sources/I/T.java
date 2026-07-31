package I;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2197a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2198b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2199c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2200d;

    public T() {
        this.f2198b = new Object();
        this.f2199c = new ArrayList();
        this.f2200d = new ArrayList();
        this.f2197a = true;
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (!this.f2197a) {
                    return null;
                }
                long[] jArr = (long[]) this.f2198b;
                int length = jArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    int i6 = 1;
                    boolean z3 = jArr[i3] > 0;
                    boolean[] zArr = (boolean[]) this.f2199c;
                    if (z3 != zArr[i4]) {
                        int[] iArr = (int[]) this.f2200d;
                        if (!z3) {
                            i6 = 2;
                        }
                        iArr[i4] = i6;
                    } else {
                        ((int[]) this.f2200d)[i4] = 0;
                    }
                    zArr[i4] = z3;
                    i3++;
                    i4 = i5;
                }
                this.f2197a = false;
                return (int[]) ((int[]) this.f2200d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public T(int i3) {
        this.f2198b = new long[i3];
        this.f2199c = new boolean[i3];
        this.f2200d = new int[i3];
    }
}
