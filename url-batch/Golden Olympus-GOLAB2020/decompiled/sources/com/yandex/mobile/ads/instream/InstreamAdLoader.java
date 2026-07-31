package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.am2;
import com.yandex.mobile.ads.impl.cl1;
import com.yandex.mobile.ads.impl.nl0;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.wl2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class InstreamAdLoader extends cl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nl0 f35842a;

    public InstreamAdLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35842a = new nl0(context, new um2(context));
    }

    public final void loadInstreamAd(@NotNull Context context, @NotNull InstreamAdRequestConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f35842a.a(new am2(configuration));
    }

    public final void setInstreamAdLoadListener(@Nullable InstreamAdLoadListener instreamAdLoadListener) {
        this.f35842a.a(instreamAdLoadListener != null ? new wl2(instreamAdLoadListener) : null);
    }
}
