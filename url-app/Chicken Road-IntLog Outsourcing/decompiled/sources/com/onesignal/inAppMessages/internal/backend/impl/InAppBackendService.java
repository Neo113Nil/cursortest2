package com.onesignal.inAppMessages.internal.backend.impl;

import D4.AbstractC0024y;
import b2.AbstractC0279e;
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
import com.onesignal.inAppMessages.internal.backend.GetIAMDataResponse;
import com.onesignal.inAppMessages.internal.backend.IInAppBackendService;
import com.onesignal.inAppMessages.internal.hydrators.InAppHydrator;
import e5.g;
import f4.v;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class InAppBackendService implements IInAppBackendService {
    private final IDeviceService _deviceService;
    private final IHttpClient _httpClient;
    private final InAppHydrator _hydrator;
    private int htmlNetworkRequestAttemptCount;

    public InAppBackendService(IHttpClient _httpClient, IDeviceService _deviceService, InAppHydrator _hydrator) {
        i.e(_httpClient, "_httpClient");
        i.e(_deviceService, "_deviceService");
        i.e(_hydrator, "_hydrator");
        this._httpClient = _httpClient;
        this._deviceService = _deviceService;
        this._hydrator = _hydrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x016a -> B:17:0x016d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0175 -> B:17:0x016d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptFetchWithRetries(String str, RywData rywData, InterfaceC1430a interfaceC1430a, String str2, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$1;
        InAppBackendService inAppBackendService;
        int i2;
        InterfaceC1430a interfaceC1430a2;
        String str3;
        int i3;
        int i6;
        InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$12;
        InAppBackendService inAppBackendService2;
        String str4;
        RywData rywData2;
        InAppBackendService inAppBackendService3;
        String str5;
        RywData rywData3;
        InterfaceC1430a interfaceC1430a3;
        String str6;
        int i7;
        int i8;
        HttpResponse httpResponse;
        Object obj;
        if (interfaceC1218d instanceof InAppBackendService$attemptFetchWithRetries$1) {
            inAppBackendService$attemptFetchWithRetries$1 = (InAppBackendService$attemptFetchWithRetries$1) interfaceC1218d;
            int i9 = inAppBackendService$attemptFetchWithRetries$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$attemptFetchWithRetries$1.label = i9 - Integer.MIN_VALUE;
                inAppBackendService = this;
                Object obj2 = inAppBackendService$attemptFetchWithRetries$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$attemptFetchWithRetries$1.label;
                if (i2 != 0) {
                    g.y(obj2);
                    interfaceC1430a2 = interfaceC1430a;
                    str3 = str2;
                    i3 = 0;
                    i6 = 0;
                    inAppBackendService$attemptFetchWithRetries$12 = inAppBackendService$attemptFetchWithRetries$1;
                    inAppBackendService2 = inAppBackendService;
                    str4 = str;
                    rywData2 = rywData;
                    InAppBackendService inAppBackendService4 = inAppBackendService2;
                    int i10 = i3;
                    InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$13 = inAppBackendService$attemptFetchWithRetries$12;
                    int i11 = i6;
                    String str7 = str3;
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, rywData2.getRywToken(), i6 <= 0 ? new Integer(i6) : null, new Long(((Number) interfaceC1430a2.invoke()).longValue()), str3, 1, null);
                    IHttpClient iHttpClient = inAppBackendService4._httpClient;
                    inAppBackendService$attemptFetchWithRetries$13.L$0 = inAppBackendService4;
                    inAppBackendService$attemptFetchWithRetries$13.L$1 = str4;
                    inAppBackendService$attemptFetchWithRetries$13.L$2 = rywData2;
                    inAppBackendService$attemptFetchWithRetries$13.L$3 = interfaceC1430a2;
                    inAppBackendService$attemptFetchWithRetries$13.L$4 = str7;
                    inAppBackendService$attemptFetchWithRetries$13.I$0 = i11;
                    inAppBackendService$attemptFetchWithRetries$13.I$1 = i10;
                    inAppBackendService$attemptFetchWithRetries$13.label = 1;
                    obj = iHttpClient.get(str4, optionalHeaders, inAppBackendService$attemptFetchWithRetries$13);
                    if (obj != enumC1260a) {
                    }
                } else if (i2 == 1) {
                    i8 = inAppBackendService$attemptFetchWithRetries$1.I$1;
                    i7 = inAppBackendService$attemptFetchWithRetries$1.I$0;
                    str6 = (String) inAppBackendService$attemptFetchWithRetries$1.L$4;
                    interfaceC1430a3 = (InterfaceC1430a) inAppBackendService$attemptFetchWithRetries$1.L$3;
                    rywData3 = (RywData) inAppBackendService$attemptFetchWithRetries$1.L$2;
                    str5 = (String) inAppBackendService$attemptFetchWithRetries$1.L$1;
                    inAppBackendService3 = (InAppBackendService) inAppBackendService$attemptFetchWithRetries$1.L$0;
                    g.y(obj2);
                    httpResponse = (HttpResponse) obj2;
                    if (httpResponse.isSuccess()) {
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            g.y(obj2);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8 = inAppBackendService$attemptFetchWithRetries$1.I$1;
                    i7 = inAppBackendService$attemptFetchWithRetries$1.I$0;
                    str6 = (String) inAppBackendService$attemptFetchWithRetries$1.L$4;
                    interfaceC1430a3 = (InterfaceC1430a) inAppBackendService$attemptFetchWithRetries$1.L$3;
                    rywData3 = (RywData) inAppBackendService$attemptFetchWithRetries$1.L$2;
                    str5 = (String) inAppBackendService$attemptFetchWithRetries$1.L$1;
                    inAppBackendService3 = (InAppBackendService) inAppBackendService$attemptFetchWithRetries$1.L$0;
                    g.y(obj2);
                    char c2 = 2;
                    InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$14 = inAppBackendService$attemptFetchWithRetries$1;
                    str3 = str6;
                    rywData2 = rywData3;
                    i3 = i8;
                    interfaceC1430a2 = interfaceC1430a3;
                    inAppBackendService2 = inAppBackendService3;
                    i6 = i7 + 1;
                    if (i6 <= i3) {
                        inAppBackendService$attemptFetchWithRetries$14.L$0 = null;
                        inAppBackendService$attemptFetchWithRetries$14.L$1 = null;
                        inAppBackendService$attemptFetchWithRetries$14.L$2 = null;
                        inAppBackendService$attemptFetchWithRetries$14.L$3 = null;
                        inAppBackendService$attemptFetchWithRetries$14.L$4 = null;
                        inAppBackendService$attemptFetchWithRetries$14.label = 3;
                        obj2 = inAppBackendService2.fetchInAppMessagesWithoutRywToken(str5, interfaceC1430a2, str3, inAppBackendService$attemptFetchWithRetries$14);
                        return obj2 == enumC1260a ? enumC1260a : obj2;
                    }
                    str4 = str5;
                    inAppBackendService$attemptFetchWithRetries$12 = inAppBackendService$attemptFetchWithRetries$14;
                    InAppBackendService inAppBackendService42 = inAppBackendService2;
                    int i102 = i3;
                    InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$132 = inAppBackendService$attemptFetchWithRetries$12;
                    int i112 = i6;
                    String str72 = str3;
                    OptionalHeaders optionalHeaders2 = new OptionalHeaders(null, rywData2.getRywToken(), i6 <= 0 ? new Integer(i6) : null, new Long(((Number) interfaceC1430a2.invoke()).longValue()), str3, 1, null);
                    IHttpClient iHttpClient2 = inAppBackendService42._httpClient;
                    inAppBackendService$attemptFetchWithRetries$132.L$0 = inAppBackendService42;
                    inAppBackendService$attemptFetchWithRetries$132.L$1 = str4;
                    inAppBackendService$attemptFetchWithRetries$132.L$2 = rywData2;
                    inAppBackendService$attemptFetchWithRetries$132.L$3 = interfaceC1430a2;
                    inAppBackendService$attemptFetchWithRetries$132.L$4 = str72;
                    inAppBackendService$attemptFetchWithRetries$132.I$0 = i112;
                    inAppBackendService$attemptFetchWithRetries$132.I$1 = i102;
                    inAppBackendService$attemptFetchWithRetries$132.label = 1;
                    obj = iHttpClient2.get(str4, optionalHeaders2, inAppBackendService$attemptFetchWithRetries$132);
                    if (obj != enumC1260a) {
                        return enumC1260a;
                    }
                    str5 = str4;
                    rywData3 = rywData2;
                    obj2 = obj;
                    i7 = i112;
                    inAppBackendService3 = inAppBackendService42;
                    inAppBackendService$attemptFetchWithRetries$1 = inAppBackendService$attemptFetchWithRetries$132;
                    str6 = str72;
                    interfaceC1430a3 = interfaceC1430a2;
                    i8 = i102;
                    httpResponse = (HttpResponse) obj2;
                    if (httpResponse.isSuccess()) {
                        String payload = httpResponse.getPayload();
                        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                        if (jSONObject != null) {
                            return inAppBackendService3.hydrateInAppMessages(jSONObject);
                        }
                        return null;
                    }
                    if (httpResponse.getStatusCode() != 425 && httpResponse.getStatusCode() != 429) {
                        if (NetworkUtils.INSTANCE.getResponseStatusType(httpResponse.getStatusCode()) == NetworkUtils.ResponseStatusType.UNAUTHORIZED) {
                            throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                        }
                        httpResponse.getStatusCode();
                        return null;
                    }
                    Integer retryLimit = httpResponse.getRetryLimit();
                    if (retryLimit != null) {
                        i8 = retryLimit.intValue();
                    }
                    if (httpResponse.getRetryAfterSeconds() != null) {
                        long intValue = r0.intValue() * 1000;
                        inAppBackendService$attemptFetchWithRetries$1.L$0 = inAppBackendService3;
                        inAppBackendService$attemptFetchWithRetries$1.L$1 = str5;
                        inAppBackendService$attemptFetchWithRetries$1.L$2 = rywData3;
                        inAppBackendService$attemptFetchWithRetries$1.L$3 = interfaceC1430a3;
                        inAppBackendService$attemptFetchWithRetries$1.L$4 = str6;
                        inAppBackendService$attemptFetchWithRetries$1.I$0 = i7;
                        inAppBackendService$attemptFetchWithRetries$1.I$1 = i8;
                        c2 = 2;
                        inAppBackendService$attemptFetchWithRetries$1.label = 2;
                        if (AbstractC0024y.d(intValue, inAppBackendService$attemptFetchWithRetries$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        c2 = 2;
                    }
                    InAppBackendService$attemptFetchWithRetries$1 inAppBackendService$attemptFetchWithRetries$142 = inAppBackendService$attemptFetchWithRetries$1;
                    str3 = str6;
                    rywData2 = rywData3;
                    i3 = i8;
                    interfaceC1430a2 = interfaceC1430a3;
                    inAppBackendService2 = inAppBackendService3;
                    i6 = i7 + 1;
                    if (i6 <= i3) {
                    }
                }
            }
        }
        inAppBackendService = this;
        inAppBackendService$attemptFetchWithRetries$1 = new InAppBackendService$attemptFetchWithRetries$1(inAppBackendService, interfaceC1218d);
        Object obj22 = inAppBackendService$attemptFetchWithRetries$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$attemptFetchWithRetries$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInAppMessagesWithoutRywToken(String str, InterfaceC1430a interfaceC1430a, String str2, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$fetchInAppMessagesWithoutRywToken$1 inAppBackendService$fetchInAppMessagesWithoutRywToken$1;
        int i2;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof InAppBackendService$fetchInAppMessagesWithoutRywToken$1) {
            inAppBackendService$fetchInAppMessagesWithoutRywToken$1 = (InAppBackendService$fetchInAppMessagesWithoutRywToken$1) interfaceC1218d;
            int i3 = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    IHttpClient iHttpClient = this._httpClient;
                    OptionalHeaders optionalHeaders = new OptionalHeaders(null, null, null, (Long) interfaceC1430a.invoke(), str2, 7, null);
                    inAppBackendService$fetchInAppMessagesWithoutRywToken$1.L$0 = this;
                    inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label = 1;
                    obj = iHttpClient.get(str, optionalHeaders, inAppBackendService$fetchInAppMessagesWithoutRywToken$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppBackendService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$fetchInAppMessagesWithoutRywToken$1.L$0;
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    if (NetworkUtils.INSTANCE.getResponseStatusType(httpResponse.getStatusCode()) != NetworkUtils.ResponseStatusType.UNAUTHORIZED) {
                        return null;
                    }
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                String payload = httpResponse.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                if (jSONObject != null) {
                    return inAppBackendService.hydrateInAppMessages(jSONObject);
                }
                return null;
            }
        }
        inAppBackendService$fetchInAppMessagesWithoutRywToken$1 = new InAppBackendService$fetchInAppMessagesWithoutRywToken$1(this, interfaceC1218d);
        Object obj2 = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$fetchInAppMessagesWithoutRywToken$1.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    public static /* synthetic */ Object fetchInAppMessagesWithoutRywToken$default(InAppBackendService inAppBackendService, String str, InterfaceC1430a interfaceC1430a, String str2, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return inAppBackendService.fetchInAppMessagesWithoutRywToken(str, interfaceC1430a, str2, interfaceC1218d);
    }

    private final String htmlPathForMessage(String str, String str2, String str3) {
        if (str2 == null) {
            Logging.error$default("Unable to find a variant for in-app message " + str, null, 2, null);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    private final List<InAppMessage> hydrateInAppMessages(JSONObject jSONObject) {
        if (!jSONObject.has("in_app_messages")) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("in_app_messages");
        InAppHydrator inAppHydrator = this._hydrator;
        i.b(jSONArray);
        return inAppHydrator.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i2, String str2) {
        Logging.info$default("Encountered a " + i2 + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        Logging.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMData(String str, String str2, String str3, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$getIAMData$1 inAppBackendService$getIAMData$1;
        int i2;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof InAppBackendService$getIAMData$1) {
            inAppBackendService$getIAMData$1 = (InAppBackendService$getIAMData$1) interfaceC1218d;
            int i3 = inAppBackendService$getIAMData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$getIAMData$1.label = i3 - Integer.MIN_VALUE;
                InAppBackendService$getIAMData$1 inAppBackendService$getIAMData$12 = inAppBackendService$getIAMData$1;
                Object obj = inAppBackendService$getIAMData$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$getIAMData$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    String htmlPathForMessage = htmlPathForMessage(str2, str3, str);
                    if (htmlPathForMessage == null) {
                        return new GetIAMDataResponse(null, false);
                    }
                    IHttpClient iHttpClient = this._httpClient;
                    inAppBackendService$getIAMData$12.L$0 = this;
                    inAppBackendService$getIAMData$12.label = 1;
                    obj = IHttpClient.DefaultImpls.get$default(iHttpClient, htmlPathForMessage, null, inAppBackendService$getIAMData$12, 2, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppBackendService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$getIAMData$12.L$0;
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (!httpResponse.isSuccess()) {
                    inAppBackendService.htmlNetworkRequestAttemptCount = 0;
                    String payload = httpResponse.getPayload();
                    i.b(payload);
                    return new GetIAMDataResponse(inAppBackendService._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
                }
                inAppBackendService.printHttpErrorForInAppMessageRequest(InAppMessageContent.HTML, httpResponse.getStatusCode(), httpResponse.getPayload());
                NetworkUtils networkUtils = NetworkUtils.INSTANCE;
                if (networkUtils.getResponseStatusType(httpResponse.getStatusCode()) != NetworkUtils.ResponseStatusType.RETRYABLE || inAppBackendService.htmlNetworkRequestAttemptCount >= networkUtils.getMaxNetworkRequestAttemptCount()) {
                    inAppBackendService.htmlNetworkRequestAttemptCount = 0;
                    return new GetIAMDataResponse(null, false);
                }
                inAppBackendService.htmlNetworkRequestAttemptCount++;
                return new GetIAMDataResponse(null, true);
            }
        }
        inAppBackendService$getIAMData$1 = new InAppBackendService$getIAMData$1(this, interfaceC1218d);
        InAppBackendService$getIAMData$1 inAppBackendService$getIAMData$122 = inAppBackendService$getIAMData$1;
        Object obj2 = inAppBackendService$getIAMData$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$getIAMData$122.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (!httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIAMPreviewData(String str, String str2, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$getIAMPreviewData$1 inAppBackendService$getIAMPreviewData$1;
        int i2;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof InAppBackendService$getIAMPreviewData$1) {
            inAppBackendService$getIAMPreviewData$1 = (InAppBackendService$getIAMPreviewData$1) interfaceC1218d;
            int i3 = inAppBackendService$getIAMPreviewData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$getIAMPreviewData$1.label = i3 - Integer.MIN_VALUE;
                InAppBackendService$getIAMPreviewData$1 inAppBackendService$getIAMPreviewData$12 = inAppBackendService$getIAMPreviewData$1;
                Object obj = inAppBackendService$getIAMPreviewData$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$getIAMPreviewData$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    IHttpClient iHttpClient = this._httpClient;
                    inAppBackendService$getIAMPreviewData$12.L$0 = this;
                    inAppBackendService$getIAMPreviewData$12.label = 1;
                    obj = IHttpClient.DefaultImpls.get$default(iHttpClient, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, inAppBackendService$getIAMPreviewData$12, 2, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppBackendService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$getIAMPreviewData$12.L$0;
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    inAppBackendService.printHttpErrorForInAppMessageRequest(InAppMessageContent.HTML, httpResponse.getStatusCode(), httpResponse.getPayload());
                    return null;
                }
                String payload = httpResponse.getPayload();
                i.b(payload);
                return inAppBackendService._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
            }
        }
        inAppBackendService$getIAMPreviewData$1 = new InAppBackendService$getIAMPreviewData$1(this, interfaceC1218d);
        InAppBackendService$getIAMPreviewData$1 inAppBackendService$getIAMPreviewData$122 = inAppBackendService$getIAMPreviewData$1;
        Object obj2 = inAppBackendService$getIAMPreviewData$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$getIAMPreviewData$122.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8 A[PHI: r12
      0x00a8: PHI (r12v5 java.lang.Object) = (r12v4 java.lang.Object), (r12v1 java.lang.Object) binds: [B:19:0x00a5, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(String str, String str2, RywData rywData, InterfaceC1430a interfaceC1430a, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$listInAppMessages$1 inAppBackendService$listInAppMessages$1;
        int i2;
        InAppBackendService inAppBackendService;
        if (interfaceC1218d instanceof InAppBackendService$listInAppMessages$1) {
            inAppBackendService$listInAppMessages$1 = (InAppBackendService$listInAppMessages$1) interfaceC1218d;
            int i3 = inAppBackendService$listInAppMessages$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$listInAppMessages$1.label = i3 - Integer.MIN_VALUE;
                InAppBackendService$listInAppMessages$1 inAppBackendService$listInAppMessages$12 = inAppBackendService$listInAppMessages$1;
                Object obj = inAppBackendService$listInAppMessages$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$listInAppMessages$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    Long rywDelay = rywData.getRywDelay();
                    long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                    inAppBackendService$listInAppMessages$12.L$0 = this;
                    inAppBackendService$listInAppMessages$12.L$1 = str;
                    inAppBackendService$listInAppMessages$12.L$2 = str2;
                    inAppBackendService$listInAppMessages$12.L$3 = rywData;
                    inAppBackendService$listInAppMessages$12.L$4 = interfaceC1430a;
                    inAppBackendService$listInAppMessages$12.label = 1;
                    if (AbstractC0024y.d(longValue, inAppBackendService$listInAppMessages$12) == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppBackendService = this;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            g.y(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC1430a = (InterfaceC1430a) inAppBackendService$listInAppMessages$12.L$4;
                    rywData = (RywData) inAppBackendService$listInAppMessages$12.L$3;
                    str2 = (String) inAppBackendService$listInAppMessages$12.L$2;
                    str = (String) inAppBackendService$listInAppMessages$12.L$1;
                    inAppBackendService = (InAppBackendService) inAppBackendService$listInAppMessages$12.L$0;
                    g.y(obj);
                }
                RywData rywData2 = rywData;
                InterfaceC1430a interfaceC1430a2 = interfaceC1430a;
                inAppBackendService$listInAppMessages$12.L$0 = null;
                inAppBackendService$listInAppMessages$12.L$1 = null;
                inAppBackendService$listInAppMessages$12.L$2 = null;
                inAppBackendService$listInAppMessages$12.L$3 = null;
                inAppBackendService$listInAppMessages$12.L$4 = null;
                inAppBackendService$listInAppMessages$12.label = 2;
                obj = inAppBackendService.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", rywData2, interfaceC1430a2, null, inAppBackendService$listInAppMessages$12);
                return obj != enumC1260a ? enumC1260a : obj;
            }
        }
        inAppBackendService$listInAppMessages$1 = new InAppBackendService$listInAppMessages$1(this, interfaceC1218d);
        InAppBackendService$listInAppMessages$1 inAppBackendService$listInAppMessages$122 = inAppBackendService$listInAppMessages$1;
        Object obj2 = inAppBackendService$listInAppMessages$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$listInAppMessages$122.label;
        if (i2 != 0) {
        }
        RywData rywData22 = rywData;
        InterfaceC1430a interfaceC1430a22 = interfaceC1430a;
        inAppBackendService$listInAppMessages$122.L$0 = null;
        inAppBackendService$listInAppMessages$122.L$1 = null;
        inAppBackendService$listInAppMessages$122.L$2 = null;
        inAppBackendService$listInAppMessages$122.L$3 = null;
        inAppBackendService$listInAppMessages$122.L$4 = null;
        inAppBackendService$listInAppMessages$122.label = 2;
        obj2 = inAppBackendService.attemptFetchWithRetries("apps/" + str + "/subscriptions/" + str2 + "/iams", rywData22, interfaceC1430a22, null, inAppBackendService$listInAppMessages$122);
        if (obj2 != enumC1260a2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessagesIv(String str, String str2, String str3, String str4, RywData rywData, InterfaceC1430a interfaceC1430a, String str5, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$listInAppMessagesIv$1 inAppBackendService$listInAppMessagesIv$1;
        int i2;
        String str6;
        RywData rywData2;
        InterfaceC1430a interfaceC1430a2;
        String str7;
        InAppBackendService inAppBackendService;
        if (interfaceC1218d instanceof InAppBackendService$listInAppMessagesIv$1) {
            inAppBackendService$listInAppMessagesIv$1 = (InAppBackendService$listInAppMessagesIv$1) interfaceC1218d;
            int i3 = inAppBackendService$listInAppMessagesIv$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$listInAppMessagesIv$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppBackendService$listInAppMessagesIv$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$listInAppMessagesIv$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    String str8 = "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions/" + str4 + "/iams";
                    if (rywData == null) {
                        inAppBackendService$listInAppMessagesIv$1.label = 1;
                        obj = fetchInAppMessagesWithoutRywToken(str8, interfaceC1430a, str5, inAppBackendService$listInAppMessagesIv$1);
                        return obj == enumC1260a ? enumC1260a : obj;
                    }
                    Long rywDelay = rywData.getRywDelay();
                    long longValue = rywDelay != null ? rywDelay.longValue() : 500L;
                    inAppBackendService$listInAppMessagesIv$1.L$0 = this;
                    inAppBackendService$listInAppMessagesIv$1.L$1 = rywData;
                    inAppBackendService$listInAppMessagesIv$1.L$2 = interfaceC1430a;
                    inAppBackendService$listInAppMessagesIv$1.L$3 = str5;
                    inAppBackendService$listInAppMessagesIv$1.L$4 = str8;
                    inAppBackendService$listInAppMessagesIv$1.label = 2;
                    if (AbstractC0024y.d(longValue, inAppBackendService$listInAppMessagesIv$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    str6 = str8;
                    rywData2 = rywData;
                    interfaceC1430a2 = interfaceC1430a;
                    str7 = str5;
                    inAppBackendService = this;
                    inAppBackendService$listInAppMessagesIv$1.L$0 = null;
                    inAppBackendService$listInAppMessagesIv$1.L$1 = null;
                    inAppBackendService$listInAppMessagesIv$1.L$2 = null;
                    inAppBackendService$listInAppMessagesIv$1.L$3 = null;
                    inAppBackendService$listInAppMessagesIv$1.L$4 = null;
                    inAppBackendService$listInAppMessagesIv$1.label = 3;
                    obj = inAppBackendService.attemptFetchWithRetries(str6, rywData2, interfaceC1430a2, str7, inAppBackendService$listInAppMessagesIv$1);
                    if (obj != enumC1260a) {
                    }
                } else {
                    if (i2 == 1) {
                        g.y(obj);
                    }
                    if (i2 == 2) {
                        String str9 = (String) inAppBackendService$listInAppMessagesIv$1.L$4;
                        String str10 = (String) inAppBackendService$listInAppMessagesIv$1.L$3;
                        InterfaceC1430a interfaceC1430a3 = (InterfaceC1430a) inAppBackendService$listInAppMessagesIv$1.L$2;
                        RywData rywData3 = (RywData) inAppBackendService$listInAppMessagesIv$1.L$1;
                        InAppBackendService inAppBackendService2 = (InAppBackendService) inAppBackendService$listInAppMessagesIv$1.L$0;
                        g.y(obj);
                        rywData2 = rywData3;
                        interfaceC1430a2 = interfaceC1430a3;
                        str7 = str10;
                        str6 = str9;
                        inAppBackendService = inAppBackendService2;
                        inAppBackendService$listInAppMessagesIv$1.L$0 = null;
                        inAppBackendService$listInAppMessagesIv$1.L$1 = null;
                        inAppBackendService$listInAppMessagesIv$1.L$2 = null;
                        inAppBackendService$listInAppMessagesIv$1.L$3 = null;
                        inAppBackendService$listInAppMessagesIv$1.L$4 = null;
                        inAppBackendService$listInAppMessagesIv$1.label = 3;
                        obj = inAppBackendService.attemptFetchWithRetries(str6, rywData2, interfaceC1430a2, str7, inAppBackendService$listInAppMessagesIv$1);
                        if (obj != enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                    }
                }
                return obj;
            }
        }
        inAppBackendService$listInAppMessagesIv$1 = new InAppBackendService$listInAppMessagesIv$1(this, interfaceC1218d);
        Object obj2 = inAppBackendService$listInAppMessagesIv$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$listInAppMessagesIv$1.label;
        if (i2 != 0) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMClick(final String str, final String str2, final String str3, String str4, final String str5, final boolean z, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$sendIAMClick$1 inAppBackendService$sendIAMClick$1;
        int i2;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof InAppBackendService$sendIAMClick$1) {
            inAppBackendService$sendIAMClick$1 = (InAppBackendService$sendIAMClick$1) interfaceC1218d;
            int i3 = inAppBackendService$sendIAMClick$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$sendIAMClick$1.label = i3 - Integer.MIN_VALUE;
                InAppBackendService$sendIAMClick$1 inAppBackendService$sendIAMClick$12 = inAppBackendService$sendIAMClick$1;
                Object obj = inAppBackendService$sendIAMClick$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$sendIAMClick$12.label;
                if (i2 != 0) {
                    g.y(obj);
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
                    IHttpClient iHttpClient = this._httpClient;
                    String f3 = AbstractC0279e.f("in_app_messages/", str4, "/click");
                    inAppBackendService$sendIAMClick$12.L$0 = this;
                    inAppBackendService$sendIAMClick$12.label = 1;
                    obj = IHttpClient.DefaultImpls.post$default(iHttpClient, f3, jSONObject, null, inAppBackendService$sendIAMClick$12, 4, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppBackendService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$sendIAMClick$12.L$0;
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    inAppBackendService.printHttpErrorForInAppMessageRequest("engagement", httpResponse.getStatusCode(), httpResponse.getPayload());
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                String payload = httpResponse.getPayload();
                i.b(payload);
                inAppBackendService.printHttpSuccessForInAppMessageRequest("engagement", payload);
                return v.f5689a;
            }
        }
        inAppBackendService$sendIAMClick$1 = new InAppBackendService$sendIAMClick$1(this, interfaceC1218d);
        InAppBackendService$sendIAMClick$1 inAppBackendService$sendIAMClick$122 = inAppBackendService$sendIAMClick$1;
        Object obj2 = inAppBackendService$sendIAMClick$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$sendIAMClick$122.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMImpression(final String str, final String str2, final String str3, String str4, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$sendIAMImpression$1 inAppBackendService$sendIAMImpression$1;
        int i2;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof InAppBackendService$sendIAMImpression$1) {
            inAppBackendService$sendIAMImpression$1 = (InAppBackendService$sendIAMImpression$1) interfaceC1218d;
            int i3 = inAppBackendService$sendIAMImpression$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$sendIAMImpression$1.label = i3 - Integer.MIN_VALUE;
                InAppBackendService$sendIAMImpression$1 inAppBackendService$sendIAMImpression$12 = inAppBackendService$sendIAMImpression$1;
                Object obj = inAppBackendService$sendIAMImpression$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$sendIAMImpression$12.label;
                if (i2 != 0) {
                    g.y(obj);
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
                    IHttpClient iHttpClient = this._httpClient;
                    String f3 = AbstractC0279e.f("in_app_messages/", str4, "/impression");
                    inAppBackendService$sendIAMImpression$12.L$0 = this;
                    inAppBackendService$sendIAMImpression$12.label = 1;
                    obj = IHttpClient.DefaultImpls.post$default(iHttpClient, f3, jSONObject, null, inAppBackendService$sendIAMImpression$12, 4, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppBackendService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$sendIAMImpression$12.L$0;
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    inAppBackendService.printHttpErrorForInAppMessageRequest("impression", httpResponse.getStatusCode(), httpResponse.getPayload());
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                String payload = httpResponse.getPayload();
                i.b(payload);
                inAppBackendService.printHttpSuccessForInAppMessageRequest("impression", payload);
                return v.f5689a;
            }
        }
        inAppBackendService$sendIAMImpression$1 = new InAppBackendService$sendIAMImpression$1(this, interfaceC1218d);
        InAppBackendService$sendIAMImpression$1 inAppBackendService$sendIAMImpression$122 = inAppBackendService$sendIAMImpression$1;
        Object obj2 = inAppBackendService$sendIAMImpression$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$sendIAMImpression$122.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.onesignal.inAppMessages.internal.backend.IInAppBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendIAMPageImpression(final String str, final String str2, final String str3, String str4, final String str5, InterfaceC1218d interfaceC1218d) {
        InAppBackendService$sendIAMPageImpression$1 inAppBackendService$sendIAMPageImpression$1;
        int i2;
        InAppBackendService inAppBackendService;
        HttpResponse httpResponse;
        if (interfaceC1218d instanceof InAppBackendService$sendIAMPageImpression$1) {
            inAppBackendService$sendIAMPageImpression$1 = (InAppBackendService$sendIAMPageImpression$1) interfaceC1218d;
            int i3 = inAppBackendService$sendIAMPageImpression$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppBackendService$sendIAMPageImpression$1.label = i3 - Integer.MIN_VALUE;
                InAppBackendService$sendIAMPageImpression$1 inAppBackendService$sendIAMPageImpression$12 = inAppBackendService$sendIAMPageImpression$1;
                Object obj = inAppBackendService$sendIAMPageImpression$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppBackendService$sendIAMPageImpression$12.label;
                if (i2 != 0) {
                    g.y(obj);
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
                    IHttpClient iHttpClient = this._httpClient;
                    String f3 = AbstractC0279e.f("in_app_messages/", str4, "/pageImpression");
                    inAppBackendService$sendIAMPageImpression$12.L$0 = this;
                    inAppBackendService$sendIAMPageImpression$12.label = 1;
                    obj = IHttpClient.DefaultImpls.post$default(iHttpClient, f3, jSONObject, null, inAppBackendService$sendIAMPageImpression$12, 4, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppBackendService = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppBackendService = (InAppBackendService) inAppBackendService$sendIAMPageImpression$12.L$0;
                    g.y(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    inAppBackendService.printHttpErrorForInAppMessageRequest("page impression", httpResponse.getStatusCode(), httpResponse.getPayload());
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                String payload = httpResponse.getPayload();
                i.b(payload);
                inAppBackendService.printHttpSuccessForInAppMessageRequest("page impression", payload);
                return v.f5689a;
            }
        }
        inAppBackendService$sendIAMPageImpression$1 = new InAppBackendService$sendIAMPageImpression$1(this, interfaceC1218d);
        InAppBackendService$sendIAMPageImpression$1 inAppBackendService$sendIAMPageImpression$122 = inAppBackendService$sendIAMPageImpression$1;
        Object obj2 = inAppBackendService$sendIAMPageImpression$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppBackendService$sendIAMPageImpression$122.label;
        if (i2 != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }
}
