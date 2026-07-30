package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.s;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String username, String password) {
        s.checkNotNullParameter(username, "username");
        s.checkNotNullParameter(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset ISO_8859_1, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            s.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }

    public static final String basic(String username, String password, Charset charset) {
        s.checkNotNullParameter(username, "username");
        s.checkNotNullParameter(password, "password");
        s.checkNotNullParameter(charset, "charset");
        return s.stringPlus("Basic ", ByteString.Companion.encodeString(username + ':' + password, charset).base64());
    }
}
