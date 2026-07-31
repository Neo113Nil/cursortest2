package com.bytedance.sdk.openadsdk.zn;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.zn.iv;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class btk extends com.bytedance.sdk.openadsdk.core.hhw.btk implements View.OnClickListener, iv.zn {
    private FilterWord btk;
    private final iv fb;
    private StateListDrawable hhw;
    private final int nps;
    public static FilterWord zmn = new FilterWord("100:1", "GOOD");
    public static FilterWord fs = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord zn = new FilterWord("100:3", "BAD");

    @Override // com.bytedance.sdk.openadsdk.core.hhw.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/btk;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(h.u, view);
        safedk_btk_onClick_f64b78469a02e437d343d4d2b0d73cef(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.btk, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public btk(@NonNull Context context, int i, iv ivVar) {
        super(context);
        this.nps = i;
        this.fb = ivVar;
        if (ivVar != null) {
            ivVar.zmn(this);
        }
        zmn(i);
        zmn();
        fs();
    }

    private void zmn(int i) {
        if (i == 1) {
            this.btk = zmn;
        } else if (i == 2) {
            this.btk = fs;
        } else {
            if (i != 3) {
                return;
            }
            this.btk = zn;
        }
    }

    private void zmn() {
        if (this.hhw == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(jy.fs(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(jy.fs(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(jy.fs(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.hhw = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.hhw.addState(new int[0], gradientDrawable);
        }
        setBackground(this.hhw);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    private void fs() {
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(getContext());
        zgVar.setTextSize(this.fb.bvs() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, jy.fs(getContext(), 12.0f), 0, jy.fs(getContext(), this.fb.bvs() ? 8.0f : 4.0f));
        addView(zgVar, layoutParams);
        zmn zmnVar = new zmn(getContext());
        zmnVar.setTextSize(this.fb.bvs() ? 17 : 12);
        zmnVar.setTextColor(-16777216);
        zmnVar.setMaxLines(1);
        zmnVar.setSingleLine();
        zmnVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, jy.fs(getContext(), 12.0f));
        addView(zmnVar, layoutParams2);
        int i = this.nps;
        if (i == 1) {
            zgVar.setText("😍");
            zmnVar.setText(doe.zmn(getContext(), "tt_good"));
        } else if (i == 2) {
            zmnVar.setText(doe.zmn(getContext(), "tt_not_bad"));
            zgVar.setText("😐");
        } else {
            if (i != 3) {
                return;
            }
            zmnVar.setText(doe.zmn(getContext(), "tt_bad"));
            zgVar.setText("😡");
        }
    }

    public void safedk_btk_onClick_f64b78469a02e437d343d4d2b0d73cef(View p0) {
        if (isSelected()) {
            this.fb.zmn(iv.zmn);
        } else {
            this.fb.zmn(this.btk);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zn.iv.zn
    public void zmn(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.btk) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
