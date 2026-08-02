package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReferenceImpl implements Function1 {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2(1, ValueParameterDescriptor.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
        valueParameterDescriptor.getClass();
        return Boolean.valueOf(valueParameterDescriptor.declaresDefaultValue());
    }
}
