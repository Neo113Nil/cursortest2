package com.squareup.cash.wallet.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.input.pointer.PointerInputScope;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.navigation.LocalInstalledStoreKt;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cdf.cashcard.CashCardTabError;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$models$2$1$1;
import com.squareup.cash.recurringpayments.presenters.RealCreateOrEditRecurringPaymentPresenter;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.wallet.db.CardTabHeroState;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.data.api.DateRangedFeed;
import com.squareup.cash.work.data.api.EmployerTaxForms;
import com.squareup.cash.work.data.api.ShiftDataState;
import com.squareup.cash.work.data.api.TaxFormData;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.data.real.ShiftLoaderContext;
import com.squareup.cash.work.service.api.taxforms.TaxFormJsonData;
import com.squareup.cash.work.service.api.taxforms.TaxFormsResponse;
import com.squareup.cash.work.service.api.taxforms.TaxFormsService;
import com.squareup.cash.work.wages.real.EmployerIdentity;
import com.squareup.cash.work.wages.real.RealWagesTaxDocumentManager;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.cash.postcard.app.RefreshCardTabSchemeRequest;
import com.squareup.protos.cash.postcard.app.RefreshCardTabSchemeResponse;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import com.squareup.workflow1.TimerWorker$run$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ComparableRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.sync.Mutex;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$models$3$1 extends SuspendLambda implements Function2 {
    public Object $cardModules;
    public /* synthetic */ Object $cashAppCard$delegate;
    public Object $loadingRefresh$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $refreshCount$delegate;
    public Object $refreshedCardTab$delegate;
    public Object $showRetryError$delegate;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$models$3$1(PointerInputScope pointerInputScope, CardScene cardScene, CoroutineScope coroutineScope, State state, MutableSharedFlow mutableSharedFlow, MutableState mutableState, MutableState mutableState2, MutableSharedFlow mutableSharedFlow2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.L$0 = pointerInputScope;
        this.$cardModules = cardScene;
        this.this$0 = coroutineScope;
        this.$cashAppCard$delegate = state;
        this.$refreshedCardTab$delegate = mutableSharedFlow;
        this.$loadingRefresh$delegate = mutableState;
        this.$showRetryError$delegate = mutableState2;
        this.$refreshCount$delegate = mutableSharedFlow2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$refreshCount$delegate;
        switch (i) {
            case 0:
                return new CardSchemePresenter$models$3$1((CardSchemePresenter) this.this$0, (List) this.$cardModules, (MutableState) this.$loadingRefresh$delegate, (State) this.$cashAppCard$delegate, (MutableState) this.$showRetryError$delegate, (ParcelableSnapshotMutableIntState) obj2, (MutableState) this.$refreshedCardTab$delegate, continuation);
            case 1:
                CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$1 = new CardSchemePresenter$models$3$1((Flow) this.$cardModules, continuation, (RealCreateOrEditRecurringPaymentPresenter) this.this$0, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, (MutableState) this.$cashAppCard$delegate, (MutableState) obj2, 1);
                cardSchemePresenter$models$3$1.L$0 = obj;
                return cardSchemePresenter$models$3$1;
            case 2:
                CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$12 = new CardSchemePresenter$models$3$1((Flow) this.$cardModules, continuation, (SelectPaymentPlanBlockerPresenter) this.this$0, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, (MutableState) this.$cashAppCard$delegate, (MutableState) obj2, 2);
                cardSchemePresenter$models$3$12.L$0 = obj;
                return cardSchemePresenter$models$3$12;
            case 3:
                CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$13 = new CardSchemePresenter$models$3$1((Flow) this.$cardModules, continuation, (SavingsScreenPresenter) this.this$0, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, (MutableState) this.$cashAppCard$delegate, (MutableState) obj2, 3);
                cardSchemePresenter$models$3$13.L$0 = obj;
                return cardSchemePresenter$models$3$13;
            case 4:
                CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$14 = new CardSchemePresenter$models$3$1((Flow) this.$cardModules, continuation, (SupportHomePresenter) this.this$0, (State) this.$cashAppCard$delegate, (State) obj2, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate);
                cardSchemePresenter$models$3$14.L$0 = obj;
                return cardSchemePresenter$models$3$14;
            case 5:
                CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$15 = new CardSchemePresenter$models$3$1((Flow) this.$cardModules, continuation, (CardLockPresenter) this.this$0, (CoroutineScope) obj2, (State) this.$cashAppCard$delegate, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate);
                cardSchemePresenter$models$3$15.L$0 = obj;
                return cardSchemePresenter$models$3$15;
            case 6:
                CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$16 = new CardSchemePresenter$models$3$1((CardSchemePresenter) this.this$0, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, (MutableState) this.$cardModules, (ParcelableSnapshotMutableIntState) obj2, (ProduceStateScope) this.$cashAppCard$delegate, continuation);
                cardSchemePresenter$models$3$16.L$0 = obj;
                return cardSchemePresenter$models$3$16;
            case 7:
                return new CardSchemePresenter$models$3$1((PointerInputScope) this.L$0, (CardScene) this.$cardModules, (CoroutineScope) this.this$0, (State) this.$cashAppCard$delegate, (MutableSharedFlow) this.$refreshedCardTab$delegate, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableSharedFlow) obj2, continuation);
            case 8:
                CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$17 = new CardSchemePresenter$models$3$1((ShiftLoaderContext) this.$showRetryError$delegate, (RealShiftDataLoader) this.$refreshedCardTab$delegate, (ComparableRange) this.$cashAppCard$delegate, (ComparableRange) obj2, continuation);
                cardSchemePresenter$models$3$17.$loadingRefresh$delegate = obj;
                return cardSchemePresenter$models$3$17;
            default:
                CardSchemePresenter$models$3$1 cardSchemePresenter$models$3$18 = new CardSchemePresenter$models$3$1((RealWagesTaxDocumentManager) obj2, continuation);
                cardSchemePresenter$models$3$18.$cashAppCard$delegate = obj;
                return cardSchemePresenter$models$3$18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CardSchemePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((CardSchemePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((CardSchemePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((CardSchemePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((CardSchemePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((CardSchemePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((CardSchemePresenter$models$3$1) create((CardTabHeroState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((CardSchemePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((CardSchemePresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((CardSchemePresenter$models$3$1) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x0754, code lost:
    
        if (com.squareup.cash.wallet.presenters.CardSchemePresenter.access$containsCardScheme(r9, r4) == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x07a5, code lost:
    
        if (com.squareup.cash.wallet.presenters.CardSchemePresenter.access$containsCardScheme(r9, r4) == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0728, code lost:
    
        if (r1 == r12) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x069e, code lost:
    
        if (r13.awaitInternal(r27) == r12) goto L263;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018e A[Catch: Exception -> 0x0187, TRY_LEAVE, TryCatch #4 {Exception -> 0x0187, blocks: (B:77:0x015f, B:112:0x018e, B:113:0x0169, B:117:0x0172, B:120:0x017e, B:121:0x017a), top: B:76:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f7 A[Catch: Exception -> 0x01ac, TryCatch #1 {Exception -> 0x01ac, blocks: (B:84:0x01a8, B:125:0x019b, B:131:0x01bc, B:133:0x01e8, B:134:0x01f3, B:137:0x01f7, B:139:0x01fd, B:140:0x0217, B:141:0x021c), top: B:83:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x029c A[Catch: all -> 0x02ba, TryCatch #5 {all -> 0x02ba, blocks: (B:10:0x0287, B:11:0x0296, B:13:0x029c, B:16:0x02ae, B:21:0x02bd, B:22:0x02ca, B:24:0x02d0, B:31:0x02e4, B:27:0x02e8, B:34:0x02ec, B:35:0x02f9, B:37:0x02ff, B:40:0x030d), top: B:9:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02d0 A[Catch: all -> 0x02ba, TryCatch #5 {all -> 0x02ba, blocks: (B:10:0x0287, B:11:0x0296, B:13:0x029c, B:16:0x02ae, B:21:0x02bd, B:22:0x02ca, B:24:0x02d0, B:31:0x02e4, B:27:0x02e8, B:34:0x02ec, B:35:0x02f9, B:37:0x02ff, B:40:0x030d), top: B:9:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[LOOP:5: B:301:0x077d->B:317:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ff A[Catch: all -> 0x02ba, TryCatch #5 {all -> 0x02ba, blocks: (B:10:0x0287, B:11:0x0296, B:13:0x029c, B:16:0x02ae, B:21:0x02bd, B:22:0x02ca, B:24:0x02d0, B:31:0x02e4, B:27:0x02e8, B:34:0x02ec, B:35:0x02f9, B:37:0x02ff, B:40:0x030d), top: B:9:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d A[Catch: Exception -> 0x01b8, TryCatch #3 {Exception -> 0x01b8, blocks: (B:60:0x0117, B:62:0x011d, B:63:0x0130, B:65:0x0136), top: B:59:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00da  */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0114 -> B:42:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x021d -> B:71:0x0223). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        boolean z;
        Object refreshCardTabScheme;
        CashAppCard cashAppCard;
        SyncValue.Value value;
        boolean z2;
        SyncEntitiesResponse syncEntitiesResponse;
        Object awaitInternal;
        DeferredCoroutine deferredCoroutine;
        DayOfWeek dayOfWeek;
        Object await;
        DayOfWeek dayOfWeek2;
        DateRangedFeed dateRangedFeed;
        ArrayList arrayList;
        Set set;
        LinkedHashMap linkedHashMap;
        LinkedHashSet linkedHashSet;
        Iterator it;
        Mutex mutex;
        Set set2;
        Map map;
        LinkedHashSet linkedHashSet2;
        Object taxForms;
        LinkedHashSet linkedHashSet3;
        LinkedHashSet linkedHashSet4;
        TaxFormData taxFormData;
        TaxFormData taxFormData2;
        String str;
        String str2;
        String obj2;
        Mutex mutex2;
        Iterator it2;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj3 = this.$refreshCount$delegate;
        boolean z3 = true;
        z3 = true;
        Object obj4 = null;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) this.$refreshedCardTab$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                State state = (State) this.$cashAppCard$delegate;
                MutableState mutableState2 = (MutableState) this.$showRetryError$delegate;
                List list2 = (List) this.$cardModules;
                MutableState mutableState3 = (MutableState) this.$loadingRefresh$delegate;
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.this$0;
                SyncTopic syncTopic = cardSchemePresenter.cardTopic;
                Analytics analytics = cardSchemePresenter.analytics;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState3.setValue(Boolean.TRUE);
                    ClientSyncConfig clientSyncConfig = (ClientSyncConfig) cardSchemePresenter.syncValueReader.getSingleValue(AndroidSyncValueSpecs.ClientSyncConfig).getValue();
                    list = clientSyncConfig != null ? clientSyncConfig.topic_sync_allowlist : null;
                    if (list == null) {
                        list = EmptyList.INSTANCE;
                    }
                    SetBuilder setBuilder = new SetBuilder();
                    setBuilder.addAll(cardSchemePresenter.cashAppTagSyncTopicProvider.topicsToSync(list));
                    if (list.contains(new Integer(syncTopic.value))) {
                        setBuilder.add(syncTopic);
                    }
                    SetBuilder build = SetsKt__SetsJVMKt.build(setBuilder);
                    if (!build.backing.isEmpty()) {
                        CompletableDeferredImpl sync = cardSchemePresenter.clientSyncer.sync(SyncTrigger.USER_ACTION, build);
                        this.L$0 = list;
                        z = true;
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        refreshCardTabScheme = obj;
                        z = true;
                        ApiResult apiResult = (ApiResult) refreshCardTabScheme;
                        if (apiResult instanceof ApiResult.Success) {
                            ResponseContext responseContext = ((RefreshCardTabSchemeResponse) ((ApiResult.Success) apiResult).response).response_context;
                            List list3 = (responseContext == null || (syncEntitiesResponse = responseContext.sync_entities_data) == null) ? null : syncEntitiesResponse.entities;
                            if (list3 == null) {
                                list3 = EmptyList.INSTANCE;
                            }
                            if (list2.isEmpty()) {
                                break;
                            } else {
                                if (CardSchemePresenter.containsHeroCard(list2) && ((CashAppCard) state.getValue()) == null) {
                                    List list4 = list3;
                                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                        Iterator it3 = list4.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                SyncValue syncValue = ((SyncEntity) it3.next()).sync_value;
                                                if (syncValue != null && (value = syncValue.value) != null) {
                                                    SyncValue.Value.CashAppCard cashAppCard2 = value instanceof SyncValue.Value.CashAppCard ? (SyncValue.Value.CashAppCard) value : null;
                                                    if (cashAppCard2 != null) {
                                                        cashAppCard = cashAppCard2.value;
                                                        if (cashAppCard == null) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                cashAppCard = null;
                                                if (cashAppCard == null) {
                                                }
                                            }
                                        }
                                    }
                                    z2 = z;
                                }
                                z2 = false;
                            }
                            mutableState2.setValue(Boolean.valueOf(z2));
                            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                                analytics.track(new CashCardTabError(new Integer(parcelableSnapshotMutableIntState.getIntValue())), null);
                            }
                            mutableState.setValue(Boolean.TRUE);
                            mutableState3.setValue(Boolean.FALSE);
                        }
                        if (apiResult instanceof ApiResult.Failure) {
                            boolean z4 = (CardSchemePresenter.containsHeroCard(list2) && ((CashAppCard) state.getValue()) == null) ? z : false;
                            mutableState3.setValue(Boolean.FALSE);
                            mutableState.setValue(Boolean.TRUE);
                            mutableState2.setValue(Boolean.valueOf((list2.isEmpty() || z4) ? z : false));
                            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                                analytics.track(new CashCardTabError(new Integer(parcelableSnapshotMutableIntState.getIntValue())), null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    list = (List) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                z = true;
                if (list.contains(new Integer(syncTopic.value))) {
                    mutableState2.setValue(Boolean.valueOf((list2.isEmpty() || ((!CardSchemePresenter.containsHeroCard(list2) || ((CashAppCard) state.getValue()) != null) ? false : z)) ? z : false));
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        analytics.track(new CashCardTabError(new Integer(parcelableSnapshotMutableIntState.getIntValue())), null);
                    }
                    mutableState.setValue(Boolean.TRUE);
                    mutableState3.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
                PostcardClientService postcardClientService = cardSchemePresenter.postcardService;
                RefreshCardTabSchemeRequest refreshCardTabSchemeRequest = new RefreshCardTabSchemeRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191));
                this.L$0 = null;
                this.label = 2;
                refreshCardTabScheme = postcardClientService.refreshCardTabScheme(refreshCardTabSchemeRequest, this);
                break;
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$cardModules;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$1 = new MerchantProfilePresenter$models$2$1$1(coroutineScope, (MoleculePresenter) this.this$0, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, (MutableState) this.$cashAppCard$delegate, (MutableState) obj3, 15);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(merchantProfilePresenter$models$2$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$cardModules;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$12 = new MerchantProfilePresenter$models$2$1$1(coroutineScope2, (MoleculePresenter) this.this$0, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, (MutableState) this.$cashAppCard$delegate, (MutableState) obj3, 16);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(merchantProfilePresenter$models$2$1$12, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$cardModules;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$13 = new MerchantProfilePresenter$models$2$1$1(coroutineScope3, (MoleculePresenter) this.this$0, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, (MutableState) this.$cashAppCard$delegate, (MutableState) obj3, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(merchantProfilePresenter$models$2$1$13, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$cardModules;
                    MerchantProfilePresenter$models$2$1$1 merchantProfilePresenter$models$2$1$14 = new MerchantProfilePresenter$models$2$1$1(coroutineScope4, (SupportHomePresenter) this.this$0, (State) this.$cashAppCard$delegate, (State) obj3, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(merchantProfilePresenter$models$2$1$14, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$cardModules;
                    ZiplineLoader$load$2.AnonymousClass1 anonymousClass1 = new ZiplineLoader$load$2.AnonymousClass1(coroutineScope5, (CardLockPresenter) this.this$0, (CoroutineScope) obj3, (State) this.$cashAppCard$delegate, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, 19);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(anonymousClass1, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CardSchemePresenter cardSchemePresenter2 = (CardSchemePresenter) this.this$0;
                CardTabHeroState cardTabHeroState = (CardTabHeroState) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new StateFlowKt$$ExternalSyntheticLambda3(cardSchemePresenter2, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableState) this.$refreshedCardTab$delegate, (MutableState) this.$cardModules, (ParcelableSnapshotMutableIntState) obj3, 6));
                    HeroCardViewKt$Render$1$4$1 heroCardViewKt$Render$1$4$1 = new HeroCardViewKt$Render$1$4$1(cardTabHeroState, (ProduceStateScope) this.$cashAppCard$delegate, cardSchemePresenter2, null, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, heroCardViewKt$Render$1$4$1, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                    CoreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1 coreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1((CardScene) this.$cardModules, (CoroutineScope) this.this$0, (State) this.$cashAppCard$delegate, (MutableSharedFlow) this.$refreshedCardTab$delegate, (MutableState) this.$loadingRefresh$delegate, (MutableState) this.$showRetryError$delegate, (MutableSharedFlow) obj3, null);
                    this.label = 1;
                    if (Draggable2DKt.awaitEachGesture(pointerInputScope, coreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                ShiftLoaderContext shiftLoaderContext = (ShiftLoaderContext) this.$showRetryError$delegate;
                RealShiftDataLoader realShiftDataLoader = (RealShiftDataLoader) this.$refreshedCardTab$delegate;
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$loadingRefresh$delegate;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                Continuation continuation = null;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeferredCoroutine async$default = JobKt.async$default(coroutineScope6, null, null, new TimerWorker$run$1(realShiftDataLoader, (ComparableRange) this.$cashAppCard$delegate, continuation, 17), 3);
                    DeferredCoroutine async$default2 = JobKt.async$default(coroutineScope6, null, null, new CardAppletWorker$setup$1$2$1(realShiftDataLoader, (ComparableRange) obj3, shiftLoaderContext, null, 26), 3);
                    DayOfWeek dayOfWeek3 = shiftLoaderContext.weekStartDay;
                    this.$loadingRefresh$delegate = null;
                    this.L$0 = async$default2;
                    this.$cardModules = dayOfWeek3;
                    this.label = 1;
                    awaitInternal = async$default.awaitInternal(this);
                    if (awaitInternal != coroutineSingletons9) {
                        deferredCoroutine = async$default2;
                        dayOfWeek = dayOfWeek3;
                    }
                    return coroutineSingletons9;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dateRangedFeed = (DateRangedFeed) this.this$0;
                    DayOfWeek dayOfWeek4 = (DayOfWeek) this.$cardModules;
                    SafeTrace.throwOnFailure(obj);
                    dayOfWeek2 = dayOfWeek4;
                    await = obj;
                    return new ShiftDataState.Ready(dayOfWeek2, dateRangedFeed, (DateRangedFeed) await);
                }
                dayOfWeek = (DayOfWeek) this.$cardModules;
                DeferredCoroutine deferredCoroutine2 = (DeferredCoroutine) this.L$0;
                SafeTrace.throwOnFailure(obj);
                deferredCoroutine = deferredCoroutine2;
                awaitInternal = obj;
                DateRangedFeed dateRangedFeed2 = (DateRangedFeed) awaitInternal;
                this.$loadingRefresh$delegate = null;
                this.L$0 = null;
                this.$cardModules = dayOfWeek;
                this.this$0 = dateRangedFeed2;
                this.label = 2;
                await = deferredCoroutine.await(this);
                if (await != coroutineSingletons9) {
                    dayOfWeek2 = dayOfWeek;
                    dateRangedFeed = dateRangedFeed2;
                    return new ShiftDataState.Ready(dayOfWeek2, dateRangedFeed, (DateRangedFeed) await);
                }
                return coroutineSingletons9;
            default:
                RealWagesTaxDocumentManager realWagesTaxDocumentManager = (RealWagesTaxDocumentManager) obj3;
                List list5 = (List) this.$cashAppCard$delegate;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list5.size(), "WagesTaxDocs: Found ", " merchants"), new Object[0]);
                    List list6 = list5;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((EmployerIdentity) it4.next()).token);
                    }
                    set = CollectionsKt.toSet(arrayList);
                    linkedHashMap = new LinkedHashMap();
                    linkedHashSet = new LinkedHashSet();
                    it = list5.iterator();
                    if (!it.hasNext()) {
                    }
                    return coroutineSingletons10;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realWagesTaxDocumentManager = (RealWagesTaxDocumentManager) this.$refreshedCardTab$delegate;
                    mutex = (Mutex) this.$showRetryError$delegate;
                    map = (Map) this.this$0;
                    set2 = (Set) this.$cardModules;
                    List list7 = (List) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    arrayList = list7;
                    mutex2 = mutex;
                    try {
                        Map map2 = realWagesTaxDocumentManager.cachedFormsByToken;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            if (set2.contains((String) entry.getKey())) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str3 = (String) entry2.getKey();
                            EmployerTaxForms employerTaxForms = (EmployerTaxForms) entry2.getValue();
                            if (employerTaxForms == null) {
                                linkedHashMap3.remove(str3);
                            } else {
                                linkedHashMap3.put(str3, employerTaxForms);
                            }
                        }
                        realWagesTaxDocumentManager.cachedFormsByToken = linkedHashMap3;
                        ArrayList arrayList2 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            EmployerTaxForms employerTaxForms2 = (EmployerTaxForms) linkedHashMap3.get((String) it2.next());
                            if (employerTaxForms2 != null) {
                                arrayList2.add(employerTaxForms2);
                            }
                        }
                        mutex2.unlock(null);
                        return arrayList2;
                    } finally {
                        mutex2.unlock(null);
                    }
                }
                EmployerIdentity employerIdentity = (EmployerIdentity) this.$refreshedCardTab$delegate;
                Iterator it5 = (Iterator) this.$showRetryError$delegate;
                Set set3 = (Set) this.$loadingRefresh$delegate;
                Map map3 = (Map) this.this$0;
                Set set4 = (Set) this.$cardModules;
                List list8 = (List) this.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                    taxForms = obj;
                    linkedHashSet3 = set3;
                    linkedHashMap = map3;
                    it = it5;
                    arrayList = list8;
                } catch (Exception e) {
                    e = e;
                    linkedHashSet2 = set3;
                    linkedHashMap = map3;
                    it = it5;
                    arrayList = list8;
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    linkedHashSet2.add(employerIdentity.token);
                    Timber.Forest.e("WagesTaxDocs: Failed to fetch tax forms for a merchant", new Object[0], e);
                    set = set4;
                    z3 = true;
                    obj4 = null;
                    linkedHashSet = linkedHashSet2;
                    i2 = 0;
                    if (!it.hasNext()) {
                    }
                    return coroutineSingletons10;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    linkedHashSet4 = linkedHashSet3;
                }
                ApiResult apiResult2 = (ApiResult) taxForms;
                if (apiResult2 instanceof ApiResult.Success) {
                    linkedHashSet4 = linkedHashSet3;
                    if (!(apiResult2 instanceof ApiResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    linkedHashSet4.add(employerIdentity.token);
                    Timber.Forest.w("WagesTaxDocs: Failed to fetch tax forms for a merchant", new Object[0]);
                    set = set4;
                    i2 = 0;
                    z3 = true;
                    obj4 = null;
                    linkedHashSet = linkedHashSet4;
                } else {
                    List list9 = ((TaxFormsResponse) ((ApiResult.Success) apiResult2).response).data;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it6 = list9.iterator();
                    while (it6.hasNext()) {
                        try {
                            taxFormData2 = LocalInstalledStoreKt.toTaxFormData((TaxFormJsonData) it6.next());
                            str = taxFormData2.downloadUrl;
                        } catch (Exception e3) {
                            e = e3;
                            linkedHashSet4 = linkedHashSet3;
                        }
                        if (str != null && (obj2 = StringsKt.trim(str).toString()) != null) {
                            if (obj2.length() <= 0) {
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                linkedHashSet4 = linkedHashSet3;
                                try {
                                    if (StringsKt__StringsJVMKt.startsWith(obj2, "https://", z3)) {
                                        str2 = obj2;
                                    } else if (StringsKt__StringsJVMKt.startsWith(obj2, "http://", z3)) {
                                        str2 = null;
                                    } else {
                                        if (!StringsKt__StringsJVMKt.startsWith(obj2, "/", false)) {
                                            obj2 = "/".concat(obj2);
                                        }
                                        str2 = Recorder$$ExternalSyntheticOutline2.m(realWagesTaxDocumentManager.endpoint, "/proxy", obj2);
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    Timber.Forest.w("WagesTaxDocs: Failed to parse a tax form", new Object[0], e);
                                    taxFormData = null;
                                    if (taxFormData == null) {
                                    }
                                    linkedHashSet3 = linkedHashSet4;
                                    z3 = true;
                                }
                                if (str2 != null) {
                                    taxFormData = new TaxFormData(taxFormData2.id, taxFormData2.displayTitle, str2);
                                    if (taxFormData == null) {
                                        try {
                                        } catch (Exception e5) {
                                            e = e5;
                                            linkedHashSet2 = linkedHashSet4;
                                            if (e instanceof CancellationException) {
                                            }
                                        }
                                        arrayList3.add(taxFormData);
                                    }
                                    linkedHashSet3 = linkedHashSet4;
                                    z3 = true;
                                }
                                taxFormData = null;
                                if (taxFormData == null) {
                                }
                                linkedHashSet3 = linkedHashSet4;
                                z3 = true;
                            }
                        }
                        linkedHashSet4 = linkedHashSet3;
                        str2 = null;
                        if (str2 != null) {
                        }
                        taxFormData = null;
                        if (taxFormData == null) {
                        }
                        linkedHashSet3 = linkedHashSet4;
                        z3 = true;
                    }
                    linkedHashSet4 = linkedHashSet3;
                    Timber.Forest.d("WagesTaxDocs: Received " + arrayList3.size() + " forms for one merchant", new Object[0]);
                    linkedHashMap.put(employerIdentity.token, !arrayList3.isEmpty() ? new EmployerTaxForms(employerIdentity.name, employerIdentity.token, arrayList3) : null);
                    set = set4;
                    i2 = 0;
                    z3 = true;
                    obj4 = null;
                    linkedHashSet = linkedHashSet4;
                }
                if (!it.hasNext()) {
                    EmployerIdentity employerIdentity2 = (EmployerIdentity) it.next();
                    Timber.Forest.d("WagesTaxDocs: Fetching forms for one payroll merchant", new Object[i2]);
                    try {
                    } catch (Exception e6) {
                        e = e6;
                        linkedHashSet2 = linkedHashSet;
                        set4 = set;
                        employerIdentity = employerIdentity2;
                        if (e instanceof CancellationException) {
                        }
                    }
                    TaxFormsService taxFormsService = realWagesTaxDocumentManager.taxFormsService;
                    String str4 = employerIdentity2.token;
                    this.$cashAppCard$delegate = obj4;
                    this.L$0 = arrayList;
                    this.$cardModules = set;
                    this.this$0 = linkedHashMap;
                    this.$loadingRefresh$delegate = linkedHashSet;
                    this.$showRetryError$delegate = it;
                    this.$refreshedCardTab$delegate = employerIdentity2;
                    this.label = z3 ? 1 : 0;
                    taxForms = taxFormsService.getTaxForms(str4, "DESC", this);
                    if (taxForms != coroutineSingletons10) {
                        linkedHashSet3 = linkedHashSet;
                        set4 = set;
                        employerIdentity = employerIdentity2;
                        ApiResult apiResult22 = (ApiResult) taxForms;
                        if (apiResult22 instanceof ApiResult.Success) {
                        }
                        if (!it.hasNext()) {
                            if (!linkedHashSet.isEmpty()) {
                                Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(linkedHashSet.size(), "WagesTaxDocs: Preserving cached forms for ", " merchants with failed refresh"), new Object[0]);
                            }
                            mutex = realWagesTaxDocumentManager.formsCacheMutex;
                            this.$cashAppCard$delegate = null;
                            this.L$0 = arrayList;
                            this.$cardModules = set;
                            this.this$0 = linkedHashMap;
                            this.$loadingRefresh$delegate = null;
                            this.$showRetryError$delegate = mutex;
                            this.$refreshedCardTab$delegate = realWagesTaxDocumentManager;
                            this.label = 2;
                            if (mutex.lock(this) != coroutineSingletons10) {
                                set2 = set;
                                map = linkedHashMap;
                                mutex2 = mutex;
                                Map map22 = realWagesTaxDocumentManager.cachedFormsByToken;
                                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                                while (r0.hasNext()) {
                                }
                                LinkedHashMap linkedHashMap32 = new LinkedHashMap(linkedHashMap22);
                                while (r2.hasNext()) {
                                }
                                realWagesTaxDocumentManager.cachedFormsByToken = linkedHashMap32;
                                ArrayList arrayList22 = new ArrayList();
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                }
                                mutex2.unlock(null);
                                return arrayList22;
                            }
                        }
                    }
                }
                return coroutineSingletons10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$models$3$1(CardSchemePresenter cardSchemePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ProduceStateScope produceStateScope, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.this$0 = cardSchemePresenter;
        this.$loadingRefresh$delegate = mutableState;
        this.$showRetryError$delegate = mutableState2;
        this.$refreshedCardTab$delegate = mutableState3;
        this.$cardModules = mutableState4;
        this.$refreshCount$delegate = parcelableSnapshotMutableIntState;
        this.$cashAppCard$delegate = produceStateScope;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$models$3$1(CardSchemePresenter cardSchemePresenter, List list, MutableState mutableState, State state, MutableState mutableState2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = cardSchemePresenter;
        this.$cardModules = list;
        this.$loadingRefresh$delegate = mutableState;
        this.$cashAppCard$delegate = state;
        this.$showRetryError$delegate = mutableState2;
        this.$refreshCount$delegate = parcelableSnapshotMutableIntState;
        this.$refreshedCardTab$delegate = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$models$3$1(ShiftLoaderContext shiftLoaderContext, RealShiftDataLoader realShiftDataLoader, ComparableRange comparableRange, ComparableRange comparableRange2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$showRetryError$delegate = shiftLoaderContext;
        this.$refreshedCardTab$delegate = realShiftDataLoader;
        this.$cashAppCard$delegate = comparableRange;
        this.$refreshCount$delegate = comparableRange2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$models$3$1(RealWagesTaxDocumentManager realWagesTaxDocumentManager, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.$refreshCount$delegate = realWagesTaxDocumentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSchemePresenter$models$3$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cardModules = flow;
        this.this$0 = moleculePresenter;
        this.$loadingRefresh$delegate = mutableState;
        this.$showRetryError$delegate = mutableState2;
        this.$refreshedCardTab$delegate = mutableState3;
        this.$cashAppCard$delegate = mutableState4;
        this.$refreshCount$delegate = mutableState5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$models$3$1(Flow flow, Continuation continuation, SupportHomePresenter supportHomePresenter, State state, State state2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.$cardModules = flow;
        this.this$0 = supportHomePresenter;
        this.$cashAppCard$delegate = state;
        this.$refreshCount$delegate = state2;
        this.$loadingRefresh$delegate = mutableState;
        this.$showRetryError$delegate = mutableState2;
        this.$refreshedCardTab$delegate = mutableState3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$models$3$1(Flow flow, Continuation continuation, CardLockPresenter cardLockPresenter, CoroutineScope coroutineScope, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$cardModules = flow;
        this.this$0 = cardLockPresenter;
        this.$refreshCount$delegate = coroutineScope;
        this.$cashAppCard$delegate = state;
        this.$loadingRefresh$delegate = mutableState;
        this.$showRetryError$delegate = mutableState2;
        this.$refreshedCardTab$delegate = mutableState3;
    }
}
