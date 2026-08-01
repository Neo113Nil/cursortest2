package com.bytedance.sdk.component.sUS.pvs.sUS;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.so;
import com.google.common.net.HttpHeaders;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: TrackAdUrlImpl.java */
/* loaded from: classes.dex */
public class vG implements icD {
    private final NB icD;
    private final Context pvs;

    public vG(Context context, NB nb) {
        this.pvs = context;
        this.icD = nb;
    }

    public Context pvs() {
        Context context = this.pvs;
        return context == null ? so.yiw().sUS() : context;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS.icD
    public void pvs(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.sUS.pvs.NB mnm = so.yiw().mnm();
        if (mnm == null || so.yiw().sUS() == null || mnm.Jd() == null || !mnm.vG() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            mnm.Jd().execute(new pvs(new Jd(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS.icD
    public Runnable pvs(final Jd jd, final String str, final Map<String, String> map) {
        if (jd == null || TextUtils.isEmpty(jd.pvs())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.sUS.pvs.sUS.vG.1
            @Override // java.lang.Runnable
            public void run() {
                if (vG.this.icD.pvs(jd.pvs()) != null) {
                    new pvs(jd, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.sUS.icD
    public void pvs(final String str, final boolean z) {
        com.bytedance.sdk.component.sUS.pvs.NB mnm = so.yiw().mnm();
        if (mnm == null || so.yiw().sUS() == null || !mnm.vG()) {
            return;
        }
        com.bytedance.sdk.component.sUS.pvs.NB.NB nb = new com.bytedance.sdk.component.sUS.pvs.NB.NB("trackFailedUrls") { // from class: com.bytedance.sdk.component.sUS.pvs.sUS.vG.2
            @Override // java.lang.Runnable
            public void run() {
                vG.this.pvs(vG.this.icD.pvs(), str, z);
            }
        };
        nb.pvs(1);
        if (mnm.Jd() != null) {
            mnm.Jd().execute(nb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(List<Jd> list, String str, boolean z) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.sUS.pvs.NB mnm = so.yiw().mnm();
        for (Jd jd : list) {
            if (mnm != null && mnm.Jd() != null) {
                jd.pvs(z);
                mnm.Jd().execute(new pvs(jd, str, null));
            }
        }
    }

    /* compiled from: TrackAdUrlImpl.java */
    private class pvs extends com.bytedance.sdk.component.sUS.pvs.NB.NB {
        private final Map<String, String> Jd;
        private final Jd icD;
        private final String vG;

        private pvs(Jd jd, String str, Map<String, String> map) {
            super("AdsStats");
            this.icD = jd;
            this.vG = str;
            this.Jd = map;
        }

        private String vG(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.vG)) ? str.replace("{UID}", this.vG).replace("__UID__", this.vG) : str;
        }

        boolean pvs(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        String icD(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(vG.vG().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.sUS.pvs.NB.Jd jd;
            com.bytedance.sdk.component.sUS.pvs.NB mnm = so.yiw().mnm();
            if (mnm == null || so.yiw().sUS() == null || !mnm.vG() || !pvs(this.icD.icD())) {
                return;
            }
            if (this.icD.Jd() >= mnm.vG(this.icD.sUS())) {
                vG.this.icD.vG(this.icD);
                return;
            }
            try {
                mnm.Ju();
                if (this.icD.qh()) {
                    vG.this.icD.pvs(this.icD);
                }
                if (mnm.pvs(vG.this.pvs())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String icD = this.icD.icD();
                    if (mnm.sUS() == 0) {
                        icD = vG(this.icD.icD());
                        if (this.icD.vG()) {
                            icD = icD(icD);
                        }
                    }
                    com.bytedance.sdk.component.sUS.pvs.NB.vG Wyp = mnm.Wyp();
                    if (Wyp == null) {
                        return;
                    }
                    Wyp.pvs(HttpHeaders.USER_AGENT, mnm.Mxy());
                    Wyp.pvs("csj_client_source_from", "1");
                    if (this.Jd != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.Jd.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        Wyp.pvs("csj_extra_info", jSONObject.toString());
                    }
                    Wyp.pvs(icD);
                    try {
                        jd = Wyp.pvs();
                        try {
                            mnm.pvs(jd.pvs());
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        jd = null;
                    }
                    Jd jd2 = this.icD;
                    jd2.pvs(jd2.Jd() + 1);
                    if (jd != null && jd.pvs()) {
                        vG.this.icD.vG(this.icD);
                        this.icD.icD();
                        mnm.pvs(true, 200, System.currentTimeMillis() - currentTimeMillis, this.icD);
                        return;
                    }
                    if (jd != null) {
                        this.icD.icD(jd.icD());
                        this.icD.vG(jd.vG());
                    }
                    if (jd != null && jd.icD() == 8848) {
                        jd.vG();
                        vG.this.icD.vG(this.icD);
                    } else {
                        this.icD.icD();
                        if (this.icD.Jd() >= mnm.vG(this.icD.sUS())) {
                            vG.this.icD.vG(this.icD);
                            this.icD.icD();
                        } else {
                            vG.this.icD.icD(this.icD);
                        }
                    }
                    mnm.pvs(false, this.icD.so(), System.currentTimeMillis() - currentTimeMillis, this.icD);
                }
            } catch (Throwable unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random vG() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
