package com.onesignal.user.internal.customEvents.impl;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.collections.i0;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements xc.a {
    private final ka.c httpClient;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.user.internal.customEvents.impl.a$a, reason: collision with other inner class name */
    public static final class C0069a extends nd.c {
        int label;
        /* synthetic */ Object result;

        public C0069a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendCustomEvent(null, null, null, 0L, null, null, null, this);
        }
    }

    public a(ka.c cVar) {
        cVar.getClass();
        this.httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendCustomEvent(String str, String str2, String str3, long j, String str4, String str5, c cVar, ld.a aVar) {
        C0069a c0069a;
        int i3;
        ka.a aVar2;
        if (aVar instanceof C0069a) {
            c0069a = (C0069a) aVar;
            int i10 = c0069a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0069a.label = i10 - Integer.MIN_VALUE;
                Object obj = c0069a.result;
                md.a aVar3 = md.a.f6622d;
                i3 = c0069a.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str4);
                    jSONObject.put("onesignal_id", str2);
                    if (str3 != null) {
                        jSONObject.put("external_id", str3);
                    }
                    SimpleDateFormat iso8601Format = com.onesignal.common.b.INSTANCE.iso8601Format();
                    iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
                    jSONObject.put("timestamp", iso8601Format.format(new Long(j)));
                    JSONObject jSONObject2 = str5 != null ? new JSONObject(str5) : new JSONObject();
                    jSONObject2.put("os_sdk", cVar.toJSONObject());
                    jSONObject.put("payload", jSONObject2);
                    JSONObject put = new JSONObject().put("events", new JSONArray().put(jSONObject));
                    put.getClass();
                    c0069a.label = 1;
                    obj = ka.b.post$default(this.httpClient, "apps/" + str + "/custom_events", put, null, c0069a, 4, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                aVar2 = (ka.a) obj;
                if (aVar2.isSuccess()) {
                    throw new z9.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                return new na.a(na.b.SUCCESS, null, null, null, 14, null);
            }
        }
        c0069a = new C0069a(aVar);
        Object obj2 = c0069a.result;
        md.a aVar32 = md.a.f6622d;
        i3 = c0069a.label;
        if (i3 != 0) {
        }
        aVar2 = (ka.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
