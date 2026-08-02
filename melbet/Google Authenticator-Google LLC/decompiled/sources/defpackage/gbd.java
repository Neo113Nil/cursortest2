package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbd {
    private final Deque a;
    private final Consumer b;
    private final int c;

    public gbd(int i, Consumer consumer) {
        this.c = i;
        this.b = consumer;
        this.a = new ArrayDeque(i);
    }

    public final void a() {
        while (true) {
            Object poll = this.a.poll();
            if (poll == null) {
                return;
            } else {
                this.b.accept(poll);
            }
        }
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean c(Object obj) {
        Deque deque = this.a;
        ArrayDeque arrayDeque = new ArrayDeque(deque.size());
        while (deque.peek() != null && deque.peek() != obj) {
            arrayDeque.add(deque.poll());
        }
        if (deque.peek() != obj) {
            while (true) {
                Object pollLast = arrayDeque.pollLast();
                if (pollLast == null) {
                    return false;
                }
                deque.addFirst(pollLast);
            }
        } else {
            deque.poll();
            while (true) {
                Object poll = arrayDeque.poll();
                if (poll == null) {
                    return true;
                }
                this.b.accept(poll);
            }
        }
    }

    public final void d(Object obj) {
        Deque deque = this.a;
        ArrayDeque arrayDeque = new ArrayDeque(deque.size());
        while (true) {
            Object poll = deque.poll();
            if (poll == null) {
                break;
            } else if (arrayDeque.size() < this.c - 1) {
                arrayDeque.add(poll);
            } else {
                this.b.accept(poll);
            }
        }
        while (true) {
            Object poll2 = arrayDeque.poll();
            if (poll2 == null) {
                deque.add(obj);
                return;
            }
            deque.add(poll2);
        }
    }
}
