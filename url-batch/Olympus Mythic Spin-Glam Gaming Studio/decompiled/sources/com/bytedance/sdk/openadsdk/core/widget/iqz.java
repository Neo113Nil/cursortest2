package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public class iqz {
    private fs btk;
    private com.bytedance.sdk.openadsdk.core.cn.fs.zmn fb;
    private TextView fs;
    private boolean hhw = false;
    private com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs nps;
    private ViewGroup zg;
    private View zmn;
    private Context zn;

    public interface fs {
        boolean iv();

        void rc();
    }

    public enum zmn {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    public void zmn(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.zg = viewGroup;
        this.zn = com.bytedance.sdk.openadsdk.core.kgc.zmn().getApplicationContext();
    }

    private void zmn(Context context, View view, boolean z) {
        ViewGroup.LayoutParams zmn2;
        if (context == null || view == null || this.zmn != null || (zmn2 = zmn(this.zg)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cn.btk btkVar = new com.bytedance.sdk.openadsdk.cn.btk(context);
        this.zmn = btkVar;
        btkVar.setLayoutParams(zmn2);
        this.zg.addView(this.zmn);
        this.fs = (TextView) this.zmn.findViewById(com.bytedance.sdk.openadsdk.utils.olo.ir);
        View findViewById = this.zmn.findViewById(com.bytedance.sdk.openadsdk.utils.olo.bn);
        if (z) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.iqz.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/iqz$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_iqz$1_onClick_d3a829ad42f694de7a179de089222653(view2);
                }

                public void safedk_iqz$1_onClick_d3a829ad42f694de7a179de089222653(View p0) {
                    iqz.this.zn();
                    if (iqz.this.fb != null) {
                        iqz.this.fb.zmn(zmn.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            findViewById.setOnClickListener(null);
            findViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams zmn(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fs.zmn zmnVar, fs fsVar) {
        this.btk = fsVar;
        this.fb = zmnVar;
    }

    private void fs() {
        this.nps = null;
    }

    public boolean zmn(int i, com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar, boolean z) {
        Context context = this.zn;
        if (context == null || fsVar == null) {
            return true;
        }
        zmn(context, this.zg, z);
        this.nps = fsVar;
        if (i == 1 || i == 2) {
            return zmn(i);
        }
        return true;
    }

    private boolean zmn(int i) {
        fs fsVar;
        if (zmn() || this.hhw) {
            return true;
        }
        if (this.fb != null && (fsVar = this.btk) != null) {
            if (fsVar.iv()) {
                this.fb.btk(null, null);
            }
            this.fb.zmn(zmn.PAUSE_VIDEO, (String) null);
        }
        zmn(this.nps, true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn() {
        if (this.zn == null) {
            return;
        }
        fb();
    }

    public void zmn(boolean z) {
        if (z) {
            fs();
        }
        fb();
    }

    public boolean zmn() {
        View view = this.zmn;
        return view != null && view.getVisibility() == 0;
    }

    private void fb() {
        View view = this.zmn;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar, boolean z) {
        View view;
        String str;
        View view2;
        if (fsVar == null || (view = this.zmn) == null || this.zn == null || view.getVisibility() == 0) {
            return;
        }
        fs fsVar2 = this.btk;
        if (fsVar2 != null) {
            fsVar2.rc();
        }
        double ceil = Math.ceil((fsVar.btk() * 1.0d) / 1048576.0d);
        if (z) {
            str = String.format(doe.zmn(this.zn, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = doe.zmn(this.zn, "tt_video_without_wifi_tips") + doe.zmn(this.zn, "tt_video_bytesize");
        }
        jy.zmn(this.zmn, 0);
        jy.zmn(this.fs, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!jy.fb(this.zmn) || (view2 = this.zmn) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
