package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class rc extends FrameLayout {
    private final RotateAnimation fb;
    private final ImageView fs;
    private final TextView zmn;
    private final klz zn;

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

    public rc(@NonNull Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.zn.zmn.fb(context));
        this.zmn = (TextView) findViewById(2097610742);
        this.fs = (ImageView) findViewById(2097610745);
        this.zn = (klz) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.fb = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.zmn;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void zmn() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void fs() {
        this.fb.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.rc.1
            @Override // java.lang.Runnable
            public void run() {
                rc.this.fs.startAnimation(rc.this.fb);
                rc.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.rc.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        rc.this.zn.zmn(4);
                    }
                }, 100L);
                rc.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.rc.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        rc.this.zn.zmn(4);
                    }
                }, 300L);
                rc rcVar = rc.this;
                rcVar.postDelayed(rcVar.getHaloAnimation(), 1200L);
            }
        };
    }
}
