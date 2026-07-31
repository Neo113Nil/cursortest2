package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kn1 extends t40 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, mo1 {

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<View> f7555f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7556g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7557h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7558i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private mm1 f7559j;

    /* renamed from: k, reason: collision with root package name */
    private ao f7560k;

    public kn1(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        y2.t.y();
        jp0.a(view, this);
        y2.t.y();
        jp0.b(view, this);
        this.f7555f = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f7556g.put(key, new WeakReference<>(value));
                if (!"1098".equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.f7558i.putAll(this.f7556g);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f7557h.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.f7558i.putAll(this.f7557h);
        this.f7560k = new ao(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized void C3(String str, View view, boolean z6) {
        this.f7558i.put(str, new WeakReference<>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f7556g.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final View d() {
        return this.f7555f.get();
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final FrameLayout f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final synchronized void g() {
        mm1 mm1Var = this.f7559j;
        if (mm1Var != null) {
            mm1Var.s(this);
            this.f7559j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final ao h() {
        return this.f7560k;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized x3.a i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized String j() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized Map<String, WeakReference<View>> k() {
        return this.f7558i;
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final synchronized void k1(x3.a aVar) {
        Object O0 = x3.b.O0(aVar);
        if (!(O0 instanceof mm1)) {
            io0.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        mm1 mm1Var = this.f7559j;
        if (mm1Var != null) {
            mm1Var.s(this);
        }
        mm1 mm1Var2 = (mm1) O0;
        if (!mm1Var2.t()) {
            io0.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f7559j = mm1Var2;
        mm1Var2.r(this);
        this.f7559j.j(d());
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized JSONObject l() {
        mm1 mm1Var = this.f7559j;
        if (mm1Var == null) {
            return null;
        }
        return mm1Var.F(d(), k(), o());
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized Map<String, WeakReference<View>> m() {
        return this.f7557h;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized JSONObject n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized Map<String, WeakReference<View>> o() {
        return this.f7556g;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        mm1 mm1Var = this.f7559j;
        if (mm1Var != null) {
            mm1Var.Q(view, d(), k(), o(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        mm1 mm1Var = this.f7559j;
        if (mm1Var != null) {
            mm1Var.O(d(), k(), o(), mm1.w(d()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        mm1 mm1Var = this.f7559j;
        if (mm1Var != null) {
            mm1Var.O(d(), k(), o(), mm1.w(d()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        mm1 mm1Var = this.f7559j;
        if (mm1Var != null) {
            mm1Var.k(view, motionEvent, d());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mo1
    public final synchronized View q0(String str) {
        WeakReference<View> weakReference = this.f7558i.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final synchronized void s0(x3.a aVar) {
        if (this.f7559j != null) {
            Object O0 = x3.b.O0(aVar);
            if (!(O0 instanceof View)) {
                io0.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f7559j.m((View) O0);
        }
    }
}
