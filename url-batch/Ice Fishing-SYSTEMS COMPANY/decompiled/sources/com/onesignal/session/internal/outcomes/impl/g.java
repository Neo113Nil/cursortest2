package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONObject;
import p4.C4860a;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class g implements b {
    private final A4.c _http;

    public static final class a extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public g(A4.c _http) {
        kotlin.jvm.internal.h.e(_http, "_http");
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
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, e eVar, InterfaceC5133d interfaceC5133d) {
        a aVar;
        int i;
        A4.a aVar2;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("onesignal_id", str2).put("subscription", new JSONObject().put("id", str3).put("type", str4));
                    if (bool != null) {
                        put.put(H5.e.DIRECT_TAG, bool.booleanValue());
                    }
                    if (eVar.getNotificationIds() != null && eVar.getNotificationIds().length() > 0) {
                        put.put(H5.e.NOTIFICATIONS_IDS, eVar.getNotificationIds());
                    }
                    put.put("id", eVar.getName());
                    if (eVar.getWeight() > 0.0f) {
                        put.put("weight", new Float(eVar.getWeight()));
                    }
                    if (eVar.getTimestamp() > 0) {
                        put.put(com.anythink.expressad.foundation.d.d.f18754u, eVar.getTimestamp());
                    }
                    if (eVar.getSessionTime() > 0) {
                        put.put("session_time", eVar.getSessionTime());
                    }
                    A4.c cVar = this._http;
                    aVar.label = 1;
                    obj = A4.b.post$default(cVar, "outcomes/measure", put, null, aVar, 4, null);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                aVar2 = (A4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C4860a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                return v.f40183a;
            }
        }
        aVar = new a(interfaceC5133d);
        Object obj2 = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        if (i != 0) {
        }
        aVar2 = (A4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
