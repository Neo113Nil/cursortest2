package W0;

import V0.i;
import W.J;
import a.AbstractC0124a;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class h implements V0.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f3454a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3455b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f3456c;

    /* renamed from: d, reason: collision with root package name */
    public g f3457d;

    /* renamed from: e, reason: collision with root package name */
    public long f3458e;

    /* renamed from: f, reason: collision with root package name */
    public long f3459f;

    /* renamed from: g, reason: collision with root package name */
    public long f3460g;

    public h() {
        for (int i4 = 0; i4 < 10; i4++) {
            this.f3454a.add(new g(1));
        }
        this.f3455b = new ArrayDeque();
        for (int i5 = 0; i5 < 2; i5++) {
            ArrayDeque arrayDeque = this.f3455b;
            D0.a aVar = new D0.a(8, this);
            V0.c cVar = new V0.c();
            cVar.f3192h = aVar;
            arrayDeque.add(cVar);
        }
        this.f3456c = new ArrayDeque();
        this.f3460g = -9223372036854775807L;
    }

    @Override // Z.c
    public final void a(long j4) {
        this.f3460g = j4;
    }

    @Override // V0.e
    public final void b(long j4) {
        this.f3458e = j4;
    }

    @Override // Z.c
    public final Object d() {
        AbstractC0124a.t(this.f3457d == null);
        ArrayDeque arrayDeque = this.f3454a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f3457d = gVar;
        return gVar;
    }

    @Override // Z.c
    public final void e(i iVar) {
        AbstractC0124a.h(iVar == this.f3457d);
        g gVar = (g) iVar;
        if (!gVar.g(4)) {
            long j4 = gVar.f3783g;
            if (j4 != Long.MIN_VALUE) {
                long j5 = this.f3460g;
                if (j5 != -9223372036854775807L && j4 < j5) {
                    gVar.h();
                    this.f3454a.add(gVar);
                    this.f3457d = null;
                }
            }
        }
        long j6 = this.f3459f;
        this.f3459f = 1 + j6;
        gVar.f3453k = j6;
        this.f3456c.add(gVar);
        this.f3457d = null;
    }

    public abstract t1.h f();

    @Override // Z.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f3459f = 0L;
        this.f3458e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f3456c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f3454a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            String str = J.f3263a;
            gVar.h();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f3457d;
        if (gVar2 != null) {
            gVar2.h();
            arrayDeque.add(gVar2);
            this.f3457d = null;
        }
    }

    public abstract void g(g gVar);

    @Override // Z.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public V0.c c() {
        ArrayDeque arrayDeque = this.f3455b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f3456c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            g gVar = (g) arrayDeque2.peek();
            String str = J.f3263a;
            if (gVar.f3783g > this.f3458e) {
                return null;
            }
            g gVar2 = (g) arrayDeque2.poll();
            boolean g4 = gVar2.g(4);
            ArrayDeque arrayDeque3 = this.f3454a;
            if (g4) {
                V0.c cVar = (V0.c) arrayDeque.pollFirst();
                cVar.a(4);
                gVar2.h();
                arrayDeque3.add(gVar2);
                return cVar;
            }
            g(gVar2);
            if (i()) {
                t1.h f4 = f();
                V0.c cVar2 = (V0.c) arrayDeque.pollFirst();
                long j4 = gVar2.f3783g;
                cVar2.f3786c = j4;
                cVar2.f3189e = f4;
                cVar2.f3190f = j4;
                gVar2.h();
                arrayDeque3.add(gVar2);
                return cVar2;
            }
            gVar2.h();
            arrayDeque3.add(gVar2);
        }
    }

    public abstract boolean i();

    @Override // Z.c
    public void release() {
    }
}
