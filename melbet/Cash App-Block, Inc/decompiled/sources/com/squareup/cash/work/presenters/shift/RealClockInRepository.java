package com.squareup.cash.work.presenters.shift;

import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.protos.client.timecards.UpdateTimecardNotesRequest;
import com.squareup.protos.common.Header;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.BatchGetTimecardBreakDefinitionRequest;
import com.squareup.protos.timecards.BatchTimecardBreakDefinitionResponse;
import com.squareup.protos.timecards.StartTimecardBreakRequest;
import com.squareup.protos.timecards.StartTimecardBreakResponse;
import com.squareup.protos.timecards.StartTimecardRequest;
import com.squareup.protos.timecards.StartTimecardResponse;
import com.squareup.protos.timecards.StopTimecardBreakRequest;
import com.squareup.protos.timecards.StopTimecardBreakResponse;
import com.squareup.protos.timecards.StopTimecardRequest;
import com.squareup.protos.timecards.StopTimecardResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.savings.GoalFolder;
import timber.log.Timber;
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class RealClockInRepository {
    public final TimecardsService timecardsService;

    public RealClockInRepository(TimecardsService timecardsService) {
        this.timecardsService = timecardsService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getBreakDefinitions(String str, String str2, ContinuationImpl continuationImpl) {
        RealClockInRepository$getBreakDefinitions$1 realClockInRepository$getBreakDefinitions$1;
        int i;
        if (continuationImpl instanceof RealClockInRepository$getBreakDefinitions$1) {
            realClockInRepository$getBreakDefinitions$1 = (RealClockInRepository$getBreakDefinitions$1) continuationImpl;
            int i2 = realClockInRepository$getBreakDefinitions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClockInRepository$getBreakDefinitions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClockInRepository$getBreakDefinitions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClockInRepository$getBreakDefinitions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    IdValue.Builder builder = new IdValue.Builder(18);
                    builder.local = str;
                    Function1 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, new BatchGetTimecardBreakDefinitionRequest(builder.server, builder.local, builder.buildUnknownFields()), str2, null, 24);
                    realClockInRepository$getBreakDefinitions$1.label = 1;
                    obj = performRequest(sessionWorker$doWork$2$2, realClockInRepository$getBreakDefinitions$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((BatchTimecardBreakDefinitionResponse) obj).timecard_break_definition;
            }
        }
        realClockInRepository$getBreakDefinitions$1 = new RealClockInRepository$getBreakDefinitions$1(this, continuationImpl);
        Object obj3 = realClockInRepository$getBreakDefinitions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClockInRepository$getBreakDefinitions$1.label;
        if (i != 0) {
        }
        return ((BatchTimecardBreakDefinitionResponse) obj3).timecard_break_definition;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performRequest(Function1 function1, ContinuationImpl continuationImpl) {
        RealClockInRepository$performRequest$1 realClockInRepository$performRequest$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealClockInRepository$performRequest$1) {
            realClockInRepository$performRequest$1 = (RealClockInRepository$performRequest$1) continuationImpl;
            int i2 = realClockInRepository$performRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClockInRepository$performRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClockInRepository$performRequest$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClockInRepository$performRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realClockInRepository$performRequest$1.label = 1;
                    obj = function1.invoke(realClockInRepository$performRequest$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return ((ApiResult.Success) apiResult).response;
                }
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest forest = Timber.Forest;
                    Throwable th = ((ApiResult.Failure.NetworkFailure) apiResult).error;
                    forest.d("Request failed due to network error", new Object[0], th);
                    throw th;
                }
                ApiResult.Failure.HttpFailure httpFailure = (ApiResult.Failure.HttpFailure) apiResult;
                int i3 = httpFailure.code;
                if (i3 == 409) {
                    throw ConflictStateException.INSTANCE;
                }
                String str = httpFailure.errorBody;
                String concat = str != null ? ": ".concat(str) : null;
                if (concat == null) {
                    concat = "";
                }
                throw new RepositoryException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Request failed with code ", concat));
            }
        }
        realClockInRepository$performRequest$1 = new RealClockInRepository$performRequest$1(this, continuationImpl);
        Object obj3 = realClockInRepository$performRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClockInRepository$performRequest$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startBreak(String str, String str2, String str3, long j, ContinuationImpl continuationImpl) {
        RealClockInRepository$startBreak$1 realClockInRepository$startBreak$1;
        int i;
        StartTimecardBreakResponse startTimecardBreakResponse;
        if (continuationImpl instanceof RealClockInRepository$startBreak$1) {
            realClockInRepository$startBreak$1 = (RealClockInRepository$startBreak$1) continuationImpl;
            int i2 = realClockInRepository$startBreak$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClockInRepository$startBreak$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClockInRepository$startBreak$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClockInRepository$startBreak$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StartTimecardBreakRequest.Builder builder = new StartTimecardBreakRequest.Builder(0);
                    builder.timecard_token = str;
                    builder.break_definition_token = str3;
                    builder.version_number = new Long(j);
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, new StartTimecardBreakRequest(builder.merchant_token, builder.timecard_token, builder.break_definition_token, builder.version_number, builder.buildUnknownFields()), str2, null, 26);
                    realClockInRepository$startBreak$1.L$4 = this;
                    realClockInRepository$startBreak$1.label = 1;
                    obj = performRequest(sessionWorker$doWork$2$2, realClockInRepository$startBreak$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = realClockInRepository$startBreak$1.L$4;
                    SafeTrace.throwOnFailure(obj);
                }
                this.getClass();
                startTimecardBreakResponse = (StartTimecardBreakResponse) obj;
                startTimecardBreakResponse.getClass();
                if (Intrinsics.areEqual(startTimecardBreakResponse.valid, Boolean.TRUE)) {
                    throw new RepositoryException("clock in action failed with valid = false");
                }
                return Unit.INSTANCE;
            }
        }
        realClockInRepository$startBreak$1 = new RealClockInRepository$startBreak$1(this, continuationImpl);
        Object obj2 = realClockInRepository$startBreak$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClockInRepository$startBreak$1.label;
        if (i != 0) {
        }
        this.getClass();
        startTimecardBreakResponse = (StartTimecardBreakResponse) obj2;
        startTimecardBreakResponse.getClass();
        if (Intrinsics.areEqual(startTimecardBreakResponse.valid, Boolean.TRUE)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startTimecard(String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        RealClockInRepository$startTimecard$1 realClockInRepository$startTimecard$1;
        int i;
        StartTimecardResponse startTimecardResponse;
        RealClockInRepository realClockInRepository = this;
        if (continuationImpl instanceof RealClockInRepository$startTimecard$1) {
            realClockInRepository$startTimecard$1 = (RealClockInRepository$startTimecard$1) continuationImpl;
            int i2 = realClockInRepository$startTimecard$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClockInRepository$startTimecard$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealClockInRepository$startTimecard$1 realClockInRepository$startTimecard$12 = realClockInRepository$startTimecard$1;
                Object obj = realClockInRepository$startTimecard$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClockInRepository$startTimecard$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GoalFolder.Builder builder = new GoalFolder.Builder(10);
                    builder.icon_unicode = str;
                    builder.completion_token = str3;
                    builder.met_goal = Boolean.TRUE;
                    builder.label = str2;
                    builder.goal_amount = str4;
                    builder.goal_progress_percentage = str5;
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(realClockInRepository, new StartTimecardRequest((String) builder.token, (String) builder.icon_unicode, (String) builder.completion_token, (Boolean) builder.met_goal, (String) builder.label, (String) builder.goal_flow_parameters, (String) builder.goal_amount, (String) builder.goal_progress_percentage, builder.buildUnknownFields()), str6, null, 27);
                    realClockInRepository$startTimecard$12.L$7 = realClockInRepository;
                    realClockInRepository$startTimecard$12.label = 1;
                    obj = realClockInRepository.performRequest(sessionWorker$doWork$2$2, realClockInRepository$startTimecard$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realClockInRepository = realClockInRepository$startTimecard$12.L$7;
                    SafeTrace.throwOnFailure(obj);
                }
                realClockInRepository.getClass();
                startTimecardResponse = (StartTimecardResponse) obj;
                startTimecardResponse.getClass();
                if (Intrinsics.areEqual(startTimecardResponse.valid, Boolean.TRUE)) {
                    throw new RepositoryException("clock in action failed with valid = false");
                }
                return Unit.INSTANCE;
            }
        }
        realClockInRepository$startTimecard$1 = new RealClockInRepository$startTimecard$1(realClockInRepository, continuationImpl);
        RealClockInRepository$startTimecard$1 realClockInRepository$startTimecard$122 = realClockInRepository$startTimecard$1;
        Object obj2 = realClockInRepository$startTimecard$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClockInRepository$startTimecard$122.label;
        if (i != 0) {
        }
        realClockInRepository.getClass();
        startTimecardResponse = (StartTimecardResponse) obj2;
        startTimecardResponse.getClass();
        if (Intrinsics.areEqual(startTimecardResponse.valid, Boolean.TRUE)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object stopBreak(String str, String str2, ContinuationImpl continuationImpl) {
        RealClockInRepository$stopBreak$1 realClockInRepository$stopBreak$1;
        int i;
        RealClockInRepository realClockInRepository;
        StopTimecardBreakResponse stopTimecardBreakResponse;
        if (continuationImpl instanceof RealClockInRepository$stopBreak$1) {
            realClockInRepository$stopBreak$1 = (RealClockInRepository$stopBreak$1) continuationImpl;
            int i2 = realClockInRepository$stopBreak$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClockInRepository$stopBreak$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClockInRepository$stopBreak$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClockInRepository$stopBreak$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    IdValue.Builder builder = new IdValue.Builder(21);
                    builder.local = str;
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, new StopTimecardBreakRequest(builder.server, builder.local, builder.buildUnknownFields()), str2, null, 28);
                    realClockInRepository$stopBreak$1.L$3 = this;
                    realClockInRepository$stopBreak$1.label = 1;
                    obj = performRequest(sessionWorker$doWork$2$2, realClockInRepository$stopBreak$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    realClockInRepository = this;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realClockInRepository = realClockInRepository$stopBreak$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                }
                realClockInRepository.getClass();
                stopTimecardBreakResponse = (StopTimecardBreakResponse) obj;
                stopTimecardBreakResponse.getClass();
                if (Intrinsics.areEqual(stopTimecardBreakResponse.valid, Boolean.TRUE)) {
                    throw new RepositoryException("clock in action failed with valid = false");
                }
                return Unit.INSTANCE;
            }
        }
        realClockInRepository$stopBreak$1 = new RealClockInRepository$stopBreak$1(this, continuationImpl);
        Object obj2 = realClockInRepository$stopBreak$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClockInRepository$stopBreak$1.label;
        if (i != 0) {
        }
        realClockInRepository.getClass();
        stopTimecardBreakResponse = (StopTimecardBreakResponse) obj2;
        stopTimecardBreakResponse.getClass();
        if (Intrinsics.areEqual(stopTimecardBreakResponse.valid, Boolean.TRUE)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object stopTimecard(String str, Money money, String str2, ContinuationImpl continuationImpl) {
        RealClockInRepository$stopTimecard$1 realClockInRepository$stopTimecard$1;
        int i;
        StopTimecardResponse stopTimecardResponse;
        if (continuationImpl instanceof RealClockInRepository$stopTimecard$1) {
            realClockInRepository$stopTimecard$1 = (RealClockInRepository$stopTimecard$1) continuationImpl;
            int i2 = realClockInRepository$stopTimecard$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClockInRepository$stopTimecard$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealClockInRepository$stopTimecard$1 realClockInRepository$stopTimecard$12 = realClockInRepository$stopTimecard$1;
                Object obj = realClockInRepository$stopTimecard$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClockInRepository$stopTimecard$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StopTimecardRequest.Builder builder = new StopTimecardRequest.Builder(0);
                    builder.timecard_token = str;
                    builder.should_also_end_breaks = Boolean.FALSE;
                    builder.declared_tip = money;
                    String str3 = builder.merchant_token;
                    String str4 = builder.timecard_token;
                    Continuation continuation = null;
                    Function1 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, new StopTimecardRequest(builder.declared_tip, builder.should_also_end_breaks, str3, str4, builder.initiating_employee_token, builder.clockout_unit_token, builder.fallback_time_zone, builder.buildUnknownFields()), str2, continuation, 29);
                    realClockInRepository$stopTimecard$12.label = 1;
                    obj = performRequest(sessionWorker$doWork$2$2, realClockInRepository$stopTimecard$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                stopTimecardResponse = (StopTimecardResponse) obj;
                stopTimecardResponse.getClass();
                if (Intrinsics.areEqual(stopTimecardResponse.valid, Boolean.TRUE)) {
                    throw new RepositoryException("clock in action failed with valid = false");
                }
                return obj;
            }
        }
        realClockInRepository$stopTimecard$1 = new RealClockInRepository$stopTimecard$1(this, continuationImpl);
        RealClockInRepository$stopTimecard$1 realClockInRepository$stopTimecard$122 = realClockInRepository$stopTimecard$1;
        Object obj3 = realClockInRepository$stopTimecard$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClockInRepository$stopTimecard$122.label;
        if (i != 0) {
        }
        stopTimecardResponse = (StopTimecardResponse) obj3;
        stopTimecardResponse.getClass();
        if (Intrinsics.areEqual(stopTimecardResponse.valid, Boolean.TRUE)) {
        }
    }

    public final Object updateNote(String str, String str2, String str3, SuspendLambda suspendLambda) {
        Header.Builder builder = new Header.Builder(21);
        builder.name = str;
        builder.value = str2;
        Object performRequest = performRequest(new RealClockInRepository$updateNote$2(this, new UpdateTimecardNotesRequest(builder.name, builder.value, builder.buildUnknownFields()), str3, null, 0), suspendLambda);
        return performRequest == CoroutineSingletons.COROUTINE_SUSPENDED ? performRequest : Unit.INSTANCE;
    }
}
