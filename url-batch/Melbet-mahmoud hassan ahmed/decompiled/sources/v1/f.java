package v1;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import n2.h0;
import n2.o0;
import r0.s1;
import t1.q;

/* loaded from: classes.dex */
public abstract class f implements h0.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f22747a = q.a();

    /* renamed from: b, reason: collision with root package name */
    public final n2.p f22748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22749c;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f22750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22751e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f22752f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22753g;

    /* renamed from: h, reason: collision with root package name */
    public final long f22754h;

    /* renamed from: i, reason: collision with root package name */
    protected final o0 f22755i;

    public f(n2.l lVar, n2.p pVar, int i7, s1 s1Var, int i8, Object obj, long j7, long j8) {
        this.f22755i = new o0(lVar);
        this.f22748b = (n2.p) o2.a.e(pVar);
        this.f22749c = i7;
        this.f22750d = s1Var;
        this.f22751e = i8;
        this.f22752f = obj;
        this.f22753g = j7;
        this.f22754h = j8;
    }

    public final long b() {
        return this.f22755i.q();
    }

    public final long d() {
        return this.f22754h - this.f22753g;
    }

    public final Map<String, List<String>> e() {
        return this.f22755i.s();
    }

    public final Uri f() {
        return this.f22755i.r();
    }
}
