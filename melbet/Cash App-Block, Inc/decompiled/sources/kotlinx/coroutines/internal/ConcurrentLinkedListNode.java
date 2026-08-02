package kotlinx.coroutines.internal;

import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class ConcurrentLinkedListNode {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long _next$volatile$FU$offset;
    public static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU;
    public static final /* synthetic */ long _prev$volatile$FU$offset;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        _next$volatile$FU$offset = unsafe.objectFieldOffset(ConcurrentLinkedListNode.class.getDeclaredField("_next$volatile"));
        _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
        _prev$volatile$FU$offset = unsafe.objectFieldOffset(ConcurrentLinkedListNode.class.getDeclaredField("_prev$volatile"));
    }

    public ConcurrentLinkedListNode(Segment segment) {
        this._prev$volatile = segment;
    }

    public final void cleanPrev() {
        _prev$volatile$FU.getClass();
        ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, _prev$volatile$FU$offset, (Object) null);
    }

    public final ConcurrentLinkedListNode getAliveSegmentLeft() {
        ConcurrentLinkedListNode prev = getPrev();
        while (prev != null && prev.isRemoved()) {
            _prev$volatile$FU.getClass();
            prev = (ConcurrentLinkedListNode) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(prev, _prev$volatile$FU$offset);
        }
        return prev;
    }

    public final ConcurrentLinkedListNode getNext() {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed == InlineList.CLOSED) {
            return null;
        }
        return (ConcurrentLinkedListNode) nextOrClosed;
    }

    public final Object getNextOrClosed() {
        _next$volatile$FU.getClass();
        return ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _next$volatile$FU$offset);
    }

    public final ConcurrentLinkedListNode getPrev() {
        _prev$volatile$FU.getClass();
        return (ConcurrentLinkedListNode) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _prev$volatile$FU$offset);
    }

    public abstract boolean isRemoved();

    public final boolean markAsClosed() {
        Symbol symbol = InlineList.CLOSED;
        while (true) {
            _next$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _next$volatile$FU$offset;
            ConcurrentLinkedListNode concurrentLinkedListNode = this;
            if (unsafe.compareAndSwapObject(concurrentLinkedListNode, j, (Object) null, symbol)) {
                return true;
            }
            if (unsafe.getObjectVolatile(concurrentLinkedListNode, j) != null) {
                return false;
            }
            this = concurrentLinkedListNode;
        }
    }

    public final void remove() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Unsafe unsafe;
        Object objectVolatile;
        ConcurrentLinkedListNode next;
        if (getNext() == null) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode aliveSegmentLeft = getAliveSegmentLeft();
            ConcurrentLinkedListNode next2 = getNext();
            next2.getClass();
            while (next2.isRemoved() && (next = next2.getNext()) != null) {
                next2 = next;
            }
            do {
                atomicReferenceFieldUpdater = _prev$volatile$FU;
                atomicReferenceFieldUpdater.getClass();
                unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                objectVolatile = unsafe.getObjectVolatile(next2, _prev$volatile$FU$offset);
            } while (!SizeMode$EnumUnboxingLocalUtility.m(atomicReferenceFieldUpdater, next2, objectVolatile, ((ConcurrentLinkedListNode) objectVolatile) == null ? null : aliveSegmentLeft));
            if (aliveSegmentLeft != null) {
                _next$volatile$FU.getClass();
                unsafe.putObjectVolatile(aliveSegmentLeft, _next$volatile$FU$offset, next2);
            }
            if (!next2.isRemoved() || next2.getNext() == null) {
                if (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(Segment segment) {
        while (true) {
            _next$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = _next$volatile$FU$offset;
            ConcurrentLinkedListNode concurrentLinkedListNode = this;
            Segment segment2 = segment;
            if (unsafe.compareAndSwapObject(concurrentLinkedListNode, j, (Object) null, segment2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(concurrentLinkedListNode, j) != null) {
                return false;
            }
            this = concurrentLinkedListNode;
            segment = segment2;
        }
    }
}
