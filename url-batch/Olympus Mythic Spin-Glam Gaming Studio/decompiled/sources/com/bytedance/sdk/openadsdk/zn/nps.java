package com.bytedance.sdk.openadsdk.zn;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class nps extends LinearLayout {
    private zg fs;
    private final FilterWord zmn;
    private final iv zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public nps(Context context, FilterWord filterWord, iv ivVar) {
        super(context);
        setOrientation(1);
        this.zmn = filterWord;
        this.zn = ivVar;
        zmn();
    }

    private void zmn() {
        zn();
        fs();
    }

    private void fs() {
        this.fs = new zg(getContext(), this.zn);
        new LinearLayout.LayoutParams(-1, -2);
        this.fs.zmn(this.zmn.getOptions());
        addView(this.fs);
    }

    private void zn() {
        String name = this.zmn.getName();
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = jy.fs(getContext(), 12.0f);
        layoutParams.gravity = 17;
        zgVar.setGravity(17);
        zgVar.setText(name);
        zgVar.setTextColor(Color.argb(85, 22, 24, 35));
        zgVar.setTextSize(this.zn.bvs() ? 14 : 10);
        addView(zgVar, layoutParams);
    }
}
