package com.facebook.ads.internal.n;

import android.graphics.Color;
import android.graphics.Typeface;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.ads.mediation.facebook.FacebookAdapter;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private Typeface f5247a;

    /* renamed from: b, reason: collision with root package name */
    private int f5248b;

    /* renamed from: c, reason: collision with root package name */
    private int f5249c;

    /* renamed from: d, reason: collision with root package name */
    private int f5250d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;

    public h() {
        this.f5247a = Typeface.DEFAULT;
        this.f5248b = -1;
        this.f5249c = -16777216;
        this.f5250d = -11643291;
        this.e = 0;
        this.f = -12420889;
        this.g = -12420889;
        this.h = AdInternalSettings.isVideoAutoplay();
        this.i = AdInternalSettings.isVideoAutoplayOnMobile();
    }

    public h(JSONObject jSONObject) {
        this.f5247a = Typeface.DEFAULT;
        this.f5248b = -1;
        this.f5249c = -16777216;
        this.f5250d = -11643291;
        this.e = 0;
        this.f = -12420889;
        this.g = -12420889;
        this.h = AdInternalSettings.isVideoAutoplay();
        this.i = AdInternalSettings.isVideoAutoplayOnMobile();
        int parseColor = jSONObject.getBoolean("background_transparent") ? 0 : Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_BACKGROUND_COLOR));
        int parseColor2 = Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_TITLE_TEXT_COLOR));
        int parseColor3 = Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_DESCRIPTION_TEXT_COLOR));
        int parseColor4 = jSONObject.getBoolean("button_transparent") ? 0 : Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_BUTTON_COLOR));
        int parseColor5 = jSONObject.getBoolean("button_border_transparent") ? 0 : Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_BUTTON_BORDER_COLOR));
        int parseColor6 = Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_BUTTON_TEXT_COLOR));
        Typeface create = Typeface.create(jSONObject.getString("android_typeface"), 0);
        this.f5248b = parseColor;
        this.f5249c = parseColor2;
        this.f5250d = parseColor3;
        this.e = parseColor4;
        this.g = parseColor5;
        this.f = parseColor6;
        this.f5247a = create;
    }

    public Typeface a() {
        return this.f5247a;
    }

    public void a(int i) {
        this.f5248b = i;
    }

    public void a(Typeface typeface) {
        this.f5247a = typeface;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public int b() {
        return this.f5248b;
    }

    public void b(int i) {
        this.f5249c = i;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public int c() {
        return this.f5249c;
    }

    public void c(int i) {
        this.f5250d = i;
    }

    public int d() {
        return this.f5250d;
    }

    public void d(int i) {
        this.e = i;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.f = i;
    }

    public int f() {
        return this.f;
    }

    public void f(int i) {
        this.g = i;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return 16;
    }

    public int i() {
        return 10;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.i;
    }
}
