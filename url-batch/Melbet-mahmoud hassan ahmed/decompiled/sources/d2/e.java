package d2;

import c2.i;
import c2.l;
import c2.m;
import d2.e;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import o2.m0;
import u0.h;

/* loaded from: classes.dex */
abstract class e implements i {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f15630a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<m> f15631b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue<b> f15632c;

    /* renamed from: d, reason: collision with root package name */
    private b f15633d;

    /* renamed from: e, reason: collision with root package name */
    private long f15634e;

    /* renamed from: f, reason: collision with root package name */
    private long f15635f;

    private static final class b extends l implements Comparable<b> {

        /* renamed from: o, reason: collision with root package name */
        private long f15636o;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (m() != bVar.m()) {
                return m() ? 1 : -1;
            }
            long j7 = this.f22413j - bVar.f22413j;
            if (j7 == 0) {
                j7 = this.f15636o - bVar.f15636o;
                if (j7 == 0) {
                    return 0;
                }
            }
            return j7 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends m {

        /* renamed from: k, reason: collision with root package name */
        private h.a<c> f15637k;

        public c(h.a<c> aVar) {
            this.f15637k = aVar;
        }

        @Override // u0.h
        public final void q() {
            this.f15637k.a(this);
        }
    }

    public e() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f15630a.add(new b());
        }
        this.f15631b = new ArrayDeque<>();
        for (int i8 = 0; i8 < 2; i8++) {
            this.f15631b.add(new c(new h.a() { // from class: d2.d
                @Override // u0.h.a
                public final void a(h hVar) {
                    e.this.o((e.c) hVar);
                }
            }));
        }
        this.f15632c = new PriorityQueue<>();
    }

    private void n(b bVar) {
        bVar.h();
        this.f15630a.add(bVar);
    }

    @Override // u0.d
    public void a() {
    }

    @Override // c2.i
    public void b(long j7) {
        this.f15634e = j7;
    }

    protected abstract c2.h f();

    @Override // u0.d
    public void flush() {
        this.f15635f = 0L;
        this.f15634e = 0L;
        while (!this.f15632c.isEmpty()) {
            n((b) m0.j(this.f15632c.poll()));
        }
        b bVar = this.f15633d;
        if (bVar != null) {
            n(bVar);
            this.f15633d = null;
        }
    }

    protected abstract void g(l lVar);

    @Override // u0.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public l e() {
        o2.a.f(this.f15633d == null);
        if (this.f15630a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f15630a.pollFirst();
        this.f15633d = pollFirst;
        return pollFirst;
    }

    @Override // u0.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public m d() {
        m mVar;
        if (this.f15631b.isEmpty()) {
            return null;
        }
        while (!this.f15632c.isEmpty() && ((b) m0.j(this.f15632c.peek())).f22413j <= this.f15634e) {
            b bVar = (b) m0.j(this.f15632c.poll());
            if (bVar.m()) {
                mVar = (m) m0.j(this.f15631b.pollFirst());
                mVar.g(4);
            } else {
                g(bVar);
                if (l()) {
                    c2.h f7 = f();
                    mVar = (m) m0.j(this.f15631b.pollFirst());
                    mVar.r(bVar.f22413j, f7, Long.MAX_VALUE);
                } else {
                    n(bVar);
                }
            }
            n(bVar);
            return mVar;
        }
        return null;
    }

    protected final m j() {
        return this.f15631b.pollFirst();
    }

    protected final long k() {
        return this.f15634e;
    }

    protected abstract boolean l();

    @Override // u0.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(l lVar) {
        o2.a.a(lVar == this.f15633d);
        b bVar = (b) lVar;
        if (bVar.l()) {
            n(bVar);
        } else {
            long j7 = this.f15635f;
            this.f15635f = 1 + j7;
            bVar.f15636o = j7;
            this.f15632c.add(bVar);
        }
        this.f15633d = null;
    }

    protected void o(m mVar) {
        mVar.h();
        this.f15631b.add(mVar);
    }
}
