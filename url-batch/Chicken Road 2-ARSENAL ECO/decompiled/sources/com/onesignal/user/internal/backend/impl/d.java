package com.onesignal.user.internal.backend.impl;

import W4.o;
import a2.C0224a;
import com.onesignal.common.e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import n3.C0547e;
import n3.C0548f;
import n3.C0550h;
import n3.InterfaceC0546d;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class d implements InterfaceC0546d {
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
            return d.this.createUser(null, null, null, null, null, this);
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
            return d.this.getUser(null, null, null, null, this);
        }
    }

    public static final class c extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.updateUser(null, null, null, null, false, null, null, this);
        }
    }

    public d(a2.c _httpClient) {
        i.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n3.InterfaceC0546d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<C0550h> list, Map<String, String> map2, String str2, InterfaceC0564d interfaceC0564d) {
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
                    JSONObject jSONObject = new JSONObject();
                    if (!map.isEmpty()) {
                        jSONObject.put(r3.c.IDENTITY_NAME_SPACE, e.putMap(new JSONObject(), map));
                    }
                    if (!list.isEmpty()) {
                        jSONObject.put("subscriptions", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(list));
                    }
                    if (!map2.isEmpty()) {
                        jSONObject.put("properties", e.putMap(new JSONObject(), map2));
                    }
                    jSONObject.put("refresh_device_metadata", true);
                    a2.c cVar = this._httpClient;
                    String e4 = o.e("apps/", str, "/users");
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str2, 15, null);
                    aVar.label = 1;
                    obj = cVar.post(e4, jSONObject, eVar, aVar);
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
                com.onesignal.user.internal.backend.impl.b bVar = com.onesignal.user.internal.backend.impl.b.INSTANCE;
                String payload = c0224a.getPayload();
                i.b(payload);
                return bVar.convertToCreateUserResponse(new JSONObject(payload));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n3.InterfaceC0546d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, String str4, InterfaceC0564d interfaceC0564d) {
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
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.get("apps/" + str + "/users/by/" + str2 + '/' + str3, eVar, bVar);
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
                return com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToCreateUserResponse(new JSONObject(c0224a.getPayload()));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n3.InterfaceC0546d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, C0548f c0548f, boolean z5, C0547e c0547e, String str4, InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        C0224a c0224a;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i8 = cVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.label = i8 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    JSONObject put = new JSONObject().put("refresh_device_metadata", z5);
                    if (c0548f.getHasAtLeastOnePropertySet()) {
                        put.put("properties", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(c0548f));
                    }
                    if (c0547e.getHasAtLeastOnePropertySet()) {
                        put.put("deltas", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(c0547e));
                    }
                    i.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    cVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3, put, eVar, cVar);
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
                String safeString = jSONObject != null ? e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new M1.b(safeString, safeLong);
                }
                return null;
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }
}
