package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.yandex.mobile.ads.impl.gx0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class c implements gx0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private MediatedAppOpenAdAdapter f20710a;

    @Override // com.yandex.mobile.ads.impl.gx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedAppOpenAdAdapter mediatedAdapter = (MediatedAppOpenAdAdapter) aVar;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.gx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedAppOpenAdAdapter mediatedAdapter = (MediatedAppOpenAdAdapter) aVar;
        MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener mediatedAdapterListener = (MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        this.f20710a = mediatedAdapter;
        mediatedAdapter.loadAppOpenAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }

    @Nullable
    public final MediatedAppOpenAdAdapter a() {
        return this.f20710a;
    }
}
