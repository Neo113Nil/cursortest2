package o6;

import F5.j;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f5633a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? j.L(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
