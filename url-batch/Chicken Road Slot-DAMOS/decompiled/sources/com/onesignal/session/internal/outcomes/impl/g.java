package com.onesignal.session.internal.outcomes.impl;

import kotlin.Unit;
import kotlin.collections.i0;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements b {
    private final ka.c _http;

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
            return g.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public g(ka.c cVar) {
        cVar.getClass();
        this._http = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, e eVar, ld.a aVar) {
        a aVar2;
        int i3;
        ka.a aVar3;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = aVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("onesignal_id", str2).put("subscription", new JSONObject().put("id", str3).put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, str4));
                    if (bool != null) {
                        put.put(pc.e.DIRECT_TAG, bool.booleanValue());
                    }
                    if (eVar.getNotificationIds() != null && eVar.getNotificationIds().length() > 0) {
                        put.put(pc.e.NOTIFICATIONS_IDS, eVar.getNotificationIds());
                    }
                    put.put("id", eVar.getName());
                    if (eVar.getWeight() > 0.0f) {
                        put.put("weight", new Float(eVar.getWeight()));
                    }
                    if (eVar.getTimestamp() > 0) {
                        put.put("timestamp", eVar.getTimestamp());
                    }
                    if (eVar.getSessionTime() > 0) {
                        put.put("session_time", eVar.getSessionTime());
                    }
                    ka.c cVar = this._http;
                    aVar2.label = 1;
                    obj = ka.b.post$default(cVar, "outcomes/measure", put, null, aVar2, 4, null);
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
        aVar2 = new a(aVar);
        Object obj2 = aVar2.result;
        md.a aVar42 = md.a.f6622d;
        i3 = aVar2.label;
        if (i3 != 0) {
        }
        aVar3 = (ka.a) obj2;
        if (aVar3.isSuccess()) {
        }
    }
}
