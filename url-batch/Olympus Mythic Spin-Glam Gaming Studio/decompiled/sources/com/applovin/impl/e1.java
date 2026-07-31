package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class e1 implements m1.a {
    private static WeakReference m;
    private static final AtomicBoolean n = new AtomicBoolean();
    private final com.applovin.impl.sdk.k a;
    private final Context b;
    private final Map c;
    private final d1 e;
    private m1 g;
    private g7 h;
    private int i;
    private boolean j;
    private long k;
    private boolean l;
    private final Object d = new Object();
    private WeakReference f = new WeakReference(null);

    class a extends LinkedHashMap {
        a(int i) {
            super(i);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    class b extends com.applovin.impl.b {
        b() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!e1.this.h() || e1.m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = e1.m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(e1.this.e, e1.this.a.e());
                }
                e1.n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = e1.m = null;
            }
        }
    }

    class c implements d.b {
        final /* synthetic */ Object a;

        c(Object obj) {
            this.a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new q1(this.a, e1.this.a.H().b()), e1.this.a);
            e1.n.set(false);
        }
    }

    public e1(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        Context o = com.applovin.impl.sdk.k.o();
        this.b = o;
        this.c = new a(10);
        this.e = new d1(o);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.b, MaxCreativeDebuggerDisplayedAdActivity.class, this.a.e(), new c(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.k);
        if (this.k == 0 || seconds < 10) {
            return;
        }
        this.a.D().a(d2.d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.a.W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.i = 0;
    }

    private void m() {
        this.a.e().a(new b());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.a);
        p0.startActivity(p1);
    }

    public boolean g() {
        return ((Boolean) this.a.a(x4.k1)).booleanValue() && this.a.n0().isCreativeDebuggerEnabled();
    }

    public void k() {
        m1 m1Var = this.g;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.j = ((Boolean) this.a.a(x4.l1)).booleanValue();
            if (this.g == null) {
                this.g = new m1(this.a, this);
            }
            this.g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object a2 = this.a.H().a();
        if (a2 != null) {
            e(a2);
            return;
        }
        synchronized (this.d) {
            arrayList = new ArrayList(this.c.values());
        }
        Collections.reverse(arrayList);
        this.e.a(arrayList, this.a);
        if (!this.l) {
            m();
            this.l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.b, MaxCreativeDebuggerActivity.class);
    }

    @Override // com.applovin.impl.m1.a
    public void b() {
        if (this.i == 0) {
            this.h = g7.a(TimeUnit.SECONDS.toMillis(3L), this.a, new Runnable() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    e1.this.j();
                }
            });
        }
        int i = this.i;
        if (i % 2 == 0) {
            this.i = i + 1;
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!w3.a(obj) || c(obj)) {
                String b2 = b(obj);
                synchronized (this.d) {
                    try {
                        q1 q1Var = (q1) this.c.get(b2);
                        if (q1Var != null) {
                            q1Var.a(obj);
                        } else {
                            this.c.put(b2, new q1(obj, System.currentTimeMillis()));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof y2 ? ((y2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    @Override // com.applovin.impl.m1.a
    public void a() {
        int i = this.i;
        if (i % 2 == 1) {
            this.i = i + 1;
        }
        if (this.i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    e1.this.e();
                }
            });
            this.i = 0;
            this.h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f.get() == null && !h()) {
            Activity b2 = this.a.e().b();
            if (b2 == null) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = b2.findViewById(R.id.content);
            if (findViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a2 = a(frameLayout, b2);
                frameLayout.addView(a2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a2.startAnimation(alphaAnimation);
                final ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        e1.this.a(a2, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        e1.this.a(a2, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
                this.f = new WeakReference(a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.k > 0 && this.j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.j) {
            view.setOnTouchListener(null);
            this.k = 0L;
        }
        frameLayout.removeView(view);
        this.f = new WeakReference(null);
    }

    public String b(q1 q1Var) {
        com.applovin.impl.sdk.ad.b c2 = q1Var.c();
        y2 e = q1Var.e();
        if (c2 == null) {
            if (e != null) {
                return e.D();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(c2.getOriginalFullResponse().toString().getBytes(), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda4
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a2;
                    a2 = e1.this.a(frameLayout, view, motionEvent);
                    return a2;
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e1.this.a(view);
                }
            });
        }
        if (o0.d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    private String b(Object obj) {
        String Q;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            Q = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        } else {
            Q = obj instanceof y2 ? ((y2) obj).Q() : null;
        }
        return StringUtils.isValidString(Q) ? Q : UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.e1$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    e1.this.i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(q1 q1Var, Context context, boolean z) {
        String a2 = a(q1Var);
        v2 v2Var = new v2();
        if (z) {
            v2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        v2Var.b(a2);
        String b2 = b(q1Var);
        if (b2 != null) {
            v2Var.a("\nBid Response:\n");
            v2Var.a(b2);
        }
        String str = q1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage(null), "Share Ad Report");
        if (z) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.a.n0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                return;
            } catch (ActivityNotFoundException unused) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, createChooser);
                return;
            }
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, createChooser);
    }

    public String a(q1 q1Var) {
        v2 v2Var = new v2();
        v2Var.b("Ad Info:\n");
        y2 e = q1Var.e();
        com.applovin.impl.sdk.ad.b c2 = q1Var.c();
        if (e != null) {
            v2Var.a(e);
        } else if (c2 != null) {
            v2Var.a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(c2).b(c2);
        }
        v2Var.a(this.a);
        v2Var.a("Epoch Timestamp (ms)", Long.valueOf(q1Var.b()));
        v2 v2Var2 = new v2();
        v2Var2.a("Platform", "fireos".equals(this.a.A().A()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.a.a(x4.L3)).a("App Package Name", this.b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.a.h0()).a("Ad Review Version", j.b()).a(a(q1Var.a())).a("User ID", this.a.w0().e() != null ? this.a.w0().e() : "None").a("MD", this.a.a(x4.t));
        v2Var.a("\nDebug Info:\n").a(u4.b(v2Var2.toString(), n7.a(this.a), u4.a.V2, this.a.i0(), this.a));
        return v2Var.toString();
    }

    private Bundle a(Object obj) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String a2 = n7.a(obj);
        Bundle a3 = this.a.j().a(a2);
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CreativeDebuggerService", "Serve id: " + a2);
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CreativeDebuggerService", "Public data: " + a3);
        }
        if (a3 == null) {
            return null;
        }
        for (String str : a3.keySet()) {
            Object obj2 = a3.get(str);
            a3.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a3);
        }
        return a3;
    }
}
