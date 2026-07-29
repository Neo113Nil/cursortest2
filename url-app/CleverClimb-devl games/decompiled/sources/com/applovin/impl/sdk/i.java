package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import com.applovin.impl.sdk.h;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class i implements h.a, AppLovinWebViewActivity.EventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f3276a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference<AppLovinWebViewActivity> f3277b;

    /* renamed from: c, reason: collision with root package name */
    private final j f3278c;

    /* renamed from: d, reason: collision with root package name */
    private final p f3279d;
    private AppLovinUserService.OnConsentDialogDismissListener e;
    private h f;
    private WeakReference<Activity> g;
    private com.applovin.impl.sdk.e.a h;

    i(j jVar) {
        this.g = new WeakReference<>(null);
        this.f3278c = jVar;
        this.f3279d = jVar.u();
        if (jVar.y() != null) {
            this.g = new WeakReference<>(jVar.y());
        }
        jVar.S().a(new com.applovin.impl.sdk.e.a() { // from class: com.applovin.impl.sdk.i.1
            @Override // com.applovin.impl.sdk.e.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                i.this.g = new WeakReference(activity);
            }
        });
        this.f = new h(this, jVar);
    }

    private void a(boolean z, long j) {
        f();
        if (z) {
            a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(j jVar) {
        if (!com.applovin.impl.sdk.e.d.a((Class<?>) AppLovinWebViewActivity.class, jVar.w())) {
            this.f3279d.e("AppLovinSdk", "Unable to show consent dialog. Please add <activity android:name=\"com.applovin.sdk.AppLovinWebViewActivity\" android:configChanges=\"keyboardHidden|orientation|screenSize\"/> to your AndroidManifest.xml file.");
            return false;
        }
        if (c()) {
            this.f3279d.e("AppLovinSdk", "Consent dialog already showing");
            return false;
        }
        if (!com.applovin.impl.sdk.e.e.a(jVar.w(), jVar)) {
            this.f3279d.e("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        }
        if (!((Boolean) jVar.a(com.applovin.impl.sdk.b.b.ac)).booleanValue()) {
            this.f3279d.d("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            return false;
        }
        if (com.applovin.impl.sdk.e.i.b((String) jVar.a(com.applovin.impl.sdk.b.b.ad))) {
            return true;
        }
        this.f3279d.d("ConsentDialogManager", "AdServer returned empty consent dialog URL");
        return false;
    }

    private void f() {
        this.f3278c.S().b(this.h);
        if (c()) {
            AppLovinWebViewActivity appLovinWebViewActivity = f3277b.get();
            f3277b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                if (this.e != null) {
                    this.e.onDismiss();
                    this.e = null;
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.h.a
    public void a() {
        this.f3279d.a("ConsentDialogManager", "User accepted consent alert");
        if (this.g.get() != null) {
            final Activity activity = this.g.get();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.i.4
                @Override // java.lang.Runnable
                public void run() {
                    i.this.a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f3278c.a(com.applovin.impl.sdk.b.b.af)).longValue());
        }
    }

    public void a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.i.3
            @Override // java.lang.Runnable
            public void run() {
                i.this.f3279d.a("ConsentDialogManager", "Scheduling repeating consent alert");
                i.this.f.a(j, i.this.f3278c, i.this);
            }
        });
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.i.2
            @Override // java.lang.Runnable
            public void run() {
                if (!i.this.a(i.this.f3278c) || i.f3276a.getAndSet(true)) {
                    if (onConsentDialogDismissListener != null) {
                        onConsentDialogDismissListener.onDismiss();
                        return;
                    }
                    return;
                }
                i.this.g = new WeakReference(activity);
                i.this.e = onConsentDialogDismissListener;
                i.this.h = new com.applovin.impl.sdk.e.a() { // from class: com.applovin.impl.sdk.i.2.1
                    @Override // com.applovin.impl.sdk.e.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity2) {
                        if (activity2 instanceof AppLovinWebViewActivity) {
                            if (!i.this.c() || i.f3277b.get() != activity2) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity2;
                                WeakReference unused = i.f3277b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) i.this.f3278c.a(com.applovin.impl.sdk.b.b.ad), i.this);
                            }
                            i.f3276a.set(false);
                        }
                    }
                };
                i.this.f3278c.S().a(i.this.h);
                Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, i.this.f3278c.s());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) i.this.f3278c.a(com.applovin.impl.sdk.b.b.ae));
                activity.startActivity(intent);
            }
        });
    }

    @Override // com.applovin.impl.sdk.h.a
    public void b() {
        this.f3279d.a("ConsentDialogManager", "User rejected consent alert");
    }

    boolean c() {
        return (f3277b == null || f3277b.get() == null) ? false : true;
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        boolean booleanValue;
        j jVar;
        com.applovin.impl.sdk.b.b<Long> bVar;
        this.f3279d.a("ConsentDialogManager", "Received event: " + str);
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f3278c.w());
            f();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f3278c.w());
            booleanValue = ((Boolean) this.f3278c.a(com.applovin.impl.sdk.b.b.ag)).booleanValue();
            jVar = this.f3278c;
            bVar = com.applovin.impl.sdk.b.b.al;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f3278c.a(com.applovin.impl.sdk.b.b.ah)).booleanValue();
            jVar = this.f3278c;
            bVar = com.applovin.impl.sdk.b.b.am;
        } else {
            if (!AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
                return;
            }
            booleanValue = ((Boolean) this.f3278c.a(com.applovin.impl.sdk.b.b.ai)).booleanValue();
            jVar = this.f3278c;
            bVar = com.applovin.impl.sdk.b.b.an;
        }
        a(booleanValue, ((Long) jVar.a(bVar)).longValue());
    }
}
