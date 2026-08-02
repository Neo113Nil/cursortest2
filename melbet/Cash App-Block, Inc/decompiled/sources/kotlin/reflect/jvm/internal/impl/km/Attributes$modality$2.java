package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes9.dex */
public final /* synthetic */ class Attributes$modality$2 extends MutablePropertyReference1Impl {
    public static final Attributes$modality$2 INSTANCE = new Attributes$modality$2(KmClass.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Integer.valueOf(((KmClass) obj).getFlags$kotlin_metadata());
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        ((KmClass) obj).setFlags$kotlin_metadata(((Number) obj2).intValue());
    }
}
