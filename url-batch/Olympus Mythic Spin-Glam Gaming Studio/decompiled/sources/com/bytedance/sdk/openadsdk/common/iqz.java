package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.moloco.sdk.acm.b;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
public class iqz extends Dialog {
    private static final String[] fs = {"SDK version", "App", "App version", b.d, "Device", "Creative info"};
    private Button btk;
    private TextView fb;
    private ImageView hhw;
    private final Handler zmn;
    private String zn;

    public iqz(@NonNull Context context) {
        super(context, com.bytedance.sdk.component.utils.doe.hhw(context, "tt_privacy_dialog_theme_ad_report"));
        this.zmn = new Handler(Looper.getMainLooper());
        this.zn = "";
    }

    public void zmn(nqi nqiVar) {
        try {
            this.zn = com.bytedance.sdk.component.utils.zmn.zmn(nqiVar.fg()).toString();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTPrivacyAdReportDialog", th.getMessage());
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(zmn(getContext()), new ViewGroup.LayoutParams(jy.zn(getContext()), (int) (jy.btk(getContext()) * 0.9d)));
        fs();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    private void fs() {
        final String hhw = oub.hhw();
        final String zg = oub.zg();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.btk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.iqz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/iqz$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_iqz$1_onClick_460d80ff275ab3d2863e957c5ccf35f8(view);
            }

            public void safedk_iqz$1_onClick_460d80ff275ab3d2863e957c5ccf35f8(View p0) {
                ClipboardManager clipboardManager = (ClipboardManager) iqz.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, hhw, zg, str, str2, iqz.this.zn};
                    for (int i = 0; i < iqz.fs.length; i++) {
                        sb.append(iqz.fs[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.hhw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.iqz.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/iqz$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_iqz$2_onClick_dc3424e37412bec28ead463395a84aa2(view);
            }

            public void safedk_iqz$2_onClick_dc3424e37412bec28ead463395a84aa2(View p0) {
                iqz.this.fb.setText("loading ...");
                iqz.this.cancel();
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.zmn.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.iqz.3
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.isEmpty(iqz.this.zn)) {
                        iqz.this.fb.setText("");
                    } else {
                        iqz.this.fb.setText(iqz.this.zn.substring(0, Math.min(iqz.this.zn.length(), 100)));
                    }
                }
            }, 1000L);
        } catch (Exception e) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }

    private View zmn(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        btkVar.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_ad_report_info_bg"));
        btkVar.setOrientation(1);
        btkVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar = new com.bytedance.sdk.openadsdk.core.hhw.nps(context);
        npsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, zmn(44.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(zmn(191.0f), zmn(24.0f));
        layoutParams2.addRule(13);
        zgVar.setGravity(17);
        zgVar.setText("Ad Report");
        zgVar.setTextColor(Color.parseColor("#161823"));
        zgVar.setTextSize(1, 17.0f);
        zgVar.setLayoutParams(layoutParams2);
        this.hhw = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(zmn(40.0f), zmn(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = zmn(8.0f);
        this.hhw.setPadding(zmn(12.0f), zmn(14.0f), zmn(12.0f), zmn(14.0f));
        this.hhw.setImageResource(com.bytedance.sdk.component.utils.doe.fb(context, "tt_ad_xmark"));
        this.hhw.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, zmn(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = zmn(16.0f);
        layoutParams5.rightMargin = zmn(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(zmn(16.0f));
        layoutParams5.setMarginEnd(zmn(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        btkVar2.setOrientation(1);
        btkVar2.setLayoutParams(layoutParams6);
        String hhw = oub.hhw();
        String zg = oub.zg();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn = zmn(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn2 = zmn(context, "App", hhw);
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn3 = zmn(context, "App version", zg);
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn4 = zmn(context, b.d, str);
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn5 = zmn(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn6 = zmn(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, zmn(76.0f));
        btkVar3.setBackgroundColor(-1);
        btkVar3.setLayoutParams(layoutParams7);
        this.btk = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int zmn7 = zmn(16.0f);
        layoutParams8.setMargins(zmn7, zmn7, zmn7, zmn7);
        this.btk.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_ad_report_info_button_bg"));
        this.btk.setText("copy all");
        this.btk.setTextColor(Color.parseColor("#333333"));
        this.btk.setTextSize(14.0f);
        this.btk.setLayoutParams(layoutParams8);
        btkVar.addView(npsVar);
        npsVar.addView(zgVar);
        npsVar.addView(this.hhw);
        btkVar.addView(view);
        btkVar.addView(scrollView);
        scrollView.addView(btkVar2);
        btkVar2.addView(zmn);
        btkVar2.addView(zmn2);
        btkVar2.addView(zmn3);
        btkVar2.addView(zmn4);
        btkVar2.addView(zmn5);
        btkVar2.addView(zmn6);
        btkVar.addView(btkVar3);
        btkVar3.addView(this.btk);
        return btkVar;
    }

    private com.bytedance.sdk.openadsdk.core.hhw.btk zmn(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : zmn(74.0f));
        btkVar.setOrientation(1);
        btkVar.setPadding(0, zmn(16.0f), 0, zmn(16.0f));
        btkVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = zmn(7.0f);
        zgVar.setIncludeFontPadding(false);
        zgVar.setText(str);
        zgVar.setTextColor(Color.parseColor("#333333"));
        zgVar.setTextSize(16.0f);
        zgVar.setTypeface(Typeface.defaultFromStyle(1));
        zgVar.setLayoutParams(layoutParams2);
        btkVar.addView(zgVar);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        if (str.equals("Creative info")) {
            this.fb = zgVar2;
            zgVar2.setMaxLines(2);
            zgVar2.setEllipsize(TextUtils.TruncateAt.END);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        zgVar2.setIncludeFontPadding(false);
        zgVar2.setTextColor(Color.parseColor("#666666"));
        zgVar2.setText(str2);
        zgVar2.setTextSize(14.0f);
        zgVar2.setLayoutParams(layoutParams3);
        btkVar.addView(zgVar2);
        return btkVar;
    }

    private int zmn(float f) {
        return jy.fs(getContext(), f);
    }
}
