package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes9.dex */
public final class NoDefaultAndVarargsCheck implements Check {
    public static final NoDefaultAndVarargsCheck INSTANCE = new NoDefaultAndVarargsCheck();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean check(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        valueParameters.getClass();
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            valueParameterDescriptor.getClass();
            if (DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final /* bridge */ String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
