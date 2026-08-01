package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import bc.e;
import com.onesignal.common.f;
import kotlin.Unit;
import kotlin.collections.i0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements hc.b {
    private final fc.b _lifecycleService;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public c(fc.b bVar) {
        bVar.getClass();
        this._lifecycleService = bVar;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!bc.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        intent.getClass();
        Bundle extras = intent.getExtras();
        f fVar = f.INSTANCE;
        extras.getClass();
        JSONObject bundleAsJSONObject = fVar.bundleAsJSONObject(extras);
        reformatButtonClickAction(bundleAsJSONObject);
        return bundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r8.notificationOpened(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, ld.a aVar) {
        a aVar2;
        Object obj;
        int i3;
        c cVar;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                obj = aVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = aVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    fc.b bVar = this._lifecycleService;
                    aVar2.L$0 = this;
                    aVar2.L$1 = activity;
                    aVar2.L$2 = jSONObject;
                    aVar2.label = 1;
                    obj = bVar.canOpenNotification(activity, jSONObject, aVar2);
                    if (obj != aVar3) {
                        cVar = this;
                    }
                    return aVar3;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jSONObject = (JSONObject) aVar2.L$2;
                activity = (Activity) aVar2.L$1;
                cVar = (c) aVar2.L$0;
                cf.c.M(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f5554a;
                }
                fc.b bVar2 = cVar._lifecycleService;
                JSONArray wrapInJsonArray = f.INSTANCE.wrapInJsonArray(jSONObject);
                aVar2.L$0 = null;
                aVar2.L$1 = null;
                aVar2.L$2 = null;
                aVar2.label = 2;
            }
        }
        aVar2 = new a(aVar);
        obj = aVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = aVar2.label;
        if (i3 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    private final void reformatButtonClickAction(JSONObject jSONObject) {
        try {
            String str = (String) e.INSTANCE.getCustomJSONObject(jSONObject).remove("actionId");
            if (str == null) {
                return;
            }
            jSONObject.put("actionId", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // hc.b
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, ld.a aVar) {
        if (intent == null) {
            return Unit.f5554a;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return Unit.f5554a;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, aVar);
        return handleProcessJsonOpenData == md.a.f6622d ? handleProcessJsonOpenData : Unit.f5554a;
    }
}
