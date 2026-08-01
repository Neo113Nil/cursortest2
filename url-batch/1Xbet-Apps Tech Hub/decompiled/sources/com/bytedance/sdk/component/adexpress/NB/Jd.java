package com.bytedance.sdk.component.adexpress.NB;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.pvs.dyT;
import java.lang.ref.WeakReference;

/* compiled from: WebViewBridgeProxy.java */
/* loaded from: classes.dex */
public class Jd {
    private WeakReference<dyT> pvs;

    public Jd(dyT dyt) {
        this.pvs = new WeakReference<>(dyt);
    }

    public void pvs(dyT dyt) {
        this.pvs = new WeakReference<>(dyt);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<dyT> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().invokeMethod(str);
    }
}
