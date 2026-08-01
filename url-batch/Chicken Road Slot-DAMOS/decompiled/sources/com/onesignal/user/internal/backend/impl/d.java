package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.e;
import java.util.List;
import java.util.Map;
import kotlin.collections.i0;
import n0.l;
import org.json.JSONObject;
import uc.f;
import uc.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements uc.d {
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
            return d.this.createUser(null, null, null, null, this);
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
            return d.this.getUser(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.updateUser(null, null, null, null, false, null, this);
        }
    }

    public d(ka.c cVar) {
        cVar.getClass();
        this._httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // uc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<h> list, Map<String, String> map2, ld.a aVar) {
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
                    JSONObject jSONObject = new JSONObject();
                    if (!map.isEmpty()) {
                        jSONObject.put("identity", e.putMap(new JSONObject(), map));
                    }
                    if (!list.isEmpty()) {
                        jSONObject.put("subscriptions", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(list));
                    }
                    if (!map2.isEmpty()) {
                        jSONObject.put("properties", e.putMap(new JSONObject(), map2));
                    }
                    jSONObject.put("refresh_device_metadata", true);
                    ka.c cVar = this._httpClient;
                    String g = l.g("apps/", str, "/users");
                    aVar4.label = 1;
                    obj = ka.b.post$default(cVar, g, jSONObject, null, aVar4, 4, null);
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
                com.onesignal.user.internal.backend.impl.b bVar = com.onesignal.user.internal.backend.impl.b.INSTANCE;
                String payload = aVar3.getPayload();
                payload.getClass();
                return bVar.convertToCreateUserResponse(new JSONObject(payload));
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // uc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, ld.a aVar) {
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
                    obj = ka.b.get$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, null, bVar2, 2, null);
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
                return com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToCreateUserResponse(new JSONObject(aVar2.getPayload()));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // uc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, f fVar, boolean z10, uc.e eVar, ld.a aVar) {
        c cVar;
        int i3;
        ka.a aVar2;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                md.a aVar3 = md.a.f6622d;
                i3 = cVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    JSONObject put = new JSONObject().put("refresh_device_metadata", z10);
                    if (fVar.getHasAtLeastOnePropertySet()) {
                        put.put("properties", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(fVar));
                    }
                    if (eVar.getHasAtLeastOnePropertySet()) {
                        put.put("deltas", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(eVar));
                    }
                    put.getClass();
                    cVar.label = 1;
                    obj = ka.b.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, put, null, cVar, 4, null);
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
                String safeString = jSONObject != null ? e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new w9.b(safeString, safeLong);
                }
                return null;
            }
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = cVar.label;
        if (i3 != 0) {
        }
        aVar2 = (ka.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
