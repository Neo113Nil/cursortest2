package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.vG.sUS;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;

/* loaded from: classes.dex */
public class DynamicLottie extends DynamicBaseWidgetImp {
    so icD;
    String pvs;

    public DynamicLottie(Context context, DynamicRootView dynamicRootView, so soVar, String str) {
        super(context, dynamicRootView, soVar);
        this.pvs = str;
        this.icD = soVar;
        DynamicLottieView lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private DynamicLottieView getLottieView() {
        if (this.Ju == null || this.Ju.Wyp() == null || this.qh == null || TextUtils.isEmpty(this.pvs)) {
            return null;
        }
        sUS NB = this.Ju.Wyp().NB();
        String Zm = NB != null ? NB.Zm() : "";
        if (TextUtils.isEmpty(Zm)) {
            return null;
        }
        String str = this.pvs + "static/lotties/" + Zm + ".json";
        DynamicLottieView dynamicLottieView = new DynamicLottieView(this.qh);
        dynamicLottieView.setImageLottieTosPath(str);
        dynamicLottieView.sUS();
        return dynamicLottieView;
    }
}
