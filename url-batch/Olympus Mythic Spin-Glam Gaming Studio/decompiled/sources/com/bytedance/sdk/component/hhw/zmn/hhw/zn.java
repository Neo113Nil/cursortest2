package com.bytedance.sdk.component.hhw.zmn.hhw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.hhw.zmn.nps;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zn implements fs {
    private final btk fs;
    private final Context zmn;

    public zn(Context context, btk btkVar) {
        this.zmn = context;
        this.fs = btkVar;
    }

    public Context zmn() {
        Context context = this.zmn;
        return context == null ? nps.hhw().btk() : context;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.hhw.fs
    public void zmn(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.hhw.zmn.btk cn = nps.hhw().cn();
        if (cn == null || nps.hhw().btk() == null || cn.fb() == null || !cn.zn() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            cn.fb().execute(new zmn(new fb(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.hhw.fs
    public Runnable zmn(final fb fbVar, final String str, final Map<String, String> map) {
        if (fbVar == null || TextUtils.isEmpty(fbVar.zmn())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.hhw.zmn.hhw.zn.1
            @Override // java.lang.Runnable
            public void run() {
                if (zn.this.fs.zmn(fbVar.zmn()) != null) {
                    new zmn(fbVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.hhw.fs
    public void zmn(final String str, final boolean z) {
        com.bytedance.sdk.component.hhw.zmn.btk cn = nps.hhw().cn();
        if (cn == null || nps.hhw().btk() == null || !cn.zn()) {
            return;
        }
        com.bytedance.sdk.component.hhw.zmn.btk.btk btkVar = new com.bytedance.sdk.component.hhw.zmn.btk.btk("trackFailedUrls") { // from class: com.bytedance.sdk.component.hhw.zmn.hhw.zn.2
            @Override // java.lang.Runnable
            public void run() {
                zn.this.zmn(zn.this.fs.zmn(), str, z);
            }
        };
        btkVar.zmn(1);
        if (cn.fb() != null) {
            cn.fb().execute(btkVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(List<fb> list, String str, boolean z) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.hhw.zmn.btk cn = nps.hhw().cn();
        for (fb fbVar : list) {
            if (cn != null && cn.fb() != null) {
                fbVar.zmn(z);
                cn.fb().execute(new zmn(fbVar, str, null));
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    private class zmn extends com.bytedance.sdk.component.hhw.zmn.btk.btk {
        private final Map<String, String> fb;
        private final fb fs;
        private final String zn;

        private zmn(fb fbVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.fs = fbVar;
            this.zn = str;
            this.fb = map;
        }

        private String zn(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.zn)) ? str.replace("{UID}", this.zn).replace("__UID__", this.zn) : str;
        }

        boolean zmn(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith(d.v) || str.startsWith(d.u);
        }

        String fs(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(zn.zn().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.hhw.zmn.btk.fb fbVar;
            com.bytedance.sdk.component.hhw.zmn.btk cn = nps.hhw().cn();
            if (cn == null || nps.hhw().btk() == null || !cn.zn() || !zmn(this.fs.fs())) {
                return;
            }
            if (this.fs.fb() >= cn.zn(this.fs.hhw())) {
                zn.this.fs.zn(this.fs);
                return;
            }
            try {
                if (this.fs.rc()) {
                    zn.this.fs.zmn(this.fs);
                }
                if (cn.zmn(zn.this.zmn())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String fs = this.fs.fs();
                    if (cn.hhw() == 0) {
                        fs = zn(this.fs.fs());
                        if (this.fs.zn()) {
                            fs = fs(fs);
                        }
                    }
                    com.bytedance.sdk.component.hhw.zmn.btk.zn iv = cn.iv();
                    if (iv == null) {
                        return;
                    }
                    iv.zmn("User-Agent", cn.bvs());
                    iv.zmn("csj_client_source_from", "1");
                    if (this.fb != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.fb.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        iv.zmn("csj_extra_info", jSONObject.toString());
                    }
                    iv.zmn(fs);
                    try {
                        fbVar = iv.zmn();
                        try {
                            fbVar.zmn();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        fbVar = null;
                    }
                    fb fbVar2 = this.fs;
                    fbVar2.zmn(fbVar2.fb() + 1);
                    if (fbVar != null && fbVar.zmn()) {
                        zn.this.fs.zn(this.fs);
                        this.fs.fs();
                        cn.zmn(true, 200, System.currentTimeMillis() - currentTimeMillis, this.fs);
                        return;
                    }
                    if (fbVar != null) {
                        this.fs.fs(fbVar.fs());
                        this.fs.zn(fbVar.zn());
                    }
                    if (fbVar != null && fbVar.fs() == 8848) {
                        fbVar.zn();
                        zn.this.fs.zn(this.fs);
                    } else {
                        this.fs.fs();
                        if (this.fs.fb() >= cn.zn(this.fs.hhw())) {
                            zn.this.fs.zn(this.fs);
                            this.fs.fs();
                        } else {
                            zn.this.fs.fs(this.fs);
                        }
                    }
                    cn.zmn(false, this.fs.zg(), System.currentTimeMillis() - currentTimeMillis, this.fs);
                }
            } catch (Throwable unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random zn() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
