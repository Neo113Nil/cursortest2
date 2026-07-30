package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public abstract class f {
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next");
    private static final AtomicReferenceFieldUpdater _prev$FU = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public f(f fVar) {
        this._prev = fVar;
    }

    private final f getAliveSegmentLeft() {
        f prev = getPrev();
        while (prev != null && prev.isRemoved()) {
            prev = (f) _prev$FU.get(prev);
        }
        return prev;
    }

    private final f getAliveSegmentRight() {
        f next = getNext();
        kotlin.jvm.internal.s.checkNotNull(next);
        while (next.isRemoved()) {
            f next2 = next.getNext();
            if (next2 == null) {
                return next;
            }
            next = next2;
        }
        return next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getNextOrClosed() {
        return _next$FU.get(this);
    }

    private final void update$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    public final void cleanPrev() {
        _prev$FU.lazySet(this, null);
    }

    public final f getNext() {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed == e.CLOSED) {
            return null;
        }
        return (f) nextOrClosed;
    }

    public final f getPrev() {
        return (f) _prev$FU.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        return androidx.concurrent.futures.a.a(_next$FU, this, null, e.CLOSED);
    }

    public final f nextOrIfClosed(f6.a aVar) {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed != e.CLOSED) {
            return (f) nextOrClosed;
        }
        aVar.invoke();
        throw new KotlinNothingValueException();
    }

    public final void remove() {
        Object obj;
        if (isTail()) {
            return;
        }
        while (true) {
            f aliveSegmentLeft = getAliveSegmentLeft();
            f aliveSegmentRight = getAliveSegmentRight();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            do {
                obj = atomicReferenceFieldUpdater.get(aliveSegmentRight);
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, aliveSegmentRight, obj, ((f) obj) == null ? null : aliveSegmentLeft));
            if (aliveSegmentLeft != null) {
                _next$FU.set(aliveSegmentLeft, aliveSegmentRight);
            }
            if (!aliveSegmentRight.isRemoved() || aliveSegmentRight.isTail()) {
                if (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(f fVar) {
        return androidx.concurrent.futures.a.a(_next$FU, this, null, fVar);
    }
}
