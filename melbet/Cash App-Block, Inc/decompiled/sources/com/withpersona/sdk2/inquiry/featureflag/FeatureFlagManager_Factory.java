package com.withpersona.sdk2.inquiry.featureflag;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.cloudmessaging.zzv;
import com.squareup.moshi.Moshi;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeNextActionHandler;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.domain.SaveAccountToLink_Factory;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiControllerParams;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule_EnvironmentFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow_Factory;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import dagger.internal.SetFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.LinkResolverDef;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import net.idrnd.misnap.iad.Payload;

/* loaded from: classes9.dex */
public final class FeatureFlagManager_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider contextProvider;
    public final Object defaultFeatureFlagsProvider;
    public final Provider savedStateHandleProvider;

    public /* synthetic */ FeatureFlagManager_Factory(Object obj, Factory factory, Factory factory2, int i) {
        this.$r8$classId = i;
        this.defaultFeatureFlagsProvider = obj;
        this.contextProvider = factory;
        this.savedStateHandleProvider = factory2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.savedStateHandleProvider;
        Provider provider2 = this.contextProvider;
        Object obj = this.defaultFeatureFlagsProvider;
        switch (i) {
            case 0:
                return new FeatureFlagManager((Set) ((SetFactory) obj).get(), (Context) ((InquiryActivityModule_ContextFactory) provider2).get(), (SavedStateHandle) ((FallbackModeModule_EnvironmentFactory) provider).get());
            case 1:
                return new IntentConfirmationChallengeNextActionHandler((Function0) ((InstanceFactory) obj).instance, (Set) ((InstanceFactory) provider2).instance, (CoroutineContext) ((InstanceFactory) provider).instance);
            case 2:
                RealIsLinkWithStripe realIsLinkWithStripe = (RealIsLinkWithStripe) ((Provider) obj).get();
                SaveAccountToLink_Factory saveAccountToLink_Factory = (SaveAccountToLink_Factory) provider2;
                UiWorkflow_Factory uiWorkflow_Factory = (UiWorkflow_Factory) provider;
                realIsLinkWithStripe.getClass();
                return realIsLinkWithStripe.initialState.isLinkWithStripe ? (LinkSignupHandler) saveAccountToLink_Factory.get() : (LinkSignupHandler) uiWorkflow_Factory.get();
            case 3:
                return new CompleteFinancialConnectionsSession((FinancialConnectionsRepositoryImpl) ((Provider) obj).get(), (Payload) ((CameraModule_CameraStatsManagerFactory) provider2).get(), (FinancialConnectionsSheetConfiguration) provider.get());
            case 4:
                Context context = (Context) ((Provider) obj).get();
                boolean booleanValue = ((Boolean) ((InstanceFactory) provider2).instance).booleanValue();
                CoroutineContext provideWorkContext = CameraPreview_Factory.provideWorkContext((LinkResolverDef) ((CameraPreview_Factory) provider).sdkFilesManagerProvider);
                context.getClass();
                return new StripeThreeDs2ServiceImpl(context, booleanValue, provideWorkContext);
            default:
                FallbackModeApiController fallbackModeApiController = (FallbackModeApiController) provider2.get();
                OfflineModeApiController_Factory_Impl offlineModeApiController_Factory_Impl = (OfflineModeApiController_Factory_Impl) ((InstanceFactory) provider).instance;
                fallbackModeApiController.getClass();
                offlineModeApiController_Factory_Impl.getClass();
                ApiControllerParams apiControllerParams = (ApiControllerParams) ((Payload) obj).a;
                if (apiControllerParams instanceof ApiControllerParams.Offline) {
                    int i2 = ((ApiControllerParams.Offline) apiControllerParams).staticTemplateResourceId;
                    TextSetter textSetter = offlineModeApiController_Factory_Impl.delegateFactory;
                    return new zzv((Moshi) ((Provider) textSetter.textView).get(), (Context) ((Provider) textSetter.textSwitcher).get(), (StaticTemplateSession_Factory_Impl) ((InstanceFactory) textSetter.scannerText).instance, i2);
                }
                if (apiControllerParams instanceof ApiControllerParams.Fallback) {
                    return fallbackModeApiController;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
