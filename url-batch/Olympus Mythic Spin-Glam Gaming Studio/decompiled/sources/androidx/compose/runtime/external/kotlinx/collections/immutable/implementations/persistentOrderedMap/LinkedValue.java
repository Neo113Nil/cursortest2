package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yandex.div.core.ScrollDirection;
import kotlin.Metadata;

/* compiled from: PersistentOrderedMap.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "V", "", "value", "previous", ScrollDirection.NEXT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPrevious", "getNext", "withValue", "newValue", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "withPrevious", "newPrevious", "withNext", "newNext", "hasNext", "", "getHasNext", "()Z", "hasPrevious", "getHasPrevious", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LinkedValue<V> {
    private final Object next;
    private final Object previous;
    private final Object value;

    public LinkedValue(Object obj, Object obj2, Object obj3) {
        this.value = obj;
        this.previous = obj2;
        this.next = obj3;
    }

    public final Object getNext() {
        return this.next;
    }

    public final Object getPrevious() {
        return this.previous;
    }

    public final Object getValue() {
        return this.value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkedValue(Object obj) {
        this(obj, r0, r0);
        EndOfChain endOfChain = EndOfChain.INSTANCE;
    }

    public LinkedValue(Object obj, Object obj2) {
        this(obj, obj2, EndOfChain.INSTANCE);
    }

    public final LinkedValue withValue(Object newValue) {
        return new LinkedValue(newValue, this.previous, this.next);
    }

    public final LinkedValue withPrevious(Object newPrevious) {
        return new LinkedValue(this.value, newPrevious, this.next);
    }

    public final LinkedValue withNext(Object newNext) {
        return new LinkedValue(this.value, this.previous, newNext);
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }
}
