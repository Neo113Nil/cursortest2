package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* loaded from: classes9.dex */
public interface Check {

    public static final class DefaultImpls {
        public static String invoke(Check check, FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            if (check.check(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }

    boolean check(FunctionDescriptor functionDescriptor);

    String getDescription();

    String invoke(FunctionDescriptor functionDescriptor);
}
