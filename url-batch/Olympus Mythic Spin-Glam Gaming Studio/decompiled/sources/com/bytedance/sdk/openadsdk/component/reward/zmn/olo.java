package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.cn.fb.zmn;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.phc;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class olo {
    private zmn.InterfaceC0155zmn am;
    private FrameLayout bvs;
    private boolean cn;
    private boolean doe;
    final boolean fb;
    com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn hhw;
    private String iqz;
    private final String iv;
    private long kgc;
    private long klz;
    private long kw;
    private boolean mw;
    private final Activity nps;
    private final fs nqi;
    private long rc;
    private boolean rt;
    private boolean uqh;
    private com.bytedance.sdk.openadsdk.fb.nps yj;
    private final nqi zg;
    boolean zn;
    protected boolean zmn = false;
    boolean fs = false;
    protected boolean btk = false;
    private long cyb = -1;
    private int olo = -1;
    private boolean bjh = false;
    private int rp = 0;
    private float kjb = 1.0f;
    private boolean zak = false;
    private volatile boolean so = false;
    private HashSet<String> phc = new HashSet<>();

    public long zmn() {
        return this.cyb;
    }

    public void zmn(long j) {
        this.cyb = j;
    }

    public long fs() {
        return this.kgc;
    }

    public boolean zn() {
        return this.bjh;
    }

    public boolean fb() {
        int i;
        return this.zak ? this.bjh && this.rp == 1 : this.bjh && ((i = this.rp) == 2 || i == 1);
    }

    public com.bytedance.sdk.openadsdk.fb.nps btk() {
        return this.yj;
    }

    public olo(fs fsVar) {
        this.nqi = fsVar;
        this.nps = fsVar.nu;
        this.zg = fsVar.fs;
        this.fb = fsVar.fb;
        this.iv = fsVar.btk;
    }

    public void zmn(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.fb.nps npsVar) {
        if (this.doe) {
            return;
        }
        this.doe = true;
        this.bvs = frameLayout;
        if (this.zg.el() != null) {
            this.rp = this.zg.el().fs();
            this.kjb = this.zg.el().zmn();
        }
        this.yj = npsVar;
        if (nqi.btk(this.zg)) {
            this.zak = true;
            this.hhw = new com.bytedance.sdk.openadsdk.core.cn.fb.zmn(this.nps, this.bvs, this.zg, npsVar);
            fb(this.uqh);
            zmn.InterfaceC0155zmn interfaceC0155zmn = this.am;
            if (interfaceC0155zmn != null) {
                ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) this.hhw).zmn(interfaceC0155zmn);
            }
            ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) this.hhw).hhw(this.cn);
            return;
        }
        this.zak = false;
        com.bytedance.sdk.openadsdk.component.reward.fb fbVar = new com.bytedance.sdk.openadsdk.component.reward.fb(this.zg, npsVar);
        this.hhw = fbVar;
        zmn.InterfaceC0155zmn interfaceC0155zmn2 = this.am;
        if (interfaceC0155zmn2 != null) {
            fbVar.zmn(interfaceC0155zmn2);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.fb.nps npsVar) {
        this.yj = npsVar;
    }

    public boolean hhw() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        return (znVar == null || znVar.rc() == null || !this.hhw.rc().hhw()) ? false : true;
    }

    public boolean nps() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        return znVar != null && znVar.mw();
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zg() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar == null) {
            return null;
        }
        if (znVar instanceof com.bytedance.sdk.openadsdk.component.reward.fb) {
            return ((com.bytedance.sdk.openadsdk.component.reward.fb) znVar).olo();
        }
        return znVar.klz();
    }

    public boolean bvs() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        return (znVar == null || znVar.rc() == null || !this.hhw.rc().nps()) ? false : true;
    }

    public boolean iv() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        return znVar != null && znVar.rt();
    }

    public void zmn(long j, long j2) {
        this.klz = j;
        if (this.so && (nu() || hhw() || j > 0)) {
            rc();
        }
        fs(j, j2);
    }

    public void rc() {
        this.so = false;
        kjb kjbVar = this.nqi.jy;
        if (kjbVar != null) {
            kjbVar.removeMessages(300);
        }
    }

    private void fs(long j, long j2) {
        int abs = (int) Math.abs(this.olo - j);
        int i = this.olo;
        if (i < 0 || abs > 500 || i > j2 || abs >= 500 || this.phc.contains(this.iqz)) {
            return;
        }
        if (this.olo > j) {
            com.bytedance.sdk.openadsdk.core.cn.zn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.olo.1
                @Override // java.lang.Runnable
                public void run() {
                    olo.this.hgd();
                    olo.this.nqi.uqh.zmn(olo.this.olo, olo.this.iqz);
                }
            }, abs);
        } else {
            hgd();
            this.nqi.uqh.zmn(this.olo, this.iqz);
        }
        this.phc.add(this.iqz);
    }

    public void zmn(int i, String str) {
        this.olo = i;
        this.iqz = str;
    }

    public boolean klz() {
        return this.zmn;
    }

    public long mw() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.hhw();
        }
        return this.rc;
    }

    public long rt() {
        return this.klz;
    }

    public long cn() {
        return this.rc;
    }

    public void fs(long j) {
        this.rc = j;
    }

    public void zmn(boolean z) {
        this.zmn = z;
    }

    public void cyb() {
        try {
            if (hhw()) {
                this.hhw.fs();
            }
        } catch (Throwable th) {
            iqz.zn("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage(), new Object[0]);
        }
    }

    public void zmn(int i, int i2) {
        if (this.hhw != null) {
            cn.zmn zmnVar = new cn.zmn();
            zmnVar.zn(olo());
            zmnVar.fb(rp());
            zmnVar.fs(mw());
            zmnVar.zmn(i);
            zmnVar.fs(i2);
            com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.fb(this.hhw.klz(), zmnVar);
        }
    }

    public long olo() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.nps();
        }
        return 0L;
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.zmn kgc() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.rc();
        }
        return null;
    }

    private void uqd() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar == null || znVar.rc() == null) {
            return;
        }
        this.rc = this.hhw.hhw();
        if (this.hhw.rc().zn() || !this.hhw.rc().fs()) {
            this.hhw.fs();
            this.hhw.fb();
            this.zmn = true;
        }
    }

    public void kw() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar == null) {
            return;
        }
        znVar.fb();
        this.hhw = null;
    }

    public void iqz() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.btk();
        }
    }

    public void phc() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.zn();
        }
    }

    public void fs(boolean z) {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.fs();
            this.rt = z;
        }
    }

    public void doe() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.fs();
        }
    }

    public void zmn(zn.zmn zmnVar) {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.zmn(zmnVar);
        }
    }

    public void zmn(boolean z, String str) {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.zmn(z, str);
        }
    }

    public long nqi() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.bvs();
        }
        return 0L;
    }

    public int uqh() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.iv();
        }
        return 0;
    }

    public int bjh() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.zg();
        }
        return 0;
    }

    public long rp() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.bvs() + this.hhw.nps();
        }
        return 0L;
    }

    public void zmn(String str, boolean z) {
        if (this.hhw != null) {
            long mw = mw();
            if (this.zg.na()) {
                mw = this.nqi.hhw();
            }
            long j = mw;
            JSONObject zmn = oub.zmn(this.zg, this.hhw.nps(), this.hhw.rc());
            try {
                zmn.put("auto_click", z);
                if (!z) {
                    fs fsVar = this.nqi;
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(zmn, fsVar.fb ? fsVar.fs.nkw() : fsVar.fs.ab(), (int) j);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(this.zg, this.iv, str, j, uqh(), zmn, this.yj);
            rp();
            uqh();
        }
        vlj();
    }

    public long kjb() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            return znVar.bvs();
        }
        return 0L;
    }

    public boolean zak() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            if (znVar.rc() != null) {
                com.bykv.vk.openvk.zmn.zmn.zmn.zmn rc = this.hhw.rc();
                if (rc.nps() || rc.zg()) {
                    com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar2 = this.hhw;
                    if (znVar2 instanceof com.bytedance.sdk.openadsdk.core.cn.fb.zmn) {
                        ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) znVar2).hgd();
                    }
                    return true;
                }
            } else if (klz()) {
                zmn(false);
                com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar3 = this.hhw;
                if (znVar3 instanceof com.bytedance.sdk.openadsdk.core.cn.fb.zmn) {
                    ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) znVar3).hgd();
                }
                return true;
            }
        }
        return false;
    }

    public boolean am() {
        return this.hhw != null;
    }

    public boolean yj() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        return znVar != null && znVar.rc() == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zmn(long j, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar) {
        boolean z2;
        boolean z3 = false;
        if (!am()) {
            fs fsVar2 = this.nqi;
            com.bytedance.sdk.openadsdk.fb.iv.zmn(fsVar2.fs, "show_ad_fail", fsVar2.btk, "video_controller_not_ready");
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.iqz.fb(this.nqi.fs) || com.bytedance.sdk.openadsdk.core.model.iqz.zg(this.nqi.fs)) {
            return true;
        }
        if (!z || !yj()) {
            zmn(fsVar);
        }
        try {
            z2 = zmn(j, this.nqi.dgt);
            try {
                this.mw = false;
            } catch (Exception e) {
                e = e;
                z3 = z2;
                Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
                z2 = z3;
                if (!z2) {
                }
                if (!z2) {
                }
                return z2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (!z2 && !z) {
            this.nqi.rp.zmn(map);
        } else if (!z2) {
            fs fsVar3 = this.nqi;
            com.bytedance.sdk.openadsdk.fb.iv.zmn(fsVar3.fs, "show_ad_fail", fsVar3.btk, "video_play_fail");
        }
        return z2;
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar) {
        if (this.nqi.bvs.get()) {
            return;
        }
        fs fsVar2 = this.nqi;
        if (fsVar2.cud && !am.zn(fsVar2.fs)) {
            boolean btk = nqi.btk(this.nqi.fs);
            boolean fb = this.nqi.uqh.fb();
            int rt = com.bytedance.sdk.openadsdk.core.kgc.fb().rt(String.valueOf(this.nqi.hhw));
            if ((!btk && rt == 1 && fb) || com.bytedance.sdk.openadsdk.core.model.iqz.fb(this.nqi.fs) || com.bytedance.sdk.openadsdk.core.model.iqz.zg(this.nqi.fs) || this.btk || !fsVar.btk()) {
                return;
            }
            this.nqi.phc.rc();
            Message obtain = Message.obtain();
            obtain.what = 300;
            this.nqi.jy.sendMessageDelayed(obtain, 5000L);
            this.so = true;
        }
    }

    public boolean so() {
        return this.so;
    }

    public void ev() {
        int i = this.rp;
        if (i == 1 || i == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                zmn(jSONObject);
            } catch (Throwable th) {
                iqz.zmn("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th);
            }
        }
    }

    public boolean zmn(JSONObject jSONObject) {
        int i;
        if (this.hhw == null || jSONObject == null || ((i = this.rp) != 1 && i != 2)) {
            this.bjh = false;
            return false;
        }
        int optInt = jSONObject.optInt("switch", 0);
        float optDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.kjb = optDouble;
        if (optDouble <= 0.0f && this.nqi.fs.el() != null) {
            this.kjb = this.nqi.fs.el().zmn();
        }
        if (optInt == 0) {
            this.kjb = 1.0f;
            if (this.bjh) {
                long currentTimeMillis = this.kgc + (System.currentTimeMillis() - this.kw);
                this.kgc = currentTimeMillis;
                com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
                if (znVar != null) {
                    znVar.zmn(currentTimeMillis);
                }
                com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar = this.nqi.ww;
                if (fsVar != null) {
                    fsVar.fb(false);
                }
            }
        } else if (optInt == 1 && !this.bjh) {
            this.kw = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar2 = this.nqi.ww;
            if (fsVar2 != null) {
                fsVar2.fb(true);
            }
        }
        this.bjh = optInt == 1;
        if (this.rp == 1) {
            return true;
        }
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar2 = this.hhw;
        if (znVar2 == null) {
            return false;
        }
        return znVar2.zmn(this.kjb);
    }

    private boolean zmn(long j, boolean z) {
        if (this.hhw == null || this.zg.mrt() == null) {
            return false;
        }
        String zmn = CacheDirFactory.getICacheDir(this.zg.hqs()).zmn();
        File file = new File(zmn, this.zg.mrt().rt());
        if (file.exists() && file.length() > 0) {
            this.fs = true;
        }
        com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn2 = nqi.zmn(zmn, this.zg);
        zmn2.fs(this.zg.ji());
        zmn2.fs(this.bvs.getWidth());
        zmn2.zn(this.bvs.getHeight());
        zmn2.zn(this.zg.ze());
        zmn2.zmn(j);
        zmn2.zmn(z);
        return this.hhw.zmn(zmn2);
    }

    public void zn(boolean z) {
        this.zn = z;
    }

    public boolean tf() {
        return this.zn;
    }

    public void fkt() {
        this.bjh = false;
        kw();
    }

    public void hgd() {
        try {
            if (hhw()) {
                this.btk = true;
                doe();
            }
        } catch (Exception e) {
            iqz.zn("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        try {
            this.btk = false;
            if (klz()) {
                uqd();
                fs(fsVar);
            } else if (bvs()) {
                phc();
            }
        } catch (Throwable th) {
            iqz.zn("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void zmn(boolean z, com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar, boolean z2) {
        if (this.rt || !(!z2 || z || this.btk)) {
            if (bvs()) {
                phc();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                uqd();
                fs(fsVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.rt = false;
        }
    }

    public boolean nu() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar == null || znVar.rc() == null) {
            return false;
        }
        return this.hhw.rc().zmn();
    }

    protected void fs(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        if (!zak() || fsVar == null) {
            return;
        }
        fsVar.zmn(cn(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double ww() {
        double hhw;
        long fb;
        com.bytedance.sdk.openadsdk.component.reward.klz klzVar;
        phc uqh = this.zg.uqh();
        if (com.bytedance.sdk.openadsdk.core.model.iqz.fb(this.zg) && uqh != null) {
            fb = uqh.fs();
        } else if (com.bytedance.sdk.openadsdk.core.model.iqz.zg(this.zg) && uqh != null) {
            fb = uqh.fb();
        } else {
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = this.zg.mrt();
            hhw = mrt != null ? mrt.hhw() * mrt.doe() : 0.0d;
            klzVar = this.nqi.mpi;
            if (klzVar != null) {
                klzVar.zmn((long) hhw);
            }
            return hhw;
        }
        hhw = fb;
        klzVar = this.nqi.mpi;
        if (klzVar != null) {
        }
        return hhw;
    }

    public void oub() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar instanceof com.bytedance.sdk.openadsdk.core.cn.fb.zmn) {
            ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) znVar).fkt();
        }
    }

    public View jy() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar instanceof com.bytedance.sdk.openadsdk.core.cn.fb.zmn) {
            return (View) ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) znVar).nu();
        }
        return null;
    }

    public void vlj() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar instanceof com.bytedance.sdk.openadsdk.core.cn.fb.zmn) {
            ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) znVar).ww();
        }
    }

    public void yof() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar instanceof com.bytedance.sdk.openadsdk.core.cn.fb.zmn) {
            ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) znVar).oub();
        }
    }

    public void fb(boolean z) {
        this.uqh = z;
        if (this.hhw instanceof com.bytedance.sdk.openadsdk.core.cn.fb.zmn) {
            if (z) {
                ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) this.hhw).fs(this.zg.mrt().doe());
            } else {
                this.zg.mrt().iv(1);
                ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) this.hhw).fs(1);
            }
        }
    }

    public void zmn(zmn.InterfaceC0155zmn interfaceC0155zmn) {
        this.am = interfaceC0155zmn;
    }

    public void dgt() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.zmn();
        }
    }

    public void cud() {
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar == null || znVar.rc() == null) {
            return;
        }
        this.rc = this.hhw.hhw();
        iqz();
        zmn(true);
        this.mw = true;
    }

    public boolean gn() {
        return this.mw;
    }

    public void btk(boolean z) {
        this.cn = z;
        com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn znVar = this.hhw;
        if (znVar instanceof com.bytedance.sdk.openadsdk.core.cn.fb.zmn) {
            ((com.bytedance.sdk.openadsdk.core.cn.fb.zmn) znVar).hhw(z);
        }
    }
}
