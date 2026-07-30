package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public class t {
    private static final AtomicReferenceFieldUpdater _cur$FU = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_cur");
    private volatile Object _cur;

    public t(boolean z7) {
        this._cur = new u(8, z7);
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final boolean addLast(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$FU;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            int addLast = uVar.addLast(obj);
            if (addLast == 0) {
                return true;
            }
            if (addLast == 1) {
                androidx.concurrent.futures.a.a(_cur$FU, this, uVar, uVar.next());
            } else if (addLast == 2) {
                return false;
            }
        }
    }

    public final void close() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$FU;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            if (uVar.close()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(_cur$FU, this, uVar, uVar.next());
            }
        }
    }

    public final int getSize() {
        return ((u) _cur$FU.get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((u) _cur$FU.get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((u) _cur$FU.get(this)).isEmpty();
    }

    public final <R> List<R> map(f6.l lVar) {
        return ((u) _cur$FU.get(this)).map(lVar);
    }

    public final Object removeFirstOrNull() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$FU;
        while (true) {
            u uVar = (u) atomicReferenceFieldUpdater.get(this);
            Object removeFirstOrNull = uVar.removeFirstOrNull();
            if (removeFirstOrNull != u.REMOVE_FROZEN) {
                return removeFirstOrNull;
            }
            androidx.concurrent.futures.a.a(_cur$FU, this, uVar, uVar.next());
        }
    }
}
