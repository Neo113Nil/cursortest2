package T;

import E.AbstractC0005f;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f2688q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final C0107z f2689r;

    /* renamed from: b, reason: collision with root package name */
    public Object f2691b;

    /* renamed from: d, reason: collision with root package name */
    public Object f2693d;

    /* renamed from: e, reason: collision with root package name */
    public long f2694e;

    /* renamed from: f, reason: collision with root package name */
    public long f2695f;

    /* renamed from: g, reason: collision with root package name */
    public long f2696g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2697h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2698i;

    /* renamed from: j, reason: collision with root package name */
    public C0103v f2699j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2700k;

    /* renamed from: l, reason: collision with root package name */
    public long f2701l;

    /* renamed from: m, reason: collision with root package name */
    public long f2702m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public long f2703p;

    /* renamed from: a, reason: collision with root package name */
    public Object f2690a = f2688q;

    /* renamed from: c, reason: collision with root package name */
    public C0107z f2692c = f2689r;

    static {
        r rVar = new r();
        v2.G g4 = v2.I.f15571b;
        v2.a0 a0Var = v2.a0.f15605e;
        List list = Collections.EMPTY_LIST;
        v2.a0 a0Var2 = v2.a0.f15605e;
        C0102u c0102u = new C0102u();
        C0105x c0105x = C0105x.f2898a;
        Uri uri = Uri.EMPTY;
        f2689r = new C0107z("androidx.media3.common.Timeline", new C0101t(rVar), uri != null ? new C0104w(uri, null, null, list, a0Var2, -9223372036854775807L) : null, new C0103v(c0102u), C.f2631B, c0105x);
        AbstractC0005f.s(1, 2, 3, 4, 5);
        AbstractC0005f.s(6, 7, 8, 9, 10);
        W.J.G(11);
        W.J.G(12);
        W.J.G(13);
    }

    public final boolean a() {
        return this.f2699j != null;
    }

    public final void b(C0107z c0107z, Object obj, long j4, long j5, long j6, boolean z, boolean z4, C0103v c0103v, long j7, long j8, int i4, long j9) {
        this.f2690a = f2688q;
        this.f2692c = c0107z != null ? c0107z : f2689r;
        if (c0107z != null) {
            C0104w c0104w = c0107z.f2900b;
        }
        this.f2691b = null;
        this.f2693d = obj;
        this.f2694e = j4;
        this.f2695f = j5;
        this.f2696g = j6;
        this.f2697h = z;
        this.f2698i = z4;
        this.f2699j = c0103v;
        this.f2701l = j7;
        this.f2702m = j8;
        this.n = 0;
        this.o = i4;
        this.f2703p = j9;
        this.f2700k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !S.class.equals(obj.getClass())) {
            return false;
        }
        S s4 = (S) obj;
        return Objects.equals(this.f2690a, s4.f2690a) && Objects.equals(this.f2692c, s4.f2692c) && Objects.equals(this.f2693d, s4.f2693d) && Objects.equals(this.f2699j, s4.f2699j) && this.f2694e == s4.f2694e && this.f2695f == s4.f2695f && this.f2696g == s4.f2696g && this.f2697h == s4.f2697h && this.f2698i == s4.f2698i && this.f2700k == s4.f2700k && this.f2701l == s4.f2701l && this.f2702m == s4.f2702m && this.n == s4.n && this.o == s4.o && this.f2703p == s4.f2703p;
    }

    public final int hashCode() {
        int hashCode = (this.f2692c.hashCode() + ((this.f2690a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f2693d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C0103v c0103v = this.f2699j;
        int hashCode3 = (hashCode2 + (c0103v != null ? c0103v.hashCode() : 0)) * 31;
        long j4 = this.f2694e;
        int i4 = (hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f2695f;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f2696g;
        int i6 = (((((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f2697h ? 1 : 0)) * 31) + (this.f2698i ? 1 : 0)) * 31) + (this.f2700k ? 1 : 0)) * 31;
        long j7 = this.f2701l;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f2702m;
        int i8 = (((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j9 = this.f2703p;
        return i8 + ((int) (j9 ^ (j9 >>> 32)));
    }
}
