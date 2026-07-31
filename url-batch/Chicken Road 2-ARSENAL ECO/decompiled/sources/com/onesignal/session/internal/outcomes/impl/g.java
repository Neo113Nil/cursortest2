package com.onesignal.session.internal.outcomes.impl;

import a2.C0224a;
import k5.v;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class g implements b {
    private final a2.c _http;

    public static final class a extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public g(a2.c _http) {
        kotlin.jvm.internal.i.e(_http, "_http");
        this._http = _http;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, e eVar, InterfaceC0564d interfaceC0564d) {
        a aVar;
        int i7;
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
                    JSONObject put = new JSONObject().put("app_id", str).put("onesignal_id", str2).put("subscription", new JSONObject().put("id", str3).put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, str4));
                    if (bool != null) {
                        put.put(i3.e.DIRECT_TAG, bool.booleanValue());
                    }
                    if (eVar.getNotificationIds() != null && eVar.getNotificationIds().length() > 0) {
                        put.put(i3.e.NOTIFICATIONS_IDS, eVar.getNotificationIds());
                    }
                    put.put("id", eVar.getName());
                    if (eVar.getWeight() > 0.0f) {
                        put.put("weight", new Float(eVar.getWeight()));
                    }
                    if (eVar.getTimestamp() > 0) {
                        put.put("timestamp", eVar.getTimestamp());
                    }
                    if (eVar.getSessionTime() > 0) {
                        put.put("session_time", eVar.getSessionTime());
                    }
                    a2.c cVar = this._http;
                    aVar.label = 1;
                    obj = a2.b.post$default(cVar, "outcomes/measure", put, null, aVar, 4, null);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                c0224a = (C0224a) obj;
                if (c0224a.isSuccess()) {
                    throw new P1.a(c0224a.getStatusCode(), c0224a.getPayload(), c0224a.getRetryAfterSeconds());
                }
                return v.f5219a;
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
