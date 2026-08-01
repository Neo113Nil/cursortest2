package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;

/* loaded from: classes2.dex */
public abstract class BackupView extends PAGFrameLayout {
    protected com.bytedance.sdk.openadsdk.dislike.icD Jd;
    protected int Mxy;
    protected TTDislikeDialogAbstract NB;
    protected boolean Wyp;
    protected Context icD;
    protected String kj;
    private com.bytedance.sdk.openadsdk.icD.yiw pvs;
    protected boolean qh;
    protected String sUS;
    protected int so;
    protected cR vG;
    protected int yiw;

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    protected abstract void pvs(View view, int i, com.bytedance.sdk.openadsdk.core.model.IP ip);

    public BackupView(Context context) {
        super(context);
        this.sUS = "embeded_ad";
        this.Wyp = true;
        this.qh = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public BackupView(Context context, String str) {
        super(context);
        this.sUS = "embeded_ad";
        this.Wyp = true;
        this.qh = true;
        this.kj = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(ny nyVar) {
        if (nyVar instanceof com.bytedance.sdk.openadsdk.dislike.icD) {
            this.Jd = (com.bytedance.sdk.openadsdk.dislike.icD) nyVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        cR cRVar;
        if (tTDislikeDialogAbstract != null && (cRVar = this.vG) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(cRVar.HWd(), this.vG.Ayu());
        }
        this.NB = tTDislikeDialogAbstract;
    }

    public void pvs() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.NB;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.dislike.icD icd = this.Jd;
        if (icd != null) {
            icd.pvs();
        } else {
            TTDelegateActivity.pvs(this.vG, (String) null);
        }
    }

    protected String getNameOrSource() {
        cR cRVar = this.vG;
        if (cRVar == null) {
            return "";
        }
        if (cRVar.Ca() == null || TextUtils.isEmpty(this.vG.Ca().icD())) {
            return !TextUtils.isEmpty(this.vG.OhP()) ? this.vG.OhP() : "";
        }
        return this.vG.Ca().icD();
    }

    protected String getTitle() {
        if (this.vG.Ca() != null && !TextUtils.isEmpty(this.vG.Ca().icD())) {
            return this.vG.Ca().icD();
        }
        if (TextUtils.isEmpty(this.vG.OhP())) {
            return !TextUtils.isEmpty(this.vG.qd()) ? this.vG.qd() : "";
        }
        return this.vG.OhP();
    }

    protected String getDescription() {
        if (TextUtils.isEmpty(this.vG.qd())) {
            return !TextUtils.isEmpty(this.vG.rW()) ? this.vG.rW() : "";
        }
        return this.vG.qd();
    }

    public float getRealWidth() {
        return Pj.vG(this.icD, this.yiw);
    }

    public float getRealHeight() {
        return Pj.vG(this.icD, this.so);
    }

    protected void pvs(View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.icD.icD icd;
        if (view == null) {
            return;
        }
        if (z) {
            Context context = this.icD;
            cR cRVar = this.vG;
            String str = this.sUS;
            icd = new com.bytedance.sdk.openadsdk.core.icD.pvs(context, cRVar, str, jlb.pvs(str));
        } else {
            Context context2 = this.icD;
            cR cRVar2 = this.vG;
            String str2 = this.sUS;
            icd = new com.bytedance.sdk.openadsdk.core.icD.icD(context2, cRVar2, str2, jlb.pvs(str2));
        }
        view.setOnTouchListener(icd);
        view.setOnClickListener(icd);
        icd.pvs(new pvs() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.pvs
            public void pvs(View view2, int i, com.bytedance.sdk.openadsdk.core.model.IP ip) {
                BackupView.this.pvs(view2, i, ip);
            }
        });
    }

    protected NativeVideoTsView getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        cR cRVar = this.vG;
        if (cRVar != null && this.icD != null) {
            if (cR.NB(cRVar)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.icD, this.vG, this.sUS, true, false, this.pvs);
                    nativeVideoTsView.setVideoCacheUrl(this.kj);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.icD() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.icD
                        public void pvs(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.Wyp);
                    nativeVideoTsView.setIsQuiet(this.qh);
                } catch (Throwable unused) {
                }
                if (!cR.NB(this.vG) && nativeVideoTsView != null && nativeVideoTsView.pvs(0L, true, false)) {
                    return nativeVideoTsView;
                }
            }
            nativeVideoTsView = null;
            if (!cR.NB(this.vG)) {
            }
        }
        return null;
    }

    protected void pvs(int i) {
        this.qh = com.bytedance.sdk.openadsdk.core.mnm.Jd().vG(String.valueOf(this.Mxy));
        int icD = com.bytedance.sdk.openadsdk.core.mnm.Jd().icD(i);
        if (3 == icD) {
            this.Wyp = false;
            return;
        }
        int vG = com.bytedance.sdk.component.utils.mnm.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs());
        if (1 != icD || !jlb.Jd(vG)) {
            if (2 == icD) {
                if (jlb.NB(vG) || jlb.Jd(vG) || jlb.sUS(vG)) {
                    this.Wyp = true;
                    return;
                }
                return;
            }
            if (5 != icD) {
                return;
            }
            if (!jlb.Jd(vG) && !jlb.sUS(vG)) {
                return;
            }
        }
        this.Wyp = true;
    }

    protected void pvs(View view) {
        cR cRVar = this.vG;
        if (cRVar == null || cRVar.od() == null || view == null) {
            return;
        }
        pvs(view, this.vG.ZhG() == 1 && this.Wyp);
    }
}
