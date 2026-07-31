package com.onesignal.user.internal.backend.impl;

import a2.C0224a;
import com.onesignal.core.internal.http.impl.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k5.v;
import kotlin.jvm.internal.i;
import l5.t;
import n3.InterfaceC0544b;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements InterfaceC0544b {
    private final a2.c _httpClient;

    /* renamed from: com.onesignal.user.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0076a extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public C0076a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.deleteAlias(null, null, null, null, null, this);
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
            return a.this.setAlias(null, null, null, null, null, this);
        }
    }

    public a(a2.c _httpClient) {
        i.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // n3.InterfaceC0544b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, String str5, InterfaceC0564d interfaceC0564d) {
        C0076a c0076a;
        int i7;
        C0224a c0224a;
        if (interfaceC0564d instanceof C0076a) {
            c0076a = (C0076a) interfaceC0564d;
            int i8 = c0076a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0076a.label = i8 - Integer.MIN_VALUE;
                Object obj = c0076a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0076a.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    e eVar = new e(null, null, null, null, str5, 15, null);
                    c0076a.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity/" + str4, eVar, c0076a);
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
        c0076a = new C0076a(interfaceC0564d);
        Object obj2 = c0076a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0076a.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // n3.InterfaceC0544b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, InterfaceC0564d interfaceC0564d) {
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
                    JSONObject put = new JSONObject().put(r3.c.IDENTITY_NAME_SPACE, com.onesignal.common.e.putMap(new JSONObject(), map));
                    i.b(put);
                    e eVar = new e(null, null, null, null, str4, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", put, eVar, bVar);
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
                JSONObject jSONObject = new JSONObject(payload).getJSONObject(r3.c.IDENTITY_NAME_SPACE);
                i.d(jSONObject, "getJSONObject(...)");
                Map<String, Object> map2 = com.onesignal.common.e.toMap(jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.p0(map2.size()));
                Iterator<T> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
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
}
