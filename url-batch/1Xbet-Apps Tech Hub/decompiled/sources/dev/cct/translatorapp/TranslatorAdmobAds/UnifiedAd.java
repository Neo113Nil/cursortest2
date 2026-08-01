package dev.cct.translatorapp.TranslatorAdmobAds;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes3.dex */
public class UnifiedAd {
    private NativeAd nativeAd;
    private String test;
    private boolean isLoaded = false;
    private boolean isBinded = false;
    private String viewtype = "normal";

    public boolean isBinded() {
        return this.isBinded;
    }

    public void setBinded(boolean binded) {
        this.isBinded = binded;
    }

    public boolean isLoaded() {
        return this.isLoaded;
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public NativeAd getNativeAd() {
        return this.nativeAd;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.nativeAd = nativeAd;
    }

    public String getViewtype() {
        return this.viewtype;
    }

    public void setViewtype(String viewtype) {
        this.viewtype = viewtype;
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
