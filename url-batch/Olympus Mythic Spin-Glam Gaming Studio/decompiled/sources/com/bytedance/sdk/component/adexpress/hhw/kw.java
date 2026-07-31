package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class kw extends kgc {
    private TextView zmn;

    @Override // com.bytedance.sdk.component.adexpress.hhw.kgc, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.kgc, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public kw(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.kgc
    protected void zmn(Context context, View view) {
        addView(view);
        this.zmn = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.kgc
    public void setShakeText(String str) {
        if (this.zmn == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.zmn.setText(com.bytedance.sdk.component.utils.doe.fs(this.zmn.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e) {
                e.getMessage();
                return;
            }
        }
        this.zmn.setText(str);
    }
}
