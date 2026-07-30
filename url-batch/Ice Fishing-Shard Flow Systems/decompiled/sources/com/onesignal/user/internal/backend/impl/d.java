package com.onesignal.user.internal.backend.impl;

import P3.h;
import com.onesignal.common.e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o2.C0800b;
import org.json.JSONObject;
import r2.C0846a;
import r4.f;

/* loaded from: classes.dex */
public final class d implements P3.d {
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
            return d.this.createUser(null, null, null, null, null, this);
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
            return d.this.getUser(null, null, null, null, this);
        }
    }

    public static final class c extends X5.c {
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.updateUser(null, null, null, null, false, null, null, this);
        }
    }

    public d(C2.c _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<h> list, Map<String, String> map2, String str2, V5.b bVar) {
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
                    JSONObject jSONObject = new JSONObject();
                    if (!map.isEmpty()) {
                        jSONObject.put(T3.c.IDENTITY_NAME_SPACE, e.putMap(new JSONObject(), map));
                    }
                    if (!list.isEmpty()) {
                        jSONObject.put("subscriptions", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(list));
                    }
                    if (!map2.isEmpty()) {
                        jSONObject.put("properties", e.putMap(new JSONObject(), map2));
                    }
                    jSONObject.put("refresh_device_metadata", true);
                    C2.c cVar = this._httpClient;
                    String d7 = f.d("apps/", str, "/users");
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str2, 15, null);
                    aVar.label = 1;
                    obj = cVar.post(d7, jSONObject, eVar, aVar);
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
                com.onesignal.user.internal.backend.impl.b bVar2 = com.onesignal.user.internal.backend.impl.b.INSTANCE;
                String payload = aVar2.getPayload();
                Intrinsics.b(payload);
                return bVar2.convertToCreateUserResponse(new JSONObject(payload));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, String str4, V5.b bVar) {
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
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    bVar2.label = 1;
                    obj = this._httpClient.get("apps/" + str + "/users/by/" + str2 + '/' + str3, eVar, bVar2);
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
                return com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToCreateUserResponse(new JSONObject(aVar.getPayload()));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, P3.f fVar, boolean z7, P3.e eVar, String str4, V5.b bVar) {
        c cVar;
        int i2;
        C2.a aVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i5 = cVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.label = i5 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = cVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    JSONObject put = new JSONObject().put("refresh_device_metadata", z7);
                    if (fVar.getHasAtLeastOnePropertySet()) {
                        put.put("properties", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(fVar));
                    }
                    if (eVar.getHasAtLeastOnePropertySet()) {
                        put.put("deltas", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(eVar));
                    }
                    Intrinsics.b(put);
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    cVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3, put, eVar2, cVar);
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
                String safeString = jSONObject != null ? e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new C0800b(safeString, safeLong);
                }
                return null;
            }
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = cVar.label;
        if (i2 != 0) {
        }
        aVar = (C2.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
