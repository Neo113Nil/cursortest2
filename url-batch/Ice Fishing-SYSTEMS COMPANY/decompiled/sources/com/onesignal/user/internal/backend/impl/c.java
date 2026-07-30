package com.onesignal.user.internal.backend.impl;

import D.y;
import com.bumptech.glide.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;
import m4.C4781b;
import org.json.JSONObject;
import p4.C4860a;
import q7.C4938g;
import q7.v;
import r7.q;
import r7.t;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class c implements M5.c {
    private final A4.c _httpClient;

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
            return c.this.createSubscription(null, null, null, null, null, this);
        }
    }

    public static final class b extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.deleteSubscription(null, null, null, this);
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0247c extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public C0247c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.getIdentityFromSubscription(null, null, this);
        }
    }

    public static final class d extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.transferSubscription(null, null, null, null, null, this);
        }
    }

    public static final class e extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.updateSubscription(null, null, null, null, this);
        }
    }

    public c(A4.c _httpClient) {
        h.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // M5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, M5.h hVar, String str4, InterfaceC5133d interfaceC5133d) {
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
                    f.r(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    h.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    aVar.label = 1;
                    obj = this._httpClient.post("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", put, eVar, aVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                aVar2 = (A4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C4860a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                JSONObject safeJSONObject = jSONObject != null ? com.onesignal.common.e.safeJSONObject(jSONObject, "subscription") : null;
                if (safeJSONObject == null || !safeJSONObject.has("id")) {
                    return null;
                }
                String safeString = com.onesignal.common.e.safeString(jSONObject, "ryw_token");
                return new C4938g(safeJSONObject.getString("id"), safeString != null ? new C4781b(safeString, com.onesignal.common.e.safeLong(jSONObject, "ryw_delay")) : null);
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, String str3, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    f.r(obj);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str3, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/subscriptions/" + str2, eVar, bVar);
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
                return v.f40183a;
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // M5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, InterfaceC5133d interfaceC5133d) {
        C0247c c0247c;
        int i;
        A4.a aVar;
        Map<String, Object> map;
        if (interfaceC5133d instanceof C0247c) {
            c0247c = (C0247c) interfaceC5133d;
            int i4 = c0247c.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0247c.label = i4 - Integer.MIN_VALUE;
                C0247c c0247c2 = c0247c;
                Object obj = c0247c2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0247c2.label;
                if (i != 0) {
                    f.r(obj);
                    A4.c cVar = this._httpClient;
                    String l9 = y.l("apps/", str, "/subscriptions/", str2, "/user/identity");
                    c0247c2.label = 1;
                    obj = A4.b.get$default(cVar, l9, null, c0247c2, 2, null);
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
                String payload = aVar.getPayload();
                h.b(payload);
                JSONObject safeJSONObject = com.onesignal.common.e.safeJSONObject(new JSONObject(payload), Q5.c.IDENTITY_NAME_SPACE);
                if (safeJSONObject == null || (map = com.onesignal.common.e.toMap(safeJSONObject)) == null) {
                    return q.f40359n;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.z(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        c0247c = new C0247c(interfaceC5133d);
        C0247c c0247c22 = c0247c;
        Object obj2 = c0247c22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0247c22.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, String str5, InterfaceC5133d interfaceC5133d) {
        d dVar;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof d) {
            dVar = (d) interfaceC5133d;
            int i4 = dVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.label = i4 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = dVar.label;
                if (i != 0) {
                    f.r(obj);
                    JSONObject put = new JSONObject().put(Q5.c.IDENTITY_NAME_SPACE, new JSONObject().put(str3, str4));
                    A4.c cVar = this._httpClient;
                    String l9 = y.l("apps/", str, "/subscriptions/", str2, "/owner");
                    h.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str5, 15, null);
                    dVar.label = 1;
                    obj = cVar.patch(l9, put, eVar, dVar);
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
                return v.f40183a;
            }
        }
        dVar = new d(interfaceC5133d);
        Object obj2 = dVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = dVar.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, M5.h hVar, String str3, InterfaceC5133d interfaceC5133d) {
        e eVar;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof e) {
            eVar = (e) interfaceC5133d;
            int i4 = eVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.label = i4 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = eVar.label;
                if (i != 0) {
                    f.r(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    h.b(put);
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str3, 15, null);
                    eVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2, put, eVar2, eVar);
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
                String payload = aVar.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? com.onesignal.common.e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? com.onesignal.common.e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new C4781b(safeString, safeLong);
                }
                return null;
            }
        }
        eVar = new e(interfaceC5133d);
        Object obj2 = eVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = eVar.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
