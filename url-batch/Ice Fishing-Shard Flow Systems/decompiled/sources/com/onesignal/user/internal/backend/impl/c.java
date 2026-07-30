package com.onesignal.user.internal.backend.impl;

import P3.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.H;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import o2.C0800b;
import org.json.JSONObject;
import r2.C0846a;

/* loaded from: classes.dex */
public final class c implements P3.c {
    private final C2.c _httpClient;

    public static final class a extends X5.c {
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.createSubscription(null, null, null, null, null, this);
        }
    }

    public static final class b extends X5.c {
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.deleteSubscription(null, null, null, this);
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0078c extends X5.c {
        int label;
        /* synthetic */ Object result;

        public C0078c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.getIdentityFromSubscription(null, null, this);
        }
    }

    public static final class d extends X5.c {
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.transferSubscription(null, null, null, null, null, this);
        }
    }

    public static final class e extends X5.c {
        int label;
        /* synthetic */ Object result;

        public e(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.updateSubscription(null, null, null, null, this);
        }
    }

    public c(C2.c _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // P3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, h hVar, String str4, V5.b bVar) {
        a aVar;
        int i2;
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
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    Intrinsics.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    aVar.label = 1;
                    obj = this._httpClient.post("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", put, eVar, aVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                aVar2 = (C2.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C0846a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                JSONObject safeJSONObject = jSONObject != null ? com.onesignal.common.e.safeJSONObject(jSONObject, "subscription") : null;
                if (safeJSONObject == null || !safeJSONObject.has("id")) {
                    return null;
                }
                String safeString = com.onesignal.common.e.safeString(jSONObject, "ryw_token");
                return new Pair(safeJSONObject.getString("id"), safeString != null ? new C0800b(safeString, com.onesignal.common.e.safeLong(jSONObject, "ryw_delay")) : null);
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, String str3, V5.b bVar) {
        b bVar2;
        int i2;
        C2.a aVar;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str3, 15, null);
                    bVar2.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/subscriptions/" + str2, eVar, bVar2);
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
                return Unit.f6114a;
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        aVar = (C2.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // P3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, V5.b bVar) {
        C0078c c0078c;
        int i2;
        C2.a aVar;
        Map<String, Object> map;
        if (bVar instanceof C0078c) {
            c0078c = (C0078c) bVar;
            int i5 = c0078c.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0078c.label = i5 - Integer.MIN_VALUE;
                C0078c c0078c2 = c0078c;
                Object obj = c0078c2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c0078c2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    c0078c2.label = 1;
                    obj = C2.b.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, c0078c2, 2, null);
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
                String payload = aVar.getPayload();
                Intrinsics.b(payload);
                JSONObject safeJSONObject = com.onesignal.common.e.safeJSONObject(new JSONObject(payload), T3.c.IDENTITY_NAME_SPACE);
                if (safeJSONObject == null || (map = com.onesignal.common.e.toMap(safeJSONObject)) == null) {
                    return I.c();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(H.a(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        c0078c = new C0078c(bVar);
        C0078c c0078c22 = c0078c;
        Object obj2 = c0078c22.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = c0078c22.label;
        if (i2 != 0) {
        }
        aVar = (C2.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, String str5, V5.b bVar) {
        d dVar;
        int i2;
        C2.a aVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i5 = dVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar.label = i5 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = dVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    JSONObject put = new JSONObject().put(T3.c.IDENTITY_NAME_SPACE, new JSONObject().put(str3, str4));
                    Intrinsics.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str5, 15, null);
                    dVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2 + "/owner", put, eVar, dVar);
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
                return Unit.f6114a;
            }
        }
        dVar = new d(bVar);
        Object obj2 = dVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = dVar.label;
        if (i2 != 0) {
        }
        aVar = (C2.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, h hVar, String str3, V5.b bVar) {
        e eVar;
        int i2;
        C2.a aVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i5 = eVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.label = i5 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = eVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    Intrinsics.b(put);
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str3, 15, null);
                    eVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2, put, eVar2, eVar);
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
                String payload = aVar.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? com.onesignal.common.e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? com.onesignal.common.e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new C0800b(safeString, safeLong);
                }
                return null;
            }
        }
        eVar = new e(bVar);
        Object obj2 = eVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = eVar.label;
        if (i2 != 0) {
        }
        aVar = (C2.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
