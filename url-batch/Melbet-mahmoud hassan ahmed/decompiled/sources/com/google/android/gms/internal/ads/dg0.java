package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dg0 extends eg0 implements t70<eu0> {

    /* renamed from: c, reason: collision with root package name */
    private final eu0 f4205c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f4206d;

    /* renamed from: e, reason: collision with root package name */
    private final WindowManager f4207e;

    /* renamed from: f, reason: collision with root package name */
    private final v00 f4208f;

    /* renamed from: g, reason: collision with root package name */
    DisplayMetrics f4209g;

    /* renamed from: h, reason: collision with root package name */
    private float f4210h;

    /* renamed from: i, reason: collision with root package name */
    int f4211i;

    /* renamed from: j, reason: collision with root package name */
    int f4212j;

    /* renamed from: k, reason: collision with root package name */
    private int f4213k;

    /* renamed from: l, reason: collision with root package name */
    int f4214l;

    /* renamed from: m, reason: collision with root package name */
    int f4215m;

    /* renamed from: n, reason: collision with root package name */
    int f4216n;

    /* renamed from: o, reason: collision with root package name */
    int f4217o;

    public dg0(eu0 eu0Var, Context context, v00 v00Var) {
        super(eu0Var, "");
        this.f4211i = -1;
        this.f4212j = -1;
        this.f4214l = -1;
        this.f4215m = -1;
        this.f4216n = -1;
        this.f4217o = -1;
        this.f4205c = eu0Var;
        this.f4206d = context;
        this.f4208f = v00Var;
        this.f4207e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* synthetic */ void a(eu0 eu0Var, Map map) {
        int i7;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        JSONObject jSONObject;
        this.f4209g = new DisplayMetrics();
        Display defaultDisplay = this.f4207e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f4209g);
        this.f4210h = this.f4209g.density;
        this.f4213k = defaultDisplay.getRotation();
        qw.b();
        DisplayMetrics displayMetrics = this.f4209g;
        this.f4211i = bo0.q(displayMetrics, displayMetrics.widthPixels);
        qw.b();
        DisplayMetrics displayMetrics2 = this.f4209g;
        this.f4212j = bo0.q(displayMetrics2, displayMetrics2.heightPixels);
        Activity j7 = this.f4205c.j();
        if (j7 == null || j7.getWindow() == null) {
            this.f4214l = this.f4211i;
            i7 = this.f4212j;
        } else {
            y2.t.q();
            int[] u6 = a3.g2.u(j7);
            qw.b();
            this.f4214l = bo0.q(this.f4209g, u6[0]);
            qw.b();
            i7 = bo0.q(this.f4209g, u6[1]);
        }
        this.f4215m = i7;
        if (this.f4205c.w().i()) {
            this.f4216n = this.f4211i;
            this.f4217o = this.f4212j;
        } else {
            this.f4205c.measure(0, 0);
        }
        e(this.f4211i, this.f4212j, this.f4214l, this.f4215m, this.f4210h, this.f4213k);
        cg0 cg0Var = new cg0();
        v00 v00Var = this.f4208f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        cg0Var.e(v00Var.a(intent));
        v00 v00Var2 = this.f4208f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        cg0Var.c(v00Var2.a(intent2));
        cg0Var.a(this.f4208f.b());
        cg0Var.d(this.f4208f.c());
        cg0Var.b(true);
        z6 = cg0Var.f3838a;
        z7 = cg0Var.f3839b;
        z8 = cg0Var.f3840c;
        z9 = cg0Var.f3841d;
        z10 = cg0Var.f3842e;
        eu0 eu0Var2 = this.f4205c;
        try {
            jSONObject = new JSONObject().put("sms", z6).put("tel", z7).put("calendar", z8).put("storePicture", z9).put("inlineVideo", z10);
        } catch (JSONException e7) {
            io0.e("Error occurred while obtaining the MRAID capabilities.", e7);
            jSONObject = null;
        }
        eu0Var2.s("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f4205c.getLocationOnScreen(iArr);
        h(qw.b().b(this.f4206d, iArr[0]), qw.b().b(this.f4206d, iArr[1]));
        if (io0.j(2)) {
            io0.f("Dispatching Ready Event.");
        }
        d(this.f4205c.l().f10301f);
    }

    public final void h(int i7, int i8) {
        int i9;
        int i10 = 0;
        if (this.f4206d instanceof Activity) {
            y2.t.q();
            i9 = a3.g2.w((Activity) this.f4206d)[0];
        } else {
            i9 = 0;
        }
        if (this.f4205c.w() == null || !this.f4205c.w().i()) {
            int width = this.f4205c.getWidth();
            int height = this.f4205c.getHeight();
            if (((Boolean) sw.c().b(m10.M)).booleanValue()) {
                if (width == 0) {
                    width = this.f4205c.w() != null ? this.f4205c.w().f13512c : 0;
                }
                if (height == 0) {
                    if (this.f4205c.w() != null) {
                        i10 = this.f4205c.w().f13511b;
                    }
                    this.f4216n = qw.b().b(this.f4206d, width);
                    this.f4217o = qw.b().b(this.f4206d, i10);
                }
            }
            i10 = height;
            this.f4216n = qw.b().b(this.f4206d, width);
            this.f4217o = qw.b().b(this.f4206d, i10);
        }
        b(i7, i8 - i9, this.f4216n, this.f4217o);
        this.f4205c.E0().x0(i7, i8);
    }
}
