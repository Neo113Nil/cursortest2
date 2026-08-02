package com.withpersona.sdk2.inquiry.device;

import android.app.Application;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.ui.BuilderViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.attestation.IntegrityStandardRequestManager;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker_Factory_Factory;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationManager;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieRestartCameraRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import dagger.Lazy;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlinx.coroutines.CoroutineDispatcher;
import net.idrnd.face.iad.capture.Plane;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class DeviceModule_AppSetIdHelperFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider appSetIDHelperProvider;
    public final Object module;

    public /* synthetic */ DeviceModule_AppSetIdHelperFactory(Object obj, Provider provider, int i) {
        this.$r8$classId = i;
        this.module = obj;
        this.appSetIDHelperProvider = provider;
    }

    public static Logger$Companion$NOOP_LOGGER$1 provideLogger(Plane plane, boolean z) {
        plane.getClass();
        return z ? Logger$Companion.REAL_LOGGER : Logger$Companion.NOOP_LOGGER;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        int i2 = 1;
        Provider provider = this.appSetIDHelperProvider;
        Object obj = this.module;
        switch (i) {
            case 0:
                RealDeviceVendorIDProvider realDeviceVendorIDProvider = (RealDeviceVendorIDProvider) ((Logger_Factory) provider).get();
                ((DeviceModule) obj).getClass();
                return realDeviceVendorIDProvider;
            case 1:
                return provideLogger((Plane) obj, ((Boolean) provider.get()).booleanValue());
            case 2:
                return new RequestIntegrityToken((IntegrityStandardRequestManager) ((DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.IntegrityRequestManagerProvider) obj).get(), (FinancialConnectionsAnalyticsTrackerImpl) provider.get());
            case 3:
                Lazy lazy = DoubleCheck.lazy((DelegateFactory) obj);
                DefaultReturnUrl defaultReturnUrl = (DefaultReturnUrl) provider.get();
                lazy.getClass();
                defaultReturnUrl.getClass();
                return new HCaptcha$$ExternalSyntheticLambda1(i2, lazy, defaultReturnUrl);
            case 4:
                RealDeviceInfoProvider realDeviceInfoProvider = (RealDeviceInfoProvider) ((Logger_Factory) provider).get();
                ((DeviceModule) obj).getClass();
                return realDeviceInfoProvider;
            case 5:
                return new SilentNetworkAuthenticationManager((TextSetter) ((SelfieDirectionFeed_Factory) obj).get(), (CoroutineDispatcher) ((SandboxFlags_Factory) provider).get());
            case 6:
                Set set = ArraysKt___ArraysKt.toSet(new ViewFactory[]{SelfieInstructionsRunner.Companion, (BuilderViewFactory) ((DocumentsSelectWorker_Factory_Factory) obj).get(), (BuilderViewFactory) ((DocumentsSelectWorker_Factory_Factory) provider).get(), SelfieSubmittingRunner.Companion, SelfieRestartCameraRunner.Companion, SelfieReviewCapturesRunner.Companion});
                Preconditions.checkNotNullFromProvides(set);
                return set;
            default:
                return new RealFontDownloader((OkHttpClient) ((Provider) obj).get(), (Application) ((InquiryActivityModule_ContextFactory) provider).get());
        }
    }
}
