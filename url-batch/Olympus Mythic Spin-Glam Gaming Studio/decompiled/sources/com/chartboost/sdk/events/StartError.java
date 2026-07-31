package com.chartboost.sdk.events;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/chartboost/sdk/events/StartError;", "Lcom/chartboost/sdk/events/CBError;", "code", "Lcom/chartboost/sdk/events/StartError$Code;", TelemetryCategory.EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/chartboost/sdk/events/StartError$Code;Ljava/lang/Exception;)V", "getCode", "()Lcom/chartboost/sdk/events/StartError$Code;", "getException", "()Ljava/lang/Exception;", "toString", "", "Code", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StartError implements CBError {

    @NotNull
    private final Code code;

    @Nullable
    private final Exception exception;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/chartboost/sdk/events/StartError$Code;", "", IronSourceConstants.EVENTS_ERROR_CODE, "", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "INVALID_CREDENTIALS", "NETWORK_FAILURE", "SERVER_ERROR", "INTERNAL", "DISABLED", "NO_CONTEXT", "INVALID_CONFIGURATION", "OS_VERSION_NOT_SUPPORTED", "PERMISSIONS_NOT_SET", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Code {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Code[] $VALUES;
        private final int errorCode;
        public static final Code INVALID_CREDENTIALS = new Code("INVALID_CREDENTIALS", 0, 0);
        public static final Code NETWORK_FAILURE = new Code("NETWORK_FAILURE", 1, 1);
        public static final Code SERVER_ERROR = new Code("SERVER_ERROR", 2, 2);
        public static final Code INTERNAL = new Code("INTERNAL", 3, 3);
        public static final Code DISABLED = new Code("DISABLED", 4, 4);
        public static final Code NO_CONTEXT = new Code("NO_CONTEXT", 5, 5);
        public static final Code INVALID_CONFIGURATION = new Code("INVALID_CONFIGURATION", 6, 6);
        public static final Code OS_VERSION_NOT_SUPPORTED = new Code("OS_VERSION_NOT_SUPPORTED", 7, 7);
        public static final Code PERMISSIONS_NOT_SET = new Code("PERMISSIONS_NOT_SET", 8, 8);

        private static final /* synthetic */ Code[] $values() {
            return new Code[]{INVALID_CREDENTIALS, NETWORK_FAILURE, SERVER_ERROR, INTERNAL, DISABLED, NO_CONTEXT, INVALID_CONFIGURATION, OS_VERSION_NOT_SUPPORTED, PERMISSIONS_NOT_SET};
        }

        static {
            Code[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Code(String str, int i, int i2) {
            this.errorCode = i2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Code valueOf(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        public static Code[] values() {
            return (Code[]) $VALUES.clone();
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public StartError(@NotNull Code code, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.exception = exc;
    }

    @NotNull
    public final Code getCode() {
        return this.code;
    }

    @Override // com.chartboost.sdk.events.CBError
    @Nullable
    public Exception getException() {
        return this.exception;
    }

    @NotNull
    public String toString() {
        return "Chartboost StartError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ StartError(Code code, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
