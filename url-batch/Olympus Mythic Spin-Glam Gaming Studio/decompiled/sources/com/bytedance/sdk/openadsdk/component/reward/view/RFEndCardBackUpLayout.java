package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cyb;
import com.bytedance.sdk.openadsdk.core.widget.olo;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.zmn.fs adContext;
    private PAGLogoView adLogo;
    private olo ivIcon;
    private boolean mInit;
    private cyb rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.hhw.zg tvDesc;
    private com.bytedance.sdk.openadsdk.core.hhw.zg tvDownload;
    private TextView tvTitle;

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

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.olo.tev);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.adContext = fsVar;
        if (fsVar.fs.ch()) {
            initViews();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            initViews();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initViews() {
        com.bytedance.sdk.openadsdk.core.model.zmn fb;
        List<nqi> btk;
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        boolean z = this.adContext.fs.dgt() && (zgVar = this.adContext.tdm) != null && zgVar.nu();
        if (z) {
            if (com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.zn.zmn()) {
                initViewsForUGen(true);
                return;
            } else if (this.shownAdCount > 1) {
                initOneSlotMultipleAdsLayout();
                return;
            }
        }
        nqi nqiVar = this.adContext.fs;
        if (nqiVar.ch()) {
            initViewsForVast();
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.zn.zmn()) {
            initViewsForUGen(false);
            return;
        }
        if (z && (fb = nqiVar.fb()) != null && (btk = fb.btk()) != null && !btk.isEmpty()) {
            nqiVar = btk.get(0);
        }
        initViewsDefault(nqiVar);
        initData(nqiVar, this.tvDownload);
    }

    private void initViewsForUGen(boolean z) {
        addView(new com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.zn(this.adContext, z));
    }

    private void initData(final nqi nqiVar, com.bytedance.sdk.openadsdk.core.hhw.zg zgVar) {
        setDownloadButtonData(zgVar, nqiVar, -1);
        bindIconData(this.ivIcon, nqiVar);
        cyb cybVar = this.rbScore;
        if (cybVar != null) {
            jy.zmn((TextView) null, cybVar, nqiVar);
            if (nqiVar.pw() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            if (nqiVar.pw() != null && !TextUtils.isEmpty(nqiVar.pw().fs())) {
                this.tvTitle.setText(nqiVar.pw().fs());
            } else if (!TextUtils.isEmpty(nqiVar.dey())) {
                this.tvTitle.setText(nqiVar.dey());
            } else {
                this.tvTitle.setVisibility(8);
            }
        }
        if (this.tvDesc != null) {
            String db = nqiVar.db();
            if (!TextUtils.isEmpty(db)) {
                this.tvDesc.setText(db);
            } else {
                this.tvDesc.setVisibility(8);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/RFEndCardBackUpLayout$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_RFEndCardBackUpLayout$1_onClick_e3cd0b4f7141da5a0d1c7900657d88b3(view);
            }

            public void safedk_RFEndCardBackUpLayout$1_onClick_e3cd0b4f7141da5a0d1c7900657d88b3(View p0) {
                try {
                    if (!com.bytedance.sdk.openadsdk.utils.fs.btk() || !kgc.fb().am()) {
                        TTWebsiteActivity.zmn(RFEndCardBackUpLayout.this.adContext.nu, nqiVar, RFEndCardBackUpLayout.this.adContext.btk);
                    } else {
                        IABLandingPageActivity.zmn(RFEndCardBackUpLayout.this.adContext.nu, nqiVar, RFEndCardBackUpLayout.this.adContext.btk);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.hhw.fb fbVar, nqi nqiVar) {
        if (fbVar == null || nqiVar.uaq() == null || TextUtils.isEmpty(nqiVar.uaq().zmn())) {
            return;
        }
        com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(nqiVar.uaq(), fbVar, nqiVar);
    }

    private void bindTitleData(TextView textView, nqi nqiVar, String str) {
        if (textView != null) {
            if (nqiVar.pw() != null && !TextUtils.isEmpty(nqiVar.pw().fs())) {
                textView.setText(nqiVar.pw().fs());
            } else {
                textView.setText(str);
            }
        }
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(jy.fs(context, 16.0f), 0, jy.fs(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(btkVar, layoutParams);
        if (this.adContext.kra == 2) {
            com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
            btkVar2.setOrientation(0);
            btkVar.addView(btkVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(btkVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(btkVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(btkVar);
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.adContext;
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(fsVar.nu, fsVar.fs);
        createPAGLogoViewByMaterial.setId(520093757);
        btkVar.addView(createPAGLogoViewByMaterial);
        createPAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/RFEndCardBackUpLayout$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_RFEndCardBackUpLayout$2_onClick_44d18a2021a676cfae96a2f3caf48cf7(view);
            }

            public void safedk_RFEndCardBackUpLayout$2_onClick_44d18a2021a676cfae96a2f3caf48cf7(View p0) {
                if (!com.bytedance.sdk.openadsdk.utils.fs.btk() || !kgc.fb().am()) {
                    TTWebsiteActivity.zmn(RFEndCardBackUpLayout.this.adContext.nu, RFEndCardBackUpLayout.this.adContext.fs, RFEndCardBackUpLayout.this.adContext.btk);
                } else {
                    IABLandingPageActivity.zmn(RFEndCardBackUpLayout.this.adContext.nu, RFEndCardBackUpLayout.this.adContext.fs, RFEndCardBackUpLayout.this.adContext.btk);
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.hhw.btk btkVar, int i) {
        nqi nqiVar = this.adContext.fs;
        if (nqiVar != null) {
            List<nqi> btk = nqiVar.fb().btk();
            for (int i2 = 0; i2 < btk.size() && i2 < i && i2 < 3; i2++) {
                initSingleCardInTwoCardStyleLandscape(btkVar, btk.get(i2), i2, i);
            }
        }
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.hhw.btk btkVar, nqi nqiVar, int i, int i2) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setOrientation(1);
        btkVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i > 0) {
            layoutParams.setMargins(jy.fs(context, 12.0f), 0, 0, 0);
        }
        btkVar2.setBackground(new zmn(context));
        btkVar.addView(btkVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar3.setOrientation(0);
        btkVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = jy.fs(context, 20.0f);
        layoutParams2.leftMargin = jy.fs(context, 17.0f);
        layoutParams2.rightMargin = jy.fs(context, 30.0f);
        btkVar2.addView(btkVar3, layoutParams2);
        olo oloVar = new olo(context);
        btkVar3.addView(oloVar, new FrameLayout.LayoutParams(jy.fs(context, 44.0f), jy.fs(context, 44.0f)));
        bindIconData(oloVar, nqiVar);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar4 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = jy.fs(context, 7.0f);
        btkVar3.addView(btkVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        zgVar.setTextSize(18.0f);
        zgVar.setTextColor(Color.parseColor("#161823"));
        zgVar.setGravity(8388611);
        zgVar.setTypeface(null, 1);
        btkVar4.addView(zgVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(zgVar, nqiVar, nqiVar.dey());
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar5 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar5.setOrientation(0);
        btkVar5.setGravity(16);
        btkVar4.addView(btkVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar2.setTextSize(16.0f);
        zgVar2.setTextColor(Color.parseColor("#80161823"));
        btkVar5.addView(zgVar2, new ViewGroup.LayoutParams(-2, -2));
        cyb cybVar = new cyb(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = jy.fs(context, 8.0f);
        btkVar5.addView(cybVar, layoutParams4);
        jy.zmn(zgVar2, cybVar, nqiVar, 18);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        if (i2 == 2) {
            zgVar3.setSingleLine(true);
        } else {
            zgVar3.setLines(2);
        }
        zgVar3.setEllipsize(truncateAt);
        zgVar3.setTextSize(16.0f);
        zgVar3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i3 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i3;
        layoutParams5.leftMargin = i3;
        layoutParams5.topMargin = jy.fs(context, 12.0f);
        btkVar2.addView(zgVar3, layoutParams5);
        bindDescData(zgVar3, nqiVar);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar4.setGravity(17);
        zgVar4.setId(520093707);
        zgVar4.setText(doe.zmn(context, "tt_video_download_apk"));
        zgVar4.setTextColor(-1);
        zgVar4.setTextSize(2, 16.0f);
        zgVar4.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, jy.fs(context, 36.0f));
        layoutParams6.setMargins(jy.fs(context, 20.0f), jy.fs(context, 22.0f), jy.fs(context, 20.0f), jy.fs(context, 20.0f));
        btkVar2.addView(zgVar4, layoutParams6);
        setDownloadButtonData(zgVar4, nqiVar, i);
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.hhw.btk btkVar) {
        nqi nqiVar = this.adContext.fs;
        if (nqiVar != null) {
            List<nqi> btk = nqiVar.fb().btk();
            for (int i = 0; i < btk.size() && i < 3; i++) {
                initSingleCardInThreeCardStyle(btkVar, btk.get(i), i);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.hhw.btk btkVar, nqi nqiVar, int i) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setOrientation(1);
        btkVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? jy.fs(context, 12.0f) : 0, 0, 0);
        btkVar2.setBackground(new zmn(context));
        btkVar.addView(btkVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar3.setOrientation(0);
        btkVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = jy.fs(context, 20.0f);
        layoutParams2.leftMargin = jy.fs(context, 17.0f);
        layoutParams2.rightMargin = jy.fs(context, 30.0f);
        btkVar2.addView(btkVar3, layoutParams2);
        olo oloVar = new olo(context);
        btkVar3.addView(oloVar, new FrameLayout.LayoutParams(jy.fs(context, 70.0f), jy.fs(context, 63.0f)));
        bindIconData(oloVar, nqiVar);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar4 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = jy.fs(context, 7.0f);
        btkVar3.addView(btkVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        zgVar.setTextSize(18.0f);
        zgVar.setTextColor(Color.parseColor("#161823"));
        zgVar.setGravity(8388611);
        zgVar.setTypeface(null, 1);
        btkVar4.addView(zgVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(zgVar, nqiVar, nqiVar.dey());
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar2.setSingleLine(true);
        zgVar2.setEllipsize(truncateAt);
        zgVar2.setTextSize(16.0f);
        zgVar2.setTextColor(Color.parseColor("#80161823"));
        btkVar4.addView(zgVar2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(zgVar2, nqiVar);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar5 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar5.setOrientation(0);
        btkVar5.setGravity(16);
        btkVar4.addView(btkVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar3.setTextSize(16.0f);
        zgVar3.setTextColor(Color.parseColor("#80161823"));
        btkVar5.addView(zgVar3, new ViewGroup.LayoutParams(-2, -2));
        cyb cybVar = new cyb(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = jy.fs(context, 8.0f);
        btkVar5.addView(cybVar, layoutParams4);
        jy.zmn(zgVar3, cybVar, nqiVar, 18);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar4.setGravity(17);
        zgVar4.setId(520093707);
        zgVar4.setText(doe.zmn(context, "tt_video_download_apk"));
        zgVar4.setTextColor(-1);
        zgVar4.setTextSize(2, 16.0f);
        zgVar4.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, jy.fs(context, 36.0f));
        layoutParams5.setMargins(jy.fs(context, 20.0f), jy.fs(context, 22.0f), jy.fs(context, 20.0f), jy.fs(context, 20.0f));
        btkVar2.addView(zgVar4, layoutParams5);
        setDownloadButtonData(zgVar4, nqiVar, i);
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.hhw.btk btkVar) {
        nqi nqiVar = this.adContext.fs;
        if (nqiVar != null) {
            List<nqi> btk = nqiVar.fb().btk();
            for (int i = 0; i < btk.size() && i < 2; i++) {
                initSingleCardInTwoCardStyle(btkVar, btk.get(i), i);
            }
        }
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.hhw.btk btkVar, nqi nqiVar, int i) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setOrientation(1);
        btkVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? jy.fs(context, 12.0f) : 0, 0, 0);
        btkVar2.setBackground(new zmn(context));
        btkVar.addView(btkVar2, layoutParams);
        olo oloVar = new olo(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(jy.fs(context, 70.0f), jy.fs(context, 63.0f));
        layoutParams2.setMargins(0, jy.fs(context, 24.0f), 0, jy.fs(context, 12.0f));
        btkVar2.addView(oloVar, layoutParams2);
        bindIconData(oloVar, nqiVar);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        zgVar.setTextSize(18.0f);
        zgVar.setTextColor(Color.parseColor("#161823"));
        zgVar.setGravity(17);
        zgVar.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(jy.fs(context, 56.0f), 0, jy.fs(context, 56.0f), 0);
        btkVar2.addView(zgVar, layoutParams3);
        bindTitleData(zgVar, nqiVar, nqiVar.dey());
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar2.setSingleLine(true);
        zgVar2.setEllipsize(truncateAt);
        zgVar2.setTextSize(16.0f);
        zgVar2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(jy.fs(context, 56.0f), jy.fs(context, 4.0f), jy.fs(context, 56.0f), 0);
        btkVar2.addView(zgVar2, layoutParams4);
        bindDescData(zgVar2, nqiVar);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar3.setOrientation(0);
        btkVar3.setGravity(16);
        btkVar2.addView(btkVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar3.setTextSize(16.0f);
        zgVar3.setTextColor(Color.parseColor("#80161823"));
        btkVar3.addView(zgVar3, new ViewGroup.LayoutParams(-2, -2));
        cyb cybVar = new cyb(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = jy.fs(context, 8.0f);
        btkVar3.addView(cybVar, layoutParams5);
        jy.zmn(zgVar3, cybVar, nqiVar, 18);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar4.setGravity(17);
        zgVar4.setId(520093707);
        zgVar4.setText(doe.zmn(context, "tt_video_download_apk"));
        zgVar4.setTextColor(-1);
        zgVar4.setTextSize(2, 16.0f);
        zgVar4.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, jy.fs(context, 36.0f));
        layoutParams6.setMargins(jy.fs(context, 20.0f), jy.fs(context, 36.0f), jy.fs(context, 20.0f), jy.fs(context, 20.0f));
        btkVar2.addView(zgVar4, layoutParams6);
        setDownloadButtonData(zgVar4, nqiVar, i);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.hhw.zg zgVar, nqi nqiVar) {
        if (zgVar == null) {
            return;
        }
        String pf = nqiVar.pf();
        if (TextUtils.isEmpty(pf)) {
            return;
        }
        zgVar.setText(pf);
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.hhw.zg zgVar, nqi nqiVar, int i) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.adContext;
        com.bytedance.sdk.openadsdk.core.zn.btk zmn2 = fsVar.rp.zmn(fsVar, nqiVar);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.adContext;
        zmn2.zmn(com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(fsVar2.nu, fsVar2.btk));
        if (i != -1) {
            HashMap hashMap = new HashMap();
            int i2 = i + 1;
            hashMap.put("ad_show_order", Integer.valueOf(i2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i2);
                hashMap.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            zmn2.zmn(hashMap);
        }
        zgVar.setOnClickListener(zmn2);
        zgVar.setOnTouchListener(zmn2);
        CharSequence gt = nqiVar.gt();
        if (TextUtils.isEmpty(gt)) {
            return;
        }
        zgVar.setText(gt);
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setId(com.bytedance.sdk.openadsdk.utils.olo.iv);
        fbVar.setVisibility(8);
        addView(fbVar, new FrameLayout.LayoutParams(-1, -1));
        View npsVar = new com.bytedance.sdk.component.bvs.nps(context, true, nps.zn.VAST_ENDCARD);
        npsVar.setVisibility(8);
        npsVar.setId(com.bytedance.sdk.openadsdk.utils.olo.rc);
        addView(npsVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private void initViewsDefault(nqi nqiVar) {
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        boolean z = nqiVar.ol() == 1;
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
        this.ivIcon = oloVar;
        oloVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(jy.fs(context, 80.0f), jy.fs(context, 80.0f));
        layoutParams2.bottomMargin = jy.fs(context, 12.0f);
        btkVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.tvTitle = zgVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(jy.fs(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        btkVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.tvDesc = zgVar2;
        zgVar2.setEllipsize(truncateAt);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = jy.fs(context, 8.0f);
        btkVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new cyb(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, jy.fs(context, 16.0f));
        layoutParams4.topMargin = jy.fs(context, 12.0f);
        this.rbScore.setVisibility(8);
        btkVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.tvDownload = zgVar3;
        zgVar3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(doe.zmn(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, jy.fs(context, 44.0f));
        layoutParams5.topMargin = jy.fs(context, 54.0f);
        btkVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, nqiVar);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, jy.fs(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = jy.fs(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = jy.fs(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = jy.fs(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    public void setShownAdCount(int i) {
        this.shownAdCount = i;
    }

    private static final class zmn extends Drawable {
        private final Drawable fs;
        Path zmn = new Path();
        private final int zn;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }

        public zmn(Context context) {
            this.fs = doe.zn(context, "tt_ad_bg_header_gradient");
            this.zn = jy.fs(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            canvas.clipPath(this.zmn);
            canvas.drawColor(-1);
            this.fs.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            float f = i3;
            this.fs.setBounds(i, i2, i3, (int) (((1.0f * f) / this.fs.getIntrinsicWidth()) * this.fs.getIntrinsicHeight()));
            this.zmn.reset();
            Path path = this.zmn;
            RectF rectF = new RectF(0.0f, 0.0f, f, i4);
            int i5 = this.zn;
            path.addRoundRect(rectF, i5, i5, Path.Direction.CCW);
        }
    }
}
