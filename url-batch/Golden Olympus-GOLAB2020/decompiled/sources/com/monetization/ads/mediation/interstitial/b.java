package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.yandex.mobile.ads.impl.gx0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class b implements gx0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private MediatedInterstitialAdapter f20777a;

    @Override // com.yandex.mobile.ads.impl.gx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedInterstitialAdapter mediatedAdapter = (MediatedInterstitialAdapter) aVar;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedInterstitialAdapter mediatedAdapter = (MediatedInterstitialAdapter) aVar;
        MediatedInterstitialAdapter.MediatedInterstitialAdapterListener mediatedAdapterListener = (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        this.f20777a = mediatedAdapter;
        mediatedAdapter.loadInterstitial(context, mediatedAdapterListener, localExtras, serverExtras);
    }

    @Nullable
    public final MediatedInterstitialAdapter a() {
        return this.f20777a;
    }
}
