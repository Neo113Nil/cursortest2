package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public abstract class CheckResult {
    public final boolean isSuccess;

    public static final class IllegalFunctionName extends CheckResult {
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName(false, null);
    }

    public static final class IllegalSignature extends CheckResult {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(String str) {
            super(false, null);
            str.getClass();
        }
    }

    public static final class SuccessCheck extends CheckResult {
        public static final SuccessCheck INSTANCE = new SuccessCheck(true, null);
    }

    public CheckResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this.isSuccess = z;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
