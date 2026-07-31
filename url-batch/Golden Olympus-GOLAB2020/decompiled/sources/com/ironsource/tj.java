package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class tj {

    /* renamed from: a, reason: collision with root package name */
    private String f19789a;

    /* renamed from: e, reason: collision with root package name */
    private String f19793e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f19794f;

    /* renamed from: g, reason: collision with root package name */
    private final jo f19795g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19796h;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19790b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19791c = false;

    /* renamed from: d, reason: collision with root package name */
    private ug f19792d = null;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f19797i = false;

    /* renamed from: j, reason: collision with root package name */
    protected String f19798j = null;

    public tj(String str, jo joVar) {
        this.f19789a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f19795g = (jo) SDKUtils.requireNonNull(joVar, "AdListener name can't be null");
    }

    public sj a() {
        return new sj(b(), this.f19789a, this.f19790b, this.f19791c, this.f19796h, this.f19797i, this.f19798j, this.f19794f, this.f19795g, this.f19792d);
    }

    public tj b(String str) {
        this.f19798j = str;
        return this;
    }

    public tj c() {
        this.f19790b = true;
        return this;
    }

    public tj a(ug ugVar) {
        this.f19792d = ugVar;
        return this;
    }

    public tj b(boolean z4) {
        this.f19797i = z4;
        return this;
    }

    public tj c(boolean z4) {
        this.f19796h = z4;
        return this;
    }

    public tj a(String str) {
        this.f19793e = str;
        return this;
    }

    public String b() {
        String str = this.f19793e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f19789a);
            jSONObject.put("rewarded", this.f19790b);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return (this.f19791c || this.f19796h) ? dk.a() : dk.a(jSONObject);
    }

    public tj a(Map<String, String> map) {
        this.f19794f = map;
        return this;
    }

    public tj a(boolean z4) {
        this.f19791c = z4;
        return this;
    }
}
