package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.sdk.component.adexpress.dynamic.vG.Wyp;
import com.bytedance.sdk.component.utils.rCZ;

/* loaded from: classes.dex */
public class WriggleGuideAnimationView extends LinearLayout {
    private pvs Jd;
    private LinearLayout NB;
    private rCZ icD;
    private TextView pvs;
    private LottieAnimationView sUS;
    private TextView vG;
    private Wyp yiw;

    public interface pvs {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public WriggleGuideAnimationView(Context context, View view, Wyp wyp) {
        super(context);
        this.yiw = wyp;
        pvs(context, view);
    }

    private void pvs(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.NB = (LinearLayout) findViewById(2097610722);
        this.pvs = (TextView) findViewById(2097610719);
        this.vG = (TextView) findViewById(2097610718);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(2097610706);
        this.sUS = lottieAnimationView;
        lottieAnimationView.setAnimation("lottie_json/twist_multi_angle.json");
        this.sUS.setImageAssetsFolder("images/");
        this.sUS.icD(true);
    }

    public void setShakeText(String str) {
        this.vG.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.NB;
    }

    public View getWriggleProgressIv() {
        return this.sUS;
    }

    public TextView getTopTextView() {
        return this.pvs;
    }

    public void setOnShakeViewListener(pvs pvsVar) {
        this.Jd = pvsVar;
    }

    public void pvs() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    WriggleGuideAnimationView.this.sUS.pvs();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.icD == null) {
                this.icD = new rCZ(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.2
            };
            Wyp wyp = this.yiw;
            if (wyp != null) {
                wyp.vG();
                this.yiw.NB();
                this.yiw.sUS();
                this.yiw.so();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            LottieAnimationView lottieAnimationView = this.sUS;
            if (lottieAnimationView != null) {
                lottieAnimationView.vG();
            }
        } catch (Exception unused) {
        }
    }
}
