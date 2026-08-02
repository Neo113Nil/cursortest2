package kotlin.reflect.jvm.internal.impl.km.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;

/* loaded from: classes9.dex */
public final class BooleanFlagDelegate<Node> {
    public final FlagImpl flag;
    public final KMutableProperty1 flags;
    public final int mask;

    public BooleanFlagDelegate(KMutableProperty1 kMutableProperty1, FlagImpl flagImpl) {
        kMutableProperty1.getClass();
        flagImpl.getClass();
        this.flags = kMutableProperty1;
        this.flag = flagImpl;
        if (flagImpl.getBitWidth$kotlin_metadata() == 1 && flagImpl.getValue$kotlin_metadata() == 1) {
            this.mask = 1 << flagImpl.getOffset$kotlin_metadata();
        } else {
            a$$ExternalSyntheticBUOutline0.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", flagImpl, " was passed");
            throw null;
        }
    }

    public final boolean getValue(Node node, KProperty kProperty) {
        kProperty.getClass();
        return this.flag.invoke(((Number) this.flags.get(node)).intValue());
    }

    public final void setValue(Node node, KProperty kProperty, boolean z) {
        int intValue;
        kProperty.getClass();
        int i = this.mask;
        KMutableProperty1 kMutableProperty1 = this.flags;
        if (z) {
            intValue = i | ((Number) kMutableProperty1.get(node)).intValue();
        } else {
            intValue = (~i) & ((Number) kMutableProperty1.get(node)).intValue();
        }
        kMutableProperty1.set(node, Integer.valueOf(intValue));
    }
}
