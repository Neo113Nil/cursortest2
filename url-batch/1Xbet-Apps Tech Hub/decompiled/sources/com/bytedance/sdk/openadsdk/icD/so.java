package com.bytedance.sdk.openadsdk.icD;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ArbitrageLandingLog.java */
/* loaded from: classes2.dex */
public class so {
    private long Mxy;
    private int NB;
    private final cR pvs;
    private int sUS;
    private final WebView yiw;
    private String so = "landingpage";
    private final Map<Integer, Long> icD = new HashMap();
    private final List<Integer> vG = new ArrayList();
    private final Map<Integer, String> Jd = new HashMap();

    public so(cR cRVar, WebView webView) {
        this.pvs = cRVar;
        this.yiw = webView;
    }

    public void pvs(String str) {
        if (pvs(true)) {
            vG.pvs(this.pvs, this.so, this.NB, str);
            this.Jd.put(Integer.valueOf(this.NB), str);
            this.Mxy = SystemClock.elapsedRealtime();
        }
    }

    public void icD(String str) {
        if (pvs(false)) {
            vG.pvs(this.pvs, this.so, this.NB, str, SystemClock.elapsedRealtime() - this.Mxy);
        }
    }

    public void pvs(WebView webView, String str) {
        cR cRVar = this.pvs;
        if (cRVar == null || !com.bytedance.sdk.component.widget.icD.pvs(cRVar.Wyp().pvs(), str)) {
            return;
        }
        String str2 = this.Jd.get(Integer.valueOf(this.NB));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        vG.pvs(this.pvs, this.so, this.NB, str2, str, 2);
    }

    public void vG(String str) {
        String str2 = this.Jd.get(Integer.valueOf(this.NB));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i = this.NB;
        if (i > 0) {
            vG.pvs(this.pvs, this.so, i, str3, str, 1);
        }
    }

    private boolean pvs(boolean z) {
        int i = z ? this.NB : this.sUS;
        icD(z);
        int i2 = z ? this.NB : this.sUS;
        return i2 > 0 && i2 != i;
    }

    private void icD(boolean z) {
        try {
            WebBackForwardList copyBackForwardList = this.yiw.copyBackForwardList();
            if (copyBackForwardList != null) {
                if (z) {
                    this.NB = copyBackForwardList.getCurrentIndex() + 1;
                } else {
                    this.sUS = copyBackForwardList.getCurrentIndex() + 1;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("ArbitrageLandingLog", th.toString());
        }
    }

    public void Jd(String str) {
        this.so = str;
    }
}
