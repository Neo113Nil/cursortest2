package com.squareup.cash.userjourneys.tracker;

import androidx.core.os.BundleKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.RealExponentialBackoff;
import com.squareup.cash.db2.profile.FeatureFlagsQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.userjourneys.data.CompletedJourney;
import com.squareup.cash.userjourneys.notifier.NoOpUserJourneyNotifier;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.protos.cash.blockuserjourneys.api.v1.BlockUserJourneysService;
import com.squareup.protos.cash.blockuserjourneys.api.v1.RecordCompletedJourneyBatchRequest;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.Random;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealUserJourneyReporter implements IoSetupTeardown {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long RETRY_BASE_INTERVAL;
    public static final long RETRY_MAX_INTERVAL;
    public final BlockUserJourneysService service;
    public final RealUserJourneyRepository userJourneyRepository;
    public final UserJourneySignalProcessor userJourneySignalProcessor;

    static {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        RETRY_BASE_INTERVAL = DurationKt.toDuration(2, durationUnit);
        RETRY_MAX_INTERVAL = DurationKt.toDuration(60, durationUnit);
    }

    public RealUserJourneyReporter(BlockUserJourneysService blockUserJourneysService, NoOpUserJourneyNotifier noOpUserJourneyNotifier, RealUserJourneyRepository realUserJourneyRepository, UserJourneySignalProcessor userJourneySignalProcessor) {
        this.service = blockUserJourneysService;
        this.userJourneyRepository = realUserJourneyRepository;
        this.userJourneySignalProcessor = userJourneySignalProcessor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01a9, code lost:
    
        if (doRequest(r9, r7, r1, r3) != r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        if (r20.userJourneyRepository.removeCompletedUserJourney(r1, r3) == r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        if (r12 < 500) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[LOOP:0: B:27:0x00a4->B:29:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.squareup.cash.clientsync.RealExponentialBackoff, com.squareup.cash.userjourneys.tracker.JourneysToUpload, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doRequest(List list, JourneysToUpload journeysToUpload, RealExponentialBackoff realExponentialBackoff, ContinuationImpl continuationImpl) {
        RealUserJourneyReporter$doRequest$1 realUserJourneyReporter$doRequest$1;
        int i;
        JourneysToUpload journeysToUpload2;
        List list2;
        RealExponentialBackoff realExponentialBackoff2;
        ApiResult apiResult;
        Iterator it;
        int i2;
        JourneysToUpload journeysToUpload3;
        long j;
        List list3;
        ?? r2;
        if (continuationImpl instanceof RealUserJourneyReporter$doRequest$1) {
            realUserJourneyReporter$doRequest$1 = (RealUserJourneyReporter$doRequest$1) continuationImpl;
            int i3 = realUserJourneyReporter$doRequest$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realUserJourneyReporter$doRequest$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realUserJourneyReporter$doRequest$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUserJourneyReporter$doRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RecordCompletedJourneyBatchRequest recordCompletedJourneyBatchRequest = new RecordCompletedJourneyBatchRequest(list, ByteString.EMPTY);
                    realUserJourneyReporter$doRequest$1.L$0 = list;
                    journeysToUpload2 = journeysToUpload;
                    realUserJourneyReporter$doRequest$1.L$1 = journeysToUpload2;
                    realUserJourneyReporter$doRequest$1.L$2 = realExponentialBackoff;
                    realUserJourneyReporter$doRequest$1.label = 1;
                    obj = this.service.recordCompletedJourneyBatch(recordCompletedJourneyBatchRequest, realUserJourneyReporter$doRequest$1);
                    if (obj != obj2) {
                        list2 = list;
                        realExponentialBackoff2 = realExponentialBackoff;
                    }
                    return obj2;
                }
                if (i == 1) {
                    realExponentialBackoff2 = realUserJourneyReporter$doRequest$1.L$2;
                    journeysToUpload2 = realUserJourneyReporter$doRequest$1.L$1;
                    list2 = realUserJourneyReporter$doRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        List list4 = realUserJourneyReporter$doRequest$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list5 = realUserJourneyReporter$doRequest$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    j = realUserJourneyReporter$doRequest$1.J$0;
                    realExponentialBackoff2 = realUserJourneyReporter$doRequest$1.L$2;
                    journeysToUpload3 = realUserJourneyReporter$doRequest$1.L$1;
                    list3 = realUserJourneyReporter$doRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    r2 = 0;
                    realUserJourneyReporter$doRequest$1.L$0 = r2;
                    realUserJourneyReporter$doRequest$1.L$1 = r2;
                    realUserJourneyReporter$doRequest$1.L$2 = r2;
                    realUserJourneyReporter$doRequest$1.J$0 = j;
                    realUserJourneyReporter$doRequest$1.label = 4;
                }
                apiResult = (ApiResult) obj;
                List list6 = journeysToUpload2.journeys;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                it = list6.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CompletedJourney) it.next()).getJourney().getId());
                }
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (!journeysToUpload2.isRetry && (i2 = realExponentialBackoff2.attempt) < 4) {
                        ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                        if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                            if (!(failure instanceof ApiResult.Failure.HttpFailure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            int i4 = ((ApiResult.Failure.HttpFailure) failure).code;
                            if (i4 != 408) {
                                if (i4 != 429) {
                                    if (400 <= i4) {
                                    }
                                }
                            }
                        }
                        List list7 = list2;
                        long j2 = realExponentialBackoff2.baseInterval;
                        realExponentialBackoff2.attempt = i2 + 1;
                        long m4174timesUwyO8pc = Duration.m4174timesUwyO8pc(j2, Math.pow(2.0d, i2));
                        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                        double m4175toDoubleimpl = Duration.m4175toDoubleimpl(m4174timesUwyO8pc, durationUnit);
                        double m4175toDoubleimpl2 = Duration.m4175toDoubleimpl(realExponentialBackoff2.maxInterval, durationUnit);
                        if (m4175toDoubleimpl > m4175toDoubleimpl2) {
                            m4175toDoubleimpl = m4175toDoubleimpl2;
                        }
                        ((Random.Default) realExponentialBackoff2.random).getClass();
                        long duration = DurationKt.toDuration((m4175toDoubleimpl / 2.0d) + Random.defaultRandom.nextDouble(0.0d, m4175toDoubleimpl), durationUnit);
                        Timber.Forest.d("Failed to report user journeys: " + arrayList + ". Retrying in " + Duration.m4177toStringimpl(duration), new Object[0]);
                        realUserJourneyReporter$doRequest$1.L$0 = list7;
                        realUserJourneyReporter$doRequest$1.L$1 = journeysToUpload2;
                        realUserJourneyReporter$doRequest$1.L$2 = realExponentialBackoff2;
                        realUserJourneyReporter$doRequest$1.J$0 = duration;
                        realUserJourneyReporter$doRequest$1.label = 3;
                        if (JobKt.m4182delayVtjQ1oo(duration, realUserJourneyReporter$doRequest$1) != obj2) {
                            journeysToUpload3 = journeysToUpload2;
                            j = duration;
                            list3 = list7;
                            r2 = 0;
                            realUserJourneyReporter$doRequest$1.L$0 = r2;
                            realUserJourneyReporter$doRequest$1.L$1 = r2;
                            realUserJourneyReporter$doRequest$1.L$2 = r2;
                            realUserJourneyReporter$doRequest$1.J$0 = j;
                            realUserJourneyReporter$doRequest$1.label = 4;
                        }
                    }
                    Timber.Forest.d("Failed to report user journeys: " + arrayList + ". Not retrying code=" + BundleKt.httpStatusCode((ApiResult.Failure) apiResult), new Object[0]);
                    return Unit.INSTANCE;
                }
                Timber.Forest.d("Successfully reported user journeys: " + arrayList, new Object[0]);
                FeatureFlagsQueries$$ExternalSyntheticLambda0 featureFlagsQueries$$ExternalSyntheticLambda0 = new FeatureFlagsQueries$$ExternalSyntheticLambda0(1, arrayList);
                realUserJourneyReporter$doRequest$1.L$0 = null;
                realUserJourneyReporter$doRequest$1.L$1 = null;
                realUserJourneyReporter$doRequest$1.L$2 = null;
                realUserJourneyReporter$doRequest$1.label = 2;
                return obj2;
            }
        }
        realUserJourneyReporter$doRequest$1 = new RealUserJourneyReporter$doRequest$1(this, continuationImpl);
        Object obj3 = realUserJourneyReporter$doRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUserJourneyReporter$doRequest$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        List list62 = journeysToUpload2.journeys;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list62, 10));
        it = list62.iterator();
        while (it.hasNext()) {
        }
        if (apiResult instanceof ApiResult.Success) {
        }
        return obj22;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1((Continuation) null, this, 13), 1);
        return StateFlowKt.noOpTeardown;
    }
}
