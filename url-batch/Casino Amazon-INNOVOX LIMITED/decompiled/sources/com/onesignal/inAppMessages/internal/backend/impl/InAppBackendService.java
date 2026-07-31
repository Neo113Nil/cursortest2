package com.onesignal.inAppMessages.internal.backend.impl;

import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.InAppMessagePage;
import com.onesignal.inAppMessages.internal.backend.GetIAMDataResponse;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.hydrators.InAppHydrator;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InAppBackendService.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ>\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0002\u0010\u0016J8\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010\u001fJ \u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010#J$\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010&\u001a\u00020'H\u0002J<\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@¢\u0006\u0002\u0010*JX\u0010+\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010.J\"\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u00104\u001a\u0002002\u0006\u00101\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000fH\u0002JB\u00105\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u000f2\u0006\u00107\u001a\u000208H\u0096@¢\u0006\u0002\u00109J0\u0010:\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010;J:\u0010<\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010=\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010>R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/onesignal/inAppMessages/internal/backend/impl/InAppBackendService;", "Lcom/onesignal/inAppMessages/internal/backend/IInAppBackendService;", "_httpClient", "Lcom/onesignal/core/internal/http/IHttpClient;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "_hydrator", "Lcom/onesignal/inAppMessages/internal/hydrators/InAppHydrator;", "(Lcom/onesignal/core/internal/http/IHttpClient;Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/inAppMessages/internal/hydrators/InAppHydrator;)V", "htmlNetworkRequestAttemptCount", "", "attemptFetchWithRetries", "", "Lcom/onesignal/inAppMessages/internal/InAppMessage;", "baseUrl", "", "rywData", "Lcom/onesignal/common/consistency/RywData;", "sessionDurationProvider", "Lkotlin/Function0;", "", "jwt", "(Ljava/lang/String;Lcom/onesignal/common/consistency/RywData;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchInAppMessagesWithoutRywToken", ImagesContract.URL, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIAMData", "Lcom/onesignal/inAppMessages/internal/backend/GetIAMDataResponse;", "appId", "messageId", "variantId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIAMPreviewData", "Lcom/onesignal/inAppMessages/internal/InAppMessageContent;", "previewUUID", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "htmlPathForMessage", "hydrateInAppMessages", "jsonResponse", "Lorg/json/JSONObject;", "listInAppMessages", "subscriptionId", "(Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/common/consistency/RywData;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listInAppMessagesIv", "aliasLabel", "aliasValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/common/consistency/RywData;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "printHttpErrorForInAppMessageRequest", "", "requestType", "statusCode", "response", "printHttpSuccessForInAppMessageRequest", "sendIAMClick", "clickId", "isFirstClick", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendIAMImpression", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendIAMPageImpression", InAppMessagePage.PAGE_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppBackendService implements IInAppBackendService {
    private final IDeviceService _deviceService;
    private final IHttpClient _httpClient;
    private final InAppHydrator _hydrator;
    private int htmlNetworkRequestAttemptCount;

    public InAppBackendService(IHttpClient _httpClient, IDeviceService _deviceService, InAppHydrator _hydrator) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_hydrator, "_hydrator");
        this._httpClient = _httpClient;
        this._deviceService = _deviceService;
        this._hydrator = _hydrator;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(String str, String str2, RywData rywData, Function0<Long> function0, Continuation<? super List<InAppMessage>> continuation) {
        InAppBackendService$listInAppMessages$1 inAppBackendService$listInAppMessages$1;
        int i;
        InAppBackendService inAppBackendService;
        if (continuation instanceof InAppBackendService$listInAppMessages$1) {
            inAppBackendService$listInAppMessages$1 = (InAppBackendService$listInAppMessages$1) continuation;
            if ((inAppBackendService$listInAppMessages$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$listInAppMessages$1.label -= Integer.MIN_VALUE;
                InAppBackendService$listInAppMessages$1 inAppBackendService$listInAppMessages$12 = inAppBackendService$listInAppMessages$1;
                Object obj = inAppBackendService$listInAppMessages$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$listInAppMessages$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Long rywDelay = rywData.getRywDelay();
                    long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                    inAppBackendService$listInAppMessages$12.L$0 = this;
                    inAppBackendService$listInAppMessages$12.L$1 = str;
                    inAppBackendService$listInAppMessages$12.L$2 = str2;
                    inAppBackendService$listInAppMessages$12.L$3 = rywData;
                    inAppBackendService$listInAppMessages$12.L$4 = function0;
                    inAppBackendService$listInAppMessages$12.label = 1;
                    if (DelayKt.delay(longValue, inAppBackendService$listInAppMessages$12) != coroutine_suspended) {
                        inAppBackendService = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                function0 = (Function0) inAppBackendService$listInAppMessages$12.L$4;
                rywData = (RywData) inAppBackendService$listInAppMessages$12.L$3;
                str2 = (String) inAppBackendService$listInAppMessages$12.L$2;
                str = (String) inAppBackendService$listInAppMessages$12.L$1;
                inAppBackendService = (InAppBackendService) inAppBackendService$listInAppMessages$12.L$0;
                ResultKt.throwOnFailure(obj);
                RywData rywData2 = rywData;
                Function0<Long> function02 = function0;
                inAppBackendService$listInAppMessages$12.L$0 = null;
                inAppBackendService$listInAppMessages$12.L$1 = null;
                inAppBackendService$listInAppMessages$12.L$2 = null;
                inAppBackendService$listInAppMessages$12.L$3 = null;
                inAppBackendService$listInAppMessages$12.L$4 = null;
                inAppBackendService$listInAppMessages$12.label = 2;
                Object attemptFetchWithRetries = inAppBackendService.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", rywData2, function02, null, inAppBackendService$listInAppMessages$12);
                return attemptFetchWithRetries != coroutine_suspended ? coroutine_suspended : attemptFetchWithRetries;
            }
        }
        inAppBackendService$listInAppMessages$1 = new InAppBackendService$listInAppMessages$1(this, continuation);
        InAppBackendService$listInAppMessages$1 inAppBackendService$listInAppMessages$122 = inAppBackendService$listInAppMessages$1;
        Object obj2 = inAppBackendService$listInAppMessages$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$listInAppMessages$122.label;
        if (i != 0) {
        }
        RywData rywData22 = rywData;
        Function0<Long> function022 = function0;
        inAppBackendService$listInAppMessages$122.L$0 = null;
        inAppBackendService$listInAppMessages$122.L$1 = null;
        inAppBackendService$listInAppMessages$122.L$2 = null;
        inAppBackendService$listInAppMessages$122.L$3 = null;
        inAppBackendService$listInAppMessages$122.L$4 = null;
        inAppBackendService$listInAppMessages$122.label = 2;
        Object attemptFetchWithRetries2 = inAppBackendService.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", rywData22, function022, null, inAppBackendService$listInAppMessages$122);
        if (attemptFetchWithRetries2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessagesIv(String str, String str2, String str3, String str4, RywData rywData, Function0<Long> function0, String str5, Continuation<? super List<InAppMessage>> continuation) {
        InAppBackendService$listInAppMessagesIv$1 inAppBackendService$listInAppMessagesIv$1;
        int i;
        String str6;
        InAppBackendService inAppBackendService;
        if (continuation instanceof InAppBackendService$listInAppMessagesIv$1) {
            inAppBackendService$listInAppMessagesIv$1 = (InAppBackendService$listInAppMessagesIv$1) continuation;
            if ((inAppBackendService$listInAppMessagesIv$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$listInAppMessagesIv$1.label -= Integer.MIN_VALUE;
                Object obj = inAppBackendService$listInAppMessagesIv$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$listInAppMessagesIv$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str7 = "apps/" + str + "/users/by/" + str2 + IOUtils.DIR_SEPARATOR_UNIX + str3 + "/subscriptions/" + str4 + "/iams";
                    if (rywData == null) {
                        inAppBackendService$listInAppMessagesIv$1.label = 1;
                        Object fetchInAppMessagesWithoutRywToken = fetchInAppMessagesWithoutRywToken(str7, function0, str5, inAppBackendService$listInAppMessagesIv$1);
                        if (fetchInAppMessagesWithoutRywToken != coroutine_suspended) {
                            return fetchInAppMessagesWithoutRywToken;
                        }
                    } else {
                        Long rywDelay = rywData.getRywDelay();
                        long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                        inAppBackendService$listInAppMessagesIv$1.L$0 = this;
                        inAppBackendService$listInAppMessagesIv$1.L$1 = rywData;
                        inAppBackendService$listInAppMessagesIv$1.L$2 = function0;
                        inAppBackendService$listInAppMessagesIv$1.L$3 = str5;
                        inAppBackendService$listInAppMessagesIv$1.L$4 = str7;
                        inAppBackendService$listInAppMessagesIv$1.label = 2;
                        if (DelayKt.delay(longValue, inAppBackendService$listInAppMessagesIv$1) != coroutine_suspended) {
                            str6 = str7;
                            inAppBackendService = this;
                        }
                    }
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                String str8 = (String) inAppBackendService$listInAppMessagesIv$1.L$4;
                str5 = (String) inAppBackendService$listInAppMessagesIv$1.L$3;
                function0 = (Function0) inAppBackendService$listInAppMessagesIv$1.L$2;
                rywData = (RywData) inAppBackendService$listInAppMessagesIv$1.L$1;
                InAppBackendService inAppBackendService2 = (InAppBackendService) inAppBackendService$listInAppMessagesIv$1.L$0;
                ResultKt.throwOnFailure(obj);
                str6 = str8;
                inAppBackendService = inAppBackendService2;
                RywData rywData2 = rywData;
                Function0<Long> function02 = function0;
                String str9 = str5;
                inAppBackendService$listInAppMessagesIv$1.L$0 = null;
                inAppBackendService$listInAppMessagesIv$1.L$1 = null;
                inAppBackendService$listInAppMessagesIv$1.L$2 = null;
                inAppBackendService$listInAppMessagesIv$1.L$3 = null;
                inAppBackendService$listInAppMessagesIv$1.L$4 = null;
                inAppBackendService$listInAppMessagesIv$1.label = 3;
                Object attemptFetchWithRetries = inAppBackendService.attemptFetchWithRetries(str6, rywData2, function02, str9, inAppBackendService$listInAppMessagesIv$1);
                return attemptFetchWithRetries != coroutine_suspended ? coroutine_suspended : attemptFetchWithRetries;
            }
        }
        inAppBackendService$listInAppMessagesIv$1 = new InAppBackendService$listInAppMessagesIv$1(this, continuation);
        Object obj2 = inAppBackendService$listInAppMessagesIv$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$listInAppMessagesIv$1.label;
        if (i != 0) {
        }
        RywData rywData22 = rywData;
        Function0<Long> function022 = function0;
        String str92 = str5;
        inAppBackendService$listInAppMessagesIv$1.L$0 = null;
        inAppBackendService$listInAppMessagesIv$1.L$1 = null;
        inAppBackendService$listInAppMessagesIv$1.L$2 = null;
        inAppBackendService$listInAppMessagesIv$1.L$3 = null;
        inAppBackendService$listInAppMessagesIv$1.L$4 = null;
        inAppBackendService$listInAppMessagesIv$1.label = 3;
        Object attemptFetchWithRetries2 = inAppBackendService.attemptFetchWithRetries(str6, rywData22, function022, str92, inAppBackendService$listInAppMessagesIv$1);
        if (attemptFetchWithRetries2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMData(String str, String str2, String str3, Continuation<? super GetIAMDataResponse> continuation) {
        InAppBackendService$getIAMData$1 inAppBackendService$getIAMData$1;
        int i;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (continuation instanceof InAppBackendService$getIAMData$1) {
            inAppBackendService$getIAMData$1 = (InAppBackendService$getIAMData$1) continuation;
            if ((inAppBackendService$getIAMData$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$getIAMData$1.label -= Integer.MIN_VALUE;
                InAppBackendService$getIAMData$1 inAppBackendService$getIAMData$12 = inAppBackendService$getIAMData$1;
                Object obj = inAppBackendService$getIAMData$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$getIAMData$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String htmlPathForMessage = htmlPathForMessage(str2, str3, str);
                    if (htmlPathForMessage == null) {
                        return new GetIAMDataResponse(null, false);
                    }
                    IHttpClient iHttpClient = this._httpClient;
                    inAppBackendService$getIAMData$12.L$0 = this;
                    inAppBackendService$getIAMData$12.label = 1;
                    obj = IHttpClient.DefaultImpls.get$default(iHttpClient, htmlPathForMessage, null, inAppBackendService$getIAMData$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inAppBackendService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$getIAMData$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (!httpResponse.isSuccess()) {
                    inAppBackendService.htmlNetworkRequestAttemptCount = 0;
                    String payload = httpResponse.getPayload();
                    Intrinsics.checkNotNull(payload);
                    return new GetIAMDataResponse(inAppBackendService._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
                }
                inAppBackendService.printHttpErrorForInAppMessageRequest(InAppMessageContent.HTML, httpResponse.getStatusCode(), httpResponse.getPayload());
                if (NetworkUtils.INSTANCE.getResponseStatusType(httpResponse.getStatusCode()) != NetworkUtils.ResponseStatusType.RETRYABLE || inAppBackendService.htmlNetworkRequestAttemptCount >= NetworkUtils.INSTANCE.getMaxNetworkRequestAttemptCount()) {
                    inAppBackendService.htmlNetworkRequestAttemptCount = 0;
                    return new GetIAMDataResponse(null, false);
                }
                inAppBackendService.htmlNetworkRequestAttemptCount++;
                return new GetIAMDataResponse(null, true);
            }
        }
        inAppBackendService$getIAMData$1 = new InAppBackendService$getIAMData$1(this, continuation);
        InAppBackendService$getIAMData$1 inAppBackendService$getIAMData$122 = inAppBackendService$getIAMData$1;
        Object obj2 = inAppBackendService$getIAMData$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$getIAMData$122.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (!httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMPreviewData(String str, String str2, Continuation<? super InAppMessageContent> continuation) {
        InAppBackendService$getIAMPreviewData$1 inAppBackendService$getIAMPreviewData$1;
        int i;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (continuation instanceof InAppBackendService$getIAMPreviewData$1) {
            inAppBackendService$getIAMPreviewData$1 = (InAppBackendService$getIAMPreviewData$1) continuation;
            if ((inAppBackendService$getIAMPreviewData$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$getIAMPreviewData$1.label -= Integer.MIN_VALUE;
                InAppBackendService$getIAMPreviewData$1 inAppBackendService$getIAMPreviewData$12 = inAppBackendService$getIAMPreviewData$1;
                Object obj = inAppBackendService$getIAMPreviewData$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$getIAMPreviewData$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IHttpClient iHttpClient = this._httpClient;
                    inAppBackendService$getIAMPreviewData$12.L$0 = this;
                    inAppBackendService$getIAMPreviewData$12.label = 1;
                    obj = IHttpClient.DefaultImpls.get$default(iHttpClient, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, inAppBackendService$getIAMPreviewData$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inAppBackendService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$getIAMPreviewData$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (!httpResponse.isSuccess()) {
                    String payload = httpResponse.getPayload();
                    Intrinsics.checkNotNull(payload);
                    return inAppBackendService._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
                }
                inAppBackendService.printHttpErrorForInAppMessageRequest(InAppMessageContent.HTML, httpResponse.getStatusCode(), httpResponse.getPayload());
                return null;
            }
        }
        inAppBackendService$getIAMPreviewData$1 = new InAppBackendService$getIAMPreviewData$1(this, continuation);
        InAppBackendService$getIAMPreviewData$1 inAppBackendService$getIAMPreviewData$122 = inAppBackendService$getIAMPreviewData$1;
        Object obj2 = inAppBackendService$getIAMPreviewData$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$getIAMPreviewData$122.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (!httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMClick(final String str, final String str2, final String str3, String str4, final String str5, final boolean z, Continuation<? super Unit> continuation) {
        InAppBackendService$sendIAMClick$1 inAppBackendService$sendIAMClick$1;
        int i;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (continuation instanceof InAppBackendService$sendIAMClick$1) {
            inAppBackendService$sendIAMClick$1 = (InAppBackendService$sendIAMClick$1) continuation;
            if ((inAppBackendService$sendIAMClick$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$sendIAMClick$1.label -= Integer.MIN_VALUE;
                InAppBackendService$sendIAMClick$1 inAppBackendService$sendIAMClick$12 = inAppBackendService$sendIAMClick$1;
                Object obj = inAppBackendService$sendIAMClick$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$sendIAMClick$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = new JSONObject(str, this, str2, str5, str3, z) { // from class: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMClick$json$1
                        {
                            IDeviceService iDeviceService;
                            put(CommonUrlParts.APP_ID, str);
                            iDeviceService = this._deviceService;
                            put(CommonUrlParts.DEVICE_TYPE, iDeviceService.getDeviceType().getValue());
                            put("player_id", str2);
                            put("click_id", str5);
                            put("variant_id", str3);
                            if (z) {
                                put("first_click", true);
                            }
                        }
                    };
                    inAppBackendService$sendIAMClick$12.L$0 = this;
                    inAppBackendService$sendIAMClick$12.label = 1;
                    obj = IHttpClient.DefaultImpls.post$default(this._httpClient, "in_app_messages/" + str4 + "/click", jSONObject, null, inAppBackendService$sendIAMClick$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inAppBackendService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$sendIAMClick$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (!httpResponse.isSuccess()) {
                    String payload = httpResponse.getPayload();
                    Intrinsics.checkNotNull(payload);
                    inAppBackendService.printHttpSuccessForInAppMessageRequest("engagement", payload);
                    return Unit.INSTANCE;
                }
                inAppBackendService.printHttpErrorForInAppMessageRequest("engagement", httpResponse.getStatusCode(), httpResponse.getPayload());
                throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
            }
        }
        inAppBackendService$sendIAMClick$1 = new InAppBackendService$sendIAMClick$1(this, continuation);
        InAppBackendService$sendIAMClick$1 inAppBackendService$sendIAMClick$122 = inAppBackendService$sendIAMClick$1;
        Object obj2 = inAppBackendService$sendIAMClick$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$sendIAMClick$122.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (!httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMPageImpression(final String str, final String str2, final String str3, String str4, final String str5, Continuation<? super Unit> continuation) {
        InAppBackendService$sendIAMPageImpression$1 inAppBackendService$sendIAMPageImpression$1;
        int i;
        Object post$default;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (continuation instanceof InAppBackendService$sendIAMPageImpression$1) {
            inAppBackendService$sendIAMPageImpression$1 = (InAppBackendService$sendIAMPageImpression$1) continuation;
            if ((inAppBackendService$sendIAMPageImpression$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$sendIAMPageImpression$1.label -= Integer.MIN_VALUE;
                InAppBackendService$sendIAMPageImpression$1 inAppBackendService$sendIAMPageImpression$12 = inAppBackendService$sendIAMPageImpression$1;
                Object obj = inAppBackendService$sendIAMPageImpression$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$sendIAMPageImpression$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = new JSONObject(str, str2, str3, this, str5) { // from class: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMPageImpression$json$1
                        {
                            IDeviceService iDeviceService;
                            put(CommonUrlParts.APP_ID, str);
                            put("player_id", str2);
                            put("variant_id", str3);
                            iDeviceService = this._deviceService;
                            put(CommonUrlParts.DEVICE_TYPE, iDeviceService.getDeviceType().getValue());
                            put("page_id", str5);
                        }
                    };
                    inAppBackendService$sendIAMPageImpression$12.L$0 = this;
                    inAppBackendService$sendIAMPageImpression$12.label = 1;
                    post$default = IHttpClient.DefaultImpls.post$default(this._httpClient, "in_app_messages/" + str4 + "/pageImpression", jSONObject, null, inAppBackendService$sendIAMPageImpression$12, 4, null);
                    if (post$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inAppBackendService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InAppBackendService inAppBackendService2 = (InAppBackendService) inAppBackendService$sendIAMPageImpression$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    inAppBackendService = inAppBackendService2;
                    post$default = obj;
                }
                httpResponse = (HttpResponse) post$default;
                if (!httpResponse.isSuccess()) {
                    String payload = httpResponse.getPayload();
                    Intrinsics.checkNotNull(payload);
                    inAppBackendService.printHttpSuccessForInAppMessageRequest("page impression", payload);
                    return Unit.INSTANCE;
                }
                inAppBackendService.printHttpErrorForInAppMessageRequest("page impression", httpResponse.getStatusCode(), httpResponse.getPayload());
                throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
            }
        }
        inAppBackendService$sendIAMPageImpression$1 = new InAppBackendService$sendIAMPageImpression$1(this, continuation);
        InAppBackendService$sendIAMPageImpression$1 inAppBackendService$sendIAMPageImpression$122 = inAppBackendService$sendIAMPageImpression$1;
        Object obj2 = inAppBackendService$sendIAMPageImpression$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$sendIAMPageImpression$122.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) post$default;
        if (!httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMImpression(final String str, final String str2, final String str3, String str4, Continuation<? super Unit> continuation) {
        InAppBackendService$sendIAMImpression$1 inAppBackendService$sendIAMImpression$1;
        int i;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (continuation instanceof InAppBackendService$sendIAMImpression$1) {
            inAppBackendService$sendIAMImpression$1 = (InAppBackendService$sendIAMImpression$1) continuation;
            if ((inAppBackendService$sendIAMImpression$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$sendIAMImpression$1.label -= Integer.MIN_VALUE;
                InAppBackendService$sendIAMImpression$1 inAppBackendService$sendIAMImpression$12 = inAppBackendService$sendIAMImpression$1;
                Object obj = inAppBackendService$sendIAMImpression$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$sendIAMImpression$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = new JSONObject(str, str2, str3, this) { // from class: com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService$sendIAMImpression$json$1
                        {
                            IDeviceService iDeviceService;
                            put(CommonUrlParts.APP_ID, str);
                            put("player_id", str2);
                            put("variant_id", str3);
                            iDeviceService = this._deviceService;
                            put(CommonUrlParts.DEVICE_TYPE, iDeviceService.getDeviceType().getValue());
                            put("first_impression", true);
                        }
                    };
                    inAppBackendService$sendIAMImpression$12.L$0 = this;
                    inAppBackendService$sendIAMImpression$12.label = 1;
                    obj = IHttpClient.DefaultImpls.post$default(this._httpClient, "in_app_messages/" + str4 + "/impression", jSONObject, null, inAppBackendService$sendIAMImpression$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inAppBackendService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$sendIAMImpression$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (!httpResponse.isSuccess()) {
                    String payload = httpResponse.getPayload();
                    Intrinsics.checkNotNull(payload);
                    inAppBackendService.printHttpSuccessForInAppMessageRequest("impression", payload);
                    return Unit.INSTANCE;
                }
                inAppBackendService.printHttpErrorForInAppMessageRequest("impression", httpResponse.getStatusCode(), httpResponse.getPayload());
                throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
            }
        }
        inAppBackendService$sendIAMImpression$1 = new InAppBackendService$sendIAMImpression$1(this, continuation);
        InAppBackendService$sendIAMImpression$1 inAppBackendService$sendIAMImpression$122 = inAppBackendService$sendIAMImpression$1;
        Object obj2 = inAppBackendService$sendIAMImpression$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$sendIAMImpression$122.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (!httpResponse.isSuccess()) {
        }
    }

    private final String htmlPathForMessage(String messageId, String variantId, String appId) {
        if (variantId == null) {
            Logging.error$default("Unable to find a variant for in-app message " + messageId, null, 2, null);
            return null;
        }
        return "in_app_messages/" + messageId + "/variants/" + variantId + "/html?app_id=" + appId;
    }

    private final void printHttpSuccessForInAppMessageRequest(String requestType, String response) {
        Logging.debug$default("Successful post for in-app message " + requestType + " request: " + response, null, 2, null);
    }

    private final void printHttpErrorForInAppMessageRequest(String requestType, int statusCode, String response) {
        Logging.info$default("Encountered a " + statusCode + " error while attempting in-app message " + requestType + " request: " + response, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r1) == r3) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x016c -> B:17:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x017e -> B:17:0x016f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptFetchWithRetries(String str, RywData rywData, Function0<Long> function0, String str2, Continuation<? super List<InAppMessage>> continuation) {
        InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$1;
        InAppBackendService inAppBackendService;
        int i;
        Function0<Long> function02;
        String str3;
        int i2;
        int i3;
        InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$12;
        InAppBackendService inAppBackendService2;
        String str4;
        RywData rywData2;
        JSONObject jSONObject;
        InAppBackendService inAppBackendService3;
        String str5;
        RywData rywData3;
        Function0<Long> function03;
        String str6;
        int i4;
        int i5;
        HttpResponse httpResponse;
        Object obj;
        if (continuation instanceof InAppBackendService$attemptFetchWithRetries$1) {
            inAppBackendService$attemptFetchWithRetries$1 = (InAppBackendService$attemptFetchWithRetries$1) continuation;
            if ((inAppBackendService$attemptFetchWithRetries$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$attemptFetchWithRetries$1.label -= Integer.MIN_VALUE;
                inAppBackendService = this;
                Object obj2 = inAppBackendService$attemptFetchWithRetries$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$attemptFetchWithRetries$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    function02 = function0;
                    str3 = str2;
                    i2 = 0;
                    i3 = 0;
                    inAppBackendService$attemptFetchWithRetries$12 = inAppBackendService$attemptFetchWithRetries$1;
                    inAppBackendService2 = inAppBackendService;
                    str4 = str;
                    rywData2 = rywData;
                    int i6 = i3;
                    int i7 = i2;
                    InAppBackendService inAppBackendService4 = inAppBackendService2;
                    InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$13 = inAppBackendService$attemptFetchWithRetries$12;
                    jSONObject = null;
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, rywData2.getRywToken(), i2 <= 0 ? Boxing.boxInt(i2) : null, Boxing.boxLong(function02.invoke().longValue()), str3, 1, null);
                    IHttpClient iHttpClient = inAppBackendService4._httpClient;
                    inAppBackendService$attemptFetchWithRetries$13.L$0 = inAppBackendService4;
                    inAppBackendService$attemptFetchWithRetries$13.L$1 = str4;
                    inAppBackendService$attemptFetchWithRetries$13.L$2 = rywData2;
                    inAppBackendService$attemptFetchWithRetries$13.L$3 = function02;
                    inAppBackendService$attemptFetchWithRetries$13.L$4 = str3;
                    inAppBackendService$attemptFetchWithRetries$13.I$0 = i7;
                    inAppBackendService$attemptFetchWithRetries$13.I$1 = i6;
                    inAppBackendService$attemptFetchWithRetries$13.label = 1;
                    obj = iHttpClient.get(str4, optionalHeaders, inAppBackendService$attemptFetchWithRetries$13);
                    if (obj != coroutine_suspended) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return obj2;
                    }
                    i5 = inAppBackendService$attemptFetchWithRetries$1.I$1;
                    i4 = inAppBackendService$attemptFetchWithRetries$1.I$0;
                    str6 = (String) inAppBackendService$attemptFetchWithRetries$1.L$4;
                    function03 = (Function0) inAppBackendService$attemptFetchWithRetries$1.L$3;
                    rywData3 = (RywData) inAppBackendService$attemptFetchWithRetries$1.L$2;
                    str5 = (String) inAppBackendService$attemptFetchWithRetries$1.L$1;
                    inAppBackendService3 = (InAppBackendService) inAppBackendService$attemptFetchWithRetries$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    char c = 2;
                    jSONObject = null;
                    String str7 = str6;
                    inAppBackendService$attemptFetchWithRetries$12 = inAppBackendService$attemptFetchWithRetries$1;
                    rywData2 = rywData3;
                    inAppBackendService2 = inAppBackendService3;
                    str3 = str7;
                    Function0<Long> function04 = function03;
                    i3 = i5;
                    function02 = function04;
                    i2 = i4 + 1;
                    if (i2 > i3) {
                        str4 = str5;
                        int i62 = i3;
                        int i72 = i2;
                        InAppBackendService inAppBackendService42 = inAppBackendService2;
                        InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$132 = inAppBackendService$attemptFetchWithRetries$12;
                        jSONObject = null;
                        OptionalHeaders optionalHeaders2 = new OptionalHeaders(null, rywData2.getRywToken(), i2 <= 0 ? Boxing.boxInt(i2) : null, Boxing.boxLong(function02.invoke().longValue()), str3, 1, null);
                        IHttpClient iHttpClient2 = inAppBackendService42._httpClient;
                        inAppBackendService$attemptFetchWithRetries$132.L$0 = inAppBackendService42;
                        inAppBackendService$attemptFetchWithRetries$132.L$1 = str4;
                        inAppBackendService$attemptFetchWithRetries$132.L$2 = rywData2;
                        inAppBackendService$attemptFetchWithRetries$132.L$3 = function02;
                        inAppBackendService$attemptFetchWithRetries$132.L$4 = str3;
                        inAppBackendService$attemptFetchWithRetries$132.I$0 = i72;
                        inAppBackendService$attemptFetchWithRetries$132.I$1 = i62;
                        inAppBackendService$attemptFetchWithRetries$132.label = 1;
                        obj = iHttpClient2.get(str4, optionalHeaders2, inAppBackendService$attemptFetchWithRetries$132);
                        if (obj != coroutine_suspended) {
                            str5 = str4;
                            rywData3 = rywData2;
                            function03 = function02;
                            inAppBackendService$attemptFetchWithRetries$1 = inAppBackendService$attemptFetchWithRetries$132;
                            i5 = i62;
                            obj2 = obj;
                            str6 = str3;
                            i4 = i72;
                            inAppBackendService3 = inAppBackendService42;
                            httpResponse = (HttpResponse) obj2;
                            if (httpResponse.isSuccess()) {
                                String payload = httpResponse.getPayload();
                                JSONObject jSONObject2 = payload != null ? new JSONObject(payload) : jSONObject;
                                return jSONObject2 != null ? inAppBackendService3.hydrateInAppMessages(jSONObject2) : jSONObject;
                            }
                            if (httpResponse.getStatusCode() == 425 || httpResponse.getStatusCode() == 429) {
                                Integer retryLimit = httpResponse.getRetryLimit();
                                if (retryLimit != null) {
                                    i5 = retryLimit.intValue();
                                }
                                if (httpResponse.getRetryAfterSeconds() != null) {
                                    long intValue = r0.intValue() * 1000;
                                    inAppBackendService$attemptFetchWithRetries$1.L$0 = inAppBackendService3;
                                    inAppBackendService$attemptFetchWithRetries$1.L$1 = str5;
                                    inAppBackendService$attemptFetchWithRetries$1.L$2 = rywData3;
                                    inAppBackendService$attemptFetchWithRetries$1.L$3 = function03;
                                    inAppBackendService$attemptFetchWithRetries$1.L$4 = str6;
                                    inAppBackendService$attemptFetchWithRetries$1.I$0 = i4;
                                    inAppBackendService$attemptFetchWithRetries$1.I$1 = i5;
                                    c = 2;
                                    inAppBackendService$attemptFetchWithRetries$1.label = 2;
                                } else {
                                    c = 2;
                                }
                                String str72 = str6;
                                inAppBackendService$attemptFetchWithRetries$12 = inAppBackendService$attemptFetchWithRetries$1;
                                rywData2 = rywData3;
                                inAppBackendService2 = inAppBackendService3;
                                str3 = str72;
                                Function0<Long> function042 = function03;
                                i3 = i5;
                                function02 = function042;
                                i2 = i4 + 1;
                                if (i2 > i3) {
                                }
                            } else {
                                if (NetworkUtils.INSTANCE.getResponseStatusType(httpResponse.getStatusCode()) == NetworkUtils.ResponseStatusType.UNAUTHORIZED) {
                                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                                }
                                httpResponse.getStatusCode();
                                return jSONObject;
                            }
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    inAppBackendService$attemptFetchWithRetries$12.L$0 = jSONObject3;
                    inAppBackendService$attemptFetchWithRetries$12.L$1 = jSONObject3;
                    inAppBackendService$attemptFetchWithRetries$12.L$2 = jSONObject3;
                    inAppBackendService$attemptFetchWithRetries$12.L$3 = jSONObject3;
                    inAppBackendService$attemptFetchWithRetries$12.L$4 = jSONObject3;
                    inAppBackendService$attemptFetchWithRetries$12.label = 3;
                    Object fetchInAppMessagesWithoutRywToken = inAppBackendService2.fetchInAppMessagesWithoutRywToken(str5, function02, str3, inAppBackendService$attemptFetchWithRetries$12);
                    return fetchInAppMessagesWithoutRywToken == coroutine_suspended ? coroutine_suspended : fetchInAppMessagesWithoutRywToken;
                }
                i5 = inAppBackendService$attemptFetchWithRetries$1.I$1;
                i4 = inAppBackendService$attemptFetchWithRetries$1.I$0;
                str6 = (String) inAppBackendService$attemptFetchWithRetries$1.L$4;
                function03 = (Function0) inAppBackendService$attemptFetchWithRetries$1.L$3;
                rywData3 = (RywData) inAppBackendService$attemptFetchWithRetries$1.L$2;
                str5 = (String) inAppBackendService$attemptFetchWithRetries$1.L$1;
                inAppBackendService3 = (InAppBackendService) inAppBackendService$attemptFetchWithRetries$1.L$0;
                ResultKt.throwOnFailure(obj2);
                jSONObject = null;
                httpResponse = (HttpResponse) obj2;
                if (httpResponse.isSuccess()) {
                }
            }
        }
        inAppBackendService = this;
        inAppBackendService$attemptFetchWithRetries$1 = new InAppBackendService$attemptFetchWithRetries$1(inAppBackendService, continuation);
        Object obj22 = inAppBackendService$attemptFetchWithRetries$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$attemptFetchWithRetries$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInAppMessagesWithoutRywToken(String str, Function0<Long> function0, String str2, Continuation<? super List<InAppMessage>> continuation) {
        InAppBackendService$fetchInAppMessagesWithoutRywToken$1 inAppBackendService$fetchInAppMessagesWithoutRywToken$1;
        int i;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (continuation instanceof InAppBackendService$fetchInAppMessagesWithoutRywToken$1) {
            inAppBackendService$fetchInAppMessagesWithoutRywToken$1 = (InAppBackendService$fetchInAppMessagesWithoutRywToken$1) continuation;
            if ((inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label & Integer.MIN_VALUE) != 0) {
                inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label -= Integer.MIN_VALUE;
                Object obj = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IHttpClient iHttpClient = this._httpClient;
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, function0.invoke(), str2, 7, null);
                    inAppBackendService$fetchInAppMessagesWithoutRywToken$1.L$0 = this;
                    inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label = 1;
                    obj = iHttpClient.get(str, optionalHeaders, inAppBackendService$fetchInAppMessagesWithoutRywToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    inAppBackendService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$fetchInAppMessagesWithoutRywToken$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (!httpResponse.isSuccess()) {
                    String payload = httpResponse.getPayload();
                    JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                    if (jSONObject != null) {
                        return inAppBackendService.hydrateInAppMessages(jSONObject);
                    }
                    return null;
                }
                if (NetworkUtils.INSTANCE.getResponseStatusType(httpResponse.getStatusCode()) != NetworkUtils.ResponseStatusType.UNAUTHORIZED) {
                    return null;
                }
                throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
            }
        }
        inAppBackendService$fetchInAppMessagesWithoutRywToken$1 = new InAppBackendService$fetchInAppMessagesWithoutRywToken$1(this, continuation);
        Object obj2 = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (!httpResponse.isSuccess()) {
        }
    }

    static /* synthetic */ Object fetchInAppMessagesWithoutRywToken$default(InAppBackendService inAppBackendService, String str, Function0 function0, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return inAppBackendService.fetchInAppMessagesWithoutRywToken(str, function0, str2, continuation);
    }

    private final List<InAppMessage> hydrateInAppMessages(JSONObject jsonResponse) {
        if (!jsonResponse.has("in_app_messages")) {
            return null;
        }
        JSONArray jSONArray = jsonResponse.getJSONArray("in_app_messages");
        InAppHydrator inAppHydrator = this._hydrator;
        Intrinsics.checkNotNull(jSONArray);
        return inAppHydrator.hydrateIAMMessages(jSONArray);
    }
}
