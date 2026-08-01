package com.bytedance.sdk.component.yiw.icD;

import android.text.TextUtils;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.qh;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: NetExecutor.java */
/* loaded from: classes.dex */
public abstract class vG {
    String NB;
    int sUS;
    protected qh vG;
    protected String Jd = null;
    protected final Map<String, String> yiw = new HashMap();
    protected String so = null;
    protected boolean Mxy = false;

    public void pvs(String str) {
        this.NB = str;
    }

    public void pvs(int i) {
        this.sUS = i;
    }

    public vG(qh qhVar) {
        this.vG = qhVar;
        vG(UUID.randomUUID().toString());
    }

    public void icD(String str) {
        this.so = str;
    }

    public void icD(String str, String str2) {
        this.yiw.put(str, str2);
    }

    public void Jd(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.yiw.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void vG(String str) {
        this.Jd = str;
    }

    public String icD() {
        return this.Jd;
    }

    protected void pvs(Ju.pvs pvsVar) {
        if (pvsVar != null && this.yiw.size() > 0) {
            for (Map.Entry<String, String> entry : this.yiw.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    pvsVar.icD(key, value);
                }
            }
        }
    }
}
