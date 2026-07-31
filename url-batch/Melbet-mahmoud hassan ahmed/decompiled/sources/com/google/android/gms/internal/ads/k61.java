package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k61 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    private final Context f7393f;

    /* renamed from: g, reason: collision with root package name */
    private View f7394g;

    private k61(Context context) {
        super(context);
        this.f7393f = context;
    }

    public static k61 a(Context context, View view, rr2 rr2Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        k61 k61Var = new k61(context);
        if (!rr2Var.f11399v.isEmpty() && (resources = k61Var.f7393f.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f7 = rr2Var.f11399v.get(0).f11945a;
            float f8 = displayMetrics.density;
            k61Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f7 * f8), (int) (r1.f11946b * f8)));
        }
        k61Var.f7394g = view;
        k61Var.addView(view);
        y2.t.y();
        jp0.b(k61Var, k61Var);
        y2.t.y();
        jp0.a(k61Var, k61Var);
        JSONObject jSONObject = rr2Var.f11378f0;
        RelativeLayout relativeLayout = new RelativeLayout(k61Var.f7393f);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            k61Var.c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            k61Var.c(optJSONObject2, relativeLayout, 12);
        }
        k61Var.addView(relativeLayout);
        return k61Var;
    }

    private final int b(double d7) {
        qw.b();
        return bo0.s(this.f7393f, (int) d7);
    }

    private final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i7) {
        TextView textView = new TextView(this.f7393f);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b7 = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b7, 0, b7);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i7);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f7394g.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f7394g.setY(-r0[1]);
    }
}
