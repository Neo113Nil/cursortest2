package com.bytedance.sdk.openadsdk.core.rt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.fs.fs;
import com.bytedance.sdk.openadsdk.core.rt.fs.zmn;
import com.bytedance.sdk.openadsdk.core.rt.fs.zn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class fb {
    private boolean cn;
    private long cyb;
    private String doe;
    private boolean iqz;
    private boolean kgc;
    private boolean kw;
    private nqi olo;
    private String phc;
    private final AtomicBoolean mw = new AtomicBoolean(false);
    private final AtomicBoolean rt = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zmn = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> fs = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zn = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> fb = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> btk = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> hhw = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> nps = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zg = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> bvs = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> iv = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.fs> rc = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zmn> klz = new ArrayList();

    public void zmn(com.bytedance.sdk.openadsdk.core.rt.zmn.zmn zmnVar) {
        if (!zmn(-1L, this.zmn, zmnVar, this.cn ? null : new zn.fs("error", this.olo, 0.0f)) || this.cn) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_error", (JSONObject) null);
    }

    public void zmn(long j) {
        if (this.mw.compareAndSet(false, true)) {
            if (!zmn(j, this.fs, null, new zn.fs(this.cn ? "show_impression" : "impression", this.olo)) || this.cn) {
                return;
            }
            com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_impression", (JSONObject) null);
        }
    }

    public void fs(long j) {
        if (!zmn(j, this.zn, null, this.cn ? null : new zn.fs("pause", this.olo, j)) || this.cn) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_pause", (JSONObject) null);
    }

    public void zn(long j) {
        if (!zmn(j, this.fb, null, this.cn ? null : new zn.fs("resume", this.olo, j)) || this.cn) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_resume", (JSONObject) null);
    }

    public void fb(long j) {
        if (!zmn(j, this.btk, null, new zn.fs(this.cn ? "video_progress" : "complete", this.olo, 1.0f)) || this.cn) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_complete", (JSONObject) null);
    }

    public void btk(long j) {
        if (this.rt.compareAndSet(false, true)) {
            zmn(j, this.hhw, (com.bytedance.sdk.openadsdk.core.rt.zmn.zmn) null);
        }
    }

    public void hhw(long j) {
        if (!zmn(j, this.nps, null, this.cn ? null : new zn.fs("skip", this.olo)) || this.cn) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_skip", (JSONObject) null);
    }

    public void nps(long j) {
        if (!zmn(j, this.zg, null, new zn.fs(this.cn ? "click" : "clickTracking", this.olo)) || this.cn) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_video_click", (JSONObject) null);
    }

    public void zg(long j) {
        if (!zmn(j, this.bvs, null, this.cn ? null : new zn.fs("mute", this.olo, j)) || this.cn) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_mute", (JSONObject) null);
    }

    public void bvs(long j) {
        if (!zmn(j, this.iv, null, this.cn ? null : new zn.fs("unmute", this.olo, j)) || this.cn) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_unmute", (JSONObject) null);
    }

    public void zmn(long j, long j2, hhw hhwVar) {
        zn.fs fsVar;
        if (System.currentTimeMillis() - this.cyb >= 1000 && j >= 0 && j2 > 0) {
            this.cyb = System.currentTimeMillis();
            float f = j / j2;
            List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zmn = zmn(j, f);
            float f2 = 0.25f;
            if (f >= 0.25f && !this.kgc) {
                zmn("firstQuartile");
                this.kgc = true;
                if (hhwVar != null) {
                    zmn(hhwVar, 6);
                }
                if (!this.cn) {
                    fsVar = new zn.fs("firstQuartile", this.olo, 0.25f);
                    f = f2;
                }
                f = f2;
                fsVar = null;
            } else {
                f2 = 0.5f;
                if (f >= 0.5f && !this.kw) {
                    zmn("midpoint");
                    this.kw = true;
                    if (hhwVar != null) {
                        zmn(hhwVar, 7);
                    }
                    if (!this.cn) {
                        fsVar = new zn.fs("midpoint", this.olo, 0.5f);
                        f = f2;
                    }
                    f = f2;
                    fsVar = null;
                } else {
                    f2 = 0.75f;
                    if (f >= 0.75f && !this.iqz) {
                        zmn("thirdQuartile");
                        this.iqz = true;
                        if (hhwVar != null) {
                            zmn(hhwVar, 8);
                        }
                        if (!this.cn) {
                            fsVar = new zn.fs("thirdQuartile", this.olo, 0.75f);
                            f = f2;
                        }
                        f = f2;
                    }
                    fsVar = null;
                }
            }
            if (f < 0.03f) {
                f = 0.0f;
            }
            if (!this.cn && !zmn.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.rt.fs.zn znVar = zmn.get(0);
                if ((znVar instanceof com.bytedance.sdk.openadsdk.core.rt.fs.zmn) && ((com.bytedance.sdk.openadsdk.core.rt.fs.zmn) znVar).zmn() == 0) {
                    com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_start", (JSONObject) null);
                    fsVar = new zn.fs("start", this.olo, f);
                }
            }
            if (zmn.isEmpty()) {
                return;
            }
            zmn(j, zmn, null, fsVar != null ? fsVar : new zn.fs("video_progress", this.olo, f));
        }
    }

    public void zmn(int i, long j, long j2) {
        if (System.currentTimeMillis() - this.cyb < 1000) {
            return;
        }
        this.cyb = System.currentTimeMillis();
        float f = j / j2;
        List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zmn = zmn(j, f);
        zn.fs fsVar = null;
        if (i != 6) {
            if (i == 7) {
                zmn("midpoint");
                this.kw = true;
                f = 0.5f;
                if (!this.cn) {
                    fsVar = new zn.fs("midpoint", this.olo, 0.5f);
                }
            } else if (i == 8) {
                zmn("thirdQuartile");
                this.iqz = true;
                f = 0.75f;
                if (!this.cn) {
                    fsVar = new zn.fs("thirdQuartile", this.olo, 0.75f);
                }
            } else if (i == 15 && (zmn.get(0) instanceof com.bytedance.sdk.openadsdk.core.rt.fs.zmn)) {
                com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_start", (JSONObject) null);
                fsVar = new zn.fs("start", this.olo, f);
            }
        } else if (!this.kgc) {
            zmn("firstQuartile");
            this.kgc = true;
            f = 0.25f;
            if (!this.cn) {
                fsVar = new zn.fs("firstQuartile", this.olo, 0.25f);
            }
        }
        if (zmn.isEmpty()) {
            return;
        }
        zmn(j, zmn, null, fsVar != null ? fsVar : new zn.fs("video_progress", this.olo, f));
    }

    private void zmn(final hhw hhwVar, final int i) {
        com.bytedance.sdk.component.utils.bvs.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rt.fb.1
            @Override // java.lang.Runnable
            public void run() {
                hhw hhwVar2 = hhwVar;
                if (hhwVar2 != null) {
                    hhwVar2.zmn(i);
                }
            }
        });
    }

    private void zmn(String str) {
        try {
            if (this.cn) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", str);
                com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_first_quartile", (JSONObject) null);
            } else if ("midpoint".equals(str)) {
                com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.fb.zn.fs(this.olo, this.phc, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean zmn(long j, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list, com.bytedance.sdk.openadsdk.core.rt.zmn.zmn zmnVar, zn.fs fsVar) {
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt;
        nqi nqiVar = this.olo;
        String str = null;
        if (nqiVar != null && (mrt = nqiVar.mrt()) != null) {
            str = mrt.rc();
        }
        return com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(this.olo, list, zmnVar, j, str, fsVar, zmn());
    }

    private String zmn() {
        if (this.doe == null) {
            this.doe = UUID.randomUUID().toString();
        }
        return this.doe;
    }

    private boolean zmn(long j, List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list, com.bytedance.sdk.openadsdk.core.rt.zmn.zmn zmnVar) {
        return zmn(j, list, zmnVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> zmn(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.rc.size(); i++) {
            com.bytedance.sdk.openadsdk.core.rt.fs.fs fsVar = this.rc.get(i);
            if (fsVar.zmn(f)) {
                arrayList.add(fsVar);
            }
        }
        for (int i2 = 0; i2 < this.klz.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.rt.fs.zmn zmnVar = this.klz.get(i2);
            if (zmnVar.zmn(j)) {
                arrayList.add(zmnVar);
            }
        }
        return arrayList;
    }

    public void zmn(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.fs.addAll(list);
    }

    public void fs(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.zn.addAll(list);
    }

    public void zn(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.fb.addAll(list);
    }

    public void fb(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.btk.addAll(list);
    }

    public void btk(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.hhw.addAll(list);
    }

    public void hhw(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.nps.addAll(list);
    }

    public void nps(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.zg.addAll(list);
    }

    public void zg(List<com.bytedance.sdk.openadsdk.core.rt.fs.fs> list) {
        this.rc.addAll(list);
        Collections.sort(this.rc);
    }

    public void bvs(List<com.bytedance.sdk.openadsdk.core.rt.fs.zmn> list) {
        this.klz.addAll(list);
        Collections.sort(this.klz);
    }

    public void iv(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.zmn.addAll(list);
    }

    public void rc(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.bvs.addAll(list);
    }

    public void klz(List<com.bytedance.sdk.openadsdk.core.rt.fs.zn> list) {
        this.iv.addAll(list);
    }

    public void zmn(JSONObject jSONObject) {
        iv(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("errorTrackers")));
        zmn(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("impressionTrackers")));
        fs(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("pauseTrackers"), true));
        zn(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("resumeTrackers"), true));
        fb(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("completeTrackers")));
        btk(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("closeTrackers")));
        hhw(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("skipTrackers")));
        nps(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("clickTrackers")));
        rc(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("muteTrackers"), true));
        klz(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zmn(jSONObject.optJSONArray("unMuteTrackers"), true));
        zg(com.bytedance.sdk.openadsdk.core.rt.fs.zn.fs(jSONObject.optJSONArray("fractionalTrackers")));
        bvs(com.bytedance.sdk.openadsdk.core.rt.fs.zn.zn(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void zmn(nqi nqiVar) {
        this.olo = nqiVar;
        this.phc = nqiVar.btk();
        this.cn = nqiVar.ch();
    }

    public void zmn(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        bvs(Collections.singletonList(new zmn.C0180zmn(str, j).zmn()));
    }

    public void zmn(String str, float f) {
        if (TextUtils.isEmpty(str) || f < 0.0f) {
            return;
        }
        zg(Collections.singletonList(new fs.zmn(str, f).zmn()));
    }

    public void zmn(fb fbVar) {
        iv(fbVar.zmn);
        zmn(fbVar.fs);
        fs(fbVar.zn);
        zn(fbVar.fb);
        fb(fbVar.btk);
        btk(fbVar.hhw);
        hhw(fbVar.nps);
        nps(fbVar.zg);
        rc(fbVar.bvs);
        klz(fbVar.iv);
        zg(fbVar.rc);
        bvs(fbVar.klz);
    }
}
