package com.onesignal.core.internal.backend.impl;

import U1.h;
import a2.C0224a;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class c implements U1.c {
    private final a2.c _http;

    public static final class a extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.fetchParams(null, null, this);
        }
    }

    public static final class b extends j implements InterfaceC0743l {
        final /* synthetic */ s $influenceParams;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, c cVar) {
            super(1);
            this.$influenceParams = sVar;
            this.this$0 = cVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f5219a;
        }

        public final void invoke(JSONObject it) {
            i.e(it, "it");
            this.$influenceParams.f5233f = this.this$0.processOutcomeJson(it);
        }
    }

    /* renamed from: com.onesignal.core.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0014c extends j implements InterfaceC0743l {
        final /* synthetic */ s $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0014c(s sVar) {
            super(1);
            this.$fcmParams = sVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f5219a;
        }

        public final void invoke(JSONObject it) {
            i.e(it, "it");
            s sVar = this.$fcmParams;
            String safeString = com.onesignal.common.e.safeString(it, "api_key");
            sVar.f5233f = new U1.a(com.onesignal.common.e.safeString(it, "project_id"), com.onesignal.common.e.safeString(it, "app_id"), safeString);
        }
    }

    public static final class d extends j implements InterfaceC0743l {
        final /* synthetic */ s $remoteLoggingParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s sVar) {
            super(1);
            this.$remoteLoggingParams = sVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f5219a;
        }

        public final void invoke(JSONObject it) {
            i.e(it, "it");
            i2.c fromString = i2.c.Companion.fromString(com.onesignal.common.e.safeString(it, "log_level"));
            this.$remoteLoggingParams.f5233f = new h(fromString, false, 2, null);
        }
    }

    public static final class e extends j implements InterfaceC0743l {
        final /* synthetic */ s $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(s sVar) {
            super(1);
            this.$isDirectEnabled = sVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f5219a;
        }

        public final void invoke(JSONObject it) {
            i.e(it, "it");
            this.$isDirectEnabled.f5233f = com.onesignal.common.e.safeBool(it, "enabled");
        }
    }

    public static final class f extends j implements InterfaceC0743l {
        final /* synthetic */ s $iamLimit;
        final /* synthetic */ s $indirectIAMAttributionWindow;
        final /* synthetic */ s $indirectNotificationAttributionWindow;
        final /* synthetic */ s $isIndirectEnabled;
        final /* synthetic */ s $notificationLimit;

        public static final class a extends j implements InterfaceC0743l {
            final /* synthetic */ s $indirectNotificationAttributionWindow;
            final /* synthetic */ s $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar, s sVar2) {
                super(1);
                this.$indirectNotificationAttributionWindow = sVar;
                this.$notificationLimit = sVar2;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return v.f5219a;
            }

            public final void invoke(JSONObject it) {
                i.e(it, "it");
                this.$indirectNotificationAttributionWindow.f5233f = com.onesignal.common.e.safeInt(it, "minutes_since_displayed");
                this.$notificationLimit.f5233f = com.onesignal.common.e.safeInt(it, "limit");
            }
        }

        public static final class b extends j implements InterfaceC0743l {
            final /* synthetic */ s $iamLimit;
            final /* synthetic */ s $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s sVar, s sVar2) {
                super(1);
                this.$indirectIAMAttributionWindow = sVar;
                this.$iamLimit = sVar2;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return v.f5219a;
            }

            public final void invoke(JSONObject it) {
                i.e(it, "it");
                this.$indirectIAMAttributionWindow.f5233f = com.onesignal.common.e.safeInt(it, "minutes_since_displayed");
                this.$iamLimit.f5233f = com.onesignal.common.e.safeInt(it, "limit");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s sVar, s sVar2, s sVar3, s sVar4, s sVar5) {
            super(1);
            this.$isIndirectEnabled = sVar;
            this.$indirectNotificationAttributionWindow = sVar2;
            this.$notificationLimit = sVar3;
            this.$indirectIAMAttributionWindow = sVar4;
            this.$iamLimit = sVar5;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f5219a;
        }

        public final void invoke(JSONObject indirectJSON) {
            i.e(indirectJSON, "indirectJSON");
            this.$isIndirectEnabled.f5233f = com.onesignal.common.e.safeBool(indirectJSON, "enabled");
            com.onesignal.common.e.expandJSONObject(indirectJSON, "notification_attribution", new a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            com.onesignal.common.e.expandJSONObject(indirectJSON, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    public static final class g extends j implements InterfaceC0743l {
        final /* synthetic */ s $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(s sVar) {
            super(1);
            this.$isUnattributedEnabled = sVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return v.f5219a;
        }

        public final void invoke(JSONObject it) {
            i.e(it, "it");
            this.$isUnattributedEnabled.f5233f = com.onesignal.common.e.safeBool(it, "enabled");
        }
    }

    public c(a2.c _http) {
        i.e(_http, "_http");
        this._http = _http;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U1.d processOutcomeJson(JSONObject jSONObject) {
        s sVar = new s();
        s sVar2 = new s();
        s sVar3 = new s();
        s sVar4 = new s();
        s sVar5 = new s();
        s sVar6 = new s();
        s sVar7 = new s();
        com.onesignal.common.e.expandJSONObject(jSONObject, i3.e.DIRECT_TAG, new e(sVar5));
        com.onesignal.common.e.expandJSONObject(jSONObject, "indirect", new f(sVar6, sVar, sVar2, sVar3, sVar4));
        com.onesignal.common.e.expandJSONObject(jSONObject, "unattributed", new g(sVar7));
        return new U1.d((Integer) sVar.f5233f, (Integer) sVar2.f5233f, (Integer) sVar3.f5233f, (Integer) sVar4.f5233f, (Boolean) sVar5.f5233f, (Boolean) sVar6.f5233f, (Boolean) sVar7.f5233f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // U1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchParams(String str, String str2, InterfaceC0564d interfaceC0564d) {
        a aVar;
        int i7;
        c cVar;
        C0224a c0224a;
        if (interfaceC0564d instanceof a) {
            aVar = (a) interfaceC0564d;
            int i8 = aVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.label = i8 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = aVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
                    StringBuilder sb = new StringBuilder("apps/");
                    sb.append(str);
                    sb.append("/android_params.js");
                    String sb2 = sb.toString();
                    if (str2 != null && !com.onesignal.common.d.INSTANCE.isLocalId(str2)) {
                        sb2 = sb2 + "?player_id=" + str2;
                    }
                    a2.c cVar2 = this._http;
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e("CACHE_KEY_REMOTE_PARAMS", null, null, null, null, 30, null);
                    aVar.L$0 = this;
                    aVar.label = 1;
                    obj = cVar2.get(sb2, eVar, aVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    cVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (c) aVar.L$0;
                    AbstractC0676f.w(obj);
                }
                c0224a = (C0224a) obj;
                if (c0224a.isSuccess()) {
                    throw new P1.a(c0224a.getStatusCode(), c0224a.getPayload(), c0224a.getRetryAfterSeconds());
                }
                String payload = c0224a.getPayload();
                try {
                    JSONObject jSONObject = new JSONObject(payload == null ? "" : payload);
                    s sVar = new s();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "outcomes", new b(sVar, cVar));
                    s sVar2 = new s();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "fcm", new C0014c(sVar2));
                    s sVar3 = new s();
                    com.onesignal.common.e.expandJSONObject(jSONObject, "logging_config", new d(sVar3));
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
                    U1.d dVar = (U1.d) sVar.f5233f;
                    U1.d dVar2 = dVar == null ? new U1.d(null, null, null, null, null, null, null, 127, null) : dVar;
                    U1.a aVar2 = (U1.a) sVar2.f5233f;
                    U1.a aVar3 = aVar2 == null ? new U1.a(null, null, null, 7, null) : aVar2;
                    h hVar = (h) sVar3.f5233f;
                    if (hVar == null) {
                        hVar = new h(null, false, 3, null);
                    }
                    return new U1.e(safeString, safeBool, safeBool2, optJSONArray, safeBool3, safeBool4, safeBool5, safeBool6, safeBool7, safeBool8, safeBool9, safeBool10, safeLong, dVar2, aVar3, hVar);
                } catch (JSONException e4) {
                    com.onesignal.debug.internal.logging.b.warn("ParamsBackendService.fetchParams: malformed (non-JSON) response payload, will retry. status=" + c0224a.getStatusCode(), e4);
                    throw new P1.a(c0224a.getStatusCode(), payload, c0224a.getRetryAfterSeconds());
                }
            }
        }
        aVar = new a(interfaceC0564d);
        Object obj2 = aVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = aVar.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }
}
