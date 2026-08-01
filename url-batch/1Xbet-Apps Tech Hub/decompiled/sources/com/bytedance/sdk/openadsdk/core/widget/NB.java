package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.layout.TTVideoTrafficTipsLayout;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* compiled from: VideoTrafficTipLayout.java */
/* loaded from: classes2.dex */
public class NB {
    private com.bytedance.sdk.openadsdk.core.video.nativevideo.pvs Jd;
    private icD NB;
    private TextView icD;
    private View pvs;
    private boolean sUS = false;
    private ViewGroup so;
    private Context vG;
    private com.bykv.vk.openvk.component.video.api.vG.icD yiw;

    /* compiled from: VideoTrafficTipLayout.java */
    public interface icD {
        boolean Wyp();

        void qh();
    }

    /* compiled from: VideoTrafficTipLayout.java */
    public enum pvs {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    public void pvs(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.so = viewGroup;
        this.vG = mnm.pvs().getApplicationContext();
    }

    private void pvs(Context context, View view, boolean z) {
        ViewGroup.LayoutParams pvs2;
        if (context == null || view == null || this.pvs != null || (pvs2 = pvs(this.so)) == null) {
            return;
        }
        TTVideoTrafficTipsLayout tTVideoTrafficTipsLayout = new TTVideoTrafficTipsLayout(context);
        this.pvs = tTVideoTrafficTipsLayout;
        tTVideoTrafficTipsLayout.setLayoutParams(pvs2);
        this.so.addView(this.pvs);
        this.icD = (TextView) this.pvs.findViewById(kj.RgU);
        View findViewById = this.pvs.findViewById(kj.VXe);
        if (z) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.NB.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    NB.this.vG();
                    if (NB.this.Jd != null) {
                        NB.this.Jd.pvs(pvs.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            findViewById.setOnClickListener(null);
            findViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams pvs(ViewGroup viewGroup) {
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

    public void pvs(com.bytedance.sdk.openadsdk.core.video.nativevideo.pvs pvsVar, icD icd) {
        this.NB = icd;
        this.Jd = pvsVar;
    }

    private void icD() {
        this.yiw = null;
    }

    public boolean pvs(int i, com.bykv.vk.openvk.component.video.api.vG.icD icd, boolean z) {
        Context context = this.vG;
        if (context == null || icd == null) {
            return true;
        }
        pvs(context, this.so, z);
        this.yiw = icd;
        if (i == 1 || i == 2) {
            return pvs(i);
        }
        return true;
    }

    private boolean pvs(int i) {
        icD icd;
        if (pvs() || this.sUS) {
            return true;
        }
        if (this.Jd != null && (icd = this.NB) != null) {
            if (icd.Wyp()) {
                this.Jd.NB(null, null);
            }
            this.Jd.pvs(pvs.PAUSE_VIDEO, (String) null);
        }
        pvs(this.yiw, true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG() {
        if (this.vG == null) {
            return;
        }
        Jd();
    }

    public void pvs(boolean z) {
        if (z) {
            icD();
        }
        Jd();
    }

    public boolean pvs() {
        View view = this.pvs;
        return view != null && view.getVisibility() == 0;
    }

    private void Jd() {
        View view = this.pvs;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void pvs(com.bykv.vk.openvk.component.video.api.vG.icD icd, boolean z) {
        View view;
        String str;
        View view2;
        if (icd == null || (view = this.pvs) == null || this.vG == null || view.getVisibility() == 0) {
            return;
        }
        icD icd2 = this.NB;
        if (icd2 != null) {
            icd2.qh();
        }
        double ceil = Math.ceil((icd.NB() * 1.0d) / 1048576.0d);
        if (z) {
            str = String.format(uc.pvs(this.vG, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = uc.pvs(this.vG, "tt_video_without_wifi_tips") + uc.pvs(this.vG, "tt_video_bytesize");
        }
        Pj.pvs(this.pvs, 0);
        Pj.pvs(this.icD, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!Pj.Jd(this.pvs) || (view2 = this.pvs) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
