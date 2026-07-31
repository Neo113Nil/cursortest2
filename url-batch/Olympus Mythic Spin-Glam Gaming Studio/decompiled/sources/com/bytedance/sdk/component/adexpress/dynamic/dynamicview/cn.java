package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class cn extends hhw {
    com.bytedance.sdk.component.adexpress.dynamic.fb.zg fs;
    String zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public cn(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, String str) {
        super(context, dynamicRootView, zgVar);
        this.zmn = str;
        this.fs = zgVar;
        com.bytedance.sdk.component.adexpress.hhw.iv lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.hhw.iv getLottieView() {
        String str;
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar = this.mw;
        if (zgVar == null || zgVar.iv() == null || this.rc == null || TextUtils.isEmpty(this.zmn)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = this.mw.iv().btk();
        if (btk == null) {
            str = "";
        } else {
            str = btk.hwg();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.zmn + "static/lotties/" + str + ".json";
        com.bytedance.sdk.component.adexpress.hhw.iv ivVar = new com.bytedance.sdk.component.adexpress.hhw.iv(this.rc);
        ivVar.setImageLottieTosPath(str2);
        ivVar.zg();
        return ivVar;
    }
}
