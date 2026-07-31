package com.bytedance.sdk.component.adexpress.hhw;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class zg extends phc {
    private int btk;
    private ImageView fb;
    private ImageView fs;
    private AnimatorSet hhw;
    private TextView zmn;
    private ImageView zn;

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc
    protected void zmn(Context context) {
    }

    public zg(Context context) {
        super(context);
        this.hhw = new AnimatorSet();
        fs(context);
    }

    private void fs(Context context) {
        addView(com.bytedance.sdk.component.adexpress.zn.zmn.fs(context));
        this.fs = (ImageView) findViewById(2097610751);
        this.zn = (ImageView) findViewById(2097610750);
        this.fb = (ImageView) findViewById(2097610749);
        this.zmn = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.zmn == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zmn.setText(str);
    }

    private void fb() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(2000L);
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    public float getAlphaColor() {
        return this.btk;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + 195;
        ImageView imageView = this.fb;
        int rgb = Color.rgb(i2, i2, i2);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(rgb, mode);
        int i3 = ((i + 20) % 60) + 195;
        this.zn.setColorFilter(Color.rgb(i3, i3, i3), mode);
        int i4 = ((i + 40) % 60) + 195;
        this.fs.setColorFilter(Color.rgb(i4, i4, i4), mode);
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc
    public void zmn() {
        fb();
    }

    @Override // com.bytedance.sdk.component.adexpress.hhw.phc
    public void fs() {
        this.hhw.cancel();
    }
}
