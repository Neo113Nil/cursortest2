package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* loaded from: classes9.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {
    public final DeclarationDescriptor target;

    public DeprecationCausedByFunctionNInfo(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        this.target = declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public DeprecationLevelValue getDeprecationLevel() {
        return DeprecationLevelValue.ERROR;
    }
}
