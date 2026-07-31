package com.bytedance.sdk.openadsdk.core.widget;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.utils.bjh;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class fs extends Dialog {
    private com.bytedance.sdk.openadsdk.core.hhw.zmn btk;
    private String bvs;
    private boolean cn;
    private boolean cyb;
    private com.bytedance.sdk.openadsdk.core.hhw.zg fb;
    private com.bytedance.sdk.openadsdk.core.hhw.fb fs;
    private com.bytedance.sdk.openadsdk.core.hhw.zmn hhw;
    private String iv;
    private float kgc;
    private String klz;
    private int kw;
    private int mw;
    private View nps;
    private int olo;
    private String rc;
    private OnBackInvokedCallback rt;
    private final Context zg;
    public InterfaceC0184fs zmn;
    private com.bytedance.sdk.openadsdk.core.hhw.zg zn;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.fs$fs, reason: collision with other inner class name */
    public interface InterfaceC0184fs {
        void fs();

        void zmn();
    }

    private static class zmn implements OnBackInvokedCallback {
        private final WeakReference<fs> zmn;

        zmn(fs fsVar) {
            this.zmn = new WeakReference<>(fsVar);
        }

        public void onBackInvoked() {
            fs fsVar = this.zmn.get();
            if (fsVar != null) {
                com.bytedance.sdk.component.utils.iqz.zmn("CustomCommonDialog", "onBackInvoked");
                fsVar.onBackPressed();
            }
        }
    }

    public fs(Context context) {
        super(context, doe.hhw(context, "tt_custom_dialog"));
        this.mw = -1;
        this.cn = false;
        this.cyb = false;
        this.zg = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        boolean am = com.bytedance.sdk.openadsdk.core.kgc.fb().am();
        this.cyb = am;
        if (am) {
            this.olo = Color.argb(166, 0, 0, 0);
            this.kgc = 16.0f;
            this.kw = Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR);
            setContentView(fs(this.zg));
        } else {
            setContentView(zmn(this.zg));
        }
        if (bjh.zmn()) {
            com.bytedance.sdk.component.utils.iqz.zmn("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.rt = new zmn(this);
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.rt);
        }
        setCanceledOnTouchOutside(false);
        fs();
        zmn();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.iqz.zmn("CustomCommonDialog", "onBackPressed");
    }

    private void zmn() {
        this.hhw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.fs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/fs$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fs$1_onClick_13c829cbd21f2895424e362b17fa8536(view);
            }

            public void safedk_fs$1_onClick_13c829cbd21f2895424e362b17fa8536(View p0) {
                InterfaceC0184fs interfaceC0184fs = fs.this.zmn;
                if (interfaceC0184fs != null) {
                    interfaceC0184fs.zmn();
                }
            }
        });
        this.btk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.fs.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/fs$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fs$2_onClick_4cbba7a98e28c79ca385bfb41620b8df(view);
            }

            public void safedk_fs$2_onClick_4cbba7a98e28c79ca385bfb41620b8df(View p0) {
                InterfaceC0184fs interfaceC0184fs = fs.this.zmn;
                if (interfaceC0184fs != null) {
                    interfaceC0184fs.fs();
                }
            }
        });
    }

    private void fs() {
        if (!TextUtils.isEmpty(this.iv)) {
            this.zn.setText(this.iv);
            this.zn.setVisibility(0);
        } else {
            this.zn.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.bvs)) {
            this.fb.setText(this.bvs);
        }
        if (!TextUtils.isEmpty(this.rc)) {
            this.hhw.setText(this.rc);
        } else {
            this.hhw.setText(doe.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.klz)) {
            this.btk.setText(this.klz);
        } else {
            this.btk.setText(doe.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), "tt_negtive_txt"));
        }
        int i = this.mw;
        if (i != -1) {
            this.fs.setImageResource(i);
            this.fs.setVisibility(0);
        } else {
            this.fs.setVisibility(8);
        }
        if (this.cn) {
            this.nps.setVisibility(8);
            this.btk.setVisibility(8);
        } else {
            this.btk.setVisibility(0);
            this.nps.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        fs();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        zn();
    }

    private void zn() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (this.rt == null || !bjh.zmn()) {
            return;
        }
        com.bytedance.sdk.component.utils.iqz.zmn("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.rt);
    }

    private View zmn(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar = new com.bytedance.sdk.openadsdk.core.hhw.nps(context);
        npsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        btkVar.setMinimumWidth(zmn(260.0f));
        btkVar.setPadding(0, zmn(32.0f), 0, 0);
        btkVar.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_custom_dialog_bg"));
        btkVar.setOrientation(1);
        btkVar.setLayoutParams(layoutParams);
        this.zn = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = zmn(16.0f);
        layoutParams2.rightMargin = zmn(16.0f);
        layoutParams2.bottomMargin = zmn(16.0f);
        this.zn.setGravity(17);
        this.zn.setVisibility(0);
        this.zn.setTextColor(Color.parseColor("#333333"));
        this.zn.setTextSize(18.0f);
        this.zn.setLayoutParams(layoutParams2);
        this.fs = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = zmn(16.0f);
        layoutParams3.rightMargin = zmn(16.0f);
        layoutParams3.bottomMargin = zmn(10.0f);
        this.fs.setMaxHeight(zmn(150.0f));
        this.fs.setMaxWidth(zmn(150.0f));
        this.fs.setVisibility(0);
        this.fs.setLayoutParams(layoutParams3);
        this.fb = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = zmn(20.0f);
        layoutParams4.rightMargin = zmn(20.0f);
        this.fb.setGravity(17);
        this.fb.setLineSpacing(zmn(3.0f), 1.2f);
        this.fb.setTextSize(18.0f);
        this.fb.setTextColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
        this.fb.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = zmn(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        btkVar2.setOrientation(0);
        btkVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.hhw.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.hhw.zmn(context);
        this.btk = zmnVar;
        zmnVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = zmn(10.0f);
        layoutParams7.weight = 1.0f;
        this.btk.setPadding(0, zmn(16.0f), 0, zmn(16.0f));
        this.btk.setBackground(null);
        this.btk.setGravity(17);
        this.btk.setSingleLine(true);
        this.btk.setTextColor(Color.parseColor("#999999"));
        this.btk.setTextSize(16.0f);
        this.btk.setLayoutParams(layoutParams7);
        this.nps = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.nps.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.nps.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.hhw.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zmn(context);
        this.hhw = zmnVar2;
        zmnVar2.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = zmn(10.0f);
        layoutParams9.weight = 1.0f;
        this.hhw.setPadding(0, zmn(16.0f), 0, zmn(16.0f));
        this.hhw.setBackground(null);
        this.hhw.setGravity(17);
        this.hhw.setSingleLine(true);
        this.hhw.setTextColor(Color.parseColor("#38ADFF"));
        this.hhw.setTextSize(16.0f);
        this.hhw.setLayoutParams(layoutParams9);
        npsVar.addView(btkVar);
        btkVar.addView(this.zn);
        btkVar.addView(this.fs);
        btkVar.addView(this.fb);
        btkVar.addView(view);
        btkVar.addView(btkVar2);
        btkVar2.addView(this.btk);
        btkVar2.addView(this.nps);
        btkVar2.addView(this.hhw);
        return npsVar;
    }

    private View fs(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar = new com.bytedance.sdk.openadsdk.core.hhw.nps(context);
        npsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        btkVar.setMinimumWidth(zmn(280.0f));
        btkVar.setPadding(0, zmn(32.0f), 0, 0);
        btkVar.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_custom_dialog_bg_new"));
        btkVar.setOrientation(1);
        btkVar.setLayoutParams(layoutParams);
        this.zn = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = zmn(16.0f);
        layoutParams2.rightMargin = zmn(16.0f);
        layoutParams2.bottomMargin = zmn(16.0f);
        this.zn.setGravity(17);
        this.zn.setVisibility(0);
        this.zn.setTextColor(Color.parseColor("#333333"));
        this.zn.setTextSize(20.0f);
        this.zn.setTypeface(Typeface.defaultFromStyle(1));
        this.zn.setLineSpacing(0.0f, 1.3f);
        this.zn.setLetterSpacing(0.015f);
        this.zn.setLayoutParams(layoutParams2);
        this.fs = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = zmn(16.0f);
        layoutParams3.rightMargin = zmn(16.0f);
        layoutParams3.bottomMargin = zmn(10.0f);
        this.fs.setMaxHeight(zmn(150.0f));
        this.fs.setMaxWidth(zmn(150.0f));
        this.fs.setVisibility(0);
        this.fs.setLayoutParams(layoutParams3);
        this.fb = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = zmn(20.0f);
        layoutParams4.rightMargin = zmn(20.0f);
        this.fb.setGravity(17);
        this.fb.setLineSpacing(0.0f, 1.3f);
        this.fb.setLetterSpacing(0.004f);
        this.fb.setTextSize(15.0f);
        this.fb.setTextColor(this.olo);
        this.fb.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = zmn(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        btkVar2.setOrientation(0);
        btkVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.hhw.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.hhw.zmn(context);
        this.btk = zmnVar;
        zmnVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = zmn(10.0f);
        layoutParams7.weight = 1.0f;
        this.btk.setPadding(0, zmn(16.0f), 0, zmn(16.0f));
        this.btk.setBackground(null);
        this.btk.setGravity(17);
        this.btk.setSingleLine(true);
        this.btk.setTextSize(2, this.kgc);
        this.btk.setLineSpacing(0.0f, 1.3f);
        this.btk.setLetterSpacing(0.0019f);
        this.btk.setTypeface(Typeface.defaultFromStyle(0));
        this.btk.setTextColor(ColorStateList.valueOf(this.olo));
        this.btk.setLayoutParams(layoutParams7);
        this.nps = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.nps.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.nps.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.hhw.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zmn(context);
        this.hhw = zmnVar2;
        zmnVar2.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = zmn(10.0f);
        layoutParams9.weight = 1.0f;
        this.hhw.setPadding(0, zmn(16.0f), 0, zmn(16.0f));
        this.hhw.setBackground(null);
        this.hhw.setGravity(17);
        this.hhw.setSingleLine(true);
        int i = Build.VERSION.SDK_INT;
        this.hhw.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface create = i >= 28 ? Typeface.create(this.hhw.getTypeface(), 500, false) : null;
        if (create != null) {
            this.hhw.setTypeface(create);
        }
        this.hhw.setLineSpacing(0.0f, 1.3f);
        this.hhw.setLetterSpacing(0.0019f);
        this.hhw.setTextColor(ColorStateList.valueOf(this.kw));
        this.hhw.setTextSize(this.kgc);
        this.hhw.setLayoutParams(layoutParams9);
        npsVar.addView(btkVar);
        btkVar.addView(this.zn);
        btkVar.addView(this.fs);
        btkVar.addView(this.fb);
        btkVar.addView(view);
        btkVar.addView(btkVar2);
        btkVar2.addView(this.btk);
        btkVar2.addView(this.nps);
        btkVar2.addView(this.hhw);
        return npsVar;
    }

    private int zmn(float f) {
        return jy.fs(getContext(), f);
    }

    public fs zmn(InterfaceC0184fs interfaceC0184fs) {
        this.zmn = interfaceC0184fs;
        return this;
    }

    public fs zmn(String str) {
        this.bvs = str;
        return this;
    }

    public fs fs(String str) {
        this.iv = str;
        return this;
    }

    public fs zn(String str) {
        this.rc = str;
        return this;
    }

    public fs fb(String str) {
        this.klz = str;
        return this;
    }
}
