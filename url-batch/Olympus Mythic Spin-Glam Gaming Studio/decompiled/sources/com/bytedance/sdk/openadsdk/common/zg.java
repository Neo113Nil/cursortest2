package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class zg extends Button {
    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zg(Context context) {
        super(context);
        zmn();
    }

    private void zmn() {
        setId(com.bytedance.sdk.openadsdk.utils.olo.ouf);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, jy.fs(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_browser_download_selector"));
        setText(com.bytedance.sdk.component.utils.doe.zmn(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
