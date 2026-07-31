package com.bytedance.sdk.openadsdk.core.cn.fs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.WorkerThread;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bykv.vk.openvk.zmn.zmn.zmn.zmn;
import com.bytedance.sdk.component.utils.bvs;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.cn.fs.hhw;
import com.bytedance.sdk.openadsdk.core.iv.kjb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.bytedance.sdk.openadsdk.fb.nps;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* loaded from: classes12.dex */
public class zn extends com.bytedance.sdk.openadsdk.core.cn.zmn.zmn {
    private final zmn.InterfaceC0103zmn bxw;
    private boolean cd;
    private WeakReference<zmn> cud;
    private WeakReference<zn.fb> dgt;
    private int gn;
    private long hgd;
    private final boolean jy;
    private nps kra;
    private int mhu;
    private fs na;
    private long nu;
    private final String oub;
    private int tet;
    private int uqd;
    private int ve;
    private final boolean vlj;
    private final boolean ww;
    private final rp.zmn xrr;
    private final Runnable yo;
    private boolean yof;

    public interface zmn {
        void hhw();

        void zmn(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fb(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public void hhw(boolean z) {
        this.yof = z;
    }

    public void zmn(final hhw.zmn zmnVar) {
        btk btkVar;
        if (!this.cn || (btkVar = this.nps) == null) {
            return;
        }
        btkVar.zmn(new hhw.zmn() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.2
            @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw.zmn
            public void zmn(View view, int i) {
                hhw.zmn zmnVar2 = zmnVar;
                if (zmnVar2 != null) {
                    zmnVar2.zmn(view, i);
                }
            }
        });
    }

    public void zmn(PAGNativeAd pAGNativeAd) {
        btk btkVar;
        if (!this.cn || (btkVar = this.nps) == null) {
            return;
        }
        btkVar.zmn(pAGNativeAd);
    }

    public void zmn(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.gn = i;
        this.uqd = i2;
    }

    public void fs(int i, int i2) {
        zmn(i, i2);
        btk btkVar = this.nps;
        if (btkVar == null || i <= 0 || i2 <= 0) {
            return;
        }
        btkVar.zn(i, i2);
        this.nps.zmn(i, i2);
        vlj();
    }

    public void zmn(fs fsVar) {
        this.na = fsVar;
    }

    private void zmn(Context context) {
        ViewGroup znVar;
        if (this.cn) {
            znVar = new com.bytedance.sdk.openadsdk.cn.fb(context);
        } else {
            znVar = new com.bytedance.sdk.openadsdk.cn.zn(context);
        }
        ViewGroup viewGroup = znVar;
        if (this.cn) {
            this.nps = new btk(context, viewGroup, true, 17, this.zg, this, doe());
        } else {
            this.nps = new fb(context, viewGroup, true, 17, this.zg, this, false);
        }
        this.nps.zmn(this);
    }

    public zn(Context context, ViewGroup viewGroup, nqi nqiVar, String str, boolean z, boolean z2, boolean z3, nps npsVar) {
        super(context, nqiVar, viewGroup);
        this.hgd = 0L;
        this.nu = 0L;
        this.yof = true;
        this.gn = 0;
        this.uqd = 0;
        this.bxw = new zmn.InterfaceC0103zmn() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1
            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i) {
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
                com.bytedance.sdk.openadsdk.core.rt.fb zmn2;
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, 5);
                            com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, 5);
                            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak != null) {
                                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak.zmn(9);
                            }
                        } catch (Exception unused) {
                        }
                        zn.this.oub();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.fb exj = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg.exj();
                if (exj == null || (zmn2 = exj.zmn()) == null) {
                    return;
                }
                zmn2.fb(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).bvs);
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, long j) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).uqh = false;
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.removeCallbacks(zn.this.yo);
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps != null) {
                            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.fs();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).cn || zn.this.cud == null || zn.this.cud.get() == null) {
                            return;
                        }
                        ((zmn) zn.this.cud.get()).hhw();
                    }
                });
                zn.this.tf();
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, 0);
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak != null) {
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak.zn();
                }
                zn znVar = zn.this;
                znVar.zmn(znVar.kra);
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.removeCallbacks(zn.this.yo);
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zn.this.dgt != null && zn.this.dgt.get() != null) {
                            zn.this.dgt.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps != null) {
                            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.fs();
                        }
                    }
                });
                if (zn.this.ww) {
                    return;
                }
                zn znVar = zn.this;
                znVar.zmn(znVar.kra);
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, final com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar2) {
                com.bytedance.sdk.openadsdk.core.rt.fb zmn2;
                String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zmn;
                zmnVar2.zmn();
                zmnVar2.fs();
                zmnVar2.zn();
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int zmn3 = zmnVar2.zmn();
                        int fs = zmnVar2.fs();
                        if (!zn.this.kjb() || fs == -1004) {
                            if (zn.this.fb(zmn3, fs)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zmn;
                                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.zmn2(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, (WeakReference<Context>) null, false);
                                zn.this.fs(true);
                                zn.this.btk();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps != null) {
                                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.fs();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).kjb != null) {
                                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).kjb.fs(zn.this.nu, com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).bvs, ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).tf));
                            }
                            if (zn.this.dgt == null || zn.this.dgt.get() == null || zn.this.kjb()) {
                                return;
                            }
                            ((zn.fb) zn.this.dgt.get()).zmn(zmn3, fs);
                        }
                    }
                });
                zn.this.zmn(zmnVar2);
                com.bytedance.sdk.openadsdk.core.model.fb exj = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg.exj();
                if (exj != null && (zmn2 = exj.zmn()) != null) {
                    zmn2.zmn(com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, 6);
                com.bytedance.sdk.openadsdk.bjh.zmn.zn.fs(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg);
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak != null) {
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak.zmn(14);
                }
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, boolean z4) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps != null) {
                            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.fs();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i, int i2) {
                bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        zn.this.vlj();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i, int i2, int i3) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).uqh = true;
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps != null) {
                            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.olo();
                            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.postDelayed(zn.this.yo, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, 2);
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak != null) {
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak.zmn(4);
                }
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).uqh = false;
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.removeCallbacks(zn.this.yo);
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.fs();
                    }
                });
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, 0);
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak != null) {
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak.zmn(5);
                }
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, final long j, final long j2) {
                if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).bvs) < 50) {
                    return;
                }
                zn znVar = zn.this;
                znVar.zmn(znVar.kra);
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        zn.this.zmn(j, j2);
                        zn.this.fs(j, j2);
                    }
                });
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void fb(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
                com.bytedance.sdk.openadsdk.core.rt.fb zmn2;
                com.bytedance.sdk.openadsdk.core.model.fb exj = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg.exj();
                if (exj != null && (zmn2 = exj.zmn()) != null) {
                    zmn2.fs(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).bvs);
                }
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, 3);
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak != null) {
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak.zmn(0);
                }
            }

            @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
            public void btk(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
                com.bytedance.sdk.openadsdk.core.rt.fb zmn2;
                com.bytedance.sdk.openadsdk.core.model.fb exj = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg.exj();
                if (exj != null && (zmn2 = exj.zmn()) != null) {
                    zmn2.zn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).bvs);
                }
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak != null) {
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zak.zmn(1);
                }
            }
        };
        this.tet = 0;
        this.yo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps != null) {
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.zmn2(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zg, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.fs();
                    zn.this.fs(true);
                    String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zmn;
                }
            }
        };
        this.xrr = new rp.zmn() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.6
            @Override // com.bytedance.sdk.component.utils.rp.zmn
            @WorkerThread
            public void zmn(Context context2, Intent intent, boolean z4, final int i) {
                nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zn.this.hhw(i);
                    }
                });
            }
        };
        this.cd = false;
        this.ve = kgc.zn(context);
        zmn(z);
        this.oub = str;
        try {
            this.gn = viewGroup.getWidth();
            this.uqd = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        zmn(context);
        this.ww = true;
        this.jy = z2;
        this.vlj = z3;
        if (npsVar != null) {
            this.kra = npsVar;
        }
    }

    public com.bytedance.sdk.openadsdk.core.rt.hhw zmn(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.zg.zt()) {
            return null;
        }
        if (this.zak == null) {
            this.zak = com.bytedance.sdk.openadsdk.core.rt.hhw.zmn();
        }
        this.zak.zmn(view, this.zg);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.zak.zmn((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.zak;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.zmn.zmn
    public void zmn(zn.fb fbVar) {
        this.dgt = new WeakReference<>(fbVar);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.bvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.zmn.zmn, com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        super.zmn(znVar);
        if (this.hhw != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(znVar.cyb())) {
            return false;
        }
        fs(false);
        znVar.cyb();
        znVar.fs(com.bytedance.sdk.openadsdk.uqh.btk.zmn("player_force_raw_url", 0) == 1);
        int i = this.mhu + 1;
        this.mhu = i;
        znVar.btk = i;
        fs(znVar);
        yj();
        com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar = this.zak;
        if (hhwVar != null) {
            hhwVar.zmn(false, 0.0f);
        }
        if (!kjb.fs(this.oub) || this.bvs <= 0) {
            this.bvs = znVar.iv();
        }
        if (kjb.fs(this.oub) && this.bvs == this.tf) {
            this.bvs = 0L;
        }
        if (znVar.iv() <= 0) {
            this.phc = false;
            this.iqz.set(false);
        } else {
            long iv = znVar.iv();
            this.bvs = iv;
            this.iv = Math.max(this.iv, iv);
        }
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zmn();
            if (this.tet == 0) {
                this.nps.nps();
            }
            this.nps.zn(znVar.zg(), znVar.bvs());
            this.nps.zn(this.bjh);
            this.nps.zmn(znVar.zg(), znVar.bvs());
        }
        if (this.hhw == null) {
            com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar2 = new com.bytedance.sdk.openadsdk.core.cn.fb.zn();
            this.hhw = znVar2;
            znVar2.zmn(this.bxw);
        }
        kgc();
        this.nu = 0L;
        try {
            zn(znVar);
            return true;
        } catch (Exception e) {
            zmn(new com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn(-10, 0, e.getMessage()));
            iqz.zn(this.zmn, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e)));
            return false;
        }
    }

    private void zn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        znVar.fb(0);
        this.hhw.zmn(znVar);
        this.hgd = System.currentTimeMillis();
        this.nps.zn(8);
        this.nps.zn(0);
        zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).hhw == null) {
                    return;
                }
                zn.this.hgd = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).nps.fb(0);
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).hhw.zmn(true, ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).bvs, ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).cyb);
            }
        });
        if (this.cn) {
            cyb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oub() {
        this.tet++;
        btk btkVar = this.nps;
        if (btkVar == null) {
            return;
        }
        btkVar.fs();
        zn.zmn zmnVar = this.kjb;
        if (zmnVar != null) {
            zmnVar.zmn(this.nu, com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(this.bvs, this.tf));
        }
        this.nu = System.currentTimeMillis() - this.hgd;
        if (this.yof) {
            this.nps.zmn2(this.zg, (WeakReference<Context>) null, true);
        }
        if (!this.phc) {
            this.phc = true;
            long j = this.tf;
            fs(j, j);
            long j2 = this.tf;
            this.bvs = j2;
            this.iv = j2;
            fs(this.kra);
        }
        if (!this.cn && this.kw) {
            btk(this.nps, null);
        }
        this.rt = true;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zn() {
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zmn();
        }
        btk btkVar2 = this.nps;
        if (btkVar2 != null) {
            btkVar2.kgc();
        }
        jy();
    }

    public void nps(boolean z) {
        btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zmn();
        }
        btk btkVar2 = this.nps;
        if (btkVar2 != null && z) {
            btkVar2.kgc();
        }
        jy();
    }

    private void jy() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            if (znVar.nps()) {
                if (this.mw) {
                    iqz();
                } else {
                    fs(this.fkt);
                }
            } else {
                this.hhw.zmn(false, this.bvs, this.cyb);
            }
        }
        if (this.iqz.get()) {
            zak();
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void fb() {
        zmn(true, 3);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(boolean z, int i) {
        if (!this.phc && this.iqz.get()) {
            if (z) {
                zmn(i, false);
                this.phc = false;
            } else {
                am();
            }
        }
        btk();
        com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar = this.zak;
        if (hhwVar != null) {
            hhwVar.fb();
        }
    }

    public final void zmn(int i, boolean z) {
        if (z || this.ev) {
            if (z) {
                this.ev = false;
            }
            if (this.phc || !this.iqz.get()) {
                return;
            }
            cn.zmn zmnVar = new cn.zmn();
            zmnVar.fs(hhw());
            zmnVar.fb(bvs());
            zmnVar.zn(nps());
            zmnVar.zn(i);
            zmnVar.fb(zg());
            com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.nps, zmnVar, this.kra);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void btk() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar != null) {
            znVar.klz();
            this.hhw = null;
        }
        if (this.yof) {
            if (!"embeded_ad".equals(this.oub)) {
                this.nps.zmn2(this.zg, (WeakReference<Context>) null, true);
            } else {
                this.nps.iqz();
            }
            this.zn.removeCallbacksAndMessages(null);
            this.klz.clear();
            if (this.cn) {
                fkt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1 > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void vlj() {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar;
        int i;
        int i2;
        try {
            if (yof() != null && (znVar = this.hhw) != null && this.bjh != null) {
                int fb = znVar.fb();
                int btk = this.hhw.btk();
                final int width = this.bjh.getWidth();
                final int height = this.bjh.getHeight();
                if (width > 0 && height > 0 && btk > 0 && fb > 0) {
                    if (fb == btk) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (fb > btk) {
                        i2 = (int) ((width * 1.0d) / ((fb * 1.0f) / btk));
                        i = width;
                    } else {
                        i = (int) ((height * 1.0d) / ((btk * 1.0f) / fb));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    this.zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fs.zn.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (zn.this.yof() instanceof TextureView) {
                                    ((TextureView) zn.this.yof()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zmn;
                                } else if (zn.this.yof() instanceof SurfaceView) {
                                    ((SurfaceView) zn.this.yof()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zmn;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zn.this).zmn;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.rc);
            Objects.toString(yof());
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs yof() {
        btk btkVar;
        if (this.rc.getResources().getConfiguration().orientation != 1 || (btkVar = this.nps) == null) {
            return null;
        }
        return btkVar.mw();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view) {
        com.bytedance.sdk.openadsdk.core.cn.fb.zn znVar = this.hhw;
        if (znVar == null) {
            return;
        }
        if (znVar.hhw()) {
            fs();
            this.nps.fs(true, false);
            this.nps.hhw();
            return;
        }
        if (!this.hhw.nps()) {
            btk btkVar = this.nps;
            if (btkVar != null) {
                btkVar.zn(this.bjh);
            }
            btk(this.bvs);
            btk btkVar2 = this.nps;
            if (btkVar2 != null) {
                btkVar2.fs(false, false);
                return;
            }
            return;
        }
        nps(false);
        btk btkVar3 = this.nps;
        if (btkVar3 != null) {
            btkVar3.fs(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(long j, long j2) {
        com.bytedance.sdk.openadsdk.core.rt.fb zmn2;
        this.zg.fb(j);
        this.bvs = j;
        this.tf = j2;
        this.nps.zmn(j, j2);
        this.nps.zmn(com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(j, j2));
        try {
            zn.zmn zmnVar = this.kjb;
            if (zmnVar != null) {
                zmnVar.zmn(j, j2);
            }
        } catch (Throwable th) {
            iqz.zmn(this.zmn, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.model.fb exj = this.zg.exj();
        if (exj == null || (zmn2 = exj.zmn()) == null) {
            return;
        }
        zmn2.zmn(j, j2, this.zak);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.zmn.zmn
    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view, boolean z) {
        zn(!this.kw);
        if (this.rc instanceof Activity) {
            btk btkVar = this.nps;
            if (btkVar != null) {
                btkVar.fs(this.bjh);
                this.nps.zn(false);
            }
            zmn(1);
            WeakReference<zn.fs> weakReference = this.rp;
            zn.fs fsVar2 = weakReference != null ? weakReference.get() : null;
            if (fsVar2 != null) {
                fsVar2.zmn(this.kw);
            }
        }
    }

    private boolean zn(int i, int i2) {
        if (i2 == 0) {
            fs();
            this.olo = true;
            btk btkVar = this.nps;
            if (btkVar != null) {
                btkVar.zmn2(this.zg, (WeakReference<Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            btk btkVar2 = this.nps;
            if (btkVar2 != null) {
                btkVar2.zmn();
            }
            fs();
            this.olo = true;
            this.kgc = false;
            btk btkVar3 = this.nps;
            if (btkVar3 != null) {
                return btkVar3.zmn(i, this.zg.mrt(), this.vlj);
            }
        } else if (i2 == 4) {
            this.olo = false;
            btk btkVar4 = this.nps;
            if (btkVar4 != null) {
                btkVar4.cn();
            }
        }
        return true;
    }

    private void btk(int i) {
        if (this.ve == i) {
            return;
        }
        this.ve = i;
        if (i != 4 && i != 0) {
            this.kgc = false;
        }
        if (!this.kgc && !mw() && this.jy) {
            zn(2, i);
        }
        WeakReference<zmn> weakReference = this.cud;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.cud.get().zmn(this.ve);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hhw(int i) {
        btk(i);
        if (i == 4) {
            this.olo = false;
        }
    }

    public void zn(int i) {
        btk(i);
        if (i == 4) {
            this.olo = false;
            zn();
        }
    }

    public void cyb() {
        if (this.cd || !this.doe) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.kgc.zmn().getApplicationContext();
        this.cd = true;
        rp.zmn(this.xrr, applicationContext);
    }

    public void fkt() {
        if (this.cd && this.doe) {
            this.cd = false;
            rp.zmn(this.xrr);
        }
    }

    public void zmn(zmn zmnVar) {
        this.cud = new WeakReference<>(zmnVar);
    }

    public void hgd() {
        com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar = this.zak;
        if (hhwVar != null) {
            hhwVar.zmn(13);
        }
    }

    public void nu() {
        if (this.hhw != null) {
            fs(false);
            yj();
            this.iqz.set(false);
            this.phc = false;
            zmn(this.kra);
            this.hhw.bvs();
        }
    }

    public void fb(int i) {
        this.mhu = i;
    }

    public int ww() {
        return this.mhu;
    }
}
