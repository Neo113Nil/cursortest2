package com.monetization.ads.mediation.banner;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.yandex.mobile.ads.impl.gx0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements gx0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.gx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedBannerAdapter mediatedAdapter = (MediatedBannerAdapter) aVar;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedBannerAdapter mediatedAdapter = (MediatedBannerAdapter) aVar;
        MediatedBannerAdapter.MediatedBannerAdapterListener mediatedAdapterListener = (MediatedBannerAdapter.MediatedBannerAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        mediatedAdapter.loadBanner(context, mediatedAdapterListener, localExtras, serverExtras);
    }
}
