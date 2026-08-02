package com.squareup.cash.ui.widget.amount;

import android.text.TextPaint;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material.SwipeableKt$swipeable$3$4$1;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotMapKeySet;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.views.brand.menu.ComboSlotTokenAndIndex;
import app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3;
import app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.data.profile.ProfileNotificationsRepository$ThresholdType;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileMessagingNotificationSettingsSam;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.investing.presenters.FilterConfigurationCacheMap;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.ui.widget.amount.Digit;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.nearby.api.v1.ConnectionData;
import com.squareup.protos.cash.notificationsettings.api.v1.CategoryPreferenceUpdate;
import com.squareup.protos.cash.notificationsettings.api.v1.NotificationSettingsService;
import com.squareup.protos.cash.notificationsettings.api.v1.UpdateCategoryNotificationSettingsRequest;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig$Configuration$StockPriceMovement;
import com.squareup.protos.cash.paymenttemplate.v1.CreatePaymentTemplateRequest;
import com.squareup.protos.cash.paymenttemplate.v1.CreatePaymentTemplateResponse;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class AmountDisplayKt$AmountDisplay$1$1 extends SuspendLambda implements Function2 {
    public Object $animator;
    public final /* synthetic */ Object $basePaint;
    public final /* synthetic */ Object $canvasWidth$delegate;
    public Object $model;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $scope;
    public int $textAlign;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountDisplayKt$AmountDisplay$1$1(int i, LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel, SnapshotStateMap snapshotStateMap, MutableState mutableState, ScrollState scrollState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$textAlign = i;
        this.$animator = localMenuComboDetailsViewModel;
        this.$model = snapshotStateMap;
        this.$basePaint = mutableState;
        this.$scope = scrollState;
        this.$canvasWidth$delegate = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$canvasWidth$delegate;
        Object obj3 = this.$scope;
        Object obj4 = this.$basePaint;
        switch (i) {
            case 0:
                return new AmountDisplayKt$AmountDisplay$1$1((AmountLayoutAnimator) this.$animator, (AmountModel) this.$model, (TextPaint) obj4, (CoroutineScope) obj3, this.$textAlign, (MutableFloatState) obj2, continuation);
            case 1:
                return new AmountDisplayKt$AmountDisplay$1$1(this.$textAlign, (LocalMenuComboDetailsViewModel) this.$animator, (SnapshotStateMap) this.$model, (MutableState) obj4, (ScrollState) obj3, (Function1) obj2, continuation);
            case 2:
                return new AmountDisplayKt$AmountDisplay$1$1((ProfileNotificationsRepository$ThresholdType) this.$animator, this.$textAlign, (RealProfileNotificationsRepository) this.$model, (String) obj4, (NotificationCategory) obj3, (Long) obj2, continuation);
            case 3:
                return new AmountDisplayKt$AmountDisplay$1$1((DisclosurePresenter) obj4, (Map) obj3, (MutableSharedFlow) obj2, continuation);
            default:
                return new AmountDisplayKt$AmountDisplay$1$1((CardLockPresenter) this.$model, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AmountDisplayKt$AmountDisplay$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008e, code lost:
    
        if (r9 != r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(5000, r31) == r13) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
    
        if (r9 == r13) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0116, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r14, r31) == r13) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0116 -> B:10:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        SnapshotStateMap snapshotStateMap;
        LinkedHashMap linkedHashMap;
        Object obj2;
        char c;
        AnimatedDigitState animatedDigitState;
        Unit unit;
        Object updateCategoryNotificationSettings;
        Iterator it;
        MutableSharedFlow mutableSharedFlow;
        int i2;
        CreatePaymentTemplateRequest createPaymentTemplateRequest;
        ApiResult apiResult;
        CreatePaymentTemplateRequest createPaymentTemplateRequest2;
        BLEPayload bLEPayload;
        Object obj3;
        Object obj4;
        int i3 = this.$r8$classId;
        Object obj5 = this.$canvasWidth$delegate;
        Object obj6 = this.$scope;
        int i4 = 0;
        int i5 = 0;
        r8 = false;
        boolean z = false;
        Object obj7 = this.$basePaint;
        NotificationCategoryExtraConfig notificationCategoryExtraConfig = null;
        switch (i3) {
            case 0:
                MutableFloatState mutableFloatState = (MutableFloatState) obj5;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                    if (parcelableSnapshotMutableFloatState.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                        AmountLayoutAnimator amountLayoutAnimator = (AmountLayoutAnimator) this.$animator;
                        AmountModel amountModel = (AmountModel) this.$model;
                        float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
                        TextPaint textPaint = (TextPaint) obj7;
                        CoroutineScope coroutineScope = (CoroutineScope) obj6;
                        int i7 = this.$textAlign;
                        this.label = 1;
                        if (amountModel == amountLayoutAnimator.lastModel && floatValue == amountLayoutAnimator.lastWidth && amountLayoutAnimator.initialized) {
                            unit = Unit.INSTANCE;
                        } else {
                            TextPaint textPaint2 = amountLayoutAnimator.scratchPaint;
                            if (textPaint2 == null) {
                                textPaint2 = new TextPaint(textPaint);
                                amountLayoutAnimator.scratchPaint = textPaint2;
                            }
                            ComputedLayout m1178computeLayouthyTVY88 = ConnectionPoolKt.m1178computeLayouthyTVY88((List) amountModel.digits$delegate.getValue(), textPaint, floatValue, textPaint2, i7);
                            float f = m1178computeLayouthyTVY88.scale;
                            boolean z2 = amountLayoutAnimator.initialized;
                            ArrayList arrayList = m1178computeLayouthyTVY88.digits;
                            if (z2) {
                                SnapshotStateMap snapshotStateMap2 = amountLayoutAnimator.exitingDigits;
                                SnapshotStateMap snapshotStateMap3 = amountLayoutAnimator.activeDigits;
                                HashMap hashMap = new HashMap(snapshotStateMap3);
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    ?? r2 = 0;
                                    if (it2.hasNext()) {
                                        Pair pair = (Pair) it2.next();
                                        Digit digit = (Digit) pair.first;
                                        RawDigitLayout rawDigitLayout = (RawDigitLayout) pair.second;
                                        AnimatedDigitState animatedDigitState2 = (AnimatedDigitState) hashMap.get(digit);
                                        if (animatedDigitState2 != null) {
                                            linkedHashMap2.put(digit, animatedDigitState2);
                                            JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$animateToLayout$1(animatedDigitState2, rawDigitLayout, null, i4), 3);
                                            JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$animateToLayout$1(animatedDigitState2, rawDigitLayout, null, 1), 3);
                                            it2 = it2;
                                        } else {
                                            Iterator it3 = it2;
                                            if (digit.isLastZero$amountview()) {
                                                animatedDigitState = new AnimatedDigitState(digit.toString(), rawDigitLayout.left, rawDigitLayout.width, 1.2f, RecyclerView.DECELERATION_RATE);
                                                JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, null, 1), 3);
                                                JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, null, 2), 3);
                                                c = 4;
                                            } else if (digit.isComma$amountview()) {
                                                Digit digit2 = digit.leftOf;
                                                AnimatedDigitState animatedDigitState3 = digit2 != null ? (AnimatedDigitState) hashMap.get(digit2) : null;
                                                animatedDigitState = new AnimatedDigitState(digit.toString(), animatedDigitState3 != null ? ((Number) animatedDigitState3.left.getValue()).floatValue() - rawDigitLayout.width : rawDigitLayout.left, rawDigitLayout.width, 0.7f, RecyclerView.DECELERATION_RATE);
                                                JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$animateToLayout$1(animatedDigitState, rawDigitLayout, null, 2), 3);
                                                JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, null, 3), 3);
                                                c = 4;
                                                JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, null, 4), 3);
                                            } else {
                                                c = 4;
                                                int i8 = digit instanceof Digit.EmptyZero ? ((Digit.EmptyZero) digit).createdAfter * 30 : 0;
                                                AnimatedDigitState animatedDigitState4 = new AnimatedDigitState(digit.toString(), rawDigitLayout.left, rawDigitLayout.width, 0.7f, RecyclerView.DECELERATION_RATE);
                                                JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$createEntranceState$3$1(animatedDigitState4, rawDigitLayout, i8, null, 0), 3);
                                                JobKt.launch$default(coroutineScope, null, null, new AmountLayoutAnimator$createEntranceState$3$1(animatedDigitState4, rawDigitLayout, i8, null, 1), 3);
                                                animatedDigitState = animatedDigitState4;
                                            }
                                            linkedHashMap2.put(digit, animatedDigitState);
                                            it2 = it3;
                                        }
                                        i4 = 0;
                                    } else {
                                        for (Map.Entry entry : hashMap.entrySet()) {
                                            Digit digit3 = (Digit) entry.getKey();
                                            AnimatedDigitState animatedDigitState5 = (AnimatedDigitState) entry.getValue();
                                            if (!linkedHashMap2.containsKey(digit3)) {
                                                snapshotStateMap2.put(digit3, animatedDigitState5);
                                                digit3.getClass();
                                                animatedDigitState5.getClass();
                                                Digit digit4 = digit3.leftOf;
                                                AnimatedDigitState animatedDigitState6 = digit4 != null ? (AnimatedDigitState) linkedHashMap2.get(digit4) : r2;
                                                if (animatedDigitState6 != null) {
                                                    TaxWebAppBridge.AnonymousClass3 anonymousClass3 = new TaxWebAppBridge.AnonymousClass3(animatedDigitState5, animatedDigitState6, (Continuation) r2, 28);
                                                    i = 3;
                                                    JobKt.launch$default(coroutineScope, r2, r2, anonymousClass3, 3);
                                                } else {
                                                    i = 3;
                                                }
                                                if (digit3.isLastZero$amountview()) {
                                                    Continuation continuation = r2;
                                                    snapshotStateMap = snapshotStateMap3;
                                                    linkedHashMap = linkedHashMap2;
                                                    AmountLayoutAnimator$launchExitAnimation$2 amountLayoutAnimator$launchExitAnimation$2 = new AmountLayoutAnimator$launchExitAnimation$2(animatedDigitState5, amountLayoutAnimator, digit3, continuation, 0);
                                                    ?? r4 = continuation;
                                                    JobKt.launch$default(coroutineScope, r4, r4, amountLayoutAnimator$launchExitAnimation$2, i);
                                                    obj2 = r4;
                                                } else {
                                                    ?? r42 = r2;
                                                    snapshotStateMap = snapshotStateMap3;
                                                    linkedHashMap = linkedHashMap2;
                                                    JobKt.launch$default(coroutineScope, r42, r42, new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState5, r42, 0), i);
                                                    JobKt.launch$default(coroutineScope, r42, r42, new AmountLayoutAnimator$launchExitAnimation$2(animatedDigitState5, amountLayoutAnimator, digit3, r42, 1), i);
                                                    obj2 = r42;
                                                }
                                                snapshotStateMap3 = snapshotStateMap;
                                                linkedHashMap2 = linkedHashMap;
                                                r2 = obj2;
                                            }
                                        }
                                        ?? r43 = r2;
                                        SnapshotStateMap snapshotStateMap4 = snapshotStateMap3;
                                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                        SnapshotMapKeySet snapshotMapKeySet = snapshotStateMap2.entries;
                                        snapshotMapKeySet.getClass();
                                        Iterator<E> it4 = snapshotMapKeySet.iterator();
                                        while (it4.hasNext()) {
                                            Map.Entry entry2 = (Map.Entry) it4.next();
                                            entry2.getClass();
                                            if (((Number) ((AnimatedDigitState) entry2.getValue()).opacity.getValue()).floatValue() <= 0.01f) {
                                                it4.remove();
                                            }
                                        }
                                        snapshotStateMap4.clear();
                                        snapshotStateMap4.putAll(linkedHashMap3);
                                        JobKt.launch$default(coroutineScope, r43, r43, new SwipeableKt$swipeable$3$4$1.AnonymousClass1(amountLayoutAnimator, f, r43, 5), 3);
                                    }
                                }
                            } else {
                                amountLayoutAnimator.initLayout(arrayList, f);
                            }
                            amountLayoutAnimator.lastModel = amountModel;
                            amountLayoutAnimator.lastWidth = floatValue;
                            unit = Unit.INSTANCE;
                        }
                        if (unit == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Integer num = new Integer(this.$textAlign);
                    if (num.intValue() <= -1) {
                        num = null;
                    }
                    if (num != null) {
                        int intValue = num.intValue();
                        MutableState mutableState = (MutableState) obj7;
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new StatusRunnable$$ExternalSyntheticLambda1(23, (SnapshotStateMap) this.$model, new ComboSlotTokenAndIndex(((LocalMenuComboDetailsViewModel.ComboSlot) ((LocalMenuComboDetailsViewModel) this.$animator).comboSlots.get(intValue)).token, intValue))), mutableState, 1), 24);
                        LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 = new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3((ScrollState) obj6, (Function1) obj5, mutableState, null, 1);
                        this.label = 1;
                        if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3, this) == coroutineSingletons2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) this.$model;
                int i10 = this.$textAlign;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProfileNotificationsRepository$ThresholdType profileNotificationsRepository$ThresholdType = (ProfileNotificationsRepository$ThresholdType) this.$animator;
                    if (profileNotificationsRepository$ThresholdType == null) {
                        break;
                    } else {
                        int ordinal = profileNotificationsRepository$ThresholdType.ordinal();
                        if (ordinal == 0) {
                            notificationCategoryExtraConfig = new NotificationCategoryExtraConfig(new NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement(new NotificationCategoryExtraConfig.PriceMovementConfiguration(new Integer(i10))));
                        } else if (ordinal == 1) {
                            notificationCategoryExtraConfig = new NotificationCategoryExtraConfig(new NotificationCategoryExtraConfig$Configuration$StockPriceMovement(new NotificationCategoryExtraConfig.PriceMovementConfiguration(new Integer(i10))));
                        }
                        NotificationCategoryExtraConfig notificationCategoryExtraConfig2 = notificationCategoryExtraConfig;
                        NotificationSettingsService notificationSettingsService = realProfileNotificationsRepository.service;
                        if (((String) obj7) != null) {
                            if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) realProfileNotificationsRepository.featureFlagManager).peekCurrentValue(AmplitudeExperiments$MobileMessagingNotificationSettingsSam.INSTANCE)).disabled()) {
                                z = true;
                            }
                        }
                        UpdateCategoryNotificationSettingsRequest updateCategoryNotificationSettingsRequest = new UpdateCategoryNotificationSettingsRequest(CollectionsKt__CollectionsJVMKt.listOf(new CategoryPreferenceUpdate((String) obj7, (NotificationCategory) obj6, (ClientChannelState) null, (ClientChannelState) null, (ClientChannelState) null, (Long) obj5, notificationCategoryExtraConfig2, Boolean.valueOf(z), EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE)));
                        this.label = 1;
                        updateCategoryNotificationSettings = notificationSettingsService.updateCategoryNotificationSettings(updateCategoryNotificationSettingsRequest, this);
                        if (updateCategoryNotificationSettings == coroutineSingletons3) {
                            break;
                        }
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    updateCategoryNotificationSettings = obj;
                }
                break;
            case 3:
                Map map = (Map) obj6;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.$textAlign;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj7;
                    ((FilterConfigurationCacheMap) disclosurePresenter.blockersNavigator).getCache((CategoryToken) disclosurePresenter.launcher).set(map);
                    it = map.values().iterator();
                    mutableSharedFlow = (MutableSharedFlow) obj5;
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i13 = this.label;
                    it = (Iterator) this.$model;
                    mutableSharedFlow = (MutableSharedFlow) this.$animator;
                    SafeTrace.throwOnFailure(obj);
                    i5 = i13;
                }
                while (it.hasNext()) {
                    InvestingSearchViewEvent.FilterConfigurationSelected filterConfigurationSelected = new InvestingSearchViewEvent.FilterConfigurationSelected((FilterConfiguration) it.next());
                    this.$animator = mutableSharedFlow;
                    this.$model = it;
                    this.label = i5;
                    this.$textAlign = 1;
                    if (mutableSharedFlow.emit(filterConfigurationSelected, this) == coroutineSingletons4) {
                        break;
                    }
                }
                break;
            default:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) this.$model;
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) cardLockPresenter.issuedCardManager;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.$textAlign;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 4) {
                                    createPaymentTemplateRequest2 = (CreatePaymentTemplateRequest) this.$animator;
                                    SafeTrace.throwOnFailure(obj);
                                    createPaymentTemplateRequest = createPaymentTemplateRequest2;
                                    i2 = 1;
                                    this.$animator = createPaymentTemplateRequest;
                                    this.label = i2;
                                    this.$textAlign = 1;
                                    obj4 = markwonConfiguration.createPaymentTemplate(createPaymentTemplateRequest, this);
                                    break;
                                } else {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i2 = this.label;
                                createPaymentTemplateRequest = (CreatePaymentTemplateRequest) this.$animator;
                                SafeTrace.throwOnFailure(obj);
                                obj3 = obj;
                                apiResult = (ApiResult) obj3;
                                CreatePaymentTemplateRequest createPaymentTemplateRequest3 = createPaymentTemplateRequest;
                                int i15 = i2;
                                createPaymentTemplateRequest2 = createPaymentTemplateRequest3;
                                if (apiResult instanceof ApiResult.Success) {
                                    CreatePaymentTemplateResponse createPaymentTemplateResponse = (CreatePaymentTemplateResponse) ((ApiResult.Success) apiResult).response;
                                    ConnectionData connectionData = createPaymentTemplateResponse.connection_data;
                                    ByteString byteString = (connectionData == null || (bLEPayload = connectionData.ble_payload) == null) ? null : bLEPayload.advertisement_data;
                                    byteString.getClass();
                                    ((MutableState) obj6).setValue(PullRefreshKt.fromByteArray(byteString.toByteArray()));
                                    Long l = createPaymentTemplateResponse.expired_at_millis;
                                    if (l == null || l.longValue() <= 0) {
                                        break;
                                    } else {
                                        long longValue = (l.longValue() - ((AndroidClock) cardLockPresenter.flowStarter).millis()) - 30000;
                                        if (longValue < 0) {
                                            longValue = 0;
                                        }
                                        this.$animator = createPaymentTemplateRequest2;
                                        this.label = i15;
                                        this.$textAlign = 4;
                                        break;
                                    }
                                } else {
                                    ((MutableState) obj5).setValue(Boolean.TRUE);
                                    break;
                                }
                            }
                        } else {
                            i2 = this.label;
                            createPaymentTemplateRequest = (CreatePaymentTemplateRequest) this.$animator;
                            SafeTrace.throwOnFailure(obj);
                            this.$animator = createPaymentTemplateRequest;
                            this.label = i2;
                            this.$textAlign = 3;
                            obj3 = markwonConfiguration.createPaymentTemplate(createPaymentTemplateRequest, this);
                            break;
                        }
                    } else {
                        i2 = this.label;
                        createPaymentTemplateRequest = (CreatePaymentTemplateRequest) this.$animator;
                        SafeTrace.throwOnFailure(obj);
                        obj4 = obj;
                        apiResult = (ApiResult) obj4;
                        if (!(apiResult instanceof ApiResult.Success) && i2 != 0) {
                            this.$animator = createPaymentTemplateRequest;
                            this.label = i2;
                            this.$textAlign = 2;
                            break;
                        }
                        CreatePaymentTemplateRequest createPaymentTemplateRequest32 = createPaymentTemplateRequest;
                        int i152 = i2;
                        createPaymentTemplateRequest2 = createPaymentTemplateRequest32;
                        if (apiResult instanceof ApiResult.Success) {
                        }
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    if (((AppForegroundState) ((MutableState) obj7).getValue()) != AppForegroundState.FOREGROUND) {
                        break;
                    } else {
                        i2 = 0;
                        createPaymentTemplateRequest = new CreatePaymentTemplateRequest(null, null, null, null, null, null, ByteString.EMPTY);
                        this.$animator = createPaymentTemplateRequest;
                        this.label = i2;
                        this.$textAlign = 1;
                        obj4 = markwonConfiguration.createPaymentTemplate(createPaymentTemplateRequest, this);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountDisplayKt$AmountDisplay$1$1(DisclosurePresenter disclosurePresenter, Map map, MutableSharedFlow mutableSharedFlow, Continuation continuation) {
        super(2, continuation);
        this.$basePaint = disclosurePresenter;
        this.$scope = map;
        this.$canvasWidth$delegate = mutableSharedFlow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountDisplayKt$AmountDisplay$1$1(ProfileNotificationsRepository$ThresholdType profileNotificationsRepository$ThresholdType, int i, RealProfileNotificationsRepository realProfileNotificationsRepository, String str, NotificationCategory notificationCategory, Long l, Continuation continuation) {
        super(2, continuation);
        this.$animator = profileNotificationsRepository$ThresholdType;
        this.$textAlign = i;
        this.$model = realProfileNotificationsRepository;
        this.$basePaint = str;
        this.$scope = notificationCategory;
        this.$canvasWidth$delegate = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountDisplayKt$AmountDisplay$1$1(AmountLayoutAnimator amountLayoutAnimator, AmountModel amountModel, TextPaint textPaint, CoroutineScope coroutineScope, int i, MutableFloatState mutableFloatState, Continuation continuation) {
        super(2, continuation);
        this.$animator = amountLayoutAnimator;
        this.$model = amountModel;
        this.$basePaint = textPaint;
        this.$scope = coroutineScope;
        this.$textAlign = i;
        this.$canvasWidth$delegate = mutableFloatState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountDisplayKt$AmountDisplay$1$1(CardLockPresenter cardLockPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$model = cardLockPresenter;
        this.$basePaint = mutableState;
        this.$scope = mutableState2;
        this.$canvasWidth$delegate = mutableState3;
    }
}
