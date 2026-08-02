package com.squareup.workflow1.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.net.Uri;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.widget.EditText;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.lifecycle.SavedStateHandle;
import androidx.paging.PagingData;
import app.cash.sqldelight.Query;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewContactOptions;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureViewScreenshots;
import com.squareup.cash.cdf.localclient.LocalClientTabViewNavIcon;
import com.squareup.cash.cdf.roundups.RoundUpsEnableTapEntryRow;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.FileDownloader$DownloadStatus;
import com.squareup.cash.storage.FileDownloaderClientProvider;
import com.squareup.cash.storage.FileSystemProviderModule$provideProvider$1;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.chat.views.ChatInputView;
import com.squareup.cash.support.presenters.SupportSearchPresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.AnalyticsUitlKt;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotState;
import com.squareup.cash.tabprovider.api.TabInfo;
import com.squareup.cash.tabprovider.api.TabInfoState;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.taptopay.backend.real.RealTagCommunicationTeardownRunner;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$State;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.ui.gcm.RealGcmRegistrar;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$registerInBackground$1;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.WalletHomePresenter;
import com.squareup.cash.wallet.presenters.WalletHomePresenter$models$2$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.SpendingInsightsListItemViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.cash.work.viewmodels.ShiftNoteViewModel;
import com.squareup.paging.PagingDataWithCount;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.RenderingAndSnapshot;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.ui.PickledTreesnapshot;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.serialization.json.Json;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.json.JSONObject;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class WorkflowNode$tick$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowNode$tick$1$1(VariantSandboxedComponent variantSandboxedComponent, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.this$0 = variantSandboxedComponent;
        this.L$0 = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1((WorkflowNode) obj2, continuation, 0);
                workflowNode$tick$1$1.L$0 = obj;
                return workflowNode$tick$1$1;
            case 1:
                return new WorkflowNode$tick$1$1((ChatInputView) this.L$0, (FocusRequester) obj2, continuation, 1);
            case 2:
                return new WorkflowNode$tick$1$1((PdfPreviewPresenter) this.L$0, (State) obj2, continuation, 2);
            case 3:
                return new WorkflowNode$tick$1$1((SupportSearchPresenter) this.L$0, (MutableState) obj2, continuation, 3);
            case 4:
                return new WorkflowNode$tick$1$1((ScrollState) this.L$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 4);
            case 5:
                WorkflowNode$tick$1$1 workflowNode$tick$1$12 = new WorkflowNode$tick$1$1((RealTabProvider) obj2, continuation, 5);
                workflowNode$tick$1$12.L$0 = obj;
                return workflowNode$tick$1$12;
            case 6:
                return new WorkflowNode$tick$1$1((RealTagCommunicationTeardownRunner) this.L$0, (zzb) obj2, continuation, 6);
            case 7:
                return new WorkflowNode$tick$1$1((Tag) this.L$0, (MutableState) obj2, continuation, 7);
            case 8:
                return new WorkflowNode$tick$1$1((PagingData) this.L$0, (Query) obj2, continuation, 8);
            case 9:
                return new WorkflowNode$tick$1$1((AmountDisplayState) this.L$0, (RecurringReloadConfigurationViewModel.Keypad) obj2, continuation, 9);
            case 10:
                return new WorkflowNode$tick$1$1((VariantSandboxedComponent) obj2, (CoroutineScope) this.L$0, continuation);
            case 11:
                WorkflowNode$tick$1$1 workflowNode$tick$1$13 = new WorkflowNode$tick$1$1((Context) obj2, continuation, 11);
                workflowNode$tick$1$13.L$0 = obj;
                return workflowNode$tick$1$13;
            case 12:
                return new WorkflowNode$tick$1$1((VariantSandboxedComponent) this.L$0, (String) obj2, continuation, 12);
            case 13:
                return new WorkflowNode$tick$1$1((CardSchemePresenter) this.L$0, (RoundUpsElement) obj2, continuation, 13);
            case 14:
                return new WorkflowNode$tick$1$1((CardSchemePresenter) this.L$0, (SpendingInsightsListItemViewModel) obj2, continuation, 14);
            case 15:
                WorkflowNode$tick$1$1 workflowNode$tick$1$14 = new WorkflowNode$tick$1$1((WalletHomePresenter) obj2, continuation, 15);
                workflowNode$tick$1$14.L$0 = obj;
                return workflowNode$tick$1$14;
            case 16:
                WorkflowNode$tick$1$1 workflowNode$tick$1$15 = new WorkflowNode$tick$1$1((CardRegistry) obj2, continuation, 16);
                workflowNode$tick$1$15.L$0 = obj;
                return workflowNode$tick$1$15;
            case 17:
                return new WorkflowNode$tick$1$1((PointerInputChange) this.L$0, (MutableState) obj2, continuation, 17);
            case 18:
                return new WorkflowNode$tick$1$1((CardGridNuxScene) this.L$0, (ArrayList) obj2, continuation, 18);
            case 19:
                return new WorkflowNode$tick$1$1((CardGridNuxScene) this.L$0, (List) obj2, continuation, 19);
            case 20:
                WorkflowNode$tick$1$1 workflowNode$tick$1$16 = new WorkflowNode$tick$1$1((CardNuxState) obj2, continuation, 20);
                workflowNode$tick$1$16.L$0 = obj;
                return workflowNode$tick$1$16;
            case 21:
                return new WorkflowNode$tick$1$1((CardNuxState) this.L$0, (MutableState) obj2, continuation, 21);
            case 22:
                return new WorkflowNode$tick$1$1((Function1) this.L$0, (CardSchemeViewModel.Module.HeroTag) obj2, continuation, 22);
            case 23:
                return new WorkflowNode$tick$1$1((Function1) this.L$0, (CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel) obj2, continuation, 23);
            case 24:
                return new WorkflowNode$tick$1$1((ShiftNoteViewModel) this.L$0, (MutableState) obj2, continuation, 24);
            case 25:
                return new WorkflowNode$tick$1$1((Function1) this.L$0, (Function1) obj2, continuation, 25);
            case 26:
                WorkflowNode$tick$1$1 workflowNode$tick$1$17 = new WorkflowNode$tick$1$1((SavedStateHandle) obj2, continuation, 26);
                workflowNode$tick$1$17.L$0 = obj;
                return workflowNode$tick$1$17;
            case 27:
                WorkflowNode$tick$1$1 workflowNode$tick$1$18 = new WorkflowNode$tick$1$1((EditText) obj2, continuation, 27);
                workflowNode$tick$1$18.L$0 = obj;
                return workflowNode$tick$1$18;
            case 28:
                WorkflowNode$tick$1$1 workflowNode$tick$1$19 = new WorkflowNode$tick$1$1((AndroidFileSaver) obj2, continuation, 28);
                workflowNode$tick$1$19.L$0 = obj;
                return workflowNode$tick$1$19;
            default:
                return new WorkflowNode$tick$1$1((RealAnalyticsRequestV2Storage) this.L$0, (String) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 21:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((WorkflowNode$tick$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CustomerSupportAccessViewContactOptions.Option option;
        CustomerSupportAccessViewContactOptions.Option option2;
        Uri localUri;
        String path;
        Object failure;
        JSONObject jSONObject;
        String optString;
        String optString2;
        String optString3;
        Object failure2;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return WorkflowNode.access$applyAction((WorkflowNode) this.this$0, (WorkflowAction) this.L$0);
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((ChatInputView) this.L$0).autoKeyboard) {
                    FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) this.this$0);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.L$0;
                Analytics analytics = (Analytics) pdfPreviewPresenter.pdfFile$delegate;
                SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs = ((SupportScreens.ScreenshotScreen.ScreenshotReviewScreen) pdfPreviewPresenter.args).screenshotArgs;
                analytics.track(new CustomerSupportCaptureViewScreenshots(screenshotArgs.flowToken, screenshotArgs.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs.trigger), new Integer(((ScreenshotManager$ScreenshotState) ((State) this.this$0).getValue()).screenshotFilePaths.size())), null);
                return Unit.INSTANCE;
            case 3:
                MutableState mutableState = (MutableState) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SupportSearchPresenter supportSearchPresenter = (SupportSearchPresenter) this.L$0;
                boolean z = supportSearchPresenter.isInAppPhoneFlagEnabled && (((SupportPhoneStatus) mutableState.getValue()) instanceof SupportPhoneStatus.IsEligible);
                SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) mutableState.getValue();
                Analytics analytics2 = supportSearchPresenter.analytics;
                SupportScreens.FlowScreens.SupportSearchScreen supportSearchScreen = supportSearchPresenter.args;
                String str = supportSearchScreen.data.flowToken;
                String str2 = supportSearchScreen.nodeToken;
                CustomerSupportAccessViewContactOptions.Trigger trigger = CustomerSupportAccessViewContactOptions.Trigger.SEARCH;
                CustomerSupportAccessViewContactOptions.Option option3 = CustomerSupportAccessViewContactOptions.Option.SHOWN;
                if (!z) {
                    option = CustomerSupportAccessViewContactOptions.Option.NOT_SHOWN;
                } else {
                    if ((supportPhoneStatus instanceof SupportPhoneStatus.IsEligible) && ((SupportPhoneStatus.IsEligible) supportPhoneStatus).getAvailability().isAvailable) {
                        option2 = option3;
                        analytics2.track(new CustomerSupportAccessViewContactOptions(str, str2, null, trigger, option3, option2, CustomerSupportAccessViewContactOptions.Option.NOT_SHOWN), null);
                        return Unit.INSTANCE;
                    }
                    option = CustomerSupportAccessViewContactOptions.Option.SHOWN_DISABLED;
                }
                option2 = option;
                analytics2.track(new CustomerSupportAccessViewContactOptions(str, str2, null, trigger, option3, option2, CustomerSupportAccessViewContactOptions.Option.NOT_SHOWN), null);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ScrollState scrollState = (ScrollState) this.L$0;
                if (scrollState.value$delegate.getIntValue() != 0) {
                    ((ParcelableSnapshotMutableIntState) this.this$0).setIntValue(scrollState.value$delegate.getIntValue());
                }
                return Unit.INSTANCE;
            case 5:
                TabInfoState tabInfoState = (TabInfoState) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!(tabInfoState instanceof TabInfoState.Ready)) {
                    return Unit.INSTANCE;
                }
                List list = ((TabInfoState.Ready) tabInfoState).tabs;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((TabInfo) it.next()).identifier == TabInfo.Id.Local) {
                                if (!((RealTabProvider) this.this$0).sharedUiVariables.hasSentLocalNavigationIconCDF) {
                                    ((RealTabProvider) this.this$0).sharedUiVariables.hasSentLocalNavigationIconCDF = true;
                                    ((RealTabProvider) this.this$0).analytics.track(new LocalClientTabViewNavIcon(), null);
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                ConcurrentLinkedQueue concurrentLinkedQueue = ((RealTagCommunicationTeardownRunner) this.L$0).teardownInFlight;
                zzb zzbVar = (zzb) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    try {
                        try {
                            concurrentLinkedQueue.add(zzbVar);
                            ((IsoDep) zzbVar.zza).close();
                        } catch (SecurityException e) {
                            Timber.Forest.e("Failed to close tag " + e, new Object[0]);
                        }
                    } catch (IOException e2) {
                        Timber.Forest.e("Failed to close tag " + e2, new Object[0]);
                    }
                    concurrentLinkedQueue.remove(zzbVar);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    concurrentLinkedQueue.remove(zzbVar);
                    throw th;
                }
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) this.this$0;
                if (((TapToPayPaymentPresenter$State) mutableState2.getValue()) instanceof TapToPayPaymentPresenter$State.Initialized) {
                    mutableState2.setValue(new TapToPayPaymentPresenter$State.CardTapped((Tag) this.L$0));
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new PagingDataWithCount((PagingData) this.L$0, ((Number) ((Query) this.this$0).executeAsOne()).longValue());
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AmountDisplayState amountDisplayState = (AmountDisplayState) this.L$0;
                CurrencyCode currencyCode = ((RecurringReloadConfigurationViewModel.Keypad) this.this$0).getCurrentAmount().currency_code;
                currencyCode.getClass();
                amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14));
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    RealGcmRegistrar gcmRegistrar = ((VariantSandboxedComponent.Impl) ((VariantSandboxedComponent) this.this$0)).gcmRegistrar();
                    StandaloneCoroutine standaloneCoroutine = gcmRegistrar.job;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    gcmRegistrar.job = JobKt.launch$default(gcmRegistrar.scope, gcmRegistrar.ioDispatcher, null, new RealGcmRegistrar$registerInBackground$1(gcmRegistrar, null), 2);
                    JobKt.cancel(coroutineScope, (CancellationException) null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    JobKt.cancel(coroutineScope, (CancellationException) null);
                    throw th2;
                }
            case 11:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Countries.onEachSandboxComponentExt((Context) this.this$0, coroutineScope2, new DateInputKt$DateInputTextField$3(new DateInputKt$DateInputTextField$3(coroutineScope2, 11), 12));
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                VariantSandboxedComponent.Impl impl = (VariantSandboxedComponent.Impl) ((VariantSandboxedComponent) this.L$0);
                AndroidConnectivityManager androidConnectivityManager = (AndroidConnectivityManager) impl.variantAppComponentConnectivityManagerProvider.lambda.invoke();
                FileDownloaderClientProvider fileDownloaderClientProvider = new FileDownloaderClientProvider(impl.provideAuthenticatedOkHttpClientProvider, impl.provideOkHttpClientProvider);
                Storage storage = (Storage) impl.provideStorageProvider.getValue();
                FileSystemProviderModule$provideProvider$1 fileSystemProviderModule$provideProvider$1 = FileSystemProviderModule$provideProvider$1.INSTANCE;
                androidConnectivityManager.getClass();
                storage.getClass();
                RealFileDownloader realFileDownloader = new RealFileDownloader(androidConnectivityManager, fileDownloaderClientProvider, storage, fileSystemProviderModule$provideProvider$1);
                String uri = Uri.parse((String) this.this$0).buildUpon().appendQueryParameter("size", "512").build().toString();
                uri.getClass();
                ByteString.Companion companion = ByteString.Companion;
                String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(ByteString.Companion.encodeUtf8(uri).digest$okio("SHA-256").hex(), ".png");
                FileDownloader$Category fileDownloader$Category = FileDownloader$Category.CASH_QR;
                if (realFileDownloader.download(fileDownloader$Category, m$1, uri, false) != FileDownloader$DownloadStatus.SUCCESS || (localUri = realFileDownloader.localUri(fileDownloader$Category, m$1)) == null || (path = localUri.getPath()) == null) {
                    return null;
                }
                return BitmapFactory.decodeFile(path);
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.L$0;
                cardSchemePresenter.analytics.track(new RoundUpsEnableTapEntryRow(), null);
                String str3 = ((RoundUpsElement) this.this$0).client_route;
                if (str3 != null) {
                    cardSchemePresenter.completeClientRoute(str3);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardSchemePresenter) this.L$0).completeClientRoute(((SpendingInsightsListItemViewModel) this.this$0).clientRoute);
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope3, null, null, new WalletHomePresenter$models$2$1((WalletHomePresenter) this.this$0, continuation, 4), 3);
                return Unit.INSTANCE;
            case 16:
                CardRegistry.SharedCardTransitionState sharedCardTransitionState = (CardRegistry.SharedCardTransitionState) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardRegistry) this.this$0).sharedCardTransitionState.setValue(sharedCardTransitionState);
                return Unit.INSTANCE;
            case 17:
                PointerInputChange pointerInputChange = (PointerInputChange) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState3 = (MutableState) this.this$0;
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                CardModelView cardModelView = (CardModelView) mutableState3.getValue();
                if (cardModelView != null) {
                    StateFlowKt.emitOrThrow(cardModelView.touchPoints, new PointF(Float.intBitsToFloat((int) (pointerInputChange.position >> 32)), Float.intBitsToFloat((int) (pointerInputChange.position & BodyPartID.bodyIdMax))));
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardGridNuxScene) this.L$0).setCards((ArrayList) this.this$0);
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardGridNuxScene) this.L$0).setCards((List) this.this$0);
                return Unit.INSTANCE;
            case 20:
                Pair pair = (Pair) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Quat quat = (Quat) pair.first;
                float floatValue = ((Number) pair.second).floatValue();
                CardNuxState cardNuxState = (CardNuxState) this.this$0;
                cardNuxState.getClass();
                quat.getClass();
                cardNuxState.currentRotation$delegate.setValue(quat);
                cardNuxState.currentZ$delegate.setValue(Float.valueOf(floatValue));
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState4 = (MutableState) this.this$0;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((CardNuxState) this.L$0).pendingGridReturnEntrance$delegate;
                Boolean bool = (Boolean) parcelableSnapshotMutableState.getValue();
                bool.getClass();
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                mutableState4.setValue(bool);
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.L$0).invoke((CardSchemeViewModel.Module.HeroTag) this.this$0);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.L$0).invoke(new WalletHomeViewEvent.PresentationStatusViewed((CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel) this.this$0));
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((ShiftNoteViewModel) this.L$0).toastState != null) {
                    ((MutableState) this.this$0).setValue(null);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.L$0).invoke(Boolean.FALSE);
                ((Function1) this.this$0).invoke(Boolean.TRUE);
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RenderingAndSnapshot renderingAndSnapshot = (RenderingAndSnapshot) this.L$0;
                SavedStateHandle savedStateHandle = (SavedStateHandle) this.this$0;
                if (savedStateHandle != null) {
                    savedStateHandle.set(new PickledTreesnapshot(renderingAndSnapshot.snapshot), "com.squareup.workflow1.ui.renderWorkflowIn-snapshot");
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str4 = (String) this.L$0;
                EditText editText = (EditText) this.this$0;
                if (!Intrinsics.areEqual(str4, editText.getText().toString())) {
                    editText.setText(str4);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AndroidFileSaver androidFileSaver = (AndroidFileSaver) this.this$0;
                try {
                    Result.Companion companion2 = Result.Companion;
                    String string2 = ((SharedPreferences) androidFileSaver.contentResolver$delegate.getValue()).getString("key_fraud_detection_data", null);
                    if (string2 == null) {
                        string2 = "";
                    }
                    jSONObject = new JSONObject(string2);
                    optString = StripeJsonUtils.optString("guid", jSONObject);
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.Companion;
                    failure = new Result.Failure(th3);
                }
                if (optString != null && (optString2 = StripeJsonUtils.optString("muid", jSONObject)) != null && (optString3 = StripeJsonUtils.optString("sid", jSONObject)) != null) {
                    failure = new FraudDetectionData(optString, jSONObject.optLong("timestamp", -1L), optString2, optString3);
                    if (failure instanceof Result.Failure) {
                        return failure;
                    }
                    return null;
                }
                failure = null;
                if (failure instanceof Result.Failure) {
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Lazy lazy = ((RealAnalyticsRequestV2Storage) this.L$0).sharedPrefs$delegate;
                SharedPreferences sharedPreferences = (SharedPreferences) lazy.getValue();
                String str5 = (String) this.this$0;
                String string3 = sharedPreferences.getString(str5, null);
                if (string3 == null) {
                    return null;
                }
                ((SharedPreferences) lazy.getValue()).edit().remove(str5).apply();
                try {
                    Result.Companion companion4 = Result.Companion;
                    Json.Default r12 = Json.Default;
                    r12.getClass();
                    failure2 = (AnalyticsRequestV2) r12.decodeFromString(string3, AnalyticsRequestV2.Companion.serializer());
                } catch (Throwable th4) {
                    Result.Companion companion5 = Result.Companion;
                    failure2 = new Result.Failure(th4);
                }
                if (failure2 instanceof Result.Failure) {
                    return null;
                }
                return failure2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowNode$tick$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowNode$tick$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
