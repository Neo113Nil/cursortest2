package com.bytedance.sdk.openadsdk.zmn.fs;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.cn.fs.hhw;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.olo;
import com.bytedance.sdk.openadsdk.kw.zn.zmn;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes3.dex */
public class fs extends zg implements zn.fb, zn.InterfaceC0102zn, zmn.InterfaceC0200zmn {
    private final com.bytedance.sdk.openadsdk.kw.zn.zmn bvs;
    private boolean iv;
    private AdSlot klz;
    private long mw;
    private boolean rc;
    private zn zg;

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void i_() {
    }

    public fs(@NonNull Context context, @NonNull nqi nqiVar, int i, AdSlot adSlot) {
        super(context, nqiVar, i, true);
        this.iv = false;
        this.rc = true;
        this.btk = i;
        this.klz = adSlot;
        this.bvs = new com.bytedance.sdk.openadsdk.kw.zn.zmn();
        zmn(this.hhw);
        zmn("embeded_ad");
        this.fb.zmn(this);
    }

    public fs(@NonNull Context context, @NonNull nqi nqiVar, int i, AdSlot adSlot, zmn zmnVar, olo oloVar) {
        super(context, nqiVar, i, false);
        this.iv = false;
        this.rc = true;
        this.fb = zmnVar;
        this.zmn = oloVar;
        this.btk = i;
        this.klz = adSlot;
        this.bvs = new com.bytedance.sdk.openadsdk.kw.zn.zmn();
        zmn(this.hhw);
        zmn("embeded_ad");
        zmnVar.zmn(this);
    }

    public View btk() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar;
        nqi nqiVar = this.fs;
        if (nqiVar != null && this.zn != null) {
            if (nqi.btk(nqiVar)) {
                try {
                    hhwVar = new com.bytedance.sdk.openadsdk.core.cn.fs.hhw(this.zn, this.fs, this.zmn.zmn());
                    nqi nqiVar2 = this.fs;
                    if (nqiVar2 != null && nqiVar2.ch()) {
                        com.bytedance.sdk.openadsdk.core.rt.hhw zmn = hhwVar.zmn((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        zmn zmnVar = this.fb;
                        if (zmnVar != null) {
                            zmnVar.zmn(zmn);
                        }
                    }
                    this.zmn.zmn(hhwVar.getNativeVideoController());
                    zmn zmnVar2 = this.fb;
                    if (zmnVar2 != null) {
                        zmnVar2.zmn(hhwVar);
                    }
                    hhwVar.setVideoAdClickListenerTTNativeAd(this);
                    hhwVar.setAdCreativeClickListener(new hhw.zmn() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.fs.1
                        @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw.zmn
                        public void zmn(View view, int i) {
                            olo oloVar = fs.this.zmn;
                            if (oloVar != null) {
                                oloVar.zmn(view, i);
                            }
                        }
                    });
                    hhwVar.setControllerStatusCallBack(new hhw.fs() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.fs.2
                        @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw.fs
                        public void zmn(boolean z, long j, long j2, long j3, boolean z2) {
                            fs.this.bvs.zmn = z;
                            fs.this.bvs.btk = j;
                            fs.this.bvs.hhw = j2;
                            fs.this.bvs.nps = j3;
                            fs.this.bvs.fb = z2;
                        }
                    });
                    hhwVar.setVideoAdLoadListener(this);
                    hhwVar.setVideoAdInteractionListener(this);
                    if (5 == this.btk) {
                        hhwVar.setIsAutoPlay(this.iv ? this.klz.isAutoPlay() : this.rc);
                    } else {
                        hhwVar.setIsAutoPlay(this.rc);
                    }
                    hhwVar.zmn(kgc.fb().zn(String.valueOf(this.hhw)), "feedGetAdView");
                } catch (Exception e) {
                    ApmHelper.reportCustomError("", "getAdView null", e);
                }
                if (!nqi.btk(this.fs) && hhwVar != null && hhwVar.zmn(0L, true, false)) {
                    return hhwVar;
                }
                ApmHelper.reportCustomError(this.fs.zq() + StringUtils.COMMA + hhwVar, "getAdView null", new RuntimeException());
            }
            hhwVar = null;
            if (!nqi.btk(this.fs)) {
            }
            ApmHelper.reportCustomError(this.fs.zq() + StringUtils.COMMA + hhwVar, "getAdView null", new RuntimeException());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (com.bytedance.sdk.openadsdk.utils.oub.hhw(r0) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zmn(int i) {
        int fs = kgc.fb().fs(i);
        int zn = com.bytedance.sdk.component.utils.kgc.zn(kgc.zmn());
        if (3 == fs) {
            this.iv = false;
            this.rc = false;
        } else {
            if (1 == fs && oub.fb(zn)) {
                this.iv = false;
            } else if (2 == fs) {
                if (oub.btk(zn) || oub.fb(zn) || oub.hhw(zn)) {
                    this.iv = false;
                }
            } else if (4 == fs) {
                this.iv = true;
            } else if (5 == fs) {
                if (!oub.fb(zn)) {
                }
            }
            this.rc = true;
        }
        zmn zmnVar = this.fb;
        if (zmnVar != null) {
            zmnVar.zmn(this.iv);
        }
    }

    public void zmn(zn znVar) {
        this.zg = znVar;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.fb
    public void zmn(int i, int i2) {
        zn znVar = this.zg;
        if (znVar != null) {
            znVar.zmn(i, i2);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void g_() {
        zn znVar = this.zg;
        if (znVar != null) {
            znVar.zmn(this);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void h_() {
        zn znVar = this.zg;
        if (znVar != null) {
            znVar.fs(this);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void zmn(long j, long j2) {
        this.mw = j;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void j_() {
        zn znVar = this.zg;
        if (znVar != null) {
            znVar.zn(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.kw.zn.zmn.InterfaceC0200zmn
    public com.bytedance.sdk.openadsdk.kw.zn.zmn hhw() {
        return this.bvs;
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fs.zg
    protected void zmn(String str) {
        super.zmn(str);
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fs.zg, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        zmn zmnVar = this.fb;
        if (zmnVar != null) {
            zmnVar.klz();
        }
    }
}
