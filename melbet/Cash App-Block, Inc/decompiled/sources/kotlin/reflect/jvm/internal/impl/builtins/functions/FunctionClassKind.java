package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class FunctionClassKind {
    public static final /* synthetic */ FunctionClassKind[] $VALUES;
    public static final Companion Companion;
    public static final FunctionClassKind Function;
    public static final FunctionClassKind KFunction;
    public static final FunctionClassKind KSuspendFunction;
    public static final FunctionClassKind SuspendFunction;
    public static final FunctionClassKind UNKNOWN;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FunctionClassKind getFunctionClassKind(FunctionTypeKind functionTypeKind) {
            functionTypeKind.getClass();
            return Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.Function.INSTANCE) ? FunctionClassKind.Function : Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE) ? FunctionClassKind.SuspendFunction : Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE) ? FunctionClassKind.KFunction : Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }
    }

    static {
        FunctionClassKind functionClassKind = new FunctionClassKind("Function", 0);
        Function = functionClassKind;
        FunctionClassKind functionClassKind2 = new FunctionClassKind("SuspendFunction", 1);
        SuspendFunction = functionClassKind2;
        FunctionClassKind functionClassKind3 = new FunctionClassKind("KFunction", 2);
        KFunction = functionClassKind3;
        FunctionClassKind functionClassKind4 = new FunctionClassKind("KSuspendFunction", 3);
        KSuspendFunction = functionClassKind4;
        FunctionClassKind functionClassKind5 = new FunctionClassKind("UNKNOWN", 4);
        UNKNOWN = functionClassKind5;
        $VALUES = new FunctionClassKind[]{functionClassKind, functionClassKind2, functionClassKind3, functionClassKind4, functionClassKind5};
        Companion = new Companion(null);
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }
}
