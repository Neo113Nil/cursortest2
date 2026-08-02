package com.squareup.cash.userjourneys.tracker;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.RumMonitor;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealDatadogClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.MetadataKey;
import com.squareup.cash.observability.types.MetadataSection$ReservedRumKey;
import com.squareup.cash.observability.types.MetadataSection$UserJourneysSection;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.userjourneys.data.CompletedJourney;
import com.squareup.cash.userjourneys.data.JourneyContext;
import com.squareup.cash.userjourneys.data.TerminationContext;
import com.squareup.cash.userjourneys.data.UserJourney;
import com.squareup.cash.userjourneys.notifier.NoOpUserJourneyNotifier;
import com.squareup.cash.userjourneys.tracker.Signal;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourneyProcessingError;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyTerminationReason;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import papa.internal.Perfs$$ExternalSyntheticLambda2;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealUserJourneySignalProcessor implements UserJourneySignalProcessor {
    public final AppForegroundStateProvider appBackgroundProvider;
    public final BugsnagClient bugsnagClient;
    public final AndroidClock clock;
    public final ErrorReporter errorReporter;
    public final RealJourneyRequestContextProvider journeyRequestContextProvider;
    public final RealObservabilityMetadataLogger observabilityMetadataLogger;
    public final CoroutineScope scope;
    public final RealUserJourneyRepository userJourneyRepository;
    public final ArrayList latestActiveUserJourneys = new ArrayList();
    public final BufferedChannel signalQueue = PapaEvent.Channel$default(-2, null, null, 6);
    public final BufferedChannel journeysToUpload = PapaEvent.Channel$default(-2, null, null, 6);
    public final ConcurrentHashMap timeoutJobs = new ConcurrentHashMap();

    public RealUserJourneySignalProcessor(AndroidClock androidClock, RealUserJourneyRepository realUserJourneyRepository, NoOpUserJourneyNotifier noOpUserJourneyNotifier, AppForegroundStateProvider appForegroundStateProvider, BugsnagClient bugsnagClient, RealJourneyRequestContextProvider realJourneyRequestContextProvider, ErrorReporter errorReporter, RealObservabilityMetadataLogger realObservabilityMetadataLogger, CoroutineScope coroutineScope) {
        this.clock = androidClock;
        this.userJourneyRepository = realUserJourneyRepository;
        this.appBackgroundProvider = appForegroundStateProvider;
        this.bugsnagClient = bugsnagClient;
        this.journeyRequestContextProvider = realJourneyRequestContextProvider;
        this.errorReporter = errorReporter;
        this.observabilityMetadataLogger = realObservabilityMetadataLogger;
        this.scope = coroutineScope;
        Timber.Forest.d("Setting up user journey processing", new Object[0]);
        JobKt.launch$default(coroutineScope, null, null, new Cache.AnonymousClass1(this, null, 9), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r8.m3786terminateJourney1Y68eR8(r9, r10, r4, false, r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r10 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$checkForTimedOutJourney(RealUserJourneySignalProcessor realUserJourneySignalProcessor, UUID uuid, Continuation continuation) {
        RealUserJourneySignalProcessor$checkForTimedOutJourney$1 realUserJourneySignalProcessor$checkForTimedOutJourney$1;
        int i;
        UserJourney userJourney;
        UserJourney$Outcome terminated;
        if (continuation instanceof RealUserJourneySignalProcessor$checkForTimedOutJourney$1) {
            realUserJourneySignalProcessor$checkForTimedOutJourney$1 = (RealUserJourneySignalProcessor$checkForTimedOutJourney$1) continuation;
            int i2 = realUserJourneySignalProcessor$checkForTimedOutJourney$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realUserJourneySignalProcessor$checkForTimedOutJourney$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealUserJourneySignalProcessor$checkForTimedOutJourney$1 realUserJourneySignalProcessor$checkForTimedOutJourney$12 = realUserJourneySignalProcessor$checkForTimedOutJourney$1;
                Object obj = realUserJourneySignalProcessor$checkForTimedOutJourney$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserJourneySignalProcessor$checkForTimedOutJourney$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealUserJourneyRepository realUserJourneyRepository = realUserJourneySignalProcessor.userJourneyRepository;
                    uuid.getClass();
                    AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3 = new AlertBannerKt$$ExternalSyntheticLambda3(uuid, 7);
                    realUserJourneySignalProcessor$checkForTimedOutJourney$12.label = 1;
                    obj = realUserJourneyRepository.removeJourneys(alertBannerKt$$ExternalSyntheticLambda3, realUserJourneySignalProcessor$checkForTimedOutJourney$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                userJourney = (UserJourney) CollectionsKt.singleOrNull((Iterable) obj);
                if (userJourney != null) {
                    return Unit.INSTANCE;
                }
                Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m$1(userJourney.getName().getLabel(), " timed out"), new Object[0]);
                int ordinal = ((AppForegroundState) ((RealAppForegroundStateProvider) realUserJourneySignalProcessor.appBackgroundProvider).appForegroundState.$$delegate_0.getValue()).ordinal();
                if (ordinal == 0) {
                    terminated = new UserJourney$Outcome.Terminated(UserJourney$TerminationReason.TIMEOUT_WITH_ACTIVE_USER);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    terminated = new UserJourney$Outcome.Terminated(UserJourney$TerminationReason.TIMEOUT_WITH_IDLE_USER);
                }
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(realUserJourneySignalProcessor.clock.elapsedRealtime(), DurationUnit.MILLISECONDS);
                realUserJourneySignalProcessor$checkForTimedOutJourney$12.label = 2;
            }
        }
        realUserJourneySignalProcessor$checkForTimedOutJourney$1 = new RealUserJourneySignalProcessor$checkForTimedOutJourney$1(realUserJourneySignalProcessor, continuation);
        RealUserJourneySignalProcessor$checkForTimedOutJourney$1 realUserJourneySignalProcessor$checkForTimedOutJourney$122 = realUserJourneySignalProcessor$checkForTimedOutJourney$1;
        Object obj3 = realUserJourneySignalProcessor$checkForTimedOutJourney$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneySignalProcessor$checkForTimedOutJourney$122.label;
        if (i != 0) {
        }
        userJourney = (UserJourney) CollectionsKt.singleOrNull((Iterable) obj3);
        if (userJourney != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[LOOP:1: B:27:0x007f->B:29:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: access$handleEndAllSubJourneys-8Mi8wO0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3784access$handleEndAllSubJourneys8Mi8wO0(RealUserJourneySignalProcessor realUserJourneySignalProcessor, UserJourney$Outcome userJourney$Outcome, long j, Continuation continuation) {
        RealUserJourneySignalProcessor$handleEndAllSubJourneys$1 realUserJourneySignalProcessor$handleEndAllSubJourneys$1;
        int i;
        UserJourney$Outcome userJourney$Outcome2;
        long j2;
        Iterator it;
        int i2;
        Iterator it2;
        RealUserJourneySignalProcessor$handleEndAllSubJourneys$1 realUserJourneySignalProcessor$handleEndAllSubJourneys$12;
        UserJourney$Outcome userJourney$Outcome3;
        if (continuation instanceof RealUserJourneySignalProcessor$handleEndAllSubJourneys$1) {
            realUserJourneySignalProcessor$handleEndAllSubJourneys$1 = (RealUserJourneySignalProcessor$handleEndAllSubJourneys$1) continuation;
            int i3 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realUserJourneySignalProcessor$handleEndAllSubJourneys$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealUserJourneyRepository realUserJourneyRepository = realUserJourneySignalProcessor.userJourneyRepository;
                    CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda0 = new CardAppletTile$$ExternalSyntheticLambda0(7);
                    realUserJourneySignalProcessor$handleEndAllSubJourneys$1.L$0 = userJourney$Outcome;
                    realUserJourneySignalProcessor$handleEndAllSubJourneys$1.J$0 = j;
                    realUserJourneySignalProcessor$handleEndAllSubJourneys$1.label = 1;
                    obj = realUserJourneyRepository.removeJourneys(cardAppletTile$$ExternalSyntheticLambda0, realUserJourneySignalProcessor$handleEndAllSubJourneys$1);
                    if (obj != obj2) {
                        userJourney$Outcome2 = userJourney$Outcome;
                        j2 = j;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.I$0;
                    long j3 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.J$0;
                    Iterator it3 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.L$3;
                    UserJourney$Outcome userJourney$Outcome4 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realUserJourneySignalProcessor$handleEndAllSubJourneys$12 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1;
                    userJourney$Outcome3 = userJourney$Outcome4;
                    it2 = it3;
                    i2 = i4;
                    j2 = j3;
                    while (it2.hasNext()) {
                        UserJourney userJourney = (UserJourney) it2.next();
                        realUserJourneySignalProcessor$handleEndAllSubJourneys$12.L$0 = userJourney$Outcome3;
                        realUserJourneySignalProcessor$handleEndAllSubJourneys$12.L$3 = it2;
                        realUserJourneySignalProcessor$handleEndAllSubJourneys$12.J$0 = j2;
                        realUserJourneySignalProcessor$handleEndAllSubJourneys$12.I$0 = i2;
                        realUserJourneySignalProcessor$handleEndAllSubJourneys$12.label = 2;
                        if (realUserJourneySignalProcessor.m3786terminateJourney1Y68eR8(userJourney, userJourney$Outcome3, j2, false, realUserJourneySignalProcessor$handleEndAllSubJourneys$12) == obj2) {
                            return obj2;
                        }
                    }
                    return Unit.INSTANCE;
                }
                j2 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.J$0;
                userJourney$Outcome2 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.L$0;
                SafeTrace.throwOnFailure(obj);
                Set set = (Set) obj;
                Timber.Forest forest = Timber.Forest;
                int size = set.size();
                Set set2 = set;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UserJourney) it.next()).getName().getLabel());
                }
                i2 = 0;
                forest.d("Ending " + size + " sub-journeys: " + arrayList, new Object[0]);
                it2 = set2.iterator();
                realUserJourneySignalProcessor$handleEndAllSubJourneys$12 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1;
                userJourney$Outcome3 = userJourney$Outcome2;
                while (it2.hasNext()) {
                }
                return Unit.INSTANCE;
            }
        }
        realUserJourneySignalProcessor$handleEndAllSubJourneys$1 = new RealUserJourneySignalProcessor$handleEndAllSubJourneys$1(realUserJourneySignalProcessor, continuation);
        Object obj3 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneySignalProcessor$handleEndAllSubJourneys$1.label;
        if (i != 0) {
        }
        Set set3 = (Set) obj3;
        Timber.Forest forest2 = Timber.Forest;
        int size2 = set3.size();
        Set set22 = set3;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set22, 10));
        it = set22.iterator();
        while (it.hasNext()) {
        }
        i2 = 0;
        forest2.d("Ending " + size2 + " sub-journeys: " + arrayList2, new Object[0]);
        it2 = set22.iterator();
        realUserJourneySignalProcessor$handleEndAllSubJourneys$12 = realUserJourneySignalProcessor$handleEndAllSubJourneys$1;
        userJourney$Outcome3 = userJourney$Outcome2;
        while (it2.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r9.m3786terminateJourney1Y68eR8(r10, r3, r12, false, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r14 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: access$handleEndJourney-exY8QGI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3785access$handleEndJourneyexY8QGI(RealUserJourneySignalProcessor realUserJourneySignalProcessor, UserJourney$Name userJourney$Name, UserJourney$Outcome userJourney$Outcome, long j, Continuation continuation) {
        RealUserJourneySignalProcessor$handleEndJourney$1 realUserJourneySignalProcessor$handleEndJourney$1;
        int i;
        UserJourney userJourney;
        if (continuation instanceof RealUserJourneySignalProcessor$handleEndJourney$1) {
            realUserJourneySignalProcessor$handleEndJourney$1 = (RealUserJourneySignalProcessor$handleEndJourney$1) continuation;
            int i2 = realUserJourneySignalProcessor$handleEndJourney$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realUserJourneySignalProcessor$handleEndJourney$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealUserJourneySignalProcessor$handleEndJourney$1 realUserJourneySignalProcessor$handleEndJourney$12 = realUserJourneySignalProcessor$handleEndJourney$1;
                Object obj = realUserJourneySignalProcessor$handleEndJourney$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserJourneySignalProcessor$handleEndJourney$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.d(CameraSelector$$ExternalSyntheticOutline0.m("Handle end journey: journey=", userJourney$Name.getLabel(), " outcome=", userJourney$Outcome.getClass().getSimpleName()), new Object[0]);
                    RealUserJourneyRepository realUserJourneyRepository = realUserJourneySignalProcessor.userJourneyRepository;
                    JourneySelector$$ExternalSyntheticLambda0 journeySelector$$ExternalSyntheticLambda0 = new JourneySelector$$ExternalSyntheticLambda0(userJourney$Name, 0);
                    realUserJourneySignalProcessor$handleEndJourney$12.L$1 = userJourney$Outcome;
                    realUserJourneySignalProcessor$handleEndJourney$12.J$0 = j;
                    realUserJourneySignalProcessor$handleEndJourney$12.label = 1;
                    obj = realUserJourneyRepository.removeJourneys(journeySelector$$ExternalSyntheticLambda0, realUserJourneySignalProcessor$handleEndJourney$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = realUserJourneySignalProcessor$handleEndJourney$12.J$0;
                    userJourney$Outcome = realUserJourneySignalProcessor$handleEndJourney$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                UserJourney$Outcome userJourney$Outcome2 = userJourney$Outcome;
                userJourney = (UserJourney) CollectionsKt.singleOrNull((Iterable) obj);
                if (userJourney != null) {
                    return Unit.INSTANCE;
                }
                realUserJourneySignalProcessor$handleEndJourney$12.L$1 = null;
                realUserJourneySignalProcessor$handleEndJourney$12.J$0 = j;
                realUserJourneySignalProcessor$handleEndJourney$12.label = 2;
            }
        }
        realUserJourneySignalProcessor$handleEndJourney$1 = new RealUserJourneySignalProcessor$handleEndJourney$1(realUserJourneySignalProcessor, continuation);
        RealUserJourneySignalProcessor$handleEndJourney$1 realUserJourneySignalProcessor$handleEndJourney$122 = realUserJourneySignalProcessor$handleEndJourney$1;
        Object obj3 = realUserJourneySignalProcessor$handleEndJourney$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneySignalProcessor$handleEndJourney$122.label;
        if (i != 0) {
        }
        UserJourney$Outcome userJourney$Outcome22 = userJourney$Outcome;
        userJourney = (UserJourney) CollectionsKt.singleOrNull((Iterable) obj3);
        if (userJourney != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5 A[LOOP:0: B:11:0x00df->B:13:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleRetryCompletedJourneys(RealUserJourneySignalProcessor realUserJourneySignalProcessor, Set set, ContinuationImpl continuationImpl) {
        RealUserJourneySignalProcessor$handleRetryCompletedJourneys$1 realUserJourneySignalProcessor$handleRetryCompletedJourneys$1;
        int i;
        LinkedHashMap linkedHashMap;
        Iterator it;
        if (continuationImpl instanceof RealUserJourneySignalProcessor$handleRetryCompletedJourneys$1) {
            realUserJourneySignalProcessor$handleRetryCompletedJourneys$1 = (RealUserJourneySignalProcessor$handleRetryCompletedJourneys$1) continuationImpl;
            int i2 = realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.label;
                int i3 = 10;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    long millis = realUserJourneySignalProcessor.clock.millis();
                    Duration.Companion companion = Duration.Companion;
                    long m4167getInWholeMillisecondsimpl = millis - Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(30, DurationUnit.DAYS));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : set) {
                        if (((CompletedJourney) obj2).getJourney().getCreatedAtEpoch() >= m4167getInWholeMillisecondsimpl) {
                            arrayList.add(obj2);
                        }
                    }
                    List take = CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new LinkedHashTreeMap.AnonymousClass1(14)), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
                    for (Object obj3 : take) {
                        linkedHashMap2.put(((CompletedJourney) obj3).getJourney().getId(), obj3);
                    }
                    RealUserJourneyRepository realUserJourneyRepository = realUserJourneySignalProcessor.userJourneyRepository;
                    AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3 = new AlertBannerKt$$ExternalSyntheticLambda3(linkedHashMap2, i3);
                    realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.L$1 = linkedHashMap2;
                    realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.label = 1;
                    if (realUserJourneyRepository.removeCompletedUserJourney(alertBannerKt$$ExternalSyntheticLambda3, realUserJourneySignalProcessor$handleRetryCompletedJourneys$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    linkedHashMap = linkedHashMap2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                Timber.Forest forest = Timber.Forest;
                Collection values = linkedHashMap.values();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
                it = values.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CompletedJourney) it.next()).getJourney().getName().getLabel());
                }
                forest.d("Retrying previously completed journeys: " + arrayList2, new Object[0]);
                realUserJourneySignalProcessor.sendOrLogError(realUserJourneySignalProcessor.journeysToUpload, new JourneysToUpload(CollectionsKt.toList(linkedHashMap.values()), true));
                return Unit.INSTANCE;
            }
        }
        realUserJourneySignalProcessor$handleRetryCompletedJourneys$1 = new RealUserJourneySignalProcessor$handleRetryCompletedJourneys$1(realUserJourneySignalProcessor, continuationImpl);
        Object obj4 = realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneySignalProcessor$handleRetryCompletedJourneys$1.label;
        int i32 = 10;
        if (i != 0) {
        }
        Timber.Forest forest2 = Timber.Forest;
        Collection values2 = linkedHashMap.values();
        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values2, 10));
        it = values2.iterator();
        while (it.hasNext()) {
        }
        forest2.d("Retrying previously completed journeys: " + arrayList22, new Object[0]);
        realUserJourneySignalProcessor.sendOrLogError(realUserJourneySignalProcessor.journeysToUpload, new JourneysToUpload(CollectionsKt.toList(linkedHashMap.values()), true));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r2 == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if (r2 == r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleStartJourney(RealUserJourneySignalProcessor realUserJourneySignalProcessor, Signal.Start start, Continuation continuation) {
        RealUserJourneySignalProcessor$handleStartJourney$1 realUserJourneySignalProcessor$handleStartJourney$1;
        int i;
        Signal.Start start2;
        Iterator it;
        RealUserJourneySignalProcessor$handleStartJourney$1 realUserJourneySignalProcessor$handleStartJourney$12;
        UserJourney userJourney;
        UserJourney userJourney2;
        Signal.Start start3 = start;
        RealUserJourneyRepository realUserJourneyRepository = realUserJourneySignalProcessor.userJourneyRepository;
        if (continuation instanceof RealUserJourneySignalProcessor$handleStartJourney$1) {
            realUserJourneySignalProcessor$handleStartJourney$1 = (RealUserJourneySignalProcessor$handleStartJourney$1) continuation;
            int i2 = realUserJourneySignalProcessor$handleStartJourney$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realUserJourneySignalProcessor$handleStartJourney$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realUserJourneySignalProcessor$handleStartJourney$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserJourneySignalProcessor$handleStartJourney$1.label;
                int i3 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest forest = Timber.Forest;
                    UserJourney$Name userJourney$Name = start3.journeyName;
                    boolean z = start3.isSubJourney;
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Handle start journey: journey=", userJourney$Name.getLabel(), " timeout=", Duration.m4177toStringimpl(start3.timeout), " isSubJourney=");
                    m.append(z);
                    forest.d(m.toString(), new Object[0]);
                    if (z) {
                        JourneySelector$$ExternalSyntheticLambda0 journeySelector$$ExternalSyntheticLambda0 = new JourneySelector$$ExternalSyntheticLambda0(userJourney$Name, 0);
                        realUserJourneySignalProcessor$handleStartJourney$1.L$0 = start3;
                        realUserJourneySignalProcessor$handleStartJourney$1.label = 3;
                        obj = realUserJourneyRepository.journeyExists(journeySelector$$ExternalSyntheticLambda0, realUserJourneySignalProcessor$handleStartJourney$1);
                    } else {
                        JourneySelector$$ExternalSyntheticLambda0 journeySelector$$ExternalSyntheticLambda02 = new JourneySelector$$ExternalSyntheticLambda0(userJourney$Name, 0);
                        realUserJourneySignalProcessor$handleStartJourney$1.L$0 = start3;
                        realUserJourneySignalProcessor$handleStartJourney$1.label = 1;
                        obj = realUserJourneyRepository.removeJourneys(journeySelector$$ExternalSyntheticLambda02, realUserJourneySignalProcessor$handleStartJourney$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    start3 = realUserJourneySignalProcessor$handleStartJourney$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    start2 = start3;
                    it = ((Iterable) obj).iterator();
                    realUserJourneySignalProcessor$handleStartJourney$12 = realUserJourneySignalProcessor$handleStartJourney$1;
                    while (it.hasNext()) {
                    }
                    realUserJourneySignalProcessor$handleStartJourney$1 = realUserJourneySignalProcessor$handleStartJourney$12;
                    start3 = start2;
                    UUID uuid = start3.id;
                    UserJourney$Name userJourney$Name2 = start3.journeyName;
                    long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(start3.createdAtEpoch);
                    long m4167getInWholeMillisecondsimpl2 = Duration.m4167getInWholeMillisecondsimpl(start3.createdAtRealtime);
                    EmptySet emptySet = EmptySet.INSTANCE;
                    userJourney = new UserJourney(uuid, userJourney$Name2, m4167getInWholeMillisecondsimpl, m4167getInWholeMillisecondsimpl2, emptySet, emptySet, emptySet, null, realUserJourneySignalProcessor.journeyRequestContextProvider.generateContext(), start3.isSubJourney);
                    realUserJourneySignalProcessor$handleStartJourney$1.L$0 = start3;
                    realUserJourneySignalProcessor$handleStartJourney$1.L$1 = userJourney;
                    realUserJourneySignalProcessor$handleStartJourney$1.L$2 = null;
                    realUserJourneySignalProcessor$handleStartJourney$1.label = 4;
                    if (realUserJourneyRepository.storeUserJourney(userJourney, realUserJourneySignalProcessor$handleStartJourney$1) != obj2) {
                    }
                    return obj2;
                }
                if (i == 2) {
                    int i4 = realUserJourneySignalProcessor$handleStartJourney$1.I$0;
                    Iterator it2 = realUserJourneySignalProcessor$handleStartJourney$1.L$2;
                    Signal.Start start4 = realUserJourneySignalProcessor$handleStartJourney$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i3 = i4;
                    realUserJourneySignalProcessor$handleStartJourney$12 = realUserJourneySignalProcessor$handleStartJourney$1;
                    it = it2;
                    start2 = start4;
                    while (it.hasNext()) {
                        UserJourney userJourney3 = (UserJourney) it.next();
                        UserJourney$Outcome terminated = new UserJourney$Outcome.Terminated(UserJourney$TerminationReason.JOURNEY_RESTARTED);
                        long j = start2.createdAtRealtime;
                        realUserJourneySignalProcessor$handleStartJourney$12.L$0 = start2;
                        realUserJourneySignalProcessor$handleStartJourney$12.L$1 = null;
                        realUserJourneySignalProcessor$handleStartJourney$12.L$2 = it;
                        realUserJourneySignalProcessor$handleStartJourney$12.I$0 = i3;
                        realUserJourneySignalProcessor$handleStartJourney$12.label = 2;
                        if (realUserJourneySignalProcessor.m3786terminateJourney1Y68eR8(userJourney3, terminated, j, false, realUserJourneySignalProcessor$handleStartJourney$12) == obj2) {
                            break;
                        }
                    }
                    realUserJourneySignalProcessor$handleStartJourney$1 = realUserJourneySignalProcessor$handleStartJourney$12;
                    start3 = start2;
                    UUID uuid2 = start3.id;
                    UserJourney$Name userJourney$Name22 = start3.journeyName;
                    long m4167getInWholeMillisecondsimpl3 = Duration.m4167getInWholeMillisecondsimpl(start3.createdAtEpoch);
                    long m4167getInWholeMillisecondsimpl22 = Duration.m4167getInWholeMillisecondsimpl(start3.createdAtRealtime);
                    EmptySet emptySet2 = EmptySet.INSTANCE;
                    userJourney = new UserJourney(uuid2, userJourney$Name22, m4167getInWholeMillisecondsimpl3, m4167getInWholeMillisecondsimpl22, emptySet2, emptySet2, emptySet2, null, realUserJourneySignalProcessor.journeyRequestContextProvider.generateContext(), start3.isSubJourney);
                    realUserJourneySignalProcessor$handleStartJourney$1.L$0 = start3;
                    realUserJourneySignalProcessor$handleStartJourney$1.L$1 = userJourney;
                    realUserJourneySignalProcessor$handleStartJourney$1.L$2 = null;
                    realUserJourneySignalProcessor$handleStartJourney$1.label = 4;
                    if (realUserJourneyRepository.storeUserJourney(userJourney, realUserJourneySignalProcessor$handleStartJourney$1) != obj2) {
                    }
                    return obj2;
                }
                if (i == 3) {
                    start3 = realUserJourneySignalProcessor$handleStartJourney$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Timber.Forest.d("Journey already exists with the same name, skipping sub-journey start.", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    UUID uuid22 = start3.id;
                    UserJourney$Name userJourney$Name222 = start3.journeyName;
                    long m4167getInWholeMillisecondsimpl32 = Duration.m4167getInWholeMillisecondsimpl(start3.createdAtEpoch);
                    long m4167getInWholeMillisecondsimpl222 = Duration.m4167getInWholeMillisecondsimpl(start3.createdAtRealtime);
                    EmptySet emptySet22 = EmptySet.INSTANCE;
                    userJourney = new UserJourney(uuid22, userJourney$Name222, m4167getInWholeMillisecondsimpl32, m4167getInWholeMillisecondsimpl222, emptySet22, emptySet22, emptySet22, null, realUserJourneySignalProcessor.journeyRequestContextProvider.generateContext(), start3.isSubJourney);
                    realUserJourneySignalProcessor$handleStartJourney$1.L$0 = start3;
                    realUserJourneySignalProcessor$handleStartJourney$1.L$1 = userJourney;
                    realUserJourneySignalProcessor$handleStartJourney$1.L$2 = null;
                    realUserJourneySignalProcessor$handleStartJourney$1.label = 4;
                    if (realUserJourneyRepository.storeUserJourney(userJourney, realUserJourneySignalProcessor$handleStartJourney$1) != obj2) {
                        userJourney2 = userJourney;
                    }
                    return obj2;
                }
                if (i != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                userJourney2 = realUserJourneySignalProcessor$handleStartJourney$1.L$1;
                start3 = realUserJourneySignalProcessor$handleStartJourney$1.L$0;
                SafeTrace.throwOnFailure(obj);
                UserJourney$Name name = userJourney2.getName();
                userJourney2.getId().toString().getClass();
                Duration.m4167getInWholeMillisecondsimpl(start3.timeout);
                name.getClass();
                return Unit.INSTANCE;
            }
        }
        realUserJourneySignalProcessor$handleStartJourney$1 = new RealUserJourneySignalProcessor$handleStartJourney$1(realUserJourneySignalProcessor, continuation);
        Object obj3 = realUserJourneySignalProcessor$handleStartJourney$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneySignalProcessor$handleStartJourney$1.label;
        int i32 = 0;
        if (i != 0) {
        }
        UserJourney$Name name2 = userJourney2.getName();
        userJourney2.getId().toString().getClass();
        Duration.m4167getInWholeMillisecondsimpl(start3.timeout);
        name2.getClass();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c5 -> B:10:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleTerminateStaleJourneys(RealUserJourneySignalProcessor realUserJourneySignalProcessor, Set set, ContinuationImpl continuationImpl) {
        RealUserJourneySignalProcessor$handleTerminateStaleJourneys$1 realUserJourneySignalProcessor$handleTerminateStaleJourneys$1;
        int i;
        Iterator it;
        RealUserJourneySignalProcessor$handleTerminateStaleJourneys$1 realUserJourneySignalProcessor$handleTerminateStaleJourneys$12;
        int i2;
        if (continuationImpl instanceof RealUserJourneySignalProcessor$handleTerminateStaleJourneys$1) {
            realUserJourneySignalProcessor$handleTerminateStaleJourneys$1 = (RealUserJourneySignalProcessor$handleTerminateStaleJourneys$1) continuationImpl;
            int i3 = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realUserJourneySignalProcessor$handleTerminateStaleJourneys$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest forest = Timber.Forest;
                    int size = set.size();
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((UserJourney) it2.next()).getName().getLabel());
                    }
                    forest.d("Terminating " + size + " journeys: " + arrayList, new Object[0]);
                    it = set2.iterator();
                    realUserJourneySignalProcessor$handleTerminateStaleJourneys$12 = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1.I$0;
                    it = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    RealUserJourneySignalProcessor realUserJourneySignalProcessor2 = realUserJourneySignalProcessor;
                    realUserJourneySignalProcessor$handleTerminateStaleJourneys$12 = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1;
                    realUserJourneySignalProcessor = realUserJourneySignalProcessor2;
                    if (it.hasNext()) {
                        UserJourney userJourney = (UserJourney) it.next();
                        UserJourney$Outcome userJourney$Outcome = realUserJourneySignalProcessor.bugsnagClient.lastRunCrashed() ? UserJourney$Outcome.ProcessCrashed.INSTANCE : UserJourney$Outcome.ProcessKilled.INSTANCE;
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(realUserJourneySignalProcessor.clock.millis() - userJourney.getCreatedAtEpoch(), DurationUnit.MILLISECONDS);
                        realUserJourneySignalProcessor$handleTerminateStaleJourneys$12.L$2 = it;
                        realUserJourneySignalProcessor$handleTerminateStaleJourneys$12.I$0 = i2;
                        realUserJourneySignalProcessor$handleTerminateStaleJourneys$12.label = 1;
                        realUserJourneySignalProcessor2 = realUserJourneySignalProcessor;
                        if (realUserJourneySignalProcessor2.m3786terminateJourney1Y68eR8(userJourney, userJourney$Outcome, duration, true, realUserJourneySignalProcessor$handleTerminateStaleJourneys$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        realUserJourneySignalProcessor = realUserJourneySignalProcessor2;
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        realUserJourneySignalProcessor$handleTerminateStaleJourneys$1 = new RealUserJourneySignalProcessor$handleTerminateStaleJourneys$1(realUserJourneySignalProcessor, continuationImpl);
        Object obj2 = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneySignalProcessor$handleTerminateStaleJourneys$1.label;
        if (i != 0) {
        }
    }

    public final void add(Signal signal) {
        boolean z;
        Timber.Forest.i("Adding user journey signal " + signal, new Object[0]);
        sendOrLogError(this.signalQueue, signal);
        if (signal instanceof Signal.Start) {
            synchronized (this.latestActiveUserJourneys) {
                try {
                    ArrayList arrayList = this.latestActiveUserJourneys;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((ActiveUserJourney) it.next()).name == ((Signal.Start) signal).journeyName) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!((Signal.Start) signal).isSubJourney || !z) {
                        ArrayList arrayList2 = this.latestActiveUserJourneys;
                        final RealUserJourneySignalProcessor$$ExternalSyntheticLambda10 realUserJourneySignalProcessor$$ExternalSyntheticLambda10 = new RealUserJourneySignalProcessor$$ExternalSyntheticLambda10(signal, 0);
                        arrayList2.removeIf(new Predicate() { // from class: com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor$$ExternalSyntheticLambda11
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return ((Boolean) RealUserJourneySignalProcessor$$ExternalSyntheticLambda10.this.invoke(obj)).booleanValue();
                            }
                        });
                        this.latestActiveUserJourneys.add(new ActiveUserJourney(((Signal.Start) signal).journeyName, ((Signal.Start) signal).id, ((Signal.Start) signal).isSubJourney));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            notifyActiveJourneysUpdated(getActiveUserJourneys());
            this.timeoutJobs.put(((Signal.Start) signal).id, JobKt.launch$default(this.scope, null, null, new PreferenceFlow$flow$1(signal, this, null, 15), 3));
        }
        if (signal instanceof Signal.EndJourney) {
            synchronized (this.latestActiveUserJourneys) {
                CollectionsKt__MutableCollectionsKt.removeAll(this.latestActiveUserJourneys, new RealUserJourneySignalProcessor$$ExternalSyntheticLambda10(signal, 1));
            }
            notifyActiveJourneysUpdated(getActiveUserJourneys());
        }
        if (signal instanceof Signal.EndAllSubJourneys) {
            synchronized (this.latestActiveUserJourneys) {
                CollectionsKt__MutableCollectionsKt.removeAll(this.latestActiveUserJourneys, new MainActivity$$ExternalSyntheticLambda5(26));
            }
            notifyActiveJourneysUpdated(getActiveUserJourneys());
        }
    }

    public final List getActiveUserJourneys() {
        List list;
        synchronized (this.latestActiveUserJourneys) {
            list = CollectionsKt.toList(this.latestActiveUserJourneys);
        }
        return list;
    }

    public final void notifyActiveJourneysUpdated(List list) {
        RealObservabilityMetadataLogger realObservabilityMetadataLogger = this.observabilityMetadataLogger;
        RealObservabilityManager realObservabilityManager = realObservabilityMetadataLogger.observabilityManager;
        BugsnagClient bugsnagClient = realObservabilityMetadataLogger.bugsnagClient;
        list.getClass();
        if (!list.isEmpty()) {
            ActiveUserJourney activeUserJourney = (ActiveUserJourney) CollectionsKt.last(list);
            List list2 = list;
            for (Map.Entry entry : MapsKt__MapsKt.mapOf(new Pair(MetadataSection$UserJourneysSection.LatestActiveUserJourneyName.INSTANCE, activeUserJourney.name.getLabel()), new Pair(MetadataSection$UserJourneysSection.LatestActiveUserJourneyId.INSTANCE, activeUserJourney.id.toString()), new Pair(MetadataSection$UserJourneysSection.AllActiveJourneyNames.INSTANCE, CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(24), 31)), new Pair(MetadataSection$UserJourneysSection.AllActiveJourneyIds.INSTANCE, CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(25), 31))).entrySet()) {
                MetadataKey metadataKey = (MetadataKey) entry.getKey();
                String str = (String) entry.getValue();
                bugsnagClient.addMetadata(MetadataSection$UserJourneysSection.INSTANCE, metadataKey, str);
                realObservabilityManager.addCustomAttributeToRumMonitoring(CollectionsKt__CollectionsJVMKt.listOf(new Pair(metadataKey, str)));
            }
            return;
        }
        for (MetadataKey metadataKey2 : CollectionsKt__CollectionsKt.listOf((Object[]) new MetadataKey[]{MetadataSection$UserJourneysSection.LatestActiveUserJourneyName.INSTANCE, MetadataSection$UserJourneysSection.LatestActiveUserJourneyId.INSTANCE, MetadataSection$UserJourneysSection.AllActiveJourneyNames.INSTANCE, MetadataSection$UserJourneysSection.AllActiveJourneyIds.INSTANCE})) {
            bugsnagClient.clearMetadata(MetadataSection$UserJourneysSection.INSTANCE, metadataKey2);
            MetadataKey[] metadataKeyArr = {metadataKey2};
            RealDatadogClient realDatadogClient = realObservabilityManager.datadogClient;
            MetadataKey[] metadataKeyArr2 = (MetadataKey[]) Arrays.copyOf(metadataKeyArr, metadataKeyArr.length);
            if (metadataKeyArr2.length != 0) {
                RumMonitor rumMonitor = (RumMonitor) realDatadogClient.rumMonitor.invoke();
                for (MetadataKey metadataKey3 : metadataKeyArr2) {
                    if (!(metadataKey3 instanceof MetadataSection$ReservedRumKey)) {
                        rumMonitor.removeAttribute(metadataKey3.getDatadogName());
                    }
                }
            }
        }
    }

    public final void sendOrLogError(BufferedChannel bufferedChannel, Object obj) {
        Object mo1159trySendJP2dKIU = bufferedChannel.mo1159trySendJP2dKIU(obj);
        String simpleName = obj.getClass().getSimpleName();
        boolean z = mo1159trySendJP2dKIU instanceof ChannelResult.Closed;
        ErrorReporter errorReporter = this.errorReporter;
        if (z) {
            errorReporter.report(new UserJourneyProcessingError.UserJourneyProcessingChannelClosed(simpleName), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        } else if (mo1159trySendJP2dKIU instanceof ChannelResult.Failed) {
            errorReporter.report(new UserJourneyProcessingError.UserJourneyProcessingChannelFailed(simpleName, ChannelResult.m4190exceptionOrNullimpl(mo1159trySendJP2dKIU)), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: terminateJourney-1Y68eR8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3786terminateJourney1Y68eR8(UserJourney userJourney, UserJourney$Outcome userJourney$Outcome, long j, boolean z, ContinuationImpl continuationImpl) {
        RealUserJourneySignalProcessor$terminateJourney$1 realUserJourneySignalProcessor$terminateJourney$1;
        int i;
        JourneyTerminationReason journeyTerminationReason;
        Pair pair;
        String str;
        UserJourney copy$default;
        CompletedJourney completedJourney;
        UserJourney userJourney2;
        UserJourney$Outcome userJourney$Outcome2 = userJourney$Outcome;
        if (continuationImpl instanceof RealUserJourneySignalProcessor$terminateJourney$1) {
            realUserJourneySignalProcessor$terminateJourney$1 = (RealUserJourneySignalProcessor$terminateJourney$1) continuationImpl;
            int i2 = realUserJourneySignalProcessor$terminateJourney$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realUserJourneySignalProcessor$terminateJourney$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realUserJourneySignalProcessor$terminateJourney$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserJourneySignalProcessor$terminateJourney$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job = (Job) this.timeoutJobs.remove(userJourney.getId());
                    if (job != null) {
                        job.cancel(null);
                    }
                    userJourney$Outcome2.getClass();
                    if (userJourney$Outcome2.equals(UserJourney$Outcome.Failed.INSTANCE)) {
                        pair = new Pair(JourneyOutcome.JOURNEY_OUTCOME_FAILED, null);
                    } else if (userJourney$Outcome2.equals(UserJourney$Outcome.Succeeded.INSTANCE)) {
                        pair = new Pair(JourneyOutcome.JOURNEY_OUTCOME_SUCCEEDED, null);
                    } else if (userJourney$Outcome2.equals(UserJourney$Outcome.UserCanceled.INSTANCE)) {
                        pair = new Pair(JourneyOutcome.JOURNEY_OUTCOME_USER_CANCELED, null);
                    } else if (userJourney$Outcome2.equals(UserJourney$Outcome.ProcessCrashed.INSTANCE)) {
                        pair = new Pair(JourneyOutcome.JOURNEY_OUTCOME_PROCESS_CRASHED, null);
                    } else if (userJourney$Outcome2.equals(UserJourney$Outcome.ProcessKilled.INSTANCE)) {
                        pair = new Pair(JourneyOutcome.JOURNEY_OUTCOME_PROCESS_KILLED, null);
                    } else {
                        if (!(userJourney$Outcome2 instanceof UserJourney$Outcome.Terminated)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JourneyOutcome journeyOutcome = JourneyOutcome.JOURNEY_OUTCOME_TERMINATED;
                        int ordinal = ((UserJourney$Outcome.Terminated) userJourney$Outcome2).getReason().ordinal();
                        if (ordinal == 0) {
                            journeyTerminationReason = JourneyTerminationReason.JOURNEY_TERMINATION_REASON_TIMEOUT_WITH_ACTIVE_USER;
                        } else if (ordinal == 1) {
                            journeyTerminationReason = JourneyTerminationReason.JOURNEY_TERMINATION_REASON_TIMEOUT_WITH_IDLE_USER;
                        } else if (ordinal == 2) {
                            journeyTerminationReason = JourneyTerminationReason.JOURNEY_TERMINATION_REASON_JOURNEY_RESTARTED;
                        } else {
                            if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            journeyTerminationReason = JourneyTerminationReason.JOURNEY_TERMINATION_REASON_MISSING_BLOCKER_FLOW_OUTCOME;
                        }
                        pair = new Pair(journeyOutcome, journeyTerminationReason);
                    }
                    TerminationContext terminationContext = new TerminationContext((JourneyOutcome) pair.first, (JourneyTerminationReason) pair.second, Duration.m4167getInWholeMillisecondsimpl(j) - userJourney.getCreatedAtRealtime());
                    if (userJourney.getContext().getAppToken() == null || userJourney.getContext().getEntityId() == null) {
                        JourneyContext generateContext = this.journeyRequestContextProvider.generateContext();
                        JourneyContext context = userJourney.getContext();
                        String appToken = userJourney.getContext().getAppToken();
                        if (appToken == null) {
                            appToken = generateContext.getAppToken();
                        }
                        String str2 = appToken;
                        String entityId = userJourney.getContext().getEntityId();
                        if (entityId == null) {
                            str = !z ? generateContext.getEntityId() : null;
                        } else {
                            str = entityId;
                        }
                        copy$default = UserJourney.copy$default(userJourney, null, null, 0L, 0L, null, null, null, null, JourneyContext.copy$default(context, str, null, str2, null, null, null, null, null, null, 506, null), false, 767, null);
                    } else {
                        copy$default = userJourney;
                    }
                    completedJourney = new CompletedJourney(copy$default, terminationContext);
                    RealUserJourneyRepository realUserJourneyRepository = this.userJourneyRepository;
                    realUserJourneySignalProcessor$terminateJourney$1.L$0 = userJourney;
                    realUserJourneySignalProcessor$terminateJourney$1.L$1 = userJourney$Outcome2;
                    realUserJourneySignalProcessor$terminateJourney$1.L$5 = completedJourney;
                    realUserJourneySignalProcessor$terminateJourney$1.label = 1;
                    if (realUserJourneyRepository.storeCompletedUserJourney(completedJourney, realUserJourneySignalProcessor$terminateJourney$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userJourney2 = userJourney;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CompletedJourney completedJourney2 = realUserJourneySignalProcessor$terminateJourney$1.L$5;
                    UserJourney$Outcome userJourney$Outcome3 = realUserJourneySignalProcessor$terminateJourney$1.L$1;
                    userJourney2 = realUserJourneySignalProcessor$terminateJourney$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    completedJourney = completedJourney2;
                    userJourney$Outcome2 = userJourney$Outcome3;
                }
                sendOrLogError(this.journeysToUpload, new JourneysToUpload(CollectionsKt__CollectionsJVMKt.listOf(completedJourney), false));
                synchronized (this.latestActiveUserJourneys) {
                    CollectionsKt__MutableCollectionsKt.removeAll(this.latestActiveUserJourneys, new Perfs$$ExternalSyntheticLambda2(userJourney2, 2));
                }
                userJourney2.getName().getClass();
                userJourney$Outcome2.getClass();
                notifyActiveJourneysUpdated(this.latestActiveUserJourneys);
                return Unit.INSTANCE;
            }
        }
        realUserJourneySignalProcessor$terminateJourney$1 = new RealUserJourneySignalProcessor$terminateJourney$1(this, continuationImpl);
        Object obj2 = realUserJourneySignalProcessor$terminateJourney$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneySignalProcessor$terminateJourney$1.label;
        if (i != 0) {
        }
        sendOrLogError(this.journeysToUpload, new JourneysToUpload(CollectionsKt__CollectionsJVMKt.listOf(completedJourney), false));
        synchronized (this.latestActiveUserJourneys) {
        }
    }
}
