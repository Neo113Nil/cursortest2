package com.onesignal.user.internal.customEvents.impl;

import a2.C0224a;
import com.onesignal.core.internal.http.impl.e;
import d2.C0317a;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.EnumC0580a;
import q3.InterfaceC0599a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements InterfaceC0599a {
    private final a2.c httpClient;

    /* renamed from: com.onesignal.user.internal.customEvents.impl.a$a, reason: collision with other inner class name */
    public static final class C0079a extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public C0079a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendCustomEvent(null, null, null, 0L, null, null, null, null, this);
        }
    }

    public a(a2.c httpClient) {
        i.e(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // q3.InterfaceC0599a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendCustomEvent(String str, String str2, String str3, long j4, String str4, String str5, c cVar, String str6, InterfaceC0564d interfaceC0564d) {
        C0079a c0079a;
        int i7;
        C0224a c0224a;
        if (interfaceC0564d instanceof C0079a) {
            c0079a = (C0079a) interfaceC0564d;
            int i8 = c0079a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0079a.label = i8 - Integer.MIN_VALUE;
                Object obj = c0079a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0079a.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str4);
                    jSONObject.put("onesignal_id", str2);
                    if (str3 != null) {
                        jSONObject.put("external_id", str3);
                    }
                    SimpleDateFormat iso8601Format = com.onesignal.common.b.INSTANCE.iso8601Format();
                    iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
                    jSONObject.put("timestamp", iso8601Format.format(new Long(j4)));
                    JSONObject jSONObject2 = str5 != null ? new JSONObject(str5) : new JSONObject();
                    jSONObject2.put("os_sdk", cVar.toJSONObject());
                    jSONObject.put("payload", jSONObject2);
                    JSONObject put = new JSONObject().put("events", new JSONArray().put(jSONObject));
                    i.b(put);
                    e eVar = new e(null, null, null, null, str6, 15, null);
                    c0079a.label = 1;
                    obj = this.httpClient.post("apps/" + str + "/custom_events", put, eVar, c0079a);
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
                return new C0317a(d2.b.SUCCESS, null, null, null, 14, null);
            }
        }
        c0079a = new C0079a(interfaceC0564d);
        Object obj2 = c0079a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0079a.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }
}
