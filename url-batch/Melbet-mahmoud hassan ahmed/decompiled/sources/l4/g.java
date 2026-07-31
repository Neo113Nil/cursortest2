package l4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class g {
    public static <T> T a(T t6, T t7) {
        if (t6 != null) {
            return t6;
        }
        Objects.requireNonNull(t7, "Both parameters are null");
        return t7;
    }
}
