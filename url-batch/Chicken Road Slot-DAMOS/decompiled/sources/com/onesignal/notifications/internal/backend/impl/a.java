package com.onesignal.notifications.internal.backend.impl;

import ka.c;
import kotlin.Unit;
import kotlin.collections.i0;
import n0.l;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements tb.a {
    private final c _httpClient;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0049a extends nd.c {
        int label;
        /* synthetic */ Object result;

        public C0049a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsOpened(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public a(c cVar) {
        cVar.getClass();
        this._httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // tb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, ja.a aVar, ld.a aVar2) {
        C0049a c0049a;
        int i3;
        ka.a aVar3;
        if (aVar2 instanceof C0049a) {
            c0049a = (C0049a) aVar2;
            int i10 = c0049a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0049a.label = i10 - Integer.MIN_VALUE;
                C0049a c0049a2 = c0049a;
                Object obj = c0049a2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = c0049a2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", str);
                    jSONObject.put("player_id", str3);
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", aVar.getValue());
                    c cVar = this._httpClient;
                    String k10 = v4.a.k("notifications/", str2);
                    c0049a2.label = 1;
                    obj = ka.b.put$default(cVar, k10, jSONObject, null, c0049a2, 4, null);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                aVar3 = (ka.a) obj;
                if (aVar3.isSuccess()) {
                    throw new z9.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
                }
                return Unit.f5554a;
            }
        }
        c0049a = new C0049a(aVar2);
        C0049a c0049a22 = c0049a;
        Object obj2 = c0049a22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = c0049a22.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // tb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, ja.a aVar, ld.a aVar2) {
        b bVar;
        int i3;
        ka.a aVar3;
        if (aVar2 instanceof b) {
            bVar = (b) aVar2;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = bVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", aVar.getValue());
                    put.getClass();
                    c cVar = this._httpClient;
                    String g = l.g("notifications/", str2, "/report_received");
                    bVar2.label = 1;
                    obj = ka.b.put$default(cVar, g, put, null, bVar2, 4, null);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                aVar3 = (ka.a) obj;
                if (aVar3.isSuccess()) {
                    throw new z9.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
                }
                return Unit.f5554a;
            }
        }
        bVar = new b(aVar2);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = bVar22.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }
}
