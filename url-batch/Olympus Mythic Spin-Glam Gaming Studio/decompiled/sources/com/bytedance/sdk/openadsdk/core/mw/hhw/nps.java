package com.bytedance.sdk.openadsdk.core.mw.hhw;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.klz;
import com.bytedance.adsdk.ugeno.core.rc;
import com.bytedance.adsdk.ugeno.fb.hhw;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.bytedance.sdk.openadsdk.core.model.ev;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class nps extends fb {
    private float am;
    private com.bytedance.adsdk.ugeno.fs.zn bjh;
    private boolean ev;
    private com.bytedance.adsdk.ugeno.fs.zn kjb;
    private com.bytedance.adsdk.ugeno.fs.zn rp;
    private float so;
    private float tf;
    private boolean yj;
    private com.bytedance.sdk.openadsdk.core.widget.btk zak;

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb, com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setSoundMute(boolean z) {
    }

    public nps(Context context, nqi nqiVar, boolean z, zmn zmnVar, ViewGroup viewGroup) {
        super(context, nqiVar, z, zmnVar, viewGroup);
        this.yj = false;
        this.ev = true;
        if (TextUtils.equals(this.doe, "fullscreen_interstitial_ad")) {
            this.am = this.btk.ab();
        } else if (TextUtils.equals(this.doe, "rewarded_video")) {
            this.am = this.btk.nkw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    protected JSONObject zmn() {
        JSONObject zn = this.hhw.zn();
        if (zn != null) {
            return zn.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    protected JSONObject fs() {
        return this.hhw.zn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    public void zmn(com.bytedance.sdk.openadsdk.core.widget.btk btkVar) {
        this.zak = btkVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb, com.bytedance.adsdk.ugeno.core.cn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
        char c;
        int i = 7;
        int i2 = 5;
        int i3 = -1;
        if (this.zg == null || zmnVar == null) {
            return;
        }
        String fs = zmnVar.fs();
        fs.hashCode();
        switch (fs.hashCode()) {
            case -1882810668:
                if (fs.equals("sendLogExtra")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1439599355:
                if (fs.equals("sendAdExtra")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -511324706:
                if (fs.equals("openPrivacy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -55818203:
                if (fs.equals("pauseVideo")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3532159:
                if (fs.equals("skip")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 72484600:
                if (fs.equals("openPlayable")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 804386914:
                if (fs.equals("videoControl")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 951590323:
                if (fs.equals("convert")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1151744482:
                if (fs.equals("muteVideo")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1528469391:
                if (fs.equals("openLinks")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1603466254:
                if (fs.equals("speedVideoOrTimer")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1671642405:
                if (fs.equals("dislike")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                new zg().zmn("sendLogExtra", this.btk, this.doe, zmnVar.zn());
                break;
            case 1:
                new zg().zmn("sendAdExtra", this.btk, this.doe, zmnVar.zn());
                break;
            case 2:
                this.zg.zmn(znVar.rc(), i, new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zn(i3).zmn(this.nqi).zmn(true).zmn(znVar.fkt()).fs(false).zmn());
                break;
            case 3:
            case 6:
                i = 4;
                this.zg.zmn(znVar.rc(), i, new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zn(i3).zmn(this.nqi).zmn(true).zmn(znVar.fkt()).fs(false).zmn());
                break;
            case 4:
                i = 6;
                this.zg.zmn(znVar.rc(), i, new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zn(i3).zmn(this.nqi).zmn(true).zmn(znVar.fkt()).fs(false).zmn());
                break;
            case 5:
                com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.bvs;
                if (cybVar != null) {
                    cybVar.fs((JSONObject) null);
                    break;
                }
                break;
            case 7:
                i = 2;
                this.zg.zmn(znVar.rc(), i, new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zn(i3).zmn(this.nqi).zmn(true).zmn(znVar.fkt()).fs(false).zmn());
                break;
            case '\b':
                i = i2;
                this.zg.zmn(znVar.rc(), i, new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zn(i3).zmn(this.nqi).zmn(true).zmn(znVar.fkt()).fs(false).zmn());
                break;
            case '\t':
                new hhw().zmn(zmn(znVar.rc()), this.fs instanceof Activity, this.btk, this.doe, zmnVar.zn(), this.zak);
                break;
            case '\n':
                iqz.fs("UGenRender", "onUGenEvent: " + zmnVar.zn());
                i2 = 13;
                if (zmnVar.zn() != null && !zmnVar.zn().isEmpty()) {
                    try {
                        i3 = Integer.parseInt(String.valueOf(zmnVar.zn().get("switch")));
                    } catch (Throwable th) {
                        iqz.zn("UGenRender", th);
                    }
                }
                i = i2;
                this.zg.zmn(znVar.rc(), i, new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zn(i3).zmn(this.nqi).zmn(true).zmn(znVar.fkt()).fs(false).zmn());
                break;
            case 11:
                i = 3;
                this.zg.zmn(znVar.rc(), i, new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zn(i3).zmn(this.nqi).zmn(true).zmn(znVar.fkt()).fs(false).zmn());
                break;
            default:
                i = 0;
                this.zg.zmn(znVar.rc(), i, new cyb.zmn().fb(this.rt).zn(this.cn).fs(this.cyb).zmn(this.olo).fs(this.kgc).zmn(this.kw).zn(i3).zmn(this.nqi).zmn(true).zmn(znVar.fkt()).fs(false).zmn());
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    protected int fb() {
        if (this.hhw.fkt()) {
            iqz.zmn("UGenRender", "renderWidget: only update data");
            return rt();
        }
        return bvs();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064 A[Catch: all -> 0x0078, NoClassDefFoundError -> 0x007b, UnsatisfiedLinkError -> 0x007e, TRY_LEAVE, TryCatch #2 {NoClassDefFoundError -> 0x007b, UnsatisfiedLinkError -> 0x007e, all -> 0x0078, blocks: (B:21:0x0025, B:24:0x002e, B:7:0x004c, B:9:0x0050, B:10:0x0060, B:12:0x0064, B:6:0x003c), top: B:20:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[Catch: all -> 0x0078, NoClassDefFoundError -> 0x007b, UnsatisfiedLinkError -> 0x007e, TryCatch #2 {NoClassDefFoundError -> 0x007b, UnsatisfiedLinkError -> 0x007e, all -> 0x0078, blocks: (B:21:0x0025, B:24:0x002e, B:7:0x004c, B:9:0x0050, B:10:0x0060, B:12:0x0064, B:6:0x003c), top: B:20:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int bvs() {
        mw();
        this.zmn.zmn((cn) this);
        this.zmn.zmn((com.bytedance.adsdk.ugeno.core.cyb) this);
        if (cyb()) {
            this.zmn.zmn(new zn());
        }
        ev rsi = this.btk.rsi();
        if (rsi == null) {
            try {
                if (!com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw.zmn(this.doe)) {
                    this.zn = this.zmn.zmn(this.fb, this.uqh, (JSONObject) null);
                    if (this.zn != null) {
                        cn();
                        this.kjb = this.zn.hhw("ProgressBar");
                        klz();
                    }
                    if (!(this instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw)) {
                        return 0;
                    }
                    this.hhw.tf().fs();
                    this.hhw.tf().zn();
                    return 0;
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return 139;
            } catch (Throwable unused3) {
                return ModuleDescriptor.MODULE_VERSION;
            }
        }
        this.zn = this.zmn.zmn(this.fb, this.uqh, zmn(rsi));
        if (this.zn != null) {
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw)) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    public com.bytedance.adsdk.ugeno.fs.zn nps() {
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null) {
            return null;
        }
        return znVar.hhw("Playable");
    }

    private void klz() {
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.bjh;
        if (znVar != null) {
            znVar.zn(8);
        }
        com.bytedance.adsdk.ugeno.fs.zn znVar2 = this.rp;
        if (znVar2 != null) {
            znVar2.zn(8);
        }
    }

    private void mw() {
        rc rcVar = new rc();
        HashMap hashMap = new HashMap();
        hashMap.put("image_info", this.hhw.rc());
        hashMap.put("cache_dir", this.hhw.rt());
        rcVar.zmn(hashMap);
        rcVar.zmn(this.fs);
        rcVar.zmn(this.fb);
        rcVar.fs(this.uqh);
        this.zmn.zmn("ad", rcVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    protected com.bytedance.adsdk.ugeno.fs.zn zg() {
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null) {
            return null;
        }
        return znVar.hhw("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb, com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        klz klzVar;
        if (this.zn == null) {
            return;
        }
        boolean z2 = i == 1;
        if (TextUtils.equals(this.doe, "open_ad") && (klzVar = this.zmn) != null) {
            klzVar.zmn(this.zn, "countdown", charSequence);
        }
        fs(charSequence, z2, i2, z);
        zmn(charSequence, z2, i2, z);
        zn(charSequence, z2, i2, z);
    }

    private void zmn(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2;
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.bjh;
        if (znVar != null && (znVar instanceof com.bytedance.sdk.openadsdk.core.mw.fs.fs)) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                iqz.zn("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            com.bytedance.sdk.openadsdk.core.mw.fs.fs fsVar = (com.bytedance.sdk.openadsdk.core.mw.fs.fs) this.bjh;
            if (z2 || i2 <= 0 || this.yj || zmn(fsVar)) {
                this.bjh.zn(8);
                return;
            }
            this.bjh.zn(0);
            if (!z && this.hhw.zmn() && com.bytedance.sdk.component.adexpress.fb.hhw.fs(this.hhw.fb())) {
                ((com.bytedance.sdk.openadsdk.core.mw.fs.fs) this.bjh).rt(String.valueOf(i));
            } else if (!"open_ad".equals(this.hhw.fb()) && this.hhw.zmn()) {
                this.yj = true;
                this.bjh.zn(8);
            } else {
                ((com.bytedance.sdk.openadsdk.core.mw.fs.fs) this.bjh).rt(String.valueOf(charSequence));
            }
        }
    }

    private void fs(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.kjb;
        if (znVar != null && (znVar instanceof com.bytedance.sdk.openadsdk.core.mw.fs.fb.zn)) {
            try {
                int parseInt = Integer.parseInt((String) charSequence);
                if (this.ev) {
                    this.so = i;
                    this.ev = false;
                }
                float f = (float) (this.tf + ((0.5d / this.so) * 100.0d));
                this.tf = f;
                this.zmn.zmn(this.zn, "ProgressBar://progress", Float.valueOf(f), Float.valueOf(this.am));
                if (!z2 && parseInt > 0 && !z) {
                    ((com.bytedance.sdk.openadsdk.core.mw.fs.fb.zn) this.kjb).nps(500);
                    ((com.bytedance.sdk.openadsdk.core.mw.fs.fb.zn) this.kjb).zmn((int) this.tf);
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.mw.fs.fb.zn) this.kjb).zn(8);
            } catch (Throwable th) {
                iqz.zn("UGenRender", th.getMessage());
            }
        }
    }

    private void zn(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.rp;
        if (znVar != null && (znVar instanceof com.bytedance.sdk.openadsdk.core.mw.fs.hhw)) {
            int i2 = 0;
            if (!z && !z2) {
                i2 = 8;
            }
            znVar.zn(i2);
        }
    }

    private Context zmn(View view) {
        Activity zmn = view != null ? com.bytedance.sdk.component.utils.fs.zmn(view) : null;
        return zmn == null ? this.fs : zmn;
    }

    public void iv() {
        klz klzVar = this.zmn;
        if (klzVar != null) {
            klzVar.zmn(this.zn, "videoFail", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    public void zmn(long j, long j2) {
        super.zmn(j, j2);
        klz klzVar = this.zmn;
        if (klzVar != null) {
            klzVar.zmn(this.zn, "videoProgress", Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public void rc() {
        klz klzVar = this.zmn;
        if (klzVar != null) {
            klzVar.zmn(this.zn, "show", new Object[0]);
        }
    }

    private int rt() {
        mw();
        try {
            this.zmn.zmn(this.uqh, this.zn);
            if (this.zn != null) {
                cn();
                klz();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw) {
                return 0;
            }
            this.hhw.tf().fs();
            this.hhw.tf().zn();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return ModuleDescriptor.MODULE_VERSION;
        }
    }

    private void cn() {
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.fs.zn<View> hhw = znVar.hhw("RVCountdown");
        this.bjh = hhw;
        if (hhw == null) {
            this.bjh = this.zn.hhw("FVCountdown");
        }
        if (this.bjh == null) {
            this.bjh = this.zn.hhw("AOCountdown");
        }
        com.bytedance.adsdk.ugeno.fs.zn<View> hhw2 = this.zn.hhw("RVSkipView");
        this.rp = hhw2;
        if (hhw2 == null) {
            this.rp = this.zn.hhw("FVSkipView");
        }
        if (this.rp == null) {
            this.rp = this.zn.hhw("AOSkipView");
        }
    }

    private boolean cyb() {
        nqi nqiVar = this.btk;
        return nqiVar != null && nqiVar.ob() == 1;
    }

    private boolean zmn(com.bytedance.sdk.openadsdk.core.mw.fs.fs fsVar) {
        if (fsVar == null) {
            return true;
        }
        if (TextUtils.equals(this.doe, "open_ad")) {
            return fsVar.fb() == 8 || fsVar.fb() == 4;
        }
        return false;
    }

    public JSONObject zmn(ev evVar) {
        if (evVar != null) {
            return evVar.btk();
        }
        return null;
    }
}
