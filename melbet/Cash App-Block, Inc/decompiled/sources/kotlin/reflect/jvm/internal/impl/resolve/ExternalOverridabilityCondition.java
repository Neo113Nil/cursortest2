package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* loaded from: classes9.dex */
public interface ExternalOverridabilityCondition {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Contract {
        public static final /* synthetic */ Contract[] $VALUES;
        public static final Contract BOTH;
        public static final Contract CONFLICTS_ONLY;
        public static final Contract SUCCESS_ONLY;

        static {
            Contract contract = new Contract("CONFLICTS_ONLY", 0);
            CONFLICTS_ONLY = contract;
            Contract contract2 = new Contract("SUCCESS_ONLY", 1);
            SUCCESS_ONLY = contract2;
            Contract contract3 = new Contract("BOTH", 2);
            BOTH = contract3;
            $VALUES = new Contract[]{contract, contract2, contract3};
        }

        public static Contract valueOf(String str) {
            return (Contract) Enum.valueOf(Contract.class, str);
        }

        public static Contract[] values() {
            return (Contract[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {
        public static final /* synthetic */ Result[] $VALUES;
        public static final Result INCOMPATIBLE;
        public static final Result OVERRIDABLE;
        public static final Result UNKNOWN;

        static {
            Result result = new Result("OVERRIDABLE", 0);
            OVERRIDABLE = result;
            Result result2 = new Result("INCOMPATIBLE", 1);
            INCOMPATIBLE = result2;
            Result result3 = new Result("UNKNOWN", 2);
            UNKNOWN = result3;
            $VALUES = new Result[]{result, result2, result3};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    Contract getContract();

    Result isOverridable(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor);
}
