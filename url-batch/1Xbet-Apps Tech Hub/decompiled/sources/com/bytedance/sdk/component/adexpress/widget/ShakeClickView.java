package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ShakeClickView extends ShakeAnimationView {
    private TextView pvs;

    public ShakeClickView(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView
    protected void pvs(Context context, View view) {
        addView(view);
        this.pvs = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView
    public void setShakeText(String str) {
        if (this.pvs == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.pvs.setText(uc.icD(this.pvs.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e) {
                Ju.pvs("shakeClickView", e.getMessage());
                return;
            }
        }
        this.pvs.setText(str);
    }
}
