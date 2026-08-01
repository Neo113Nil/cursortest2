package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes.dex */
public class DynamicStarView extends DynamicBaseWidgetImp {
    private int pvs;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.pvs = 0;
        this.bNS = new TTRatingBar2(context, null);
        this.bNS.setTag(Integer.valueOf(getClickArea()));
        addView(this.bNS, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        int pvs = (int) ((yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.NB()) * 5.0f) + yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.vG() + yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.kj.Jd())));
        if (this.yiw > pvs && 4 == this.kj.so()) {
            this.pvs = (this.yiw - pvs) / 2;
        }
        this.yiw = pvs;
        return new FrameLayout.LayoutParams(this.yiw, this.so);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void sUS() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.yiw, this.so);
        layoutParams.topMargin = this.Wyp;
        layoutParams.leftMargin = this.Mxy + this.pvs;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        double Ju = this.kj.Ju();
        if (com.bytedance.sdk.component.adexpress.Jd.icD() && (Ju < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Ju > 5.0d || (this.IP != null && this.IP.getRenderRequest() != null && this.IP.getRenderRequest().Wyp() != 4))) {
            this.bNS.setVisibility(8);
            return true;
        }
        double d = (Ju < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Ju > 5.0d) ? 5.0d : Ju;
        this.bNS.setVisibility(0);
        ((TTRatingBar2) this.bNS).pvs(d, this.kj.yiw(), (int) this.kj.NB(), ((int) yiw.pvs(this.qh, this.kj.icD())) + ((int) yiw.pvs(this.qh, this.kj.pvs())) + ((int) yiw.pvs(this.qh, this.kj.NB())));
        return true;
    }
}
