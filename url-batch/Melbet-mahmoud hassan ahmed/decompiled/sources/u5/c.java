package u5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class c {
    public static <T> T a(T t6) {
        Objects.requireNonNull(t6);
        return t6;
    }

    public static void b(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
