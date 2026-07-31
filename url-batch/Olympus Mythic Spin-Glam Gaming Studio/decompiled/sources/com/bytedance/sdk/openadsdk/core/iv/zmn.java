package com.bytedance.sdk.openadsdk.core.iv;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.cn.fs.hhw;
import com.bytedance.sdk.openadsdk.core.yj;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes13.dex */
public abstract class zmn extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    protected TTDislikeDialogAbstract btk;
    protected boolean bvs;
    protected com.bytedance.sdk.openadsdk.zn.zn fb;
    protected Context fs;
    protected String hhw;
    protected boolean iv;
    protected int nps;
    protected String rc;
    protected int zg;
    private com.bytedance.sdk.openadsdk.fb.nps zmn;
    protected com.bytedance.sdk.openadsdk.core.model.nqi zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    protected abstract void zmn(View view, int i, com.bytedance.sdk.openadsdk.core.model.cyb cybVar);

    public zmn(@NonNull Context context) {
        super(context);
        this.hhw = "embeded_ad";
        this.bvs = true;
        this.iv = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(yj yjVar) {
        if (yjVar instanceof com.bytedance.sdk.openadsdk.zn.zn) {
            this.fb = (com.bytedance.sdk.openadsdk.zn.zn) yjVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
        if (tTDislikeDialogAbstract != null && (nqiVar = this.zn) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(nqiVar.ze(), this.zn.pa());
        }
        this.btk = tTDislikeDialogAbstract;
    }

    public void zmn() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.btk;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.zn.zn znVar = this.fb;
        if (znVar != null) {
            znVar.zmn();
        } else {
            TTDelegateActivity.zmn(this.zn, (String) null);
        }
    }

    protected String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.zn;
        if (nqiVar == null) {
            return "";
        }
        if (nqiVar.pw() == null || TextUtils.isEmpty(this.zn.pw().fs())) {
            return !TextUtils.isEmpty(this.zn.dey()) ? this.zn.dey() : "";
        }
        return this.zn.pw().fs();
    }

    protected String getTitle() {
        if (this.zn.pw() != null && !TextUtils.isEmpty(this.zn.pw().fs())) {
            return this.zn.pw().fs();
        }
        if (!TextUtils.isEmpty(this.zn.dey())) {
            return this.zn.dey();
        }
        if (!TextUtils.isEmpty(this.zn.db())) {
            return this.zn.db();
        }
        return "";
    }

    protected String getDescription() {
        if (!TextUtils.isEmpty(this.zn.db())) {
            return this.zn.db();
        }
        if (!TextUtils.isEmpty(this.zn.pf())) {
            return this.zn.pf();
        }
        return "";
    }

    public float getRealWidth() {
        return jy.zn(this.fs, this.nps);
    }

    public float getRealHeight() {
        return jy.zn(this.fs, this.zg);
    }

    protected void zmn(View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.zn.fs fsVar;
        if (view == null) {
            return;
        }
        if (z) {
            Context context = this.fs;
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.zn;
            String str = this.hhw;
            fsVar = new com.bytedance.sdk.openadsdk.core.zn.zmn(context, nqiVar, str, oub.zmn(str));
        } else {
            Context context2 = this.fs;
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = this.zn;
            String str2 = this.hhw;
            fsVar = new com.bytedance.sdk.openadsdk.core.zn.fs(context2, nqiVar2, str2, oub.zmn(str2));
        }
        view.setOnTouchListener(fsVar);
        view.setOnClickListener(fsVar);
        fsVar.zmn(new fs() { // from class: com.bytedance.sdk.openadsdk.core.iv.zmn.1
            @Override // com.bytedance.sdk.openadsdk.core.iv.fs
            public void zmn(View view2, int i, com.bytedance.sdk.openadsdk.core.model.cyb cybVar) {
                zmn.this.zmn(view2, i, cybVar);
            }
        });
    }

    protected com.bytedance.sdk.openadsdk.core.cn.fs.hhw getVideoView() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar;
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.zn;
        if (nqiVar != null && this.fs != null) {
            if (com.bytedance.sdk.openadsdk.core.model.nqi.btk(nqiVar)) {
                try {
                    hhwVar = new com.bytedance.sdk.openadsdk.core.cn.fs.hhw(this.fs, this.zn, this.hhw, true, false, this.zmn);
                    hhwVar.setVideoCacheUrl(this.rc);
                    hhwVar.setControllerStatusCallBack(new hhw.fs() { // from class: com.bytedance.sdk.openadsdk.core.iv.zmn.2
                        @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw.fs
                        public void zmn(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    hhwVar.setIsAutoPlay(this.bvs);
                    hhwVar.zmn(this.iv, "bannerGetVideoView");
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.nqi.btk(this.zn) && hhwVar != null && hhwVar.zmn(0L, true, false)) {
                    return hhwVar;
                }
            }
            hhwVar = null;
            if (!com.bytedance.sdk.openadsdk.core.model.nqi.btk(this.zn)) {
            }
        }
        return null;
    }

    protected void zmn(View view) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.zn;
        if (nqiVar == null || nqiVar.mrt() == null || view == null) {
            return;
        }
        zmn(view, this.zn.mpi() == 1 && this.bvs);
    }
}
