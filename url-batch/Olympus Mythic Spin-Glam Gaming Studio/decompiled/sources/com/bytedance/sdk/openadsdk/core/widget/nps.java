package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.am;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class nps extends com.bytedance.sdk.openadsdk.core.hhw.nps {
    private boolean btk;
    private com.bytedance.sdk.openadsdk.core.hhw.zg fb;
    private com.bytedance.sdk.openadsdk.core.hhw.zg fs;
    private boolean hhw;
    private olo zmn;
    private zg zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.nps, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    protected boolean zmn() {
        return true;
    }

    public nps(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (zmn()) {
            fs();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(nqi nqiVar, int i) {
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar;
        if (!this.btk || nqiVar == null || this.hhw) {
            return;
        }
        this.hhw = true;
        boolean z = !nqiVar.lwz() || com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(nqiVar);
        if (z && nqiVar.uaq() != null && !TextUtils.isEmpty(nqiVar.uaq().zmn())) {
            try {
                com.bytedance.sdk.openadsdk.iv.fb.zmn(nqiVar.uaq()).zn(1).zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, nqiVar.uaq().zmn(), new am(this.zmn)));
            } catch (Throwable unused) {
            }
            if (z) {
                this.fs.setText("Loading");
            } else if (!TextUtils.isEmpty(nqiVar.db())) {
                this.fs.setText(nqiVar.db());
            } else {
                this.fs.setVisibility(8);
            }
            zgVar = this.fb;
            if (zgVar == null) {
                zgVar.setText(nqiVar.gt());
                return;
            }
            return;
        }
        this.zmn.setVisibility(8);
        if (z) {
        }
        zgVar = this.fb;
        if (zgVar == null) {
        }
    }

    public void fs() {
        if (this.btk) {
            return;
        }
        this.btk = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        olo oloVar = new olo(context);
        this.zmn = oloVar;
        oloVar.setId(520093745);
        int fs = jy.fs(context, 64.0f);
        this.zmn.setLayoutParams(new RelativeLayout.LayoutParams(fs, fs));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.fs = zgVar;
        zgVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(jy.fs(context, 219.0f), -2);
        layoutParams2.topMargin = jy.fs(context, 16.0f);
        this.fs.setLayoutParams(layoutParams2);
        this.fs.setEllipsize(TextUtils.TruncateAt.END);
        this.fs.setGravity(17);
        this.fs.setMaxWidth(jy.fs(context, 150.0f));
        this.fs.setMaxLines(2);
        this.fs.setTextColor(-1);
        this.fs.setTextSize(1, 16.0f);
        zg zgVar2 = new zg(context);
        this.zn = zgVar2;
        zgVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(jy.fs(context, 219.0f), jy.fs(context, 6.0f));
        layoutParams3.topMargin = jy.fs(context, 24.0f);
        this.zn.setLayoutParams(layoutParams3);
        this.fb = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(jy.fs(context, 138.0f), jy.fs(context, 42.0f));
        layoutParams4.topMargin = jy.fs(context, 48.0f);
        this.fb.setLayoutParams(layoutParams4);
        this.fb.setTextColor(-1);
        this.fb.setTextSize(16.0f);
        this.fb.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.fb.setBackground(gradientDrawable);
        linearLayout.addView(this.zmn);
        linearLayout.addView(this.fs);
        linearLayout.addView(this.zn);
        linearLayout.addView(this.fb);
        addView(linearLayout);
    }

    @Nullable
    public zg getLoadingProgressBar() {
        return this.zn;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.hhw.zg getDownloadButton() {
        return this.fb;
    }

    public void setProgress(int i) {
        zg zgVar = this.zn;
        if (zgVar != null) {
            zgVar.setProgress(i);
        }
    }

    public void zmn(final nqi nqiVar, final Activity activity, final String str) {
        if (nqiVar == null || activity == null) {
            return;
        }
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(getContext(), nqiVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(12);
        layoutParams.leftMargin = jy.fs(activity, 16.0f);
        layoutParams.bottomMargin = jy.fs(activity, 21.0f);
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams);
        addView(createPAGLogoViewByMaterial, layoutParams);
        createPAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.nps.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/nps$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_nps$1_onClick_f3120c8bc065e6ed8eecf5c49241319c(view);
            }

            public void safedk_nps$1_onClick_f3120c8bc065e6ed8eecf5c49241319c(View p0) {
                try {
                    TTWebsiteActivity.zmn(activity, nqiVar, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zn("PAGFullScreenLoadingLayout", th.getMessage());
                }
            }
        });
    }
}
