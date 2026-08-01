package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class TTAdDislikeToast extends PAGFrameLayout {
    private static String Jd;
    private static String NB;
    private static String vG;
    private TextView icD;
    private final Handler pvs;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pvs = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        pvs(context);
    }

    public static String getDislikeTip() {
        if (vG == null) {
            vG = uc.pvs(mnm.pvs(), "tt_feedback_submit_text");
        }
        return vG;
    }

    public static String getSkipText() {
        if (Jd == null) {
            Jd = uc.pvs(mnm.pvs(), "tt_txt_skip");
        }
        return Jd;
    }

    public static String getDislikeSendTip() {
        if (NB == null) {
            Context pvs = mnm.pvs();
            NB = uc.pvs(pvs, "tt_feedback_thank_text") + "\n" + uc.pvs(pvs, "tt_feedback_experience_text");
        }
        return NB;
    }

    public static void pvs() {
        Context pvs = mnm.pvs();
        Jd = uc.pvs(pvs, "tt_txt_skip");
        vG = uc.pvs(pvs, "tt_feedback_submit_text");
        NB = uc.pvs(pvs, "tt_feedback_thank_text") + "\n" + uc.pvs(pvs, "tt_feedback_experience_text");
    }

    private void pvs(Context context) {
        TextView textView = new TextView(context);
        this.icD = textView;
        textView.setClickable(false);
        this.icD.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int icD = Pj.icD(mnm.pvs(), 20.0f);
        int icD2 = Pj.icD(mnm.pvs(), 12.0f);
        this.icD.setPadding(icD, icD2, icD, icD2);
        this.icD.setLayoutParams(layoutParams);
        this.icD.setTextColor(-1);
        this.icD.setTextSize(16.0f);
        this.icD.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(Pj.icD(mnm.pvs(), 6.0f));
        this.icD.setBackgroundDrawable(gradientDrawable);
        addView(this.icD);
    }

    public void pvs(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pvs.removeCallbacksAndMessages(null);
        this.pvs.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.icD != null) {
                    TTAdDislikeToast.this.icD.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.pvs.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public void icD() {
        setVisibility(8);
        this.pvs.removeCallbacksAndMessages(null);
    }

    public void vG() {
        setVisibility(8);
        this.pvs.removeCallbacksAndMessages(null);
    }
}
