package j4;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
final class y<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18197a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue<x<TResult>> f18198b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18199c;

    y() {
    }

    public final void a(x<TResult> xVar) {
        synchronized (this.f18197a) {
            if (this.f18198b == null) {
                this.f18198b = new ArrayDeque();
            }
            this.f18198b.add(xVar);
        }
    }

    public final void b(h<TResult> hVar) {
        x<TResult> poll;
        synchronized (this.f18197a) {
            if (this.f18198b != null && !this.f18199c) {
                this.f18199c = true;
                while (true) {
                    synchronized (this.f18197a) {
                        poll = this.f18198b.poll();
                        if (poll == null) {
                            this.f18199c = false;
                            return;
                        }
                    }
                    poll.a(hVar);
                }
            }
        }
    }
}
