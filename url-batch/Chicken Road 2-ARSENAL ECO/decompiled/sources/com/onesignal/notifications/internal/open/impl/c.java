package com.onesignal.notifications.internal.open.impl;

import Q2.e;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.f;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class c implements W2.b {
    private final U2.b _lifecycleService;

    public static final class a extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public c(U2.b _lifecycleService) {
        i.e(_lifecycleService, "_lifecycleService");
        this._lifecycleService = _lifecycleService;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!Q2.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        i.b(intent);
        Bundle extras = intent.getExtras();
        f fVar = f.INSTANCE;
        i.b(extras);
        JSONObject bundleAsJSONObject = fVar.bundleAsJSONObject(extras);
        reformatButtonClickAction(bundleAsJSONObject);
        return bundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, InterfaceC0564d interfaceC0564d) {
        a aVar;
        Object obj;
        int i7;
        c cVar;
        if (interfaceC0564d instanceof a) {
            aVar = (a) interfaceC0564d;
            int i8 = aVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.label = i8 - Integer.MIN_VALUE;
                obj = aVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = aVar.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    U2.b bVar = this._lifecycleService;
                    aVar.L$0 = this;
                    aVar.L$1 = activity;
                    aVar.L$2 = jSONObject;
                    aVar.label = 1;
                    obj = bVar.canOpenNotification(activity, jSONObject, aVar);
                    if (obj != enumC0580a) {
                        cVar = this;
                    }
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        AbstractC0676f.w(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject = (JSONObject) aVar.L$2;
                activity = (Activity) aVar.L$1;
                cVar = (c) aVar.L$0;
                AbstractC0676f.w(obj);
                if (((Boolean) obj).booleanValue()) {
                    return vVar;
                }
                U2.b bVar2 = cVar._lifecycleService;
                JSONArray wrapInJsonArray = f.INSTANCE.wrapInJsonArray(jSONObject);
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.L$2 = null;
                aVar.label = 2;
                return bVar2.notificationOpened(activity, wrapInJsonArray, aVar) == enumC0580a ? enumC0580a : vVar;
            }
        }
        aVar = new a(interfaceC0564d);
        obj = aVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = aVar.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
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
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    @Override // W2.b
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, InterfaceC0564d interfaceC0564d) {
        v vVar = v.f5219a;
        if (intent == null) {
            return vVar;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return vVar;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, interfaceC0564d);
        return handleProcessJsonOpenData == EnumC0580a.f5697f ? handleProcessJsonOpenData : vVar;
    }
}
