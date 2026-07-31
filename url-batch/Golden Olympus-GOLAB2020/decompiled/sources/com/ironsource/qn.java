package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.fh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class qn {

    /* renamed from: b, reason: collision with root package name */
    private final of f18869b = nm.S().f();

    /* renamed from: a, reason: collision with root package name */
    ke f18868a = new ke();

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f18868a.a("debug", jSONObject);
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f18868a.a(ge.f16463i, new JSONObject(controllerConfig).opt(b9.a.f15303q));
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public void c() {
        this.f18868a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f18868a.a(ge.f16427U, "8.8.0");
    }

    public void e() {
        HashMap hashMap = new HashMap();
        hashMap.put(ge.f16393D, io.f16728f);
        hashMap.put(ge.f16390C, io.f16727e);
        this.f18868a.a(hashMap);
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f18868a.a(ge.f16478n, Boolean.valueOf(this.f18869b.a((Activity) context)));
        }
    }

    public void b(Context context) {
        this.f18868a.a("gpi", Boolean.valueOf(ep.d(context)));
    }

    public void a(fh.c cVar) {
        this.f18868a.a(ge.f16504v1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(List<String> list) {
        this.f18868a.a(ge.f16513y1, list);
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f18868a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(JSONObject jSONObject) {
        this.f18868a.a(ge.f16472l, jSONObject);
    }

    public void a(boolean z4) {
        this.f18868a.a(ge.f16418P0, Boolean.valueOf(z4));
    }
}
