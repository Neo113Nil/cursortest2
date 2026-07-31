package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes10.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

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

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = com.bytedance.sdk.component.utils.doe.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = com.bytedance.sdk.component.utils.doe.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context zmn = com.bytedance.sdk.openadsdk.core.kgc.zmn();
            sDislikeSendTip = com.bytedance.sdk.component.utils.doe.zmn(zmn, "tt_feedback_thank_text") + "\n" + com.bytedance.sdk.component.utils.doe.zmn(zmn, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static void onResourceUpdated() {
        Context zmn = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        sSkipText = com.bytedance.sdk.component.utils.doe.zmn(zmn, "tt_reward_screen_skip_tx");
        sDislikeTip = com.bytedance.sdk.component.utils.doe.zmn(zmn, "tt_feedback_submit_text");
        sDislikeSendTip = com.bytedance.sdk.component.utils.doe.zmn(zmn, "tt_feedback_thank_text") + "\n" + com.bytedance.sdk.component.utils.doe.zmn(zmn, "tt_feedback_experience_text");
    }

    private void initToast(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.mTextView = zgVar;
        zgVar.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = jy.fs(getContext(), 75.0f);
        int fs = jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), 16.0f);
        int fs2 = jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), 12.0f);
        this.mTextView.setPadding(fs, fs2, fs, fs2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(8388611);
        Drawable zn = com.bytedance.sdk.component.utils.doe.zn(getContext(), "tt_dislike_toast");
        int fs3 = jy.fs(getContext(), 16.0f);
        zn.setBounds(0, 0, fs3, fs3);
        this.mTextView.setCompoundDrawablePadding(fs3 / 2);
        this.mTextView.setCompoundDrawables(zn, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }
}
