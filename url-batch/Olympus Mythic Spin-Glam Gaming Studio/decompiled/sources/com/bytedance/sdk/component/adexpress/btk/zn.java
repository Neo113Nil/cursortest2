package com.bytedance.sdk.component.adexpress.btk;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class zn {
    private WeakReference<fs> zmn;

    public zn(fs fsVar) {
        this.zmn = new WeakReference<>(fsVar);
    }

    public void zmn(fs fsVar) {
        this.zmn = new WeakReference<>(fsVar);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference != null && weakReference.get() != null) {
            return this.zmn.get().adInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference != null && weakReference.get() != null) {
            return this.zmn.get().appInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference != null && weakReference.get() != null) {
            return this.zmn.get().getTemplateInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().muteVideo(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().clickEvent(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().skipVideo();
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference != null && weakReference.get() != null) {
            return this.zmn.get().getCurrentVideoState();
        }
        return "";
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().initRenderFinish();
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().zmn(str);
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference != null && weakReference.get() != null) {
            return this.zmn.get().getData(str);
        }
        return "";
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<fs> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().videoFrameChanged(str);
    }
}
