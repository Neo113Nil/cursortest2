package com.bytedance.sdk.openadsdk.rt;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class zmn extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    private zg fs;
    private Context zmn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zmn(@NonNull Context context) {
        super(context);
        this.zmn = context;
        zmn();
    }

    private void zmn() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setId(olo.tdm);
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        this.fs = new zg(this.zmn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.fs.setLayoutParams(layoutParams);
        this.fs.setTextColor(Color.argb(166, 0, 0, 0));
        this.fs.setTextSize(16.0f);
        this.fs.setMaxLines(3);
        this.fs.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.fs);
    }

    public void setPrivacyText(String str) {
        try {
            if (this.fs == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.fs.setText(Html.fromHtml(str, 63));
        } catch (Exception e) {
            e.getMessage();
            this.fs.setText("You agree to the Terms of Use and Privacy Policy.");
        }
    }
}
