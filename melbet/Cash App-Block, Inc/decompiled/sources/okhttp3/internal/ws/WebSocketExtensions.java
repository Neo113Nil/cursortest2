package okhttp3.internal.ws;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class WebSocketExtensions {
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z2;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z3;
        this.unknownValues = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && Intrinsics.areEqual(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && Intrinsics.areEqual(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.perMessageDeflate) * 31;
        Integer num = this.clientMaxWindowBits;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.clientNoContextTakeover);
        Integer num2 = this.serverMaxWindowBits;
        return Boolean.hashCode(this.unknownValues) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.serverNoContextTakeover);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.perMessageDeflate);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.clientMaxWindowBits);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.clientNoContextTakeover);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.serverMaxWindowBits);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.serverNoContextTakeover);
        sb.append(", unknownValues=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.unknownValues, ')');
    }
}
