package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eg0 {

    /* renamed from: a, reason: collision with root package name */
    private final eu0 f4602a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4603b;

    public eg0(eu0 eu0Var, String str) {
        this.f4602a = eu0Var;
        this.f4603b = str;
    }

    public final void b(int i7, int i8, int i9, int i10) {
        try {
            this.f4602a.s("onDefaultPositionReceived", new JSONObject().put("x", i7).put("y", i8).put("width", i9).put("height", i10));
        } catch (JSONException e7) {
            io0.e("Error occurred while dispatching default position.", e7);
        }
    }

    public final void c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f4603b);
            eu0 eu0Var = this.f4602a;
            if (eu0Var != null) {
                eu0Var.s("onError", put);
            }
        } catch (JSONException e7) {
            io0.e("Error occurred while dispatching error event.", e7);
        }
    }

    public final void d(String str) {
        try {
            this.f4602a.s("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e7) {
            io0.e("Error occurred while dispatching ready Event.", e7);
        }
    }

    public final void e(int i7, int i8, int i9, int i10, float f7, int i11) {
        try {
            this.f4602a.s("onScreenInfoChanged", new JSONObject().put("width", i7).put("height", i8).put("maxSizeWidth", i9).put("maxSizeHeight", i10).put("density", f7).put("rotation", i11));
        } catch (JSONException e7) {
            io0.e("Error occurred while obtaining screen information.", e7);
        }
    }

    public final void f(int i7, int i8, int i9, int i10) {
        try {
            this.f4602a.s("onSizeChanged", new JSONObject().put("x", i7).put("y", i8).put("width", i9).put("height", i10));
        } catch (JSONException e7) {
            io0.e("Error occurred while dispatching size change.", e7);
        }
    }

    public final void g(String str) {
        try {
            this.f4602a.s("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e7) {
            io0.e("Error occurred while dispatching state change.", e7);
        }
    }
}
