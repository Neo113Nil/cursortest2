package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yandex.div.core.ScrollDirection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: PersistentHashSetIterator.kt */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0012R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010 \u0012\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)V", "", "pathIndex", "moveToNextNodeWithData", "(I)I", "", "ensureNextElementIsReady", "()V", "", "hasNext", "()Z", ScrollDirection.NEXT, "()Ljava/lang/Object;", "currentElement", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "path", "Ljava/util/List;", "getPath", "()Ljava/util/List;", "pathLastIndex", "I", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "Z", "getHasNext$annotations", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {
    private boolean hasNext;
    private final List path;
    private int pathLastIndex;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentHashSetIterator(TrieNode trieNode) {
        List mutableListOf = CollectionsKt.mutableListOf(new TrieNodeIterator());
        this.path = mutableListOf;
        this.hasNext = true;
        TrieNodeIterator.reset$default((TrieNodeIterator) mutableListOf.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    protected final List getPath() {
        return this.path;
    }

    protected final void setPathLastIndex(int i) {
        this.pathLastIndex = i;
    }

    private final int moveToNextNodeWithData(int pathIndex) {
        if (((TrieNodeIterator) this.path.get(pathIndex)).hasNextElement()) {
            return pathIndex;
        }
        if (!((TrieNodeIterator) this.path.get(pathIndex)).hasNextNode()) {
            return -1;
        }
        TrieNode currentNode = ((TrieNodeIterator) this.path.get(pathIndex)).currentNode();
        int i = pathIndex + 1;
        if (i == this.path.size()) {
            this.path.add(new TrieNodeIterator());
        }
        TrieNodeIterator.reset$default((TrieNodeIterator) this.path.get(i), currentNode.getBuffer(), 0, 2, null);
        return moveToNextNodeWithData(i);
    }

    private final void ensureNextElementIsReady() {
        if (((TrieNodeIterator) this.path.get(this.pathLastIndex)).hasNextElement()) {
            return;
        }
        for (int i = this.pathLastIndex; -1 < i; i--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i);
            if (moveToNextNodeWithData == -1 && ((TrieNodeIterator) this.path.get(i)).hasNextCell()) {
                ((TrieNodeIterator) this.path.get(i)).moveToNextCell();
                moveToNextNodeWithData = moveToNextNodeWithData(i);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i > 0) {
                ((TrieNodeIterator) this.path.get(i - 1)).moveToNextCell();
            }
            ((TrieNodeIterator) this.path.get(i)).reset(TrieNode.INSTANCE.getEMPTY$runtime().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        Object nextElement = ((TrieNodeIterator) this.path.get(this.pathLastIndex)).nextElement();
        ensureNextElementIsReady();
        return nextElement;
    }

    protected final Object currentElement() {
        CommonFunctionsKt.m1202assert(hasNext());
        return ((TrieNodeIterator) this.path.get(this.pathLastIndex)).currentElement();
    }
}
