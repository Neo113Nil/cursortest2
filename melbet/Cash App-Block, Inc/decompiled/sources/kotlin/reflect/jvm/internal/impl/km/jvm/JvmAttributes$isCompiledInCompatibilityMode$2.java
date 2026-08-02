package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class JvmAttributes$isCompiledInCompatibilityMode$2 extends MutablePropertyReference1Impl {
    public static final JvmAttributes$isCompiledInCompatibilityMode$2 INSTANCE = new JvmAttributes$isCompiledInCompatibilityMode$2(JvmAttributes.class, "jvmFlags", "getJvmFlags(Lkotlin/metadata/KmClass;)I", 1);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        int jvmFlags;
        jvmFlags = JvmExtensionNodesKt.getJvm((KmClass) obj).getJvmFlags();
        return Integer.valueOf(jvmFlags);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        JvmExtensionNodesKt.getJvm((KmClass) obj).setJvmFlags(((Number) obj2).intValue());
    }
}
