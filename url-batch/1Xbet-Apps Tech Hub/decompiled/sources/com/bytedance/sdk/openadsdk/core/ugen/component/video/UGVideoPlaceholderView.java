package com.bytedance.sdk.openadsdk.core.ugen.component.video;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* loaded from: classes2.dex */
public class UGVideoPlaceholderView extends UGFrameLayout {
    private final UGFrameLayout icD;
    private final UGFrameLayout pvs;

    public UGVideoPlaceholderView(Context context) {
        super(context);
        UGFrameLayout uGFrameLayout = new UGFrameLayout(context);
        this.pvs = uGFrameLayout;
        addView(uGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        UGFrameLayout uGFrameLayout2 = new UGFrameLayout(context);
        this.icD = uGFrameLayout2;
        uGFrameLayout2.setBackgroundColor(0);
        addView(uGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.icD.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.icD.setOnTouchListener(onTouchListener);
    }

    public UGFrameLayout getVideoView() {
        return this.pvs;
    }
}
