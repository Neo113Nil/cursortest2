package kotlin.reflect.jvm.internal.impl.km.internal;

import java.lang.Enum;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* loaded from: classes9.dex */
public final class EnumFlagDelegate<Node, E extends Enum<E>> {
    public final EnumEntries entries;
    public final List flagValues;
    public final KMutableProperty1 flags;
    public final Flags.FlagField protoSet;

    public EnumFlagDelegate(KMutableProperty1 kMutableProperty1, Flags.FlagField<? extends Internal.EnumLite> flagField, EnumEntries enumEntries, List<FlagImpl> list) {
        kMutableProperty1.getClass();
        flagField.getClass();
        enumEntries.getClass();
        list.getClass();
        this.flags = kMutableProperty1;
        this.protoSet = flagField;
        this.entries = enumEntries;
        this.flagValues = list;
    }

    public final E getValue(Node node, KProperty kProperty) {
        kProperty.getClass();
        return (E) this.entries.get(((Internal.EnumLite) this.protoSet.get(((Number) this.flags.get(node)).intValue())).getNumber());
    }

    public final void setValue(Node node, KProperty kProperty, E e) {
        kProperty.getClass();
        e.getClass();
        FlagImpl flagImpl = (FlagImpl) this.flagValues.get(e.ordinal());
        KMutableProperty1 kMutableProperty1 = this.flags;
        kMutableProperty1.set(node, Integer.valueOf(flagImpl.plus$kotlin_metadata(((Number) kMutableProperty1.get(node)).intValue())));
    }
}
