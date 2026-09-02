package q0;

import T.C0085c;
import T.C0102u;
import T.C0103v;
import T.C0104w;
import T.C0105x;
import T.C0107z;
import a.AbstractC0124a;
import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends T.T {
    public static final Object n = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f15003b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15004c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15005d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15006e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15007f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15008g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15009h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15010i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f15011j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f15012k;

    /* renamed from: l, reason: collision with root package name */
    public final C0107z f15013l;

    /* renamed from: m, reason: collision with root package name */
    public final C0103v f15014m;

    static {
        T.r rVar = new T.r();
        v2.G g4 = v2.I.f15571b;
        v2.a0 a0Var = v2.a0.f15605e;
        List list = Collections.EMPTY_LIST;
        v2.a0 a0Var2 = v2.a0.f15605e;
        C0102u c0102u = new C0102u();
        C0105x c0105x = C0105x.f2898a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0104w(uri, null, null, list, a0Var2, -9223372036854775807L);
        }
        rVar.a();
        c0102u.a();
        T.C c4 = T.C.f2631B;
    }

    public f0(long j4, boolean z, boolean z4, C0107z c0107z) {
        this(j4, j4, 0L, 0L, z, false, z4, null, c0107z);
    }

    @Override // T.T
    public final int b(Object obj) {
        return n.equals(obj) ? 0 : -1;
    }

    @Override // T.T
    public final T.Q f(int i4, T.Q q4, boolean z) {
        AbstractC0124a.m(i4, 1);
        Object obj = z ? n : null;
        long j4 = -this.f15007f;
        q4.getClass();
        q4.h(null, obj, 0, this.f15005d, j4, C0085c.f2767c, false);
        return q4;
    }

    @Override // T.T
    public final int h() {
        return 1;
    }

    @Override // T.T
    public final Object l(int i4) {
        AbstractC0124a.m(i4, 1);
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // T.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T.S m(int i4, T.S s4, long j4) {
        long j5;
        AbstractC0124a.m(i4, 1);
        long j6 = this.f15008g;
        boolean z = this.f15010i;
        if (z && !this.f15011j && j4 != 0) {
            long j7 = this.f15006e;
            if (j7 != -9223372036854775807L) {
                j6 += j4;
            }
            j5 = -9223372036854775807L;
            Object obj = T.S.f2688q;
            s4.b(this.f15013l, this.f15012k, this.f15003b, this.f15004c, -9223372036854775807L, this.f15009h, z, this.f15014m, j5, this.f15006e, 0, this.f15007f);
            return s4;
        }
        j5 = j6;
        Object obj2 = T.S.f2688q;
        s4.b(this.f15013l, this.f15012k, this.f15003b, this.f15004c, -9223372036854775807L, this.f15009h, z, this.f15014m, j5, this.f15006e, 0, this.f15007f);
        return s4;
    }

    @Override // T.T
    public final int o() {
        return 1;
    }

    public f0(long j4, long j5, long j6, long j7, boolean z, boolean z4, boolean z5, Object obj, C0107z c0107z) {
        this(-9223372036854775807L, -9223372036854775807L, j4, j5, j6, j7, z, z4, false, obj, c0107z, z5 ? c0107z.f2901c : null);
    }

    public f0(long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z4, boolean z5, Object obj, C0107z c0107z, C0103v c0103v) {
        this.f15003b = j4;
        this.f15004c = j5;
        this.f15005d = j6;
        this.f15006e = j7;
        this.f15007f = j8;
        this.f15008g = j9;
        this.f15009h = z;
        this.f15010i = z4;
        this.f15011j = z5;
        this.f15012k = obj;
        c0107z.getClass();
        this.f15013l = c0107z;
        this.f15014m = c0103v;
    }
}
