package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes9.dex */
public final /* synthetic */ class Attributes$visibility$10 extends MutablePropertyReference1Impl {
    public static final Attributes$visibility$10 INSTANCE = new Attributes$visibility$10(KmFunction.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Integer.valueOf(((KmFunction) obj).getFlags$kotlin_metadata());
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        ((KmFunction) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
    }
}
