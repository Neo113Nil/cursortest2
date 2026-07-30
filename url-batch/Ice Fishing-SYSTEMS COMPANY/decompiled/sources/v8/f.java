package v8;

import M7.j;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f41385a = Logger.getLogger("okio.Okio");

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
