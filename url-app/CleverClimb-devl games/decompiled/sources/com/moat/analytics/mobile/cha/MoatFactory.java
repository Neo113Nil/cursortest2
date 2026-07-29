package com.moat.analytics.mobile.cha;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.cha.NoOp;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MoatFactory {
    public abstract <T> T createCustomTracker(l<T> lVar);

    public abstract NativeDisplayTracker createNativeDisplayTracker(View view, Map<String, String> map);

    public abstract NativeVideoTracker createNativeVideoTracker(String str);

    public abstract WebAdTracker createWebAdTracker(ViewGroup viewGroup);

    public abstract WebAdTracker createWebAdTracker(WebView webView);

    public static MoatFactory create() {
        try {
            return new k();
        } catch (Exception e) {
            o.m1110(e);
            return new NoOp.MoatFactory();
        }
    }
}
