package com.bytedance.sdk.component.pvs;

import android.webkit.WebView;
import com.bytedance.sdk.component.pvs.Jd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsBridge2.java */
/* loaded from: classes.dex */
public class vA {
    static OT pvs;
    private final Wyp Jd;
    private final List<IP> NB;
    private final pvs icD;
    private volatile boolean sUS;
    private final WebView vG;

    public static Wyp pvs(WebView webView) {
        return new Wyp(webView);
    }

    public vA pvs(String str, NB<?, ?> nb) {
        return pvs(str, (String) null, nb);
    }

    public vA pvs(String str, String str2, NB<?, ?> nb) {
        icD();
        this.icD.yiw.pvs(str, nb);
        return this;
    }

    public vA pvs(String str, Jd.icD icd) {
        return pvs(str, (String) null, icd);
    }

    public vA pvs(String str, String str2, Jd.icD icd) {
        icD();
        this.icD.yiw.pvs(str, icd);
        return this;
    }

    public void pvs() {
        if (this.sUS) {
            return;
        }
        this.icD.icD();
        this.sUS = true;
        Iterator<IP> it = this.NB.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    vA(Wyp wyp) {
        ArrayList arrayList = new ArrayList();
        this.NB = arrayList;
        this.sUS = false;
        this.Jd = wyp;
        if (wyp.so && pvs != null) {
            throw null;
        }
        if (wyp.pvs != null) {
            if (wyp.icD == null) {
                this.icD = new dyT();
            } else {
                this.icD = wyp.icD;
            }
        } else {
            this.icD = wyp.icD;
        }
        this.icD.pvs(wyp, (rCZ) null);
        this.vG = wyp.pvs;
        arrayList.add(wyp.Wyp);
        ZhG.pvs(wyp.yiw);
    }

    private void icD() {
        if (this.sUS) {
            Mxy.pvs(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
