package com.bytedance.sdk.component.adexpress.NB;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* compiled from: TTAndroidObjectProxy.java */
/* loaded from: classes.dex */
public class vG {
    private WeakReference<icD> pvs;

    public vG(icD icd) {
        this.pvs = new WeakReference<>(icd);
    }

    public void pvs(icD icd) {
        this.pvs = new WeakReference<>(icd);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<icD> weakReference = this.pvs;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pvs.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<icD> weakReference = this.pvs;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pvs.get().appInfo();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<icD> weakReference = this.pvs;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pvs.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().muteVideo(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().clickEvent(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().skipVideo();
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<icD> weakReference = this.pvs;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pvs.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().initRenderFinish();
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().pvs(str);
    }

    @JavascriptInterface
    public void chooseAdResult(String str) {
        WeakReference<icD> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().chooseAdResult(str);
    }
}
