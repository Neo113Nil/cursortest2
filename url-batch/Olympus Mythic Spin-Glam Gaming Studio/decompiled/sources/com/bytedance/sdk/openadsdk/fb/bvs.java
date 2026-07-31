package com.bytedance.sdk.openadsdk.fb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class bvs {
    private final boolean btk;
    private int hhw;
    private long iv;
    private int nps;
    private final WebView zg;
    private final nqi zmn;
    private String bvs = "landingpage";
    private final Map<Integer, Long> fs = new HashMap();
    private final List<Integer> zn = new ArrayList();
    private final Map<Integer, String> fb = new HashMap();

    public bvs(nqi nqiVar, WebView webView, boolean z) {
        this.zmn = nqiVar;
        this.zg = webView;
        this.btk = z;
    }

    public void zmn(String str, int i) {
        if (this.btk) {
            i++;
        }
        if (zmn(true)) {
            zn.zmn(this.zmn, this.bvs, this.hhw, str, i);
            this.fb.put(Integer.valueOf(this.hhw), str);
            this.iv = SystemClock.elapsedRealtime();
        }
    }

    public void zmn(String str) {
        if (zmn(false)) {
            zn.zmn(this.zmn, this.bvs, this.hhw, str, SystemClock.elapsedRealtime() - this.iv);
        }
    }

    public void zmn(WebView webView, String str) {
        nqi nqiVar = this.zmn;
        if (nqiVar == null || !com.bytedance.sdk.component.bvs.fs.zmn(nqiVar.bjh().zn(), str)) {
            return;
        }
        String str2 = this.fb.get(Integer.valueOf(this.hhw));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        zn.zmn(this.zmn, this.bvs, this.hhw, str2, str, 2);
    }

    public void fs(String str) {
        String str2 = this.fb.get(Integer.valueOf(this.hhw));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i = this.hhw;
        if (i > 0) {
            zn.zmn(this.zmn, this.bvs, i, str3, str, 1);
        }
    }

    private boolean zmn(boolean z) {
        int i = z ? this.hhw : this.nps;
        fs(z);
        int i2 = z ? this.hhw : this.nps;
        return i2 > 0 && i2 != i;
    }

    private void fs(boolean z) {
        try {
            WebBackForwardList copyBackForwardList = this.zg.copyBackForwardList();
            if (copyBackForwardList != null) {
                if (z) {
                    int currentIndex = copyBackForwardList.getCurrentIndex();
                    this.hhw = currentIndex + 1;
                    if (this.btk) {
                        this.hhw = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = copyBackForwardList.getCurrentIndex();
                this.nps = currentIndex2 + 1;
                if (this.btk) {
                    this.nps = currentIndex2 + 2;
                }
            }
        } catch (Throwable th) {
            iqz.zn("ArbitrageLandingLog", th.toString());
        }
    }

    public void zn(String str) {
        this.bvs = str;
    }
}
