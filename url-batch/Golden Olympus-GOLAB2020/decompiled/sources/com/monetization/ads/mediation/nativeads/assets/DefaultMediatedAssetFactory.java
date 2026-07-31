package com.monetization.ads.mediation.nativeads.assets;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedFeedbackFactory;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedSponsoredFactory;
import com.yandex.mobile.ads.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DefaultMediatedAssetFactory implements MediatedAssetFactory {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f20823a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final DefaultMediatedSponsoredFactory f20824b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final DefaultMediatedFeedbackFactory f20825c;

    public DefaultMediatedAssetFactory(@NotNull Context context, @NotNull DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, @NotNull DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultMediatedSponsoredFactory, "defaultMediatedSponsoredFactory");
        Intrinsics.checkNotNullParameter(defaultMediatedFeedbackFactory, "defaultMediatedFeedbackFactory");
        this.f20823a = context;
        this.f20824b = defaultMediatedSponsoredFactory;
        this.f20825c = defaultMediatedFeedbackFactory;
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    @NotNull
    public MediatedNativeAdImage makeDefaultFeedback() {
        return this.f20825c.makeFeedback(this.f20823a, R.drawable.monetization_ads_mediation_api_feedback_icon);
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    @NotNull
    public String makeDefaultSponsored() {
        return this.f20824b.makeSponsored(this.f20823a, R.string.monetization_ads_mediation_api_sponsored_text);
    }

    public /* synthetic */ DefaultMediatedAssetFactory(Context context, DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? new DefaultMediatedSponsoredFactory() : defaultMediatedSponsoredFactory, (i4 & 4) != 0 ? new DefaultMediatedFeedbackFactory() : defaultMediatedFeedbackFactory);
    }
}
