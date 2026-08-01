package com.onesignal.user.internal.backend.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.k0;
import kotlin.collections.o0;
import org.json.JSONObject;
import uc.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements uc.c {
    private final ka.c _httpClient;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
        int label;
        /* synthetic */ Object result;

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.createSubscription(null, null, null, null, this);
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
            return c.this.deleteSubscription(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.user.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0068c extends nd.c {
        int label;
        /* synthetic */ Object result;

        public C0068c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.getIdentityFromSubscription(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.transferSubscription(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.c {
        int label;
        /* synthetic */ Object result;

        public e(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.updateSubscription(null, null, null, this);
        }
    }

    public c(ka.c cVar) {
        cVar.getClass();
        this._httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // uc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, h hVar, ld.a aVar) {
        a aVar2;
        int i3;
        ka.a aVar3;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                a aVar4 = aVar2;
                Object obj = aVar4.result;
                md.a aVar5 = md.a.f6622d;
                i3 = aVar4.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    put.getClass();
                    aVar4.label = 1;
                    obj = ka.b.post$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", put, null, aVar4, 4, null);
                    if (obj == aVar5) {
                        return aVar5;
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
                String payload = aVar3.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                JSONObject safeJSONObject = jSONObject != null ? com.onesignal.common.e.safeJSONObject(jSONObject, "subscription") : null;
                if (safeJSONObject == null || !safeJSONObject.has("id")) {
                    return null;
                }
                String safeString = com.onesignal.common.e.safeString(jSONObject, "ryw_token");
                return new Pair(safeJSONObject.getString("id"), safeString != null ? new w9.b(safeString, com.onesignal.common.e.safeLong(jSONObject, "ryw_delay")) : null);
            }
        }
        aVar2 = new a(aVar);
        a aVar42 = aVar2;
        Object obj2 = aVar42.result;
        md.a aVar52 = md.a.f6622d;
        i3 = aVar42.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // uc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, ld.a aVar) {
        b bVar;
        int i3;
        ka.a aVar2;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = bVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    bVar2.label = 1;
                    obj = ka.b.delete$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, null, bVar2, 2, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                aVar2 = (ka.a) obj;
                if (aVar2.isSuccess()) {
                    throw new z9.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                return Unit.f5554a;
            }
        }
        bVar = new b(aVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        md.a aVar32 = md.a.f6622d;
        i3 = bVar22.label;
        if (i3 != 0) {
        }
        aVar2 = (ka.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // uc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, ld.a aVar) {
        C0068c c0068c;
        int i3;
        ka.a aVar2;
        Map<String, Object> map;
        if (aVar instanceof C0068c) {
            c0068c = (C0068c) aVar;
            int i10 = c0068c.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0068c.label = i10 - Integer.MIN_VALUE;
                C0068c c0068c2 = c0068c;
                Object obj = c0068c2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = c0068c2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    c0068c2.label = 1;
                    obj = ka.b.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, c0068c2, 2, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                aVar2 = (ka.a) obj;
                if (aVar2.isSuccess()) {
                    throw new z9.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                payload.getClass();
                JSONObject safeJSONObject = com.onesignal.common.e.safeJSONObject(new JSONObject(payload), "identity");
                if (safeJSONObject == null || (map = com.onesignal.common.e.toMap(safeJSONObject)) == null) {
                    k0 k0Var = k0.f5575d;
                    k0Var.getClass();
                    return k0Var;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        c0068c = new C0068c(aVar);
        C0068c c0068c22 = c0068c;
        Object obj2 = c0068c22.result;
        md.a aVar32 = md.a.f6622d;
        i3 = c0068c22.label;
        if (i3 != 0) {
        }
        aVar2 = (ka.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // uc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, ld.a aVar) {
        d dVar;
        int i3;
        ka.a aVar2;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = dVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    JSONObject put = new JSONObject().put("identity", new JSONObject().put(str3, str4));
                    put.getClass();
                    dVar2.label = 1;
                    obj = ka.b.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/owner", put, null, dVar2, 4, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                aVar2 = (ka.a) obj;
                if (aVar2.isSuccess()) {
                    throw new z9.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                return Unit.f5554a;
            }
        }
        dVar = new d(aVar);
        d dVar22 = dVar;
        Object obj2 = dVar22.result;
        md.a aVar32 = md.a.f6622d;
        i3 = dVar22.label;
        if (i3 != 0) {
        }
        aVar2 = (ka.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // uc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, h hVar, ld.a aVar) {
        e eVar;
        int i3;
        ka.a aVar2;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = eVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    put.getClass();
                    eVar2.label = 1;
                    obj = ka.b.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, put, null, eVar2, 4, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                aVar2 = (ka.a) obj;
                if (aVar2.isSuccess()) {
                    throw new z9.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? com.onesignal.common.e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? com.onesignal.common.e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new w9.b(safeString, safeLong);
                }
                return null;
            }
        }
        eVar = new e(aVar);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        md.a aVar32 = md.a.f6622d;
        i3 = eVar22.label;
        if (i3 != 0) {
        }
        aVar2 = (ka.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
