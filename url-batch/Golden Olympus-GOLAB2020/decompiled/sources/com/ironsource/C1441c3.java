package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1441c3 {

    /* renamed from: a, reason: collision with root package name */
    private NetworkSettings f15667a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f15668b;

    /* renamed from: c, reason: collision with root package name */
    private IronSource.AD_UNIT f15669c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15670d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15671e;

    /* renamed from: f, reason: collision with root package name */
    private int f15672f;

    /* renamed from: g, reason: collision with root package name */
    private int f15673g;

    public C1441c3(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f15667a = networkSettings;
        this.f15668b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f15672f = optInt;
        this.f15670d = optInt == 2;
        this.f15671e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f15673g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f15669c = ad_unit;
    }

    public String a() {
        return this.f15667a.getAdSourceNameForEvents();
    }

    public IronSource.AD_UNIT b() {
        return this.f15669c;
    }

    public JSONObject c() {
        return this.f15668b;
    }

    public int d() {
        return this.f15672f;
    }

    public int e() {
        return this.f15673g;
    }

    public String f() {
        return this.f15667a.getProviderName();
    }

    public String g() {
        return this.f15667a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f15667a;
    }

    public String i() {
        return this.f15667a.getSubProviderId();
    }

    public boolean j() {
        return this.f15670d;
    }

    public boolean k() {
        return this.f15671e;
    }
}
