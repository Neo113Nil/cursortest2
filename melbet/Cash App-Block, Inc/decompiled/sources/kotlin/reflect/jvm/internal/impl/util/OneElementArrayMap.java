package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {
    public final int index;
    public final Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(T t, int i) {
        super(null);
        t.getClass();
        this.value = t;
        this.index = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i) {
        if (i == this.index) {
            return (T) this.value;
        }
        return null;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 1;
    }

    public final T getValue() {
        return (T) this.value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new OneElementArrayMap$iterator$1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, T t) {
        t.getClass();
        throw new IllegalStateException();
    }
}
