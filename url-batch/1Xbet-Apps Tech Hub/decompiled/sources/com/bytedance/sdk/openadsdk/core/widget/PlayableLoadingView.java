package com.bytedance.sdk.openadsdk.core.widget;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import java.util.Locale;

/* loaded from: classes2.dex */
public class PlayableLoadingView extends PAGFrameLayout {
    private long Jd;
    private long NB;
    private TextView icD;
    private PAGProgressBar pvs;
    private boolean sUS;
    private TextView vG;

    public PlayableLoadingView(Context context) {
        super(context);
        setVisibility(8);
    }

    private void Jd() {
        if (this.sUS) {
            return;
        }
        this.sUS = true;
        setBackgroundColor(Color.parseColor("#0D1833"));
        setClickable(true);
        Context context = getContext();
        int icD = Pj.icD(context, 80.0f);
        int icD2 = Pj.icD(context, 10.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(icD, Pj.icD(context, 53.0f));
        layoutParams2.gravity = 17;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundResource(uc.Jd(context, "tt_pangle_logo_white"));
        linearLayout.addView(imageView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = icD2;
        layoutParams3.gravity = 17;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout.addView(linearLayout2);
        this.pvs = new PAGProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(icD, Pj.icD(context, 3.0f));
        layoutParams4.gravity = 17;
        this.pvs.setProgress(1);
        this.pvs.setProgressDrawable(so.pvs(context, "tt_playable_progress_style"));
        this.pvs.setLayoutParams(layoutParams4);
        linearLayout2.addView(this.pvs);
        this.icD = new TextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = icD2;
        this.icD.setGravity(16);
        int parseColor = Color.parseColor("#EEEEEE");
        this.icD.setTextColor(parseColor);
        this.icD.setTextSize(12.0f);
        this.icD.setLayoutParams(layoutParams5);
        linearLayout2.addView(this.icD);
        int icD3 = Pj.icD(context, 24.0f);
        int icD4 = Pj.icD(context, 8.0f);
        TextView textView = new TextView(context);
        this.vG = textView;
        textView.setId(kj.sDK);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = Pj.icD(context, 72.0f);
        layoutParams6.gravity = 17;
        this.vG.setBackground(so.pvs(context, "tt_playable_btn_bk"));
        this.vG.setClickable(true);
        this.vG.setPadding(icD3, icD4, icD3, icD4);
        this.vG.setMaxLines(1);
        this.vG.setEllipsize(TextUtils.TruncateAt.END);
        this.vG.setTextColor(parseColor);
        this.vG.setTextSize(14.0f);
        this.vG.setText(uc.pvs(context, "tt_try_now"));
        this.vG.setLayoutParams(layoutParams6);
        linearLayout.addView(this.vG);
        addView(linearLayout);
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        PAGProgressBar pAGProgressBar = this.pvs;
        if (pAGProgressBar != null) {
            pAGProgressBar.setProgress(i);
        }
        TextView textView = this.icD;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i)));
        }
    }

    public void pvs() {
        setVisibility(8);
        if (this.Jd != 0) {
            this.NB = SystemClock.elapsedRealtime();
        }
    }

    public void icD() {
        if (isShown()) {
            return;
        }
        Jd();
        setVisibility(0);
        this.Jd = SystemClock.elapsedRealtime();
    }

    public boolean vG() {
        return this.Jd > 0 && this.NB > 0;
    }

    public long getDisplayDuration() {
        if (this.Jd == 0) {
            return 0L;
        }
        if (this.NB == 0) {
            this.NB = SystemClock.elapsedRealtime();
        }
        return this.NB - this.Jd;
    }

    public TextView getPlayView() {
        return this.vG;
    }
}
