package com.bytedance.sdk.openadsdk.zn;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.zn.iv;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.List;

/* loaded from: classes15.dex */
public class bvs extends com.bytedance.sdk.openadsdk.core.hhw.zn implements iv.fb, iv.fs, iv.zmn, iv.zn {
    private com.bytedance.sdk.openadsdk.core.hhw.zg btk;
    private View bvs;
    private final iv fb;
    private int fs;
    private TextView hhw;
    private com.bytedance.sdk.openadsdk.core.hhw.fb iv;
    private int klz;
    private int mw;
    private rc nps;
    private com.bytedance.sdk.openadsdk.core.hhw.zg rc;
    private FilterWord rt;
    private View zg;
    hhw zmn;
    private int zn;

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

    public bvs(Context context, iv ivVar) {
        this(context, ivVar, null);
    }

    public bvs(Context context, iv ivVar, List<FilterWord> list) {
        super(context);
        this.fb = ivVar;
        ivVar.zmn((iv.zn) this);
        ivVar.zmn((iv.fs) this);
        ivVar.zmn((iv.fb) this);
        ivVar.zmn((iv.zmn) this);
        zn();
        zmn(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        fs(list);
    }

    private void zn() {
        if (this.klz > 0) {
            return;
        }
        this.klz = jy.zn(getContext());
        int btk = jy.btk(getContext());
        this.mw = btk;
        this.fb.zmn(this.klz, btk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.klz == 0) {
                zn();
            }
            layoutParams.width = Math.min(this.klz, this.mw) - (jy.fs(getContext(), 16.0f) * 2);
        }
    }

    private void zmn(Context context) {
        this.zn = jy.fs(context, 8.0f);
        this.fs = jy.fs(context, 20.0f);
        int fs = jy.fs(context, 56.0f);
        int fs2 = jy.fs(context, 30.0f);
        int fs3 = jy.fs(context, 12.0f);
        if (fb()) {
            fs3 = this.fs;
        }
        if (!fb()) {
            fs = fs2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, jy.fs(getContext(), 98.0f));
        view.setBackground(doe.zn(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.zn);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        int fs4 = jy.fs(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(fs4, fs4);
        layoutParams3.setMargins(0, fs3, fs3, 0);
        layoutParams3.gravity = 8388661;
        fbVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_titlebar_close_seletor"));
        addView(fbVar, layoutParams3);
        fbVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zn.bvs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/bvs$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_bvs$1_onClick_82bde26398078854207bee832ef31ca3(view2);
            }

            public void safedk_bvs$1_onClick_82bde26398078854207bee832ef31ca3(View p0) {
                bvs.this.fb.btk();
            }
        });
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        this.iv = fbVar2;
        fbVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zn.bvs.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/bvs$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_bvs$2_onClick_3f05ce595fa538c83fc08eef83f551ec(view2);
            }

            public void safedk_bvs$2_onClick_3f05ce595fa538c83fc08eef83f551ec(View p0) {
                bvs.this.fs();
            }
        });
        this.iv.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(fs4, fs4);
        layoutParams4.setMargins(fs3, fs3, 0, 0);
        layoutParams4.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        Drawable zmn = com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_leftbackicon_selector");
        zmn.setAutoMirrored(true);
        this.iv.setImageDrawable(zmn);
        addView(this.iv, layoutParams4);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(fs3, fs, fs3, fs3);
        btkVar.setOrientation(1);
        addView(btkVar, layoutParams5);
        View zn = zn(context);
        this.zg = zn;
        btkVar.addView(zn);
        View fb = fb(context);
        this.bvs = fb;
        btkVar.addView(fb);
        com.bytedance.sdk.openadsdk.core.hhw.zg fs5 = fs(context);
        this.btk = fs5;
        btkVar.addView(fs5);
    }

    private com.bytedance.sdk.openadsdk.core.hhw.zg fs(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = fb() ? this.fs : jy.fs(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.zn);
        int rgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(rgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.zn);
        gradientDrawable2.setColor(rgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i = this.zn;
        zgVar.setPadding(0, i, 0, i);
        zgVar.setGravity(17);
        zgVar.setBackground(stateListDrawable);
        zgVar.setTextColor(-1);
        zgVar.setTextSize(16.0f);
        zgVar.setText(doe.zmn(context, "tt_suggestion_commit"));
        zgVar.setEnabled(false);
        zgVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zn.bvs.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/bvs$3;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_bvs$3_onClick_7abe8892ecb4828d9152a06ca560bfc8(view);
            }

            public void safedk_bvs$3_onClick_7abe8892ecb4828d9152a06ca560bfc8(View p0) {
                bvs.this.fb.fb();
            }
        });
        zgVar.setLayoutParams(layoutParams);
        return zgVar;
    }

    private View zn(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        btkVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(doe.zmn(context, "tt_like_this_ad"));
        textView.setTextSize(fb() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        btkVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(doe.zmn(context, "tt_feel_hint"));
        textView2.setTextSize(fb() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (fb()) {
            layoutParams2.topMargin = jy.fs(context, 4.0f);
        }
        btkVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int fs = jy.fs(context, 16.0f);
        int fs2 = jy.fs(context, 12.0f);
        int fs3 = jy.fs(context, 8.0f);
        if (fb()) {
            layoutParams3.topMargin = fs;
            layoutParams3.bottomMargin = fs;
        } else {
            layoutParams3.topMargin = fs2;
            layoutParams3.bottomMargin = fs3;
        }
        btkVar.addView(btkVar2, layoutParams3);
        btkVar2.addView(new btk(context, 1, this.fb));
        btk btkVar3 = new btk(context, 2, this.fb);
        ViewGroup.LayoutParams layoutParams4 = btkVar3.getLayoutParams();
        boolean z = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = fs;
        layoutParams7.rightMargin = fs;
        btkVar2.addView(btkVar3, layoutParams5);
        btkVar2.addView(new btk(context, 3, this.fb));
        rc rcVar = new rc(context);
        this.nps = rcVar;
        btkVar.addView(rcVar);
        this.hhw = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!fb()) {
            fs = fs3;
        }
        layoutParams8.topMargin = fs;
        this.hhw.setTextColor(-16777216);
        this.hhw.setPadding(fs2, fs3, fs2, fs3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fs3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.hhw.setBackground(gradientDrawable);
        this.hhw.setText(doe.zmn(context, "tt_report_this_ad"));
        this.hhw.setTextSize(fb() ? 14 : 12);
        Drawable zn = doe.zn(context, "tt_report_ad_arrow");
        zn.setBounds(0, 0, fs2, fs2);
        this.hhw.setCompoundDrawables(null, null, zn, null);
        this.hhw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zn.bvs.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/bvs$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_bvs$4_onClick_d3d88c642bc1c9f4356a855c2d4a3a55(view);
            }

            public void safedk_bvs$4_onClick_d3d88c642bc1c9f4356a855c2d4a3a55(View p0) {
                bvs.this.zmn();
            }
        });
        btkVar.addView(this.hhw, layoutParams8);
        return btkVar;
    }

    private boolean fb() {
        if (this.klz == 0) {
            zn();
        }
        return this.klz < this.mw;
    }

    private View fb(Context context) {
        int fs;
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setOrientation(1);
        if (!fb()) {
            fs = jy.fs(context, 200.0f);
        } else {
            fs = jy.fs(context, 358.0f);
        }
        btkVar.setLayoutParams(new LinearLayout.LayoutParams(-1, fs));
        TextView textView = new TextView(context);
        textView.setText(doe.zmn(context, "tt_select_reason"));
        textView.setTextSize(fb() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = jy.fs(context, fb() ? 24.0f : 4.0f);
        btkVar.addView(textView, layoutParams);
        hhw hhwVar = new hhw(context, this.fb);
        this.zmn = hhwVar;
        btkVar.addView(hhwVar);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.rc = zgVar;
        zgVar.setId(olo.xz);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = fb() ? this.fs : jy.fs(context, 6.0f);
        layoutParams2.gravity = 17;
        this.rc.setLayoutParams(layoutParams2);
        this.rc.setFocusable(false);
        this.rc.setHint(doe.zmn(context, "tt_add_bad_reason"));
        this.rc.setHintTextColor(Color.parseColor("#57000000"));
        this.rc.setTextColor(Color.rgb(22, 24, 35));
        this.rc.setTextSize(15.0f);
        this.rc.setGravity(8388615);
        this.rc.setVisibility(0);
        this.rc.setPadding(0, jy.fs(context, 15.0f), 0, jy.fs(context, 14.0f));
        this.rc.setEllipsize(TextUtils.TruncateAt.END);
        this.rc.setSingleLine();
        this.rc.setMaxLines(1);
        this.rc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zn.bvs.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/bvs$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_bvs$5_onClick_9f19df7aa674c3ea390092cc3d0fef0c(view);
            }

            public void safedk_bvs$5_onClick_9f19df7aa674c3ea390092cc3d0fef0c(View p0) {
                bvs.this.fb.hhw();
            }
        });
        btkVar.addView(this.rc, layoutParams2);
        btkVar.addView(new rc(context, Color.argb(128, 0, 0, 0)));
        btkVar.setVisibility(8);
        return btkVar;
    }

    private void fs(List<FilterWord> list) {
        this.zmn.zmn(list);
    }

    public void zmn() {
        View view = this.bvs;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.zg;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = this.iv;
        if (fbVar != null) {
            fbVar.setVisibility(0);
        }
        iv ivVar = this.fb;
        if (ivVar == null || !ivVar.zn()) {
            return;
        }
        this.rt = this.fb.fs();
    }

    public void fs() {
        View view = this.bvs;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.zg;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = this.iv;
        if (fbVar != null) {
            fbVar.setVisibility(8);
        }
        iv ivVar = this.fb;
        if (ivVar != null) {
            FilterWord filterWord = this.rt;
            if (filterWord != null) {
                ivVar.zmn(filterWord);
            } else {
                ivVar.zmn(iv.zmn);
            }
            this.fb.zn(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zn.iv.zn
    public void zmn(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.btk != null && TextUtils.isEmpty(this.fb.nps())) {
            this.btk.setEnabled(!iv.zmn.equals(filterWord));
        }
        if (btk.zmn.equals(filterWord) || btk.fs.equals(filterWord)) {
            this.hhw.setVisibility(8);
            this.nps.setVisibility(8);
        }
        if (btk.zn.equals(filterWord) || iv.zmn.equals(filterWord)) {
            this.hhw.setVisibility(0);
            this.nps.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zn.iv.fs
    public void zmn(int i) {
        if (iv.zn == i) {
            this.rt = null;
            fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zn.iv.fb
    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar;
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = this.rc;
        if (zgVar2 != null) {
            zgVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            iv ivVar = this.fb;
            if (ivVar == null || (zgVar = this.btk) == null) {
                return;
            }
            zgVar.setEnabled(ivVar.zn());
            return;
        }
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = this.btk;
        if (zgVar3 != null) {
            zgVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zn.iv.zmn
    public void zmn(List<FilterWord> list) {
        fs(list);
    }
}
