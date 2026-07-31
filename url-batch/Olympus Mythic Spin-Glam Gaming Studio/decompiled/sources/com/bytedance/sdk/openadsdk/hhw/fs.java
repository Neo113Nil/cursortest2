package com.bytedance.sdk.openadsdk.hhw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.zg;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.utils.fkt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class fs {
    private static volatile fs zmn;
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.olo.zmn> fs = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.olo.zmn zn = null;
    private volatile boolean fb = false;
    private volatile HandlerThread btk = null;
    private volatile Handler hhw = null;
    private String nps = "";
    private int zg = 0;
    private volatile long bvs = 0;
    private final Runnable iv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hhw.fs.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                } catch (Throwable th) {
                    iqz.zn(th.getMessage(), new Object[0]);
                }
                if (zmn.zmn().btk()) {
                    Set<String> keySet = fs.this.fs.keySet();
                    if (keySet.size() > fs.this.zg) {
                        fs.this.zg = keySet.size();
                    }
                    HashSet hashSet = new HashSet(5);
                    ArrayList arrayList = new ArrayList(keySet.size());
                    arrayList.addAll(fs.this.fs.values());
                    Collections.sort(arrayList);
                    for (int i = 0; i < arrayList.size() && i < 5; i++) {
                        hashSet.add(((com.bytedance.sdk.openadsdk.olo.zmn) arrayList.get(i)).fs());
                    }
                    try {
                        for (String str : keySet) {
                            com.bytedance.sdk.openadsdk.olo.zmn zmnVar = (com.bytedance.sdk.openadsdk.olo.zmn) fs.this.fs.get(str);
                            if (zmnVar != null) {
                                JSONObject zmn2 = zmnVar.zmn(jSONObject2);
                                if (hashSet.contains(str)) {
                                    jSONObject.put(str, zmn2);
                                }
                            }
                        }
                        jSONObject.put("common", jSONObject2);
                    } catch (JSONException e) {
                        iqz.zn(e.getMessage(), new Object[0]);
                    }
                    fs.this.nps = jSONObject.toString();
                    fs fsVar = fs.this;
                    fsVar.zmn(fsVar.iv, zmn.zmn().fb());
                }
                try {
                    if (fs.this.zn != null) {
                        jSONObject.put("common", fs.this.zn.zmn(jSONObject2));
                    }
                } catch (JSONException e2) {
                    iqz.zn(e2.getMessage(), new Object[0]);
                }
                fs.this.nps = jSONObject.toString();
                fs fsVar2 = fs.this;
                fsVar2.zmn(fsVar2.iv, zmn.zmn().fb());
            } catch (OutOfMemoryError e3) {
                iqz.zn(e3.getMessage(), new Object[0]);
            }
        }
    };

    private Handler zn() {
        if (this.btk == null || !this.btk.isAlive()) {
            synchronized (cn.class) {
                try {
                    if (this.btk != null) {
                        if (!this.btk.isAlive()) {
                        }
                    }
                    this.btk = zg.zmn("pag_feature", -1);
                    this.hhw = new Handler(this.btk.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (this.hhw == null) {
            synchronized (cn.class) {
                try {
                    if (this.hhw == null) {
                        this.hhw = new Handler(this.btk.getLooper());
                    }
                } finally {
                }
            }
        }
        return this.hhw;
    }

    private void zmn(Runnable runnable) {
        if (fkt.zmn || runnable == null) {
            return;
        }
        try {
            zn().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(Runnable runnable, long j) {
        if (fkt.zmn || runnable == null) {
            return;
        }
        try {
            zn().postDelayed(runnable, j);
        } catch (Throwable unused) {
        }
    }

    private fs() {
    }

    public static fs zmn() {
        if (zmn == null) {
            synchronized (zn.class) {
                try {
                    if (zmn == null) {
                        zmn = new fs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public void zmn(JSONObject jSONObject) {
        if (zmn.zmn().zn()) {
            try {
                jSONObject.put("feature_data", this.nps);
                fb();
            } catch (JSONException e) {
                iqz.zn(e.getMessage(), new Object[0]);
            }
        }
    }

    private void fb() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.bvs > 10000) {
            fb.zmn("track_feature_result", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.hhw.fs.1
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                @Nullable
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    fs.this.bvs = elapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("msg", String.valueOf(fs.this.zg));
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("track_feature_result").fs(jSONObject.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(@NonNull String str, @NonNull String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && zmn.zmn().zn()) {
                btk();
                if (zmn.zmn().btk()) {
                    com.bytedance.sdk.openadsdk.olo.zmn zmnVar = this.fs.get(str2);
                    if (zmnVar == null) {
                        zmnVar = new com.bytedance.sdk.openadsdk.olo.zmn(str2);
                    }
                    zmnVar.zmn(str, str3);
                    this.fs.put(str2, zmnVar);
                    return;
                }
                if (this.zn == null) {
                    this.zn = new com.bytedance.sdk.openadsdk.olo.zmn(str2);
                }
                this.zn.zmn(str, str3);
            }
        } catch (OutOfMemoryError e) {
            iqz.zn(e.getMessage(), new Object[0]);
        }
    }

    public void zmn(@NonNull final String str, @NonNull final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !zmn.zmn().zn()) {
            return;
        }
        if ("show".equals(str) || "click".equals(str) || "dislike".equals(str)) {
            zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hhw.fs.2
                @Override // java.lang.Runnable
                public void run() {
                    fs.this.zmn(str, str2, str3);
                }
            });
            return;
        }
        if (zmn.zmn().kgc()) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                return;
            }
        }
        if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
            zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hhw.fs.3
                @Override // java.lang.Runnable
                public void run() {
                    fs.this.zmn(str, str2, str3);
                }
            });
        }
    }

    public void zmn(@NonNull final String str, final nqi nqiVar) {
        if (!TextUtils.isEmpty(str) && zmn.zmn().zn() && nqi.btk(nqiVar)) {
            if (!zmn.zmn().kgc() || nqiVar.sft() == 8 || nqiVar.sft() == 7 || nqiVar.sft() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hhw.fs.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String gn = nqiVar.gn();
                            String wbj = nqiVar.wbj();
                            if (TextUtils.isEmpty(gn)) {
                                return;
                            }
                            fs.this.zmn(str, gn, wbj);
                        }
                    });
                }
            }
        }
    }

    public void zmn(@NonNull final String str, final nqi nqiVar, final String str2) {
        if (TextUtils.isEmpty(str) || !zmn.zmn().zn()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hhw.fs.5
                @Override // java.lang.Runnable
                public void run() {
                    nqi nqiVar2 = nqiVar;
                    if (nqiVar2 == null || TextUtils.isEmpty(nqiVar2.gn())) {
                        return;
                    }
                    fs.this.zmn(str, nqiVar.gn(), nqiVar.wbj() + str2);
                }
            });
        }
    }

    private void btk() {
        if (this.fb) {
            return;
        }
        this.fb = true;
        zmn(this.iv, zmn.zmn().fb());
    }

    public void fs() {
        try {
            if (zmn.zmn().zn()) {
                zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hhw.fs.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zmn.zmn().btk()) {
                            Iterator it = fs.this.fs.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.olo.zmn zmnVar = (com.bytedance.sdk.openadsdk.olo.zmn) fs.this.fs.get((String) it.next());
                                if (zmnVar != null) {
                                    zmnVar.zmn();
                                }
                            }
                            return;
                        }
                        if (fs.this.zn != null) {
                            fs.this.zn.zmn();
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e) {
            iqz.zn(e.getMessage(), new Object[0]);
        }
    }
}
