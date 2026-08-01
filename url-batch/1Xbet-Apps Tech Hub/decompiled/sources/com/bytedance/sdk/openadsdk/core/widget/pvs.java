package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGButton;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.so;

/* compiled from: CustomCommonDialog.java */
/* loaded from: classes2.dex */
public class pvs extends Dialog {
    private boolean IP;
    private PAGTextView Jd;
    private int Ju;
    private String Mxy;
    private PAGButton NB;
    private String Wyp;
    private PAGImageView icD;
    private String kj;
    public InterfaceC0086pvs pvs;
    private String qh;
    private PAGButton sUS;
    private final Context so;
    private PAGTextView vG;
    private View yiw;

    /* compiled from: CustomCommonDialog.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0086pvs {
        void icD();

        void pvs();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    public pvs(Context context) {
        super(context, uc.sUS(context, "tt_custom_dialog"));
        this.Ju = -1;
        this.IP = false;
        this.so = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(pvs(this.so));
        setCanceledOnTouchOutside(false);
        icD();
        pvs();
    }

    private void pvs() {
        this.sUS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.pvs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.pvs();
                }
            }
        });
        this.NB.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.pvs.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.icD();
                }
            }
        });
    }

    private void icD() {
        if (!TextUtils.isEmpty(this.Wyp)) {
            this.vG.setText(this.Wyp);
            this.vG.setVisibility(0);
        } else {
            this.vG.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.Mxy)) {
            this.Jd.setText(this.Mxy);
        }
        if (!TextUtils.isEmpty(this.qh)) {
            this.sUS.setText(this.qh);
        } else {
            this.sUS.setText(uc.pvs(mnm.pvs(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.kj)) {
            this.NB.setText(this.kj);
        } else {
            this.NB.setText(uc.pvs(mnm.pvs(), "tt_negtive_txt"));
        }
        int i = this.Ju;
        if (i != -1) {
            this.icD.setImageResource(i);
            this.icD.setVisibility(0);
        } else {
            this.icD.setVisibility(8);
        }
        if (this.IP) {
            this.yiw.setVisibility(8);
            this.NB.setVisibility(8);
        } else {
            this.NB.setVisibility(0);
            this.yiw.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        icD();
    }

    private View pvs(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        pAGLinearLayout.setMinimumWidth(pvs(260.0f));
        pAGLinearLayout.setPadding(0, pvs(32.0f), 0, 0);
        pAGLinearLayout.setBackground(so.pvs(context, "tt_custom_dialog_bg"));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        this.vG = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = pvs(16.0f);
        layoutParams2.rightMargin = pvs(16.0f);
        layoutParams2.bottomMargin = pvs(16.0f);
        this.vG.setGravity(17);
        this.vG.setVisibility(0);
        this.vG.setTextColor(Color.parseColor("#333333"));
        this.vG.setTextSize(18.0f);
        this.vG.setLayoutParams(layoutParams2);
        this.icD = new PAGImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = pvs(16.0f);
        layoutParams3.rightMargin = pvs(16.0f);
        layoutParams3.bottomMargin = pvs(10.0f);
        this.icD.setMaxHeight(pvs(150.0f));
        this.icD.setMaxWidth(pvs(150.0f));
        this.icD.setVisibility(0);
        this.icD.setLayoutParams(layoutParams3);
        this.Jd = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = pvs(20.0f);
        layoutParams4.rightMargin = pvs(20.0f);
        this.Jd.setGravity(17);
        this.Jd.setLineSpacing(pvs(3.0f), 1.2f);
        this.Jd.setTextSize(18.0f);
        this.Jd.setTextColor(Color.parseColor("#000000"));
        this.Jd.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = pvs(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        PAGButton pAGButton = new PAGButton(context);
        this.NB = pAGButton;
        pAGButton.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = pvs(10.0f);
        layoutParams7.weight = 1.0f;
        this.NB.setPadding(0, pvs(16.0f), 0, pvs(16.0f));
        this.NB.setBackground(null);
        this.NB.setGravity(17);
        this.NB.setSingleLine(true);
        this.NB.setTextColor(Color.parseColor("#999999"));
        this.NB.setTextSize(16.0f);
        this.NB.setLayoutParams(layoutParams7);
        this.yiw = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.yiw.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.yiw.setLayoutParams(layoutParams8);
        this.sUS = new PAGButton(context);
        this.NB.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = pvs(10.0f);
        layoutParams9.weight = 1.0f;
        this.sUS.setPadding(0, pvs(16.0f), 0, pvs(16.0f));
        this.sUS.setBackground(null);
        this.sUS.setGravity(17);
        this.sUS.setSingleLine(true);
        this.sUS.setTextColor(Color.parseColor("#38ADFF"));
        this.sUS.setTextSize(16.0f);
        this.sUS.setLayoutParams(layoutParams9);
        pAGRelativeLayout.addView(pAGLinearLayout);
        pAGLinearLayout.addView(this.vG);
        pAGLinearLayout.addView(this.icD);
        pAGLinearLayout.addView(this.Jd);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(this.NB);
        pAGLinearLayout2.addView(this.yiw);
        pAGLinearLayout2.addView(this.sUS);
        return pAGRelativeLayout;
    }

    private int pvs(float f) {
        return Pj.icD(getContext(), f);
    }

    public pvs pvs(InterfaceC0086pvs interfaceC0086pvs) {
        this.pvs = interfaceC0086pvs;
        return this;
    }

    public pvs pvs(String str) {
        this.Mxy = str;
        return this;
    }

    public pvs icD(String str) {
        this.qh = str;
        return this;
    }

    public pvs vG(String str) {
        this.kj = str;
        return this;
    }
}
