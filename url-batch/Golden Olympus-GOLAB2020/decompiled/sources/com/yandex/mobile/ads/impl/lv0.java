package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lv0 {

    /* renamed from: a, reason: collision with root package name */
    private final ln2 f28784a;

    private lv0(ln2 ln2Var) {
        this.f28784a = ln2Var;
    }

    public final void a() {
        to0 to0Var = to0.f32540c;
        no2.a(this.f28784a);
        JSONObject jSONObject = new JSONObject();
        yn2.a(jSONObject, "interactionType", to0Var);
        this.f28784a.j().a("adUserInteraction", jSONObject);
    }

    public final void b() {
        no2.a(this.f28784a);
        this.f28784a.j().a("bufferFinish");
    }

    public final void c() {
        no2.a(this.f28784a);
        this.f28784a.j().a("bufferStart");
    }

    public final void d() {
        no2.a(this.f28784a);
        this.f28784a.j().a("complete");
    }

    public final void e() {
        no2.a(this.f28784a);
        this.f28784a.j().a("firstQuartile");
    }

    public final void f() {
        no2.a(this.f28784a);
        this.f28784a.j().a("midpoint");
    }

    public final void g() {
        no2.a(this.f28784a);
        this.f28784a.j().a("pause");
    }

    public final void h() {
        no2.a(this.f28784a);
        this.f28784a.j().a("resume");
    }

    public final void i() {
        no2.a(this.f28784a);
        this.f28784a.j().a("skipped");
    }

    public final void j() {
        no2.a(this.f28784a);
        this.f28784a.j().a("thirdQuartile");
    }

    public static lv0 a(ln2 ln2Var) {
        if (ln2Var.m()) {
            if (!ln2Var.h()) {
                if (!ln2Var.k()) {
                    if (ln2Var.j().d() == null) {
                        lv0 lv0Var = new lv0(ln2Var);
                        ln2Var.j().a(lv0Var);
                        return lv0Var;
                    }
                    throw new IllegalStateException("MediaEvents already exists for AdSession");
                }
                throw new IllegalStateException("AdSession is finished");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    public final void a(float f4, float f5) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f5 >= 0.0f && f5 <= 1.0f) {
            no2.a(this.f28784a);
            JSONObject jSONObject = new JSONObject();
            yn2.a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f4));
            yn2.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f5));
            yn2.a(jSONObject, b9.i.f15534P, Float.valueOf(so2.a().d()));
            this.f28784a.j().a("start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }

    public final void a(float f4) {
        if (f4 >= 0.0f && f4 <= 1.0f) {
            no2.a(this.f28784a);
            JSONObject jSONObject = new JSONObject();
            yn2.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f4));
            yn2.a(jSONObject, b9.i.f15534P, Float.valueOf(so2.a().d()));
            this.f28784a.j().a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
