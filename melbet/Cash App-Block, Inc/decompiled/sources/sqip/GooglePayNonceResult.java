package sqip;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\b\u0082\u0001\u0002\u0004\u0006¨\u0006\f"}, d2 = {"Lsqip/GooglePayNonceResult;", "", "()V", "getErrorValue", "Lsqip/GooglePayNonceResult$Error;", "getSuccessValue", "Lsqip/GooglePayNonceResult$Success;", "isError", "", "isSuccess", "Error", "Success", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class GooglePayNonceResult {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001c"}, d2 = {"Lsqip/GooglePayNonceResult$Error;", "Lsqip/GooglePayNonceResult;", "code", "Lsqip/GooglePayNonceResult$Error$Code;", "message", "", "debugCode", "debugMessage", "(Lsqip/GooglePayNonceResult$Error$Code;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Lsqip/GooglePayNonceResult$Error$Code;", "getDebugCode", "()Ljava/lang/String;", "getDebugMessage", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Code", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends GooglePayNonceResult {
        private final Code code;
        private final String debugCode;
        private final String debugMessage;
        private final String message;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsqip/GooglePayNonceResult$Error$Code;", "", "(Ljava/lang/String;I)V", "NO_NETWORK", "USAGE_ERROR", "UNSUPPORTED_SDK_VERSION", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Code {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Code[] $VALUES;
            public static final Code NO_NETWORK = new Code("NO_NETWORK", 0);
            public static final Code USAGE_ERROR = new Code("USAGE_ERROR", 1);
            public static final Code UNSUPPORTED_SDK_VERSION = new Code("UNSUPPORTED_SDK_VERSION", 2);

            private static final /* synthetic */ Code[] $values() {
                return new Code[]{NO_NETWORK, USAGE_ERROR, UNSUPPORTED_SDK_VERSION};
            }

            static {
                Code[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
            }

            private Code(String str, int i) {
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Code valueOf(String str) {
                return (Code) Enum.valueOf(Code.class, str);
            }

            public static Code[] values() {
                return (Code[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Code code, String str, String str2, String str3) {
            super(null);
            code.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.code = code;
            this.message = str;
            this.debugCode = str2;
            this.debugMessage = str3;
        }

        public static /* synthetic */ Error copy$default(Error error, Code code, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                code = error.code;
            }
            if ((i & 2) != 0) {
                str = error.message;
            }
            if ((i & 4) != 0) {
                str2 = error.debugCode;
            }
            if ((i & 8) != 0) {
                str3 = error.debugMessage;
            }
            return error.copy(code, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Code getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDebugCode() {
            return this.debugCode;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDebugMessage() {
            return this.debugMessage;
        }

        public final Error copy(Code code, String message, String debugCode, String debugMessage) {
            code.getClass();
            message.getClass();
            debugCode.getClass();
            debugMessage.getClass();
            return new Error(code, message, debugCode, debugMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.code == error.code && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.debugCode, error.debugCode) && Intrinsics.areEqual(this.debugMessage, error.debugMessage);
        }

        public final Code getCode() {
            return this.code;
        }

        public final String getDebugCode() {
            return this.debugCode;
        }

        public final String getDebugMessage() {
            return this.debugMessage;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.debugMessage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.code.hashCode() * 31, 31, this.message), 31, this.debugCode);
        }

        public String toString() {
            Code code = this.code;
            String str = this.message;
            String str2 = this.debugCode;
            String str3 = this.debugMessage;
            StringBuilder sb = new StringBuilder("Error(code=");
            sb.append(code);
            sb.append(", message=");
            sb.append(str);
            sb.append(", debugCode=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, ", debugMessage=", str3, ")");
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lsqip/GooglePayNonceResult$Success;", "Lsqip/GooglePayNonceResult;", "Lsqip/CardDetails;", "nonce", "", "card", "Lsqip/Card;", "(Ljava/lang/String;Lsqip/Card;)V", "getCard", "()Lsqip/Card;", "getNonce", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends GooglePayNonceResult implements CardDetails {
        private final Card card;
        private final String nonce;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str, Card card) {
            super(null);
            str.getClass();
            card.getClass();
            this.nonce = str;
            this.card = card;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, Card card, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.nonce;
            }
            if ((i & 2) != 0) {
                card = success.card;
            }
            return success.copy(str, card);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* renamed from: component2, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        public final Success copy(String nonce, Card card) {
            nonce.getClass();
            card.getClass();
            return new Success(nonce, card);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.nonce, success.nonce) && Intrinsics.areEqual(this.card, success.card);
        }

        @Override // sqip.CardDetails
        public Card getCard() {
            return this.card;
        }

        @Override // sqip.CardDetails
        public String getNonce() {
            return this.nonce;
        }

        public int hashCode() {
            return this.card.hashCode() + (this.nonce.hashCode() * 31);
        }

        public String toString() {
            return "Success(nonce=" + this.nonce + ", card=" + this.card + ")";
        }
    }

    public /* synthetic */ GooglePayNonceResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Error getErrorValue() {
        Error error = this instanceof Error ? (Error) this : null;
        if (error != null) {
            return error;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot call getErrorValue() when isError() returns false");
        return null;
    }

    public final Success getSuccessValue() {
        Success success = this instanceof Success ? (Success) this : null;
        if (success != null) {
            return success;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot call getSuccessValue() when isSuccess() returns false");
        return null;
    }

    public final boolean isError() {
        return this instanceof Error;
    }

    public final boolean isSuccess() {
        return this instanceof Success;
    }

    private GooglePayNonceResult() {
    }
}
