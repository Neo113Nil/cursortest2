package com.moat.analytics.mobile.iro;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.iro.NoOp;
import com.moat.analytics.mobile.iro.base.functional.Optional;
import com.moat.analytics.mobile.iro.s;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
final class n extends MoatFactory {
    n() throws o {
        if (((j) j.getInstance()).m1263()) {
            return;
        }
        String str = "Failed to initialize MoatFactory, SDK was not started";
        b.m1182(3, "Factory", this, str);
        b.m1180("[ERROR] ", str);
        throw new o("Failed to initialize MoatFactory");
    }

    @Override // com.moat.analytics.mobile.iro.MoatFactory
    public final WebAdTracker createWebAdTracker(WebView webView) {
        try {
            final WeakReference weakReference = new WeakReference(webView);
            return (WebAdTracker) s.m1310(new s.a<WebAdTracker>() { // from class: com.moat.analytics.mobile.iro.n.3
                @Override // com.moat.analytics.mobile.iro.s.a
                /* renamed from: ˏ */
                public final Optional<WebAdTracker> mo1169() {
                    WebView webView2 = (WebView) weakReference.get();
                    String str = "Attempting to create WebAdTracker for " + b.m1184(webView2);
                    b.m1182(3, "Factory", this, str);
                    b.m1180("[INFO] ", str);
                    return Optional.of(new x(webView2));
                }
            }, WebAdTracker.class);
        } catch (Exception e) {
            o.m1290(e);
            return new NoOp.b();
        }
    }

    @Override // com.moat.analytics.mobile.iro.MoatFactory
    public final WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
        try {
            final WeakReference weakReference = new WeakReference(viewGroup);
            return (WebAdTracker) s.m1310(new s.a<WebAdTracker>() { // from class: com.moat.analytics.mobile.iro.n.4
                @Override // com.moat.analytics.mobile.iro.s.a
                /* renamed from: ˏ */
                public final Optional<WebAdTracker> mo1169() throws o {
                    ViewGroup viewGroup2 = (ViewGroup) weakReference.get();
                    String str = "Attempting to create WebAdTracker for adContainer " + b.m1184(viewGroup2);
                    b.m1182(3, "Factory", this, str);
                    b.m1180("[INFO] ", str);
                    return Optional.of(new x(viewGroup2));
                }
            }, WebAdTracker.class);
        } catch (Exception e) {
            o.m1290(e);
            return new NoOp.b();
        }
    }

    @Override // com.moat.analytics.mobile.iro.MoatFactory
    public final NativeDisplayTracker createNativeDisplayTracker(View view, final Map<String, String> map) {
        try {
            final WeakReference weakReference = new WeakReference(view);
            return (NativeDisplayTracker) s.m1310(new s.a<NativeDisplayTracker>() { // from class: com.moat.analytics.mobile.iro.n.5
                @Override // com.moat.analytics.mobile.iro.s.a
                /* renamed from: ˏ */
                public final Optional<NativeDisplayTracker> mo1169() {
                    View view2 = (View) weakReference.get();
                    String str = "Attempting to create NativeDisplayTracker for " + b.m1184(view2);
                    b.m1182(3, "Factory", this, str);
                    b.m1180("[INFO] ", str);
                    return Optional.of(new r(view2, map));
                }
            }, NativeDisplayTracker.class);
        } catch (Exception e) {
            o.m1290(e);
            return new NoOp.a();
        }
    }

    @Override // com.moat.analytics.mobile.iro.MoatFactory
    public final NativeVideoTracker createNativeVideoTracker(final String str) {
        try {
            return (NativeVideoTracker) s.m1310(new s.a<NativeVideoTracker>() { // from class: com.moat.analytics.mobile.iro.n.2
                @Override // com.moat.analytics.mobile.iro.s.a
                /* renamed from: ˏ */
                public final Optional<NativeVideoTracker> mo1169() {
                    b.m1182(3, "Factory", this, "Attempting to create NativeVideoTracker");
                    b.m1180("[INFO] ", "Attempting to create NativeVideoTracker");
                    return Optional.of(new q(str));
                }
            }, NativeVideoTracker.class);
        } catch (Exception e) {
            o.m1290(e);
            return new NoOp.c();
        }
    }

    @Override // com.moat.analytics.mobile.iro.MoatFactory
    public final <T> T createCustomTracker(m<T> mVar) {
        try {
            return mVar.create();
        } catch (Exception e) {
            o.m1290(e);
            return mVar.createNoOp();
        }
    }
}
