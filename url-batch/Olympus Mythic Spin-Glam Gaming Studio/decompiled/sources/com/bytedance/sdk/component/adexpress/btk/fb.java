package com.bytedance.sdk.component.adexpress.btk;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.zmn.iqz;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class fb {
    private WeakReference<iqz> zmn;

    public fb(iqz iqzVar) {
        this.zmn = new WeakReference<>(iqzVar);
    }

    public void zmn(iqz iqzVar) {
        this.zmn = new WeakReference<>(iqzVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<iqz> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().invokeMethod(str);
    }
}
