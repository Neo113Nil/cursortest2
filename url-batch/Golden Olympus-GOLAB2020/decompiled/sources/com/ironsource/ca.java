package com.ironsource;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface ca {
    static /* synthetic */ String a(ca caVar, String str, String str2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return caVar.getString(str, str2);
    }

    void a(@NotNull String str);

    void a(@NotNull String str, @NotNull String str2);

    @NotNull
    Map<String, ?> allData();

    @Nullable
    String getString(@NotNull String str, @Nullable String str2);
}
