package x1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import m4.q;
import r0.s1;
import x1.k;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23140a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f23141b;

    /* renamed from: c, reason: collision with root package name */
    public final q<x1.b> f23142c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23143d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f23144e;

    /* renamed from: f, reason: collision with root package name */
    public final List<e> f23145f;

    /* renamed from: g, reason: collision with root package name */
    public final List<e> f23146g;

    /* renamed from: h, reason: collision with root package name */
    private final i f23147h;

    public static class b extends j implements w1.f {

        /* renamed from: i, reason: collision with root package name */
        final k.a f23148i;

        public b(long j7, s1 s1Var, List<x1.b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j7, s1Var, list, aVar, list2, list3, list4);
            this.f23148i = aVar;
        }

        @Override // w1.f
        public long a(long j7, long j8) {
            return this.f23148i.i(j7, j8);
        }

        @Override // w1.f
        public long b(long j7, long j8) {
            return this.f23148i.h(j7, j8);
        }

        @Override // w1.f
        public long c(long j7) {
            return this.f23148i.j(j7);
        }

        @Override // w1.f
        public long d(long j7, long j8) {
            return this.f23148i.d(j7, j8);
        }

        @Override // w1.f
        public long e(long j7, long j8) {
            return this.f23148i.f(j7, j8);
        }

        @Override // w1.f
        public i f(long j7) {
            return this.f23148i.k(this, j7);
        }

        @Override // w1.f
        public boolean g() {
            return this.f23148i.l();
        }

        @Override // w1.f
        public long h() {
            return this.f23148i.e();
        }

        @Override // w1.f
        public long i(long j7) {
            return this.f23148i.g(j7);
        }

        @Override // w1.f
        public long j(long j7, long j8) {
            return this.f23148i.c(j7, j8);
        }

        @Override // x1.j
        public String k() {
            return null;
        }

        @Override // x1.j
        public w1.f l() {
            return this;
        }

        @Override // x1.j
        public i m() {
            return null;
        }
    }

    public static class c extends j {

        /* renamed from: i, reason: collision with root package name */
        public final Uri f23149i;

        /* renamed from: j, reason: collision with root package name */
        public final long f23150j;

        /* renamed from: k, reason: collision with root package name */
        private final String f23151k;

        /* renamed from: l, reason: collision with root package name */
        private final i f23152l;

        /* renamed from: m, reason: collision with root package name */
        private final m f23153m;

        public c(long j7, s1 s1Var, List<x1.b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j8) {
            super(j7, s1Var, list, eVar, list2, list3, list4);
            this.f23149i = Uri.parse(list.get(0).f23087a);
            i c7 = eVar.c();
            this.f23152l = c7;
            this.f23151k = str;
            this.f23150j = j8;
            this.f23153m = c7 != null ? null : new m(new i(null, 0L, j8));
        }

        @Override // x1.j
        public String k() {
            return this.f23151k;
        }

        @Override // x1.j
        public w1.f l() {
            return this.f23153m;
        }

        @Override // x1.j
        public i m() {
            return this.f23152l;
        }
    }

    private j(long j7, s1 s1Var, List<x1.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        o2.a.a(!list.isEmpty());
        this.f23140a = j7;
        this.f23141b = s1Var;
        this.f23142c = q.t(list);
        this.f23144e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f23145f = list3;
        this.f23146g = list4;
        this.f23147h = kVar.a(this);
        this.f23143d = kVar.b();
    }

    public static j o(long j7, s1 s1Var, List<x1.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j7, s1Var, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j7, s1Var, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract w1.f l();

    public abstract i m();

    public i n() {
        return this.f23147h;
    }
}
