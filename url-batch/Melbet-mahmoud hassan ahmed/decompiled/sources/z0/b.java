package z0;

import java.util.Objects;
import w0.a;
import w0.m;
import w0.s;
import w0.v;

/* loaded from: classes.dex */
final class b extends w0.a {

    /* renamed from: z0.b$b, reason: collision with other inner class name */
    private static final class C0157b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final v f23485a;

        /* renamed from: b, reason: collision with root package name */
        private final int f23486b;

        /* renamed from: c, reason: collision with root package name */
        private final s.a f23487c;

        private C0157b(v vVar, int i7) {
            this.f23485a = vVar;
            this.f23486b = i7;
            this.f23487c = new s.a();
        }

        private long c(m mVar) {
            while (mVar.m() < mVar.a() - 6 && !s.h(mVar, this.f23485a, this.f23486b, this.f23487c)) {
                mVar.o(1);
            }
            if (mVar.m() < mVar.a() - 6) {
                return this.f23487c.f22962a;
            }
            mVar.o((int) (mVar.a() - mVar.m()));
            return this.f23485a.f22975j;
        }

        @Override // w0.a.f
        public a.e a(m mVar, long j7) {
            long p7 = mVar.p();
            long c7 = c(mVar);
            long m7 = mVar.m();
            mVar.o(Math.max(6, this.f23485a.f22968c));
            long c8 = c(mVar);
            return (c7 > j7 || c8 <= j7) ? c8 <= j7 ? a.e.f(c8, mVar.m()) : a.e.d(c7, p7) : a.e.e(m7);
        }

        @Override // w0.a.f
        public /* synthetic */ void b() {
            w0.b.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final v vVar, int i7, long j7, long j8) {
        super(new a.d() { // from class: z0.a
            @Override // w0.a.d
            public final long a(long j9) {
                return v.this.i(j9);
            }
        }, new C0157b(vVar, i7), vVar.f(), 0L, vVar.f22975j, j7, j8, vVar.d(), Math.max(6, vVar.f22968c));
        Objects.requireNonNull(vVar);
    }
}
