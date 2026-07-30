package com.onesignal.notifications.internal.backend.impl;

import C2.c;
import k3.InterfaceC0599a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import r2.C0846a;
import r4.f;

/* loaded from: classes.dex */
public final class a implements InterfaceC0599a {
    private final c _httpClient;

    /* renamed from: com.onesignal.notifications.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0057a extends X5.c {
        int label;
        /* synthetic */ Object result;

        public C0057a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsOpened(null, null, null, null, this);
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
            return a.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public a(c _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // k3.InterfaceC0599a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, A2.a aVar, V5.b bVar) {
        C0057a c0057a;
        int i2;
        C2.a aVar2;
        if (bVar instanceof C0057a) {
            c0057a = (C0057a) bVar;
            int i5 = c0057a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0057a.label = i5 - Integer.MIN_VALUE;
                C0057a c0057a2 = c0057a;
                Object obj = c0057a2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = c0057a2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", str);
                    jSONObject.put("player_id", str3);
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", aVar.getValue());
                    c cVar = this._httpClient;
                    String i7 = f.i("notifications/", str2);
                    c0057a2.label = 1;
                    obj = C2.b.put$default(cVar, i7, jSONObject, null, c0057a2, 4, null);
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
                return Unit.f6114a;
            }
        }
        c0057a = new C0057a(bVar);
        C0057a c0057a22 = c0057a;
        Object obj2 = c0057a22.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = c0057a22.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // k3.InterfaceC0599a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, A2.a aVar, V5.b bVar) {
        b bVar2;
        int i2;
        C2.a aVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                b bVar3 = bVar2;
                Object obj = bVar3.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = bVar3.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", aVar.getValue());
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    c cVar = this._httpClient;
                    String d7 = f.d("notifications/", str2, "/report_received");
                    bVar3.label = 1;
                    obj = C2.b.put$default(cVar, d7, put, null, bVar3, 4, null);
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
                return Unit.f6114a;
            }
        }
        bVar2 = new b(bVar);
        b bVar32 = bVar2;
        Object obj2 = bVar32.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = bVar32.label;
        if (i2 != 0) {
        }
        aVar2 = (C2.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
