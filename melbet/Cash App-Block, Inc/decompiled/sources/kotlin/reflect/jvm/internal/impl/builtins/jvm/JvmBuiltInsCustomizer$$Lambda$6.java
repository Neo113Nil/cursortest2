package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes9.dex */
public final class JvmBuiltInsCustomizer$$Lambda$6 implements DFS.Neighbors {
    public static final JvmBuiltInsCustomizer$$Lambda$6 INSTANCE = new JvmBuiltInsCustomizer$$Lambda$6();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj) {
        KProperty[] kPropertyArr = JvmBuiltInsCustomizer.$$delegatedProperties;
        return ((CallableMemberDescriptor) obj).getOriginal().getOverriddenDescriptors();
    }
}
