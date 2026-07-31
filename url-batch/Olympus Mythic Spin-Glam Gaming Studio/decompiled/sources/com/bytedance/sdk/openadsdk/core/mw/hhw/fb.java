package com.bytedance.sdk.openadsdk.core.mw.hhw;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.cyb;
import com.bytedance.adsdk.ugeno.core.klz;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.adsdk.ugeno.fb.hhw;
import com.bytedance.sdk.component.adexpress.fs.rt;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class fb implements cn, cyb, com.bytedance.sdk.component.adexpress.dynamic.fb, com.bytedance.sdk.component.adexpress.fs.fb<View> {
    protected static int phc = 24;
    private com.bytedance.sdk.component.adexpress.fs.nps bjh;
    protected nqi btk;
    protected com.bytedance.sdk.openadsdk.core.iv.cyb bvs;
    protected float cn;
    protected float cyb;
    protected String doe;
    private btk ev;
    protected JSONObject fb;
    protected Context fs;
    protected zmn hhw;
    protected rt iv;
    protected long kgc;
    protected com.bytedance.adsdk.ugeno.fs.zn klz;
    protected long kw;
    protected com.bytedance.adsdk.ugeno.fs.zn mw;
    protected FrameLayout nps;
    protected float olo;
    private boolean rp;
    protected float rt;
    private phc tf;
    protected JSONObject uqh;
    protected com.bytedance.sdk.component.adexpress.fs.zg zg;
    protected klz zmn;
    protected com.bytedance.adsdk.ugeno.fs.zn<View> zn;
    protected boolean iqz = true;
    private long kjb = 0;
    private float zak = 0.0f;
    private float am = 0.0f;
    private float yj = 0.0f;
    private float so = 0.0f;
    public SparseArray<zn.zmn> nqi = new SparseArray<>();
    private String fkt = "";
    private final com.bytedance.sdk.component.zg.fs.zn hgd = new com.bytedance.sdk.component.zg.fs.zn("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.mw.hhw.fb.1
        @Override // java.lang.Runnable
        public void run() {
            fb fbVar = fb.this;
            fbVar.fb = fbVar.zmn();
            fb fbVar2 = fb.this;
            fbVar2.uqh = fbVar2.fs();
            fb fbVar3 = fb.this;
            fbVar3.ev = new btk(fbVar3.fs, fbVar3.btk, fbVar3.doe, fbVar3.uqh);
            if (fb.this.tf == null) {
                fb.this.fkt = "expressView is null";
            } else {
                fb fbVar4 = fb.this;
                fbVar4.fkt = fbVar4.tf.getUgenTemplateErrorReason();
            }
            com.bytedance.sdk.openadsdk.core.cn.zn().post(fb.this.nu);
        }
    };
    private final Runnable nu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mw.hhw.fb.2
        @Override // java.lang.Runnable
        public void run() {
            if (fb.this.bjh != null) {
                fb fbVar = fb.this;
                fbVar.fs(fbVar.bjh);
            }
        }
    };
    private boolean ww = false;
    protected AtomicBoolean rc = new AtomicBoolean(false);

    public com.bytedance.adsdk.ugeno.fs.zn nps() {
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setTimeUpdate(int i) {
    }

    public void zmn(long j, long j2) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.cn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
    }

    static {
        if (kgc.zmn() != null) {
            phc = kgc.fs();
        }
    }

    public fb(Context context, nqi nqiVar, boolean z, zmn zmnVar, ViewGroup viewGroup) {
        this.fs = context;
        this.rp = z;
        this.zmn = new klz(context);
        this.btk = nqiVar;
        this.hhw = zmnVar;
        this.nps = new FrameLayout(context);
        if (viewGroup instanceof phc) {
            this.tf = (phc) viewGroup;
        }
        this.doe = zmnVar.fb();
    }

    public void zmn(nqi nqiVar, boolean z, zmn zmnVar, ViewGroup viewGroup) {
        this.btk = nqiVar;
        this.hhw = zmnVar;
        this.doe = zmnVar.fb();
        if (viewGroup instanceof phc) {
            this.tf = (phc) viewGroup;
        }
        this.rp = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    public void zmn(com.bytedance.sdk.component.adexpress.fs.nps npsVar) {
        this.bjh = npsVar;
        nu.zn((Runnable) this.hgd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(com.bytedance.sdk.component.adexpress.fs.nps npsVar) {
        if (this instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw) {
            this.hhw.btk().nps(1);
        } else {
            this.hhw.tf().zmn();
        }
        if (this.fb == null) {
            npsVar.zmn(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + this.fkt);
            return;
        }
        if (this.uqh == null) {
            npsVar.zmn(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int fb = fb();
        if (this.zmn.zmn()) {
            List<String> fs = this.zmn.fs();
            if (fs == null) {
                npsVar.zmn(138, "unknow widget");
                return;
            }
            npsVar.zmn(138, "unknow widget;" + fs.toString());
            return;
        }
        if (fb != 0) {
            npsVar.zmn(fb, "ugen render fail");
            return;
        }
        if (this.zn != null) {
            fs fsVar = new fs();
            this.iv = fsVar;
            fsVar.zmn(true);
            this.iv.zmn(zn());
            setSoundMute(this.rp);
            bvs();
            com.bytedance.adsdk.ugeno.fs.zn zg = zg();
            this.klz = zg;
            if (zg != null && (zg instanceof com.bytedance.sdk.openadsdk.core.mw.fs.hhw.fs)) {
                ((fs) this.iv).zmn((FrameLayout) ((com.bytedance.sdk.openadsdk.core.mw.fs.hhw.fs) zg).fb());
            }
            btk btkVar = this.ev;
            if (btkVar != null) {
                btkVar.zmn();
            }
            com.bytedance.adsdk.ugeno.fs.zn hhw = hhw();
            this.mw = hhw;
            if (hhw != null && (hhw instanceof com.bytedance.adsdk.ugeno.bvs.fs.fs)) {
                ((fs) this.iv).fs((FrameLayout) hhw.rc());
            }
            if (am.zn(this.btk)) {
                com.bytedance.adsdk.ugeno.fs.zn nps = nps();
                if (nps instanceof com.bytedance.sdk.openadsdk.core.mw.fs.zn.fs) {
                    ((fs) this.iv).zn(((com.bytedance.sdk.openadsdk.core.mw.fs.zn.fs) nps).fb());
                }
            }
            int hgd = this.zn.hgd();
            int nu = this.zn.nu();
            this.nps.removeAllViews();
            this.nps.addView(this.zn.rc(), new FrameLayout.LayoutParams(hgd, nu));
            float yj = this.hhw.yj();
            float so = this.hhw.so();
            float fs2 = jy.fs(this.fs, yj);
            float fs3 = jy.fs(this.fs, so);
            if (zn() != 7) {
                this.nps.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            } else if (so <= 0.0f) {
                this.nps.setLayoutParams(new FrameLayout.LayoutParams((int) fs2, -2));
            } else {
                this.nps.setLayoutParams(new FrameLayout.LayoutParams((int) fs2, (int) fs3));
            }
            if (so <= 0.0f || yj <= 0.0f) {
                this.nps.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int zn = jy.zn(this.fs, this.nps.getMeasuredWidth());
                int zn2 = jy.zn(this.fs, this.nps.getMeasuredHeight());
                this.iv.zmn(zn);
                this.iv.fs(zn2);
            } else {
                this.iv.zmn(yj);
                this.iv.fs(so);
            }
            if (this.rc.get()) {
                npsVar.zmn(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
                return;
            } else {
                this.zmn.zmn(this.zn, "renderDidFinish", new Object[0]);
                npsVar.zmn(this.nps, this.iv);
                return;
            }
        }
        npsVar.zmn(138, "ugen render error");
    }

    protected JSONObject zmn() {
        return this.hhw.zn();
    }

    protected JSONObject fs() {
        return this.hhw.ev();
    }

    protected int fb() {
        this.zmn.zmn((cn) this);
        this.zmn.zmn((cyb) this);
        com.bytedance.adsdk.ugeno.fs.zn<View> zmn = this.zmn.zmn(this.fb);
        this.zn = zmn;
        btk btkVar = this.ev;
        if (btkVar != null && zmn != null) {
            btkVar.zmn(zmn);
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw)) {
            this.hhw.tf().fs();
            this.hhw.tf().zn();
        }
        this.zmn.fs(this.uqh);
        return 0;
    }

    public void zmn(boolean z) {
        this.rc.set(z);
    }

    public void zmn(com.bytedance.sdk.component.adexpress.fs.zg zgVar) {
        this.zg = zgVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.iv.cyb cybVar) {
        this.bvs = cybVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.widget.btk btkVar) {
        btk btkVar2 = this.ev;
        if (btkVar2 != null) {
            btkVar2.zmn(btkVar);
        }
    }

    public com.bytedance.adsdk.ugeno.fs.zn hhw() {
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null) {
            return null;
        }
        return znVar.hhw("PlayableComponent");
    }

    @Override // com.bytedance.adsdk.ugeno.core.cn
    public void zmn(mw mwVar, cn.fs fsVar, cn.zmn zmnVar) {
        if (mwVar == null) {
            return;
        }
        if (mwVar.fs() == 1 || mwVar.fs() == 4) {
            zmn(mwVar);
        }
        if (mwVar.fs() == 10) {
            zmn(mwVar.zn());
        }
        if (fsVar == null || mwVar.fb() == null) {
            return;
        }
        fsVar.zmn(mwVar.fb());
    }

    private void zmn(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.fs.zn<View> btk;
        if (this.zn == null || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(optString2) || (btk = this.zn.btk(optString2)) == null) {
            return;
        }
        if (TextUtils.equals(optString, "onShow")) {
            btk.zn(0);
        } else if (TextUtils.equals(optString, "onDismiss")) {
            btk.zn(8);
        }
    }

    private void zmn(mw mwVar) {
        JSONObject jSONObject;
        boolean z;
        int i;
        String str;
        btk btkVar;
        btk btkVar2;
        btk btkVar3;
        int i2 = 5;
        boolean z2 = true;
        if (this.zg == null) {
            return;
        }
        String optString = mwVar.zn().optString("type");
        if ("swiperLeft".equals(optString) && (btkVar3 = this.ev) != null) {
            btkVar3.fs();
            return;
        }
        if ("swiperRight".equals(optString) && (btkVar2 = this.ev) != null) {
            btkVar2.zn();
            return;
        }
        if (!"swiperClick".equals(optString) || (btkVar = this.ev) == null) {
            jSONObject = null;
            z = false;
            i = 0;
        } else {
            z = btkVar.zmn(mwVar);
            jSONObject = this.ev.fb();
            i = 2;
        }
        optString.hashCode();
        switch (optString) {
            case "privacy":
                i2 = 7;
                break;
            case "feedback":
                i2 = 3;
                break;
            case "mute":
                break;
            case "skip":
                i2 = 6;
                break;
            case "video":
                i2 = 4;
                break;
            case "creative":
                i2 = 2;
                break;
            default:
                i2 = i;
                break;
        }
        com.bytedance.adsdk.ugeno.fs.zn zmn = mwVar.zmn();
        cyb.zmn zmn2 = new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zmn(this.nqi);
        if (mwVar.fs() == 1 && !this.iqz) {
            z2 = false;
        }
        cyb.zmn zmn3 = zmn2.zmn(z2);
        if (zmn == null) {
            str = "";
        } else {
            str = zmn.fkt() + "_" + zmn.tf();
        }
        this.zg.zmn(mwVar.zmn().rc(), i2, zmn3.zmn(str).fs(z).fs(jSONObject).zmn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r10.so <= r3) goto L15;
     */
    @Override // com.bytedance.adsdk.ugeno.core.cyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = 0;
        int i3 = 1;
        if (action != 0) {
            if (action == 1) {
                this.cyb = motionEvent.getRawX();
                this.olo = motionEvent.getRawY();
                if (Math.abs(this.cyb - this.rt) >= phc || Math.abs(this.olo - this.cn) >= phc) {
                    this.iqz = false;
                }
                this.kw = System.currentTimeMillis();
            } else if (action == 2) {
                this.yj += Math.abs(motionEvent.getX() - this.zak);
                this.so += Math.abs(motionEvent.getY() - this.am);
                this.zak = motionEvent.getX();
                this.am = motionEvent.getY();
                if (System.currentTimeMillis() - this.kjb > 200) {
                    float f = this.yj;
                    int i4 = phc;
                    if (f <= i4) {
                    }
                    if (Math.abs(motionEvent.getRawX() - this.rt) < phc || Math.abs(motionEvent.getRawY() - this.cn) >= phc) {
                        this.iqz = false;
                    }
                    i = i3;
                    this.nqi.put(motionEvent.getActionMasked(), new zn.zmn(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                }
                i3 = 2;
                if (Math.abs(motionEvent.getRawX() - this.rt) < phc) {
                }
                this.iqz = false;
                i = i3;
                this.nqi.put(motionEvent.getActionMasked(), new zn.zmn(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
            }
            i2 = -1;
        } else {
            this.kgc = System.currentTimeMillis();
            this.rt = motionEvent.getRawX();
            this.cn = motionEvent.getRawY();
            this.iqz = true;
            this.yj = 0.0f;
            this.so = 0.0f;
            this.kjb = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.klz.zn.zmn(motionEvent);
            this.zak = motionEvent.getX();
            this.am = motionEvent.getY();
        }
        i = i2;
        this.nqi.put(motionEvent.getActionMasked(), new zn.zmn(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.zn == null) {
            return;
        }
        boolean z2 = i == 1;
        zmn(charSequence, z2, i2, z);
        fs(charSequence, z2, i2, z);
    }

    private void zmn(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.fs.zn<View> btk;
        int i2;
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null || (btk = znVar.btk("countdown")) == null) {
            return;
        }
        View rc = btk.rc();
        if (rc instanceof TextView) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                iqz.zn("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (z2 || i2 <= 0 || this.ww) {
                rc.setVisibility(8);
                return;
            }
            rc.setVisibility(0);
            if (!z && this.hhw.zmn() && com.bytedance.sdk.component.adexpress.fb.hhw.fs(this.hhw.fb())) {
                ((TextView) rc).setText(String.format(doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_full_skip"), Integer.valueOf(i)));
                return;
            }
            if (!"open_ad".equals(this.hhw.fb()) && this.hhw.zmn()) {
                this.ww = true;
                rc.setVisibility(8);
            } else {
                ((TextView) rc).setText(((Object) charSequence) + "s");
            }
        }
    }

    private void fs(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.fs.zn<View> btk;
        View rc;
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null || (btk = znVar.btk("skip")) == null || (rc = btk.rc()) == null) {
            return;
        }
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        rc.setVisibility(i2);
    }

    private void bvs() {
        com.bytedance.adsdk.ugeno.fs.zn<View> btk;
        if (this.zn == null) {
            return;
        }
        if (this.btk.av() && (btk = this.zn.btk("tvskip")) != null) {
            btk.zn(8);
        }
        com.bytedance.adsdk.ugeno.fs.zn<View> btk2 = this.zn.btk("skip");
        if (btk2 != null && (btk2 instanceof com.bytedance.adsdk.ugeno.bvs.fb.zn)) {
            if (!rc.fs().cn(String.valueOf(this.btk.qvo())) || this.btk.cd() == 5 || this.btk.cd() == 6 || this.btk.sft() == 3) {
                ((com.bytedance.adsdk.ugeno.bvs.fb.zn) btk2).rt("local://tt_close_btn");
                btk2.fs();
            }
        }
    }

    protected com.bytedance.adsdk.ugeno.fs.zn zg() {
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null) {
            return null;
        }
        return znVar.btk("video");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setSoundMute(boolean z) {
        com.bytedance.adsdk.ugeno.fs.zn<View> btk;
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null || (btk = znVar.btk("mute")) == null) {
            return;
        }
        if (z) {
            ((com.bytedance.adsdk.ugeno.bvs.fb.zn) btk).rt("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.bvs.fb.zn) btk).rt("local://tt_reward_full_unmute");
        }
        btk.fs();
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    public View btk() {
        return this.nps;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    public int zn() {
        return this.btk.skn();
    }
}
