package kotlin.reflect.jvm.internal.impl.km.internal;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;

/* loaded from: classes9.dex */
public final /* synthetic */ class FlagDelegatesImplKt$functionBooleanFlag$1 extends MutablePropertyReference1Impl {
    public static final FlagDelegatesImplKt$functionBooleanFlag$1 INSTANCE = new FlagDelegatesImplKt$functionBooleanFlag$1(KmFunction.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Integer.valueOf(((KmFunction) obj).getFlags$kotlin_metadata());
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        ((KmFunction) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
    }
}
