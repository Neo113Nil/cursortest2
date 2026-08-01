package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.qh;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.bNS = new TextView(context);
        this.bNS.setTag(Integer.valueOf(getClickArea()));
        addView(this.bNS, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        this.bNS.setTextAlignment(this.kj.so());
        ((TextView) this.bNS).setTextColor(this.kj.yiw());
        ((TextView) this.bNS).setTextSize(this.kj.NB());
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            ((TextView) this.bNS).setIncludeFontPadding(false);
            ((TextView) this.bNS).setTextSize(Math.min(((yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.so) - this.kj.icD()) - this.kj.pvs()) - 0.5f, this.kj.NB()));
            ((TextView) this.bNS).setText(uc.pvs(getContext(), "tt_logo_en"));
            return true;
        }
        if (pvs()) {
            if (qh.icD()) {
                ((TextView) this.bNS).setText(qh.pvs());
                return true;
            }
            ((TextView) this.bNS).setText(qh.pvs(this.kj.icD));
            return true;
        }
        ((TextView) this.bNS).setText(uc.icD(getContext(), "tt_logo_cn"));
        return true;
    }

    private boolean pvs() {
        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.kj.icD) && this.kj.icD.contains("adx:")) || qh.icD();
    }
}
