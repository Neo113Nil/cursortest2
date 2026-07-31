package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.bvs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class fs {
    public com.bytedance.sdk.openadsdk.mw.iv am;
    public boolean ax;
    public final klz bjh;
    private long bmc;
    public final String btk;
    public final AtomicBoolean bvs;
    public int bxw;
    public int cd;
    public final AtomicBoolean cn;
    public boolean cud;
    public final AtomicBoolean cyb;
    public boolean dgt;
    public final btk doe;
    public final boolean es;

    @NonNull
    public final mw ev;
    public final boolean fb;
    public final com.bytedance.sdk.openadsdk.component.reward.view.rc fkt;
    public nqi fs;
    public int gn;
    public final com.bytedance.sdk.openadsdk.component.reward.view.zg hgd;
    public final int hhw;
    private int hsp;
    public com.bytedance.sdk.openadsdk.utils.rt hwg;

    /* renamed from: io, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.fs.fs f3739io;
    public final AtomicBoolean iqz;
    public final AtomicBoolean iv;
    public final kjb jy;
    public final AtomicBoolean kgc;
    public final nps kjb;
    public final AtomicBoolean klz;
    public int kra;
    public final AtomicBoolean kw;
    public boolean lbc;
    public boolean lt;
    public int mhu;
    public com.bytedance.sdk.openadsdk.component.reward.klz mpi;
    public final AtomicBoolean mw;
    public float na;
    public boolean nkt;
    public boolean nlz;
    public int nps;
    public final bvs nqi;

    @NonNull
    public final Activity nu;
    public boolean obg;
    public com.bytedance.sdk.openadsdk.component.reward.top.zn oep;
    public final AtomicBoolean olo;
    public final Context oub;

    @NonNull
    public final olo phc;
    public final AtomicBoolean rc;
    public boolean rje;
    public final rc rp;
    public final AtomicBoolean rt;
    public boolean skn;
    public final rt so;

    @Nullable
    public com.bytedance.sdk.openadsdk.activity.single.zg tdm;
    public boolean tet;
    public final hhw tf;
    public boolean uqd;
    public final com.bytedance.sdk.openadsdk.component.reward.view.bvs uqh;
    private String utx;
    private int uw;
    public boolean ve;
    public final boolean vlj;
    private long wq;
    public final com.bytedance.sdk.openadsdk.core.cn.fb.fs ww;
    public long xrr;
    public final kgc yj;
    public boolean yo;
    public String yof;
    public final fb zak;
    public int zg;
    public boolean zi;
    public final int zmn;
    public final boolean zn;

    public int zmn() {
        return this.uw;
    }

    public void zmn(int i, String str, int i2) {
        this.hsp = i;
        this.utx = str;
        this.uw = i2;
    }

    public int fs() {
        return this.hsp;
    }

    public boolean zn() {
        return this.uw != 0;
    }

    public fs(@NonNull Activity activity, kjb kjbVar, @NonNull nqi nqiVar, com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar, int i, boolean z) {
        this(activity, kjbVar, nqiVar, fsVar, i, z, null);
    }

    public fs(@NonNull Activity activity, kjb kjbVar, @NonNull nqi nqiVar, com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar, int i, boolean z, @Nullable fs fsVar2) {
        com.bytedance.sdk.openadsdk.component.reward.view.rc rcVar;
        this.nps = 0;
        this.zg = 0;
        this.bvs = new AtomicBoolean(false);
        this.iv = new AtomicBoolean(false);
        this.rc = new AtomicBoolean(false);
        this.klz = new AtomicBoolean(false);
        this.mw = new AtomicBoolean(false);
        this.rt = new AtomicBoolean(false);
        this.cn = new AtomicBoolean(false);
        this.cyb = new AtomicBoolean(false);
        this.olo = new AtomicBoolean(false);
        this.kgc = new AtomicBoolean(false);
        this.kw = new AtomicBoolean(false);
        this.iqz = new AtomicBoolean(false);
        this.cud = false;
        this.kra = 1;
        this.xrr = 0L;
        this.tdm = null;
        this.skn = true;
        this.obg = false;
        this.nlz = false;
        this.hsp = -1;
        this.utx = "";
        this.uw = 0;
        this.nu = activity;
        this.ww = fsVar;
        Context zmn = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        this.oub = zmn;
        this.fs = nqiVar;
        this.zmn = i;
        this.ax = fsVar2 != null;
        this.lbc = i == 0 || i == 1;
        this.vlj = i == 0 || i == 2;
        this.jy = kjbVar;
        this.es = z;
        boolean z2 = nqiVar.utx().getDurationSlotType() == 7;
        this.fb = z2;
        String str = z2 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.btk = str;
        this.lt = nqiVar.hhw();
        int qvo = nqiVar.qvo();
        this.hhw = qvo;
        this.dgt = com.bytedance.sdk.openadsdk.core.kgc.fb().kgc(String.valueOf(qvo));
        this.zn = com.bytedance.sdk.openadsdk.core.settings.rc.fs().cn(String.valueOf(qvo));
        this.bjh = new klz(this);
        if (i == 2) {
            rcVar = new com.bytedance.sdk.openadsdk.component.reward.view.klz(this);
        } else {
            rcVar = nqiVar.hhw() ? new com.bytedance.sdk.openadsdk.component.reward.view.rc(this) : new com.bytedance.sdk.openadsdk.component.reward.view.iv(this);
        }
        this.fkt = rcVar;
        this.hgd = new com.bytedance.sdk.openadsdk.component.reward.view.zg(this);
        this.phc = new olo(this);
        this.doe = new btk(nqiVar, str, zmn, activity);
        this.nqi = new bvs(this, nqiVar);
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = fsVar2 != null ? fsVar2.uqh : new com.bytedance.sdk.openadsdk.component.reward.view.bvs(this);
        this.uqh = bvsVar;
        bvsVar.zmn(this);
        this.yj = new kgc(this);
        this.so = new rt(this);
        this.ev = new mw(this);
        this.tf = new hhw(this);
        this.rp = new rc(this);
        nps npsVar = fsVar2 != null ? fsVar2.kjb : new nps(this);
        this.kjb = npsVar;
        npsVar.zmn(this);
        this.zak = new fb(this);
        this.am = new com.bytedance.sdk.openadsdk.mw.iv(zmn);
        iv();
    }

    public void zmn(boolean z) {
        this.yo = z;
        this.ev.fb(z);
    }

    public void fb() {
        this.wq = SystemClock.elapsedRealtime();
    }

    public void btk() {
        if (this.wq <= 0) {
            this.wq = SystemClock.elapsedRealtime();
        }
        this.bmc += SystemClock.elapsedRealtime() - this.wq;
    }

    public long hhw() {
        return this.bmc + (SystemClock.elapsedRealtime() - this.wq);
    }

    public boolean nps() {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        return !this.rje || (zgVar = this.tdm) == null || !(zgVar instanceof com.bytedance.sdk.openadsdk.activity.single.btk) || ((com.bytedance.sdk.openadsdk.activity.single.btk) zgVar).zmn;
    }

    public com.bytedance.sdk.openadsdk.fb.nps zg() {
        if (this.fs.hhw()) {
            com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.uqh;
            if (bvsVar != null && bvsVar.zmn() != null) {
                return this.uqh.zmn().getAdShowTime();
            }
            com.bytedance.sdk.openadsdk.fb.nps npsVar = new com.bytedance.sdk.openadsdk.fb.nps();
            npsVar.zmn(System.currentTimeMillis(), 1.0f);
            return npsVar;
        }
        com.bytedance.sdk.openadsdk.fb.nps npsVar2 = new com.bytedance.sdk.openadsdk.fb.nps();
        npsVar2.zmn(System.currentTimeMillis(), 1.0f);
        return npsVar2;
    }

    public Map<String, Object> bvs() {
        nqi nqiVar;
        HashMap hashMap = new HashMap();
        if (this.uqh != null && (nqiVar = this.fs) != null && nqiVar.nkt() == 2) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.uqh.rc()));
            JSONObject zmn = this.uqh.zmn((JSONObject) null);
            if (zmn != null) {
                Iterator<String> keys = zmn.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        hashMap.put(next, zmn.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return hashMap;
    }

    private void iv() {
        com.bytedance.sdk.openadsdk.utils.rt zmn = com.bytedance.sdk.openadsdk.utils.bvs.zmn(this.nu, new bvs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.fs.1
            @Override // com.bytedance.sdk.openadsdk.utils.bvs.zmn
            public View zmn() {
                com.bytedance.sdk.openadsdk.component.reward.view.rc rcVar = fs.this.fkt;
                if (rcVar != null) {
                    return rcVar.rc();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bvs.zmn
            public void fs() {
                mw mwVar = fs.this.ev;
                if (mwVar != null) {
                    mwVar.btk();
                }
            }
        });
        this.hwg = zmn;
        zmn.zmn(new com.bytedance.sdk.openadsdk.utils.cn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.fs.2
            @Override // com.bytedance.sdk.openadsdk.utils.cn
            public void zmn() {
                com.bytedance.sdk.openadsdk.component.fb.fs.zmn("force_button_tracker", "show", fs.this.fs);
            }
        });
    }
}
