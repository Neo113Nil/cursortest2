package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.f;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.e;
import q7.v;
import v5.InterfaceC5129b;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class c implements InterfaceC5129b {
    private final t5.b _lifecycleService;

    public static final class a extends AbstractC5219c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public c(t5.b _lifecycleService) {
        h.e(_lifecycleService, "_lifecycleService");
        this._lifecycleService = _lifecycleService;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!p5.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        h.b(intent);
        Bundle extras = intent.getExtras();
        f fVar = f.INSTANCE;
        h.b(extras);
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
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, InterfaceC5133d interfaceC5133d) {
        a aVar;
        Object obj;
        int i;
        c cVar;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                v vVar = v.f40183a;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    t5.b bVar = this._lifecycleService;
                    aVar.L$0 = this;
                    aVar.L$1 = activity;
                    aVar.L$2 = jSONObject;
                    aVar.label = 1;
                    obj = bVar.canOpenNotification(activity, jSONObject, aVar);
                    if (obj != enumC5179a) {
                        cVar = this;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        com.bumptech.glide.f.r(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject = (JSONObject) aVar.L$2;
                activity = (Activity) aVar.L$1;
                cVar = (c) aVar.L$0;
                com.bumptech.glide.f.r(obj);
                if (((Boolean) obj).booleanValue()) {
                    return vVar;
                }
                t5.b bVar2 = cVar._lifecycleService;
                JSONArray wrapInJsonArray = f.INSTANCE.wrapInJsonArray(jSONObject);
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.L$2 = null;
                aVar.label = 2;
                return bVar2.notificationOpened(activity, wrapInJsonArray, aVar) == enumC5179a ? enumC5179a : vVar;
            }
        }
        aVar = new a(interfaceC5133d);
        obj = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        v vVar2 = v.f40183a;
        if (i != 0) {
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
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    @Override // v5.InterfaceC5129b
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, InterfaceC5133d interfaceC5133d) {
        v vVar = v.f40183a;
        if (intent == null) {
            return vVar;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return vVar;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, interfaceC5133d);
        return handleProcessJsonOpenData == EnumC5179a.f41704n ? handleProcessJsonOpenData : vVar;
    }
}
