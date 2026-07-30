package S7;

import com.google.android.gms.internal.ads.C3845rL;
import com.google.android.gms.internal.ads.QK;
import com.google.android.gms.internal.ads.TK;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: n, reason: collision with root package name */
    public int f2980n;

    /* renamed from: u, reason: collision with root package name */
    public int f2981u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2982v;

    public static TK f(byte[] bArr, int i, int i4) {
        TK tk = new TK(bArr, i, i4);
        try {
            tk.b(i4);
            return tk;
        } catch (C3845rL e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static int h(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long i(long j9) {
        return (j9 >>> 1) ^ (-(1 & j9));
    }

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract long D();

    public abstract int b(int i);

    public abstract void c(int i);

    public abstract boolean d();

    public abstract int e();

    public void g() {
        int k6;
        do {
            k6 = k();
            if (k6 == 0) {
                return;
            }
            int i = this.f2980n;
            int i4 = this.f2981u;
            if (i + i4 >= 100) {
                throw new C3845rL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f2981u = i4 + 1;
            this.f2981u--;
        } while (m(k6));
    }

    public abstract int k();

    public abstract void l(int i);

    public abstract boolean m(int i);

    public abstract double n();

    public abstract float o();

    public abstract long p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract boolean u();

    public abstract String v();

    public abstract String w();

    public abstract QK x();

    public abstract int y();

    public abstract int z();
}
