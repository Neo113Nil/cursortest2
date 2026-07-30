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
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.Zd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2890Zd extends C2881Yl implements InterfaceC2990bc {

    /* renamed from: A, reason: collision with root package name */
    public DisplayMetrics f28999A;

    /* renamed from: B, reason: collision with root package name */
    public float f29000B;

    /* renamed from: C, reason: collision with root package name */
    public int f29001C;

    /* renamed from: D, reason: collision with root package name */
    public int f29002D;

    /* renamed from: E, reason: collision with root package name */
    public int f29003E;

    /* renamed from: F, reason: collision with root package name */
    public int f29004F;

    /* renamed from: G, reason: collision with root package name */
    public int f29005G;

    /* renamed from: H, reason: collision with root package name */
    public int f29006H;

    /* renamed from: I, reason: collision with root package name */
    public int f29007I;

    /* renamed from: w, reason: collision with root package name */
    public final C2486Bh f29008w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f29009x;

    /* renamed from: y, reason: collision with root package name */
    public final WindowManager f29010y;

    /* renamed from: z, reason: collision with root package name */
    public final C3042ca f29011z;

    public C2890Zd(C2486Bh c2486Bh, Context context, C3042ca c3042ca) {
        super(17, c2486Bh, "");
        this.f29001C = -1;
        this.f29002D = -1;
        this.f29004F = -1;
        this.f29005G = -1;
        this.f29006H = -1;
        this.f29007I = -1;
        this.f29008w = c2486Bh;
        this.f29009x = context;
        this.f29011z = c3042ca;
        this.f29010y = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        JSONObject jSONObject;
        this.f28999A = new DisplayMetrics();
        Display defaultDisplay = this.f29010y.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f28999A);
        this.f29000B = this.f28999A.density;
        this.f29003E = defaultDisplay.getRotation();
        u2.d dVar = C4907p.f40108g.f40109a;
        this.f29001C = Math.round(r11.widthPixels / this.f28999A.density);
        this.f29002D = Math.round(r11.heightPixels / this.f28999A.density);
        C2486Bh c2486Bh = this.f29008w;
        Activity h9 = c2486Bh.h();
        if (h9 == null || h9.getWindow() == null) {
            this.f29004F = this.f29001C;
            this.f29005G = this.f29002D;
        } else {
            t2.G g9 = p2.j.f39798C.f39803c;
            int[] p6 = t2.G.p(h9);
            this.f29004F = Math.round(p6[0] / this.f28999A.density);
            this.f29005G = Math.round(p6[1] / this.f28999A.density);
        }
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0().b()) {
            this.f29006H = this.f29001C;
            this.f29007I = this.f29002D;
        } else {
            c2486Bh.measure(0, 0);
        }
        w(this.f29001C, this.f29002D, this.f29004F, this.f29005G, this.f29000B, this.f29003E);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        C3042ca c3042ca = this.f29011z;
        boolean d2 = c3042ca.d(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean d3 = c3042ca.d(intent2);
        boolean d9 = c3042ca.d(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        CallableC2988ba callableC2988ba = CallableC2988ba.f29503b;
        Context context = c3042ca.f29713n;
        try {
            jSONObject = new JSONObject().put("sms", d3).put("tel", d2).put("calendar", d9).put("storePicture", ((Boolean) K3.b.G(context, callableC2988ba)).booleanValue() && U2.c.a(context).f3280n.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Error occurred while obtaining the MRAID capabilities.", e6);
            jSONObject = null;
        }
        c2486Bh.c("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        c2486Bh.getLocationOnScreen(iArr);
        C4907p c4907p = C4907p.f40108g;
        u2.d dVar2 = c4907p.f40109a;
        int i4 = iArr[0];
        Context context2 = this.f29009x;
        x(dVar2.h(context2, i4), c4907p.f40109a.h(context2, iArr[1]));
        if (u2.i.j(2)) {
            u2.i.e("Dispatching Ready Event.");
        }
        try {
            ((InterfaceC3858rh) this.f28862u).c("onReadyEventReceived", new JSONObject().put("js", viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24504x.f41217n));
        } catch (JSONException e9) {
            int i9 = t2.C.f40822b;
            u2.i.d("Error occurred while dispatching ready Event.", e9);
        }
    }

    public final void x(int i, int i4) {
        int i9;
        Context context = this.f29009x;
        int i10 = 0;
        if (context instanceof Activity) {
            t2.G g9 = p2.j.f39798C.f39803c;
            i9 = t2.G.q((Activity) context)[0];
        } else {
            i9 = 0;
        }
        C2486Bh c2486Bh = this.f29008w;
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
        if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0() == null || !viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0().b()) {
            int width = c2486Bh.getWidth();
            int height = c2486Bh.getHeight();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31392A0)).booleanValue()) {
                if (width == 0) {
                    width = viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0() != null ? viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0().f3425c : 0;
                }
                if (height == 0) {
                    if (viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0() != null) {
                        i10 = viewTreeObserverOnGlobalLayoutListenerC2520Dh.e0().f3424b;
                    }
                    C4907p c4907p = C4907p.f40108g;
                    this.f29006H = c4907p.f40109a.h(context, width);
                    this.f29007I = c4907p.f40109a.h(context, i10);
                }
            }
            i10 = height;
            C4907p c4907p2 = C4907p.f40108g;
            this.f29006H = c4907p2.f40109a.h(context, width);
            this.f29007I = c4907p2.f40109a.h(context, i10);
        }
        try {
            ((InterfaceC3858rh) this.f28862u).c("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i4 - i9).put("width", this.f29006H).put("height", this.f29007I));
        } catch (JSONException e6) {
            int i11 = t2.C.f40822b;
            u2.i.d("Error occurred while dispatching default position.", e6);
        }
        C2839Wd c2839Wd = viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24472G.f25396Q;
        if (c2839Wd != null) {
            c2839Wd.f28415y = i;
            c2839Wd.f28416z = i4;
        }
    }
}
