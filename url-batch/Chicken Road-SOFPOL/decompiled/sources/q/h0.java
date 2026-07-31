package q;

import java.util.LinkedHashMap;
import r.q1;
import r.r1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f5842a = new r1(t.f5907h, t.i);

    /* renamed from: b, reason: collision with root package name */
    public static final r.u0 f5843b = r.d.l(0.0f, 400.0f, null, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final r.u0 f5844c;

    /* renamed from: d, reason: collision with root package name */
    public static final r.u0 f5845d;

    static {
        long j7 = 1;
        long j8 = (j7 & 4294967295L) | (j7 << 32);
        f5844c = r.d.l(0.0f, 400.0f, new r2.i(j8), 1);
        f5845d = r.d.l(0.0f, 400.0f, new r2.k(j8), 1);
    }

    public static m0 a() {
        int i = 1;
        long j7 = 1;
        r.u0 l3 = r.d.l(0.0f, 400.0f, new r2.k((j7 & 4294967295L) | (j7 << 32)), 1);
        y0.d dVar = y0.b.f8691o;
        return new m0(new v0((o0) null, new a0(dVar.equals(y0.b.f8689m) ? y0.b.f8682e : dVar.equals(dVar) ? y0.b.f8687k : y0.b.f8685h, new t(i, 6), l3), (h0.a) null, (LinkedHashMap) null, 59));
    }

    public static m0 b(q1 q1Var, int i) {
        r.v vVar = q1Var;
        if ((i & 1) != 0) {
            vVar = r.d.l(0.0f, 400.0f, null, 5);
        }
        return new m0(new v0(new o0(vVar), (a0) null, (h0.a) null, (LinkedHashMap) null, 62));
    }

    public static n0 c(q1 q1Var, int i) {
        r.v vVar = q1Var;
        if ((i & 1) != 0) {
            vVar = r.d.l(0.0f, 400.0f, null, 5);
        }
        return new n0(new v0(new o0(vVar), (a0) null, (h0.a) null, (LinkedHashMap) null, 62));
    }

    public static n0 d() {
        int i = 1;
        long j7 = 1;
        r.u0 l3 = r.d.l(0.0f, 400.0f, new r2.k((j7 & 4294967295L) | (j7 << 32)), 1);
        y0.d dVar = y0.b.f8691o;
        return new n0(new v0((o0) null, new a0(dVar.equals(y0.b.f8689m) ? y0.b.f8682e : dVar.equals(dVar) ? y0.b.f8687k : y0.b.f8685h, new t(i, 7), l3), (h0.a) null, (LinkedHashMap) null, 59));
    }
}
