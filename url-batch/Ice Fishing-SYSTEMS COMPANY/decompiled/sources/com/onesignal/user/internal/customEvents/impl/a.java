package com.onesignal.user.internal.customEvents.impl;

import com.anythink.expressad.foundation.d.d;
import com.bumptech.glide.f;
import com.onesignal.core.internal.http.impl.e;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONObject;
import p4.C4860a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements P5.a {
    private final A4.c httpClient;

    /* renamed from: com.onesignal.user.internal.customEvents.impl.a$a, reason: collision with other inner class name */
    public static final class C0248a extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public C0248a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendCustomEvent(null, null, null, 0L, null, null, null, null, this);
        }
    }

    public a(A4.c httpClient) {
        h.e(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // P5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendCustomEvent(String str, String str2, String str3, long j9, String str4, String str5, c cVar, String str6, InterfaceC5133d interfaceC5133d) {
        C0248a c0248a;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof C0248a) {
            c0248a = (C0248a) interfaceC5133d;
            int i4 = c0248a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0248a.label = i4 - Integer.MIN_VALUE;
                Object obj = c0248a.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0248a.label;
                if (i != 0) {
                    f.r(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str4);
                    jSONObject.put("onesignal_id", str2);
                    if (str3 != null) {
                        jSONObject.put("external_id", str3);
                    }
                    SimpleDateFormat iso8601Format = com.onesignal.common.b.INSTANCE.iso8601Format();
                    iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
                    jSONObject.put(d.f18754u, iso8601Format.format(new Long(j9)));
                    JSONObject jSONObject2 = str5 != null ? new JSONObject(str5) : new JSONObject();
                    jSONObject2.put("os_sdk", cVar.toJSONObject());
                    jSONObject.put("payload", jSONObject2);
                    JSONObject put = new JSONObject().put("events", new JSONArray().put(jSONObject));
                    h.b(put);
                    e eVar = new e(null, null, null, null, str6, 15, null);
                    c0248a.label = 1;
                    obj = this.httpClient.post("apps/" + str + "/custom_events", put, eVar, c0248a);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                aVar = (A4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C4860a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
            }
        }
        c0248a = new C0248a(interfaceC5133d);
        Object obj2 = c0248a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0248a.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
