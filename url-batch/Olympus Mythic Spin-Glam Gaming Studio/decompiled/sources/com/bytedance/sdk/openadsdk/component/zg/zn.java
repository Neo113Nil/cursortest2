package com.bytedance.sdk.openadsdk.component.zg;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.zmn;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.bytedance.sdk.openadsdk.fb.iv;

/* loaded from: classes10.dex */
public class zn implements zmn.InterfaceC0185zmn {
    private boolean btk = false;
    private fs fb;
    private FrameLayout fs;
    private Context zmn;
    private nqi zn;

    public zn(Context context) {
        this.zmn = context.getApplicationContext();
    }

    public void zmn(FrameLayout frameLayout, nqi nqiVar) {
        this.fs = frameLayout;
        this.zn = nqiVar;
        this.fb = new fs(this.zmn, frameLayout, nqiVar);
    }

    public boolean zmn() {
        com.bytedance.sdk.openadsdk.core.cn.zmn.fs zmn = nqi.zmn(CacheDirFactory.getICacheDir(0).fs(), this.zn);
        zmn.fs(this.zn.ji());
        zmn.fs(this.fs.getWidth());
        zmn.zn(this.fs.getHeight());
        zmn.zn(this.zn.ze());
        zmn.zmn(0L);
        zmn.zmn(true);
        return this.fb.zmn(zmn);
    }

    public fs fs() {
        return this.fb;
    }

    public void zmn(boolean z) {
        this.btk = z;
    }

    public boolean zn() {
        return this.btk;
    }

    public boolean fb() {
        fs fsVar = this.fb;
        return (fsVar == null || fsVar.rc() == null || !this.fb.rc().fs()) ? false : true;
    }

    public boolean btk() {
        fs fsVar = this.fb;
        return (fsVar == null || fsVar.rc() == null || !this.fb.rc().hhw()) ? false : true;
    }

    public boolean hhw() {
        fs fsVar = this.fb;
        return (fsVar == null || fsVar.rc() == null || !this.fb.rc().nps()) ? false : true;
    }

    public boolean nps() {
        fs fsVar = this.fb;
        return fsVar != null && fsVar.rt();
    }

    public void zmn(zn.zmn zmnVar) {
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.zmn(zmnVar);
        }
    }

    public boolean zmn(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.zmn zmnVar, nqi nqiVar) {
        zmn(frameLayout, nqiVar);
        zmn(zmnVar);
        try {
            boolean zmn = zmn();
            if (!zmn) {
                nqi nqiVar2 = this.zn;
                iv.zmn(nqiVar2, "show_ad_fail", nqiVar2.btk(), "video_play_fail");
            }
            return zmn;
        } catch (Throwable th) {
            iqz.zn("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    public boolean zmn(float f) {
        try {
            fs fsVar = this.fb;
            if (fsVar != null) {
                return fsVar.zmn(f);
            }
            return false;
        } catch (Throwable th) {
            iqz.zn("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th.getMessage());
            return false;
        }
    }

    public void zg() {
        try {
            if (btk()) {
                this.fb.fs();
            }
        } catch (Throwable th) {
            iqz.zn("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void bvs() {
        try {
            if (hhw()) {
                rc();
            }
        } catch (Throwable th) {
            iqz.zn("TTAppOpenVideoManager", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void iv() {
        fs fsVar = this.fb;
        if (fsVar == null) {
            return;
        }
        fsVar.fb();
        this.fb = null;
    }

    public void rc() {
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.zn();
        }
    }

    public void klz() {
        fs fsVar = this.fb;
        if (fsVar == null) {
            return;
        }
        this.zmn = null;
        fsVar.fb();
        this.fb = null;
    }

    public long mw() {
        fs fsVar = this.fb;
        if (fsVar != null) {
            return fsVar.hhw();
        }
        return 0L;
    }

    public long rt() {
        fs fsVar = this.fb;
        if (fsVar != null) {
            return fsVar.nps();
        }
        return 0L;
    }

    public long cn() {
        fs fsVar = this.fb;
        if (fsVar != null) {
            return fsVar.bvs() + this.fb.nps();
        }
        return 0L;
    }

    public void zmn(int i) {
        if (this.fb != null) {
            cn.zmn zmnVar = new cn.zmn();
            zmnVar.fs(mw());
            zmnVar.fb(cn());
            zmnVar.zn(rt());
            zmnVar.zn(i);
            zmnVar.fb(this.fb.zg());
            zmnVar.zmn(this.fb.olo());
            this.fb.zmn(zmnVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zmn.InterfaceC0185zmn
    public long getVideoProgress() {
        return mw();
    }

    public void cyb() {
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.oub();
        }
    }
}
