package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class hhw extends phc {
    private kw zmn;

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public hhw(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        zmn(context, i, i2, i3, jSONObject);
    }

    private void zmn(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        kw kwVar = new kw(context, com.bytedance.sdk.component.adexpress.zn.zmn.zn(context), i, i2, i3, jSONObject);
        this.zmn = kwVar;
        addView(kwVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.zmn.setLayoutParams(layoutParams);
    }

    public kw getShakeView() {
        return this.zmn;
    }

    public void setShakeText(String str) {
        if (this.zmn == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.zmn.setShakeText("");
        } else {
            this.zmn.setShakeText(str);
        }
    }
}
