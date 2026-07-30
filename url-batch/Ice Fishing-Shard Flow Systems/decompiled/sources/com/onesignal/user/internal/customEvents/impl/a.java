package com.onesignal.user.internal.customEvents.impl;

import com.onesignal.core.internal.http.impl.e;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import r2.C0846a;

/* loaded from: classes.dex */
public final class a implements S3.a {
    private final C2.c httpClient;

    /* renamed from: com.onesignal.user.internal.customEvents.impl.a$a, reason: collision with other inner class name */
    public static final class C0079a extends X5.c {
        int label;
        /* synthetic */ Object result;

        public C0079a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendCustomEvent(null, null, null, 0L, null, null, null, null, this);
        }
    }

    public a(C2.c httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // S3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendCustomEvent(String str, String str2, String str3, long j, String str4, String str5, c cVar, String str6, V5.b bVar) {
        C0079a c0079a;
        int i2;
        C2.a aVar;
        if (bVar instanceof C0079a) {
            c0079a = (C0079a) bVar;
            int i5 = c0079a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0079a.label = i5 - Integer.MIN_VALUE;
                Object obj = c0079a.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c0079a.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str4);
                    jSONObject.put("onesignal_id", str2);
                    if (str3 != null) {
                        jSONObject.put("external_id", str3);
                    }
                    SimpleDateFormat iso8601Format = com.onesignal.common.b.INSTANCE.iso8601Format();
                    iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
                    Unit unit = Unit.f6114a;
                    jSONObject.put("timestamp", iso8601Format.format(new Long(j)));
                    JSONObject jSONObject2 = str5 != null ? new JSONObject(str5) : new JSONObject();
                    jSONObject2.put("os_sdk", cVar.toJSONObject());
                    jSONObject.put("payload", jSONObject2);
                    JSONObject put = new JSONObject().put("events", new JSONArray().put(jSONObject));
                    Intrinsics.b(put);
                    e eVar = new e(null, null, null, null, str6, 15, null);
                    c0079a.label = 1;
                    obj = this.httpClient.post("apps/" + str + "/custom_events", put, eVar, c0079a);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                aVar = (C2.a) obj;
                if (aVar.isSuccess()) {
                    throw new C0846a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return new F2.a(F2.b.SUCCESS, null, null, null, 14, null);
            }
        }
        c0079a = new C0079a(bVar);
        Object obj2 = c0079a.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = c0079a.label;
        if (i2 != 0) {
        }
        aVar = (C2.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
