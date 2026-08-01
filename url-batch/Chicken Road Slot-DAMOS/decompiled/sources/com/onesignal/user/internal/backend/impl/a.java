package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.o0;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements uc.b {
    private final ka.c _httpClient;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.user.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0066a extends nd.c {
        int label;
        /* synthetic */ Object result;

        public C0066a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.deleteAlias(null, null, null, null, this);
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
            return a.this.setAlias(null, null, null, null, this);
        }
    }

    public a(ka.c cVar) {
        cVar.getClass();
        this._httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // uc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, ld.a aVar) {
        C0066a c0066a;
        int i3;
        ka.a aVar2;
        if (aVar instanceof C0066a) {
            c0066a = (C0066a) aVar;
            int i10 = c0066a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0066a.label = i10 - Integer.MIN_VALUE;
                C0066a c0066a2 = c0066a;
                Object obj = c0066a2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = c0066a2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ka.c cVar = this._httpClient;
                    StringBuilder sb2 = new StringBuilder("apps/");
                    sb2.append(str);
                    sb2.append("/users/by/");
                    sb2.append(str2);
                    sb2.append('/');
                    String p4 = v4.a.p(sb2, str3, "/identity/", str4);
                    c0066a2.label = 1;
                    obj = ka.b.delete$default(cVar, p4, null, c0066a2, 2, null);
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
        c0066a = new C0066a(aVar);
        C0066a c0066a22 = c0066a;
        Object obj2 = c0066a22.result;
        md.a aVar32 = md.a.f6622d;
        i3 = c0066a22.label;
        if (i3 != 0) {
        }
        aVar2 = (ka.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // uc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, ld.a aVar) {
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
                    JSONObject put = new JSONObject().put("identity", e.putMap(new JSONObject(), map));
                    put.getClass();
                    bVar2.label = 1;
                    obj = ka.b.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", put, null, bVar2, 4, null);
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
                JSONObject jSONObject = new JSONObject(payload).getJSONObject("identity");
                jSONObject.getClass();
                Map<String, Object> map2 = e.toMap(jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(map2.size()));
                Iterator<T> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
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
}
