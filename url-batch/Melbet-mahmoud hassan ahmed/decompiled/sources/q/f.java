package q;

import java.util.Objects;

/* loaded from: classes.dex */
public final class f {
    public static <T> T a(T t6) {
        Objects.requireNonNull(t6);
        return t6;
    }

    public static <T> T b(T t6, Object obj) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
