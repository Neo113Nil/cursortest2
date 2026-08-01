package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGLoadingBaseLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingFourLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingOneLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingThreeLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.PAGPAGLoadingTwoLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullVideoLoadingManager.java */
/* loaded from: classes2.dex */
public class Ju {
    private final int IP;
    TextView Jd;
    private final String Ju;
    private LinearLayout Mxy;
    private final cR NB;
    private TwoSemicirclesView Wyp;
    private AnimatorSet bNS;
    TextView icD;
    private PAGLogoView kj;
    private AnimatorSet mnm;
    TTRoundRectImageView pvs;
    private TwoSemicirclesView qh;
    private final Context sUS;
    private PAGLoadingBaseLayout so;
    PAGProgressBar vG;
    private int yiw = 0;

    public Ju(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.sUS = pvsVar.jhZ;
        this.NB = pvsVar.icD;
        this.Ju = pvsVar.NB;
        this.IP = pvsVar.cnN;
    }

    public void pvs() {
        try {
            if (!cR.NB(this.NB) || rCZ.qh(this.NB)) {
                return;
            }
            try {
                this.yiw = new JSONObject(this.NB.gSd().Wyp()).optInt("loading_page_type", 0);
            } catch (JSONException unused) {
            }
            int i = this.yiw;
            if (i == 1) {
                NB();
                return;
            }
            if (i == 2) {
                sUS();
            } else if (i == 3) {
                yiw();
            } else {
                if (i != 4) {
                    return;
                }
                so();
            }
        } catch (Throwable unused2) {
        }
    }

    public void icD() {
        try {
            int i = this.yiw;
            if (i == 1) {
                Mxy();
                return;
            }
            if (i == 2) {
                Wyp();
            } else if (i == 3) {
                qh();
            } else {
                if (i != 4) {
                    return;
                }
                kj();
            }
        } catch (Throwable unused) {
        }
    }

    private void NB() {
        PAGPAGLoadingOneLayout pAGPAGLoadingOneLayout = new PAGPAGLoadingOneLayout(this.sUS);
        this.so = pAGPAGLoadingOneLayout;
        this.pvs = pAGPAGLoadingOneLayout.getLoadingIcon();
        this.icD = this.so.getLoadingAppName();
        this.vG = this.so.getLoadingProgressBar();
        this.Jd = this.so.getLoadingProgressNumber();
        this.kj = this.so.getLoadingLogo();
        if (this.IP == 1 && this.NB.Ca() != null && !TextUtils.isEmpty(this.NB.Ca().icD())) {
            this.icD.setText(this.NB.Ca().icD());
        } else if (!TextUtils.isEmpty(this.NB.qd())) {
            this.icD.setText(this.NB.qd());
        } else {
            this.icD.setVisibility(8);
        }
        Ju();
        this.kj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Ju.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.pvs(Ju.this.sUS, Ju.this.NB, Ju.this.Ju);
            }
        });
    }

    private void sUS() {
        PAGPAGLoadingTwoLayout pAGPAGLoadingTwoLayout = new PAGPAGLoadingTwoLayout(this.sUS);
        this.so = pAGPAGLoadingTwoLayout;
        this.pvs = pAGPAGLoadingTwoLayout.getLoadingIcon();
        this.Jd = this.so.getLoadingProgressNumber();
        this.kj = this.so.getLoadingLogo();
        Ju();
        this.kj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Ju.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.pvs(Ju.this.sUS, Ju.this.NB, Ju.this.Ju);
            }
        });
    }

    private void yiw() {
        PAGPAGLoadingThreeLayout pAGPAGLoadingThreeLayout = new PAGPAGLoadingThreeLayout(this.sUS);
        this.so = pAGPAGLoadingThreeLayout;
        this.Mxy = pAGPAGLoadingThreeLayout.getWaveContainer();
        this.Jd = this.so.getLoadingProgressNumber();
        PAGLogoView loadingLogo = this.so.getLoadingLogo();
        this.kj = loadingLogo;
        loadingLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Ju.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.pvs(Ju.this.sUS, Ju.this.NB, Ju.this.Ju);
            }
        });
    }

    private void so() {
        PAGPAGLoadingFourLayout pAGPAGLoadingFourLayout = new PAGPAGLoadingFourLayout(this.sUS);
        this.so = pAGPAGLoadingFourLayout;
        this.Wyp = pAGPAGLoadingFourLayout.getInnerCircle();
        this.qh = this.so.getOuterCircle();
        this.Wyp.setRadius(Pj.icD(this.sUS, 80.0f));
        Paint paintTwo = this.Wyp.getPaintTwo();
        paintTwo.setColor(Color.parseColor("#C4C4C4"));
        this.Wyp.setPaintTwo(paintTwo);
        this.qh.setRadius(Pj.icD(this.sUS, 95.0f));
        Paint paintTwo2 = this.qh.getPaintTwo();
        paintTwo2.setStrokeWidth(6.0f);
        paintTwo2.setColor(Color.parseColor("#118BFF"));
        this.qh.setPaintTwo(paintTwo2);
        this.Jd = this.so.getLoadingProgressNumber();
        PAGLogoView loadingLogo = this.so.getLoadingLogo();
        this.kj = loadingLogo;
        loadingLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Ju.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.pvs(Ju.this.sUS, Ju.this.NB, Ju.this.Ju);
            }
        });
    }

    private void Mxy() {
        IP();
    }

    private void Wyp() {
        Context context = this.sUS;
        this.pvs.setAnimation(AnimationUtils.loadAnimation(context, uc.Wyp(context, "tt_loading_two_icon_scale")));
        IP();
    }

    private void qh() {
        this.bNS = new AnimatorSet();
        LinearLayout linearLayout = this.Mxy;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.bNS.play(duration);
            for (int i = 1; i < this.Mxy.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.Mxy.getChildAt(i), "translationY", -f, f).setDuration(300L);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.bNS.start();
        }
        IP();
    }

    private void kj() {
        this.bNS = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Wyp, Key.ROTATION, 0.0f, 360.0f).setDuration(1500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.qh, Key.ROTATION, 0.0f, 360.0f).setDuration(2500L);
        duration2.setRepeatCount(-1);
        this.bNS.playTogether(duration, duration2);
        this.bNS.start();
        IP();
    }

    private void Ju() {
        if (this.NB.ea() != null && !TextUtils.isEmpty(this.NB.ea().pvs())) {
            try {
                com.bytedance.sdk.component.NB.Wyp pvs2 = com.bytedance.sdk.openadsdk.sUS.Jd.pvs(this.NB.ea());
                cR cRVar = this.NB;
                pvs2.pvs(new com.bytedance.sdk.openadsdk.sUS.icD(cRVar, cRVar.ea().pvs(), new pvs(this.pvs)));
                return;
            } catch (Throwable unused) {
            }
        }
        this.pvs.setVisibility(8);
    }

    private void IP() {
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 80);
        ofInt.setDuration(2000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Ju.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (Ju.this.vG != null) {
                    Ju.this.vG.setProgress(intValue);
                }
                Ju.this.Jd.setText(String.valueOf(intValue));
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(81, 99);
        ofInt2.setDuration(3000L);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Ju.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (Ju.this.vG != null) {
                    Ju.this.vG.setProgress(intValue);
                }
                Ju.this.Jd.setText(String.valueOf(intValue));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.mnm = animatorSet;
        animatorSet.play(ofInt).before(ofInt2);
        this.mnm.start();
    }

    public void vG() {
        AnimatorSet animatorSet = this.bNS;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.mnm;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public View Jd() {
        return this.so;
    }

    /* compiled from: RewardFullVideoLoadingManager.java */
    private static class pvs implements com.bytedance.sdk.component.NB.mnm<Bitmap> {
        private final WeakReference<ImageView> pvs;

        public pvs(ImageView imageView) {
            this.pvs = new WeakReference<>(imageView);
        }

        @Override // com.bytedance.sdk.component.NB.mnm
        public void pvs(com.bytedance.sdk.component.NB.qh<Bitmap> qhVar) {
            ImageView imageView = this.pvs.get();
            if (imageView == null) {
                return;
            }
            if (qhVar != null) {
                try {
                    if (qhVar.icD() != null) {
                        imageView.setImageBitmap(qhVar.icD());
                        return;
                    }
                } catch (Throwable unused) {
                    imageView.setVisibility(8);
                    return;
                }
            }
            imageView.setVisibility(8);
        }

        @Override // com.bytedance.sdk.component.NB.mnm
        public void pvs(int i, String str, Throwable th) {
            ImageView imageView = this.pvs.get();
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }
}
