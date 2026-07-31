package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class phc extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    private boolean fb;
    private LinearLayout fs;
    private Context zmn;
    private zmn zn;

    public interface zmn {
        void btk();

        void fb();

        void fs();

        void hhw();

        void zmn();

        void zn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public phc(Context context, boolean z) {
        super(context);
        this.zmn = context;
        this.fb = z;
        fs();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void fs() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.phc.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/phc$1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
                return safedk_phc$1_onTouch_178186ba62afe1319300d8fa11fc6f01(view, motionEvent);
            }

            public boolean safedk_phc$1_onTouch_178186ba62afe1319300d8fa11fc6f01(View p0, MotionEvent p1) {
                if (p1.getAction() == 1) {
                    Rect rect = new Rect();
                    phc.this.fs.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) p1.getRawX(), (int) p1.getRawY())) {
                        phc.this.zmn();
                    }
                }
                return true;
            }
        });
        LinearLayout linearLayout = new LinearLayout(this.zmn);
        this.fs = linearLayout;
        linearLayout.setOrientation(1);
        this.fs.setGravity(80);
        this.fs.setPadding(zmn(16.0f), 0, zmn(16.0f), zmn(58.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(zmn(16.0f));
        gradientDrawable.setColor(Color.parseColor("#E1E1E1"));
        this.fs.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = zmn(16.0f);
        this.fs.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this.zmn);
        znVar.setPadding(zmn(6.0f), 0, zmn(6.0f), 0);
        znVar.setLayoutParams(new LinearLayout.LayoutParams(-1, zmn(44.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(this.zmn);
        Context context = this.zmn;
        zgVar.setText(context.getString(com.bytedance.sdk.component.utils.doe.fs(context, "tt_more_title")));
        zgVar.setTextColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
        zgVar.setTextSize(2, 17.0f);
        zgVar.setGravity(17);
        zgVar.setTypeface(Typeface.defaultFromStyle(1));
        znVar.addView(zgVar, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.zmn);
        imageView.setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.zmn, "tt_titlebar_close_drawable"));
        imageView.setPadding(zmn(10.0f), zmn(10.0f), zmn(10.0f), zmn(10.0f));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.phc.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/phc$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_phc$2_onClick_a88dc7021fee4e757738022abb783653(view);
            }

            public void safedk_phc$2_onClick_a88dc7021fee4e757738022abb783653(View p0) {
                phc.this.zmn();
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(zmn(44.0f), zmn(44.0f));
        layoutParams2.gravity = 8388629;
        znVar.addView(imageView, layoutParams2);
        this.fs.addView(znVar);
        boolean zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_iab_history", true);
        if (!this.fb && zmn2) {
            com.bytedance.sdk.openadsdk.core.hhw.btk zmn3 = zmn(8);
            Context context2 = this.zmn;
            zmn(zmn3, context2.getString(com.bytedance.sdk.component.utils.doe.fs(context2, "tt_more_history")), "tt_more_history_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.phc.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/phc$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_phc$3_onClick_b9c91f8f1049693799623f8fa8bca97a(view);
                }

                public void safedk_phc$3_onClick_b9c91f8f1049693799623f8fa8bca97a(View p0) {
                    if (phc.this.zn != null) {
                        phc.this.zn.zmn();
                    }
                }
            });
            this.fs.addView(zmn3);
        }
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn4 = zmn(8);
        Context context3 = this.zmn;
        zmn(zmn4, context3.getString(com.bytedance.sdk.component.utils.doe.fs(context3, "tt_more_retry")), "tt_more_retry_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.phc.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/phc$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_phc$4_onClick_98710db56859efede2b2ecb9e00ba7ab(view);
            }

            public void safedk_phc$4_onClick_98710db56859efede2b2ecb9e00ba7ab(View p0) {
                if (phc.this.zn != null) {
                    phc.this.zn.fs();
                }
            }
        });
        Context context4 = this.zmn;
        zmn(zmn4, context4.getString(com.bytedance.sdk.component.utils.doe.fs(context4, "tt_more_copy_link")), "tt_more_copy_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.phc.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/phc$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_phc$5_onClick_ce448b9e7138609d36a2347d033753c6(view);
            }

            public void safedk_phc$5_onClick_ce448b9e7138609d36a2347d033753c6(View p0) {
                if (phc.this.zn != null) {
                    phc.this.zn.zn();
                }
            }
        });
        Context context5 = this.zmn;
        zmn(zmn4, context5.getString(com.bytedance.sdk.component.utils.doe.fs(context5, "tt_more_open_browser")), "tt_more_browser_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.phc.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/phc$6;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_phc$6_onClick_a454d0be805037f680119be3ecb5ce9f(view);
            }

            public void safedk_phc$6_onClick_a454d0be805037f680119be3ecb5ce9f(View p0) {
                if (phc.this.zn != null) {
                    phc.this.zn.fb();
                }
            }
        });
        this.fs.addView(zmn4);
        com.bytedance.sdk.openadsdk.core.hhw.btk zmn5 = zmn(8);
        if (!this.fb) {
            Context context6 = this.zmn;
            zmn(zmn5, context6.getString(com.bytedance.sdk.component.utils.doe.fs(context6, "tt_privacy")), "tt_more_privacy_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.phc.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/phc$7;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_phc$7_onClick_2e9beb5cbc413a9ad034f96c37199720(view);
                }

                public void safedk_phc$7_onClick_2e9beb5cbc413a9ad034f96c37199720(View p0) {
                    if (phc.this.zn != null) {
                        phc.this.zn.hhw();
                    }
                }
            });
        }
        Context context7 = this.zmn;
        zmn(zmn5, context7.getString(com.bytedance.sdk.component.utils.doe.fs(context7, "tt_more_report")), "tt_more_report_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.phc.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/phc$8;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_phc$8_onClick_29f31e91a34bbf02ff21622ab7a048f4(view);
            }

            public void safedk_phc$8_onClick_29f31e91a34bbf02ff21622ab7a048f4(View p0) {
                if (phc.this.zn != null) {
                    phc.this.zn.btk();
                }
            }
        });
        this.fs.addView(zmn5);
        addView(this.fs);
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.hhw.btk btkVar, String str, String str2, View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(this.zmn);
        btkVar2.setOrientation(0);
        btkVar2.setGravity(16);
        btkVar2.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(this.zmn);
        imageView.setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.zmn, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(zmn(20.0f), zmn(20.0f));
        layoutParams.setMargins(zmn(16.0f), zmn(0.0f), zmn(16.0f), zmn(0.0f));
        btkVar2.addView(imageView, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(this.zmn);
        zgVar.setText(str);
        zgVar.setTextColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
        zgVar.setTextSize(2, 16.0f);
        zgVar.setGravity(8388627);
        zgVar.setTypeface(Typeface.defaultFromStyle(0));
        btkVar2.addView(zgVar, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, zmn(52.0f));
        if (btkVar.getChildCount() > 0) {
            View view = new View(this.zmn);
            view.setBackgroundColor(Color.parseColor("#1F000000"));
            btkVar.addView(view, new LinearLayout.LayoutParams(-1, zmn(1.0f)));
        }
        btkVar.addView(btkVar2, layoutParams2);
    }

    private com.bytedance.sdk.openadsdk.core.hhw.btk zmn(int i) {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this.zmn);
        btkVar.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(zmn(i));
        gradientDrawable.setColor(-1);
        btkVar.setBackgroundDrawable(gradientDrawable);
        btkVar.setPadding(zmn(8.0f), zmn(8.0f), zmn(8.0f), zmn(8.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = zmn(8.0f);
        btkVar.setLayoutParams(layoutParams);
        return btkVar;
    }

    public void zmn(View view) {
        View findViewById = view.getRootView().findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (getParent() == null) {
            ((ViewGroup) findViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    public void zmn() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public void setOnMenuItemClickListener(zmn zmnVar) {
        this.zn = zmnVar;
    }

    private int zmn(float f) {
        return jy.fs(this.zmn, f);
    }
}
