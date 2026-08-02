package com.squareup.util.android;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.network.ClientSyncApiResult;
import com.squareup.cash.clientsync.network.ClientSyncApiResultKt$retryWhenRetryable$1;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public abstract class StringsKt {
    public static ViewEvent.Fid fromJsonObject(JsonObject jsonObject) {
        try {
            long asLong = jsonObject.get("duration").getAsLong();
            long asLong2 = jsonObject.get("timestamp").getAsLong();
            JsonElement jsonElement = jsonObject.get("target_selector");
            return new ViewEvent.Fid(asLong, asLong2, jsonElement != null ? jsonElement.getAsString() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fid", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fid", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Fid", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ca -> B:17:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d3 -> B:18:0x00d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retryWhenRetryable(int i, SyncRangeQueries$$ExternalSyntheticLambda1 syncRangeQueries$$ExternalSyntheticLambda1, RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1, ContinuationImpl continuationImpl) {
        ClientSyncApiResultKt$retryWhenRetryable$1 clientSyncApiResultKt$retryWhenRetryable$1;
        int i2;
        Function1 function1;
        int i3;
        ClientSyncApiResultKt$retryWhenRetryable$1 clientSyncApiResultKt$retryWhenRetryable$12;
        int i4;
        int i5;
        SyncRangeQueries$$ExternalSyntheticLambda1 syncRangeQueries$$ExternalSyntheticLambda12;
        SyncRangeQueries$$ExternalSyntheticLambda1 syncRangeQueries$$ExternalSyntheticLambda13;
        Function1 function12;
        int i6;
        int i7;
        int i8;
        int i9;
        ClientSyncApiResult clientSyncApiResult;
        if (continuationImpl instanceof ClientSyncApiResultKt$retryWhenRetryable$1) {
            clientSyncApiResultKt$retryWhenRetryable$1 = (ClientSyncApiResultKt$retryWhenRetryable$1) continuationImpl;
            int i10 = clientSyncApiResultKt$retryWhenRetryable$1.label;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                clientSyncApiResultKt$retryWhenRetryable$1.label = i10 - PKIFailureInfo.systemUnavail;
                Object obj = clientSyncApiResultKt$retryWhenRetryable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = clientSyncApiResultKt$retryWhenRetryable$1.label;
                int i11 = 0;
                int i12 = 1;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function1 = anonymousClass1;
                    i3 = i - 1;
                    clientSyncApiResultKt$retryWhenRetryable$12 = clientSyncApiResultKt$retryWhenRetryable$1;
                    i4 = 0;
                    i5 = i;
                    syncRangeQueries$$ExternalSyntheticLambda12 = syncRangeQueries$$ExternalSyntheticLambda1;
                    if (i4 >= i3) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i9 = clientSyncApiResultKt$retryWhenRetryable$1.I$2;
                    i3 = clientSyncApiResultKt$retryWhenRetryable$1.I$1;
                    int i13 = clientSyncApiResultKt$retryWhenRetryable$1.I$0;
                    Function1 function13 = clientSyncApiResultKt$retryWhenRetryable$1.L$1;
                    ?? r12 = clientSyncApiResultKt$retryWhenRetryable$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    int i14 = 1;
                    SyncRangeQueries$$ExternalSyntheticLambda1 syncRangeQueries$$ExternalSyntheticLambda14 = r12;
                    i5 = i13;
                    function12 = function13;
                    clientSyncApiResultKt$retryWhenRetryable$12 = clientSyncApiResultKt$retryWhenRetryable$1;
                    syncRangeQueries$$ExternalSyntheticLambda12 = syncRangeQueries$$ExternalSyntheticLambda14;
                    i4 = i9 + 1;
                    function1 = function12;
                    i12 = i14;
                    i11 = 0;
                    if (i4 >= i3) {
                        clientSyncApiResultKt$retryWhenRetryable$12.L$0 = syncRangeQueries$$ExternalSyntheticLambda12;
                        clientSyncApiResultKt$retryWhenRetryable$12.L$1 = function1;
                        clientSyncApiResultKt$retryWhenRetryable$12.I$0 = i5;
                        clientSyncApiResultKt$retryWhenRetryable$12.I$1 = i3;
                        clientSyncApiResultKt$retryWhenRetryable$12.I$2 = i4;
                        clientSyncApiResultKt$retryWhenRetryable$12.I$3 = i4;
                        clientSyncApiResultKt$retryWhenRetryable$12.I$4 = i11;
                        clientSyncApiResultKt$retryWhenRetryable$12.label = i12;
                        Object invoke = function1.invoke(clientSyncApiResultKt$retryWhenRetryable$12);
                        if (invoke != coroutineSingletons) {
                            i6 = i5;
                            obj = invoke;
                            syncRangeQueries$$ExternalSyntheticLambda13 = syncRangeQueries$$ExternalSyntheticLambda12;
                            function12 = function1;
                            clientSyncApiResultKt$retryWhenRetryable$1 = clientSyncApiResultKt$retryWhenRetryable$12;
                            i9 = i4;
                            i7 = i3;
                            i8 = i11;
                            clientSyncApiResult = (ClientSyncApiResult) obj;
                            if (clientSyncApiResult instanceof ClientSyncApiResult.Success) {
                                return clientSyncApiResult;
                            }
                            if (!(clientSyncApiResult instanceof ClientSyncApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (!((ClientSyncApiResult.Failure) clientSyncApiResult).isRetryable) {
                                return clientSyncApiResult;
                            }
                            Duration duration = (Duration) syncRangeQueries$$ExternalSyntheticLambda13.invoke(new Integer(i4));
                            i14 = i12;
                            if (duration != null) {
                                long j = duration.rawValue;
                                clientSyncApiResultKt$retryWhenRetryable$1.L$0 = syncRangeQueries$$ExternalSyntheticLambda13;
                                clientSyncApiResultKt$retryWhenRetryable$1.L$1 = function12;
                                clientSyncApiResultKt$retryWhenRetryable$1.I$0 = i6;
                                clientSyncApiResultKt$retryWhenRetryable$1.I$1 = i7;
                                clientSyncApiResultKt$retryWhenRetryable$1.I$2 = i9;
                                clientSyncApiResultKt$retryWhenRetryable$1.I$3 = i4;
                                clientSyncApiResultKt$retryWhenRetryable$1.I$4 = i8;
                                clientSyncApiResultKt$retryWhenRetryable$1.label = 2;
                                if (JobKt.m4182delayVtjQ1oo(j, clientSyncApiResultKt$retryWhenRetryable$1) != coroutineSingletons) {
                                    i3 = i7;
                                    i13 = i6;
                                    function13 = function12;
                                    syncRangeQueries$$ExternalSyntheticLambda14 = syncRangeQueries$$ExternalSyntheticLambda13;
                                    i5 = i13;
                                    function12 = function13;
                                    clientSyncApiResultKt$retryWhenRetryable$12 = clientSyncApiResultKt$retryWhenRetryable$1;
                                    syncRangeQueries$$ExternalSyntheticLambda12 = syncRangeQueries$$ExternalSyntheticLambda14;
                                    i4 = i9 + 1;
                                    function1 = function12;
                                    i12 = i14;
                                    i11 = 0;
                                    if (i4 >= i3) {
                                        clientSyncApiResultKt$retryWhenRetryable$12.L$0 = null;
                                        clientSyncApiResultKt$retryWhenRetryable$12.L$1 = null;
                                        clientSyncApiResultKt$retryWhenRetryable$12.I$0 = i5;
                                        clientSyncApiResultKt$retryWhenRetryable$12.label = 3;
                                        Object invoke2 = function1.invoke(clientSyncApiResultKt$retryWhenRetryable$12);
                                        if (invoke2 != coroutineSingletons) {
                                            return invoke2;
                                        }
                                    }
                                }
                            } else {
                                i3 = i7;
                                i5 = i6;
                                clientSyncApiResultKt$retryWhenRetryable$12 = clientSyncApiResultKt$retryWhenRetryable$1;
                                syncRangeQueries$$ExternalSyntheticLambda12 = syncRangeQueries$$ExternalSyntheticLambda13;
                                i4 = i9 + 1;
                                function1 = function12;
                                i12 = i14;
                                i11 = 0;
                                if (i4 >= i3) {
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                int i15 = clientSyncApiResultKt$retryWhenRetryable$1.I$4;
                int i16 = clientSyncApiResultKt$retryWhenRetryable$1.I$3;
                int i17 = clientSyncApiResultKt$retryWhenRetryable$1.I$2;
                int i18 = clientSyncApiResultKt$retryWhenRetryable$1.I$1;
                i6 = clientSyncApiResultKt$retryWhenRetryable$1.I$0;
                function12 = clientSyncApiResultKt$retryWhenRetryable$1.L$1;
                ?? r14 = clientSyncApiResultKt$retryWhenRetryable$1.L$0;
                SafeTrace.throwOnFailure(obj);
                i8 = i15;
                i9 = i17;
                i7 = i18;
                i4 = i16;
                syncRangeQueries$$ExternalSyntheticLambda13 = r14;
                clientSyncApiResult = (ClientSyncApiResult) obj;
                if (clientSyncApiResult instanceof ClientSyncApiResult.Success) {
                }
            }
        }
        clientSyncApiResultKt$retryWhenRetryable$1 = new ClientSyncApiResultKt$retryWhenRetryable$1(continuationImpl);
        Object obj2 = clientSyncApiResultKt$retryWhenRetryable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = clientSyncApiResultKt$retryWhenRetryable$1.label;
        int i112 = 0;
        int i122 = 1;
        if (i2 != 0) {
        }
    }

    public static final Integer safeParseColor(String str, Function1 function1) {
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            try {
                return Integer.valueOf(strictParseColor(str));
            } catch (IllegalArgumentException e) {
                if (function1 != null) {
                    function1.invoke(new IllegalArgumentException(Recorder$$ExternalSyntheticOutline2.m("Unknown color: ", str), e));
                }
            }
        }
        return null;
    }

    public static final int strictParseColor(String str) {
        str.getClass();
        if (str.charAt(0) != '#') {
            a$$ExternalSyntheticBUOutline0.m$3("Unknown color");
            return 0;
        }
        long parseLong = Long.parseLong(str.substring(1), CharsKt.checkRadix(16));
        if (str.length() == 7) {
            parseLong |= 4278190080L;
        } else if (str.length() != 9) {
            a$$ExternalSyntheticBUOutline0.m$3("Unknown color");
            return 0;
        }
        return (int) parseLong;
    }
}
