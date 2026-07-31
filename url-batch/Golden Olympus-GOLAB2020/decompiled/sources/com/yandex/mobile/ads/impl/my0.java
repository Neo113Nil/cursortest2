package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class my0 implements gx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private MediatedRewardedAdapter f29304a;

    @Nullable
    public final MediatedRewardedAdapter a() {
        return this.f29304a;
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedRewardedAdapter mediatedAdapter = (MediatedRewardedAdapter) aVar;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedRewardedAdapter mediatedAdapter = (MediatedRewardedAdapter) aVar;
        MediatedRewardedAdapterListener mediatedAdapterListener = (MediatedRewardedAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        this.f29304a = mediatedAdapter;
        mediatedAdapter.loadRewardedAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }
}
