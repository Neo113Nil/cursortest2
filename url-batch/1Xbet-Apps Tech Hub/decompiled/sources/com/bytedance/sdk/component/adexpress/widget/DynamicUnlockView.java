package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.vG.pvs;

/* loaded from: classes.dex */
public class DynamicUnlockView extends FrameLayout {
    private final RotateAnimation Jd;
    private final ImageView icD;
    private final TextView pvs;
    private final FlowLightView vG;

    public DynamicUnlockView(Context context) {
        super(context);
        addView(pvs.Jd(context));
        this.pvs = (TextView) findViewById(2097610742);
        this.icD = (ImageView) findViewById(2097610745);
        this.vG = (FlowLightView) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.Jd = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.pvs;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void pvs() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void icD() {
        this.Jd.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicUnlockView.this.icD.startAnimation(DynamicUnlockView.this.Jd);
                DynamicUnlockView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DynamicUnlockView.this.vG.pvs(4);
                    }
                }, 100L);
                DynamicUnlockView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DynamicUnlockView.this.vG.pvs(4);
                    }
                }, 300L);
                DynamicUnlockView dynamicUnlockView = DynamicUnlockView.this;
                dynamicUnlockView.postDelayed(dynamicUnlockView.getHaloAnimation(), 1200L);
            }
        };
    }
}
