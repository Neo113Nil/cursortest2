package okhttp3.internal.ws;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* loaded from: classes5.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final WebSocketExtensions parse(Headers responseHeaders) {
            Integer intOrNull;
            Integer intOrNull2;
            s.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            int i8 = 0;
            boolean z7 = false;
            Integer num = null;
            boolean z8 = false;
            Integer num2 = null;
            boolean z9 = false;
            boolean z10 = false;
            while (i8 < size) {
                int i9 = i8 + 1;
                if (t.equals(responseHeaders.name(i8), "Sec-WebSocket-Extensions", true)) {
                    String value = responseHeaders.value(i8);
                    int i10 = 0;
                    while (i10 < value.length()) {
                        int delimiterOffset$default = Util.delimiterOffset$default(value, ',', i10, 0, 4, (Object) null);
                        int delimiterOffset = Util.delimiterOffset(value, ';', i10, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i10, delimiterOffset);
                        int i11 = delimiterOffset + 1;
                        if (t.equals(trimSubstring, "permessage-deflate", true)) {
                            if (z7) {
                                z10 = true;
                            }
                            i10 = i11;
                            while (i10 < delimiterOffset$default) {
                                int delimiterOffset2 = Util.delimiterOffset(value, ';', i10, delimiterOffset$default);
                                int delimiterOffset3 = Util.delimiterOffset(value, '=', i10, delimiterOffset2);
                                String trimSubstring2 = Util.trimSubstring(value, i10, delimiterOffset3);
                                String removeSurrounding = delimiterOffset3 < delimiterOffset2 ? StringsKt__StringsKt.removeSurrounding(Util.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2), (CharSequence) "\"") : null;
                                i10 = delimiterOffset2 + 1;
                                if (t.equals(trimSubstring2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z10 = true;
                                    }
                                    if (removeSurrounding == null) {
                                        num = null;
                                    } else {
                                        intOrNull = kotlin.text.s.toIntOrNull(removeSurrounding);
                                        num = intOrNull;
                                    }
                                    if (num == null) {
                                        z10 = true;
                                    }
                                } else if (t.equals(trimSubstring2, "client_no_context_takeover", true)) {
                                    if (z8) {
                                        z10 = true;
                                    }
                                    if (removeSurrounding != null) {
                                        z10 = true;
                                    }
                                    z8 = true;
                                } else if (t.equals(trimSubstring2, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z10 = true;
                                    }
                                    if (removeSurrounding == null) {
                                        num2 = null;
                                    } else {
                                        intOrNull2 = kotlin.text.s.toIntOrNull(removeSurrounding);
                                        num2 = intOrNull2;
                                    }
                                    if (num2 == null) {
                                        z10 = true;
                                    }
                                } else if (t.equals(trimSubstring2, "server_no_context_takeover", true)) {
                                    if (z9) {
                                        z10 = true;
                                    }
                                    if (removeSurrounding != null) {
                                        z10 = true;
                                    }
                                    z9 = true;
                                } else {
                                    z10 = true;
                                }
                            }
                            z7 = true;
                        } else {
                            i10 = i11;
                            z10 = true;
                        }
                    }
                }
                i8 = i9;
            }
            return new WebSocketExtensions(z7, num, z8, num2, z9, z10);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = webSocketExtensions.perMessageDeflate;
        }
        if ((i8 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i8 & 4) != 0) {
            z8 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z11 = z8;
        if ((i8 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i8 & 16) != 0) {
            z9 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z12 = z9;
        if ((i8 & 32) != 0) {
            z10 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z7, num3, z11, num4, z12, z10);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10) {
        return new WebSocketExtensions(z7, num, z8, num2, z9, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && s.areEqual(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && s.areEqual(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z7 = this.perMessageDeflate;
        ?? r02 = z7;
        if (z7) {
            r02 = 1;
        }
        int i8 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i8 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i9 = r22;
        if (r22 != 0) {
            i9 = 1;
        }
        int i10 = (hashCode + i9) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i11 = r23;
        if (r23 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z8 = this.unknownValues;
        return i12 + (z8 ? 1 : z8 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z7) {
        return z7 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public WebSocketExtensions(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10) {
        this.perMessageDeflate = z7;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z8;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z9;
        this.unknownValues = z10;
    }

    public /* synthetic */ WebSocketExtensions(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10, int i8, o oVar) {
        this((i8 & 1) != 0 ? false : z7, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? false : z8, (i8 & 8) == 0 ? num2 : null, (i8 & 16) != 0 ? false : z9, (i8 & 32) != 0 ? false : z10);
    }
}
