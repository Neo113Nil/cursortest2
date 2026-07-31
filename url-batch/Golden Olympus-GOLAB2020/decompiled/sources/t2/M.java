package t2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class M {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f46216b = AtomicIntegerFieldUpdater.newUpdater(M.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    private N[] f46217a;

    private final N[] g() {
        N[] nArr = this.f46217a;
        if (nArr == null) {
            N[] nArr2 = new N[4];
            this.f46217a = nArr2;
            return nArr2;
        }
        if (c() < nArr.length) {
            return nArr;
        }
        Object[] copyOf = Arrays.copyOf(nArr, c() * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        N[] nArr3 = (N[]) copyOf;
        this.f46217a = nArr3;
        return nArr3;
    }

    private final void k(int i4) {
        f46216b.set(this, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void l(int i4) {
        while (true) {
            int i5 = i4 * 2;
            int i6 = i5 + 1;
            if (i6 >= c()) {
                return;
            }
            N[] nArr = this.f46217a;
            Intrinsics.checkNotNull(nArr);
            int i7 = i5 + 2;
            if (i7 < c()) {
                N n4 = nArr[i7];
                Intrinsics.checkNotNull(n4);
                N n5 = nArr[i6];
                Intrinsics.checkNotNull(n5);
            }
            i7 = i6;
            N n6 = nArr[i4];
            Intrinsics.checkNotNull(n6);
            N n7 = nArr[i7];
            Intrinsics.checkNotNull(n7);
            if (((Comparable) n6).compareTo(n7) <= 0) {
                return;
            }
            n(i4, i7);
            i4 = i7;
        }
    }

    private final void m(int i4) {
        while (i4 > 0) {
            N[] nArr = this.f46217a;
            Intrinsics.checkNotNull(nArr);
            int i5 = (i4 - 1) / 2;
            N n4 = nArr[i5];
            Intrinsics.checkNotNull(n4);
            N n5 = nArr[i4];
            Intrinsics.checkNotNull(n5);
            if (((Comparable) n4).compareTo(n5) <= 0) {
                return;
            }
            n(i4, i5);
            i4 = i5;
        }
    }

    private final void n(int i4, int i5) {
        N[] nArr = this.f46217a;
        Intrinsics.checkNotNull(nArr);
        N n4 = nArr[i5];
        Intrinsics.checkNotNull(n4);
        N n5 = nArr[i4];
        Intrinsics.checkNotNull(n5);
        nArr[i4] = n4;
        nArr[i5] = n5;
        n4.d(i4);
        n5.d(i5);
    }

    public final void a(N n4) {
        n4.a(this);
        N[] g4 = g();
        int c4 = c();
        k(c4 + 1);
        g4[c4] = n4;
        n4.d(c4);
        m(c4);
    }

    public final N b() {
        N[] nArr = this.f46217a;
        if (nArr != null) {
            return nArr[0];
        }
        return null;
    }

    public final int c() {
        return f46216b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final N f() {
        N b4;
        synchronized (this) {
            b4 = b();
        }
        return b4;
    }

    public final boolean h(N n4) {
        boolean z4;
        synchronized (this) {
            if (n4.c() == null) {
                z4 = false;
            } else {
                i(n4.e());
                z4 = true;
            }
        }
        return z4;
    }

    public final N i(int i4) {
        N[] nArr = this.f46217a;
        Intrinsics.checkNotNull(nArr);
        k(c() - 1);
        if (i4 < c()) {
            n(i4, c());
            int i5 = (i4 - 1) / 2;
            if (i4 > 0) {
                N n4 = nArr[i4];
                Intrinsics.checkNotNull(n4);
                N n5 = nArr[i5];
                Intrinsics.checkNotNull(n5);
                if (((Comparable) n4).compareTo(n5) < 0) {
                    n(i4, i5);
                    m(i5);
                }
            }
            l(i4);
        }
        N n6 = nArr[c()];
        Intrinsics.checkNotNull(n6);
        n6.a(null);
        n6.d(-1);
        nArr[c()] = null;
        return n6;
    }

    public final N j() {
        N i4;
        synchronized (this) {
            i4 = c() > 0 ? i(0) : null;
        }
        return i4;
    }
}
