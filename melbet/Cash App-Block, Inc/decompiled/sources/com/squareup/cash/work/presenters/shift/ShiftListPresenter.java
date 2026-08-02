package com.squareup.cash.work.presenters.shift;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.local.presenters.LocalPresenterModule$Companion;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.data.api.DateRangedFeed;
import com.squareup.cash.work.data.api.ShiftDataLoader;
import com.squareup.cash.work.data.api.ShiftDataState;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.data.real.RealShiftDataLoader$Factory$Impl;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider;
import com.squareup.cash.work.screens.ShiftListScreen;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.real.RealSettingRepository;
import com.squareup.cash.work.viewmodels.FilterSelectionMode;
import com.squareup.cash.work.viewmodels.ScheduleCalendarDot;
import com.squareup.cash.work.viewmodels.ScheduleCalendarViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftFilterType;
import com.squareup.cash.work.viewmodels.ShiftFilterViewModel;
import com.squareup.cash.work.viewmodels.ShiftListDayViewModel;
import com.squareup.cash.work.viewmodels.ShiftListScheduleViewModel;
import com.squareup.cash.work.viewmodels.ShiftListTimecardViewModel;
import com.squareup.cash.work.viewmodels.ShiftListViewModel;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.timecards.CalculationTotal;
import com.squareup.protos.timecards.LaborCostTotal;
import com.squareup.protos.timecards.OvertimeReportByTimecardForEmployeeResponse;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.wire.roster.mds.Unit;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import j$.time.DesugarLocalDate;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.comparisons.NaturalOrderComparator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.Tags;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes7.dex */
public final class ShiftListPresenter implements MoleculePresenter {
    public final RealAssignedLocationProvider assignedLocationProvider;
    public final AndroidClock clock;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealSelectedMerchantDataProvider selectedMerchantDataProvider;
    public final RealSellerCardViewModelProducer sellerCardViewModelProducer;
    public final RealShiftDataLoader$Factory$Impl shiftDataLoaderFactory;
    public final MetadataRepo viewModelMapper;

    public ShiftListPresenter(ShiftListScreen shiftListScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidClock androidClock, RealShiftDataLoader$Factory$Impl realShiftDataLoader$Factory$Impl, RealSelectedMerchantDataProvider realSelectedMerchantDataProvider, RealSellerCardViewModelProducer realSellerCardViewModelProducer, RealAssignedLocationProvider realAssignedLocationProvider, MetadataRepo metadataRepo) {
        shiftListScreen.getClass();
        this.navigator = screenNavigator;
        this.clock = androidClock;
        this.shiftDataLoaderFactory = realShiftDataLoader$Factory$Impl;
        this.selectedMerchantDataProvider = realSelectedMerchantDataProvider;
        this.sellerCardViewModelProducer = realSellerCardViewModelProducer;
        this.assignedLocationProvider = realAssignedLocationProvider;
        this.viewModelMapper = metadataRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x057f A[SYNTHETIC] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        DayOfWeek dayOfWeek;
        LocalDate localDate;
        String m;
        GapComposer gapComposer;
        boolean z;
        ShiftFilterViewModel shiftFilterViewModel;
        Object loaded;
        String str;
        String displayName;
        Iterator it;
        DateRangedFeed dateRangedFeed;
        ShiftListTimecardViewModel shiftListTimecardViewModel;
        String str2;
        Money money;
        CalculationTotal calculationTotal;
        Integer num;
        Timecard timecard;
        YearMonth yearMonth;
        int i2;
        String str3;
        LocalDate localDate2;
        SellerCardViewModel sellerCardViewModel;
        ShiftListScheduleViewModel shiftListScheduleViewModel;
        String formatShiftTimeRange;
        String str4;
        String str5;
        Object obj;
        String displayName2;
        String str6;
        boolean z2;
        Timecard timecard2;
        boolean z3;
        String str7;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(526762006);
        Object rememberedValue = gapComposer2.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            AndroidClock androidClock = this.clock;
            rememberedValue = DesugarLocalDate.ofInstant(DimensionKt.now(androidClock), androidClock.timeZone().toZoneId());
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        LocalDate localDate3 = (LocalDate) rememberedValue;
        StableCoroutineScope rememberStableCoroutineScope = zzsc.rememberStableCoroutineScope(gapComposer2);
        boolean changed = gapComposer2.changed(rememberStableCoroutineScope);
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (changed || rememberedValue2 == obj2) {
            rememberStableCoroutineScope.getClass();
            RealGrpcStreamingCall realGrpcStreamingCall = this.shiftDataLoaderFactory.delegateFactory;
            AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) realGrpcStreamingCall.grpcClient).lambda.invoke();
            CardProduct.Companion companion = new CardProduct.Companion(13);
            AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) ((NavigationSideEffects.MetroFactory) realGrpcStreamingCall.method).invoke();
            RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) ((DoubleCheck) realGrpcStreamingCall.requestBody).getValue();
            RealTeamMemberIdProvider realTeamMemberIdProvider = (RealTeamMemberIdProvider) ((Provider) realGrpcStreamingCall.call).invoke();
            RealSettingRepository realSettingRepository = (RealSettingRepository) ((DoubleCheck) realGrpcStreamingCall.timeout).getValue();
            RealLocationRepository realLocationRepository = (RealLocationRepository) ((DoubleCheck) realGrpcStreamingCall.requestMetadata).getValue();
            androidClock2.getClass();
            realSelectedMerchantProvider.getClass();
            realTeamMemberIdProvider.getClass();
            realSettingRepository.getClass();
            realLocationRepository.getClass();
            Object realShiftDataLoader = new RealShiftDataLoader(androidClock2, companion, assetPublicSuffixList, realSelectedMerchantProvider, realTeamMemberIdProvider, realSettingRepository, realLocationRepository, rememberStableCoroutineScope);
            gapComposer2.updateRememberedValue(realShiftDataLoader);
            rememberedValue2 = realShiftDataLoader;
        }
        ShiftDataLoader shiftDataLoader = (ShiftDataLoader) rememberedValue2;
        MutableState collectAsState = Updater.collectAsState((StateFlow) ((RealShiftDataLoader) shiftDataLoader).state$delegate.getValue(), null, gapComposer2, 1);
        ShiftDataState shiftDataState = (ShiftDataState) collectAsState.getValue();
        ShiftDataState.Ready ready = shiftDataState instanceof ShiftDataState.Ready ? (ShiftDataState.Ready) shiftDataState : null;
        if (ready == null || (dayOfWeek = ready.weekStartDay) == null) {
            dayOfWeek = DayOfWeek.SUNDAY;
        }
        DayOfWeek dayOfWeek2 = dayOfWeek;
        SellerCardViewModel collectSelectedMerchantViewModel = this.sellerCardViewModelProducer.collectSelectedMerchantViewModel(gapComposer2);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = this.selectedMerchantDataProvider.getSelectedMerchantFlow();
            gapComposer2.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer2, 48, 2);
        Object rememberedValue4 = gapComposer2.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = this.assignedLocationProvider.getLocations();
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, EmptyList.INSTANCE, null, gapComposer2, 48, 2);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (rememberedValue5 == obj2) {
            rememberedValue5 = Updater.mutableStateOf$default(localDate3);
            gapComposer2.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (rememberedValue6 == obj2) {
            rememberedValue6 = Updater.mutableStateOf$default(YearMonth.from(localDate3));
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState2 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (rememberedValue7 == obj2) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState3 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (rememberedValue8 == obj2) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            rememberedValue8 = Updater.mutableStateOf$default(emptyMap);
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState4 = (MutableState) rememberedValue8;
        SellerCardViewModel sellerCardViewModel2 = collectSelectedMerchantViewModel;
        GapComposer gapComposer3 = gapComposer2;
        Updater.LaunchedEffect(gapComposer3, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, this, shiftDataLoader, localDate3, mutableState3, mutableState2, mutableState, mutableState4, 13));
        ShiftDataState shiftDataState2 = (ShiftDataState) collectAsState.getValue();
        LocalDate localDate4 = (LocalDate) mutableState.getValue();
        localDate4.getClass();
        YearMonth yearMonth2 = (YearMonth) mutableState2.getValue();
        yearMonth2.getClass();
        boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
        localDate3.getClass();
        Merchant merchant = (Merchant) collectAsState2.getValue();
        String name = merchant != null ? MerchantKt.getName(merchant) : null;
        if (name == null) {
            name = "";
        }
        List list = (List) collectAsState3.getValue();
        Map map = (Map) mutableState4.getValue();
        shiftDataState2.getClass();
        dayOfWeek2.getClass();
        sellerCardViewModel2.getClass();
        list.getClass();
        map.getClass();
        if (shiftDataState2.equals(ShiftDataState.NotReady.INSTANCE)) {
            loaded = ShiftListViewModel.Loading.INSTANCE;
        } else {
            if (!(shiftDataState2 instanceof ShiftDataState.Error)) {
                if (!(shiftDataState2 instanceof ShiftDataState.Ready)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                MetadataRepo metadataRepo = this.viewModelMapper;
                Locale locale = (Locale) ((RealLocaleManager) metadataRepo.mMetadataList).resolvedLocale.$$delegate_0.getValue();
                Iterable iterable = (Set) map.get(ShiftFilterType.LOCATION);
                if (iterable == null) {
                    iterable = EmptySet.INSTANCE;
                }
                Iterable iterable2 = iterable;
                List<Location> list2 = list;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Location location : list2) {
                    Unit protoModel = location.getProtoModel();
                    if (protoModel == null || (str7 = protoModel.token) == null || LocalPresenterModule$Companion.getDisplayName(location) == null) {
                        str7 = null;
                    }
                    if (str7 != null) {
                        linkedHashSet.add(str7);
                    }
                }
                LinkedHashSet intersect = CollectionsKt.intersect(iterable2, linkedHashSet);
                ShiftDataState.Ready ready2 = (ShiftDataState.Ready) shiftDataState2;
                DateRangedFeed dateRangedFeed2 = ready2.timecards;
                DateRangedFeed dateRangedFeed3 = ready2.schedules;
                LocalDate localDate5 = (LocalDate) ComparisonsKt___ComparisonsJvmKt.minOf(dateRangedFeed3.getStart(), dateRangedFeed2.getStart());
                LocalDate localDate6 = (LocalDate) ComparisonsKt___ComparisonsJvmKt.maxOf(dateRangedFeed3.getEndInclusive(), dateRangedFeed2.getEndInclusive());
                MapBuilder mapBuilder = new MapBuilder();
                long j = 1;
                for (LocalDate localDate7 : DesugarLocalDate.datesUntil(localDate5, localDate6.plusDays(1L))) {
                    localDate7.getClass();
                    long j2 = j;
                    List list3 = dateRangedFeed2.get(localDate7);
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            Shift shift = ((OvertimeReportByTimecardForEmployeeResponse.ByTimecard) it2.next()).shift;
                            if (LocalPresenterModule$Companion.access$matchesLocationFilter((shift == null || (timecard2 = shift.timecard) == null) ? null : timecard2.clockin_unit_token, intersect)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    List list4 = dateRangedFeed3.get(localDate7);
                    boolean z4 = booleanValue;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            ShiftSchedule.Version version = ((ShiftSchedule) it3.next()).published_version;
                            if (LocalPresenterModule$Companion.access$matchesLocationFilter(version != null ? version.location_id : null, intersect)) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                    if (z2 || z3) {
                        mapBuilder.put(localDate7, SetsKt__SetsJVMKt.setOf(ScheduleCalendarDot.BLACK));
                    }
                    booleanValue = z4;
                    j = j2;
                }
                boolean z5 = booleanValue;
                long j3 = j;
                MapBuilder build = mapBuilder.build();
                RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) metadataRepo.mEmojiCharArray;
                LocalDate localDate8 = (LocalDate) ComparisonsKt___ComparisonsJvmKt.minOf(dateRangedFeed3.getStart(), dateRangedFeed2.getStart());
                int between = (int) (ChronoUnit.DAYS.between(localDate8, (LocalDate) ComparisonsKt___ComparisonsJvmKt.maxOf(dateRangedFeed3.getEndInclusive(), dateRangedFeed2.getEndInclusive())) + j3);
                ArrayList arrayList = new ArrayList(between);
                int i3 = 0;
                while (i3 < between) {
                    GapComposer gapComposer4 = gapComposer3;
                    MapBuilder mapBuilder2 = build;
                    LocalDate plusDays = localDate8.plusDays(i3);
                    plusDays.getClass();
                    List list5 = dateRangedFeed3.get(plusDays);
                    DateRangedFeed dateRangedFeed4 = dateRangedFeed3;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list5) {
                        LocalDate localDate9 = localDate8;
                        int i4 = between;
                        ShiftSchedule.Version version2 = ((ShiftSchedule) obj3).published_version;
                        if (LocalPresenterModule$Companion.access$matchesLocationFilter(version2 != null ? version2.location_id : null, intersect)) {
                            arrayList2.add(obj3);
                        }
                        localDate8 = localDate9;
                        between = i4;
                    }
                    LocalDate localDate10 = localDate8;
                    int i5 = between;
                    NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
                    naturalOrderComparator.getClass();
                    final VideoCapture$$ExternalSyntheticLambda6 videoCapture$$ExternalSyntheticLambda6 = new VideoCapture$$ExternalSyntheticLambda6(naturalOrderComparator, 13);
                    final int i6 = 0;
                    List sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.squareup.cash.work.presenters.shift.ShiftListViewModelMapper$buildDays$lambda$0$$inlined$compareBy$1
                        @Override // java.util.Comparator
                        public final int compare(Object obj4, Object obj5) {
                            Instant instant;
                            ShiftSchedule.Version version3;
                            CalendarEvent calendarEvent;
                            String str8;
                            CalendarEvent calendarEvent2;
                            String str9;
                            Timecard timecard3;
                            Timecard timecard4;
                            int i7 = i6;
                            VideoCapture$$ExternalSyntheticLambda6 videoCapture$$ExternalSyntheticLambda62 = videoCapture$$ExternalSyntheticLambda6;
                            Object obj6 = null;
                            switch (i7) {
                                case 0:
                                    ShiftSchedule.Version version4 = ((ShiftSchedule) obj4).published_version;
                                    if (version4 != null && (calendarEvent2 = version4.calendar_event) != null && (str9 = calendarEvent2.start_datetime) != null) {
                                        try {
                                            instant = OffsetDateTime.parse(str9).toInstant();
                                        } catch (DateTimeException unused) {
                                        }
                                        version3 = ((ShiftSchedule) obj5).published_version;
                                        if (version3 != null && (calendarEvent = version3.calendar_event) != null && (str8 = calendarEvent.start_datetime) != null) {
                                            try {
                                                obj6 = OffsetDateTime.parse(str8).toInstant();
                                            } catch (DateTimeException unused2) {
                                            }
                                        }
                                        return videoCapture$$ExternalSyntheticLambda62.compare(instant, obj6);
                                    }
                                    instant = null;
                                    version3 = ((ShiftSchedule) obj5).published_version;
                                    if (version3 != null) {
                                        obj6 = OffsetDateTime.parse(str8).toInstant();
                                    }
                                    return videoCapture$$ExternalSyntheticLambda62.compare(instant, obj6);
                                default:
                                    Shift shift2 = ((OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj4).shift;
                                    Long l = (shift2 == null || (timecard4 = shift2.timecard) == null) ? null : timecard4.clockin_timestamp_ms;
                                    Shift shift3 = ((OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj5).shift;
                                    if (shift3 != null && (timecard3 = shift3.timecard) != null) {
                                        obj6 = timecard3.clockin_timestamp_ms;
                                    }
                                    return videoCapture$$ExternalSyntheticLambda62.compare(l, obj6);
                            }
                        }
                    });
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = sortedWith.iterator();
                    while (it4.hasNext()) {
                        ShiftSchedule shiftSchedule = (ShiftSchedule) it4.next();
                        Iterator it5 = it4;
                        ShiftSchedule.Version version3 = shiftSchedule.published_version;
                        if (version3 == null) {
                            shiftListScheduleViewModel = null;
                            localDate2 = localDate4;
                            yearMonth = yearMonth2;
                            i2 = i3;
                            sellerCardViewModel = sellerCardViewModel2;
                        } else {
                            yearMonth = yearMonth2;
                            CalendarEvent calendarEvent = version3.calendar_event;
                            if (calendarEvent == null) {
                                sellerCardViewModel = sellerCardViewModel2;
                                shiftListScheduleViewModel = null;
                                localDate2 = localDate4;
                                i2 = i3;
                            } else {
                                i2 = i3;
                                String str8 = calendarEvent.start_datetime;
                                if (str8 == null || (str3 = calendarEvent.stop_datetime) == null) {
                                    sellerCardViewModel = sellerCardViewModel2;
                                    shiftListScheduleViewModel = null;
                                    localDate2 = localDate4;
                                } else {
                                    try {
                                        OffsetDateTime parse = OffsetDateTime.parse(str8);
                                        localDate2 = localDate4;
                                        try {
                                            OffsetDateTime parse2 = OffsetDateTime.parse(str3);
                                            parse.getClass();
                                            parse2.getClass();
                                            formatShiftTimeRange = realShiftTimeFormatter.formatShiftTimeRange(parse, parse2, calendarEvent.time_zone);
                                            str4 = version3.location_id;
                                        } catch (DateTimeException unused) {
                                        }
                                    } catch (DateTimeException unused2) {
                                        localDate2 = localDate4;
                                    }
                                    if (str4 == null) {
                                        str5 = formatShiftTimeRange;
                                    } else {
                                        Iterator it6 = list2.iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                str5 = formatShiftTimeRange;
                                                obj = null;
                                                break;
                                            }
                                            obj = it6.next();
                                            str5 = formatShiftTimeRange;
                                            Unit protoModel2 = ((Location) obj).getProtoModel();
                                            if (Intrinsics.areEqual(protoModel2 != null ? protoModel2.token : null, str4)) {
                                                break;
                                            }
                                            formatShiftTimeRange = str5;
                                        }
                                        Location location2 = (Location) obj;
                                        if (location2 != null) {
                                            displayName2 = LocalPresenterModule$Companion.getDisplayName(location2);
                                            if (displayName2 == null) {
                                                displayName2 = "";
                                            }
                                            str6 = shiftSchedule.id;
                                            if (str6 != null) {
                                                StringBuilder m2 = Boxes$$ExternalSyntheticOutline1.m(str5);
                                                if (displayName2.length() > 0) {
                                                    m2.append("  ·  ");
                                                    m2.append(displayName2);
                                                }
                                                sellerCardViewModel = sellerCardViewModel2;
                                                shiftListScheduleViewModel = new ShiftListScheduleViewModel(sellerCardViewModel, str6, name, m2.toString());
                                            }
                                            sellerCardViewModel = sellerCardViewModel2;
                                            shiftListScheduleViewModel = null;
                                        }
                                    }
                                    displayName2 = null;
                                    if (displayName2 == null) {
                                    }
                                    str6 = shiftSchedule.id;
                                    if (str6 != null) {
                                    }
                                    sellerCardViewModel = sellerCardViewModel2;
                                    shiftListScheduleViewModel = null;
                                }
                            }
                        }
                        if (shiftListScheduleViewModel != null) {
                            arrayList3.add(shiftListScheduleViewModel);
                        }
                        sellerCardViewModel2 = sellerCardViewModel;
                        it4 = it5;
                        yearMonth2 = yearMonth;
                        i3 = i2;
                        localDate4 = localDate2;
                    }
                    LocalDate localDate11 = localDate4;
                    YearMonth yearMonth3 = yearMonth2;
                    int i7 = i3;
                    SellerCardViewModel sellerCardViewModel3 = sellerCardViewModel2;
                    ImmutableList immutableList = Tags.toImmutableList(arrayList3);
                    List list6 = dateRangedFeed2.get(plusDays);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list6) {
                        Shift shift2 = ((OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj4).shift;
                        if (LocalPresenterModule$Companion.access$matchesLocationFilter((shift2 == null || (timecard = shift2.timecard) == null) ? null : timecard.clockin_unit_token, intersect)) {
                            arrayList4.add(obj4);
                        }
                    }
                    NaturalOrderComparator naturalOrderComparator2 = NaturalOrderComparator.INSTANCE;
                    naturalOrderComparator2.getClass();
                    final VideoCapture$$ExternalSyntheticLambda6 videoCapture$$ExternalSyntheticLambda62 = new VideoCapture$$ExternalSyntheticLambda6(naturalOrderComparator2, 13);
                    final int i8 = 1;
                    List sortedWith2 = CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.squareup.cash.work.presenters.shift.ShiftListViewModelMapper$buildDays$lambda$0$$inlined$compareBy$1
                        @Override // java.util.Comparator
                        public final int compare(Object obj42, Object obj5) {
                            Instant instant;
                            ShiftSchedule.Version version32;
                            CalendarEvent calendarEvent2;
                            String str82;
                            CalendarEvent calendarEvent22;
                            String str9;
                            Timecard timecard3;
                            Timecard timecard4;
                            int i72 = i8;
                            VideoCapture$$ExternalSyntheticLambda6 videoCapture$$ExternalSyntheticLambda622 = videoCapture$$ExternalSyntheticLambda62;
                            Object obj6 = null;
                            switch (i72) {
                                case 0:
                                    ShiftSchedule.Version version4 = ((ShiftSchedule) obj42).published_version;
                                    if (version4 != null && (calendarEvent22 = version4.calendar_event) != null && (str9 = calendarEvent22.start_datetime) != null) {
                                        try {
                                            instant = OffsetDateTime.parse(str9).toInstant();
                                        } catch (DateTimeException unused3) {
                                        }
                                        version32 = ((ShiftSchedule) obj5).published_version;
                                        if (version32 != null && (calendarEvent2 = version32.calendar_event) != null && (str82 = calendarEvent2.start_datetime) != null) {
                                            try {
                                                obj6 = OffsetDateTime.parse(str82).toInstant();
                                            } catch (DateTimeException unused22) {
                                            }
                                        }
                                        return videoCapture$$ExternalSyntheticLambda622.compare(instant, obj6);
                                    }
                                    instant = null;
                                    version32 = ((ShiftSchedule) obj5).published_version;
                                    if (version32 != null) {
                                        obj6 = OffsetDateTime.parse(str82).toInstant();
                                    }
                                    return videoCapture$$ExternalSyntheticLambda622.compare(instant, obj6);
                                default:
                                    Shift shift22 = ((OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj42).shift;
                                    Long l = (shift22 == null || (timecard4 = shift22.timecard) == null) ? null : timecard4.clockin_timestamp_ms;
                                    Shift shift3 = ((OvertimeReportByTimecardForEmployeeResponse.ByTimecard) obj5).shift;
                                    if (shift3 != null && (timecard3 = shift3.timecard) != null) {
                                        obj6 = timecard3.clockin_timestamp_ms;
                                    }
                                    return videoCapture$$ExternalSyntheticLambda622.compare(l, obj6);
                            }
                        }
                    });
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it7 = sortedWith2.iterator();
                    while (it7.hasNext()) {
                        OvertimeReportByTimecardForEmployeeResponse.ByTimecard byTimecard = (OvertimeReportByTimecardForEmployeeResponse.ByTimecard) it7.next();
                        Shift shift3 = byTimecard.shift;
                        if (shift3 == null || (str2 = shift3.id) == null) {
                            it = it7;
                        } else {
                            LaborCostTotal laborCostTotal = byTimecard.labor_cost;
                            it = it7;
                            if (laborCostTotal != null) {
                                dateRangedFeed = dateRangedFeed2;
                                List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new Money[]{laborCostTotal.regular_labor_money, laborCostTotal.overtime_labor_money, laborCostTotal.doubletime_labor_money});
                                if (((ArrayList) filterNotNull).isEmpty()) {
                                    money = null;
                                } else {
                                    Iterator it8 = filterNotNull.iterator();
                                    if (!it8.hasNext()) {
                                        a$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
                                        return null;
                                    }
                                    Object next = it8.next();
                                    while (it8.hasNext()) {
                                        next = Moneys.plus((Money) next, (Money) it8.next());
                                    }
                                    money = (Money) next;
                                }
                                if (money != null && (calculationTotal = byTimecard.calculation_total) != null && (num = calculationTotal.total_paid_seconds) != null) {
                                    shiftListTimecardViewModel = new ShiftListTimecardViewModel(sellerCardViewModel3, str2, name, Recorder$$ExternalSyntheticOutline2.m(((MoneyFormatter) metadataRepo.mTypeface).format(money), "  ·  ", realShiftTimeFormatter.formatDuration(num.intValue())));
                                    if (shiftListTimecardViewModel != null) {
                                        arrayList5.add(shiftListTimecardViewModel);
                                    }
                                    it7 = it;
                                    dateRangedFeed2 = dateRangedFeed;
                                }
                                shiftListTimecardViewModel = null;
                                if (shiftListTimecardViewModel != null) {
                                }
                                it7 = it;
                                dateRangedFeed2 = dateRangedFeed;
                            }
                        }
                        dateRangedFeed = dateRangedFeed2;
                        shiftListTimecardViewModel = null;
                        if (shiftListTimecardViewModel != null) {
                        }
                        it7 = it;
                        dateRangedFeed2 = dateRangedFeed;
                    }
                    ImmutableList immutableList2 = Tags.toImmutableList(arrayList5);
                    String format2 = plusDays.format(realShiftTimeFormatter.formatters().dayAndDate);
                    format2.getClass();
                    arrayList.add(new ShiftListDayViewModel(plusDays, format2, plusDays.equals(localDate3), plusDays.isBefore(localDate3), immutableList, immutableList2));
                    i3 = i7 + 1;
                    sellerCardViewModel2 = sellerCardViewModel3;
                    gapComposer3 = gapComposer4;
                    build = mapBuilder2;
                    dateRangedFeed3 = dateRangedFeed4;
                    localDate8 = localDate10;
                    between = i5;
                    yearMonth2 = yearMonth3;
                    localDate4 = localDate11;
                }
                LocalDate localDate12 = localDate4;
                YearMonth yearMonth4 = yearMonth2;
                GapComposer gapComposer5 = gapComposer3;
                MapBuilder mapBuilder3 = build;
                ImmutableList immutableList3 = Tags.toImmutableList(arrayList);
                if (z5) {
                    m = yearMonth4.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, locale);
                    m.getClass();
                    localDate = localDate12;
                } else {
                    localDate = localDate12;
                    LocalDate with = localDate.with(TemporalAdjusters.previousOrSame(dayOfWeek2));
                    LocalDate plusDays2 = with.plusDays(6L);
                    if (with.getMonth() == plusDays2.getMonth()) {
                        m = with.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, locale);
                        m.getClass();
                    } else {
                        Month month = with.getMonth();
                        TextStyle textStyle = TextStyle.SHORT_STANDALONE;
                        m = Recorder$$ExternalSyntheticOutline2.m(month.getDisplayName(textStyle, locale), "–", plusDays2.getMonth().getDisplayName(textStyle, locale));
                    }
                }
                LocalDate localDate13 = localDate;
                gapComposer = gapComposer5;
                z = false;
                ScheduleCalendarViewModel scheduleCalendarViewModel = new ScheduleCalendarViewModel(localDate13, yearMonth4, z5, dayOfWeek2, localDate3, mapBuilder3);
                ArrayList arrayList6 = new ArrayList();
                for (Location location3 : list2) {
                    Unit protoModel3 = location3.getProtoModel();
                    ShiftFilterViewModel.Option option = (protoModel3 == null || (str = protoModel3.token) == null || (displayName = LocalPresenterModule$Companion.getDisplayName(location3)) == null) ? null : new ShiftFilterViewModel.Option(str, displayName, intersect.contains(str));
                    if (option != null) {
                        arrayList6.add(option);
                    }
                }
                if (arrayList6.isEmpty()) {
                    shiftFilterViewModel = new ShiftFilterViewModel(EmptyList.INSTANCE);
                } else {
                    ShiftFilterType shiftFilterType = ShiftFilterType.LOCATION;
                    String str9 = ((AndroidStringManager) metadataRepo.mRootNode).get(R.string.work_shift_list_filter_location_title);
                    FilterSelectionMode filterSelectionMode = FilterSelectionMode.MULTI;
                    shiftFilterViewModel = new ShiftFilterViewModel(CollectionsKt__CollectionsJVMKt.listOf(new ShiftFilterViewModel.Section(str9, arrayList6)));
                }
                loaded = new ShiftListViewModel.Loaded(m, scheduleCalendarViewModel, immutableList3, shiftFilterViewModel);
                gapComposer.end(z);
                return loaded;
            }
            loaded = ShiftListViewModel.Error.INSTANCE;
        }
        gapComposer = gapComposer3;
        z = false;
        gapComposer.end(z);
        return loaded;
    }
}
