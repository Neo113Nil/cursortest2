package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.e;
import y3.InterfaceC1029b;

/* loaded from: classes.dex */
public final class c implements InterfaceC1029b {
    private final w3.b _lifecycleService;

    public static final class a extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public c(w3.b _lifecycleService) {
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        this._lifecycleService = _lifecycleService;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!s3.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        Intrinsics.b(intent);
        Bundle extras = intent.getExtras();
        f fVar = f.INSTANCE;
        Intrinsics.b(extras);
        JSONObject bundleAsJSONObject = fVar.bundleAsJSONObject(extras);
        reformatButtonClickAction(bundleAsJSONObject);
        return bundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r8.notificationOpened(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, V5.b bVar) {
        a aVar;
        Object obj;
        int i2;
        c cVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i5 = aVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.label = i5 - Integer.MIN_VALUE;
                obj = aVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = aVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    w3.b bVar2 = this._lifecycleService;
                    aVar.L$0 = this;
                    aVar.L$1 = activity;
                    aVar.L$2 = jSONObject;
                    aVar.label = 1;
                    obj = bVar2.canOpenNotification(activity, jSONObject, aVar);
                    if (obj != aVar2) {
                        cVar = this;
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                jSONObject = (JSONObject) aVar.L$2;
                activity = (Activity) aVar.L$1;
                cVar = (c) aVar.L$0;
                V6.b.P(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f6114a;
                }
                w3.b bVar3 = cVar._lifecycleService;
                JSONArray wrapInJsonArray = f.INSTANCE.wrapInJsonArray(jSONObject);
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.L$2 = null;
                aVar.label = 2;
            }
        }
        aVar = new a(bVar);
        obj = aVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = aVar.label;
        if (i2 != 0) {
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
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    @Override // y3.InterfaceC1029b
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, V5.b bVar) {
        if (intent == null) {
            return Unit.f6114a;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return Unit.f6114a;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, bVar);
        return handleProcessJsonOpenData == W5.a.f2787d ? handleProcessJsonOpenData : Unit.f6114a;
    }
}
