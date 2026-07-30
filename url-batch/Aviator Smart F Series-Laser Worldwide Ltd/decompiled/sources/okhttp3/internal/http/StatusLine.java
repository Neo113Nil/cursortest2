package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.t;
import okhttp3.Protocol;
import okhttp3.Response;

/* loaded from: classes5.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final StatusLine get(Response response) {
            s.checkNotNullParameter(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String statusLine) {
            Protocol protocol;
            int i8;
            String str;
            s.checkNotNullParameter(statusLine, "statusLine");
            if (t.startsWith$default(statusLine, "HTTP/1.", false, 2, null)) {
                i8 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(s.stringPlus("Unexpected status line: ", statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException(s.stringPlus("Unexpected status line: ", statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!t.startsWith$default(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException(s.stringPlus("Unexpected status line: ", statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i8 = 4;
            }
            int i9 = i8 + 3;
            if (statusLine.length() < i9) {
                throw new ProtocolException(s.stringPlus("Unexpected status line: ", statusLine));
            }
            try {
                String substring = statusLine.substring(i8, i9);
                s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i9) {
                    str = "";
                } else {
                    if (statusLine.charAt(i9) != ' ') {
                        throw new ProtocolException(s.stringPlus("Unexpected status line: ", statusLine));
                    }
                    str = statusLine.substring(i8 + 4);
                    s.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(s.stringPlus("Unexpected status line: ", statusLine));
            }
        }
    }

    public StatusLine(Protocol protocol, int i8, String message) {
        s.checkNotNullParameter(protocol, "protocol");
        s.checkNotNullParameter(message, "message");
        this.protocol = protocol;
        this.code = i8;
        this.message = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
