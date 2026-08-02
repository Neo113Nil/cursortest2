package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;

/* loaded from: classes9.dex */
public abstract class AbstractModifierChecks {
    public final CheckResult check(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        for (Checks checks : getChecks$descriptors()) {
            if (checks.isApplicable(functionDescriptor)) {
                return checks.checkAll(functionDescriptor);
            }
        }
        return CheckResult.IllegalFunctionName.INSTANCE;
    }

    public abstract List<Checks> getChecks$descriptors();
}
