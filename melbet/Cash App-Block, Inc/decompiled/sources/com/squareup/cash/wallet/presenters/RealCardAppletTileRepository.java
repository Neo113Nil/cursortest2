package com.squareup.cash.wallet.presenters;

import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.directory.data.DirectoryKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealCardAppletTileRepository implements CardAppletTileRepository {
    public final ReadonlyStateFlow availabilityState;
    public final RealBoostRepository boostRepository;
    public final RealCardCustomizationRepository cardCustomizationRepository;
    public final ReadonlyStateFlow cardDetailsModel;
    public final StateFlow cardScheme;
    public final SyncTopic cardTopic;
    public final RealCashAppTagManager cashAppTagManager;
    public final RealClientSyncer clientSyncer;
    public final FeatureFlagManager featureFlagManager;
    public final GpsConfigQueries heroCardStateQueries;
    public final CoroutineContext ioDispatcher;
    public final ReadonlyStateFlow isCardReadyToAnimate;
    public final IssuedCardManager issuedCardManager;
    public final KeyValue lastViewedPaymentDevicePage;
    public final KeyValue moneyTabCardIntroState;
    public final ReadonlyStateFlow nullStateCardDetails;
    public final PostcardClientService postcardService;
    public final RealPrepurchaseCashCardRepository prepurchaseCashCardRepository;
    public final RealProfileManager profileManager;
    public final SyncValueReader syncValueReader;

    public RealCardAppletTileRepository(RealClientSyncer realClientSyncer, IssuedCardManager issuedCardManager, SyncValueReader syncValueReader, RealBoostRepository realBoostRepository, PostcardClientService postcardClientService, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealProfileManager realProfileManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealCardCustomizationRepository realCardCustomizationRepository, RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository, FeatureFlagManager featureFlagManager, KeyValue keyValue, RealCashAppTagManager realCashAppTagManager, KeyValue keyValue2, SyncTopic syncTopic, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.clientSyncer = realClientSyncer;
        this.issuedCardManager = issuedCardManager;
        this.syncValueReader = syncValueReader;
        this.boostRepository = realBoostRepository;
        this.postcardService = postcardClientService;
        this.profileManager = realProfileManager;
        this.cardCustomizationRepository = realCardCustomizationRepository;
        this.prepurchaseCashCardRepository = realPrepurchaseCashCardRepository;
        this.featureFlagManager = featureFlagManager;
        this.moneyTabCardIntroState = keyValue;
        this.cashAppTagManager = realCashAppTagManager;
        this.lastViewedPaymentDevicePage = keyValue2;
        this.cardTopic = syncTopic;
        this.ioDispatcher = coroutineContext;
        StateFlow singleValueOrDefault = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CardTabScheme, new CardScheme(EmptyList.INSTANCE), new Matcher$$ExternalSyntheticLambda9(13));
        this.cardScheme = singleValueOrDefault;
        this.heroCardStateQueries = cashAccountDatabaseImpl.cardTabHeroStateQueries;
        Continuation continuation = null;
        int i = 10;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new Cache.AnonymousClass1(this, continuation, i), 2);
        AppLockMonitor$special$$inlined$map$1 appLockMonitor$special$$inlined$map$1 = new AppLockMonitor$special$$inlined$map$1(Countries.observeState(keyValue), 1);
        Boolean bool = Boolean.FALSE;
        StartedLazily startedLazily = SharingStarted.Companion.Eagerly;
        this.isCardReadyToAnimate = FlowKt.stateIn(appLockMonitor$special$$inlined$map$1, coroutineScope, startedLazily, bool);
        RealIssuedCardManager realIssuedCardManager = (RealIssuedCardManager) issuedCardManager;
        this.availabilityState = FlowKt.stateIn(FlowKt.flowOn(FlowKt.combine(new FinishSetupTileBadgeCounter(i, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.CASH_CARD_TAB}), singleValueOrDefault, realIssuedCardManager.getIssuedCardOrNull(), new RealCardAppletTileRepository$availabilityState$1(this, null)), coroutineContext), coroutineScope, startedLazily, AppletAvailabilityState.LOADING);
        this.cardDetailsModel = FlowKt.stateIn(FlowKt.flowOn(FlowKt.transformLatest(FlowKt.flowOn(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realIssuedCardManager.getIssuedCardOrNull(), 24), coroutineContext), new Badger$collect$$inlined$combine$2$3(continuation, this, i)), coroutineContext), coroutineScope, startedLazily, null);
        ReadonlyStateFlow stateIn = FlowKt.stateIn(FlowKt.flowOn(new FinishSetupTileBadgeCounter(20, new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(singleValueOrDefault, 24), this), coroutineContext), coroutineScope, startedLazily, null);
        this.nullStateCardDetails = stateIn;
        FlowKt.stateIn(new AppLockMonitor$special$$inlined$map$2(stateIn, 17), coroutineScope, startedLazily, AppletAvailabilityState.UNAVAILABLE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[EDGE_INSN: B:13:0x002d->B:14:0x002d BREAK  A[LOOP:0: B:2:0x0008->B:22:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:2:0x0008->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$cardNuxThemes(RealCardAppletTileRepository realCardAppletTileRepository, CardScheme cardScheme, ContinuationImpl continuationImpl) {
        CardModule.HeroNullStateModule heroNullStateModule;
        Iterator it = cardScheme.modules.iterator();
        while (true) {
            if (!it.hasNext()) {
                heroNullStateModule = null;
                break;
            }
            CardModule.Type type2 = ((CardModule) it.next()).f1328type;
            if (type2 != null) {
                CardModule.Type.HeroNullState heroNullState = type2 instanceof CardModule.Type.HeroNullState ? (CardModule.Type.HeroNullState) type2 : null;
                if (heroNullState != null) {
                    heroNullStateModule = heroNullState.getValue();
                    if (heroNullStateModule == null) {
                        break;
                    }
                }
            }
            heroNullStateModule = null;
            if (heroNullStateModule == null) {
            }
        }
        if (heroNullStateModule == null) {
            return null;
        }
        Object firstOrNull = FlowKt.firstOrNull(new FlowExtensionsKt$combine$$inlined$combine$1(13, realCardAppletTileRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CardThemeDefinitions), heroNullStateModule), continuationImpl);
        return firstOrNull == CoroutineSingletons.COROUTINE_SUSPENDED ? firstOrNull : (List) firstOrNull;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lastViewedHeroTag(ContinuationImpl continuationImpl) {
        RealCardAppletTileRepository$lastViewedHeroTag$1 realCardAppletTileRepository$lastViewedHeroTag$1;
        int i;
        int intValue;
        int i2;
        CashAppTag cashAppTag;
        CardSchemeViewModel.Module.HeroTag heroTag;
        if (continuationImpl instanceof RealCardAppletTileRepository$lastViewedHeroTag$1) {
            realCardAppletTileRepository$lastViewedHeroTag$1 = (RealCardAppletTileRepository$lastViewedHeroTag$1) continuationImpl;
            int i3 = realCardAppletTileRepository$lastViewedHeroTag$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realCardAppletTileRepository$lastViewedHeroTag$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realCardAppletTileRepository$lastViewedHeroTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCardAppletTileRepository$lastViewedHeroTag$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realCardAppletTileRepository$lastViewedHeroTag$1.label = 1;
                    obj = this.lastViewedPaymentDevicePage.get(realCardAppletTileRepository$lastViewedHeroTag$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = realCardAppletTileRepository$lastViewedHeroTag$1.I$0;
                        SafeTrace.throwOnFailure(obj);
                        cashAppTag = (CashAppTag) CollectionsKt.getOrNull(i2 - 1, (List) obj);
                        if (cashAppTag != null) {
                            heroTag = DirectoryKt.toHeroTag(cashAppTag, false, 0, null, false);
                            return new LastViewedHeroTag(i2, heroTag);
                        }
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                intValue = ((Number) obj).intValue();
                if (intValue > 0) {
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 allCashAppTags = this.cashAppTagManager.getAllCashAppTags();
                    realCardAppletTileRepository$lastViewedHeroTag$1.I$0 = intValue;
                    realCardAppletTileRepository$lastViewedHeroTag$1.label = 2;
                    Object first = FlowKt.first(allCashAppTags, realCardAppletTileRepository$lastViewedHeroTag$1);
                    if (first != coroutineSingletons) {
                        obj = first;
                        i2 = intValue;
                        cashAppTag = (CashAppTag) CollectionsKt.getOrNull(i2 - 1, (List) obj);
                        if (cashAppTag != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        realCardAppletTileRepository$lastViewedHeroTag$1 = new RealCardAppletTileRepository$lastViewedHeroTag$1(this, continuationImpl);
        Object obj2 = realCardAppletTileRepository$lastViewedHeroTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCardAppletTileRepository$lastViewedHeroTag$1.label;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (intValue > 0) {
        }
        return null;
    }
}
