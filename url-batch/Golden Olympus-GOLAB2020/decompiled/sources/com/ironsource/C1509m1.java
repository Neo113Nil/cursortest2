package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1509m1 {

    /* renamed from: a, reason: collision with root package name */
    private IronSource.AD_UNIT f17130a;

    /* renamed from: b, reason: collision with root package name */
    private String f17131b;

    /* renamed from: c, reason: collision with root package name */
    private NetworkSettings f17132c;

    /* renamed from: d, reason: collision with root package name */
    private int f17133d;

    /* renamed from: e, reason: collision with root package name */
    private int f17134e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f17135f;

    /* renamed from: g, reason: collision with root package name */
    private String f17136g;

    /* renamed from: h, reason: collision with root package name */
    private int f17137h;

    /* renamed from: i, reason: collision with root package name */
    private String f17138i;

    public C1509m1(IronSource.AD_UNIT ad_unit, String str, int i4, JSONObject jSONObject, String str2, int i5, String str3, NetworkSettings networkSettings, int i6) {
        this.f17130a = ad_unit;
        this.f17131b = str;
        this.f17134e = i4;
        this.f17135f = jSONObject;
        this.f17136g = str2;
        this.f17137h = i5;
        this.f17138i = str3;
        this.f17132c = networkSettings;
        this.f17133d = i6;
    }

    public IronSource.AD_UNIT a() {
        return this.f17130a;
    }

    public String b() {
        return this.f17138i;
    }

    public String c() {
        return this.f17136g;
    }

    public int d() {
        return this.f17137h;
    }

    public JSONObject e() {
        return this.f17135f;
    }

    public int f() {
        return this.f17133d;
    }

    public NetworkSettings g() {
        return this.f17132c;
    }

    public int h() {
        return this.f17134e;
    }

    public String i() {
        return this.f17131b;
    }
}
