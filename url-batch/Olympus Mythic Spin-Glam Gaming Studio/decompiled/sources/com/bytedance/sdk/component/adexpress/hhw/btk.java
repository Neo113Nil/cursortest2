package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes13.dex */
public class btk extends FrameLayout {
    private AnimatorSet fs;
    private ImageView zmn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public btk(Context context) {
        super(context);
        zn();
        fb();
    }

    private void zn() {
        ImageView imageView = new ImageView(getContext());
        this.zmn = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.doe.fb(getContext(), "tt_white_hand"));
        int zmn = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(zmn, zmn);
        layoutParams.gravity = 17;
        addView(this.zmn, layoutParams);
    }

    private void fb() {
        this.fs = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.zmn, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.zmn, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.fs.playTogether(ofFloat, ofFloat2);
    }

    public void zmn() {
        AnimatorSet animatorSet = this.fs;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void fs() {
        AnimatorSet animatorSet = this.fs;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
