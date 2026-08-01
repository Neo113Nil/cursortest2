package com.bytedance.sdk.component.adexpress.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.vG.pvs;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class ClickSlideUpView2 extends SlideUpView {
    private ImageView Jd;
    private int NB;
    private ImageView icD;
    private TextView pvs;
    private AnimatorSet sUS;
    private ImageView vG;

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    protected void pvs(Context context) {
    }

    public ClickSlideUpView2(Context context) {
        super(context);
        this.sUS = new AnimatorSet();
        icD(context);
    }

    private void icD(Context context) {
        addView(pvs.icD(context));
        this.icD = (ImageView) findViewById(2097610751);
        this.vG = (ImageView) findViewById(2097610750);
        this.Jd = (ImageView) findViewById(2097610749);
        this.pvs = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.pvs == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.pvs.setText(str);
    }

    private void Jd() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(2000L);
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    public float getAlphaColor() {
        return this.NB;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + Opcodes.MONITOREXIT;
        this.Jd.setColorFilter(Color.rgb(i2, i2, i2), PorterDuff.Mode.SRC_IN);
        int i3 = ((i + 20) % 60) + Opcodes.MONITOREXIT;
        this.vG.setColorFilter(Color.rgb(i3, i3, i3), PorterDuff.Mode.SRC_IN);
        int i4 = ((i + 40) % 60) + Opcodes.MONITOREXIT;
        this.icD.setColorFilter(Color.rgb(i4, i4, i4), PorterDuff.Mode.SRC_IN);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void pvs() {
        Jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.SlideUpView
    public void icD() {
        this.sUS.cancel();
    }
}
