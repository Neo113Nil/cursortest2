package com.onesignal.core.internal.backend.impl;

import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;
import wd.b0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements fa.b {
    private final ka.c _http;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0009a extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0009a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchParams(null, null, this);
        }
    }

    public a(ka.c cVar) {
        cVar.getClass();
        this._http = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c processOutcomeJson(JSONObject jSONObject) {
        b0 b0Var = new b0();
        b0 b0Var2 = new b0();
        b0 b0Var3 = new b0();
        b0 b0Var4 = new b0();
        b0 b0Var5 = new b0();
        b0 b0Var6 = new b0();
        b0 b0Var7 = new b0();
        com.onesignal.common.e.expandJSONObject(jSONObject, pc.e.DIRECT_TAG, new d(b0Var5));
        com.onesignal.common.e.expandJSONObject(jSONObject, "indirect", new e(b0Var6, b0Var, b0Var2, b0Var3, b0Var4));
        com.onesignal.common.e.expandJSONObject(jSONObject, "unattributed", new f(b0Var7));
        return new fa.c((Integer) b0Var.f10141d, (Integer) b0Var2.f10141d, (Integer) b0Var3.f10141d, (Integer) b0Var4.f10141d, (Boolean) b0Var5.f10141d, (Boolean) b0Var6.f10141d, (Boolean) b0Var7.f10141d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // fa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchParams(String str, String str2, ld.a aVar) {
        C0009a c0009a;
        int i3;
        a aVar2;
        ka.a aVar3;
        if (aVar instanceof C0009a) {
            c0009a = (C0009a) aVar;
            int i10 = c0009a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0009a.label = i10 - Integer.MIN_VALUE;
                Object obj = c0009a.result;
                md.a aVar4 = md.a.f6622d;
                i3 = c0009a.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
                    StringBuilder sb2 = new StringBuilder("apps/");
                    sb2.append(str);
                    sb2.append("/android_params.js");
                    String sb3 = sb2.toString();
                    if (str2 != null && !com.onesignal.common.d.INSTANCE.isLocalId(str2)) {
                        sb3 = sb3 + "?player_id=" + str2;
                    }
                    ka.c cVar = this._http;
                    com.onesignal.core.internal.http.impl.d dVar = new com.onesignal.core.internal.http.impl.d("CACHE_KEY_REMOTE_PARAMS", null, null, null, 14, null);
                    c0009a.L$0 = this;
                    c0009a.label = 1;
                    obj = cVar.get(sb3, dVar, c0009a);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) c0009a.L$0;
                    cf.c.M(obj);
                }
                aVar3 = (ka.a) obj;
                if (aVar3.isSuccess()) {
                    throw new z9.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
                }
                String payload = aVar3.getPayload();
                payload.getClass();
                JSONObject jSONObject = new JSONObject(payload);
                b0 b0Var = new b0();
                com.onesignal.common.e.expandJSONObject(jSONObject, "outcomes", new b(b0Var, aVar2));
                b0 b0Var2 = new b0();
                com.onesignal.common.e.expandJSONObject(jSONObject, "fcm", new c(b0Var2));
                String safeString = com.onesignal.common.e.safeString(jSONObject, "android_sender_id");
                Boolean safeBool = com.onesignal.common.e.safeBool(jSONObject, "enterp");
                Boolean safeBool2 = com.onesignal.common.e.safeBool(jSONObject, "require_ident_auth");
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
                fa.c cVar2 = (fa.c) b0Var.f10141d;
                fa.c cVar3 = cVar2 == null ? new fa.c(null, null, null, null, null, null, null, 127, null) : cVar2;
                fa.a aVar5 = (fa.a) b0Var2.f10141d;
                return new fa.d(safeString, safeBool, safeBool2, optJSONArray, safeBool3, safeBool4, safeBool5, safeBool6, safeBool7, safeBool8, safeBool9, safeBool10, safeLong, cVar3, aVar5 == null ? new fa.a(null, null, null, 7, null) : aVar5);
            }
        }
        c0009a = new C0009a(aVar);
        Object obj2 = c0009a.result;
        md.a aVar42 = md.a.f6622d;
        i3 = c0009a.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function1 {
        final /* synthetic */ b0 $influenceParams;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var, a aVar) {
            super(1);
            this.$influenceParams = b0Var;
            this.this$0 = aVar;
        }

        public final void invoke(JSONObject jSONObject) {
            jSONObject.getClass();
            this.$influenceParams.f10141d = this.this$0.processOutcomeJson(jSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends p implements Function1 {
        final /* synthetic */ b0 $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b0 b0Var) {
            super(1);
            this.$isDirectEnabled = b0Var;
        }

        public final void invoke(JSONObject jSONObject) {
            jSONObject.getClass();
            this.$isDirectEnabled.f10141d = com.onesignal.common.e.safeBool(jSONObject, "enabled");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends p implements Function1 {
        final /* synthetic */ b0 $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b0 b0Var) {
            super(1);
            this.$isUnattributedEnabled = b0Var;
        }

        public final void invoke(JSONObject jSONObject) {
            jSONObject.getClass();
            this.$isUnattributedEnabled.f10141d = com.onesignal.common.e.safeBool(jSONObject, "enabled");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends p implements Function1 {
        final /* synthetic */ b0 $iamLimit;
        final /* synthetic */ b0 $indirectIAMAttributionWindow;
        final /* synthetic */ b0 $indirectNotificationAttributionWindow;
        final /* synthetic */ b0 $isIndirectEnabled;
        final /* synthetic */ b0 $notificationLimit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5) {
            super(1);
            this.$isIndirectEnabled = b0Var;
            this.$indirectNotificationAttributionWindow = b0Var2;
            this.$notificationLimit = b0Var3;
            this.$indirectIAMAttributionWindow = b0Var4;
            this.$iamLimit = b0Var5;
        }

        public final void invoke(JSONObject jSONObject) {
            jSONObject.getClass();
            this.$isIndirectEnabled.f10141d = com.onesignal.common.e.safeBool(jSONObject, "enabled");
            com.onesignal.common.e.expandJSONObject(jSONObject, "notification_attribution", new C0010a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            com.onesignal.common.e.expandJSONObject(jSONObject, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.core.internal.backend.impl.a$e$a, reason: collision with other inner class name */
        public static final class C0010a extends p implements Function1 {
            final /* synthetic */ b0 $indirectNotificationAttributionWindow;
            final /* synthetic */ b0 $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0010a(b0 b0Var, b0 b0Var2) {
                super(1);
                this.$indirectNotificationAttributionWindow = b0Var;
                this.$notificationLimit = b0Var2;
            }

            public final void invoke(JSONObject jSONObject) {
                jSONObject.getClass();
                this.$indirectNotificationAttributionWindow.f10141d = com.onesignal.common.e.safeInt(jSONObject, "minutes_since_displayed");
                this.$notificationLimit.f10141d = com.onesignal.common.e.safeInt(jSONObject, "limit");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return Unit.f5554a;
            }
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class b extends p implements Function1 {
            final /* synthetic */ b0 $iamLimit;
            final /* synthetic */ b0 $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b0 b0Var, b0 b0Var2) {
                super(1);
                this.$indirectIAMAttributionWindow = b0Var;
                this.$iamLimit = b0Var2;
            }

            public final void invoke(JSONObject jSONObject) {
                jSONObject.getClass();
                this.$indirectIAMAttributionWindow.f10141d = com.onesignal.common.e.safeInt(jSONObject, "minutes_since_displayed");
                this.$iamLimit.f10141d = com.onesignal.common.e.safeInt(jSONObject, "limit");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return Unit.f5554a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function1 {
        final /* synthetic */ b0 $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var) {
            super(1);
            this.$fcmParams = b0Var;
        }

        public final void invoke(JSONObject jSONObject) {
            jSONObject.getClass();
            b0 b0Var = this.$fcmParams;
            String safeString = com.onesignal.common.e.safeString(jSONObject, "api_key");
            b0Var.f10141d = new fa.a(com.onesignal.common.e.safeString(jSONObject, "project_id"), com.onesignal.common.e.safeString(jSONObject, "app_id"), safeString);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return Unit.f5554a;
        }
    }
}
