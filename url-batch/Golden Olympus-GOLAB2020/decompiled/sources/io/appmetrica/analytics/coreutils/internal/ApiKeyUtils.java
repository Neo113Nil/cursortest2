package io.appmetrica.analytics.coreutils.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ApiKeyUtils {

    @NotNull
    public static final ApiKeyUtils INSTANCE = new ApiKeyUtils();

    private ApiKeyUtils() {
    }

    @NotNull
    public static final String createPartialApiKey(@Nullable String str) {
        if (str == null || str.length() != 36) {
            return StringUtils.UNDEFINED;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }
}
