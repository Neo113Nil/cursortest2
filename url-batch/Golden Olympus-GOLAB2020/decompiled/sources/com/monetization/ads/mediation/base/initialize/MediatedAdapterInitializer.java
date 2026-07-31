package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface MediatedAdapterInitializer {
    @Nullable
    Object initialize(@NotNull Context context, @NotNull Map<String, String> map, @NotNull d dVar);
}
