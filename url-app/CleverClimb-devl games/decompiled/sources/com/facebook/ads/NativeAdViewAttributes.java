package com.facebook.ads;

import android.graphics.Typeface;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.j.b;
import com.facebook.ads.internal.n.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAdViewAttributes {

    /* renamed from: a, reason: collision with root package name */
    private h f4821a;

    public NativeAdViewAttributes() {
        this.f4821a = new h();
    }

    NativeAdViewAttributes(h hVar) {
        this.f4821a = hVar;
    }

    public NativeAdViewAttributes(JSONObject jSONObject) {
        try {
            this.f4821a = new h(jSONObject);
        } catch (Exception e) {
            this.f4821a = new h();
            b.a(a.a(e, "Error retrieving native ui configuration data"));
        }
    }

    h a() {
        return this.f4821a;
    }

    public boolean getAutoplay() {
        return this.f4821a.j();
    }

    public boolean getAutoplayOnMobile() {
        return this.f4821a.k();
    }

    public int getBackgroundColor() {
        return this.f4821a.b();
    }

    public int getButtonBorderColor() {
        return this.f4821a.g();
    }

    public int getButtonColor() {
        return this.f4821a.e();
    }

    public int getButtonTextColor() {
        return this.f4821a.f();
    }

    public int getDescriptionTextColor() {
        return this.f4821a.d();
    }

    public int getDescriptionTextSize() {
        return this.f4821a.i();
    }

    public int getTitleTextColor() {
        return this.f4821a.c();
    }

    public int getTitleTextSize() {
        return this.f4821a.h();
    }

    public Typeface getTypeface() {
        return this.f4821a.a();
    }

    public NativeAdViewAttributes setAutoplay(boolean z) {
        this.f4821a.b(z);
        return this;
    }

    public NativeAdViewAttributes setAutoplayOnMobile(boolean z) {
        this.f4821a.a(z);
        return this;
    }

    public NativeAdViewAttributes setBackgroundColor(int i) {
        this.f4821a.a(i);
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int i) {
        this.f4821a.f(i);
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int i) {
        this.f4821a.d(i);
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int i) {
        this.f4821a.e(i);
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int i) {
        this.f4821a.c(i);
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int i) {
        this.f4821a.b(i);
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface) {
        this.f4821a.a(typeface);
        return this;
    }
}
