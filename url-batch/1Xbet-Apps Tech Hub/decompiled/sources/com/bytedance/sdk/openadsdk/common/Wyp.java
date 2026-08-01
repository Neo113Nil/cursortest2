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
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTPrivacyAdReportDialog.java */
/* loaded from: classes2.dex */
public class Wyp extends Dialog {
    private static final String[] icD = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private TextView Jd;
    private Button NB;
    private final Handler pvs;
    private ImageView sUS;
    private String vG;

    public Wyp(Context context) {
        super(context, uc.sUS(context, "tt_privacy_dialog_theme_ad_report"));
        this.pvs = new Handler(Looper.getMainLooper());
        this.vG = "";
    }

    public void pvs(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.vG = com.bytedance.sdk.component.utils.pvs.pvs(new JSONObject(str)).toString();
        } catch (JSONException e) {
            Ju.pvs("TTPrivacyAdReportDialog", e.getMessage());
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(pvs(getContext()), new ViewGroup.LayoutParams(Pj.vG(getContext()), (int) (Pj.Jd(getContext()) * 0.9d)));
        icD();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    private void icD() {
        final String NB = jlb.NB();
        final String yiw = jlb.yiw();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.NB.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Wyp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) Wyp.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, NB, yiw, str, str2, Wyp.this.vG};
                    for (int i = 0; i < Wyp.icD.length; i++) {
                        sb.append(Wyp.icD[i]).append(": ").append(strArr[i]).append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.sUS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Wyp.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Wyp.this.Jd.setText("loading ...");
                Wyp.this.cancel();
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.pvs.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.Wyp.3
                @Override // java.lang.Runnable
                public void run() {
                    Wyp.this.Jd.setText(Wyp.this.vG);
                }
            }, 1000L);
        } catch (Exception e) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }

    private View pvs(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        pAGLinearLayout.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_ad_report_info_bg"));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, pvs(44.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(pvs(191.0f), pvs(24.0f));
        layoutParams2.addRule(13);
        pAGTextView.setGravity(17);
        pAGTextView.setText("Ad Report");
        pAGTextView.setTextColor(Color.parseColor("#161823"));
        pAGTextView.setTextSize(1, 17.0f);
        pAGTextView.setLayoutParams(layoutParams2);
        this.sUS = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(pvs(40.0f), pvs(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = pvs(8.0f);
        this.sUS.setPadding(pvs(12.0f), pvs(14.0f), pvs(12.0f), pvs(14.0f));
        this.sUS.setImageResource(uc.Jd(context, "tt_ad_xmark"));
        this.sUS.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, pvs(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = pvs(16.0f);
        layoutParams5.rightMargin = pvs(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(pvs(16.0f));
        layoutParams5.setMarginEnd(pvs(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setLayoutParams(layoutParams6);
        String NB = jlb.NB();
        String yiw = jlb.yiw();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        PAGLinearLayout pvs = pvs(context, "SDK version", BuildConfig.VERSION_NAME);
        PAGLinearLayout pvs2 = pvs(context, "App", NB);
        PAGLinearLayout pvs3 = pvs(context, "App version", yiw);
        PAGLinearLayout pvs4 = pvs(context, "OS", str);
        PAGLinearLayout pvs5 = pvs(context, "Device", str2);
        PAGLinearLayout pvs6 = pvs(context, "Creative info", "loading ...");
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, pvs(76.0f));
        pAGLinearLayout3.setBackgroundColor(Color.parseColor("#ffffff"));
        pAGLinearLayout3.setLayoutParams(layoutParams7);
        this.NB = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int pvs7 = pvs(16.0f);
        layoutParams8.setMargins(pvs7, pvs7, pvs7, pvs7);
        this.NB.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(context, "tt_ad_report_info_button_bg"));
        this.NB.setText("copy all");
        this.NB.setTextColor(Color.parseColor("#333333"));
        this.NB.setTextSize(14.0f);
        this.NB.setLayoutParams(layoutParams8);
        pAGLinearLayout.addView(pAGRelativeLayout);
        pAGRelativeLayout.addView(pAGTextView);
        pAGRelativeLayout.addView(this.sUS);
        pAGLinearLayout.addView(view);
        pAGLinearLayout.addView(scrollView);
        scrollView.addView(pAGLinearLayout2);
        pAGLinearLayout2.addView(pvs);
        pAGLinearLayout2.addView(pvs2);
        pAGLinearLayout2.addView(pvs3);
        pAGLinearLayout2.addView(pvs4);
        pAGLinearLayout2.addView(pvs5);
        pAGLinearLayout2.addView(pvs6);
        pAGLinearLayout.addView(pAGLinearLayout3);
        pAGLinearLayout3.addView(this.NB);
        return pAGLinearLayout;
    }

    private PAGLinearLayout pvs(Context context, String str, String str2) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : pvs(74.0f));
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setPadding(0, pvs(16.0f), 0, pvs(16.0f));
        pAGLinearLayout.setLayoutParams(layoutParams);
        PAGTextView pAGTextView = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = pvs(7.0f);
        pAGTextView.setIncludeFontPadding(false);
        pAGTextView.setText(str);
        pAGTextView.setTextColor(Color.parseColor("#333333"));
        pAGTextView.setTextSize(16.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(1));
        pAGTextView.setLayoutParams(layoutParams2);
        pAGLinearLayout.addView(pAGTextView);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        if (str.equals("Creative info")) {
            this.Jd = pAGTextView2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        pAGTextView2.setIncludeFontPadding(false);
        pAGTextView2.setTextColor(Color.parseColor("#666666"));
        pAGTextView2.setText(str2);
        pAGTextView2.setTextSize(14.0f);
        pAGTextView2.setLayoutParams(layoutParams3);
        pAGLinearLayout.addView(pAGTextView2);
        return pAGLinearLayout;
    }

    private int pvs(float f) {
        return Pj.icD(getContext(), f);
    }
}
