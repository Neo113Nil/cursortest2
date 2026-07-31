package com.onesignal.notifications.internal.backend.impl;

import W4.o;
import a2.C0224a;
import a2.c;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements I2.a {
    private final c _httpClient;

    /* renamed from: com.onesignal.notifications.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0057a extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public C0057a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsOpened(null, null, null, null, this);
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
            return a.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public a(c _httpClient) {
        i.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // I2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, Y1.a aVar, InterfaceC0564d interfaceC0564d) {
        C0057a c0057a;
        int i7;
        C0224a c0224a;
        if (interfaceC0564d instanceof C0057a) {
            c0057a = (C0057a) interfaceC0564d;
            int i8 = c0057a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0057a.label = i8 - Integer.MIN_VALUE;
                C0057a c0057a2 = c0057a;
                Object obj = c0057a2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0057a2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", str);
                    jSONObject.put("player_id", str3);
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", aVar.getValue());
                    c cVar = this._httpClient;
                    String h7 = C1.c.h("notifications/", str2);
                    c0057a2.label = 1;
                    obj = a2.b.put$default(cVar, h7, jSONObject, null, c0057a2, 4, null);
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
        c0057a = new C0057a(interfaceC0564d);
        C0057a c0057a22 = c0057a;
        Object obj2 = c0057a22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0057a22.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // I2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, Y1.a aVar, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        C0224a c0224a;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", aVar.getValue());
                    i.d(put, "put(...)");
                    c cVar = this._httpClient;
                    String e4 = o.e("notifications/", str2, "/report_received");
                    bVar2.label = 1;
                    obj = a2.b.put$default(cVar, e4, put, null, bVar2, 4, null);
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
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar22.label;
        if (i7 != 0) {
        }
        c0224a = (C0224a) obj2;
        if (c0224a.isSuccess()) {
        }
    }
}
