package com.bytedance.sdk.component.pvs;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.pvs.qh;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Environment.java */
/* loaded from: classes.dex */
public class Wyp {
    boolean IP;
    so Jd;
    Ju Mxy;
    Context NB;
    IP Wyp;
    boolean bNS;
    pvs icD;
    qh.pvs mnm;
    WebView pvs;
    boolean sUS;
    boolean so;
    boolean yiw;
    String vG = "IESJSBridge";
    String qh = "host";
    final Set<String> kj = new LinkedHashSet();
    final Set<String> Ju = new LinkedHashSet();

    Wyp(WebView webView) {
        this.pvs = webView;
    }

    Wyp() {
    }

    public Wyp pvs(pvs pvsVar) {
        this.icD = pvsVar;
        return this;
    }

    public Wyp pvs(String str) {
        this.vG = str;
        return this;
    }

    public Wyp pvs(kj kjVar) {
        this.Jd = so.pvs(kjVar);
        return this;
    }

    public Wyp pvs(boolean z) {
        this.sUS = z;
        return this;
    }

    public Wyp icD(boolean z) {
        this.yiw = z;
        return this;
    }

    public Wyp pvs() {
        this.bNS = true;
        return this;
    }

    public vA icD() {
        vG();
        return new vA(this);
    }

    private void vG() {
        if ((this.pvs == null && !this.IP && this.icD == null) || ((TextUtils.isEmpty(this.vG) && this.pvs != null) || this.Jd == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
