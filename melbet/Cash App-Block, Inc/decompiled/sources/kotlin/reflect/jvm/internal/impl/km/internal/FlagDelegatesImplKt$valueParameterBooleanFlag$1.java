package kotlin.reflect.jvm.internal.impl.km.internal;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;

/* loaded from: classes9.dex */
public final /* synthetic */ class FlagDelegatesImplKt$valueParameterBooleanFlag$1 extends MutablePropertyReference1Impl {
    public static final FlagDelegatesImplKt$valueParameterBooleanFlag$1 INSTANCE = new FlagDelegatesImplKt$valueParameterBooleanFlag$1(KmValueParameter.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Integer.valueOf(((KmValueParameter) obj).getFlags$kotlin_metadata());
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        ((KmValueParameter) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
    }
}
