package defpackage;

import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class jv2 {
    public static final Logger PxuCJdSBwIXG = Logger.getLogger("okio.Okio");

    public static final boolean PxuCJdSBwIXG(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? ia2.jJwa0q7P5wHq(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
