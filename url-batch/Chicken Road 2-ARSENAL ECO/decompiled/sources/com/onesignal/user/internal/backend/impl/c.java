package com.onesignal.user.internal.backend.impl;

import a2.C0224a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k5.C0477g;
import k5.v;
import kotlin.jvm.internal.i;
import l5.q;
import l5.t;
import n3.C0550h;
import n3.InterfaceC0545c;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class c implements InterfaceC0545c {
    private final a2.c _httpClient;

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
            return c.this.createSubscription(null, null, null, null, null, this);
        }
    }

    public static final class b extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.deleteSubscription(null, null, null, this);
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0078c extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public C0078c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.getIdentityFromSubscription(null, null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.transferSubscription(null, null, null, null, null, this);
        }
    }

    public static final class e extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.updateSubscription(null, null, null, null, this);
        }
    }

    public c(a2.c _httpClient) {
        i.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // n3.InterfaceC0545c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, C0550h c0550h, String str4, InterfaceC0564d interfaceC0564d) {
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
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(c0550h));
                    i.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    aVar.label = 1;
                    obj = this._httpClient.post("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", put, eVar, aVar);
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
                String payload = c0224a.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                JSONObject safeJSONObject = jSONObject != null ? com.onesignal.common.e.safeJSONObject(jSONObject, "subscription") : null;
                if (safeJSONObject == null || !safeJSONObject.has("id")) {
                    return null;
                }
                String safeString = com.onesignal.common.e.safeString(jSONObject, "ryw_token");
                return new C0477g(safeJSONObject.getString("id"), safeString != null ? new M1.b(safeString, com.onesignal.common.e.safeLong(jSONObject, "ryw_delay")) : null);
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n3.InterfaceC0545c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, String str3, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        C0224a c0224a;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str3, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/subscriptions/" + str2, eVar, bVar);
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
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // n3.InterfaceC0545c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, InterfaceC0564d interfaceC0564d) {
        C0078c c0078c;
        int i7;
        C0224a c0224a;
        Map<String, Object> map;
        if (interfaceC0564d instanceof C0078c) {
            c0078c = (C0078c) interfaceC0564d;
            int i8 = c0078c.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0078c.label = i8 - Integer.MIN_VALUE;
                C0078c c0078c2 = c0078c;
                Object obj = c0078c2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0078c2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    c0078c2.label = 1;
                    obj = a2.b.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, c0078c2, 2, null);
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
                String payload = c0224a.getPayload();
                i.b(payload);
                JSONObject safeJSONObject = com.onesignal.common.e.safeJSONObject(new JSONObject(payload), r3.c.IDENTITY_NAME_SPACE);
                if (safeJSONObject == null || (map = com.onesignal.common.e.toMap(safeJSONObject)) == null) {
                    return q.f5304f;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.p0(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        c0078c = new C0078c(interfaceC0564d);
        C0078c c0078c22 = c0078c;
        Object obj2 = c0078c22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0078c22.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n3.InterfaceC0545c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, String str5, InterfaceC0564d interfaceC0564d) {
        d dVar;
        int i7;
        C0224a c0224a;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i8 = dVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.label = i8 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = dVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    JSONObject put = new JSONObject().put(r3.c.IDENTITY_NAME_SPACE, new JSONObject().put(str3, str4));
                    i.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str5, 15, null);
                    dVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2 + "/owner", put, eVar, dVar);
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
        dVar = new d(interfaceC0564d);
        Object obj2 = dVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = dVar.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n3.InterfaceC0545c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, C0550h c0550h, String str3, InterfaceC0564d interfaceC0564d) {
        e eVar;
        int i7;
        C0224a c0224a;
        if (interfaceC0564d instanceof e) {
            eVar = (e) interfaceC0564d;
            int i8 = eVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.label = i8 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = eVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(c0550h));
                    i.b(put);
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str3, 15, null);
                    eVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2, put, eVar2, eVar);
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
                String payload = c0224a.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? com.onesignal.common.e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? com.onesignal.common.e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new M1.b(safeString, safeLong);
                }
                return null;
            }
        }
        eVar = new e(interfaceC0564d);
        Object obj2 = eVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }
}
