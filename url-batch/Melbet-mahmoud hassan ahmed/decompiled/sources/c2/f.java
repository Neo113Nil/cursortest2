package c2;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import m4.q;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    private final c f1862a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final l f1863b = new l();

    /* renamed from: c, reason: collision with root package name */
    private final Deque<m> f1864c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private int f1865d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1866e;

    class a extends m {
        a() {
        }

        @Override // u0.h
        public void q() {
            f.this.j(this);
        }
    }

    private static final class b implements h {

        /* renamed from: f, reason: collision with root package name */
        private final long f1868f;

        /* renamed from: g, reason: collision with root package name */
        private final q<c2.b> f1869g;

        public b(long j7, q<c2.b> qVar) {
            this.f1868f = j7;
            this.f1869g = qVar;
        }

        @Override // c2.h
        public int b(long j7) {
            return this.f1868f > j7 ? 0 : -1;
        }

        @Override // c2.h
        public long d(int i7) {
            o2.a.a(i7 == 0);
            return this.f1868f;
        }

        @Override // c2.h
        public List<c2.b> e(long j7) {
            return j7 >= this.f1868f ? this.f1869g : q.x();
        }

        @Override // c2.h
        public int f() {
            return 1;
        }
    }

    public f() {
        for (int i7 = 0; i7 < 2; i7++) {
            this.f1864c.addFirst(new a());
        }
        this.f1865d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(m mVar) {
        o2.a.f(this.f1864c.size() < 2);
        o2.a.a(!this.f1864c.contains(mVar));
        mVar.h();
        this.f1864c.addFirst(mVar);
    }

    @Override // u0.d
    public void a() {
        this.f1866e = true;
    }

    @Override // c2.i
    public void b(long j7) {
    }

    @Override // u0.d
    public void flush() {
        o2.a.f(!this.f1866e);
        this.f1863b.h();
        this.f1865d = 0;
    }

    @Override // u0.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public l e() {
        o2.a.f(!this.f1866e);
        if (this.f1865d != 0) {
            return null;
        }
        this.f1865d = 1;
        return this.f1863b;
    }

    @Override // u0.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public m d() {
        o2.a.f(!this.f1866e);
        if (this.f1865d != 2 || this.f1864c.isEmpty()) {
            return null;
        }
        m removeFirst = this.f1864c.removeFirst();
        if (this.f1863b.m()) {
            removeFirst.g(4);
        } else {
            l lVar = this.f1863b;
            removeFirst.r(this.f1863b.f22413j, new b(lVar.f22413j, this.f1862a.a(((ByteBuffer) o2.a.e(lVar.f22411h)).array())), 0L);
        }
        this.f1863b.h();
        this.f1865d = 0;
        return removeFirst;
    }

    @Override // u0.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(l lVar) {
        o2.a.f(!this.f1866e);
        o2.a.f(this.f1865d == 1);
        o2.a.a(this.f1863b == lVar);
        this.f1865d = 2;
    }
}
