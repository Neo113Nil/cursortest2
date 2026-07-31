package com.bytedance.sdk.openadsdk.core.cn.fb;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.utils.bvs;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.component.reward.view.zg;
import com.bytedance.sdk.openadsdk.core.cn.fb.zn;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.fb;
import com.bytedance.sdk.openadsdk.core.rt.hhw;
import com.bytedance.sdk.openadsdk.fb.nps;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.vlj;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class zmn extends com.bytedance.sdk.openadsdk.core.cn.zmn.zmn {
    private final AtomicBoolean cud;
    private final int dgt;
    private boolean gn;
    protected long hgd;
    private long jy;
    private InterfaceC0155zmn kra;
    protected boolean nu;
    private final nps oub;
    private final Runnable uqd;
    private long vlj;
    final zn.fs ww;
    private boolean yof;

    /* renamed from: com.bytedance.sdk.openadsdk.core.cn.fb.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0155zmn {
        void zmn(int i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.zmn.zmn
    public boolean bjh() {
        return true;
    }

    protected void cyb() {
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.cn.fb.zmn$1, reason: invalid class name */
    class AnonymousClass1 implements zn.fs {
        private boolean fs = true;

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i) {
        }

        AnonymousClass1() {
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            fb zmn;
            if (zmn.this.cud.compareAndSet(false, true)) {
                String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak.zmn(9);
                            } catch (Exception unused2) {
                            }
                        }
                        zmn.this.dgt();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.fb exj = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg.exj();
                if (exj != null && (zmn = exj.zmn()) != null) {
                    long hhw = zmn.this.hhw();
                    zmn.fb(hhw);
                    zmn.btk(hhw);
                }
                btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg, 5);
                com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg, 5);
                if (zmn.this.kra != null) {
                    zmn.this.kra.zmn(3);
                }
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, long j) {
            String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).uqh = false;
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.removeCallbacks(zmn.this.uqd);
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps != null) {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.fs();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).iqz.get()) {
                zmn zmnVar2 = zmn.this;
                zmnVar2.hgd = j;
                zmnVar2.zmn(zmnVar2.oub);
                zmn.this.tf();
            }
            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak != null) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak.zn();
            }
            btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg, 0);
            if (zmn.this.kra != null) {
                zmn.this.kra.zmn(1);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.removeCallbacks(zmn.this.uqd);
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps != null) {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.fs();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar2) {
            fb zmn;
            String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
            zmnVar2.zmn();
            zmnVar2.fs();
            zmnVar2.zn();
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.removeCallbacks(zmn.this.uqd);
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps != null) {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.fs();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).kjb != null) {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).kjb.fs(zmn.this.vlj, com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).bvs, ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).tf));
                    }
                }
            });
            zmn.this.zmn(zmnVar2);
            btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg, 6);
            com.bytedance.sdk.openadsdk.bjh.zmn.zn.fs(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg);
            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak != null) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak.zmn(14);
            }
            if (zmn.this.kra != null) {
                zmn.this.kra.zmn(4);
            }
            com.bytedance.sdk.openadsdk.core.model.fb exj = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg.exj();
            if (exj == null || (zmn = exj.zmn()) == null) {
                return;
            }
            zmn.zmn(com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, boolean z) {
            String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.removeCallbacks(zmn.this.uqd);
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps != null) {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.fs();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i, int i2) {
            String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
            bvs.zmn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).hhw == null) {
                        return;
                    }
                    try {
                        final float fb = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).hhw.fb();
                        final float btk = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).hhw.btk();
                        if (fb == 0.0f || btk == 0.0f) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (zmn.this.cud()) {
                                    if (!iqz.fs(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg) && ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nqi.hhw != 4) {
                                        if (!iqz.zn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg)) {
                                            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg.nlz() != 3) {
                                                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg.nlz() == 0) {
                                                    zmn.this.zn(fb, btk);
                                                    return;
                                                } else {
                                                    zmn.this.fs(fb, btk);
                                                    return;
                                                }
                                            }
                                            zmn.this.zmn(true, fb, btk);
                                            return;
                                        }
                                        zmn.this.zmn(true, fb, btk);
                                        return;
                                    }
                                    zmn.this.zmn(true, fb, btk);
                                    return;
                                }
                                zmn.this.zmn(fb, btk);
                            }
                        });
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.iqz.zn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn, th.getMessage());
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i, int i2, int i3) {
            String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).uqh = true;
            zmn.this.yof();
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps != null) {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.olo();
                    }
                }
            });
            btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg, 3);
            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak != null) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak.zmn(4);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i) {
            String unused = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn;
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).uqh = false;
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.removeCallbacks(zmn.this.uqd);
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps != null) {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.fs();
                    }
                }
            });
            btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg, 0);
            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak != null) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak.zmn(5);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(final com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, long j, long j2) {
            fb zmn;
            if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).bvs) < 50) {
                return;
            }
            zmn zmnVar2 = zmn.this;
            zmnVar2.zmn(zmnVar2.oub);
            zmn.this.zmn(j, j2);
            zmn.this.fs(j, j2);
            com.bytedance.sdk.openadsdk.core.model.fb exj = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg.exj();
            if (exj != null && (zmn = exj.zmn()) != null) {
                zmn.zmn(j, j2, ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak);
            }
            if (!this.fs || j2 - j >= 500) {
                return;
            }
            this.fs = false;
            ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zn.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.1.9
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.zmn(zmnVar);
                }
            }, 1000L);
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void fb(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            fb zmn;
            com.bytedance.sdk.openadsdk.core.model.fb exj = ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg.exj();
            if (exj != null && (zmn = exj.zmn()) != null) {
                zmn.fs(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).bvs);
            }
            btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg, 3);
            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak != null) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak.zmn(0);
            }
            if (zmn.this.kra != null) {
                zmn.this.kra.zmn(2);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void btk(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            btk.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zg, 0);
            if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak != null) {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zak.zmn(1);
            }
            if (zmn.this.kra != null) {
                zmn.this.kra.zmn(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.cn.fb.zn.fs
        public void zmn(int i, int i2) {
            zmn.this.jy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jy() {
        fs(this.oub);
        this.nqi.btk = this.hhw.phc();
        yj();
        this.iqz.set(false);
        this.cud.set(false);
        zmn(this.oub);
    }

    public void fkt() {
        this.ww.zmn((com.bykv.vk.openvk.zmn.zmn.zmn.zmn) null, 0, 0);
    }

    protected void zmn(boolean z, float f, float f2) {
        try {
            Objects.toString(this.zg.utx());
            if (!gn() || z) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                layoutParams.addRule(13);
                if (nu() != null) {
                    if (nu() instanceof TextureView) {
                        ((TextureView) nu()).setLayoutParams(layoutParams);
                    } else if (nu() instanceof SurfaceView) {
                        ((SurfaceView) nu()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.bjh.getLayoutParams();
                    if (this.bjh.getHeight() > 0) {
                        float min = Math.min(this.bjh.getWidth() / f, this.bjh.getHeight() / f2);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f * min);
                            layoutParams.height = (int) (f2 * min);
                            if (nu() instanceof TextureView) {
                                ((TextureView) nu()).setLayoutParams(layoutParams);
                            } else if (nu() instanceof SurfaceView) {
                                ((SurfaceView) nu()).setLayoutParams(layoutParams);
                            }
                            if (this.nqi.hhw == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.bjh.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn(this.zmn, "changeSize error", th);
        }
    }

    public zmn(Context context, ViewGroup viewGroup, nqi nqiVar, nps npsVar) {
        super(context, nqiVar, viewGroup);
        this.jy = 0L;
        this.vlj = 0L;
        this.yof = false;
        this.hgd = 0L;
        this.nu = false;
        this.cud = new AtomicBoolean(false);
        this.ww = new AnonymousClass1();
        this.uqd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).kjb != null) {
                    zmn.this.cyb();
                    ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).kjb.zmn();
                }
            }
        };
        this.oub = npsVar;
        this.dgt = nqiVar.qvo();
        if (nqiVar.zt() && this.bjh != null) {
            if (this.zak == null) {
                this.zak = hhw.zmn();
            }
            this.zak.zmn(this.bjh, nqiVar);
        }
        com.bytedance.sdk.openadsdk.core.cn.fs.btk btkVar = new com.bytedance.sdk.openadsdk.core.cn.fs.btk(context.getApplicationContext(), new com.bytedance.sdk.openadsdk.cn.fb(context), true, 17, this.zg, this);
        this.nps = btkVar;
        btkVar.zmn(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.zmn.zmn, com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean zmn(@NonNull com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        int ab;
        super.zmn(znVar);
        if (this.hhw != null) {
            return false;
        }
        znVar.cyb();
        if (TextUtils.isEmpty(znVar.cyb())) {
            return false;
        }
        znVar.fs(com.bytedance.sdk.openadsdk.uqh.btk.zmn("player_force_raw_url", 0) == 1);
        fs(znVar);
        znVar.fb(1);
        this.nu = !znVar.cyb().startsWith("http");
        if (this.zak != null) {
            if (this.nqi.hhw == 1) {
                ab = this.zg.nkw();
            } else {
                ab = this.zg.ab();
            }
            if (this.bjh != null) {
                try {
                    int sft = this.zg.sft();
                    if (sft != 7 && sft != 8) {
                        if (sft == 3) {
                            Iterator<View> it = vlj.zmn(this.bjh, 2).iterator();
                            while (it.hasNext()) {
                                this.zak.zmn(it.next(), FriendlyObstructionPurpose.OTHER);
                            }
                        }
                    }
                    View zmn = vlj.zmn(this.bjh, (Class<? extends View>) zg.class);
                    if (zmn != null) {
                        View findViewById = zmn.findViewById(olo.rt);
                        View findViewById2 = zmn.findViewById(olo.dz);
                        View findViewById3 = zmn.findViewById(olo.ioo);
                        hhw hhwVar = this.zak;
                        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                        hhwVar.zmn(findViewById2, friendlyObstructionPurpose);
                        this.zak.zmn(findViewById, friendlyObstructionPurpose);
                        this.zak.zmn(findViewById3, friendlyObstructionPurpose);
                        if (this.gn) {
                            View zmn2 = vlj.zmn(this.bjh, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.mw.fs.hhw.zmn.class);
                            if (zmn2 instanceof com.bytedance.sdk.openadsdk.core.mw.fs.hhw.zmn) {
                                this.zak.zmn(((com.bytedance.sdk.openadsdk.core.mw.fs.hhw.zmn) zmn2).getMarkView(), friendlyObstructionPurpose);
                            }
                        }
                    }
                    Iterator<View> it2 = vlj.zmn(this.bjh, 1).iterator();
                    while (it2.hasNext()) {
                        this.zak.zmn(it2.next(), FriendlyObstructionPurpose.OTHER);
                    }
                } catch (Throwable unused) {
                }
            }
            this.zak.zmn(ab > 0, ab / 1000.0f);
        }
        yj();
        if (znVar.iv() > 0) {
            long iv = znVar.iv();
            this.bvs = iv;
            this.iv = Math.max(this.iv, iv);
        }
        if (this.bvs == this.tf) {
            this.bvs = 0L;
        }
        com.bytedance.sdk.openadsdk.core.cn.fs.btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zmn();
            this.nps.nps();
            this.nps.zn(znVar.zg(), znVar.bvs());
            this.nps.zn(this.bjh);
        }
        zn znVar2 = new zn();
        this.hhw = znVar2;
        znVar2.zmn(this.ww);
        kgc();
        this.vlj = 0L;
        vlj();
        return true;
    }

    private void vlj() {
        this.hhw.zn(so());
        this.hhw.zmn(this.nqi);
        this.jy = System.currentTimeMillis();
        this.nps.zn(8);
        this.nps.zn(0);
        zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).hhw == null) {
                    return;
                }
                zmn.this.jy = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.fb(0);
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).hhw.zmn(true, ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).bvs, ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).cyb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yof() {
        int uqd;
        int i = this.nqi.hhw;
        if (i == 2 || i == 1) {
            uqd = kgc.fb().uqd() * 1000;
        } else {
            uqd = i == 4 ? kgc.fb().iv(String.valueOf(this.dgt)) : 5000;
        }
        this.zn.removeCallbacks(this.uqd);
        this.zn.postDelayed(this.uqd, uqd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dgt() {
        if (this.nps == null) {
            return;
        }
        this.zn.removeCallbacks(this.uqd);
        this.nps.fs();
        this.vlj = System.currentTimeMillis() - this.jy;
        if (!this.yof) {
            this.yof = true;
            long j = this.tf;
            fs(j, j);
            long j2 = this.tf;
            this.bvs = j2;
            this.iv = j2;
            fs(this.oub);
        }
        zn.zmn zmnVar = this.kjb;
        if (zmnVar != null) {
            zmnVar.zmn(this.vlj, com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(this.bvs, this.tf));
        }
        this.rt = true;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zn() {
        fb zmn;
        com.bytedance.sdk.openadsdk.core.cn.fs.btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.zmn();
            this.nps.cn();
            this.nps.kgc();
        }
        zn znVar = this.hhw;
        if (znVar != null) {
            if (znVar.nps()) {
                if (this.mw) {
                    if (iv.iqz()) {
                        this.hhw.fs(3);
                        zn znVar2 = this.hhw;
                        znVar2.zmn(false, znVar2.kgc(), this.cyb);
                    } else {
                        iqz();
                    }
                } else {
                    fs(this.fkt);
                }
            } else {
                this.hhw.zmn(false, this.bvs, this.cyb);
            }
        }
        if (this.yof || !this.iqz.get()) {
            return;
        }
        zak();
        com.bytedance.sdk.openadsdk.core.model.fb exj = this.zg.exj();
        if (exj == null || (zmn = exj.zmn()) == null) {
            return;
        }
        zmn.zn(hhw());
    }

    public void hgd() {
        fb zmn;
        if (this.yof || !this.iqz.get()) {
            return;
        }
        zak();
        com.bytedance.sdk.openadsdk.core.model.fb exj = this.zg.exj();
        if (exj == null || (zmn = exj.zmn()) == null) {
            return;
        }
        zmn.zn(hhw());
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void fb() {
        zn znVar = this.hhw;
        if (znVar == null) {
            return;
        }
        znVar.klz();
        this.hhw = null;
        com.bytedance.sdk.openadsdk.core.cn.fs.btk btkVar = this.nps;
        if (btkVar != null) {
            btkVar.bvs();
        }
        this.zn.removeCallbacks(this.uqd);
        this.zn.removeCallbacksAndMessages(null);
        hhw hhwVar = this.zak;
        if (hhwVar != null) {
            hhwVar.fb();
        }
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.zg, this.yj.get(), this.jy);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(boolean z, int i) {
        fb();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void btk() {
        fb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean cud() {
        return this.zg.fu() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(float f, float f2) {
        ViewGroup viewGroup;
        try {
            if (nu() != null && this.hhw != null && (viewGroup = this.bjh) != null) {
                float width = viewGroup.getWidth();
                float f3 = f / (width * 1.0f);
                float height = this.bjh.getHeight();
                if (f3 <= f2 / (1.0f * height)) {
                    width = f * (height / f2);
                } else {
                    height = f2 * (width / f);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (nu() instanceof TextureView) {
                    ((TextureView) nu()).setLayoutParams(layoutParams);
                } else if (nu() instanceof SurfaceView) {
                    ((SurfaceView) nu()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn(this.zmn, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private boolean gn() {
        return nu() == null || this.hhw == null || (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.zg.skn()) ? this.zg.ouf() != null : this.zg.rsi() != null) || this.zg.es() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(float f, float f2) {
        try {
            Objects.toString(this.zg.utx());
            if (gn()) {
                return;
            }
            int[] fs = jy.fs(kgc.zmn());
            boolean z = false;
            boolean z2 = this.zg.ol() == 1;
            float f3 = fs[0];
            float f4 = fs[1];
            if (z2) {
                if (f > f2) {
                    zmn(f3, f4, f, f2, true);
                    return;
                }
            } else if (f < f2) {
                zmn(f3, f4, f, f2, false);
                return;
            }
            float f5 = f / f2;
            float f6 = f3 / f4;
            if (z2) {
                if (f6 < 0.5625f && f5 == 0.5625f) {
                    f = (9.0f * f4) / 16.0f;
                    z = true;
                    f2 = f4;
                }
            } else if (f6 > 1.7777778f && f5 == 1.7777778f) {
                f2 = (9.0f * f3) / 16.0f;
                z = true;
                f = f3;
            }
            if (z) {
                f3 = f;
                f4 = f2;
            }
            int i = (int) f3;
            int i2 = (int) f4;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(13);
            if (nu() != null) {
                if (nu() instanceof TextureView) {
                    ((TextureView) nu()).setLayoutParams(layoutParams);
                } else if (nu() instanceof SurfaceView) {
                    ((SurfaceView) nu()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.bjh.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i2;
                    layoutParams2.width = i;
                    this.bjh.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn(this.zmn, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(float f, float f2) {
        try {
            if (nu() != null && this.hhw != null) {
                boolean z = this.zg.ol() == 1;
                int[] fs = jy.fs(kgc.zmn());
                zmn(fs[0], fs[1], f, f2, z);
            }
        } catch (Throwable unused) {
        }
    }

    private void zmn(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        if (f3 <= 0.0f || f4 <= 0.0f) {
            try {
                f3 = this.zg.mrt().zn();
                f4 = this.zg.mrt().fs();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f4 > 0.0f && f3 > 0.0f) {
            if (z) {
                if (f3 < f4) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
            } else if (f3 > f4) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
            }
            layoutParams.addRule(13);
            if (nu() != null) {
                if (nu() instanceof TextureView) {
                    ((TextureView) nu()).setLayoutParams(layoutParams);
                } else if (nu() instanceof SurfaceView) {
                    ((SurfaceView) nu()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.bjh.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.fb.fs.zmn(kgc.zmn()) || this.bjh.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.bjh.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zmn
    public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs fsVar, View view) {
        zn znVar = this.hhw;
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
            com.bytedance.sdk.openadsdk.core.cn.fs.btk btkVar = this.nps;
            if (btkVar != null) {
                btkVar.zn(this.bjh);
            }
            btk(this.bvs);
            com.bytedance.sdk.openadsdk.core.cn.fs.btk btkVar2 = this.nps;
            if (btkVar2 != null) {
                btkVar2.fs(false, false);
                return;
            }
            return;
        }
        zn();
        com.bytedance.sdk.openadsdk.core.cn.fs.btk btkVar3 = this.nps;
        if (btkVar3 != null) {
            btkVar3.fs(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(final long j, final long j2) {
        this.zg.fb(j);
        this.bvs = j;
        this.tf = j2;
        final int zmn = com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(j, j2);
        this.zn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.fb.zmn.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.zmn(j, j2);
                ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).nps.zmn(zmn);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).kjb != null) {
                        ((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).kjb.zmn(j, j2);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zmn(((com.bytedance.sdk.openadsdk.core.cn.zmn.zmn) zmn.this).zmn, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs nu() {
        com.bytedance.sdk.openadsdk.core.cn.fs.btk btkVar = this.nps;
        if (btkVar != null) {
            return btkVar.mw();
        }
        return null;
    }

    public void ww() {
        hhw hhwVar = this.zak;
        if (hhwVar != null) {
            hhwVar.zmn(2);
        }
    }

    public void oub() {
        hhw hhwVar = this.zak;
        if (hhwVar != null) {
            hhwVar.zmn(13);
        }
    }

    public void zmn(InterfaceC0155zmn interfaceC0155zmn) {
        this.kra = interfaceC0155zmn;
    }

    public void hhw(boolean z) {
        this.gn = z;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn() {
        if (this.hhw != null) {
            jy();
            this.hhw.bvs();
        }
    }
}
