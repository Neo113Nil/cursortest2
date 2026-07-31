package androidx.compose.runtime.snapshots;

import com.yandex.div.core.ScrollDirection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0011\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$¨\u0006("}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "K", "V", "", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "map", "", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", "", "remove", "()V", "", "hasNext", "()Z", "advance", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getMap", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "", "modification", "I", "getModification", "()I", "setModification", "(I)V", "current", "Ljava/util/Map$Entry;", "getCurrent", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", ScrollDirection.NEXT, "getNext", "setNext", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
abstract class StateMapMutableIterator<K, V> {
    private Map.Entry current;
    private final Iterator iterator;
    private final SnapshotStateMap map;
    private int modification;
    private Map.Entry next;

    public StateMapMutableIterator(SnapshotStateMap snapshotStateMap, Iterator it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getModification$runtime();
        advance();
    }

    public final SnapshotStateMap getMap() {
        return this.map;
    }

    protected final Map.Entry getCurrent() {
        return this.current;
    }

    protected final Map.Entry getNext() {
        return this.next;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    protected final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? (Map.Entry) this.iterator.next() : null;
    }

    public final void remove() {
        if (getMap().getModification$runtime() == this.modification) {
            Map.Entry entry = this.current;
            if (entry != null) {
                this.map.remove(entry.getKey());
                this.current = null;
                Unit unit = Unit.INSTANCE;
                this.modification = getMap().getModification$runtime();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
