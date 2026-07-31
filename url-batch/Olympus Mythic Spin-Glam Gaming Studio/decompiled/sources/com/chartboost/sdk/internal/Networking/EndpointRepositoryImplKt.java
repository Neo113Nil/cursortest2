package com.chartboost.sdk.internal.Networking;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"endpointRepository", "Lcom/chartboost/sdk/internal/Networking/EndpointRepository;", "context", "Landroid/content/Context;", "ChartboostMonetization-9.12.1_productionRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EndpointRepositoryImplKt {
    @NotNull
    public static final EndpointRepository endpointRepository(@Nullable Context context) {
        throw new IllegalStateException("Function is not available");
    }

    public static /* synthetic */ EndpointRepository endpointRepository$default(Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return endpointRepository(context);
    }
}
