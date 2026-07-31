package com.bytedance.sdk.component.zmn;

import android.webkit.WebView;
import com.bytedance.sdk.component.zmn.zn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public class cn {
    private volatile boolean btk;
    private final List<klz> fb;
    private final WebView fs;
    private final zmn zmn;
    private final bvs zn;

    public static bvs zmn(WebView webView) {
        return new bvs(webView);
    }

    public cn zmn(String str, fb<?, ?> fbVar) {
        return zmn(str, (String) null, fbVar);
    }

    public cn zmn(Set<String> set, kgc<?, ?> kgcVar) {
        return zmn(set, (String) null, kgcVar);
    }

    public cn zmn(String str, String str2, fb<?, ?> fbVar) {
        fs();
        this.zmn.nps.zmn(str, fbVar);
        return this;
    }

    public cn zmn(Set<String> set, String str, kgc<?, ?> kgcVar) {
        fs();
        this.zmn.nps.zmn(set, kgcVar);
        return this;
    }

    public cn zmn(String str, zn.fs fsVar) {
        return zmn(str, (String) null, fsVar);
    }

    public cn zmn(String str, String str2, zn.fs fsVar) {
        fs();
        this.zmn.nps.zmn(str, fsVar);
        return this;
    }

    public void zmn() {
        if (this.btk) {
            return;
        }
        this.zmn.fs();
        this.btk = true;
        Iterator<klz> it = this.fb.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    cn(bvs bvsVar) {
        ArrayList arrayList = new ArrayList();
        this.fb = arrayList;
        this.btk = false;
        this.zn = bvsVar;
        if (bvsVar.zmn != null) {
            zmn zmnVar = bvsVar.fs;
            if (zmnVar == null) {
                this.zmn = new iqz();
            } else {
                this.zmn = zmnVar;
            }
        } else {
            this.zmn = bvsVar.fs;
        }
        this.zmn.zn(bvsVar);
        this.fs = bvsVar.zmn;
        arrayList.add(bvsVar.bvs);
        kw.zmn(bvsVar.nps);
    }

    private void fs() {
        if (this.btk) {
            zg.zmn(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
