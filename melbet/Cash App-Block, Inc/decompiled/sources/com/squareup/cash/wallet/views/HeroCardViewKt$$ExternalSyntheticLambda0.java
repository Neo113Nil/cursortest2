package com.squareup.cash.wallet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.UriHandler;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavHostController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.presenters.brand.checkout.CheckoutTipStateKt$rememberCheckoutTipState$1$1;
import app.cash.local.views.wallet.TabContentViewKt$SegmentedTabContent$3$1$1$1;
import coil3.Extras;
import com.google.android.datatransport.cct.StringMerger;
import com.google.android.libraries.places.internal.zzmx;
import com.miteksystems.misnap.workflow.fragment.HelpFragment$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.overlays.FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.lifecycle.WindowBoundLifecycleOwner;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.LocationStatus;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.PayHistoryListViewModel;
import com.squareup.cash.work.viewmodels.PayHistorySection;
import com.squareup.cash.work.viewmodels.TaxFormsListViewModel;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.scannerview.TextSetter;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$$ExternalSyntheticLambda6;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState$ViewEffect$OpenUrl;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import dagger.internal.Provider;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set of;
        Object value;
        AccountPickerState accountPickerState;
        Object value2;
        Object failure;
        PaymentMethod paymentMethod;
        int i = this.$r8$classId;
        int i2 = 17;
        int i3 = 12;
        int i4 = 6;
        boolean z = false;
        int i5 = 0;
        r11 = false;
        boolean z2 = false;
        z = false;
        int i6 = 1;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        Continuation continuation = null;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith((EnterTransitionImpl) obj3, (ExitTransitionImpl) obj2);
            case 1:
                CardRegistry cardRegistry = (CardRegistry) obj3;
                MutableState mutableState = (MutableState) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                boolean inTransition = cardRegistry.getInTransition();
                Animatable animatable = cardRegistry.cardAnimation;
                if (!inTransition || (((CardRegistry$CardTransition$TransitionType) mutableState.getValue()) != CardRegistry$CardTransition$TransitionType.SOURCE ? ((CardRegistry$CardTransition$TransitionType) mutableState.getValue()) != CardRegistry$CardTransition$TransitionType.TARGET || ((Number) animatable.getValue()).floatValue() >= 0.5f : ((Number) animatable.getValue()).floatValue() < 0.5f)) {
                    layoutNodeDrawScope.drawContent();
                }
                return Unit.INSTANCE;
            case 2:
                CardRegistry cardRegistry2 = (CardRegistry) obj3;
                CardRegistry.SharedCardTransitionState sharedCardTransitionState = (CardRegistry.SharedCardTransitionState) obj2;
                ((DisposableEffectScope) obj).getClass();
                cardRegistry2.sharedCardTransitionState.setValue(sharedCardTransitionState);
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(12, cardRegistry2, sharedCardTransitionState);
            case 3:
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj3);
                parcelableSnapshotMutableFloatState.setFloatValue(((((Float) obj).floatValue() * 2.0f) / ((ParcelableSnapshotMutableIntState) obj2).getIntValue()) + parcelableSnapshotMutableFloatState.getFloatValue());
                return Unit.INSTANCE;
            case 4:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new TabContentViewKt$SegmentedTabContent$3$1$1$1((DefaultPagerState) obj2, ((Integer) obj).intValue(), continuation, c == true ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 5:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                placementScope.place((Placeable) obj3, 0, ((ParcelableSnapshotMutableIntState) obj2).getIntValue(), RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 6:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj3;
                WindowBoundLifecycleOwner windowBoundLifecycleOwner = (WindowBoundLifecycleOwner) obj2;
                ((DisposableEffectScope) obj).getClass();
                lifecycleOwner.getLifecycle().addObserver(windowBoundLifecycleOwner);
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(13, lifecycleOwner, windowBoundLifecycleOwner);
            case 7:
                String str = (String) obj2;
                RealLastClockedInInfoUseCase.StoredLastClockedInInfo storedLastClockedInInfo = (RealLastClockedInInfoUseCase.StoredLastClockedInInfo) obj;
                storedLastClockedInInfo.getClass();
                if (Intrinsics.areEqual(storedLastClockedInInfo.merchantToken, ((MerchantIdentifier) obj3).token) && Intrinsics.areEqual(storedLastClockedInInfo.teamMemberId, str)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                LocationStatus locationStatus = (LocationStatus) obj2;
                Location location = (Location) obj;
                location.getClass();
                if (((Collection) obj3).contains(location.id) && (locationStatus == null || location.status == locationStatus)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 9:
                WindowInsetsControllerCompat windowInsetsControllerCompat = (WindowInsetsControllerCompat) obj3;
                Function0 function0 = (Function0) obj2;
                ((DisposableEffectScope) obj).getClass();
                if (windowInsetsControllerCompat != null) {
                    windowInsetsControllerCompat.setAppearanceLightStatusBars(false);
                }
                return new CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1(function0, 6);
            case 10:
                ((Boolean) obj).getClass();
                ((MutableState) obj2).setValue(((ClockInOverlayViewModel.PickerItem) obj3).identifier);
                return Unit.INSTANCE;
            case 11:
                PayHistoryListViewModel.Loaded loaded = (PayHistoryListViewModel.Loaded) obj3;
                Function1 function1 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                for (Object obj4 : loaded.sections) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    PayHistorySection payHistorySection = (PayHistorySection) obj4;
                    if (i5 > 0) {
                        LazyListScope.item$default(lazyListScope, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "spacer_"), null, PayCellViewKt.lambda$2040007030, 2);
                    }
                    LazyListScope.item$default(lazyListScope, Recorder$$ExternalSyntheticOutline2.m("header_", payHistorySection.title), null, new ComposableLambdaImpl(new CardAppletTile$$ExternalSyntheticLambda1(payHistorySection, i3), true, 67311899), 2);
                    ArrayList arrayList = payHistorySection.stubs;
                    int i8 = 16;
                    lazyListScope.items(arrayList.size(), new OverridingUtil.AnonymousClass7(i4, new StripePaymentController$$ExternalSyntheticLambda1(i8), arrayList), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(22, arrayList), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(arrayList, function1, loaded, i8), true, 802480018));
                    i5 = i7;
                    i3 = 12;
                    i4 = 6;
                }
                if (loaded.isLoadingMore) {
                    LazyListScope.item$default(lazyListScope, "loading_more", null, PayCellViewKt.f776lambda$2112342996, 2);
                }
                LazyListScope.item$default(lazyListScope, "bottom_spacer", null, PayCellViewKt.f778lambda$277313177, 2);
                return Unit.INSTANCE;
            case 12:
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                ArrayList arrayList2 = ((TaxFormsListViewModel.Loaded) obj3).forms;
                int i9 = 7;
                lazyListScope2.items(arrayList2.size(), new OverridingUtil.AnonymousClass7(i9, new StripePaymentController$$ExternalSyntheticLambda1(i2), arrayList2), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(23, arrayList2), new ComposableLambdaImpl(new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(arrayList2, (Function1) obj2, i9), true, 802480018));
                LazyListScope.item$default(lazyListScope2, "bottom_spacer", null, PayCellViewKt.lambda$1601590375, 2);
                return Unit.INSTANCE;
            case 13:
                AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) obj3;
                PartnerAccount partnerAccount = (PartnerAccount) obj2;
                AccountPickerState accountPickerState2 = (AccountPickerState) obj;
                accountPickerState2.getClass();
                AccountPickerState.Payload payload = (AccountPickerState.Payload) accountPickerState2.payload.invoke();
                if (payload != null) {
                    Set set = accountPickerState2.selectedIds;
                    int ordinal = payload.selectionMode.ordinal();
                    if (ordinal == 0) {
                        of = SetsKt__SetsJVMKt.setOf(partnerAccount.id);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        boolean contains = set.contains(partnerAccount.id);
                        String str2 = partnerAccount.id;
                        of = contains ? SetsKt___SetsKt.minus(set, str2) : SetsKt___SetsKt.plus(set, str2);
                    }
                    Set set2 = of;
                    accountPickerViewModel.getClass();
                    StateFlowImpl stateFlowImpl = accountPickerViewModel._stateFlow;
                    do {
                        value = stateFlowImpl.getValue();
                        accountPickerState = (AccountPickerState) value;
                        accountPickerState.getClass();
                    } while (!stateFlowImpl.compareAndSet(value, AccountPickerState.copy$default(accountPickerState, null, null, null, set2, null, 47)));
                    JobKt.launch$default(ViewModelKt.getViewModelScope(accountPickerViewModel), null, null, new CheckoutTipStateKt$rememberCheckoutTipState$1$1(set2, set, accountPickerViewModel, payload.singleAccount, (Continuation) null, 6), 3);
                } else {
                    accountPickerViewModel.logger.error("account clicked without available payload.", null);
                }
                return Unit.INSTANCE;
            case 14:
                OauthPrepane oauthPrepane = (OauthPrepane) obj3;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new SharedPartnerAuthKt$$ExternalSyntheticLambda6(oauthPrepane, z ? 1 : 0), true, -1236118734), 3);
                List list = oauthPrepane.body.entries;
                lazyListScope3.items(list.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list, 17), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(20, (Function1) obj2, list), true, 802480018));
                return Unit.INSTANCE;
            case 15:
                ((String) obj).getClass();
                ((ConfirmVerification.OTPError) obj2).getClass();
                ((UriHandler) obj3).openUri("https://support.link.co/contact/email?skipVerification=true");
                return Unit.INSTANCE;
            case 16:
                State state = (State) obj3;
                LinearGradient linearGradient = (LinearGradient) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(3.0f);
                float mo236toPx0680j_42 = drawScope.mo236toPx0680j_4(10.0f);
                long mo752getCenterF1C5BW0 = drawScope.mo752getCenterF1C5BW0();
                long j = BodyPartID.bodyIdMax;
                float intBitsToFloat = Float.intBitsToFloat((int) (mo752getCenterF1C5BW0 & BodyPartID.bodyIdMax));
                int intBitsToFloat2 = ((int) (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) / mo236toPx0680j_42)) + 2;
                AndroidPath Path = AndroidPath_androidKt.Path();
                int i10 = -1;
                while (i10 < intBitsToFloat2) {
                    float f = mo236toPx0680j_4 * 2.0f;
                    long j2 = j;
                    AndroidPath.addOval$default(Path, DBUtil.m1180Recttz77jQw((Float.floatToRawIntBits((((Number) state.getValue()).floatValue() + (i10 * mo236toPx0680j_42)) - mo236toPx0680j_42) << 32) | (Float.floatToRawIntBits(intBitsToFloat - mo236toPx0680j_4) & j), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & j2)));
                    i10++;
                    intBitsToFloat2 = intBitsToFloat2;
                    j = j2;
                }
                long j3 = j;
                GrpcMethod drawContext = drawScope.getDrawContext();
                long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    ((Extras.Key) drawContext.path).m1434clipPathmtrdDE(Path, 1);
                    DrawScope.m746drawRectAsUm42w$default(drawScope, linearGradient, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat - mo236toPx0680j_4) & j3), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(mo236toPx0680j_4 * 2.0f) & j3), RecyclerView.DECELERATION_RATE, null, null, 0, 120);
                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    throw th;
                }
            case 17:
                LinkAccountPickerState.Payload payload2 = (LinkAccountPickerState.Payload) obj3;
                List list2 = (List) obj2;
                LinkAccountPickerState linkAccountPickerState = (LinkAccountPickerState) obj;
                linkAccountPickerState.getClass();
                String str3 = payload2.title;
                List list3 = payload2.accounts;
                AddNewAccount addNewAccount = payload2.addNewAccount;
                String str4 = payload2.consumerSessionClientSecret;
                String str5 = payload2.defaultCta;
                FinancialConnectionsSessionManifest.Pane pane = payload2.nextPaneOnNewAccount;
                Map map = payload2.partnerToCoreAuths;
                boolean z3 = payload2.singleAccount;
                DataAccessNotice dataAccessNotice = payload2.multipleAccountTypesSelectedDataAccessNotice;
                String str6 = payload2.aboveCta;
                DataAccessNotice dataAccessNotice2 = payload2.defaultDataAccessNotice;
                boolean z4 = payload2.acquireConsentOnPrimaryCtaClick;
                str3.getClass();
                list2.getClass();
                addNewAccount.getClass();
                str4.getClass();
                str5.getClass();
                return LinkAccountPickerState.copy$default(linkAccountPickerState, new Async.Success(new LinkAccountPickerState.Payload(str3, list3, list2, addNewAccount, str4, str5, pane, map, z3, dataAccessNotice, str6, dataAccessNotice2, z4)), null, null, 6);
            case 18:
                PartnerAuthViewModel.Args args = (PartnerAuthViewModel.Args) obj2;
                ((CreationExtras) obj).getClass();
                PartnerAuthViewModel_Factory_Impl partnerAuthViewModel_Factory_Impl = (PartnerAuthViewModel_Factory_Impl) ((DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl) obj3).factoryProvider7.instance;
                FinancialConnectionsSessionManifest.Pane pane2 = args.pane;
                boolean z5 = args.inModal;
                Async.Uninitialized uninitialized = Async.Uninitialized.INSTANCE;
                SharedPartnerAuthState sharedPartnerAuthState = new SharedPartnerAuthState(pane2, uninitialized, null, uninitialized, z5);
                zzmx zzmxVar = partnerAuthViewModel_Factory_Impl.delegateFactory;
                return new PartnerAuthViewModel((CancelAuthorizationSession) ((DocumentCameraWorker_Factory) zzmxVar.zzy).get(), (PostAuthorizationSession) ((Provider) zzmxVar.zzz).get(), (CancelAuthorizationSession) ((DocumentCameraWorker_Factory) zzmxVar.zzb).get(), (CancelAuthorizationSession) ((DocumentCameraWorker_Factory) zzmxVar.zzd).get(), (FinancialConnectionsAnalyticsTrackerImpl) ((Provider) zzmxVar.zzg).get(), (String) ((Provider) zzmxVar.zzh).get(), (UriUtils) ((Provider) zzmxVar.zzi).get(), (TextSetter) ((DocumentCameraWorker_Factory) zzmxVar.zzj).get(), (GetOrFetchSync) ((Provider) zzmxVar.zzk).get(), (RealStandardIntegrityManagerFactory) ((CameraModule_CameraStatsManagerFactory) zzmxVar.zzl).get(), (RealHandleError) ((Provider) zzmxVar.zzm).get(), (NavigationManagerImpl) ((Provider) zzmxVar.zzn).get(), (ToolbarTuckTargets) ((SelfieDirectionFeed_Factory) zzmxVar.zzp).get(), (Logger$Companion$NOOP_LOGGER$1) ((Provider) zzmxVar.zzq).get(), (RealPresentSheet) ((Provider) zzmxVar.zzu).get(), (CoreAuthorizationPendingNetworkingRepairRepository) ((Provider) zzmxVar.zzw).get(), (TextSetter) ((DocumentCameraWorker_Factory) zzmxVar.zzc).get(), sharedPartnerAuthState, (NativeAuthFlowCoordinator) ((Provider) zzmxVar.zzt).get());
            case 19:
                IDConsentContentViewModel iDConsentContentViewModel = (IDConsentContentViewModel) obj3;
                String str7 = (String) obj2;
                FinancialConnectionsSessionManifest.Pane pane3 = IDConsentContentViewModel.PANE;
                iDConsentContentViewModel.getClass();
                StateFlowImpl stateFlowImpl2 = iDConsentContentViewModel._stateFlow;
                do {
                    value2 = stateFlowImpl2.getValue();
                } while (!stateFlowImpl2.compareAndSet(value2, IDConsentContentState.copy$default((IDConsentContentState) value2, null, null, new IDConsentContentState$ViewEffect$OpenUrl(str7), 3)));
                return Unit.INSTANCE;
            case 20:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new CameraHelper$unbind$2((MutableFloatState) obj2, continuation, 19), 3);
                return Unit.INSTANCE;
            case 21:
                String str8 = (String) obj3;
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel = (FinancialConnectionsLiteViewModel) obj2;
                FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = financialConnectionsLiteViewModel.args;
                CoroutineDispatcher coroutineDispatcher = financialConnectionsLiteViewModel.workContext;
                FinancialConnectionsLiteViewModel.State state2 = (FinancialConnectionsLiteViewModel.State) obj;
                state2.getClass();
                int i11 = 26;
                if (StringsKt.contains((CharSequence) str8, (CharSequence) state2.successUrl, false)) {
                    int ordinal2 = StringMerger.getFlowType(financialConnectionsSheetActivityArgs).ordinal();
                    if (ordinal2 == 0) {
                        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsLiteViewModel), coroutineDispatcher, null, new FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1(financialConnectionsLiteViewModel, z, continuation, z ? 1 : 0), 2);
                    } else if (ordinal2 == 1) {
                        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsLiteViewModel), null, null, new WorkerWorkflow$render$1(str8, financialConnectionsLiteViewModel, continuation, i11), 3);
                    } else {
                        if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsLiteViewModel), coroutineDispatcher, null, new FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1(financialConnectionsLiteViewModel, z, continuation, i6), 2);
                    }
                } else if (StringsKt.contains((CharSequence) str8, (CharSequence) state2.cancelUrl, false)) {
                    int ordinal3 = StringMerger.getFlowType(financialConnectionsSheetActivityArgs).ordinal();
                    if (ordinal3 == 0) {
                        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsLiteViewModel), coroutineDispatcher, null, new FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1(financialConnectionsLiteViewModel, c2 == true ? 1 : 0, continuation, z ? 1 : 0), 2);
                    } else if (ordinal3 == 1) {
                        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsLiteViewModel), null, null, new ExoPlayerVideoView.AnonymousClass2(financialConnectionsLiteViewModel, continuation, i11), 3);
                    } else {
                        if (ordinal3 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsLiteViewModel), coroutineDispatcher, null, new FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1(financialConnectionsLiteViewModel, c4 == true ? 1 : 0, continuation, c3 == true ? 1 : 0), 2);
                    }
                } else {
                    JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsLiteViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(financialConnectionsLiteViewModel, str8, continuation, 11), 3);
                }
                return Unit.INSTANCE;
            case 22:
                TextSetter textSetter = (TextSetter) obj3;
                KSerializer kSerializer = (KSerializer) obj2;
                String str9 = (String) obj;
                str9.getClass();
                try {
                    Result.Companion companion = Result.Companion;
                    failure = ((Json) textSetter.textSwitcher).decodeFromString(str9, kSerializer);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th2);
                }
                return new Result(failure);
            case 23:
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) obj3;
                ((DisposableEffectScope) obj).getClass();
                Lifecycle$$ExternalSyntheticLambda0 lifecycle$$ExternalSyntheticLambda0 = new Lifecycle$$ExternalSyntheticLambda0((MutableState) obj2, i4);
                lifecycleOwner2.getLifecycle().addObserver(lifecycle$$ExternalSyntheticLambda0);
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(14, lifecycleOwner2, lifecycle$$ExternalSyntheticLambda0);
            case 24:
                String str10 = (String) obj;
                str10.getClass();
                return ((FinancialConnectionsRequestExecutor) obj3).json.decodeFromString(str10, (KSerializer) obj2);
            case 25:
                NavHostController navHostController = (NavHostController) obj3;
                ((DisposableEffectScope) obj).getClass();
                HelpFragment$$ExternalSyntheticLambda2 helpFragment$$ExternalSyntheticLambda2 = new HelpFragment$$ExternalSyntheticLambda2((MutableState) obj2, i3);
                navHostController.addOnDestinationChangedListener(helpFragment$$ExternalSyntheticLambda2);
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(15, navHostController, helpFragment$$ExternalSyntheticLambda2);
            case 26:
                Function2 function2 = (Function2) obj2;
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                ((Function1) obj3).invoke(lazyListScope4);
                if (function2 == null) {
                    LazyListScope.item$default(lazyListScope4, null, null, LayoutKt.lambda$2070000352, 3);
                }
                return Unit.INSTANCE;
            case 27:
                StripeApiRepository stripeApiRepository = (StripeApiRepository) obj3;
                PaymentMethodCreateParams paymentMethodCreateParams = (PaymentMethodCreateParams) obj2;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
                String str11 = paymentMethodCreateParams.code;
                Set attribution = paymentMethodCreateParams.getAttribution();
                paymentAnalyticsRequestFactory.getClass();
                str11.getClass();
                attribution.getClass();
                stripeApiRepository.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentMethodCreate, attribution, str11, null, null, 56));
                return Unit.INSTANCE;
            case 28:
                CollectBankAccountViewModel collectBankAccountViewModel = (CollectBankAccountViewModel) obj3;
                FinancialConnectionsSheetInstantDebitsResult.Completed completed = (FinancialConnectionsSheetInstantDebitsResult.Completed) obj2;
                StripeIntent stripeIntent = (StripeIntent) obj;
                String str12 = completed.encodedPaymentMethod;
                collectBankAccountViewModel.getClass();
                try {
                    paymentMethod = SetupIntentJsonParser.parse(new JSONObject(str12));
                } catch (Exception e) {
                    collectBankAccountViewModel.logger.error("Failed to parse PaymentMethod", e);
                    paymentMethod = null;
                }
                return new CollectBankAccountResponseInternal(stripeIntent, null, paymentMethod != null ? new CollectBankAccountResponseInternal.InstantDebitsData(paymentMethod, completed.last4, completed.bankName, completed.eligibleForIncentive) : null);
            default:
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) obj3;
                ChallengeResult challengeResult = (ChallengeResult) obj;
                int i12 = Stripe3ds2TransactionActivity.$r8$clinit;
                challengeResult.getClass();
                return JobKt.launch$default(ViewModelKt.getCoroutineScope(stripe3ds2TransactionActivity.getLifecycle()), null, null, new FlowKt__LimitKt$transformWhile$1(stripe3ds2TransactionActivity, challengeResult, (ViewModelLazy) obj2, null, 2), 3);
        }
    }
}
