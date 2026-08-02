package com.stripe.android.financialconnections.features.error;

import androidx.emoji2.text.MetadataRepo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.zipline.loader.ZiplineLoader;
import com.android.volley.RequestQueue;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.RealAttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.domain.RealIsNetworkingRelinkSession;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.SaveAccountToLink_Factory;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentState;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessState;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.features.reset.ResetState;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.financialconnections.features.reset.ResetViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.features.success.SuccessViewModel_Factory_Impl;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker_Factory_Factory;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager_Factory;
import com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory;
import dagger.internal.Provider;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes8.dex */
public final /* synthetic */ class ErrorViewModel$Companion$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl f$0;

    public /* synthetic */ ErrorViewModel$Companion$$ExternalSyntheticLambda0(DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Async.Uninitialized uninitialized = Async.Uninitialized.INSTANCE;
        DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = this.f$0;
        switch (i) {
            case 0:
                ((CreationExtras) obj).getClass();
                ErrorViewModel_Factory_Impl errorViewModel_Factory_Impl = (ErrorViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider11.instance;
                ErrorState errorState = new ErrorState(uninitialized);
                AssetPublicSuffixList assetPublicSuffixList = errorViewModel_Factory_Impl.delegateFactory;
                return new ErrorViewModel(errorState, (NativeAuthFlowCoordinator) ((Provider) assetPublicSuffixList.listRead).get(), (GetOrFetchSync) ((Provider) assetPublicSuffixList.readCompleteLatch).get(), (FinancialConnectionsErrorRepository) ((Provider) assetPublicSuffixList.bytes).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) assetPublicSuffixList.exceptionBytes).get(), (NavigationManagerImpl) ((Provider) assetPublicSuffixList.readFailure).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) assetPublicSuffixList.path).get());
            case 1:
                ((CreationExtras) obj).getClass();
                AccountPickerViewModel_Factory_Impl accountPickerViewModel_Factory_Impl = (AccountPickerViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider4.instance;
                EmptySet emptySet = EmptySet.INSTANCE;
                Async.Uninitialized uninitialized2 = Async.Uninitialized.INSTANCE;
                AccountPickerState accountPickerState = new AccountPickerState(uninitialized2, uninitialized2, true, uninitialized2, emptySet, null);
                RealBugReportSenderFactory realBugReportSenderFactory = accountPickerViewModel_Factory_Impl.delegateFactory;
                return new AccountPickerViewModel(accountPickerState, (NativeAuthFlowCoordinator) ((Provider) realBugReportSenderFactory.bugReportService).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) realBugReportSenderFactory.sessionManager).get(), (RealConsumerSessionRepository) ((Provider) realBugReportSenderFactory.tempStorage).get(), (RealCurrentLinkBrand) ((Provider) realBugReportSenderFactory.preferences).get(), (SaveAccountToLink) ((SaveAccountToLink_Factory) realBugReportSenderFactory.endpoint).get(), (SelectAccounts) ((SelfieDirectionFeed_Factory) realBugReportSenderFactory.backStackDumper).get(), (GetOrFetchSync) ((Provider) realBugReportSenderFactory.featureEligibilityDumper).get(), (NavigationManagerImpl) ((Provider) realBugReportSenderFactory.cashDatabase).get(), (HandleClickableUrl) ((Provider) realBugReportSenderFactory.endpointContext).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) realBugReportSenderFactory.scope).get(), (SelectAccounts) ((SelfieDirectionFeed_Factory) realBugReportSenderFactory.bugsnagClient).get(), (RealPresentSheet) ((Provider) realBugReportSenderFactory.recentMoneybotSession).get());
            case 2:
                ((CreationExtras) obj).getClass();
                AttachPaymentViewModel_Factory_Impl attachPaymentViewModel_Factory_Impl = (AttachPaymentViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider9.instance;
                AttachPaymentState attachPaymentState = new AttachPaymentState(uninitialized);
                StuckPlayerDetector stuckPlayerDetector = attachPaymentViewModel_Factory_Impl.delegateFactory;
                return new AttachPaymentViewModel(attachPaymentState, (NativeAuthFlowCoordinator) ((Provider) stuckPlayerDetector.player).get(), (SuccessContentRepository) ((Provider) stuckPlayerDetector.playerListener).get(), (PollAttachPaymentAccount) ((Provider) stuckPlayerDetector.callback).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) stuckPlayerDetector.clock).get(), (GetCachedAccounts) ((Provider) stuckPlayerDetector.period).get(), (NavigationManagerImpl) ((Provider) stuckPlayerDetector.handler).get(), (GetOrFetchSync) ((Provider) stuckPlayerDetector.stuckBufferingDetector).get(), (RealCurrentLinkBrand) ((Provider) stuckPlayerDetector.stuckPlayingDetector).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) stuckPlayerDetector.stuckPlayingNotEndingDetector).get(), (RealIsNetworkingRelinkSession) ((Provider) stuckPlayerDetector.stuckSuppressedDetector).get());
            case 3:
                ((CreationExtras) obj).getClass();
                ConsentViewModel_Factory_Impl consentViewModel_Factory_Impl = (ConsentViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider.instance;
                ConsentState consentState = new ConsentState(uninitialized, EmptyList.INSTANCE, uninitialized, null);
                RequestQueue requestQueue = consentViewModel_Factory_Impl.delegateFactory;
                return new ConsentViewModel(consentState, (NativeAuthFlowCoordinator) ((Provider) requestQueue.mSequenceGenerator).get(), (AcceptConsent) ((Provider) requestQueue.mCurrentRequests).get(), (GetOrFetchSync) ((Provider) requestQueue.mCacheQueue).get(), (NavigationManagerImpl) ((Provider) requestQueue.mNetworkQueue).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) requestQueue.mCache).get(), (HandleClickableUrl) ((Provider) requestQueue.mNetwork).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) requestQueue.mDelivery).get(), (RealPresentSheet) ((DocumentCameraWorker_Factory) requestQueue.mDispatchers).get(), (LookupAccount) ((LookupAccount_Factory) requestQueue.mCacheDispatcher).get(), (RealIsLinkWithStripe) ((Provider) requestQueue.mFinishedListeners).get(), (ElementsSessionContext.PrefillDetails) ((CameraModule_CameraStatsManagerFactory) requestQueue.mEventListeners).get());
            case 4:
                ((CreationExtras) obj).getClass();
                LinkAccountPickerViewModel_Factory_Impl linkAccountPickerViewModel_Factory_Impl = (LinkAccountPickerViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider18.instance;
                LinkAccountPickerState linkAccountPickerState = new LinkAccountPickerState(uninitialized, uninitialized, null);
                RealBugReportSenderFactory realBugReportSenderFactory2 = linkAccountPickerViewModel_Factory_Impl.delegateFactory;
                return new LinkAccountPickerViewModel(linkAccountPickerState, (NativeAuthFlowCoordinator) ((Provider) realBugReportSenderFactory2.bugReportService).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) realBugReportSenderFactory2.sessionManager).get(), (RealConsumerSessionRepository) ((Provider) realBugReportSenderFactory2.tempStorage).get(), (HandleClickableUrl) ((Provider) realBugReportSenderFactory2.preferences).get(), (ToolbarTuckTargets) ((SelfieDirectionFeed_Factory) realBugReportSenderFactory2.endpoint).get(), (TextSetter) ((DocumentCameraWorker_Factory) realBugReportSenderFactory2.backStackDumper).get(), (UpdateCachedAccounts) ((Provider) realBugReportSenderFactory2.featureEligibilityDumper).get(), (GetOrFetchSync) ((Provider) realBugReportSenderFactory2.cashDatabase).get(), (NavigationManagerImpl) ((Provider) realBugReportSenderFactory2.endpointContext).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) realBugReportSenderFactory2.scope).get(), (AcceptConsent) ((Provider) realBugReportSenderFactory2.bugsnagClient).get(), (RealPresentSheet) ((Provider) realBugReportSenderFactory2.recentMoneybotSession).get());
            case 5:
                ((CreationExtras) obj).getClass();
                ManualEntryViewModel_Factory_Impl manualEntryViewModel_Factory_Impl = (ManualEntryViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider5.instance;
                ManualEntryState manualEntryState = new ManualEntryState(uninitialized, uninitialized);
                HCaptcha hCaptcha = manualEntryViewModel_Factory_Impl.delegateFactory;
                return new ManualEntryViewModel(manualEntryState, (NativeAuthFlowCoordinator) ((Provider) hCaptcha.result).get(), (PollAttachPaymentAccount) ((DocumentsSelectWorker_Factory_Factory) hCaptcha.exception).get(), (SuccessContentRepository) ((Provider) hCaptcha.onSuccessListeners).get(), (UpdateCachedAccounts) ((CameraModule_CameraStatsManagerFactory) hCaptcha.onFailureListeners).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) hCaptcha.onOpenListeners).get(), (GetOrFetchSync) ((Provider) hCaptcha.handler).get(), (NavigationManagerImpl) ((Provider) hCaptcha.internalConfig).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) hCaptcha.captchaVerifier).get());
            case 6:
                ((CreationExtras) obj).getClass();
                ManualEntrySuccessViewModel_Factory_Impl manualEntrySuccessViewModel_Factory_Impl = (ManualEntrySuccessViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider6.instance;
                ManualEntrySuccessState manualEntrySuccessState = new ManualEntrySuccessState(uninitialized, uninitialized);
                MetadataRepo metadataRepo = manualEntrySuccessViewModel_Factory_Impl.delegateFactory;
                return new ManualEntrySuccessViewModel(manualEntrySuccessState, (GetOrFetchSync) ((Provider) metadataRepo.mMetadataList).get(), (SuccessContentRepository) ((Provider) metadataRepo.mEmojiCharArray).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) metadataRepo.mRootNode).get(), (NativeAuthFlowCoordinator) ((Provider) metadataRepo.mTypeface).get());
            case 7:
                ((CreationExtras) obj).getClass();
                FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) ((FinancialConnectionsSheetNativeViewModel) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.financialConnectionsSheetNativeViewModelProvider.get()).stateFlow.$$delegate_0.getValue();
                financialConnectionsSheetNativeState.getClass();
                boolean z = financialConnectionsSheetNativeState.isLinkWithStripe;
                Async.Uninitialized uninitialized3 = Async.Uninitialized.INSTANCE;
                NetworkingLinkSignupState networkingLinkSignupState = new NetworkingLinkSignupState(uninitialized3, null, null, uninitialized3, uninitialized3, null, z);
                RequestQueue requestQueue2 = ((NetworkingLinkSignupViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider14.instance).delegateFactory;
                return new NetworkingLinkSignupViewModel(networkingLinkSignupState, (NativeAuthFlowCoordinator) ((Provider) requestQueue2.mSequenceGenerator).get(), (LookupAccount) ((Provider) requestQueue2.mCurrentRequests).get(), (UriUtils) ((Provider) requestQueue2.mCacheQueue).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) requestQueue2.mNetworkQueue).get(), (GetOrFetchSync) ((Provider) requestQueue2.mCache).get(), (NavigationManagerImpl) ((Provider) requestQueue2.mNetwork).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) requestQueue2.mDelivery).get(), (RealPresentSheet) ((Provider) requestQueue2.mDispatchers).get(), (LinkSignupHandler) ((FeatureFlagManager_Factory) requestQueue2.mCacheDispatcher).get(), (ElementsSessionContext) ((Provider) requestQueue2.mFinishedListeners).get(), (RealHandleError) ((Provider) requestQueue2.mEventListeners).get());
            case 8:
                ((CreationExtras) obj).getClass();
                NetworkingLinkVerificationViewModel_Factory_Impl networkingLinkVerificationViewModel_Factory_Impl = (NetworkingLinkVerificationViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider16.instance;
                NetworkingLinkVerificationState networkingLinkVerificationState = new NetworkingLinkVerificationState(uninitialized, uninitialized);
                RealBugReportSenderFactory realBugReportSenderFactory3 = networkingLinkVerificationViewModel_Factory_Impl.delegateFactory;
                return new NetworkingLinkVerificationViewModel(networkingLinkVerificationState, (NativeAuthFlowCoordinator) ((Provider) realBugReportSenderFactory3.bugReportService).get(), (GetOrFetchSync) ((Provider) realBugReportSenderFactory3.sessionManager).get(), (ConfirmVerification) ((CameraModule_CameraStatsManagerFactory) realBugReportSenderFactory3.tempStorage).get(), (MarkLinkVerified) ((SelfieDirectionFeed_Factory) realBugReportSenderFactory3.preferences).get(), (NavigationManagerImpl) ((Provider) realBugReportSenderFactory3.endpoint).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) realBugReportSenderFactory3.backStackDumper).get(), (StartVerification) ((CameraModule_CameraStatsManagerFactory) realBugReportSenderFactory3.featureEligibilityDumper).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) realBugReportSenderFactory3.cashDatabase).get(), (RealIsLinkWithStripe) ((Provider) realBugReportSenderFactory3.endpointContext).get(), (RealAttachConsumerToLinkAccountSession) ((Provider) realBugReportSenderFactory3.scope).get(), (RealConsumerSessionRepository) ((Provider) realBugReportSenderFactory3.bugsnagClient).get(), (RealHandleError) ((Provider) realBugReportSenderFactory3.recentMoneybotSession).get());
            case 9:
                ((CreationExtras) obj).getClass();
                NetworkingSaveToLinkVerificationViewModel_Factory_Impl networkingSaveToLinkVerificationViewModel_Factory_Impl = (NetworkingSaveToLinkVerificationViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider17.instance;
                NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState = new NetworkingSaveToLinkVerificationState(uninitialized, uninitialized);
                ZiplineLoader ziplineLoader = networkingSaveToLinkVerificationViewModel_Factory_Impl.delegateFactory;
                return new NetworkingSaveToLinkVerificationViewModel(networkingSaveToLinkVerificationState, (NativeAuthFlowCoordinator) ((Provider) ziplineLoader.dispatcher).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) ziplineLoader.cacheDispatcher).get(), (RealConsumerSessionRepository) ((Provider) ziplineLoader.manifestVerifier).get(), (StartVerification) ((Provider) ziplineLoader.httpFetcher).get(), (GetOrFetchSync) ((Provider) ziplineLoader.eventListenerFactory).get(), (ConfirmVerification) ((Provider) ziplineLoader.nowEpochMs).get(), (AttachedPaymentAccountRepository) ((Provider) ziplineLoader.embeddedDir).get(), (MarkLinkVerified) ((Provider) ziplineLoader.embeddedFileSystem).get(), (GetCachedAccounts) ((Provider) ziplineLoader.cache).get(), (SaveAccountToLink) ((Provider) ziplineLoader.concurrentDownloadsSemaphore).get(), (NavigationManagerImpl) ((Provider) ziplineLoader.embeddedFetcher).get(), (RealCurrentLinkBrand) ((Provider) ziplineLoader.cachingFetcher).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) ziplineLoader.moduleFetchers).get());
            case 10:
                ((CreationExtras) obj).getClass();
                ResetViewModel_Factory_Impl resetViewModel_Factory_Impl = (ResetViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider10.instance;
                ResetState resetState = new ResetState(uninitialized);
                MarkwonConfiguration markwonConfiguration = resetViewModel_Factory_Impl.delegateFactory;
                return new ResetViewModel(resetState, (Lazy) ((SelfieDirectionFeed_Factory) markwonConfiguration.theme).get(), (NativeAuthFlowCoordinator) ((Provider) markwonConfiguration.syntaxHighlight).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) markwonConfiguration.linkResolver).get(), (NavigationManagerImpl) ((Provider) markwonConfiguration.imageDestinationProcessor).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) markwonConfiguration.spansFactory).get());
            case 11:
                ((CreationExtras) obj).getClass();
                IDConsentContentViewModel_Factory_Impl iDConsentContentViewModel_Factory_Impl = (IDConsentContentViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider2.instance;
                IDConsentContentState iDConsentContentState = new IDConsentContentState(uninitialized, uninitialized, null);
                PollingWorker_Factory pollingWorker_Factory = iDConsentContentViewModel_Factory_Impl.delegateFactory;
                return new IDConsentContentViewModel(iDConsentContentState, (NativeAuthFlowCoordinator) pollingWorker_Factory.serviceProvider.get(), (AcceptConsent) pollingWorker_Factory.deviceIdProvider.get(), (GetOrFetchSync) pollingWorker_Factory.sandboxFlagsProvider.get(), (NavigationManagerImpl) pollingWorker_Factory.fallbackModeManagerProvider.get(), (FinancialConnectionsAnalyticsTrackerImpl) pollingWorker_Factory.fontDownloaderProvider.get(), (HandleClickableUrl) pollingWorker_Factory.themeManagerProvider.get(), (RealPresentSheet) pollingWorker_Factory.inquiryApiHelperProvider.get());
            default:
                ((CreationExtras) obj).getClass();
                SuccessViewModel_Factory_Impl successViewModel_Factory_Impl = (SuccessViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider8.instance;
                SuccessState successState = new SuccessState(uninitialized, uninitialized);
                AssetPublicSuffixList assetPublicSuffixList2 = successViewModel_Factory_Impl.delegateFactory;
                return new SuccessViewModel(successState, (GetCachedAccounts) ((SelfieDirectionFeed_Factory) assetPublicSuffixList2.listRead).get(), (GetOrFetchSync) ((Provider) assetPublicSuffixList2.readCompleteLatch).get(), (SuccessContentRepository) ((Provider) assetPublicSuffixList2.bytes).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) assetPublicSuffixList2.exceptionBytes).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) assetPublicSuffixList2.readFailure).get(), (NativeAuthFlowCoordinator) ((Provider) assetPublicSuffixList2.path).get());
        }
    }
}
