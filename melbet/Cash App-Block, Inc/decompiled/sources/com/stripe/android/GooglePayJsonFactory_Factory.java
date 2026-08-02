package com.stripe.android;

import android.content.Context;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdLocalVideoCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdWebRtcRenderer;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class GooglePayJsonFactory_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider cardBrandFilterProvider;
    public final InstanceFactory cardFundingFilterProvider;
    public final Provider googlePayConfigProvider;
    public final Provider publishableKeyProvider;
    public final Provider stripeAccountIdProvider;

    public GooglePayJsonFactory_Factory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5) {
        this.$r8$classId = 0;
        this.publishableKeyProvider = instanceFactory;
        this.stripeAccountIdProvider = instanceFactory2;
        this.googlePayConfigProvider = instanceFactory3;
        this.cardBrandFilterProvider = instanceFactory4;
        this.cardFundingFilterProvider = instanceFactory5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.cardBrandFilterProvider;
        Provider provider2 = this.googlePayConfigProvider;
        InstanceFactory instanceFactory = this.cardFundingFilterProvider;
        Provider provider3 = this.stripeAccountIdProvider;
        Provider provider4 = this.publishableKeyProvider;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) provider4.get();
                Function0 function02 = (Function0) provider3.get();
                GooglePayPaymentMethodLauncher$Config googlePayPaymentMethodLauncher$Config = (GooglePayPaymentMethodLauncher$Config) provider2.get();
                DefaultCardBrandFilter defaultCardBrandFilter = (DefaultCardBrandFilter) provider.get();
                DefaultCardFundingFilter defaultCardFundingFilter = (DefaultCardFundingFilter) instanceFactory.instance;
                function0.getClass();
                function02.getClass();
                googlePayPaymentMethodLauncher$Config.getClass();
                defaultCardBrandFilter.getClass();
                defaultCardFundingFilter.getClass();
                return new GooglePayJsonFactory(new GooglePayConfig((String) function0.invoke(), (String) function02.invoke()), StringsKt__StringsJVMKt.equals(googlePayPaymentMethodLauncher$Config.merchantCountryCode, Locale.JAPAN.getCountry(), true), googlePayPaymentMethodLauncher$Config.additionalEnabledNetworks, defaultCardBrandFilter, defaultCardFundingFilter);
            case 1:
                return new GovIdLocalVideoCaptureRenderer((Context) provider4.get(), (CameraXController_Factory_Impl) provider3.get(), (Camera2Controller_Factory_Impl) instanceFactory.instance, (NavigationStateManager) provider2.get(), (TrackingEventsLogger) provider.get());
            default:
                return new GovIdWebRtcRenderer((Context) provider4.get(), (CameraXController_Factory_Impl) provider3.get(), (Camera2Controller_Factory_Impl) instanceFactory.instance, (NavigationStateManager) provider2.get(), (TrackingEventsLogger) provider.get());
        }
    }

    public /* synthetic */ GooglePayJsonFactory_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Provider provider, Provider provider2, int i) {
        this.$r8$classId = i;
        this.publishableKeyProvider = inquiryActivityModule_ContextFactory;
        this.stripeAccountIdProvider = instanceFactory;
        this.cardFundingFilterProvider = instanceFactory2;
        this.googlePayConfigProvider = provider;
        this.cardBrandFilterProvider = provider2;
    }
}
