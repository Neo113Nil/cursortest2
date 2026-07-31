package com.yandex.mobile.ads.instream.pauseroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.dt0;
import com.yandex.mobile.ads.impl.ig1;
import com.yandex.mobile.ads.impl.qs;
import com.yandex.mobile.ads.impl.ul2;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class PauserollQueueProvider {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ig1 f35857a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dt0<Pauseroll> f35858b;

    public PauserollQueueProvider(@NotNull Context context, @NotNull InstreamAd instreamAd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        um2 um2Var = new um2(context);
        qs a4 = xs.a(instreamAd);
        this.f35857a = new ig1();
        this.f35858b = new dt0<>(context, um2Var, a4);
    }

    @NotNull
    public final InstreamAdBreakQueue<Pauseroll> getQueue() {
        return new ul2(this.f35858b.a(this.f35857a, InstreamAdBreakType.PAUSEROLL));
    }
}
