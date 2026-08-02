package com.stripe.android.financialconnections.features.exit;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.SelectInstitution;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredState;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel_Factory_Impl;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory_Factory;
import com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory;
import dagger.internal.Provider;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final /* synthetic */ class ExitViewModel$Companion$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl f$0;
    public final /* synthetic */ Bundle f$1;

    public /* synthetic */ ExitViewModel$Companion$$ExternalSyntheticLambda0(Bundle bundle, DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl) {
        this.$r8$classId = 2;
        this.f$1 = bundle;
        this.f$0 = daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string2;
        String string3;
        String string4;
        FinancialConnectionsSessionManifest.Pane pane;
        String string5;
        Object obj2;
        FinancialConnectionsSessionManifest.Pane pane2;
        String string6;
        Object obj3;
        int i = this.$r8$classId;
        Async.Uninitialized uninitialized = Async.Uninitialized.INSTANCE;
        FinancialConnectionsSessionManifest.Pane pane3 = null;
        Object obj4 = null;
        r4 = null;
        FinancialConnectionsSessionManifest.Pane pane4 = null;
        Object obj5 = null;
        r4 = null;
        FinancialConnectionsSessionManifest.Pane pane5 = null;
        Object obj6 = null;
        pane3 = null;
        Bundle bundle = this.f$1;
        DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = this.f$0;
        switch (i) {
            case 0:
                ((CreationExtras) obj).getClass();
                ExitViewModel_Factory_Impl exitViewModel_Factory_Impl = (ExitViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider12.instance;
                if (bundle != null && (string2 = bundle.getString("referrer")) != null) {
                    Iterator<E> it = FinancialConnectionsSessionManifest.Pane.getEntries().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.areEqual(((FinancialConnectionsSessionManifest.Pane) next).getValue(), string2)) {
                                obj6 = next;
                            }
                        }
                    }
                    pane3 = (FinancialConnectionsSessionManifest.Pane) obj6;
                }
                ExitState exitState = new ExitState(pane3, uninitialized, false);
                PollingWorker_Factory pollingWorker_Factory = exitViewModel_Factory_Impl.delegateFactory;
                return new ExitViewModel(exitState, (NativeAuthFlowCoordinator) pollingWorker_Factory.serviceProvider.get(), (GetOrFetchSync) pollingWorker_Factory.deviceIdProvider.get(), (NativeAuthFlowCoordinator) pollingWorker_Factory.sandboxFlagsProvider.get(), (FinancialConnectionsAnalyticsTrackerImpl) pollingWorker_Factory.fallbackModeManagerProvider.get(), (NavigationManagerImpl) pollingWorker_Factory.fontDownloaderProvider.get(), (RealCurrentLinkBrand) pollingWorker_Factory.themeManagerProvider.get(), (Logger$Companion$NOOP_LOGGER$1) pollingWorker_Factory.inquiryApiHelperProvider.get());
            case 1:
                ((CreationExtras) obj).getClass();
                AccountUpdateRequiredViewModel_Factory_Impl accountUpdateRequiredViewModel_Factory_Impl = (AccountUpdateRequiredViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider19.instance;
                if (bundle != null && (string3 = bundle.getString("referrer")) != null) {
                    Iterator<E> it2 = FinancialConnectionsSessionManifest.Pane.getEntries().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (Intrinsics.areEqual(((FinancialConnectionsSessionManifest.Pane) next2).getValue(), string3)) {
                                obj5 = next2;
                            }
                        }
                    }
                    pane5 = (FinancialConnectionsSessionManifest.Pane) obj5;
                }
                pane5.getClass();
                AccountUpdateRequiredState accountUpdateRequiredState = new AccountUpdateRequiredState(pane5, uninitialized);
                PollingWorker_Factory pollingWorker_Factory2 = accountUpdateRequiredViewModel_Factory_Impl.delegateFactory;
                return new AccountUpdateRequiredViewModel(accountUpdateRequiredState, (NativeAuthFlowCoordinator) pollingWorker_Factory2.serviceProvider.get(), (AccountUpdateRequiredContentRepository) pollingWorker_Factory2.deviceIdProvider.get(), (CoreAuthorizationPendingNetworkingRepairRepository) pollingWorker_Factory2.sandboxFlagsProvider.get(), (NavigationManagerImpl) pollingWorker_Factory2.fallbackModeManagerProvider.get(), (FinancialConnectionsAnalyticsTrackerImpl) pollingWorker_Factory2.fontDownloaderProvider.get(), (UpdateLocalManifest) pollingWorker_Factory2.themeManagerProvider.get(), (Logger$Companion$NOOP_LOGGER$1) pollingWorker_Factory2.inquiryApiHelperProvider.get());
            case 2:
                ((CreationExtras) obj).getClass();
                if (bundle != null && (string4 = bundle.getString("referrer")) != null) {
                    Iterator<E> it3 = FinancialConnectionsSessionManifest.Pane.getEntries().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            if (Intrinsics.areEqual(((FinancialConnectionsSessionManifest.Pane) next3).getValue(), string4)) {
                                obj4 = next3;
                            }
                        }
                    }
                    pane4 = (FinancialConnectionsSessionManifest.Pane) obj4;
                }
                Async.Uninitialized uninitialized2 = Async.Uninitialized.INSTANCE;
                InstitutionPickerState institutionPickerState = new InstitutionPickerState(null, uninitialized2, uninitialized2, uninitialized2, pane4);
                RealBugReportSenderFactory realBugReportSenderFactory = ((InstitutionPickerViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider3.instance).delegateFactory;
                return new InstitutionPickerViewModel((FinancialConnectionsSheetConfiguration) ((Provider) realBugReportSenderFactory.bugReportService).get(), (PostAuthorizationSession) ((Provider) realBugReportSenderFactory.sessionManager).get(), (SelectInstitution) ((Provider) realBugReportSenderFactory.tempStorage).get(), (GetOrFetchSync) ((Provider) realBugReportSenderFactory.preferences).get(), (SearchInstitutions) ((Provider) realBugReportSenderFactory.endpoint).get(), (FeaturedInstitutions) ((Provider) realBugReportSenderFactory.backStackDumper).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) realBugReportSenderFactory.featureEligibilityDumper).get(), (RealHandleError) ((SetupIntentFlowResultProcessor_Factory) realBugReportSenderFactory.cashDatabase).get(), (NavigationManagerImpl) ((Provider) realBugReportSenderFactory.endpointContext).get(), (UpdateLocalManifest) ((CameraModule_CameraStatsManagerFactory) realBugReportSenderFactory.scope).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) realBugReportSenderFactory.bugsnagClient).get(), institutionPickerState, (NativeAuthFlowCoordinator) ((Provider) realBugReportSenderFactory.recentMoneybotSession).get());
            case 3:
                ((CreationExtras) obj).getClass();
                FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) ((FinancialConnectionsSheetNativeViewModel) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.financialConnectionsSheetNativeViewModelProvider.get()).stateFlow.$$delegate_0.getValue();
                NetworkingLinkLoginWarmupViewModel_Factory_Impl networkingLinkLoginWarmupViewModel_Factory_Impl = (NetworkingLinkLoginWarmupViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider15.instance;
                financialConnectionsSheetNativeState.getClass();
                if (bundle == null || (string5 = bundle.getString("referrer")) == null) {
                    pane = null;
                } else {
                    Iterator<E> it4 = FinancialConnectionsSessionManifest.Pane.getEntries().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            if (Intrinsics.areEqual(((FinancialConnectionsSessionManifest.Pane) obj2).getValue(), string5)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    pane = (FinancialConnectionsSessionManifest.Pane) obj2;
                }
                String string7 = bundle != null ? bundle.getString("next_pane_on_disable_networking") : null;
                boolean z = financialConnectionsSheetNativeState.isLinkWithStripe;
                LinkBrand linkBrand = financialConnectionsSheetNativeState.linkBrand;
                Async.Uninitialized uninitialized3 = Async.Uninitialized.INSTANCE;
                NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState = new NetworkingLinkLoginWarmupState(pane, string7, uninitialized3, uninitialized3, uninitialized3, z, linkBrand);
                zzai zzaiVar = networkingLinkLoginWarmupViewModel_Factory_Impl.delegateFactory;
                return new NetworkingLinkLoginWarmupViewModel(networkingLinkLoginWarmupState, (NativeAuthFlowCoordinator) ((Provider) zzaiVar.zaa).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) zzaiVar.zab).get(), (RealHandleError) ((Provider) zzaiVar.zac).get(), (GetOrFetchSync) ((Provider) zzaiVar.zad).get(), (ToolbarTuckTargets) ((SelfieDirectionFeed_Factory) zzaiVar.zza).get(), (NavigationManagerImpl) ((Provider) zzaiVar.zzb).get(), (LookupAccount) ((Provider) zzaiVar.zzc).get(), (ElementsSessionContext.PrefillDetails) ((Provider) zzaiVar.zzd).get(), (RealConsumerSessionRepository) ((Provider) zzaiVar.zze).get());
            default:
                ((CreationExtras) obj).getClass();
                NoticeSheetViewModel_Factory_Impl noticeSheetViewModel_Factory_Impl = (NoticeSheetViewModel_Factory_Impl) daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.factoryProvider13.instance;
                if (bundle == null || (string6 = bundle.getString("referrer")) == null) {
                    pane2 = null;
                } else {
                    Iterator<E> it5 = FinancialConnectionsSessionManifest.Pane.getEntries().iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj3 = it5.next();
                            if (Intrinsics.areEqual(((FinancialConnectionsSessionManifest.Pane) obj3).getValue(), string6)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    pane2 = (FinancialConnectionsSessionManifest.Pane) obj3;
                }
                pane2.getClass();
                NoticeSheetState noticeSheetState = new NoticeSheetState(pane2, null, null);
                Camera2ManagerFactory_Factory camera2ManagerFactory_Factory = noticeSheetViewModel_Factory_Impl.delegateFactory;
                return new NoticeSheetViewModel(noticeSheetState, (NativeAuthFlowCoordinator) camera2ManagerFactory_Factory.contextProvider.get(), (NavigationManagerImpl) camera2ManagerFactory_Factory.cameraStatsManagerProvider.get(), (NoticeSheetContentRepository) camera2ManagerFactory_Factory.sdkFilesManagerProvider.get(), (HandleClickableUrl) camera2ManagerFactory_Factory.cameraChoiceHelperProvider.get());
        }
    }

    public /* synthetic */ ExitViewModel$Companion$$ExternalSyntheticLambda0(DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, Bundle bundle, int i) {
        this.$r8$classId = i;
        this.f$0 = daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
        this.f$1 = bundle;
    }
}
