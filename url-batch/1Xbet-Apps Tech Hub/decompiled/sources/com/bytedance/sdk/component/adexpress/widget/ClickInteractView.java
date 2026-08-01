package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class ClickInteractView extends FrameLayout {
    private AnimatorSet icD;
    private ImageView pvs;

    public ClickInteractView(Context context) {
        super(context);
        vG();
        Jd();
    }

    private void vG() {
        ImageView imageView = new ImageView(getContext());
        this.pvs = imageView;
        imageView.setImageResource(uc.Jd(getContext(), "tt_white_hand"));
        int pvs = (int) yiw.pvs(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(pvs, pvs);
        layoutParams.gravity = 17;
        addView(this.pvs, layoutParams);
    }

    private void Jd() {
        this.icD = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.pvs, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.pvs, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.icD.playTogether(ofFloat, ofFloat2);
    }

    public void pvs() {
        AnimatorSet animatorSet = this.icD;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void icD() {
        AnimatorSet animatorSet = this.icD;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
