package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes9.dex */
public final class ClassicBuiltinSpecialProperties {
    public static final ClassicBuiltinSpecialProperties INSTANCE = new ClassicBuiltinSpecialProperties();

    public final String getBuiltinSpecialPropertyGetterName(CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        callableMemberDescriptor.getClass();
        KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        CallableMemberDescriptor firstOverridden$default = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, SpecialBuiltinMembers$$Lambda$0.INSTANCE$3, 1, null);
        if (firstOverridden$default == null || (name = BuiltinSpecialProperties.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(DescriptorUtilsKt.getFqNameSafe(firstOverridden$default))) == null) {
            return null;
        }
        return name.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        BuiltinSpecialProperties builtinSpecialProperties = BuiltinSpecialProperties.INSTANCE;
        if (!builtinSpecialProperties.getSPECIAL_SHORT_NAMES().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (CollectionsKt.contains(builtinSpecialProperties.getSPECIAL_FQ_NAMES(), DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor)) && callableMemberDescriptor.getValueParameters().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        if (collection.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
            callableMemberDescriptor2.getClass();
            if (classicBuiltinSpecialProperties.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }
}
