package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.zak;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity;
import com.bytedance.sdk.openadsdk.common.olo;
import com.bytedance.sdk.openadsdk.common.phc;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.zmn.nps;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class doe {
    private boolean am;
    private iqz bjh;
    phc btk;
    private ImageView bvs;
    private boolean cn;
    private final com.bytedance.sdk.component.bvs.nps cyb;
    private TextView doe;
    TTAdDislikeToast fs;
    private final RelativeLayout hhw;
    private View iqz;
    private com.bytedance.sdk.openadsdk.core.hhw.hhw iv;
    private final String kgc;
    private boolean kjb;
    private ImageView klz;
    private boolean kw;
    private ImageView mw;
    private final nqi nps;
    private TextView nqi;
    private nps.zmn olo;
    private ImageView rc;
    private com.bytedance.sdk.openadsdk.core.hhw.btk uqh;
    private final Context zg;
    olo zmn;
    final AtomicBoolean zn = new AtomicBoolean(false);
    final AtomicBoolean fb = new AtomicBoolean(false);
    private boolean phc = false;
    private String rp = "TTTitleNewStyleManager";
    private final String zak = "is_new_style";
    private final int rt = jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), 44.0f);

    public doe(Context context, RelativeLayout relativeLayout, nqi nqiVar, com.bytedance.sdk.component.bvs.nps npsVar, String str, boolean z) {
        boolean z2 = false;
        this.zg = context;
        this.hhw = relativeLayout;
        this.nps = nqiVar;
        this.cyb = npsVar;
        this.kgc = str;
        this.kw = z;
        this.btk = new phc(context, this.kw);
        this.kjb = str.equals("iab_private_browser") || str.equals("iab_landing_page") || str.equals("iab_history_landing_page");
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("lp_cache_enable", false) && str.equals("iab_landing_page")) {
            z2 = true;
        }
        this.am = z2;
        rc();
        klz();
    }

    @SuppressLint({"SetTextI18n"})
    private void rc() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.hhw.getLayoutParams();
        layoutParams.height = this.rt;
        this.hhw.setLayoutParams(layoutParams);
        int fs = jy.fs(this.zg, 8.0f);
        this.hhw.setPadding(fs, 0, fs, 0);
        this.bvs = (ImageView) this.hhw.findViewById(com.bytedance.sdk.openadsdk.utils.olo.nlz);
        this.rc = (ImageView) this.hhw.findViewById(com.bytedance.sdk.openadsdk.utils.olo.wq);
        this.klz = (ImageView) this.hhw.findViewById(com.bytedance.sdk.openadsdk.utils.olo.bmc);
        this.mw = (ImageView) this.hhw.findViewById(520093740);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = (com.bytedance.sdk.openadsdk.core.hhw.btk) this.hhw.findViewById(com.bytedance.sdk.openadsdk.utils.olo.es);
        this.uqh = btkVar;
        this.doe = (TextView) btkVar.findViewById(com.bytedance.sdk.openadsdk.utils.olo.zmn);
        this.nqi = (TextView) this.uqh.findViewById(com.bytedance.sdk.openadsdk.utils.olo.fs);
        if (cn()) {
            this.doe.setTextDirection(4);
            this.nqi.setTextDirection(4);
            this.doe.setGravity(8388629);
            this.nqi.setGravity(8388629);
            this.rc.setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.zg, "tt_titlebar_forward"));
            this.klz.setImageResource(com.bytedance.sdk.component.utils.doe.fb(this.zg, "tt_titlebar_backward"));
        }
        if (this.kjb) {
            this.iv = (com.bytedance.sdk.openadsdk.core.hhw.hhw) this.hhw.findViewById(com.bytedance.sdk.openadsdk.utils.olo.utx);
        } else {
            this.iv = (com.bytedance.sdk.openadsdk.core.hhw.hhw) this.hhw.findViewById(com.bytedance.sdk.openadsdk.utils.olo.ax);
        }
        this.klz.setVisibility(0);
        this.rc.setVisibility(0);
        this.bvs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/doe$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_doe$1_onClick_0e0bd3abde07aec637c58853415c70b4(view);
            }

            public void safedk_doe$1_onClick_0e0bd3abde07aec637c58853415c70b4(View p0) {
                View p02 = doe.this.cyb;
                if (p02 != null) {
                    if (!doe.this.am) {
                        doe.this.cyb.nps();
                        doe.this.cyb.removeAllViews();
                        View p03 = doe.this.cyb;
                        ViewGroup viewGroup = (ViewGroup) p03.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(doe.this.cyb);
                        }
                        doe.this.cyb.cn();
                    } else {
                        Bundle zmn = doe.this.zmn();
                        String rc = doe.this.nps.rc();
                        if (zmn == null || rc == null) {
                            zak.zmn(doe.this.cyb);
                        } else {
                            com.bytedance.sdk.openadsdk.utils.phc.zmn(System.identityHashCode(doe.this.nps) + "_" + rc, doe.this.cyb, zmn);
                        }
                    }
                }
                if (doe.this.zg instanceof Activity) {
                    ((Activity) doe.this.zg).finish();
                }
            }
        });
        this.rc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/doe$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_doe$5_onClick_091b2af1b9feb77667c3719b91dd8deb(view);
            }

            public void safedk_doe$5_onClick_091b2af1b9feb77667c3719b91dd8deb(View p0) {
                View p02 = doe.this.cyb;
                if (p02 == null || !doe.this.cyb.zg()) {
                    return;
                }
                if (doe.this.olo != null) {
                    doe.this.olo.zmn();
                }
                doe.this.cyb.bvs();
            }
        });
        this.klz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/doe$6;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_doe$6_onClick_1e7d56fbd3a0782c75a10cc1c0e92a2f(view);
            }

            public void safedk_doe$6_onClick_1e7d56fbd3a0782c75a10cc1c0e92a2f(View p0) {
                View p02 = doe.this.cyb;
                if (p02 == null || !doe.this.cyb.iv()) {
                    return;
                }
                doe.this.cyb.rc();
            }
        });
        this.mw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/doe$7;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_doe$7_onClick_20238092c8ee9685f35cdb30332b7f78(view);
            }

            public void safedk_doe$7_onClick_20238092c8ee9685f35cdb30332b7f78(View p0) {
                doe doeVar = doe.this;
                doeVar.zmn(doeVar.btk, p0);
            }
        });
        zmn(true);
        this.rc.setClickable(false);
        this.klz.setClickable(false);
        ImageView imageView = this.rc;
        int parseColor = Color.parseColor("#A8FFFFFF");
        PorterDuff.Mode mode = PorterDuff.Mode.ADD;
        imageView.setColorFilter(parseColor, mode);
        this.klz.setColorFilter(Color.parseColor("#A8FFFFFF"), mode);
        this.iqz = this.hhw;
    }

    private void klz() {
        View view = this.iqz;
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/doe$8;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_doe$8_onClick_fc7a3dcbbe490d3e4ac1716d89410c9e(view2);
            }

            public void safedk_doe$8_onClick_fc7a3dcbbe490d3e4ac1716d89410c9e(View p0) {
                if (doe.this.phc) {
                    doe.this.fs();
                    doe.this.phc = false;
                }
            }
        });
    }

    public Bundle zmn() {
        if (this.cyb == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        WebView webView = this.cyb.getWebView();
        if (webView == null) {
            return null;
        }
        bundle.putString("mainTitle", nps());
        bundle.putString("subTitle", zg());
        RelativeLayout relativeLayout = this.hhw;
        bundle.putBoolean("titleBarVisible", relativeLayout != null && relativeLayout.getVisibility() == 0);
        bundle.putString("url", webView.getUrl());
        webView.saveState(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final phc phcVar, View view) {
        phcVar.setOnMenuItemClickListener(new phc.zmn() { // from class: com.bytedance.sdk.openadsdk.common.doe.9
            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
            public void zmn() {
                if (doe.this.kjb) {
                    if (doe.this.nps != null) {
                        com.bytedance.sdk.openadsdk.rt.zmn.zmn.zn.zmn().zmn(doe.this.nps);
                    }
                    if (doe.this.zg instanceof Activity) {
                        Intent intent = new Intent(doe.this.zg, (Class<?>) TTHistoryActivity.class);
                        intent.putExtra("meta_index", am.zmn().zmn(doe.this.nps));
                        intent.putExtra("is_new_style", doe.this.kjb);
                        com.bytedance.sdk.component.utils.fs.zmn(doe.this.zg, intent, null);
                    }
                    doe.this.fb("onSelectHistory");
                    phcVar.zmn();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
            public void fs() {
                com.bytedance.sdk.component.bvs.nps npsVar;
                if (!doe.this.kjb || (npsVar = doe.this.cyb) == null || npsVar.getUrl() == null) {
                    return;
                }
                if (doe.this.iv != null) {
                    doe.this.iv.setVisibility(0);
                    doe.this.iv.setProgress(0);
                }
                npsVar.nps();
                String url = npsVar.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    npsVar.a_(url);
                }
                doe.this.fb("onSelectRetry");
                phcVar.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
            public void zn() {
                ClipboardManager clipboardManager;
                if (doe.this.kjb) {
                    String url = doe.this.cyb.getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) doe.this.zg.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                    doe.this.fb("onSelectCopyLink");
                    phcVar.zmn();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
            public void fb() {
                com.bytedance.sdk.component.bvs.nps npsVar;
                if (!doe.this.kjb || (npsVar = doe.this.cyb) == null) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                String url = npsVar.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.fs.zmn(doe.this.zg, intent, null);
                }
                doe.this.fb("onSelectOpenInBrowser");
                phcVar.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
            public void btk() {
                if (doe.this.kw) {
                    if (doe.this.kjb) {
                        if (doe.this.bjh == null) {
                            doe.this.bjh = new iqz(doe.this.zg);
                            doe.this.bjh.zmn(doe.this.nps);
                            doe.this.bjh.setCanceledOnTouchOutside(false);
                        }
                        doe.this.bjh.show();
                    }
                } else {
                    doe.this.iv();
                }
                doe.this.fb("onSelectReport");
                phcVar.zmn();
            }

            @Override // com.bytedance.sdk.openadsdk.common.phc.zmn
            public void hhw() {
                if (doe.this.kw || !com.bytedance.sdk.openadsdk.utils.fs.btk()) {
                    return;
                }
                IABLandingPageActivity.zmn(doe.this.zg, doe.this.nps, oub.zmn(doe.this.nps));
                doe.this.fb("onSelectPrivacy");
                phcVar.zmn();
            }
        });
        phcVar.zmn(view);
    }

    @SuppressLint({"SetTextI18n"})
    public void zmn(boolean z) {
        if (this.doe == null || this.nqi == null) {
            return;
        }
        String charSequence = hhw().getText().toString();
        String replaceAll = TextUtils.isEmpty(charSequence) ? " " : charSequence.replaceAll("[\n\r]+", " ");
        String charSequence2 = bvs().getText().toString();
        this.doe.setText(replaceAll);
        this.nqi.setText(charSequence2);
        if (z) {
            this.doe.setVisibility(0);
            com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = this.uqh;
            if (btkVar != null) {
                ViewGroup.LayoutParams layoutParams = btkVar.getLayoutParams();
                layoutParams.width = -2;
                this.uqh.setLayoutParams(layoutParams);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.hhw.getLayoutParams();
            layoutParams2.height = this.rt;
            this.hhw.setLayoutParams(layoutParams2);
            return;
        }
        this.doe.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = this.uqh;
        if (btkVar2 != null) {
            ViewGroup.LayoutParams layoutParams3 = btkVar2.getLayoutParams();
            layoutParams3.width = -1;
            this.uqh.setLayoutParams(layoutParams3);
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.hhw.getLayoutParams();
        layoutParams4.height = this.rt / 2;
        this.hhw.setLayoutParams(layoutParams4);
    }

    public void fs() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.hhw.getLayoutParams();
            final com.bytedance.sdk.component.bvs.nps npsVar = this.cyb;
            if (this.cn) {
                return;
            }
            int i = layoutParams.height;
            int i2 = this.rt;
            if (i == i2 / 2) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i2 / 2, i2);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.10
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        View view;
                        try {
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            layoutParams.height = intValue;
                            doe.this.hhw.setLayoutParams(layoutParams);
                            if (doe.this.kjb && (view = npsVar) != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                marginLayoutParams.topMargin = intValue;
                                npsVar.setLayoutParams(marginLayoutParams);
                            }
                            doe.this.hhw.requestLayout();
                        } catch (Throwable unused) {
                            String unused2 = doe.this.rp;
                        }
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.11
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(@NonNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(@NonNull Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(@NonNull Animator animator) {
                        doe.this.cn = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    @SuppressLint({"SetTextI18n"})
                    public void onAnimationEnd(@NonNull Animator animator) {
                        doe.this.cn = false;
                        doe.this.zmn(0);
                        doe.this.zmn(true);
                        doe.this.phc = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void zn() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.hhw.getLayoutParams();
            final com.bytedance.sdk.component.bvs.nps npsVar = this.cyb;
            if (this.cn) {
                return;
            }
            int i = layoutParams.height;
            int i2 = this.rt;
            if (i == i2) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i2, i2 / 2);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.12
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View view;
                        try {
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            layoutParams.height = intValue;
                            doe.this.hhw.setLayoutParams(layoutParams);
                            if (doe.this.kjb && (view = npsVar) != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                marginLayoutParams.topMargin = intValue;
                                npsVar.setLayoutParams(marginLayoutParams);
                            }
                            doe.this.hhw.requestLayout();
                        } catch (Throwable unused) {
                            String unused2 = doe.this.rp;
                        }
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.doe.2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        doe.this.cn = true;
                        doe.this.zmn(8);
                        doe.this.zmn(false);
                        doe.this.phc = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        doe.this.cn = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.openadsdk.core.hhw.hhw fb() {
        return this.iv;
    }

    public ImageView btk() {
        return this.bvs;
    }

    public TextView hhw() {
        return this.doe;
    }

    public void zmn(String str) {
        this.doe.setText(str);
    }

    public String nps() {
        return this.doe.getText().toString();
    }

    public String zg() {
        return this.nqi.getText().toString();
    }

    public void fs(String str) {
        String zn = zn(str);
        TextView textView = this.nqi;
        if (!TextUtils.isEmpty(zn)) {
            str = zn;
        }
        textView.setText(str);
    }

    public TextView bvs() {
        return this.nqi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i) {
        ImageView imageView = this.bvs;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.rc;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
        ImageView imageView3 = this.klz;
        if (imageView3 != null) {
            imageView3.setVisibility(i);
        }
        ImageView imageView4 = this.mw;
        if (imageView4 != null) {
            imageView4.setVisibility(i);
        }
    }

    public void zmn(WebView webView, nps.zmn zmnVar) {
        this.olo = zmnVar;
        try {
            if (this.rc != null) {
                if (webView.canGoBack()) {
                    this.rc.setClickable(true);
                    this.rc.clearColorFilter();
                } else {
                    this.rc.setClickable(false);
                    this.rc.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.klz != null) {
                if (webView.canGoForward()) {
                    this.klz.setClickable(true);
                    this.klz.clearColorFilter();
                } else {
                    this.klz.setClickable(false);
                    this.klz.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    protected void iv() {
        if (this.fb.get()) {
            rt();
            return;
        }
        if (this.zmn == null) {
            mw();
        }
        olo oloVar = this.zmn;
        if (oloVar != null) {
            oloVar.zmn();
        }
    }

    private void mw() {
        try {
            if (this.zmn == null) {
                olo oloVar = new olo(this.zg, this.nps);
                this.zmn = oloVar;
                oloVar.setDislikeSource("landing_page");
                this.zmn.setCallback(new olo.zmn() { // from class: com.bytedance.sdk.openadsdk.common.doe.3
                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void zmn(View view) {
                        doe.this.zn.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void fs(View view) {
                        doe.this.zn.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                    public void zmn(FilterWord filterWord) {
                        if (doe.this.fb.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        doe.this.fb.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.hhw.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.zmn);
            if (this.fs == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.zg);
                this.fs = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private void rt() {
        this.fs.show(TTAdDislikeToast.getDislikeTip());
    }

    public String zn(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private boolean cn() {
        return this.zg.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public void fb(final String str) {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("iab_more_options", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.common.doe.4
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("iab_more_options").fs(jSONObject.toString());
            }
        });
    }
}
