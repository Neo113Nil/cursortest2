package com.withpersona.sdk2.camera;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.trace.core.util.Matchers;
import com.google.mlkit.vision.face.internal.zzm;
import com.squareup.cash.cdf.mintstatus.MintStatusTimelineViewed;
import com.squareup.cash.cdf.shifts.ShiftsAppletViewScreen;
import com.squareup.cash.cdf.shifts.ShiftsHomeViewScreen;
import com.squareup.cash.cdf.shifts.ShiftsPayViewHistory;
import com.squareup.cash.cdf.shifts.ShiftsPayViewScreen;
import com.squareup.cash.cdf.shifts.ShiftsTaxFormsViewScreen;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.wallet.presenters.WalletHomePresenter;
import com.squareup.cash.wallet.screens.PresentationTimelineScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.OverdraftCoverageListItemViewEvent$OverdraftClicked;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.pay.PayHomePresenter;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredState;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper;
import com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.launchers.AuthTabsArguments;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsArguments;
import com.withpersona.sdk2.inquiry.logger.Logger;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.brotli.dec.HuffmanTreeGroup;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class CameraHelper$unbind$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $cameraProvider;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraHelper$unbind$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cameraProvider = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$cameraProvider;
        switch (i) {
            case 0:
                return new CameraHelper$unbind$2((ProcessCameraProvider) obj2, continuation, 0);
            case 1:
                return new CameraHelper$unbind$2((MutableSharedFlow) obj2, continuation, 1);
            case 2:
                return new CameraHelper$unbind$2((TaxReturnsPresenter) obj2, continuation, 2);
            case 3:
                return new CameraHelper$unbind$2((WalletHomePresenter) obj2, continuation, 3);
            case 4:
                return new CameraHelper$unbind$2((Animatable) obj2, continuation, 4);
            case 5:
                return new CameraHelper$unbind$2((CardSchemeViewModel.Module.CustomizationImage) obj2, continuation, 5);
            case 6:
                return new CameraHelper$unbind$2((TaxReturnsPresenter) obj2, continuation, 6);
            case 7:
                return new CameraHelper$unbind$2((WorkHomePresenter) obj2, continuation, 7);
            case 8:
                return new CameraHelper$unbind$2((TaxAuthorizationPresenter) obj2, continuation, 8);
            case 9:
                return new CameraHelper$unbind$2((PayHomePresenter) obj2, continuation, 9);
            case 10:
                return new CameraHelper$unbind$2((WorkHomePresenter) obj2, continuation, 10);
            case 11:
                return new CameraHelper$unbind$2((ClockInOverlayState) obj2, continuation, 11);
            case 12:
                return new CameraHelper$unbind$2((AccountUpdateRequiredViewModel) obj2, continuation, 12);
            case 13:
                return new CameraHelper$unbind$2((InstitutionPickerViewModel) obj2, continuation, 13);
            case 14:
                return new CameraHelper$unbind$2((NetworkingLinkSignupViewModel) obj2, continuation, 14);
            case 15:
                return new CameraHelper$unbind$2((NetworkingSaveToLinkVerificationViewModel) obj2, continuation, 15);
            case 16:
                return new CameraHelper$unbind$2((NoticeSheetViewModel) obj2, continuation, 16);
            case 17:
                return new CameraHelper$unbind$2((PartnerAuthViewModel) obj2, continuation, 17);
            case 18:
                return new CameraHelper$unbind$2((IDConsentContentViewModel) obj2, continuation, 18);
            case 19:
                return new CameraHelper$unbind$2((MutableFloatState) obj2, continuation, 19);
            case 20:
                return new CameraHelper$unbind$2((StripeApiRepository) obj2, continuation, 20);
            case 21:
                return new CameraHelper$unbind$2((HuffmanTreeGroup) obj2, continuation, 21);
            case 22:
                return new CameraHelper$unbind$2((Context) obj2, continuation, 22);
            case 23:
                return new CameraHelper$unbind$2((Camera2Controller) obj2, continuation, 23);
            case 24:
                return new CameraHelper$unbind$2((CameraCaptureSessionWrapper) obj2, continuation, 24);
            case 25:
                return new CameraHelper$unbind$2((MediaRecorderWrapper) obj2, continuation, 25);
            case 26:
                return new CameraHelper$unbind$2((DocumentsSelectWorker) obj2, continuation, 26);
            case 27:
                return new CameraHelper$unbind$2((IntegrationBrowserWorker) obj2, continuation, 27);
            case 28:
                return new CameraHelper$unbind$2((UiStepSavedStateHelper) obj2, continuation, 28);
            default:
                return new CameraHelper$unbind$2((Logger) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 4:
                break;
        }
        return ((CameraHelper$unbind$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x029d, code lost:
    
        if (r0 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
        Iterable iterable;
        List list;
        Object value;
        Object customTabsArguments;
        String str;
        int i = this.$r8$classId;
        int i2 = 0;
        Object[] objArr = 0;
        Uri uri = null;
        Object obj2 = this.$cameraProvider;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    ((ProcessCameraProvider) obj2).unbindAll();
                } catch (ImageCaptureException unused) {
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowKt.emitOrThrow((MutableSharedFlow) obj2, OverdraftCoverageListItemViewEvent$OverdraftClicked.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj2;
                Analytics analytics = (Analytics) taxReturnsPresenter.args;
                PresentationTimelineViewModel presentationTimelineViewModel = ((PresentationTimelineScreen) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider).viewModel;
                analytics.track(new MintStatusTimelineViewed(new Integer(presentationTimelineViewModel.steps.size()), presentationTimelineViewModel.themeToken, presentationTimelineViewModel.deviceId, presentationTimelineViewModel.title), null);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                WalletHomePresenter walletHomePresenter = (WalletHomePresenter) obj2;
                WalletHomeScreen walletHomeScreen = walletHomePresenter.args;
                if (walletHomeScreen.shouldNavigateToPrepurchaseCashCard) {
                    walletHomePresenter.navigator.goTo(new PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen(walletHomeScreen));
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(((Animatable) obj2).isRunning());
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                byte[] bArr = ((CardSchemeViewModel.Module.CustomizationImage) obj2).bytes;
                int length = bArr.length;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                return BitmapFactory.decodeByteArray(bArr, 0, length, options);
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShiftsAnalytics shiftsAnalytics = (ShiftsAnalytics) ((TaxReturnsPresenter) obj2).args;
                shiftsAnalytics.analytics.track(new ShiftsAppletViewScreen(shiftsAnalytics.getPersonToken(), shiftsAnalytics.getMerchantToken()), null);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShiftsAnalytics shiftsAnalytics2 = (ShiftsAnalytics) ((WorkHomePresenter) obj2).shiftsAnalytics;
                shiftsAnalytics2.analytics.track(new ShiftsHomeViewScreen(shiftsAnalytics2.getPersonToken(), shiftsAnalytics2.getMerchantToken()), null);
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShiftsAnalytics shiftsAnalytics3 = (ShiftsAnalytics) ((TaxAuthorizationPresenter) obj2).args;
                shiftsAnalytics3.analytics.track(new ShiftsPayViewHistory(shiftsAnalytics3.getPersonToken(), shiftsAnalytics3.getMerchantToken()), null);
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShiftsAnalytics shiftsAnalytics4 = ((PayHomePresenter) obj2).shiftsAnalytics;
                shiftsAnalytics4.analytics.track(new ShiftsPayViewScreen(shiftsAnalytics4.getPersonToken(), shiftsAnalytics4.getMerchantToken()), null);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ShiftsAnalytics shiftsAnalytics5 = (ShiftsAnalytics) ((WorkHomePresenter) obj2).shiftsAnalytics;
                shiftsAnalytics5.analytics.track(new ShiftsTaxFormsViewScreen(shiftsAnalytics5.getPersonToken(), shiftsAnalytics5.getMerchantToken()), null);
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ClockInOverlayState clockInOverlayState = (ClockInOverlayState) obj2;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = clockInOverlayState.isClockingIn$delegate;
                Boolean bool = Boolean.FALSE;
                parcelableSnapshotMutableState.setValue(bool);
                clockInOverlayState.isStartingBreak$delegate.setValue(bool);
                clockInOverlayState.isEndingBreak$delegate.setValue(bool);
                clockInOverlayState.isClockingOut$delegate.setValue(bool);
                clockInOverlayState.endBreakDisabledDialogRemainingMinutes$delegate.setValue(null);
                clockInOverlayState.setDisabledClockInReason(null);
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AccountUpdateRequiredViewModel accountUpdateRequiredViewModel = (AccountUpdateRequiredViewModel) obj2;
                ReadonlyStateFlow readonlyStateFlow = accountUpdateRequiredViewModel.stateFlow;
                UpdateLocalManifest updateLocalManifest = accountUpdateRequiredViewModel.updateLocalManifest;
                NavigationManagerImpl navigationManagerImpl = accountUpdateRequiredViewModel.navigationManager;
                AccountUpdateRequiredState accountUpdateRequiredState = (AccountUpdateRequiredState) readonlyStateFlow.$$delegate_0.getValue();
                FinancialConnectionsSessionManifest.Pane pane = accountUpdateRequiredState.referrer;
                NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired = (NoticeSheetState.NoticeSheetContent.UpdateRequired) accountUpdateRequiredState.payload.invoke();
                NoticeSheetState.NoticeSheetContent.UpdateRequired.Type type2 = updateRequired != null ? updateRequired.f1430type : null;
                if (type2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                if (type2 instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair) {
                    NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair repair = (NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair) type2;
                    FinancialConnectionsInstitution financialConnectionsInstitution = repair.institution;
                    String str2 = repair.authorization;
                    FinancialConnectionsSessionManifest.Pane pane2 = AccountUpdateRequiredViewModel.PANE;
                    if (financialConnectionsInstitution == null || str2 == null) {
                        Matchers.logError(accountUpdateRequiredViewModel.eventTracker, Request$Priority$EnumUnboxingLocalUtility.m("Unable to open repair flow (missing auth: ", ", missing institution: ", ").", str2 == null, financialConnectionsInstitution == null), new UnclassifiedError("UpdateRepairAccountError", null), accountUpdateRequiredViewModel.logger, AccountUpdateRequiredViewModel.PANE);
                        NavigationManagerImpl.tryNavigateTo$default(navigationManagerImpl, Destination.invoke$default(Destination.InstitutionPicker.INSTANCE, pane), null, 6);
                    } else {
                        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl = updateLocalManifest.repository;
                        financialConnectionsManifestRepositoryImpl.getClass();
                        SynchronizeSessionResponse cachedSynchronizeSessionResponse = financialConnectionsManifestRepositoryImpl.getCachedSynchronizeSessionResponse();
                        if (cachedSynchronizeSessionResponse != null && (financialConnectionsSessionManifest2 = cachedSynchronizeSessionResponse.manifest) != null) {
                            financialConnectionsManifestRepositoryImpl.updateCachedManifest("updateLocalManifest", FinancialConnectionsSessionManifest.copy$default(financialConnectionsSessionManifest2, null, financialConnectionsInstitution, null, -16777217, 16383));
                        }
                        CoreAuthorizationPendingNetworkingRepairRepository coreAuthorizationPendingNetworkingRepairRepository = accountUpdateRequiredViewModel.pendingRepairRepository;
                        coreAuthorizationPendingNetworkingRepairRepository.getClass();
                        coreAuthorizationPendingNetworkingRepairRepository.logger.debug("core authorization set to ".concat(str2));
                        ((SavedStateHandle) coreAuthorizationPendingNetworkingRepairRepository.zzd).set(new CoreAuthorizationPendingNetworkingRepairRepository.State(str2), (String) coreAuthorizationPendingNetworkingRepairRepository.zza);
                        NavigationManagerImpl.tryNavigateTo$default(navigationManagerImpl, Destination.invoke$default(Destination.BankAuthRepair.INSTANCE, pane), null, 6);
                    }
                } else {
                    if (!(type2 instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FinancialConnectionsInstitution financialConnectionsInstitution2 = ((NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability) type2).institution;
                    if (financialConnectionsInstitution2 != null) {
                        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl2 = updateLocalManifest.repository;
                        financialConnectionsManifestRepositoryImpl2.getClass();
                        SynchronizeSessionResponse cachedSynchronizeSessionResponse2 = financialConnectionsManifestRepositoryImpl2.getCachedSynchronizeSessionResponse();
                        if (cachedSynchronizeSessionResponse2 != null && (financialConnectionsSessionManifest = cachedSynchronizeSessionResponse2.manifest) != null) {
                            financialConnectionsManifestRepositoryImpl2.updateCachedManifest("updateLocalManifest", FinancialConnectionsSessionManifest.copy$default(financialConnectionsSessionManifest, null, financialConnectionsInstitution2, null, -16777217, 16383));
                        }
                        NavigationManagerImpl.tryNavigateTo$default(navigationManagerImpl, Destination.invoke$default(Destination.PartnerAuth.INSTANCE, pane), null, 6);
                    } else {
                        NavigationManagerImpl.tryNavigateTo$default(navigationManagerImpl, Destination.invoke$default(Destination.InstitutionPicker.INSTANCE, pane), null, 6);
                    }
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InstitutionPickerViewModel institutionPickerViewModel = (InstitutionPickerViewModel) obj2;
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = institutionPickerViewModel.eventTracker;
                FinancialConnectionsSessionManifest.Pane pane3 = InstitutionPickerViewModel.PANE;
                InstitutionResponse institutionResponse = (InstitutionResponse) ((InstitutionPickerState) institutionPickerViewModel.stateFlow.$$delegate_0.getValue()).searchInstitutions.invoke();
                if (institutionResponse != null && (list = institutionResponse.data) != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FinancialConnectionsInstitution) it.next()).id);
                    }
                    iterable = CollectionsKt.toSet(arrayList);
                    break;
                }
                iterable = EmptySet.INSTANCE;
                iterable.getClass();
                pane3.getClass();
                Iterable iterable2 = iterable;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                for (Object obj3 : iterable2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    arrayList2.add(new Pair(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "institution_ids[", "]"), (String) obj3));
                    i2 = i3;
                }
                Map map = MapsKt__MapsKt.toMap(arrayList2);
                FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.plus(map, MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane3))))), "search.scroll", true));
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) obj2;
                networkingLinkSignupViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.not_now", networkingLinkSignupViewModel.getPane()));
                NavigationManagerImpl.tryNavigateTo$default(networkingLinkSignupViewModel.navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, networkingLinkSignupViewModel.getPane()), null, 6);
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NavigationManagerImpl.tryNavigateTo$default(((NetworkingSaveToLinkVerificationViewModel) obj2).navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, NetworkingSaveToLinkVerificationViewModel.PANE), null, 6);
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NoticeSheetViewModel noticeSheetViewModel = (NoticeSheetViewModel) obj2;
                NoticeSheetContentRepository.State state = (NoticeSheetContentRepository.State) noticeSheetViewModel.noticeSheetContentRepository.get();
                NoticeSheetState.NoticeSheetContent noticeSheetContent = state != null ? state.content : null;
                if (noticeSheetContent != null) {
                    StateFlowImpl stateFlowImpl = noticeSheetViewModel._stateFlow;
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value, NoticeSheetState.copy$default((NoticeSheetState) value, noticeSheetContent, null, 5)));
                } else {
                    noticeSheetViewModel.navigationManager.tryNavigateBack();
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) obj2;
                partnerAuthViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(partnerAuthViewModel.initialState.pane, 25));
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                IDConsentContentViewModel iDConsentContentViewModel = (IDConsentContentViewModel) obj2;
                FinancialConnectionsSessionManifest.Pane pane4 = IDConsentContentViewModel.PANE;
                IDConsentContentState.Payload payload = (IDConsentContentState.Payload) ((IDConsentContentState) iDConsentContentViewModel.stateFlow.$$delegate_0.getValue()).payload.invoke();
                if (payload != null) {
                    iDConsentContentViewModel.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.Legal(payload.idConsentContentPane.legalDetailsNotice), IDConsentContentViewModel.PANE);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EnterTransitionImpl enterTransitionImpl = SuccessContentKt.FADE_IN_ANIMATION;
                ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj2)).setFloatValue(1.0f);
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                HttpResponseCache.install(new File(((StripeApiRepository) obj2).context.getCacheDir(), "stripe_api_repository_cache"), 10485760L);
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Lazy lazy = (Lazy) ((HuffmanTreeGroup) obj2).trees;
                Object value2 = lazy.getValue();
                value2.getClass();
                int i4 = ((SharedPreferences) value2).getInt("app_version", 0);
                Object value3 = lazy.getValue();
                value3.getClass();
                String string2 = ((SharedPreferences) value3).getString("sdk_app_id", null);
                if (string2 != null) {
                    return new AppInfo(string2, i4);
                }
                return null;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                return SwitchViewKt.getInstance((Context) obj2);
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Camera2Controller camera2Controller = (Camera2Controller) obj2;
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) camera2Controller._previewState;
                CameraState.Closed closed = new CameraState.Closed(true, true);
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, closed);
                CameraState.Error error = CameraState.Error.INSTANCE$1;
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, error);
                camera2Controller.prepare();
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CameraCaptureSessionWrapper cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) obj2;
                cameraCaptureSessionWrapper.meteringRect = null;
                cameraCaptureSessionWrapper.updateRepeatingRequest();
                return Unit.INSTANCE;
            case 25:
                MediaRecorderWrapper mediaRecorderWrapper = (MediaRecorderWrapper) obj2;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    mediaRecorderWrapper.mediaRecorder.start();
                } catch (IllegalStateException unused2) {
                    mediaRecorderWrapper.mediaRecorder.reset();
                    mediaRecorderWrapper.newRecordSession(false);
                    mediaRecorderWrapper.mediaRecorder.start();
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((DocumentsSelectWorker) obj2).launchPicker.invoke();
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                IntegrationBrowserWorker integrationBrowserWorker = (IntegrationBrowserWorker) obj2;
                String str3 = integrationBrowserWorker.url;
                ActivityResultLauncher activityResultLauncher = integrationBrowserWorker.customTabsLauncher;
                if (integrationBrowserWorker.useAuthTab) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("androidx.browser.auth.extra.LAUNCH_AUTH_TAB", true);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtras(new Bundle());
                    PreviewView.AnonymousClass1 anonymousClass1 = new PreviewView.AnonymousClass1(intent, objArr == true ? 1 : 0);
                    str3.getClass();
                    String queryParameter = Uri.parse(str3).getQueryParameter("redirect_uri");
                    if (queryParameter != null) {
                        String decode = URLDecoder.decode(queryParameter, Charsets.UTF_8.name());
                        decode.getClass();
                        uri = Uri.parse(decode);
                    }
                    if (uri == null || (str = uri.getHost()) == null) {
                        str = "withpersona.com";
                    } else {
                        int port = uri.getPort();
                        if (port != -1) {
                            str = Boxes$$ExternalSyntheticOutline1.m(port, str, ":");
                        }
                    }
                    customTabsArguments = new AuthTabsArguments(anonymousClass1, str3, str, integrationBrowserWorker.redirectPath);
                } else {
                    customTabsArguments = new CustomTabsArguments(new zzm().build(), str3);
                }
                activityResultLauncher.launch(customTabsArguments);
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                UiStepSavedStateHelper uiStepSavedStateHelper = (UiStepSavedStateHelper) obj2;
                uiStepSavedStateHelper.configFile.delete();
                uiStepSavedStateHelper.savedData = null;
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Logger logger = (Logger) obj2;
                if (logger.errorLogsDir.exists()) {
                    try {
                        FilesKt__UtilsKt.deleteRecursively(logger.errorLogsDir);
                    } catch (SecurityException unused3) {
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
