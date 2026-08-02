package okio.internal;

import java.util.logging.Logger;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class _JavaIoKt {
    public static final Logger logger = Logger.getLogger("okio.Okio");

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.contains((CharSequence) message, (CharSequence) "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
