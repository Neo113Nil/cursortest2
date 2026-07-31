package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.component.reward.klz;
import com.bytedance.sdk.openadsdk.component.reward.olo;
import com.bytedance.sdk.openadsdk.component.reward.zmn.klz;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.uqh;
import com.bytedance.sdk.openadsdk.mw.iv;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class fs {
    private static com.bytedance.sdk.openadsdk.zmn.btk.zmn fs;
    private static com.bytedance.sdk.openadsdk.zmn.zn.fs zn;
    private final boolean bvs;
    private Bundle cn;
    private Runnable cyb;
    private final nqi fb;
    private final iv hhw;
    private final boolean iqz;
    private final boolean iv;
    private boolean kgc;
    private final boolean klz;
    private boolean kw;
    private Activity mw;
    private com.bytedance.sdk.openadsdk.zmn.btk.zmn nps;
    private com.bytedance.sdk.openadsdk.activity.single.zn rc;
    private int rt;
    private com.bytedance.sdk.openadsdk.zmn.zn.fs zg;
    public klz zmn;
    private final Bundle btk = new Bundle();
    private final klz.fs olo = new klz.fs();
    private final boolean phc = com.bytedance.sdk.openadsdk.uqh.btk.rc();

    public nqi zmn() {
        return this.fb;
    }

    public boolean fs() {
        return this.iqz;
    }

    public boolean zn() {
        return this.phc;
    }

    public fs(Activity activity, nqi nqiVar, boolean z) {
        this.fb = nqiVar;
        this.kw = z;
        this.mw = activity;
        this.hhw = new iv(activity.getApplicationContext());
        boolean dgt = nqiVar.dgt();
        this.bvs = dgt;
        this.iv = dgt && 39 == nqiVar.cd();
        this.klz = dgt && 40 == nqiVar.cd();
        int cd = nqiVar.cd();
        if (cd == 43 || cd == 44) {
            this.rc = new com.bytedance.sdk.openadsdk.activity.single.fb(this.mw, nqiVar, this);
        } else {
            this.rc = new bvs(this.mw, nqiVar, this);
        }
        this.iqz = com.bytedance.sdk.openadsdk.uqh.btk.zmn("adapt_decor_size", 0) == 1;
        this.rc.zmn();
        tf();
    }

    public boolean fb() {
        return this.klz;
    }

    private void tf() {
        if (this.fb.bv()) {
            this.zmn = new com.bytedance.sdk.openadsdk.component.reward.klz(new klz.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.fs.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.klz.zmn
                public void zmn(int i, boolean z) {
                    zg rc;
                    if (fs.this.klz().getBoolean("reward_verify", false) || fs.this.olo()) {
                        return;
                    }
                    if ((z || !fs.this.mw()) && (rc = fs.this.rc()) != null) {
                        rc.zn(i);
                    }
                }
            });
        }
    }

    public boolean btk() {
        if (this.fb != null && this.bvs) {
            return this.iv || this.klz;
        }
        return false;
    }

    public boolean zmn(nqi nqiVar) {
        return (nqiVar == null || iqz.rt(nqiVar) || nqiVar.nlo() || nqiVar.xcf() == null || nqiVar.xcf().fb() <= 0) ? false : true;
    }

    public boolean hhw() {
        return this.bvs;
    }

    public void zmn(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar, com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar) {
        this.cn = bundle;
        this.rt = 1;
        this.nps = zmnVar;
        this.zg = fsVar;
        if (!this.kw && bundle != null) {
            if (zmnVar == null) {
                this.nps = fs;
                fs = null;
            }
            if (fsVar == null) {
                this.zg = zn;
                zn = null;
            }
        }
        this.rc.zmn(bundle);
    }

    public void zmn(TTAdActivity tTAdActivity) {
        this.rt = 2;
        this.rc.hhw();
    }

    public void fs(TTAdActivity tTAdActivity) {
        this.rt = 3;
        this.rc.fs();
        com.bytedance.sdk.openadsdk.component.reward.klz klzVar = this.zmn;
        if (klzVar != null) {
            klzVar.fs();
        }
        this.olo.zmn(tTAdActivity, this.fb.ol(), this.fb.fu(), this.iqz);
    }

    public void zmn(boolean z) {
        this.rc.zmn(z);
    }

    public void zn(TTAdActivity tTAdActivity) {
        this.rt = 4;
        this.rc.zn();
        com.bytedance.sdk.openadsdk.component.reward.klz klzVar = this.zmn;
        if (klzVar != null) {
            klzVar.zmn();
        }
    }

    public void fb(TTAdActivity tTAdActivity) {
        this.rt = 5;
        this.rc.nps();
    }

    public void zmn(TTAdActivity tTAdActivity, Bundle bundle, int i) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(this.fb, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i);
        if (this.kw) {
            return;
        }
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.nps;
        if (zmnVar != null) {
            fs = zmnVar;
            return;
        }
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.zg;
        if (fsVar != null) {
            zn = fsVar;
        }
    }

    public void btk(TTAdActivity tTAdActivity) {
        this.rt = 6;
        this.rc.zmn(tTAdActivity);
        this.olo.zmn(tTAdActivity);
        this.mw = null;
    }

    public void zmn(zg zgVar, btk btkVar) {
        this.rc.zmn(zgVar, null, btkVar);
    }

    public void nps() {
        Activity activity = this.mw;
        if (activity != null) {
            activity.finish();
        }
    }

    public Activity zg() {
        com.bytedance.sdk.openadsdk.activity.single.zn znVar = this.rc;
        if (znVar == null) {
            return this.mw;
        }
        return znVar.zmn;
    }

    public void zmn(Activity activity) {
        this.rc.fs(activity);
    }

    public void bvs() {
        this.rc.bvs();
    }

    public int iv() {
        return this.rc.iv();
    }

    public zg rc() {
        return this.rc.rc();
    }

    public Bundle klz() {
        return this.btk;
    }

    public void fs(boolean z) {
        try {
            nqi nqiVar = this.fb;
            if (nqiVar != null) {
                nqiVar.zn(z);
            }
            com.bytedance.sdk.openadsdk.component.reward.klz.zmn(this.fb, false, 3);
        } catch (Throwable unused) {
        }
    }

    public boolean mw() {
        return this.fb.cyb();
    }

    public void rt() {
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.nps;
        if (zmnVar != null) {
            zmnVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.zg;
        if (fsVar != null) {
            fsVar.onAdClicked();
        }
    }

    public void cn() {
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.nps;
        if (zmnVar != null) {
            zmnVar.fs();
            return;
        }
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.zg;
        if (fsVar != null) {
            fsVar.fs();
        } else {
            zg rc = rc();
            com.bytedance.sdk.openadsdk.fb.iv.zmn(this.fb, "close", rc != null ? rc.oub() : 0);
        }
    }

    public void cyb() {
        if (kw()) {
            return;
        }
        phc();
        Objects.toString(this.nps);
        Objects.toString(this.zg);
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.nps;
        if (zmnVar != null) {
            zmnVar.zmn();
        } else {
            com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.zg;
            if (fsVar != null) {
                fsVar.zmn();
            } else {
                zg rc = rc();
                com.bytedance.sdk.openadsdk.fb.iv.zmn(this.fb, "show", rc != null ? rc.oub() : 0);
            }
        }
        Runnable runnable = this.cyb;
        if (runnable != null) {
            runnable.run();
            this.cyb = null;
        }
    }

    public boolean olo() {
        nqi nqiVar = this.fb;
        return nqiVar != null && nqiVar.jy();
    }

    public void kgc() {
        nqi nqiVar = this.fb;
        if (nqiVar != null) {
            nqiVar.bvs(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.klz klzVar = this.zmn;
        if (klzVar != null) {
            klzVar.zn();
        }
    }

    public void zmn(final zg zgVar, final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        Activity activity;
        if (!kw()) {
            this.cyb = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fs.2
                @Override // java.lang.Runnable
                public void run() {
                    fs.this.zmn(zgVar, z, i, str, i2, str2, i3);
                }
            };
            return;
        }
        if (olo()) {
            return;
        }
        kgc();
        if (this.nps != null && (activity = this.mw) != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fs.3
                @Override // java.lang.Runnable
                public void run() {
                    fs.this.nps.zmn(z, i, str, i2, str2);
                }
            });
            com.bytedance.sdk.openadsdk.component.reward.klz.zmn(this.fb, z, i3);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.klz.zmn(this.fb, false, i3);
        }
    }

    public boolean kw() {
        return this.fb.oub();
    }

    public boolean iqz() {
        return this.rc.fb();
    }

    public void phc() {
        this.fb.zg(true);
        this.rc.cyb();
    }

    public void zmn(com.bytedance.sdk.openadsdk.activity.single.zmn zmnVar, boolean z) {
        this.rc.zmn(zmnVar, z);
    }

    public void zmn(zg zgVar) {
        com.bytedance.sdk.openadsdk.activity.single.zn znVar = this.rc;
        if (znVar == null) {
            return;
        }
        znVar.zmn(zgVar);
    }

    public void zmn(zg zgVar, boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.zn znVar = this.rc;
        if (znVar == null) {
            return;
        }
        znVar.zmn(zgVar, z);
    }

    public iv doe() {
        return this.hhw;
    }

    public void zmn(View view) {
        this.rc.zmn(view);
    }

    public boolean nqi() {
        return this.rc.btk();
    }

    public void zmn(View view, boolean z) {
        this.rc.zmn(view, z);
    }

    public boolean zmn(zg zgVar, int i) {
        return this.rc.zmn(zgVar, i);
    }

    public void fs(zg zgVar) {
        zgVar.zmn(this.mw, this.cn);
        int i = this.rt;
        if (i == 2) {
            zgVar.mw();
            return;
        }
        if (i == 3) {
            zgVar.mw();
            zgVar.zn();
            zgVar.zn(true);
        } else if (i == 4) {
            zgVar.zn(false);
            zgVar.rt();
        } else {
            if (i != 5) {
                return;
            }
            zgVar.fb();
        }
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.zn uqh() {
        return this.rc.klz();
    }

    public zg bjh() {
        return this.rc.mw();
    }

    public void zmn(float f) {
        this.rc.zmn(f);
    }

    public void fs(zg zgVar, btk btkVar) {
        this.rc.zmn(zgVar, btkVar);
    }

    public boolean rp() {
        return this.rc instanceof com.bytedance.sdk.openadsdk.activity.single.fb;
    }

    public void zn(boolean z) {
        this.kgc = z;
    }

    public boolean kjb() {
        return this.kgc;
    }

    public List<nqi> zak() {
        return this.rc.cn();
    }

    public void zmn(Map<String, Object> map, zg zgVar, float f, float f2) {
        this.rc.zmn(map, zgVar, f, f2);
    }

    public void am() {
        this.rc.olo();
    }

    public void yj() {
        this.rc.kgc();
    }

    public void so() {
        this.rc.kw();
    }

    public static class btk {
        public boolean btk;
        public boolean fb;
        public final int fs;
        public final Bundle zmn = new Bundle();
        public final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zn;

        public btk(int i, com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
            this.fs = i;
            this.zn = fsVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.fs$fs, reason: collision with other inner class name */
    static abstract class AbstractC0143fs implements Handler.Callback {
        private boolean am;
        private int bjh;
        protected int btk;
        private boolean cn;
        private boolean cud;
        private boolean cyb;
        private boolean dgt;
        private int doe;
        private int ev;
        protected int fb;
        private int fkt;
        protected nqi fs;
        private boolean hgd;
        protected int hhw;
        private int iqz;
        private int jy;
        private float kgc;
        private boolean kjb;
        private final Context klz;
        private int nqi;
        private boolean nu;
        private boolean olo;
        private int oub;
        private int phc;
        private final com.bytedance.sdk.openadsdk.component.reward.top.zn rc;
        private boolean rp;
        private boolean rt;
        private int tf;
        private int uqh;
        private int vlj;
        private boolean ww;
        private int yj;
        private boolean yof;
        private int zak;
        protected final fs zmn;
        protected float zn;
        private final Handler iv = new Handler(Looper.getMainLooper(), this);
        private final int mw = 1000;
        protected int nps = -1;
        private int kw = 1000;
        private boolean so = false;
        boolean zg = false;
        public int bvs = -1;

        protected abstract int zmn(nqi nqiVar);

        public int zmn() {
            return this.fb;
        }

        public void zmn(boolean z) {
            this.rp = z;
            this.tf = 0;
            if (z) {
                int i = this.nqi;
                int i2 = this.phc;
                this.iqz = i - i2;
                this.bjh = i2;
                this.uqh = i;
            }
        }

        public void fs() {
            this.cud = false;
            this.yof = false;
            this.zg = false;
            this.yj = 0;
            this.bvs = -1;
            this.dgt = false;
            this.jy = 0;
            this.tf = 0;
            this.ev = 0;
            this.rp = false;
            this.vlj = 0;
            this.so = false;
            com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.rc;
            if (znVar != null) {
                znVar.setShowPlayableNextAd(false, this.fs);
            }
        }

        public AbstractC0143fs(fs fsVar, nqi nqiVar, com.bytedance.sdk.openadsdk.component.reward.top.zn znVar) {
            this.zmn = fsVar;
            this.fs = nqiVar;
            this.rc = znVar;
            this.klz = znVar.getContext();
            this.fb = zmn(nqiVar);
        }

        public void zmn(int i) {
            int i2 = this.hhw;
            if (i != -1) {
                this.bvs = i;
            }
            this.iv.removeMessages(i2);
        }

        public void fs(int i) {
            if (this.bvs != 2 || i == 1) {
                if (i != -1) {
                    this.bvs = i;
                }
                if (this.iv.hasMessages(this.hhw) || this.so) {
                    return;
                }
                fs fsVar = this.zmn;
                if (fsVar == null || fsVar.rc() == null || this.zmn.rc().uqh() == null || !this.zmn.rc().uqh().iv.get()) {
                    int i2 = this.fb;
                    boolean z = this.cn;
                    int i3 = this.hhw;
                    if (i3 == 1 || i3 == 2) {
                        if (i2 < 0 || z || this.cyb) {
                            return;
                        }
                        this.iv.sendEmptyMessageDelayed(i3, this.kw);
                        return;
                    }
                    if (i3 == 3) {
                        fb(3);
                    } else if (i3 == 4) {
                        btk(4);
                    } else if (i3 == 5) {
                        zmn(5, true);
                    }
                }
            }
        }

        public void fs(boolean z) {
            if (z) {
                this.kw = (int) (1000.0f / this.kgc);
            } else {
                this.kw = 1000;
            }
        }

        public void zn() {
            this.iv.removeMessages(this.hhw);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                zmn(message);
            } else if (i == 2) {
                zmn(message);
            } else if (i == 3) {
                if (this.nps > 0) {
                    iv();
                    if (this.nps >= 0) {
                        zmn(message.what, 1000);
                    }
                }
            } else if (i == 4) {
                if (this.cud) {
                    btk();
                    if (this.cud && !this.am) {
                        zmn(message.what, 1000);
                    }
                }
            } else if (i == 5 && this.yof) {
                nps();
                if (this.yof && !this.am) {
                    zmn(message.what, 1000);
                }
            }
            return true;
        }

        private void zmn(@NonNull Message message) {
            if (this.fb > 0) {
                int i = (int) (((r1 - r0) * 100.0d) / this.btk);
                com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.rc;
                StringBuilder sb = new StringBuilder();
                int i2 = this.fb;
                this.fb = i2 - 1;
                sb.append(i2);
                sb.append("s");
                znVar.setCountDownFor1InN(sb.toString(), i);
                iv();
                btk();
                if (this.fb >= 0) {
                    zmn(message.what, this.kw);
                }
                nps();
                return;
            }
            fb(3);
            btk(4);
            zmn(5, true);
            rc();
        }

        private void zmn(int i, int i2) {
            if (this.so) {
                return;
            }
            this.iv.removeMessages(i);
            this.iv.sendEmptyMessageDelayed(i, i2);
        }

        private void iv() {
            int i = this.nps;
            if (i > 0) {
                this.nps = i - 1;
            }
            if (this.nps == 0 && this.olo) {
                this.olo = false;
                fs fsVar = this.zmn;
                if (fsVar == null || fsVar.rc() == null) {
                    return;
                }
                zg rc = this.zmn.rc();
                if (rc instanceof com.bytedance.sdk.openadsdk.activity.single.btk) {
                    ((com.bytedance.sdk.openadsdk.activity.single.btk) rc).phc();
                }
            }
        }

        private void fb(int i) {
            if (this.nps > 0 && this.olo && i == 3) {
                this.hhw = i;
                zmn(i, 1000);
            }
        }

        private void btk(int i) {
            if (this.cud && i == 4) {
                this.hhw = i;
                zmn(i, 1000);
            }
        }

        private void zmn(int i, boolean z) {
            if (this.yof && i == 5) {
                this.hhw = i;
                if (z) {
                    zmn(i, 1000);
                } else {
                    this.iv.sendEmptyMessage(i);
                }
            }
        }

        private void rc() {
            if (this.zmn.iqz()) {
                this.rc.showSkipButton();
                this.cn = true;
            } else {
                this.cyb = true;
                this.rc.showCloseButton();
            }
            this.rc.setShowPlayableNextAd(false, this.fs);
        }

        public void zn(int i) {
            this.nps = i;
            if (i > 0) {
                this.olo = true;
                if (this.fb <= 0 || this.cn) {
                    fb(3);
                }
            }
        }

        public void fb() {
            if (this.cn || this.cyb) {
                return;
            }
            zmn(-1);
            this.so = true;
            com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.rc;
            if (znVar != null) {
                znVar.setCountDownFor1InN("", -1);
                this.rc.setShowEndCardNextAd(true, this.fs);
            }
        }

        public void btk() {
            if (this.kjb && this.cud) {
                if (this.cyb) {
                    this.cud = false;
                }
                if (this.am) {
                    return;
                }
                int i = this.zak;
                boolean z = this.rp;
                int i2 = i + 1;
                this.zak = i2;
                if (z) {
                    this.uqh = this.nqi;
                } else {
                    this.uqh = this.iqz + this.phc;
                }
                if (i2 >= this.iqz) {
                    if (!this.zg) {
                        this.yj++;
                        this.zg = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.fb);
                            jSONObject.put("hint_sequence", this.yj);
                            com.bytedance.sdk.openadsdk.fb.zn.fb(this.fs, this.zmn.rc().d_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.single.zn znVar = this.zmn.rc;
                    int i3 = this.bjh;
                    this.bjh = i3 - 1;
                    znVar.zmn(i3, this.fb);
                } else {
                    this.zg = false;
                    this.zmn.rc.zmn(-1, this.fb);
                }
                if (this.rp && this.zak >= this.doe) {
                    boolean z2 = this.cn;
                    boolean z3 = this.cyb;
                    if (!z2 && !z3) {
                        this.rc.setShowPlayableNextAd(true, this.fs);
                    }
                }
                if (this.zak < this.uqh || this.zmn.rc() == null) {
                    return;
                }
                zg rc = this.zmn.rc();
                if (rc instanceof com.bytedance.sdk.openadsdk.activity.single.btk) {
                    this.iv.removeMessages(4);
                    ((com.bytedance.sdk.openadsdk.activity.single.btk) rc).phc();
                }
            }
        }

        public void zmn(nqi nqiVar, boolean z) {
            this.iqz = am.phc(nqiVar);
            this.phc = am.bjh(nqiVar);
            this.doe = am.rp(nqiVar);
            this.nqi = am.kjb(nqiVar);
            this.bjh = this.phc;
            this.kjb = false;
            this.rp = false;
            this.zak = 0;
            this.cud = true;
            com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.rc;
            if (znVar != null) {
                znVar.setShowPlayableNextAd(false, nqiVar);
            }
            this.am = z;
            if (this.fb <= 0 || this.cn) {
                btk(4);
            }
        }

        public void hhw() {
            this.kjb = true;
        }

        public void zmn(int i, nqi nqiVar) {
            if (nqiVar != null && nqiVar.el() != null) {
                this.kgc = nqiVar.el().zmn();
                this.fs = nqiVar;
            }
            int i2 = this.fb;
            boolean z = this.cn;
            boolean z2 = this.cyb;
            int i3 = this.hhw;
            if (z || z2) {
                return;
            }
            float f = i;
            this.zn = f;
            if (f <= i2) {
                this.hhw = 2;
                this.fb = (int) f;
            } else if (i3 == 0) {
                this.hhw = 1;
            }
            if (!this.rt) {
                this.btk = this.fb;
                this.rt = true;
            }
            int i4 = this.hhw;
            if (i3 == i4 && this.iv.hasMessages(i4)) {
                return;
            }
            this.iv.removeCallbacksAndMessages(null);
            this.iv.sendEmptyMessage(this.hhw);
        }

        public void zmn(zg zgVar) {
            nqi nqiVar;
            uqh zmn;
            if (zgVar == null || (nqiVar = zgVar.hhw) == null || (zmn = nqiVar.zmn()) == null) {
                return;
            }
            this.fkt = zmn.zn();
            this.am = zgVar.olo;
            this.jy = zmn.zmn();
            this.ww = zgVar.cyb;
            this.oub = zmn.fs();
            this.hgd = iqz.nps(zgVar.hhw);
            this.nu = iqz.hhw(zgVar.hhw);
            this.yof = true;
            if ((this.fb <= 0 || this.cn) && !this.iv.hasMessages(5)) {
                zmn(5, false);
            }
        }

        public void nps() {
            if (this.kjb && this.yof && !this.am) {
                int i = this.ev;
                int i2 = this.tf;
                boolean z = this.rp;
                int i3 = i + 1;
                this.ev = i3;
                this.tf = i2 + 1;
                if (z && i3 >= this.fkt) {
                    klz();
                }
                if (this.nu || this.hgd) {
                    mw();
                }
            }
        }

        private void klz() {
            com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
            if (this.am || this.cn || this.cyb || (znVar = this.rc) == null) {
                return;
            }
            znVar.setShowEndCardNextAd(true, this.fs);
        }

        private void mw() {
            int i = this.tf;
            int i2 = this.oub;
            boolean z = this.dgt;
            int i3 = this.vlj;
            int i4 = this.jy;
            if (i < i2 || z) {
                return;
            }
            if (i3 >= i4) {
                this.yof = false;
            } else {
                this.vlj = i3 + 1;
                rt();
            }
        }

        private void rt() {
            zg rc;
            this.dgt = true;
            this.tf = 0;
            fs fsVar = this.zmn;
            if (fsVar == null || (rc = fsVar.rc()) == null || rc.ve()) {
                return;
            }
            klz();
        }

        public void zg() {
            if (this.yof) {
                klz();
                this.dgt = false;
            }
        }

        public void bvs() {
            if (this.yof) {
                this.dgt = true;
            }
        }
    }

    static class fb extends AbstractC0143fs {
        private final int iv;
        private boolean klz;
        private int rc;

        public fb(fs fsVar, nqi nqiVar, com.bytedance.sdk.openadsdk.component.reward.top.zn znVar) {
            super(fsVar, nqiVar, znVar);
            if (nqiVar != null) {
                if (nqiVar.oep() >= 0) {
                    this.iv = Math.min(100, nqiVar.oep());
                    return;
                } else {
                    this.iv = kgc.fb().kjb(String.valueOf(nqiVar.qvo())).hhw;
                    return;
                }
            }
            this.iv = 100;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.fs.AbstractC0143fs
        protected int zmn(nqi nqiVar) {
            if (nqiVar != null) {
                return nqiVar.gc();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.fs.AbstractC0143fs
        public void zmn(int i, nqi nqiVar) {
            boolean z = this.hhw == 0;
            int i2 = this.fb;
            super.zmn(i, nqiVar);
            if (!z) {
                if (this.zn < i2) {
                    this.rc = (int) ((1.0f - (this.iv / 100.0f)) * this.fb);
                    return;
                }
                return;
            }
            if (this.hhw == 1) {
                this.rc = 3;
            } else {
                this.rc = (int) ((1.0f - (this.iv / 100.0f)) * this.zn);
            }
            com.bytedance.sdk.openadsdk.component.reward.klz klzVar = this.zmn.zmn;
            if (klzVar != null) {
                klzVar.zmn(this.fb);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.fs.AbstractC0143fs, android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (!this.klz && this.fb <= this.rc) {
                this.klz = true;
                zg rc = this.zmn.rc();
                if (rc != null) {
                    rc.kra();
                }
            }
            super.handleMessage(message);
            return true;
        }
    }

    static class zmn extends AbstractC0143fs {
        public zmn(fs fsVar, nqi nqiVar, com.bytedance.sdk.openadsdk.component.reward.top.zn znVar) {
            super(fsVar, nqiVar, znVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.fs.AbstractC0143fs
        protected int zmn(nqi nqiVar) {
            if (nqiVar != null) {
                return nqiVar.rzd();
            }
            return 5;
        }
    }

    public static class zn implements Runnable {
        private final nqi zmn;

        public zn(nqi nqiVar) {
            this.zmn = nqiVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.zmn.dbc() || nqi.hhw(this.zmn)) {
                return;
            }
            if (this.zmn.bv()) {
                if (com.bytedance.sdk.openadsdk.utils.fs.zn()) {
                    com.bytedance.sdk.openadsdk.component.reward.kgc.zmn(kgc.zmn()).zmn(this.zmn.utx());
                    return;
                } else {
                    olo.zmn(kgc.zmn()).zmn(this.zmn.utx());
                    return;
                }
            }
            if (com.bytedance.sdk.openadsdk.utils.fs.zn()) {
                com.bytedance.sdk.openadsdk.component.reward.nps.zmn(kgc.zmn()).zmn(this.zmn.utx());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.hhw.zmn(kgc.zmn()).zmn(this.zmn.utx());
            }
        }
    }

    public int ev() {
        return this.rc.zg();
    }

    public void zmn(int i) {
        this.rc.zmn(i);
    }

    public void fs(zg zgVar, int i) {
        this.rc.fs(zgVar, i);
    }

    public void zmn(zg zgVar, boolean z, boolean z2, boolean z3, int i) {
        this.rc.zmn(zgVar, z, z2, z3, i);
    }
}
