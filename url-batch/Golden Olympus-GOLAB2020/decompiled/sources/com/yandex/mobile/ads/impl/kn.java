package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hy;
import com.yandex.mobile.ads.impl.kn;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
abstract class kn implements d32 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f28265a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<h32> f28266b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue<a> f28267c;

    /* renamed from: d, reason: collision with root package name */
    private a f28268d;

    /* renamed from: e, reason: collision with root package name */
    private long f28269e;

    /* renamed from: f, reason: collision with root package name */
    private long f28270f;

    private static final class a extends g32 implements Comparable<a> {

        /* renamed from: k, reason: collision with root package name */
        private long f28271k;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (f() != aVar2.f()) {
                return f() ? 1 : -1;
            }
            long j4 = this.f26358f - aVar2.f26358f;
            if (j4 == 0) {
                j4 = this.f28271k - aVar2.f28271k;
                if (j4 == 0) {
                    return 0;
                }
            }
            return j4 > 0 ? 1 : -1;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends h32 {

        /* renamed from: f, reason: collision with root package name */
        private hy.a<b> f28272f;

        public b(hy.a<b> aVar) {
            this.f28272f = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.hy
        public final void h() {
            this.f28272f.a(this);
        }
    }

    public kn() {
        for (int i4 = 0; i4 < 10; i4++) {
            this.f28265a.add(new a());
        }
        this.f28266b = new ArrayDeque<>();
        for (int i5 = 0; i5 < 2; i5++) {
            this.f28266b.add(new b(new hy.a() { // from class: com.yandex.mobile.ads.impl.Z8
                @Override // com.yandex.mobile.ads.impl.hy.a
                public final void a(hy hyVar) {
                    kn.this.a((kn.b) hyVar);
                }
            }));
        }
        this.f28267c = new PriorityQueue<>();
    }

    protected abstract void b(g32 g32Var);

    protected abstract c32 c();

    @Override // com.yandex.mobile.ads.impl.dy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(g32 g32Var) {
        if (g32Var != this.f28268d) {
            throw new IllegalArgumentException();
        }
        a aVar = (a) g32Var;
        if (aVar.e()) {
            aVar.b();
            this.f28265a.add(aVar);
        } else {
            long j4 = this.f28270f;
            this.f28270f = 1 + j4;
            aVar.f28271k = j4;
            this.f28267c.add(aVar);
        }
        this.f28268d = null;
    }

    @Override // com.yandex.mobile.ads.impl.dy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public g32 b() {
        if (this.f28268d != null) {
            throw new IllegalStateException();
        }
        if (this.f28265a.isEmpty()) {
            return null;
        }
        a pollFirst = this.f28265a.pollFirst();
        this.f28268d = pollFirst;
        return pollFirst;
    }

    @Override // com.yandex.mobile.ads.impl.dy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public h32 a() {
        if (this.f28266b.isEmpty()) {
            return null;
        }
        while (!this.f28267c.isEmpty()) {
            a peek = this.f28267c.peek();
            int i4 = u82.f32873a;
            if (peek.f26358f > this.f28269e) {
                break;
            }
            a poll = this.f28267c.poll();
            if (poll.f()) {
                h32 pollFirst = this.f28266b.pollFirst();
                pollFirst.b(4);
                poll.b();
                this.f28265a.add(poll);
                return pollFirst;
            }
            b(poll);
            if (h()) {
                c32 c4 = c();
                h32 pollFirst2 = this.f28266b.pollFirst();
                pollFirst2.a(poll.f26358f, c4, Long.MAX_VALUE);
                poll.b();
                this.f28265a.add(poll);
                return pollFirst2;
            }
            poll.b();
            this.f28265a.add(poll);
        }
        return null;
    }

    protected final h32 f() {
        return this.f28266b.pollFirst();
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public void flush() {
        this.f28270f = 0L;
        this.f28269e = 0L;
        while (!this.f28267c.isEmpty()) {
            a poll = this.f28267c.poll();
            int i4 = u82.f32873a;
            poll.b();
            this.f28265a.add(poll);
        }
        a aVar = this.f28268d;
        if (aVar != null) {
            aVar.b();
            this.f28265a.add(aVar);
            this.f28268d = null;
        }
    }

    protected final long g() {
        return this.f28269e;
    }

    protected abstract boolean h();

    protected final void a(h32 h32Var) {
        h32Var.b();
        this.f28266b.add(h32Var);
    }

    @Override // com.yandex.mobile.ads.impl.d32
    public void a(long j4) {
        this.f28269e = j4;
    }
}
