package io.opentelemetry.api.internal;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ConfigUtil {
    public static <T> T defaultIfNull(@Nullable T t, T t2) {
        return t == null ? t2 : t;
    }

    private ConfigUtil() {
    }

    public static Properties safeSystemProperties() {
        return (Properties) System.getProperties().clone();
    }

    public static String getString(String str, String str2) {
        final String normalizePropertyKey = normalizePropertyKey(str);
        String str3 = (String) safeSystemProperties().entrySet().stream().filter(new Predicate() { // from class: io.opentelemetry.api.internal.ConfigUtil$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean equals;
                equals = normalizePropertyKey.equals(ConfigUtil.normalizePropertyKey(((Map.Entry) obj).getKey().toString()));
                return equals;
            }
        }).map(new Function() { // from class: io.opentelemetry.api.internal.ConfigUtil$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String obj2;
                obj2 = ((Map.Entry) obj).getValue().toString();
                return obj2;
            }
        }).findFirst().orElse(null);
        return str3 != null ? str3 : (String) System.getenv().entrySet().stream().filter(new Predicate() { // from class: io.opentelemetry.api.internal.ConfigUtil$$ExternalSyntheticLambda2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean equals;
                equals = normalizePropertyKey.equals(ConfigUtil.normalizeEnvironmentVariableKey((String) ((Map.Entry) obj).getKey()));
                return equals;
            }
        }).map(new Function() { // from class: io.opentelemetry.api.internal.ConfigUtil$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getValue();
            }
        }).findFirst().orElse(str2);
    }

    public static String normalizeEnvironmentVariableKey(String str) {
        return str.toLowerCase(Locale.ROOT).replace("_", ".");
    }

    public static String normalizePropertyKey(String str) {
        return str.toLowerCase(Locale.ROOT).replace(TokenBuilder.TOKEN_DELIMITER, ".");
    }
}
