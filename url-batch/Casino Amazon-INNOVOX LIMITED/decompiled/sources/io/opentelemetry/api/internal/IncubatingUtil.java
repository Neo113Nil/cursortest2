package io.opentelemetry.api.internal;

/* loaded from: classes3.dex */
public class IncubatingUtil {
    private IncubatingUtil() {
    }

    public static <T> T incubatingApiIfAvailable(T t, String str) {
        try {
            return (T) Class.forName(str).getDeclaredMethod("getNoop", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return t;
        }
    }
}
