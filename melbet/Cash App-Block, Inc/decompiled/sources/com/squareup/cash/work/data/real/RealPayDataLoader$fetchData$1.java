package com.squareup.cash.work.data.real;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.GlitterCardEffectKt$GlitterCardEffect$1$1$1;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectAddFavorite;
import com.squareup.cash.cdf.customerprofile.CustomerProfileConnectRemoveFavorite;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.favorites.data.AddFavoriteAnalytics;
import com.squareup.cash.favorites.data.FavoritesManager$Operation$Add$Result;
import com.squareup.cash.favorites.data.FavoritesManager$Operation$Remove$Result;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.data.RemoveFavoriteAnalytics;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$models$2$1$WhenMappings;
import com.squareup.cash.favorites.screens.FavoritesMessage;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewEvent;
import com.squareup.cash.gps.backend.api.Location;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.presenters.InstrumentSelectionPresenter$loadInstruments$1;
import com.squareup.cash.instruments.presenters.InstrumentSelectionPresenter$models$2$1$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.components.RepeatClicksOnLongPress$attachTo$2$1;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.ShareSheetViewKt$ShareSheetView$1$1$1;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardNuxAnimationsKt;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.cash.work.data.api.PayData;
import com.squareup.cash.work.data.api.PayDataState;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.util.compose.ConstantSpeedMotionDurationScale;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPayDataLoader$fetchData$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $merchantIdentifier;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $teamMemberId;
    public Object L$0;
    public boolean Z$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(CardSchemePresenter cardSchemePresenter, CardModule.CardElementAction cardElementAction, Function0 function0, boolean z, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.L$0 = cardSchemePresenter;
        this.this$0 = cardElementAction;
        this.$merchantIdentifier = function0;
        this.Z$0 = z;
        this.$teamMemberId = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$teamMemberId;
        Object obj3 = this.$merchantIdentifier;
        switch (i) {
            case 0:
                RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$1 = new RealPayDataLoader$fetchData$1((RealPayDataLoader) this.this$0, (MerchantIdentifier) obj3, (String) obj2, continuation);
                realPayDataLoader$fetchData$1.L$0 = obj;
                return realPayDataLoader$fetchData$1;
            case 1:
                return new RealPayDataLoader$fetchData$1(1, (List) this.L$0, (LazyListState) this.this$0, (AnimationSpec) obj3, (String) obj2, continuation, this.Z$0);
            case 2:
                return new RealPayDataLoader$fetchData$1(this.Z$0, (String) obj2, (Context) this.this$0, (MutableState) obj3, continuation);
            case 3:
                return new RealPayDataLoader$fetchData$1((MutableState) this.this$0, (CoroutineContext) obj3, this.Z$0, (Context) obj2, continuation);
            case 4:
                return new RealPayDataLoader$fetchData$1((RealTransferManager) this.this$0, (TransferFundsRequest) obj3, (TransferType) obj2, this.Z$0, continuation);
            case 5:
                return new RealPayDataLoader$fetchData$1(this.Z$0, (LocalHomePresenter) this.L$0, (String) obj2, (AddFavoritesViewEvent) this.this$0, (State) obj3, continuation);
            case 6:
                RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$12 = new RealPayDataLoader$fetchData$1((RoundUpsAutomationTarget) obj3, (Lazy) obj2, this.Z$0, continuation);
                realPayDataLoader$fetchData$12.L$0 = obj;
                return realPayDataLoader$fetchData$12;
            case 7:
                return new RealPayDataLoader$fetchData$1(7, (TransfersPresenter) this.L$0, (MutableState) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, this.Z$0);
            case 8:
                RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$13 = new RealPayDataLoader$fetchData$1(this.Z$0, (RealInvestingHistoricalData) this.this$0, (InvestmentEntityToken) obj3, (HistoricalRange) obj2, continuation, 8);
                realPayDataLoader$fetchData$13.L$0 = obj;
                return realPayDataLoader$fetchData$13;
            case 9:
                return new RealPayDataLoader$fetchData$1(this.Z$0, (MutableState) this.L$0, (MutableState) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation);
            case 10:
                RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$14 = new RealPayDataLoader$fetchData$1((Flow) this.this$0, continuation, (TabToolbarPresenter) obj3, this.Z$0, (MutableState) obj2);
                realPayDataLoader$fetchData$14.L$0 = obj;
                return realPayDataLoader$fetchData$14;
            case 11:
                return new RealPayDataLoader$fetchData$1((CardSchemePresenter) this.L$0, (CardModule.CardElementAction) this.this$0, (Function0) obj3, this.Z$0, (MutableState) obj2, continuation);
            case 12:
                RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$15 = new RealPayDataLoader$fetchData$1(this.Z$0, (CardWobbleState) obj3, (MutableState) obj2, continuation);
                realPayDataLoader$fetchData$15.this$0 = (Offset) obj;
                return realPayDataLoader$fetchData$15;
            case 13:
                return new RealPayDataLoader$fetchData$1((MutableSharedFlow) this.L$0, (State) this.this$0, this.Z$0, (CardWobbleState) obj3, (MutableState) obj2, continuation);
            case 14:
                return new RealPayDataLoader$fetchData$1(14, (CardScene) this.L$0, (Function0) this.this$0, (CardNuxState) obj3, (MutableState) obj2, continuation, this.Z$0);
            case 15:
                return new RealPayDataLoader$fetchData$1(this.Z$0, (PoolsListPresenter) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 15);
            default:
                return new RealPayDataLoader$fetchData$1(this.Z$0, (AndroidLocationProvider) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealPayDataLoader$fetchData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0217, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r12, r0, r5) == r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0207, code lost:
    
        if (((com.squareup.cash.card.onboarding.graphics.CardWobbleState) r9).wobbleCard(r5) == r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x045a, code lost:
    
        if (r0 == r12) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04a5, code lost:
    
        if (r0 == r12) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0665, code lost:
    
        if (app.cash.molecule.PlatformKt.animateScrollBy(r0, r11.offset - r0.scrollPosition.scrollOffset$delegate.getIntValue(), (androidx.compose.animation.core.AnimationSpec) r9, r5) == r1) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0671, code lost:
    
        if (r0.animateScrollToItem(r3, 0, r5) == r1) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0724, code lost:
    
        if (r1.emit(r3, r5) != r2) goto L336;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06fb A[Catch: Exception -> 0x06a8, CancellationException -> 0x072b, TryCatch #5 {CancellationException -> 0x072b, Exception -> 0x06a8, blocks: (B:344:0x06a3, B:346:0x06ad, B:348:0x06f7, B:350:0x06fb, B:355:0x070e, B:356:0x0715, B:358:0x06b6, B:359:0x06e7, B:362:0x06ba, B:364:0x06ce, B:368:0x06c3), top: B:328:0x0688 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x070e A[Catch: Exception -> 0x06a8, CancellationException -> 0x072b, TryCatch #5 {CancellationException -> 0x072b, Exception -> 0x06a8, blocks: (B:344:0x06a3, B:346:0x06ad, B:348:0x06f7, B:350:0x06fb, B:355:0x070e, B:356:0x0715, B:358:0x06b6, B:359:0x06e7, B:362:0x06ba, B:364:0x06ce, B:368:0x06c3), top: B:328:0x0688 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06f6  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$hasPayrollFeatures;
        boolean booleanValue;
        Object access$loadPayData;
        PayData payData;
        String str;
        Object withContext;
        MutableState mutableState;
        Object withContext2;
        Object doTransferFunds;
        RealTransferManager realTransferManager;
        int i;
        CustomerProfileConnectAddFavorite.SuggestionStrategy suggestionStrategy;
        Object addFavorite;
        Object removeFavorite;
        Object access$getAvatar;
        Object currentLocation;
        Object currentLocation2;
        RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$1 = this;
        int i2 = realPayDataLoader$fetchData$1.$r8$classId;
        int i3 = 3;
        int i4 = 2;
        Object obj2 = realPayDataLoader$fetchData$1.$teamMemberId;
        Object obj3 = realPayDataLoader$fetchData$1.$merchantIdentifier;
        ?? r11 = 0;
        switch (i2) {
            case 0:
                MerchantIdentifier merchantIdentifier = (MerchantIdentifier) obj3;
                RealPayDataLoader realPayDataLoader = (RealPayDataLoader) realPayDataLoader$fetchData$1.this$0;
                FlowCollector flowCollector = (FlowCollector) realPayDataLoader$fetchData$1.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = realPayDataLoader$fetchData$1.label;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    PayDataState.Error error = new PayDataState.Error(e2);
                    realPayDataLoader$fetchData$1.L$0 = null;
                    realPayDataLoader$fetchData$1.label = 5;
                    break;
                }
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    realPayDataLoader$fetchData$1.L$0 = flowCollector;
                    realPayDataLoader$fetchData$1.label = 1;
                    access$hasPayrollFeatures = RealPayDataLoader.access$hasPayrollFeatures(realPayDataLoader, merchantIdentifier, realPayDataLoader$fetchData$1);
                    if (access$hasPayrollFeatures == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    access$hasPayrollFeatures = obj;
                } else {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 4) {
                                SafeTrace.throwOnFailure(obj);
                            } else {
                                if (i5 != 5) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                        boolean z = realPayDataLoader$fetchData$1.Z$0;
                        SafeTrace.throwOnFailure(obj);
                        booleanValue = z;
                        access$loadPayData = obj;
                        payData = (PayData) access$loadPayData;
                        if (payData == null) {
                            throw new IllegalStateException("Failed to fetch shifts overview");
                        }
                        PayDataState.Loaded loaded = new PayDataState.Loaded(booleanValue, payData);
                        realPayDataLoader$fetchData$1.L$0 = flowCollector;
                        realPayDataLoader$fetchData$1.Z$0 = booleanValue;
                        realPayDataLoader$fetchData$1.label = 4;
                        if (flowCollector.emit(loaded, realPayDataLoader$fetchData$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return Unit.INSTANCE;
                    }
                    booleanValue = realPayDataLoader$fetchData$1.Z$0;
                    SafeTrace.throwOnFailure(obj);
                    realPayDataLoader$fetchData$1.L$0 = flowCollector;
                    realPayDataLoader$fetchData$1.Z$0 = booleanValue;
                    realPayDataLoader$fetchData$1.label = 3;
                    access$loadPayData = RealPayDataLoader.access$loadPayData(realPayDataLoader, merchantIdentifier, (String) obj2, booleanValue, realPayDataLoader$fetchData$1);
                    if (access$loadPayData == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    payData = (PayData) access$loadPayData;
                    if (payData == null) {
                    }
                }
                booleanValue = ((Boolean) access$hasPayrollFeatures).booleanValue();
                PayDataState.Loading loading = new PayDataState.Loading(booleanValue);
                realPayDataLoader$fetchData$1.L$0 = flowCollector;
                realPayDataLoader$fetchData$1.Z$0 = booleanValue;
                realPayDataLoader$fetchData$1.label = 2;
                if (flowCollector.emit(loading, realPayDataLoader$fetchData$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                realPayDataLoader$fetchData$1.L$0 = flowCollector;
                realPayDataLoader$fetchData$1.Z$0 = booleanValue;
                realPayDataLoader$fetchData$1.label = 3;
                access$loadPayData = RealPayDataLoader.access$loadPayData(realPayDataLoader, merchantIdentifier, (String) obj2, booleanValue, realPayDataLoader$fetchData$1);
                if (access$loadPayData == coroutineSingletons) {
                }
                payData = (PayData) access$loadPayData;
                if (payData == null) {
                }
            case 1:
                LazyListState lazyListState = (LazyListState) realPayDataLoader$fetchData$1.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = realPayDataLoader$fetchData$1.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = (String) obj2;
                    Iterator it = ((List) realPayDataLoader$fetchData$1.L$0).iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                        } else if (!Intrinsics.areEqual(((AfterpayAppletHomeContentViewModel.HomeSection) it.next()).id, str2)) {
                            i7++;
                        }
                    }
                    if (i7 >= 0) {
                        int i8 = i7 + (realPayDataLoader$fetchData$1.Z$0 ? 1 : 0);
                        Iterator it2 = lazyListState.getLayoutInfo().visibleItemsInfo.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((LazyListMeasuredItem) next).index == i8) {
                                    r11 = next;
                                }
                            }
                        }
                        if (((LazyListMeasuredItem) r11) == null) {
                            realPayDataLoader$fetchData$1.label = 2;
                            break;
                        } else {
                            realPayDataLoader$fetchData$1.label = 1;
                            break;
                        }
                    }
                } else {
                    if (i6 != 1 && i6 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = realPayDataLoader$fetchData$1.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (realPayDataLoader$fetchData$1.Z$0 && (str = (String) obj2) != null) {
                        MutableState mutableState2 = (MutableState) obj3;
                        Context context = (Context) realPayDataLoader$fetchData$1.this$0;
                        realPayDataLoader$fetchData$1.L$0 = mutableState2;
                        realPayDataLoader$fetchData$1.label = 1;
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new ShareSheetViewKt$ShareSheetView$1$1$1(context, str, null, 1), realPayDataLoader$fetchData$1);
                        if (withContext == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        mutableState = mutableState2;
                    }
                    return Unit.INSTANCE;
                }
                if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableState = (MutableState) realPayDataLoader$fetchData$1.L$0;
                SafeTrace.throwOnFailure(obj);
                withContext = obj;
                mutableState.setValue((Bitmap) withContext);
                return Unit.INSTANCE;
            case 3:
                MutableState mutableState3 = (MutableState) realPayDataLoader$fetchData$1.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = realPayDataLoader$fetchData$1.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (mutableState3.getValue() == null) {
                        GlitterCardEffectKt$GlitterCardEffect$1$1$1 glitterCardEffectKt$GlitterCardEffect$1$1$1 = new GlitterCardEffectKt$GlitterCardEffect$1$1$1(realPayDataLoader$fetchData$1.Z$0, (Context) obj2, null);
                        realPayDataLoader$fetchData$1.L$0 = mutableState3;
                        realPayDataLoader$fetchData$1.label = 1;
                        withContext2 = JobKt.withContext((CoroutineContext) obj3, glitterCardEffectKt$GlitterCardEffect$1$1$1, realPayDataLoader$fetchData$1);
                        if (withContext2 == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableState3 = (MutableState) realPayDataLoader$fetchData$1.L$0;
                SafeTrace.throwOnFailure(obj);
                withContext2 = obj;
                mutableState3.setValue(withContext2);
                return Unit.INSTANCE;
            case 4:
                int i11 = 5;
                TransferFundsRequest transferFundsRequest = (TransferFundsRequest) obj3;
                RealTransferManager realTransferManager2 = (RealTransferManager) realPayDataLoader$fetchData$1.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = realPayDataLoader$fetchData$1.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    realPayDataLoader$fetchData$1.L$0 = realTransferManager2;
                    realPayDataLoader$fetchData$1.label = 1;
                    doTransferFunds = realTransferManager2.doTransferFunds(transferFundsRequest, (TransferType) obj2, generateToken, true, null, this);
                    realPayDataLoader$fetchData$1 = this;
                    if (doTransferFunds == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    realTransferManager = realTransferManager2;
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    RealTransferManager realTransferManager3 = (RealTransferManager) realPayDataLoader$fetchData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realTransferManager = realTransferManager3;
                    doTransferFunds = obj;
                }
                RealTransferManager.InternalTransferFundsResult internalTransferFundsResult = (RealTransferManager.InternalTransferFundsResult) doTransferFunds;
                DialogHostKt$$ExternalSyntheticLambda2 dialogHostKt$$ExternalSyntheticLambda2 = new DialogHostKt$$ExternalSyntheticLambda2(realTransferManager2, transferFundsRequest, realPayDataLoader$fetchData$1.Z$0, i11);
                realTransferManager.getClass();
                if (internalTransferFundsResult instanceof RealTransferManager.InternalTransferFundsResult.Successful) {
                    return ((RealTransferManager.InternalTransferFundsResult.Successful) internalTransferFundsResult).result;
                }
                if (internalTransferFundsResult instanceof RealTransferManager.InternalTransferFundsResult.Failure) {
                    return (TransferManager.TransferFundsResult) dialogHostKt$$ExternalSyntheticLambda2.invoke(internalTransferFundsResult);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 5:
                String str3 = (String) obj2;
                AddFavoritesViewEvent addFavoritesViewEvent = (AddFavoritesViewEvent) realPayDataLoader$fetchData$1.this$0;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) realPayDataLoader$fetchData$1.L$0;
                EglCore eglCore = (EglCore) localHomePresenter.embeddedMapEnabled$delegate;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = realPayDataLoader$fetchData$1.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z2 = realPayDataLoader$fetchData$1.Z$0;
                    RealFavoritesManager realFavoritesManager = (RealFavoritesManager) localHomePresenter.store;
                    if (!z2) {
                        FavoriteOrigin favoriteOrigin = FavoriteOrigin.FAVORITE_ORIGIN_FAVORITES_MANAGEMENT;
                        Boolean bool = (Boolean) ((State) obj3).getValue();
                        int ordinal = ((AddFavoritesViewEvent.FavoriteClicked) addFavoritesViewEvent).section.ordinal();
                        if (ordinal == 0) {
                            i = 2;
                            suggestionStrategy = CustomerProfileConnectAddFavorite.SuggestionStrategy.SUGGESTED;
                        } else if (ordinal != 1) {
                            i = 2;
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            suggestionStrategy = CustomerProfileConnectAddFavorite.SuggestionStrategy.SEARCH;
                        } else {
                            i = 2;
                            suggestionStrategy = CustomerProfileConnectAddFavorite.SuggestionStrategy.CONTACTS;
                        }
                        AddFavoriteAnalytics addFavoriteAnalytics = new AddFavoriteAnalytics(bool, suggestionStrategy, CustomerProfileConnectAddFavorite.Origin.FAVORITES_MANAGEMENT);
                        realPayDataLoader$fetchData$1.label = i;
                        addFavorite = realFavoritesManager.addFavorite(str3, favoriteOrigin, null, addFavoriteAnalytics, realPayDataLoader$fetchData$1);
                        break;
                    } else {
                        FavoriteOrigin favoriteOrigin2 = FavoriteOrigin.FAVORITE_ORIGIN_FAVORITES_MANAGEMENT;
                        RemoveFavoriteAnalytics removeFavoriteAnalytics = new RemoveFavoriteAnalytics(CustomerProfileConnectRemoveFavorite.Origin.FAVORITES_MANAGEMENT);
                        realPayDataLoader$fetchData$1.label = 1;
                        removeFavorite = realFavoritesManager.removeFavorite(str3, favoriteOrigin2, removeFavoriteAnalytics, realPayDataLoader$fetchData$1);
                        break;
                    }
                    return coroutineSingletons6;
                }
                if (i13 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    removeFavorite = obj;
                    if (AddFavoritesPresenter$models$2$1$WhenMappings.$EnumSwitchMapping$0[((FavoritesManager$Operation$Remove$Result) removeFavorite).ordinal()] == 1) {
                        eglCore.showNoNetworkConnection();
                    }
                } else {
                    if (i13 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    addFavorite = obj;
                    i = 2;
                    int ordinal2 = ((FavoritesManager$Operation$Add$Result) addFavorite).ordinal();
                    if (ordinal2 == 0) {
                        String str4 = ((AddFavoritesViewEvent.FavoriteClicked) addFavoritesViewEvent).name;
                        eglCore.getClass();
                        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) eglCore.eglDisplay;
                        AndroidStringManager androidStringManager = (AndroidStringManager) eglCore.eglContext;
                        screenNavigator.goTo(new FavoritesMessage(androidStringManager.get(R.string.favorites_limit_title), androidStringManager.get(R.string.favorites_limit_message)));
                    } else if (ordinal2 == i) {
                        AddFavoritesViewEvent.FavoriteClicked favoriteClicked = (AddFavoritesViewEvent.FavoriteClicked) addFavoritesViewEvent;
                        EglCore.showAddedFavoriteSuccess$default((EglCore) localHomePresenter.embeddedMapEnabled$delegate, favoriteClicked.name, favoriteClicked.photo, favoriteClicked.accentColor, favoriteClicked.monogram, false);
                    } else if (ordinal2 == 3) {
                        eglCore.showNoNetworkConnection();
                    }
                }
                return Unit.INSTANCE;
            case 6:
                ProduceStateScope produceStateScope = (ProduceStateScope) realPayDataLoader$fetchData$1.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = realPayDataLoader$fetchData$1.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z3 = realPayDataLoader$fetchData$1.Z$0;
                    realPayDataLoader$fetchData$1.L$0 = null;
                    realPayDataLoader$fetchData$1.this$0 = produceStateScope;
                    realPayDataLoader$fetchData$1.label = 1;
                    access$getAvatar = ClosedRange.DefaultImpls.access$getAvatar((RoundUpsAutomationTarget) obj3, (Lazy) obj2, z3, realPayDataLoader$fetchData$1);
                    if (access$getAvatar == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope = (ProduceStateScope) realPayDataLoader$fetchData$1.this$0;
                    SafeTrace.throwOnFailure(obj);
                    access$getAvatar = obj;
                }
                produceStateScope.setValue(access$getAvatar);
                return Unit.INSTANCE;
            case 7:
                TransfersPresenter transfersPresenter = (TransfersPresenter) realPayDataLoader$fetchData$1.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = realPayDataLoader$fetchData$1.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FlowExtensionsKt$combine$$inlined$combine$1(25, new Flow[]{((RealBalanceSnapshotManager) transfersPresenter.accountFormatter).select(), ((RealInstrumentManager) transfersPresenter.syncValueReader).select(), ((RealAppConfigManager) ((AppConfigManager) transfersPresenter.clipboardManager)).instrumentLinkingConfig(), ((RealInstrumentLinkingOptionManager) transfersPresenter.issuedCardManager).select(), ((RealProfileManager) transfersPresenter.featureFlagManager).profile(), ((RealStatusAndLimitsManager) transfersPresenter.analytics).hasPassedIdv(), ((RealFamilyAccountsManager) transfersPresenter.router).isSponsored()}, new InstrumentSelectionPresenter$loadInstruments$1(transfersPresenter, realPayDataLoader$fetchData$1.Z$0, null)));
                    InstrumentSelectionPresenter$models$2$1$1 instrumentSelectionPresenter$models$2$1$1 = new InstrumentSelectionPresenter$models$2$1$1(transfersPresenter, (MutableState) realPayDataLoader$fetchData$1.this$0, (MutableState) obj3, (MutableState) obj2);
                    realPayDataLoader$fetchData$1.label = 1;
                    Object collect = distinctUntilChanged.collect(new RepeatClicksOnLongPress$attachTo$2$1(8, instrumentSelectionPresenter$models$2$1$1, transfersPresenter), realPayDataLoader$fetchData$1);
                    if (collect != coroutineSingletons8) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                ProducerScope producerScope = (ProducerScope) realPayDataLoader$fetchData$1.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = realPayDataLoader$fetchData$1.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealContactSync$syncRequest$2.AnonymousClass1 anonymousClass1 = new RealContactSync$syncRequest$2.AnonymousClass1(realPayDataLoader$fetchData$1.Z$0, (RealInvestingHistoricalData) realPayDataLoader$fetchData$1.this$0, (InvestmentEntityToken) obj3, (HistoricalRange) obj2, producerScope, (Continuation) null);
                    realPayDataLoader$fetchData$1.L$0 = null;
                    realPayDataLoader$fetchData$1.label = 1;
                    if (JobKt.coroutineScope(anonymousClass1, realPayDataLoader$fetchData$1) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                MutableState mutableState4 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = realPayDataLoader$fetchData$1.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!realPayDataLoader$fetchData$1.Z$0) {
                        Boolean bool2 = Boolean.FALSE;
                        mutableState4.setValue(bool2);
                        ((MutableState) obj2).setValue(bool2);
                        return Unit.INSTANCE;
                    }
                    ((MutableState) realPayDataLoader$fetchData$1.L$0).setValue(Boolean.FALSE);
                    MutableState mutableState5 = (MutableState) realPayDataLoader$fetchData$1.this$0;
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    mutableState5.setValue(emptyMap);
                    realPayDataLoader$fetchData$1.label = 1;
                    if (JobKt.delay(2000L, realPayDataLoader$fetchData$1) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState4.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope = (CoroutineScope) realPayDataLoader$fetchData$1.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = realPayDataLoader$fetchData$1.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) realPayDataLoader$fetchData$1.this$0;
                    TabToolbarPresenter$models$$inlined$CollectEffect$1$1 tabToolbarPresenter$models$$inlined$CollectEffect$1$1 = new TabToolbarPresenter$models$$inlined$CollectEffect$1$1(coroutineScope, (TabToolbarPresenter) obj3, realPayDataLoader$fetchData$1.Z$0, (MutableState) obj2);
                    realPayDataLoader$fetchData$1.L$0 = null;
                    realPayDataLoader$fetchData$1.label = 1;
                    if (flow.collect(tabToolbarPresenter$models$$inlined$CollectEffect$1$1, realPayDataLoader$fetchData$1) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = realPayDataLoader$fetchData$1.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) realPayDataLoader$fetchData$1.L$0;
                    CardModule.CardElementAction cardElementAction = (CardModule.CardElementAction) realPayDataLoader$fetchData$1.this$0;
                    String str5 = (String) ((Function0) obj3).invoke();
                    TabToolbarsKt$$ExternalSyntheticLambda10 tabToolbarsKt$$ExternalSyntheticLambda10 = realPayDataLoader$fetchData$1.Z$0 ? new TabToolbarsKt$$ExternalSyntheticLambda10(20, (MutableState) obj2) : null;
                    realPayDataLoader$fetchData$1.label = 1;
                    if (cardSchemePresenter.handleAction(cardElementAction, str5, tabToolbarsKt$$ExternalSyntheticLambda10, realPayDataLoader$fetchData$1) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                MutableState mutableState6 = (MutableState) obj2;
                Offset offset = (Offset) realPayDataLoader$fetchData$1.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = realPayDataLoader$fetchData$1.label;
                int i21 = 21;
                ConstantSpeedMotionDurationScale constantSpeedMotionDurationScale = ConstantSpeedMotionDurationScale.INSTANCE;
                try {
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (offset == null && realPayDataLoader$fetchData$1.Z$0) {
                            realPayDataLoader$fetchData$1.this$0 = null;
                            realPayDataLoader$fetchData$1.label = 1;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i20 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        HeroCardViewKt$Render$1$8$1.AnonymousClass3 anonymousClass3 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState6, r11, i21);
                        realPayDataLoader$fetchData$1.this$0 = null;
                        realPayDataLoader$fetchData$1.label = 2;
                        break;
                    } else {
                        if (i20 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i20 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) realPayDataLoader$fetchData$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        throw th;
                    }
                } catch (Throwable th2) {
                    HeroCardViewKt$Render$1$8$1.AnonymousClass3 anonymousClass32 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState6, r11, i21);
                    realPayDataLoader$fetchData$1.this$0 = null;
                    realPayDataLoader$fetchData$1.L$0 = th2;
                    realPayDataLoader$fetchData$1.label = 3;
                    if (JobKt.withContext(constantSpeedMotionDurationScale, anonymousClass32, realPayDataLoader$fetchData$1) != coroutineSingletons13) {
                        throw th2;
                    }
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = realPayDataLoader$fetchData$1.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1((State) realPayDataLoader$fetchData$1.this$0, 12)), new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(i4, r11, 14), (MutableSharedFlow) realPayDataLoader$fetchData$1.L$0), new MulticastedPagingData$asPagingData$2(i3, (Continuation) r11, 9), 0);
                    RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$12 = new RealPayDataLoader$fetchData$1(realPayDataLoader$fetchData$1.Z$0, (CardWobbleState) obj3, (MutableState) obj2, (Continuation) null);
                    realPayDataLoader$fetchData$1.label = 1;
                    if (FlowKt.collectLatest(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, realPayDataLoader$fetchData$12, realPayDataLoader$fetchData$1) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CardScene cardScene = (CardScene) realPayDataLoader$fetchData$1.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = realPayDataLoader$fetchData$1.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    cardScene.configureCamera(25.0f, 8.87f);
                    if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                        cardScene.updateTransform(CardNuxAnimationsKt.computeCardRotation(CardNuxAnimationsKt.NUX_CARD_ROTATION, 7.0f, -21.0f, 68.0f), new Vector4(5.0f, 1.5f));
                    } else {
                        boolean z4 = realPayDataLoader$fetchData$1.Z$0;
                        Function0 function0 = (Function0) realPayDataLoader$fetchData$1.this$0;
                        if (z4) {
                            CardRegistry.SharedCardTransitionState sharedCardTransitionState = (CardRegistry.SharedCardTransitionState) function0.invoke();
                            cardScene.updateTransform((Quat) sharedCardTransitionState.rotation.getValue(), new Vector4(RecyclerView.DECELERATION_RATE, ((Number) sharedCardTransitionState.zTranslation.getValue()).floatValue()));
                        } else {
                            CardRegistry.SharedCardTransitionState sharedCardTransitionState2 = (CardRegistry.SharedCardTransitionState) function0.invoke();
                            CardScene cardScene2 = (CardScene) realPayDataLoader$fetchData$1.L$0;
                            CardModelView.ViewModel cardViewModelInternal = RevolvingInteractiveCardsKt.toCardViewModelInternal(((CardNuxState) obj3).getCurrentCard());
                            Quat quat = (Quat) sharedCardTransitionState2.rotation.getValue();
                            Vector4 vector4 = new Vector4(RecyclerView.DECELERATION_RATE, ((Number) sharedCardTransitionState2.zTranslation.getValue()).floatValue());
                            realPayDataLoader$fetchData$1.label = 1;
                            if (cardScene2.updateCard(cardViewModelInternal, quat, vector4, null, realPayDataLoader$fetchData$1) == coroutineSingletons15) {
                                return coroutineSingletons15;
                            }
                        }
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                MutableState mutableState7 = (MutableState) obj3;
                MutableState mutableState8 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = realPayDataLoader$fetchData$1.label;
                try {
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (realPayDataLoader$fetchData$1.Z$0 && ((Location) mutableState7.getValue()) == null) {
                            mutableState8.setValue(Boolean.TRUE);
                            AndroidLocationProvider androidLocationProvider = (AndroidLocationProvider) ((PoolsListPresenter) realPayDataLoader$fetchData$1.this$0).moneyFormatter;
                            realPayDataLoader$fetchData$1.L$0 = mutableState7;
                            realPayDataLoader$fetchData$1.label = 1;
                            currentLocation = androidLocationProvider.currentLocation(realPayDataLoader$fetchData$1);
                            if (currentLocation == coroutineSingletons16) {
                                return coroutineSingletons16;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState7 = (MutableState) realPayDataLoader$fetchData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    currentLocation = obj;
                    mutableState7.setValue((Location) currentLocation);
                    return Unit.INSTANCE;
                } finally {
                }
            default:
                MutableState mutableState9 = (MutableState) obj3;
                MutableState mutableState10 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = realPayDataLoader$fetchData$1.label;
                try {
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (realPayDataLoader$fetchData$1.Z$0 && ((Location) mutableState9.getValue()) == null) {
                            mutableState10.setValue(Boolean.TRUE);
                            AndroidLocationProvider androidLocationProvider2 = (AndroidLocationProvider) realPayDataLoader$fetchData$1.this$0;
                            realPayDataLoader$fetchData$1.L$0 = mutableState9;
                            realPayDataLoader$fetchData$1.label = 1;
                            currentLocation2 = androidLocationProvider2.currentLocation(realPayDataLoader$fetchData$1);
                            if (currentLocation2 == coroutineSingletons17) {
                                return coroutineSingletons17;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState9 = (MutableState) realPayDataLoader$fetchData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    currentLocation2 = obj;
                    mutableState9.setValue((Location) currentLocation2);
                    return Unit.INSTANCE;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(MutableState mutableState, CoroutineContext coroutineContext, boolean z, Context context, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.this$0 = mutableState;
        this.$merchantIdentifier = coroutineContext;
        this.Z$0 = z;
        this.$teamMemberId = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(RealTransferManager realTransferManager, TransferFundsRequest transferFundsRequest, TransferType transferType, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.this$0 = realTransferManager;
        this.$merchantIdentifier = transferFundsRequest;
        this.$teamMemberId = transferType;
        this.Z$0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(RoundUpsAutomationTarget roundUpsAutomationTarget, Lazy lazy, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.$merchantIdentifier = roundUpsAutomationTarget;
        this.$teamMemberId = lazy;
        this.Z$0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPayDataLoader$fetchData$1(int i, Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.Z$0 = z;
        this.this$0 = obj2;
        this.$merchantIdentifier = obj3;
        this.$teamMemberId = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(RealPayDataLoader realPayDataLoader, MerchantIdentifier merchantIdentifier, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = realPayDataLoader;
        this.$merchantIdentifier = merchantIdentifier;
        this.$teamMemberId = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(Flow flow, Continuation continuation, TabToolbarPresenter tabToolbarPresenter, boolean z, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 10;
        this.this$0 = flow;
        this.$merchantIdentifier = tabToolbarPresenter;
        this.Z$0 = z;
        this.$teamMemberId = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(MutableSharedFlow mutableSharedFlow, State state, boolean z, CardWobbleState cardWobbleState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.L$0 = mutableSharedFlow;
        this.this$0 = state;
        this.Z$0 = z;
        this.$merchantIdentifier = cardWobbleState;
        this.$teamMemberId = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.Z$0 = z;
        this.L$0 = mutableState;
        this.this$0 = mutableState2;
        this.$merchantIdentifier = mutableState3;
        this.$teamMemberId = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(boolean z, LocalHomePresenter localHomePresenter, String str, AddFavoritesViewEvent addFavoritesViewEvent, State state, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.Z$0 = z;
        this.L$0 = localHomePresenter;
        this.$teamMemberId = str;
        this.this$0 = addFavoritesViewEvent;
        this.$merchantIdentifier = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(boolean z, CardWobbleState cardWobbleState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.Z$0 = z;
        this.$merchantIdentifier = cardWobbleState;
        this.$teamMemberId = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPayDataLoader$fetchData$1(boolean z, Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.Z$0 = z;
        this.this$0 = obj;
        this.$merchantIdentifier = obj2;
        this.$teamMemberId = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPayDataLoader$fetchData$1(boolean z, String str, Context context, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.Z$0 = z;
        this.$teamMemberId = str;
        this.this$0 = context;
        this.$merchantIdentifier = mutableState;
    }
}
