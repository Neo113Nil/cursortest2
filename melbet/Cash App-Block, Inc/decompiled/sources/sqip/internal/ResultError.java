package sqip.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J<\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lsqip/internal/ResultError;", "C", "", "code", "message", "", "debugCode", "debugMessage", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDebugCode", "()Ljava/lang/String;", "getDebugMessage", "getMessage", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lsqip/internal/ResultError;", "equals", "", "other", "hashCode", "", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ResultError<C> {
    private final C code;
    private final String debugCode;
    private final String debugMessage;
    private final String message;

    public ResultError(C c, String str, String str2, String str3) {
        c.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.code = c;
        this.message = str;
        this.debugCode = str2;
        this.debugMessage = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResultError copy$default(ResultError resultError, Object obj, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = resultError.code;
        }
        if ((i & 2) != 0) {
            str = resultError.message;
        }
        if ((i & 4) != 0) {
            str2 = resultError.debugCode;
        }
        if ((i & 8) != 0) {
            str3 = resultError.debugMessage;
        }
        return resultError.copy(obj, str, str2, str3);
    }

    public final C component1() {
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

    public final ResultError<C> copy(C code, String message, String debugCode, String debugMessage) {
        code.getClass();
        message.getClass();
        debugCode.getClass();
        debugMessage.getClass();
        return new ResultError<>(code, message, debugCode, debugMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultError)) {
            return false;
        }
        ResultError resultError = (ResultError) other;
        return Intrinsics.areEqual(this.code, resultError.code) && Intrinsics.areEqual(this.message, resultError.message) && Intrinsics.areEqual(this.debugCode, resultError.debugCode) && Intrinsics.areEqual(this.debugMessage, resultError.debugMessage);
    }

    public final C getCode() {
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
        C c = this.code;
        String str = this.message;
        String str2 = this.debugCode;
        String str3 = this.debugMessage;
        StringBuilder sb = new StringBuilder("ResultError(code=");
        sb.append(c);
        sb.append(", message=");
        sb.append(str);
        sb.append(", debugCode=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, ", debugMessage=", str3, ")");
    }
}
