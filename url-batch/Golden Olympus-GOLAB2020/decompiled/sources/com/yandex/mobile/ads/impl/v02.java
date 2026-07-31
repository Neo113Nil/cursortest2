package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v02 implements InterfaceC2341xb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w02 f33460a;

    public v02(@NotNull w02 socialAdInfo) {
        Intrinsics.checkNotNullParameter(socialAdInfo, "socialAdInfo");
        this.f33460a = socialAdInfo;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView p4 = uiElements.p();
        if (p4 != null) {
            p4.setText(R.string.monetization_ads_internal_instream_sponsored_social);
            p4.setVisibility(0);
            p4.setOnClickListener(new u02(this.f33460a, new n82(new m82())));
        }
        ImageView o4 = uiElements.o();
        if (o4 != null) {
            o4.setImageDrawable(androidx.core.content.a.g(o4.getContext(), R.drawable.monetization_ads_instream_internal_advertiser_social));
            o4.setVisibility(0);
            o4.setOnClickListener(new u02(this.f33460a, new n82(new m82())));
        }
    }
}
