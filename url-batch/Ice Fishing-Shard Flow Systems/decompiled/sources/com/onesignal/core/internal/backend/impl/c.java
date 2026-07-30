package com.onesignal.core.internal.backend.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C0846a;
import w2.C0990a;
import w2.h;

/* loaded from: classes.dex */
public final class c implements w2.c {
    private final C2.c _http;

    public static final class a extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.fetchParams(null, null, this);
        }
    }

    public static final class b extends p implements Function1 {
        final /* synthetic */ D $influenceParams;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D d7, c cVar) {
            super(1);
            this.$influenceParams = d7;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f6114a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$influenceParams.f6152d = this.this$0.processOutcomeJson(it);
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0013c extends p implements Function1 {
        final /* synthetic */ D $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0013c(D d7) {
            super(1);
            this.$fcmParams = d7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f6114a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            D d7 = this.$fcmParams;
            String safeString = com.onesignal.common.e.safeString(it, "api_key");
            d7.f6152d = new C0990a(com.onesignal.common.e.safeString(it, "project_id"), com.onesignal.common.e.safeString(it, "app_id"), safeString);
        }
    }

    public static final class d extends p implements Function1 {
        final /* synthetic */ D $remoteLoggingParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(D d7) {
            super(1);
            this.$remoteLoggingParams = d7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f6114a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            K2.c fromString = K2.c.Companion.fromString(com.onesignal.common.e.safeString(it, "log_level"));
            this.$remoteLoggingParams.f6152d = new h(fromString, false, 2, null);
        }
    }

    public static final class e extends p implements Function1 {
        final /* synthetic */ D $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(D d7) {
            super(1);
            this.$isDirectEnabled = d7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f6114a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$isDirectEnabled.f6152d = com.onesignal.common.e.safeBool(it, "enabled");
        }
    }

    public static final class f extends p implements Function1 {
        final /* synthetic */ D $iamLimit;
        final /* synthetic */ D $indirectIAMAttributionWindow;
        final /* synthetic */ D $indirectNotificationAttributionWindow;
        final /* synthetic */ D $isIndirectEnabled;
        final /* synthetic */ D $notificationLimit;

        public static final class a extends p implements Function1 {
            final /* synthetic */ D $indirectNotificationAttributionWindow;
            final /* synthetic */ D $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(D d7, D d8) {
                super(1);
                this.$indirectNotificationAttributionWindow = d7;
                this.$notificationLimit = d8;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return Unit.f6114a;
            }

            public final void invoke(JSONObject it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$indirectNotificationAttributionWindow.f6152d = com.onesignal.common.e.safeInt(it, "minutes_since_displayed");
                this.$notificationLimit.f6152d = com.onesignal.common.e.safeInt(it, "limit");
            }
        }

        public static final class b extends p implements Function1 {
            final /* synthetic */ D $iamLimit;
            final /* synthetic */ D $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(D d7, D d8) {
                super(1);
                this.$indirectIAMAttributionWindow = d7;
                this.$iamLimit = d8;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return Unit.f6114a;
            }

            public final void invoke(JSONObject it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$indirectIAMAttributionWindow.f6152d = com.onesignal.common.e.safeInt(it, "minutes_since_displayed");
                this.$iamLimit.f6152d = com.onesignal.common.e.safeInt(it, "limit");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(D d7, D d8, D d9, D d10, D d11) {
            super(1);
            this.$isIndirectEnabled = d7;
            this.$indirectNotificationAttributionWindow = d8;
            this.$notificationLimit = d9;
            this.$indirectIAMAttributionWindow = d10;
            this.$iamLimit = d11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f6114a;
        }

        public final void invoke(JSONObject indirectJSON) {
            Intrinsics.checkNotNullParameter(indirectJSON, "indirectJSON");
            this.$isIndirectEnabled.f6152d = com.onesignal.common.e.safeBool(indirectJSON, "enabled");
            com.onesignal.common.e.expandJSONObject(indirectJSON, "notification_attribution", new a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            com.onesignal.common.e.expandJSONObject(indirectJSON, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    public static final class g extends p implements Function1 {
        final /* synthetic */ D $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(D d7) {
            super(1);
            this.$isUnattributedEnabled = d7;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f6114a;
        }

        public final void invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$isUnattributedEnabled.f6152d = com.onesignal.common.e.safeBool(it, "enabled");
        }
    }

    public c(C2.c _http) {
        Intrinsics.checkNotNullParameter(_http, "_http");
        this._http = _http;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w2.d processOutcomeJson(JSONObject jSONObject) {
        D d7 = new D();
        D d8 = new D();
        D d9 = new D();
        D d10 = new D();
        D d11 = new D();
        D d12 = new D();
        D d13 = new D();
        com.onesignal.common.e.expandJSONObject(jSONObject, K3.e.DIRECT_TAG, new e(d11));
        com.onesignal.common.e.expandJSONObject(jSONObject, "indirect", new f(d12, d7, d8, d9, d10));
        com.onesignal.common.e.expandJSONObject(jSONObject, "unattributed", new g(d13));
        return new w2.d((Integer) d7.f6152d, (Integer) d8.f6152d, (Integer) d9.f6152d, (Integer) d10.f6152d, (Boolean) d11.f6152d, (Boolean) d12.f6152d, (Boolean) d13.f6152d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // w2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchParams(String str, String str2, V5.b bVar) {
        a aVar;
        int i2;
        c cVar;
        C2.a aVar2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i5 = aVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.label = i5 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = aVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
                    StringBuilder sb = new StringBuilder("apps/");
                    sb.append(str);
                    sb.append("/android_params.js");
                    String sb2 = sb.toString();
                    if (str2 != null && !com.onesignal.common.d.INSTANCE.isLocalId(str2)) {
                        sb2 = sb2 + "?player_id=" + str2;
                    }
                    C2.c cVar2 = this._http;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e("CACHE_KEY_REMOTE_PARAMS", null, null, null, null, 30, null);
                    aVar.L$0 = this;
                    aVar.label = 1;
                    obj = cVar2.get(sb2, eVar, aVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    cVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (c) aVar.L$0;
                    V6.b.P(obj);
                }
                aVar2 = (C2.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C0846a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                try {
                    JSONObject jSONObject = new JSONObject(payload == null ? "" : payload);
                    D d7 = new D();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "outcomes", new b(d7, cVar));
                    D d8 = new D();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "fcm", new C0013c(d8));
                    D d9 = new D();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "logging_config", new d(d9));
                    String safeString = com.onesignal.common.e.safeString(jSONObject, "android_sender_id");
                    Boolean safeBool = com.onesignal.common.e.safeBool(jSONObject, "enterp");
                    Boolean safeBool2 = com.onesignal.common.e.safeBool(jSONObject, "jwt_required");
                    JSONArray optJSONArray = jSONObject.optJSONArray("chnl_lst");
                    Boolean safeBool3 = com.onesignal.common.e.safeBool(jSONObject, "fba");
                    Boolean safeBool4 = com.onesignal.common.e.safeBool(jSONObject, "restore_ttl_filter");
                    Boolean safeBool5 = com.onesignal.common.e.safeBool(jSONObject, "clear_group_on_summary_click");
                    Boolean safeBool6 = com.onesignal.common.e.safeBool(jSONObject, "receive_receipts_enable");
                    Boolean safeBool7 = com.onesignal.common.e.safeBool(jSONObject, "disable_gms_missing_prompt");
                    Boolean safeBool8 = com.onesignal.common.e.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
                    Boolean safeBool9 = com.onesignal.common.e.safeBool(jSONObject, "location_shared");
                    Boolean safeBool10 = com.onesignal.common.e.safeBool(jSONObject, "requires_user_privacy_consent");
                    Long safeLong = com.onesignal.common.e.safeLong(jSONObject, "oprepo_execution_interval");
                    w2.d dVar = (w2.d) d7.f6152d;
                    w2.d dVar2 = dVar == null ? new w2.d(null, null, null, null, null, null, null, 127, null) : dVar;
                    C0990a c0990a = (C0990a) d8.f6152d;
                    C0990a c0990a2 = c0990a == null ? new C0990a(null, null, null, 7, null) : c0990a;
                    h hVar = (h) d9.f6152d;
                    if (hVar == null) {
                        hVar = new h(null, false, 3, null);
                    }
                    return new w2.e(safeString, safeBool, safeBool2, optJSONArray, safeBool3, safeBool4, safeBool5, safeBool6, safeBool7, safeBool8, safeBool9, safeBool10, safeLong, dVar2, c0990a2, hVar);
                } catch (JSONException e7) {
                    com.onesignal.debug.internal.logging.b.warn("ParamsBackendService.fetchParams: malformed (non-JSON) response payload, will retry. status=" + aVar2.getStatusCode(), e7);
                    throw new C0846a(aVar2.getStatusCode(), payload, aVar2.getRetryAfterSeconds());
                }
            }
        }
        aVar = new a(bVar);
        Object obj2 = aVar.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = aVar.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
