package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class fs extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    private float btk;
    private float fb;
    private final boolean fs;
    private com.bytedance.sdk.openadsdk.activity.single.zg hhw;
    private boolean nps;
    private final boolean zmn;
    private com.bytedance.sdk.openadsdk.core.hhw.zn zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public fs(@NonNull Context context, boolean z, boolean z2, final int i) {
        super(context);
        this.zmn = z;
        this.fs = z2;
        if (!z) {
            this.zn = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            addView(this.zn, layoutParams);
            this.zn.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fs.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
            this.zn.setClipToOutline(true);
            return;
        }
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fs.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
            }
        });
        setClipToOutline(true);
    }

    public void setWidthAndHeightRatio(float f) {
        this.fb = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!this.fs) {
            if (this.zmn) {
                float f = this.fb;
                if (f > 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                } else {
                    float f2 = this.btk;
                    if (f2 > 0.0f) {
                        i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                    }
                }
            } else {
                float f3 = this.fb;
                if (f3 > 0.0f) {
                    int max = Math.max(0, (size - ((int) (size2 * f3))) / 2);
                    setPadding(max, 0, max, 0);
                } else {
                    float f4 = this.btk;
                    if (f4 > 0.0f) {
                        int max2 = Math.max(0, (size - ((int) (size * f4))) / 2);
                        setPadding(max2, 0, max2, 0);
                    }
                }
            }
        } else {
            float f5 = this.fb;
            if (f5 > 0.0f) {
                int max3 = Math.max(0, (size - ((int) (size2 * f5))) / 2);
                setPadding(max3, 0, max3, 0);
            } else {
                float f6 = this.btk;
                if (f6 > 0.0f) {
                    int max4 = Math.max(0, (size - ((int) (size * f6))) / 2);
                    setPadding(max4, 0, max4, 0);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public void setWidthOrHeightInParentRatio(float f) {
        this.btk = f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh;
        super.onWindowFocusChanged(z);
        if (this.nps == z || (zgVar = this.hhw) == null || (uqh = zgVar.uqh()) == null) {
            return;
        }
        uqh.rp.fs(z);
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.single.zg zgVar) {
        this.hhw = zgVar;
    }

    public void zmn(zg zgVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = this.zn;
        if (znVar != null) {
            znVar.addView(zgVar, layoutParams);
        } else {
            addView(zgVar, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh;
        super.onAttachedToWindow();
        if (this.nps || (zgVar = this.hhw) == null || (uqh = zgVar.uqh()) == null) {
            return;
        }
        uqh.rp.fs(true);
        this.nps = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh;
        super.onDetachedFromWindow();
        if (!this.nps || (zgVar = this.hhw) == null || (uqh = zgVar.uqh()) == null) {
            return;
        }
        uqh.rp.fs(false);
        this.nps = false;
    }

    public void zmn() {
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = this.zn;
        if (znVar != null) {
            znVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
