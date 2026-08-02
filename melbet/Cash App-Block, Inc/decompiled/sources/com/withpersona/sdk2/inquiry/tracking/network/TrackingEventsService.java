package com.withpersona.sdk2.inquiry.tracking.network;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.Response;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;", "", "trackingEventsServiceApi", "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;)V", "getPublicKey", "Lkotlin/Result;", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "sessionToken", "", "getPublicKey-gIAlu-s$tracking_events_release", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvents", "", "request", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "sendEvents-0E7RQCE$tracking_events_release", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingEventsService {
    private final TrackingEventsServiceApi trackingEventsServiceApi;

    public TrackingEventsService(TrackingEventsServiceApi trackingEventsServiceApi) {
        trackingEventsServiceApi.getClass();
        this.trackingEventsServiceApi = trackingEventsServiceApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x0040, B:13:0x0048, B:15:0x004e, B:18:0x0051, B:20:0x0060, B:25:0x0035), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x0040, B:13:0x0048, B:15:0x004e, B:18:0x0051, B:20:0x0060, B:25:0x0035), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: getPublicKey-gIAlu-s$tracking_events_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4104getPublicKeygIAlus$tracking_events_release(String str, Continuation<? super Result> continuation) {
        TrackingEventsService$getPublicKey$1 trackingEventsService$getPublicKey$1;
        int i;
        Response response;
        try {
            if (continuation instanceof TrackingEventsService$getPublicKey$1) {
                trackingEventsService$getPublicKey$1 = (TrackingEventsService$getPublicKey$1) continuation;
                int i2 = trackingEventsService$getPublicKey$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsService$getPublicKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsService$getPublicKey$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsService$getPublicKey$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        TrackingEventsServiceApi trackingEventsServiceApi = this.trackingEventsServiceApi;
                        trackingEventsService$getPublicKey$1.label = 1;
                        obj = trackingEventsServiceApi.getPublicKey(str, trackingEventsService$getPublicKey$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    response = (Response) obj;
                    if (response.rawResponse.isSuccessful) {
                        Result.Companion companion = Result.Companion;
                        return new Result.Failure(new Exception("Failed to get public key: " + response.rawResponse.code));
                    }
                    PublicKeyResponse publicKeyResponse = (PublicKeyResponse) response.body;
                    if (publicKeyResponse != null) {
                        Result.Companion companion2 = Result.Companion;
                        return publicKeyResponse;
                    }
                    Result.Companion companion3 = Result.Companion;
                    return new Result.Failure(new Exception("Empty response body from /public-key"));
                }
            }
            if (i != 0) {
            }
            response = (Response) obj;
            if (response.rawResponse.isSuccessful) {
            }
        } catch (Exception e) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(new Exception(Recorder$$ExternalSyntheticOutline2.m("Failed to get public key: ", ExceptionsKt__ExceptionsKt.stackTraceToString(e))));
        }
        trackingEventsService$getPublicKey$1 = new TrackingEventsService$getPublicKey$1(this, continuation);
        Object obj2 = trackingEventsService$getPublicKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsService$getPublicKey$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x0040, B:13:0x0048, B:16:0x004d, B:21:0x0035), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x0040, B:13:0x0048, B:16:0x004d, B:21:0x0035), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: sendEvents-0E7RQCE$tracking_events_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4105sendEvents0E7RQCE$tracking_events_release(String str, EncryptedTrackingEventsRequest encryptedTrackingEventsRequest, Continuation<? super Result> continuation) {
        TrackingEventsService$sendEvents$1 trackingEventsService$sendEvents$1;
        int i;
        Response response;
        try {
            if (continuation instanceof TrackingEventsService$sendEvents$1) {
                trackingEventsService$sendEvents$1 = (TrackingEventsService$sendEvents$1) continuation;
                int i2 = trackingEventsService$sendEvents$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsService$sendEvents$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsService$sendEvents$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsService$sendEvents$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        TrackingEventsServiceApi trackingEventsServiceApi = this.trackingEventsServiceApi;
                        trackingEventsService$sendEvents$1.label = 1;
                        obj = trackingEventsServiceApi.sendEvents(str, encryptedTrackingEventsRequest, trackingEventsService$sendEvents$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    response = (Response) obj;
                    if (!response.rawResponse.isSuccessful) {
                        Result.Companion companion = Result.Companion;
                        return Unit.INSTANCE;
                    }
                    Result.Companion companion2 = Result.Companion;
                    return new Result.Failure(new Exception("Failed to send events: " + response.rawResponse.code));
                }
            }
            if (i != 0) {
            }
            response = (Response) obj;
            if (!response.rawResponse.isSuccessful) {
            }
        } catch (Exception e) {
            Result.Companion companion3 = Result.Companion;
            return new Result.Failure(new Exception(Recorder$$ExternalSyntheticOutline2.m("Failed to send events: ", ExceptionsKt__ExceptionsKt.stackTraceToString(e))));
        }
        trackingEventsService$sendEvents$1 = new TrackingEventsService$sendEvents$1(this, continuation);
        Object obj2 = trackingEventsService$sendEvents$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsService$sendEvents$1.label;
    }
}
