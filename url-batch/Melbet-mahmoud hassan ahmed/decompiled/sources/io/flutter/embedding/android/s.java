package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    private static s f17192c;

    /* renamed from: a, reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f17193a = new LongSparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Long> f17194b = new PriorityQueue<>();

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicLong f17195b = new AtomicLong(0);

        /* renamed from: a, reason: collision with root package name */
        private final long f17196a;

        private a(long j7) {
            this.f17196a = j7;
        }

        public static a b() {
            return c(f17195b.incrementAndGet());
        }

        public static a c(long j7) {
            return new a(j7);
        }

        public long d() {
            return this.f17196a;
        }
    }

    private s() {
    }

    public static s a() {
        if (f17192c == null) {
            f17192c = new s();
        }
        return f17192c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f17194b.isEmpty() && this.f17194b.peek().longValue() < aVar.f17196a) {
            this.f17193a.remove(this.f17194b.poll().longValue());
        }
        if (!this.f17194b.isEmpty() && this.f17194b.peek().longValue() == aVar.f17196a) {
            this.f17194b.poll();
        }
        MotionEvent motionEvent = this.f17193a.get(aVar.f17196a);
        this.f17193a.remove(aVar.f17196a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b7 = a.b();
        this.f17193a.put(b7.f17196a, MotionEvent.obtain(motionEvent));
        this.f17194b.add(Long.valueOf(b7.f17196a));
        return b7;
    }
}
