package kotlin.reflect.jvm.internal.impl.util;

import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner;

/* loaded from: classes9.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements ReadOnlyProperty {
    public NullableArrayMapAccessor(int i) {
        super(i);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public T getValue(AbstractArrayMapOwner<K, V> abstractArrayMapOwner, KProperty kProperty) {
        abstractArrayMapOwner.getClass();
        kProperty.getClass();
        return (T) abstractArrayMapOwner.getArrayMap().get(this.id);
    }
}
