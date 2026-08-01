package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class SlideUp3DView extends FrameLayout {
    private TextView Jd;
    private AnimationDrawable NB;
    private ImageView icD;
    private Context pvs;
    private TextView vG;

    public SlideUp3DView(Context context) {
        super(context);
        this.pvs = context;
        pvs();
    }

    public void pvs() {
        this.icD = new ImageView(this.pvs);
        this.Jd = new TextView(this.pvs);
        this.vG = new TextView(this.pvs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) yiw.pvs(this.pvs, 200.0f), (int) yiw.pvs(this.pvs, 200.0f));
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = (int) yiw.pvs(this.pvs, 70.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) yiw.pvs(this.pvs, 25.0f);
        this.Jd.setText(uc.icD(this.pvs, "tt_slide_up_3d"));
        this.Jd.setTextColor(-1);
        this.Jd.setTextSize(24.0f);
        this.Jd.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#59000000"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        this.vG.setShadowLayer(4.0f, 3.0f, 3.0f, Color.parseColor("#59000000"));
        this.vG.setTextColor(-1);
        this.vG.setTextSize(14.0f);
        addView(this.icD, layoutParams);
        if (!Jd.icD()) {
            addView(this.Jd, layoutParams2);
        }
        addView(this.vG, layoutParams3);
    }

    public void setGuideText(String str) {
        this.vG.setText(str);
    }

    private void Jd() {
        this.NB = new AnimationDrawable();
        pvs(100, "tt_slide_up_1");
        pvs(100, "tt_slide_up_2");
        pvs(100, "tt_slide_up_3");
        pvs(100, "tt_slide_up_4");
        pvs(100, "tt_slide_up_5");
        pvs(100, "tt_slide_up_6");
        pvs(100, "tt_slide_up_7");
        pvs(100, "tt_slide_up_8");
        pvs(100, "tt_slide_up_9");
        pvs(100, "tt_slide_up_10");
        pvs(120, "tt_slide_up_11");
        pvs(120, "tt_slide_up_12");
        pvs(120, "tt_slide_up_13");
        pvs(120, "tt_slide_up_14");
        pvs(120, "tt_slide_up_15");
        this.NB.setOneShot(false);
    }

    private void pvs(int i, String str) {
        this.NB.addFrame(uc.vG(this.pvs, str), i);
    }

    public void icD() {
        if (this.NB == null) {
            Jd();
        }
        this.icD.setImageDrawable(this.NB);
        this.NB.start();
    }

    public void vG() {
        AnimationDrawable animationDrawable = this.NB;
        if (animationDrawable != null) {
            animationDrawable.stop();
            this.NB = null;
        }
    }
}
