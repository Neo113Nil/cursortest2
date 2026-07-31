package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zak;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class zmn {

    public interface fs {
        void zmn();

        void zmn(boolean z, int i);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.common.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0146zmn {
        void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, View view);
    }

    public static void zmn(final rt rtVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.rc rcVar;
        final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn = rtVar.zmn();
        if (zmn == null || (rcVar = zmn.fkt) == null) {
            return;
        }
        final View iv = rcVar.iv();
        View rc = zmn.fkt.rc();
        final String fs2 = rtVar.fs();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zmn.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zmn$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_zmn$1_onClick_ed6cec578b681affd083334ac0514f04(view);
            }

            public void safedk_zmn$1_onClick_ed6cec578b681affd083334ac0514f04(View p0) {
                zmn.fs(zmn, iv, fs2, rtVar);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zmn.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zmn$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_zmn$2_onClick_d9d5fe8ce144b4b3418c61d8c39184e5(view);
            }

            public void safedk_zmn$2_onClick_d9d5fe8ce144b4b3418c61d8c39184e5(View p0) {
                zmn.fs(zmn, iv, fs2, rtVar);
                com.bytedance.sdk.openadsdk.component.fb.fs.zmn("force_button_tracker", "click", zmn.fs);
            }
        };
        if (iv != null) {
            iv.setOnClickListener(onClickListener);
            iv.setTag(iv.getId(), onClickListener);
        }
        if (rc != null) {
            rc.setOnClickListener(onClickListener2);
            rc.setTag(rc.getId(), onClickListener2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, View view, String str, rt rtVar) {
        if (fsVar == null || view == null || rtVar == null || zmn(fsVar, view)) {
            return;
        }
        fsVar.yj.phc();
        fsVar.so.rc();
        fsVar.rp.hhw();
        cyb hhw = rtVar.hhw();
        if (hhw != null && am.fb(fsVar.fs)) {
            boolean fs2 = fs(hhw, fsVar, true, str);
            if (!(fsVar.tdm instanceof com.bytedance.sdk.openadsdk.activity.single.btk) || fs2) {
                return;
            }
            rtVar.zn().run();
            return;
        }
        rtVar.zn().run();
    }

    public static void fs(rt rtVar) {
        zmn(rtVar);
        rtVar.zmn().ev.zmn(zn(rtVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fs(cyb cybVar, com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, boolean z, String str) {
        if (cybVar == null) {
            return false;
        }
        if (!cybVar.zmn(am.zn(fsVar.fs), z, null) && (fsVar.tdm instanceof com.bytedance.sdk.openadsdk.activity.single.btk)) {
            return ((com.bytedance.sdk.openadsdk.activity.single.btk) fsVar.tdm).zg();
        }
        return true;
    }

    private static com.bytedance.sdk.openadsdk.component.reward.top.fs zn(final rt rtVar) {
        final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn = rtVar.zmn();
        final String fs2 = rtVar.fs();
        final fs fb = rtVar.fb();
        final cyb hhw = rtVar.hhw();
        final boolean btk = rtVar.btk();
        return new com.bytedance.sdk.openadsdk.component.reward.top.fs() { // from class: com.bytedance.sdk.openadsdk.common.zmn.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view) {
                if (zmn.fs(hhw, zmn, false, fs2)) {
                    return;
                }
                if (btk && zmn.fs(zmn, fs2, fb)) {
                    return;
                }
                zmn.zmn(zmn);
                zmn.zmn(zmn, fb);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view, String str) {
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = zmn;
                if (fsVar == null) {
                    return;
                }
                zmn.zmn(fsVar, fsVar.f3739io, str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fs(View view) {
                com.bytedance.sdk.openadsdk.component.reward.zmn.fb fbVar;
                com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar;
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = zmn;
                if (fsVar2 == null || (fbVar = fsVar2.zak) == null || (fsVar = fsVar2.f3739io) == null) {
                    return;
                }
                fbVar.zmn(fsVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zn(View view) {
                com.bytedance.sdk.openadsdk.component.reward.view.rc rcVar;
                View iv;
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = zmn;
                if (fsVar == null || (rcVar = fsVar.fkt) == null || (iv = rcVar.iv()) == null) {
                    return;
                }
                iv.performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fb(View view) {
                if (rtVar.zmn() == null || rtVar.nps() == null) {
                    return;
                }
                rtVar.nps().zmn(rtVar.zmn(), view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fs(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, String str, fs fsVar2) {
        if (fsVar.tdm instanceof com.bytedance.sdk.openadsdk.activity.single.btk) {
            fsVar2.zmn();
            return true;
        }
        boolean zg = am.zg(fsVar.fs);
        boolean hhw = am.hhw(fsVar.fs);
        boolean btk = am.btk(fsVar.fs);
        if (!hhw && (!btk || !fsVar.nqi.fb(com.bytedance.sdk.openadsdk.component.reward.zmn.bvs.fs))) {
            if (com.bytedance.sdk.openadsdk.core.model.iqz.zmn(fsVar.fs) && !fsVar.mw.get()) {
                fsVar2.zmn();
                return true;
            }
            fsVar.ev.fb(false);
            return false;
        }
        if (zg) {
            fsVar.nqi.bvs();
        } else {
            View iv = fsVar.fkt.iv();
            if (iv != null) {
                iv.performClick();
            } else {
                fsVar2.zmn();
            }
        }
        return true;
    }

    private static boolean zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, View view) {
        if (!fsVar.yj.iqz() || (!fsVar.rje && !fsVar.bvs.get())) {
            return false;
        }
        boolean mw = fsVar.so.mw();
        fsVar.yj.hhw(mw);
        fsVar.fkt.hhw(8);
        if (view instanceof com.bytedance.sdk.openadsdk.core.hhw.fb) {
            ((com.bytedance.sdk.openadsdk.core.hhw.fb) view).setImageResource(com.bytedance.sdk.component.utils.doe.fb(fsVar.oub, "tt_close_btn"));
        }
        fsVar.jy.sendEmptyMessageDelayed(600, 5000L);
        return !nqi.zn(fsVar.fs) || mw;
    }

    public static void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        if (fsVar == null) {
            return;
        }
        cn.zmn zmnVar = new cn.zmn();
        zmnVar.fs(fsVar.phc.mw());
        zmnVar.fb(fsVar.phc.rp());
        zmnVar.zn(fsVar.phc.olo());
        zmnVar.zn(3);
        zmnVar.fb(fsVar.phc.bjh());
        zmnVar.zmn(fsVar.phc.fs());
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(fsVar.phc.zg(), zmnVar, fsVar.phc.btk());
        zak.zn(fsVar.hhw);
        fsVar.phc.zmn("skip", false);
    }

    public static void fs(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        if (fsVar == null) {
            return;
        }
        nqi nqiVar = fsVar.fs;
        if (nqiVar != null && (exj = nqiVar.exj()) != null && (zmn = exj.zmn()) != null) {
            long mw = fsVar.phc.mw();
            zmn.hhw(mw);
            zmn.btk(mw);
        }
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(fsVar.fs, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r3.mw.get() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, fs fsVar2) {
        if (fsVar.zn) {
            if (com.bytedance.sdk.openadsdk.core.model.iqz.zn(fsVar.fs)) {
                com.bytedance.sdk.openadsdk.component.reward.view.zn zmn = fsVar.uqh.zmn();
                if (zmn == null || zmn.fb != 0) {
                    fsVar2.zmn(true, 4);
                }
            } else {
                fsVar2.zmn(true, 4);
                if (com.bytedance.sdk.openadsdk.core.model.iqz.zmn(fsVar.fs)) {
                }
            }
            fs(fsVar);
        }
        fsVar2.zmn();
        fs(fsVar);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar2, String str) {
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar;
        if (fsVar == null || fsVar.f3739io == null) {
            return;
        }
        fsVar.dgt = !fsVar.dgt;
        boolean z = fsVar.tdm instanceof com.bytedance.sdk.openadsdk.activity.single.btk;
        if (fsVar.rje && !z && (bvsVar = fsVar.uqh) != null && bvsVar.zmn() != null) {
            fsVar.uqh.zmn().setSoundMute(fsVar.dgt);
        }
        fsVar.phc.zmn(fsVar.dgt, str);
        fsVar.yj.btk(fsVar.dgt);
        fsVar.nqi.fs(fsVar.dgt);
        if (z) {
            return;
        }
        zn(fsVar);
    }

    private static void zn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        nqi nqiVar;
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        if (fsVar == null || (nqiVar = fsVar.fs) == null || (exj = nqiVar.exj()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rt.fb zmn = exj.zmn();
        long mw = fsVar.phc.mw();
        if (fsVar.dgt) {
            zmn.zg(mw);
        } else {
            zmn.bvs(mw);
        }
    }
}
