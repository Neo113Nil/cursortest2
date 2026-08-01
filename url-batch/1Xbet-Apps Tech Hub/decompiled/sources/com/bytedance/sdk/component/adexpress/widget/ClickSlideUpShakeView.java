package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.vG.pvs;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ClickSlideUpShakeView extends SlideUpView {
    private ShakeClickView pvs;

    public ClickSlideUpShakeView(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        pvs(context, i, i2, i3, jSONObject);
    }

    private void pvs(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        ShakeClickView shakeClickView = new ShakeClickView(context, pvs.vG(context), i, i2, i3, jSONObject);
        this.pvs = shakeClickView;
        addView(shakeClickView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.pvs.setLayoutParams(layoutParams);
    }

    public ShakeClickView getShakeView() {
        return this.pvs;
    }

    public void setShakeText(String str) {
        if (this.pvs == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.pvs.setShakeText("");
        } else {
            this.pvs.setShakeText(str);
        }
    }
}
