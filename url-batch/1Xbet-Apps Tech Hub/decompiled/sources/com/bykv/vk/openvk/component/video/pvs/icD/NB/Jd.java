package com.bykv.vk.openvk.component.video.pvs.icD.NB;

import android.text.TextUtils;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.qh;
import java.io.IOException;
import java.util.Map;

/* compiled from: NetworkSoureVolleyImpl.java */
/* loaded from: classes.dex */
public class Jd implements icD {
    private qh pvs;

    public Jd() {
        this.pvs = null;
        this.pvs = com.bykv.vk.openvk.component.video.api.vG.Jd();
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.NB.icD
    public pvs pvs(NB nb) throws IOException {
        Ju.pvs pvsVar = new Ju.pvs();
        try {
            if (nb.NB != null) {
                for (Map.Entry<String, String> entry : nb.NB.entrySet()) {
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
            bNS pvs = this.pvs.pvs(pvsVar.icD(nb.icD).pvs().pvs("videoPreloadLowVersion").pvs(6).icD()).pvs();
            Object[] objArr = new Object[2];
            Integer.valueOf(pvs.vG());
            return new sUS(pvs, nb);
        } catch (Throwable unused) {
            return null;
        }
    }
}
