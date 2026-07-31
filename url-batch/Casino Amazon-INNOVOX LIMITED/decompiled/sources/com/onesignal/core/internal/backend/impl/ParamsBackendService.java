package com.onesignal.core.internal.backend.impl;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.IDManager;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.backend.FCMParamsObject;
import com.onesignal.core.internal.backend.IParamsBackendService;
import com.onesignal.core.internal.backend.InfluenceParamsObject;
import com.onesignal.core.internal.backend.ParamsObject;
import com.onesignal.core.internal.backend.RemoteLoggingParamsObject;
import com.onesignal.core.internal.http.CacheKeys;
import com.onesignal.core.internal.http.HttpResponse;
import com.onesignal.core.internal.http.IHttpClient;
import com.onesignal.core.internal.http.impl.OptionalHeaders;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ParamsBackendService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onesignal/core/internal/backend/impl/ParamsBackendService;", "Lcom/onesignal/core/internal/backend/IParamsBackendService;", "_http", "Lcom/onesignal/core/internal/http/IHttpClient;", "(Lcom/onesignal/core/internal/http/IHttpClient;)V", "fetchParams", "Lcom/onesignal/core/internal/backend/ParamsObject;", "appId", "", "subscriptionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processOutcomeJson", "Lcom/onesignal/core/internal/backend/InfluenceParamsObject;", "outcomeJson", "Lorg/json/JSONObject;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParamsBackendService implements IParamsBackendService {
    private final IHttpClient _http;

    public ParamsBackendService(IHttpClient _http) {
        Intrinsics.checkNotNullParameter(_http, "_http");
        this._http = _http;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.onesignal.core.internal.backend.IParamsBackendService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchParams(String str, String str2, Continuation<? super ParamsObject> continuation) {
        ParamsBackendService$fetchParams$1 paramsBackendService$fetchParams$1;
        int i;
        final ParamsBackendService paramsBackendService;
        HttpResponse httpResponse;
        if (continuation instanceof ParamsBackendService$fetchParams$1) {
            paramsBackendService$fetchParams$1 = (ParamsBackendService$fetchParams$1) continuation;
            if ((paramsBackendService$fetchParams$1.label & Integer.MIN_VALUE) != 0) {
                paramsBackendService$fetchParams$1.label -= Integer.MIN_VALUE;
                Object obj = paramsBackendService$fetchParams$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paramsBackendService$fetchParams$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logging.log(LogLevel.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
                    String str3 = "apps/" + str + "/android_params.js";
                    if (str2 != null && !IDManager.INSTANCE.isLocalId(str2)) {
                        str3 = str3 + "?player_id=" + str2;
                    }
                    IHttpClient iHttpClient = this._http;
                    OptionalHeaders optionalHeaders = new OptionalHeaders(CacheKeys.REMOTE_PARAMS, null, null, null, null, 30, null);
                    paramsBackendService$fetchParams$1.L$0 = this;
                    paramsBackendService$fetchParams$1.label = 1;
                    obj = iHttpClient.get(str3, optionalHeaders, paramsBackendService$fetchParams$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    paramsBackendService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paramsBackendService = (ParamsBackendService) paramsBackendService$fetchParams$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                httpResponse = (HttpResponse) obj;
                if (httpResponse.isSuccess()) {
                    throw new BackendException(httpResponse.getStatusCode(), httpResponse.getPayload(), httpResponse.getRetryAfterSeconds());
                }
                String payload = httpResponse.getPayload();
                try {
                    JSONObject jSONObject = new JSONObject(payload == null ? "" : payload);
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    JSONObjectExtensionsKt.expandJSONObject(jSONObject, "outcomes", new Function1<JSONObject, Unit>() { // from class: com.onesignal.core.internal.backend.impl.ParamsBackendService$fetchParams$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject2) {
                            invoke2(jSONObject2);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [T, com.onesignal.core.internal.backend.InfluenceParamsObject] */
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(JSONObject it) {
                            ?? processOutcomeJson;
                            Intrinsics.checkNotNullParameter(it, "it");
                            Ref.ObjectRef<InfluenceParamsObject> objectRef2 = objectRef;
                            processOutcomeJson = paramsBackendService.processOutcomeJson(it);
                            objectRef2.element = processOutcomeJson;
                        }
                    });
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    JSONObjectExtensionsKt.expandJSONObject(jSONObject, Constants.ScionAnalytics.ORIGIN_FCM, new Function1<JSONObject, Unit>() { // from class: com.onesignal.core.internal.backend.impl.ParamsBackendService$fetchParams$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject2) {
                            invoke2(jSONObject2);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [T, com.onesignal.core.internal.backend.FCMParamsObject] */
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(JSONObject it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Ref.ObjectRef<FCMParamsObject> objectRef3 = objectRef2;
                            String safeString = JSONObjectExtensionsKt.safeString(it, "api_key");
                            objectRef3.element = new FCMParamsObject(JSONObjectExtensionsKt.safeString(it, "project_id"), JSONObjectExtensionsKt.safeString(it, CommonUrlParts.APP_ID), safeString);
                        }
                    });
                    final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    JSONObjectExtensionsKt.expandJSONObject(jSONObject, "logging_config", new Function1<JSONObject, Unit>() { // from class: com.onesignal.core.internal.backend.impl.ParamsBackendService$fetchParams$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject2) {
                            invoke2(jSONObject2);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r1v1, types: [T, com.onesignal.core.internal.backend.RemoteLoggingParamsObject] */
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(JSONObject it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LogLevel fromString = LogLevel.INSTANCE.fromString(JSONObjectExtensionsKt.safeString(it, "log_level"));
                            objectRef3.element = new RemoteLoggingParamsObject(fromString, false, 2, null);
                        }
                    });
                    String safeString = JSONObjectExtensionsKt.safeString(jSONObject, "android_sender_id");
                    Boolean safeBool = JSONObjectExtensionsKt.safeBool(jSONObject, "enterp");
                    Boolean safeBool2 = JSONObjectExtensionsKt.safeBool(jSONObject, "jwt_required");
                    JSONArray optJSONArray = jSONObject.optJSONArray("chnl_lst");
                    Boolean safeBool3 = JSONObjectExtensionsKt.safeBool(jSONObject, "fba");
                    Boolean safeBool4 = JSONObjectExtensionsKt.safeBool(jSONObject, "restore_ttl_filter");
                    Boolean safeBool5 = JSONObjectExtensionsKt.safeBool(jSONObject, "clear_group_on_summary_click");
                    Boolean safeBool6 = JSONObjectExtensionsKt.safeBool(jSONObject, "receive_receipts_enable");
                    Boolean safeBool7 = JSONObjectExtensionsKt.safeBool(jSONObject, "disable_gms_missing_prompt");
                    Boolean safeBool8 = JSONObjectExtensionsKt.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
                    Boolean safeBool9 = JSONObjectExtensionsKt.safeBool(jSONObject, "location_shared");
                    Boolean safeBool10 = JSONObjectExtensionsKt.safeBool(jSONObject, "requires_user_privacy_consent");
                    Long safeLong = JSONObjectExtensionsKt.safeLong(jSONObject, "oprepo_execution_interval");
                    InfluenceParamsObject influenceParamsObject = (InfluenceParamsObject) objectRef.element;
                    InfluenceParamsObject influenceParamsObject2 = influenceParamsObject == null ? new InfluenceParamsObject(null, null, null, null, null, null, null, 127, null) : influenceParamsObject;
                    FCMParamsObject fCMParamsObject = (FCMParamsObject) objectRef2.element;
                    FCMParamsObject fCMParamsObject2 = fCMParamsObject == null ? new FCMParamsObject(null, null, null, 7, null) : fCMParamsObject;
                    RemoteLoggingParamsObject remoteLoggingParamsObject = (RemoteLoggingParamsObject) objectRef3.element;
                    if (remoteLoggingParamsObject == null) {
                        remoteLoggingParamsObject = new RemoteLoggingParamsObject(null, false, 3, null);
                    }
                    return new ParamsObject(safeString, safeBool, safeBool2, optJSONArray, safeBool3, safeBool4, safeBool5, safeBool6, safeBool7, safeBool8, safeBool9, safeBool10, safeLong, influenceParamsObject2, fCMParamsObject2, remoteLoggingParamsObject);
                } catch (JSONException e) {
                    Logging.warn("ParamsBackendService.fetchParams: malformed (non-JSON) response payload, will retry. status=" + httpResponse.getStatusCode(), e);
                    throw new BackendException(httpResponse.getStatusCode(), payload, httpResponse.getRetryAfterSeconds());
                }
            }
        }
        paramsBackendService$fetchParams$1 = new ParamsBackendService$fetchParams$1(this, continuation);
        Object obj2 = paramsBackendService$fetchParams$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paramsBackendService$fetchParams$1.label;
        if (i != 0) {
        }
        httpResponse = (HttpResponse) obj2;
        if (httpResponse.isSuccess()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final InfluenceParamsObject processOutcomeJson(JSONObject outcomeJson) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
        JSONObjectExtensionsKt.expandJSONObject(outcomeJson, "direct", new Function1<JSONObject, Unit>() { // from class: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JSONObject it) {
                Intrinsics.checkNotNullParameter(it, "it");
                objectRef5.element = JSONObjectExtensionsKt.safeBool(it, ViewProps.ENABLED);
            }
        });
        JSONObjectExtensionsKt.expandJSONObject(outcomeJson, OutcomeConstants.INDIRECT, new Function1<JSONObject, Unit>() { // from class: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Boolean] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JSONObject indirectJSON) {
                Intrinsics.checkNotNullParameter(indirectJSON, "indirectJSON");
                objectRef6.element = JSONObjectExtensionsKt.safeBool(indirectJSON, ViewProps.ENABLED);
                final Ref.ObjectRef<Integer> objectRef8 = objectRef;
                final Ref.ObjectRef<Integer> objectRef9 = objectRef2;
                JSONObjectExtensionsKt.expandJSONObject(indirectJSON, "notification_attribution", new Function1<JSONObject, Unit>() { // from class: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
                        invoke2(jSONObject);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Integer] */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(JSONObject it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        objectRef8.element = JSONObjectExtensionsKt.safeInt(it, "minutes_since_displayed");
                        objectRef9.element = JSONObjectExtensionsKt.safeInt(it, "limit");
                    }
                });
                final Ref.ObjectRef<Integer> objectRef10 = objectRef3;
                final Ref.ObjectRef<Integer> objectRef11 = objectRef4;
                JSONObjectExtensionsKt.expandJSONObject(indirectJSON, "in_app_message_attribution", new Function1<JSONObject, Unit>() { // from class: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
                        invoke2(jSONObject);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Integer] */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(JSONObject it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        objectRef10.element = JSONObjectExtensionsKt.safeInt(it, "minutes_since_displayed");
                        objectRef11.element = JSONObjectExtensionsKt.safeInt(it, "limit");
                    }
                });
            }
        });
        JSONObjectExtensionsKt.expandJSONObject(outcomeJson, "unattributed", new Function1<JSONObject, Unit>() { // from class: com.onesignal.core.internal.backend.impl.ParamsBackendService$processOutcomeJson$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JSONObject it) {
                Intrinsics.checkNotNullParameter(it, "it");
                objectRef7.element = JSONObjectExtensionsKt.safeBool(it, ViewProps.ENABLED);
            }
        });
        return new InfluenceParamsObject((Integer) objectRef.element, (Integer) objectRef2.element, (Integer) objectRef3.element, (Integer) objectRef4.element, (Boolean) objectRef5.element, (Boolean) objectRef6.element, (Boolean) objectRef7.element);
    }
}
