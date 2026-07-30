package com.onesignal.user.internal.backend.impl;

import com.onesignal.core.internal.http.impl.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.H;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import r2.C0846a;

/* loaded from: classes.dex */
public final class a implements P3.b {
    private final C2.c _httpClient;

    /* renamed from: com.onesignal.user.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0076a extends X5.c {
        int label;
        /* synthetic */ Object result;

        public C0076a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.deleteAlias(null, null, null, null, null, this);
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
            return a.this.setAlias(null, null, null, null, null, this);
        }
    }

    public a(C2.c _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // P3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, String str5, V5.b bVar) {
        C0076a c0076a;
        int i2;
        C2.a aVar;
        if (bVar instanceof C0076a) {
            c0076a = (C0076a) bVar;
            int i5 = c0076a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0076a.label = i5 - Integer.MIN_VALUE;
                Object obj = c0076a.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c0076a.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    e eVar = new e(null, null, null, null, str5, 15, null);
                    c0076a.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity/" + str4, eVar, c0076a);
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
        c0076a = new C0076a(bVar);
        Object obj2 = c0076a.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = c0076a.label;
        if (i2 != 0) {
        }
        aVar = (C2.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // P3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, V5.b bVar) {
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
                    JSONObject put = new JSONObject().put(T3.c.IDENTITY_NAME_SPACE, com.onesignal.common.e.putMap(new JSONObject(), map));
                    Intrinsics.b(put);
                    e eVar = new e(null, null, null, null, str4, 15, null);
                    bVar2.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", put, eVar, bVar2);
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
                JSONObject jSONObject = new JSONObject(payload).getJSONObject(T3.c.IDENTITY_NAME_SPACE);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                Map<String, Object> map2 = com.onesignal.common.e.toMap(jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap(H.a(map2.size()));
                Iterator<T> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
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
}
