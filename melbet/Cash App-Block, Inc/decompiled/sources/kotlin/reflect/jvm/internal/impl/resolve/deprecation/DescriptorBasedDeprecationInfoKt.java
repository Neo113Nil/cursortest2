package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* loaded from: classes9.dex */
public final class DescriptorBasedDeprecationInfoKt {
    public static final DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1 DEPRECATED_FUNCTION_KEY = new DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1();

    public static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> getDEPRECATED_FUNCTION_KEY() {
        return DEPRECATED_FUNCTION_KEY;
    }
}
