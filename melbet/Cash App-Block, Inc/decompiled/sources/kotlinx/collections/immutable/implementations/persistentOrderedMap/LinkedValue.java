package kotlinx.collections.immutable.implementations.persistentOrderedMap;

/* loaded from: classes9.dex */
public final class LinkedValue {
    public final Object next;
    public final Object previous;
    public final Object value;

    public LinkedValue(Object obj, Object obj2, Object obj3) {
        this.value = obj;
        this.previous = obj2;
        this.next = obj3;
    }
}
