package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class rc extends FrameLayout {
    private PAGLogoView btk;
    private com.bytedance.sdk.openadsdk.core.zn.zmn bvs;
    private cyb fb;
    private olo fs;
    private com.bytedance.sdk.openadsdk.core.hhw.zg hhw;
    private nqi nps;
    private String zg;
    private boolean zmn;
    private TextView zn;

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
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.olo.rsi);
    }

    public void zmn(nqi nqiVar, String str, com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar) {
        this.nps = nqiVar;
        this.zg = str;
        this.bvs = zmnVar;
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar) {
        this.bvs = zmnVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            zmn();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zmn() {
        if (this.zmn) {
            return;
        }
        this.zmn = true;
        fs();
        if (this.fs != null && this.nps.uaq() != null && !TextUtils.isEmpty(this.nps.uaq().zmn())) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.nps.uaq(), this.fs, this.nps);
        }
        cyb cybVar = this.fb;
        if (cybVar != null) {
            jy.zmn((TextView) null, cybVar, this.nps);
            if (this.nps.pw() != null) {
                this.fb.setVisibility(0);
            }
        }
        if (this.zn != null) {
            if (this.nps.pw() != null && !TextUtils.isEmpty(this.nps.pw().fs())) {
                this.zn.setText(this.nps.pw().fs());
            } else if (!TextUtils.isEmpty(this.nps.dey())) {
                this.zn.setText(this.nps.dey());
            } else {
                this.zn.setVisibility(8);
            }
        }
        if (this.hhw != null) {
            String db = this.nps.db();
            if (!TextUtils.isEmpty(db)) {
                this.hhw.setText(db);
            } else {
                this.hhw.setVisibility(8);
            }
        }
        this.btk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.rc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/rc$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_rc$1_onClick_2f7641872b81d55b1f6da9778460700a(view);
            }

            public void safedk_rc$1_onClick_2f7641872b81d55b1f6da9778460700a(View p0) {
                try {
                    if (com.bytedance.sdk.openadsdk.utils.fs.btk() && com.bytedance.sdk.openadsdk.core.kgc.fb().am()) {
                        View p02 = rc.this;
                        IABLandingPageActivity.zmn(p02.getContext(), rc.this.nps, rc.this.zg);
                    } else {
                        View p03 = rc.this;
                        TTWebsiteActivity.zmn(p03.getContext(), rc.this.nps, rc.this.zg);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void fs() {
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        boolean z = this.nps.ol() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setGravity(1);
        btkVar.setOrientation(1);
        if (z) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(jy.fs(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int fs = jy.fs(context, 24.0f);
        layoutParams.rightMargin = fs;
        layoutParams.leftMargin = fs;
        addView(btkVar, layoutParams);
        olo oloVar = new olo(context);
        this.fs = oloVar;
        oloVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(jy.fs(context, 80.0f), jy.fs(context, 80.0f));
        layoutParams2.bottomMargin = jy.fs(context, 12.0f);
        btkVar.addView(this.fs, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.zn = zgVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        this.zn.setGravity(17);
        this.zn.setMaxLines(2);
        this.zn.setMaxWidth(jy.fs(context, 180.0f));
        this.zn.setTextColor(-1);
        this.zn.setTextSize(2, 24.0f);
        btkVar.addView(this.zn, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.hhw = zgVar2;
        zgVar2.setEllipsize(truncateAt);
        this.hhw.setGravity(17);
        this.hhw.setMaxLines(2);
        this.hhw.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.hhw.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = jy.fs(context, 8.0f);
        btkVar.addView(this.hhw, layoutParams3);
        this.fb = new cyb(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, jy.fs(context, 16.0f));
        layoutParams4.topMargin = jy.fs(context, 12.0f);
        this.fb.setVisibility(8);
        btkVar.addView(this.fb, layoutParams4);
        this.btk = PAGLogoView.createPAGLogoViewByMaterial(context, this.nps);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, jy.fs(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = jy.fs(context, 18.0f);
        if (z) {
            layoutParams5.bottomMargin = jy.fs(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = jy.fs(context, 24.0f);
        }
        addView(this.btk, layoutParams5);
    }
}
