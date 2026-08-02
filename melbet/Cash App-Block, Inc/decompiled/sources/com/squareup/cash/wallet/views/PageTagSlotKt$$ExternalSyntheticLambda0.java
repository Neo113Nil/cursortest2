package com.squareup.cash.wallet.views;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.fillr.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.treehouse.CarouselBinding;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.support.presenters.SupportHomePresenter$models$lambda$5$$inlined$map$1;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.RealScreenshotManager$toCompleteCachePath$1;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.cash.transfers.presenters.RecurringReloadConfigurationPresenter;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountModel;
import com.squareup.cash.ui.widget.amount.Digit;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.wallet.presenters.WalletHomePresenter;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.work.applets.presenters.RealShiftsTileDataLoader;
import com.squareup.cash.work.applets.presenters.ShiftsTileState;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.ClockInEssentialsState;
import com.squareup.cash.work.data.api.DashboardScheduleState;
import com.squareup.cash.work.data.api.LoaderState;
import com.squareup.cash.work.data.api.ShiftDataState;
import com.squareup.cash.work.data.real.FlowExtensionsKt;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider$upcomingSchedules$2$3;
import com.squareup.cash.work.data.real.RealPayDataLoader$sharedState$2$3;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.presenters.pay.PayHistoryListViewModelMapper;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.ProtoDeserializer;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.util.android.Toaster$Length;
import com.squareup.util.android.Views;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import okio.Path;

/* loaded from: classes7.dex */
public final /* synthetic */ class PageTagSlotKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PageTagSlotKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x020a, code lost:
    
        if (r0.transitionState.getCurrentState() != r1.getValue()) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a6  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object selectFrequency;
        Money money;
        CalendarEvent calendarEvent;
        String str;
        Object failure;
        int i = this.$r8$classId;
        int i2 = 19;
        StartedLazily startedLazily = SharingStarted.Companion.Eagerly;
        int i3 = 20;
        int i4 = 16;
        int i5 = 3;
        int i6 = 2;
        boolean z = true;
        int i7 = 0;
        Money money2 = 0;
        Digit.CurrencySymbol currencySymbol = null;
        money2 = 0;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return Boolean.valueOf(((PageTagSlot) obj).writerCount$delegate.getIntValue() > 0);
            case 1:
                RealScreenshotManager realScreenshotManager = (RealScreenshotManager) obj;
                String str2 = Path.DIRECTORY_SEPARATOR;
                String path = ((RealStorage) realScreenshotManager.storage).getFileUri(Path.Companion.get("screenshot-" + realScreenshotManager.sessionId, false), RealScreenshotManager$toCompleteCachePath$1.INSTANCE).getPath();
                if (path != null) {
                    FilesKt__UtilsKt.deleteRecursively(new File(path));
                }
                realScreenshotManager.startScreenshotSession();
                return Unit.INSTANCE;
            case 2:
                String str3 = ((ContactSupportEmailInputViewModel$Loaded) obj).email;
                if (str3 == null) {
                    str3 = "";
                }
                return Updater.mutableStateOf$default(str3);
            case 3:
                return Boolean.valueOf(((SupportHomeViewModel) obj) instanceof SupportHomeViewModel.Loading);
            case 4:
                TimelineView timelineView = (TimelineView) obj;
                Context context = timelineView.getContext();
                context.getClass();
                TimelineView.ItemView itemView = new TimelineView.ItemView(timelineView, context);
                itemView.setPaddingRelative(Views.dip((View) itemView, 36) + timelineView.timelinePadding, itemView.getPaddingTop(), timelineView.timelinePadding, itemView.getPaddingBottom());
                return itemView;
            case 5:
                RecurringReloadConfigurationScreen.Mode mode = ((RecurringReloadConfigurationPresenter) obj).args.mode;
                if (mode instanceof RecurringReloadConfigurationScreen.Mode.BalanceBased) {
                    RecurringReloadConfigurationScreen.Mode.BalanceBased balanceBased = (RecurringReloadConfigurationScreen.Mode.BalanceBased) mode;
                    Money money3 = balanceBased.existingReloadAmount;
                    Money money4 = balanceBased.existingMinBalance;
                    if (!balanceBased.startAtReloadAmount || money4 == null) {
                        if (money4 != null && CollectionsKt.contains(RecurringReloadConfigurationPresenter.PRESET_MIN_BALANCE_AMOUNTS, money4.amount)) {
                            money2 = money4;
                        }
                        selectFrequency = new RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker(money2, money3, money2 != 0);
                    } else {
                        CurrencyCode currencyCode = money4.currency_code;
                        if (currencyCode == null) {
                            currencyCode = CurrencyCode.USD;
                        }
                        Money money5 = (money3 == null || !RecurringReloadConfigurationPresenter.generatePresets(money4, new Money((Long) 2000L, currencyCode, 4)).contains(money3)) ? null : money3;
                        selectFrequency = new RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker(money4, money5, money5 != null, "", "", EmptyList.INSTANCE);
                    }
                } else {
                    if (!(mode instanceof RecurringReloadConfigurationScreen.Mode.Scheduled)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RecurringReloadConfigurationScreen.Mode.Scheduled scheduled = (RecurringReloadConfigurationScreen.Mode.Scheduled) mode;
                    RecurringSchedule.Frequency frequency = scheduled.existingFrequency;
                    int ordinal = scheduled.startAt.ordinal();
                    if (ordinal == 0) {
                        selectFrequency = new RecurringReloadConfigurationViewModel.SelectFrequency(frequency, frequency != null);
                    } else if (ordinal == 1) {
                        Integer num = scheduled.existingDayOfPeriod;
                        int intValue = num != null ? num.intValue() : 1;
                        frequency.getClass();
                        selectFrequency = new RecurringReloadConfigurationViewModel.SelectDay(frequency, Integer.valueOf(intValue), true);
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Money money6 = scheduled.existingAmount;
                        if (money6 != null) {
                            List list = RecurringReloadConfigurationPresenter.PRESET_SCHEDULED_AMOUNTS;
                            Long l = money6.amount;
                            if (list.contains(Long.valueOf(l != null ? l.longValue() : 0L))) {
                                money = money6;
                                frequency.getClass();
                                selectFrequency = new RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker(frequency, scheduled.existingDayOfPeriod, money, money == null, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                            }
                        }
                        money = null;
                        frequency.getClass();
                        selectFrequency = new RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker(frequency, scheduled.existingDayOfPeriod, money, money == null, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    }
                }
                return Updater.mutableStateOf$default(selectFrequency);
            case 6:
                WandScene$ring$3 wandScene$ring$3 = (WandScene$ring$3) ((CarouselBinding) obj).value;
                if (wandScene$ring$3 != null) {
                    wandScene$ring$3.invoke();
                }
                return Unit.INSTANCE;
            case 7:
                AmountConfig amountConfig = (AmountConfig) obj;
                if (amountConfig.getPrefix().length() > 0) {
                    return new Digit.CurrencySymbol(amountConfig.getPrefix());
                }
                return null;
            case 8:
                AmountModel amountModel = (AmountModel) obj;
                ArrayList arrayList = new ArrayList();
                AmountConfig amountConfig2 = amountModel.config;
                List list2 = amountModel.numberDigits;
                Digit.CurrencySymbol currencySymbol2 = (Digit.CurrencySymbol) amountConfig2.prefixDigit$delegate.getValue();
                if (currencySymbol2 != null) {
                    arrayList.add(currencySymbol2);
                }
                arrayList.addAll(list2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    Digit digit = (Digit) obj2;
                    digit.getClass();
                    if ((digit instanceof Digit.Number) || digit.isDecimalPoint$amountview()) {
                        arrayList2.add(obj2);
                    }
                }
                Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(CollectionsKt.joinToString$default(arrayList2, "", null, null, 0, null, null, 62));
                if (doubleOrNull != null) {
                    String str4 = (String) amountConfig2.getSuffixBuilder().invoke(Double.valueOf(doubleOrNull.doubleValue()));
                    str4.getClass();
                    if (str4.length() != 0) {
                        HashMap hashMap = amountConfig2.suffixDigitCache;
                        Object obj3 = hashMap.get(str4);
                        Object obj4 = obj3;
                        if (obj3 == null) {
                            Digit.CurrencySymbol currencySymbol3 = new Digit.CurrencySymbol(str4);
                            hashMap.put(str4, currencySymbol3);
                            obj4 = currencySymbol3;
                        }
                        currencySymbol = (Digit.CurrencySymbol) obj4;
                    }
                    if (currencySymbol != null) {
                        arrayList.add(currencySymbol);
                    }
                }
                return CollectionsKt.toList(arrayList);
            case 9:
                return Integer.valueOf(((NullStateCarouselViewModel.Content) obj).pages.size());
            case 10:
                return Integer.valueOf(((NullStateViewModel$SwipeViewModel$Content) obj).pages.size());
            case 11:
                WalletHomePresenter walletHomePresenter = (WalletHomePresenter) obj;
                walletHomePresenter.toaster.makeToast(walletHomePresenter.stringManager.get(R.string.wallet_card_tab_error), Toaster$Length.SHORT);
                return Unit.INSTANCE;
            case 12:
                return Float.valueOf(((Number) ((CardAppletTileKt$$ExternalSyntheticLambda1) obj).invoke()).floatValue());
            case 13:
                Transition transition = (Transition) obj;
                if (transition != null) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.targetState$delegate;
                    if (parcelableSnapshotMutableState.getValue() == EnterExitState.Visible) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 14:
                return (Quat) obj;
            case 15:
                return (Boolean) ((ShiftListViewKt$$ExternalSyntheticLambda10) obj).invoke();
            case 16:
                ((CardSchemeViewModel.Module.StatusModule) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                ((CardSchemeViewModel.Module.CallToActionModule) ((CardSchemeViewModel.Module) obj)).button.onClick.invoke();
                return Unit.INSTANCE;
            case 18:
                RealShiftsTileDataLoader realShiftsTileDataLoader = (RealShiftsTileDataLoader) obj;
                return FlowKt.stateIn(FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.merge(new AppLockMonitor$special$$inlined$map$2(Unit.INSTANCE, i2), realShiftsTileDataLoader.refreshTrigger), new RealPasscodeProvider$getPasscode$1((Continuation) money2, realShiftsTileDataLoader, i4))), realShiftsTileDataLoader.scope, new StartedWhileSubscribed(500L, Long.MAX_VALUE), ShiftsTileState.Loading.INSTANCE);
            case 19:
                ShiftSchedule.Version version = ((ClockInEssentials.NextShift) obj).shift.published_version;
                if (version == null || (calendarEvent = version.calendar_event) == null || (str = calendarEvent.start_datetime) == null) {
                    return null;
                }
                return OffsetDateTime.parse(str);
            case 20:
                RealBrandDetailsDataLoader realBrandDetailsDataLoader = (RealBrandDetailsDataLoader) obj;
                return FlowKt.stateIn(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new NullStateSwipeConfigProvider(new AssignedJobProviderKt$jobs$$inlined$map$1(realBrandDetailsDataLoader.merchantRepository.getAll(), true ? 1 : 0), 29)), new RealPasscodeProvider$getPasscode$1((Continuation) money2, realBrandDetailsDataLoader, 18)), realBrandDetailsDataLoader.scope, SharingStarted.Companion.Lazily, LoaderState.Loading.INSTANCE);
            case 21:
                RealClockInEssentialsProvider realClockInEssentialsProvider = (RealClockInEssentialsProvider) obj;
                SharedFlowImpl sharedFlowImpl = realClockInEssentialsProvider.refreshTrigger;
                sharedFlowImpl.tryEmit(Unit.INSTANCE);
                return FlowKt.stateIn(FlowKt.transformLatest(sharedFlowImpl, new RealPasscodeProvider$getPasscode$1((Continuation) money2, realClockInEssentialsProvider, i2)), realClockInEssentialsProvider.scope, startedLazily, ClockInEssentialsState.Loading.INSTANCE);
            case 22:
                RealDashboardScheduleProvider realDashboardScheduleProvider = (RealDashboardScheduleProvider) obj;
                return FlowKt.stateIn(FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.combine(new SquareAccountStore$userFlow$$inlined$map$1(realDashboardScheduleProvider.selectedMerchantProvider.getMerchantIdentifierFlow(), 10), new SquareAccountStore$userFlow$$inlined$map$1(realDashboardScheduleProvider.teamMemberIdProvider.getTeamMemberId(), 11), realDashboardScheduleProvider.refreshTrigger, new RealDashboardScheduleProvider$upcomingSchedules$2$3(4, null))), new RealPasscodeProvider$getPasscode$1((Continuation) money2, realDashboardScheduleProvider, i3)), realDashboardScheduleProvider.scope, startedLazily, DashboardScheduleState.Loading.INSTANCE);
            case 23:
                RealSelectedMerchantDataProvider realSelectedMerchantDataProvider = (RealSelectedMerchantDataProvider) obj;
                return FlowKt.shareIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realSelectedMerchantDataProvider.selectedMerchantProvider.getMerchantIdentifierFlow(), realSelectedMerchantDataProvider.merchantRepository.getAll(), new CardModelView.AnonymousClass1.AnonymousClass4(i5, (Continuation) money2, i3), i7), realSelectedMerchantDataProvider.scope, FlowExtensionsKt.WhileSubscribedStarted, 1);
            case 24:
                RealShiftDataLoader realShiftDataLoader = (RealShiftDataLoader) obj;
                return FlowKt.stateIn(FlowKt.transformLatest(FlowKt.mapLatest(new TakeUntil$collectSafely$2(realShiftDataLoader, null), FlowKt.distinctUntilChanged(new SupportHomePresenter$models$lambda$5$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realShiftDataLoader.selectedMerchantProvider.getMerchantIdentifierFlow(), realShiftDataLoader.teamMemberIdProvider.getTeamMemberId(), new RealPayDataLoader$sharedState$2$3(i5, money2, true ? 1 : 0), i7), 12))), new RealPasscodeProvider$getPasscode$1((Continuation) money2, realShiftDataLoader, 22)), realShiftDataLoader.scope, new StartedWhileSubscribed(5000L, 0L), ShiftDataState.NotReady.INSTANCE);
            case 25:
                return ((PayHistoryListViewModelMapper) obj).stringManager.get(R.string.work_pay_home_placeholder);
            case 26:
                return ((AndroidStringManager) ((n) obj).a).get(R.string.work_pay_home_placeholder);
            case 27:
                return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new SquareAccountStore$userFlow$$inlined$map$1(((RealCurrentUserProvider) obj).squareAccountStore.userTokenKeyValue.observe(), i7), new RealSheetState$peek$3.AnonymousClass2(i6, money2, 9), i5);
            case 28:
                return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new SquareAccountStore$userFlow$$inlined$map$1(((RealSelectedMerchantProvider) obj).squareAccountStore.selectedMerchantTokenKeyValue.observe(), i4), new RealSheetState$peek$3.AnonymousClass2(i6, money2, 8), i5);
            default:
                Object obj5 = ((Location) obj).protoJson;
                if (obj5 == null) {
                    return null;
                }
                Moshi moshi = ProtoDeserializer.moshi;
                try {
                    Result.Companion companion = Result.Companion;
                    Moshi moshi2 = ProtoDeserializer.moshi;
                    moshi2.getClass();
                    failure = moshi2.adapter(com.squareup.protos.wire.roster.mds.Unit.class, Util.NO_ANNOTATIONS, null).fromJsonValue(obj5);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                return (com.squareup.protos.wire.roster.mds.Unit) (failure instanceof Result.Failure ? null : failure);
        }
    }
}
