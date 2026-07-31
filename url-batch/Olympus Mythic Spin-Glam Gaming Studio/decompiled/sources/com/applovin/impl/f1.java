package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes13.dex */
public class f1 {
    private final com.applovin.impl.sdk.k a;
    private CustomTabsClient b;

    class a extends CustomTabsServiceConnection {
        a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            f1.this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            f1.this.b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f1.this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            f1.this.b = null;
        }
    }

    private class b extends CustomTabsCallback {
        private final WeakReference a;

        public b(com.applovin.impl.adview.a aVar) {
            this.a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.a.get();
            if (aVar == null) {
                f1.this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.a.O().b("CustomTabsManager", "Unable to track navigation event (" + i + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b g = aVar.g();
            if (g == null) {
                f1.this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.a.O().b("CustomTabsManager", "Unable to track navigation event (" + i + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackCustomTabsNavigationStarted(g);
                        break;
                    }
                    break;
                case 2:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackCustomTabsNavigationFinished(g);
                        break;
                    }
                    break;
                case 3:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackCustomTabsNavigationFailed(g);
                        break;
                    }
                    break;
                case 4:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackCustomTabsNavigationAborted(g);
                        break;
                    }
                    break;
                case 5:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackCustomTabsTabShown(g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    t2.c(aVar.e(), g, aVar.i());
                    break;
                case 6:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackCustomTabsTabHidden(g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    t2.a(aVar.e(), g, aVar.i());
                    break;
                default:
                    f1.this.a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.a.O().a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            f1.this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o O = f1.this.a.O();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : X3.i.t);
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                O.a("CustomTabsManager", sb.toString());
            }
        }
    }

    private class c extends CustomTabsCallback {
        private final WeakReference a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.a.get();
            if (appLovinNativeAdImpl == null) {
                f1.this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.a.O().b("CustomTabsManager", "Unable to track navigation event (" + i + "). Native ad is null.");
                }
                return;
            }
            switch (i) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.a.k().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    f1.this.a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.a.O().a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            f1.this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o O = f1.this.a.O();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : X3.i.t);
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                O.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public f1(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, com.safedk.android.utils.h.a);
        p0.launchUrl(p1, p2);
    }

    public void b(final List list, final CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession != null) {
            a("warmup urls", new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    f1.this.a(list, customTabsSession);
                }
            });
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.a.a(x4.d7)).booleanValue() && this.b == null) {
            String packageName = CustomTabsClient.getPackageName(com.applovin.impl.sdk.k.o(), this.a.c(x4.e7), true);
            String packageName2 = CustomTabsClient.getPackageName(com.applovin.impl.sdk.k.o(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.a.a(x4.f7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(g1 g1Var, CustomTabsSession customTabsSession) {
        this.b.warmup(0L);
        if (g1Var == null) {
            return;
        }
        Integer e = g1Var.e();
        String b2 = g1Var.b();
        if (e == null || TextUtils.isEmpty(b2)) {
            return;
        }
        if (customTabsSession == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Validating session-URL relation: " + e + " with digital asset link: " + b2);
        }
        customTabsSession.validateRelationship(e.intValue(), Uri.parse(b2), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (com.applovin.impl.sdk.o.a() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(LinkedList linkedList) {
        boolean z = false;
        try {
            z = CustomTabsClient.bindCustomTabsService(com.applovin.impl.sdk.k.o(), (String) linkedList.poll(), new a());
            if (!z) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
            if (z || linkedList.isEmpty()) {
            } else {
                this.a.O();
            }
        } catch (Throwable th) {
            try {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().a("CustomTabsManager", "Failed to bind to service", th);
                }
            } finally {
                if (!z && !linkedList.isEmpty()) {
                    this.a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
    }

    public CustomTabsSession a(com.applovin.impl.adview.a aVar) {
        if (this.b == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession newSession = this.b.newSession(new b(aVar));
            a(newSession, aVar.g());
            return newSession;
        } catch (Exception e) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    public CustomTabsSession a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.b == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession newSession = this.b.newSession(new c(appLovinNativeAdImpl));
            a(newSession, appLovinNativeAdImpl);
            return newSession;
        } catch (Exception e) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, CustomTabsSession customTabsSession) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsService.KEY_URL, Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean mayLaunchUrl = customTabsSession.mayLaunchUrl(Uri.parse(str), null, arrayList);
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o O = this.a.O();
            StringBuilder sb = new StringBuilder();
            sb.append("Warmup for URLs ");
            sb.append(mayLaunchUrl ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : X3.i.t);
            O.a("CustomTabsManager", sb.toString());
        }
    }

    public void a(final Uri uri, final com.applovin.impl.adview.a aVar, final Activity activity) {
        if (aVar.h() == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                f1.this.a(aVar, activity, uri);
            }
        })) {
            this.a.m0().pauseForClick();
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(aVar, activity), activity, uri);
    }

    public boolean a(final Uri uri, final AppLovinNativeAdImpl appLovinNativeAdImpl, final Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean a2 = a("launch uri", new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                f1.this.a(appLovinNativeAdImpl, activity, uri);
            }
        });
        if (a2) {
            this.a.m0().pauseForClick();
        } else {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
            }
            a(uri, activity);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(appLovinNativeAdImpl, activity), activity, uri);
    }

    private void a(CustomTabsSession customTabsSession, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), customTabsSession);
    }

    private void a(CustomTabsSession customTabsSession, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), customTabsSession);
    }

    private void a(final g1 g1Var, final CustomTabsSession customTabsSession) {
        a("client warmup", new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                f1.this.b(g1Var, customTabsSession);
            }
        });
    }

    private CustomTabsIntent a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b g = aVar.g();
        return a(g != null ? g.getCustomTabsSettings() : null, g != null ? g.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private CustomTabsIntent a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private CustomTabsIntent a(g1 g1Var, Bundle bundle, CustomTabsSession customTabsSession, Activity activity) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSession);
        if (((Boolean) this.a.a(x4.g7)).booleanValue()) {
            builder.setStartAnimations(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
            builder.setExitAnimations(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
        }
        if (g1Var != null) {
            Integer h = g1Var.h();
            if (h != null) {
                builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(h.intValue()).build());
            }
            Integer a2 = g1Var.a();
            if (a2 != null) {
                builder.setColorSchemeParams(2, new CustomTabColorSchemeParams.Builder().setToolbarColor(a2.intValue()).build());
            }
            Boolean i = g1Var.i();
            if (i != null) {
                builder.setUrlBarHidingEnabled(i.booleanValue());
            }
            Boolean g = g1Var.g();
            if (g != null) {
                builder.setShowTitle(g.booleanValue());
            }
            Boolean c2 = g1Var.c();
            if (c2 != null) {
                builder.setInstantAppsEnabled(c2.booleanValue());
            }
            Integer f = g1Var.f();
            if (f != null) {
                builder.setShareState(f.intValue());
            }
        }
        CustomTabsIntent build = builder.build();
        if (g1Var != null) {
            String d = g1Var.d();
            if (d != null) {
                build.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(d));
            }
            if (!bundle.isEmpty()) {
                build.intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        return build;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.a.a(x4.h7)).booleanValue()) {
            k7.a(uri, activity, this.a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.a.D().a("CustomTabsManager", str, th);
            return false;
        }
    }
}
