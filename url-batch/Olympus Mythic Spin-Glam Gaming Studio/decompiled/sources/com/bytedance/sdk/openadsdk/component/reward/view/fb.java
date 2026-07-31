package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.cyb;
import com.bytedance.sdk.openadsdk.core.widget.olo;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fb extends com.bytedance.sdk.openadsdk.core.hhw.btk {
    private TextView btk;
    private olo fb;
    private TextView fs;
    private TextView hhw;
    private boolean nps;
    private com.bytedance.sdk.openadsdk.component.reward.zmn.fs zg;
    private cyb zmn;
    private TextView zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
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

    public fb(@NonNull Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.nps) {
            return;
        }
        fb();
    }

    private void fb() {
        this.nps = true;
        nqi nqiVar = this.zg.fs;
        int cd = nqiVar.cd();
        if ((cd == 43 || cd == 44) && am.fs(nqiVar)) {
            zn();
        } else if (this.zg.kra == 1) {
            hhw();
        } else {
            btk();
        }
        if (this.fs == null) {
            this.fs = (TextView) this.zg.hgd.findViewById(520093705);
        }
        TextView textView = this.fs;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fb.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int width = ((ViewGroup) fb.this.fs.getParent()).getWidth();
                    if (width > 0) {
                        fb.this.fs.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (nqiVar.ch()) {
                if (nqiVar.bm() != null && TextUtils.isEmpty(nqiVar.bm().hhw())) {
                    jy.zmn((View) this.fs, 8);
                }
            } else {
                this.fs.setText(nqiVar.es() == 3 ? getButtonTextForNewStyleBar() : nqiVar.gt());
            }
        }
        if (this.fb != null && nqiVar.uaq() != null && !TextUtils.isEmpty(nqiVar.uaq().zmn())) {
            String zmn2 = nqiVar.uaq().zmn();
            if (nqiVar.ch()) {
                com.bytedance.sdk.openadsdk.iv.fb.zmn(nqiVar.uaq()).zn(1).zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, nqiVar.uaq().zmn(), new zmn(this.fb, nqiVar, zmn2, this.zg.btk)));
                if (nqiVar.bm() != null && nqiVar.bm().fs() != null) {
                    nqiVar.bm().fs().fs(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(nqiVar.uaq(), this.fb, nqiVar);
            }
        }
        TextView textView2 = this.btk;
        if (textView2 != null) {
            textView2.setText(nqiVar.db());
        }
        TextView textView3 = this.hhw;
        if (textView3 != null) {
            textView3.setText(zmn(nqiVar));
        }
        if (this.zn != null) {
            String nqi = am.nqi(this.zg.fs);
            if (TextUtils.isEmpty(nqi)) {
                nqi = "Play now";
            }
            this.zn.setText(nqi);
            this.zn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fb.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/fb$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_fb$2_onClick_d898952c4fc3df5c5fb115845a1d00dd(view);
                }

                public void safedk_fb$2_onClick_d898952c4fc3df5c5fb115845a1d00dd(View p0) {
                    if (fb.this.zg != null) {
                        com.bytedance.sdk.openadsdk.component.reward.fs.zmn(fb.this.zg);
                    }
                }
            });
        }
        cyb cybVar = this.zmn;
        if (cybVar != null) {
            jy.zmn((TextView) null, cybVar, nqiVar);
        }
        if (this.zg.kra == 2 && nqiVar.es() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.fs.getLayoutParams();
            layoutParams.height = jy.fs(this.zg.oub, 55.0f);
            layoutParams.topMargin = jy.fs(this.zg.oub, 20.0f);
            this.fs.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = jy.fs(this.zg.oub, 12.0f);
            setLayoutParams(layoutParams2);
        }
        fs();
    }

    private String zmn(nqi nqiVar) {
        if (!TextUtils.isEmpty(nqiVar.db())) {
            return nqiVar.db();
        }
        if (!TextUtils.isEmpty(nqiVar.pf())) {
            return nqiVar.pf();
        }
        return "";
    }

    private void btk() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(jy.fs(context, 16.0f), jy.fs(context, 12.0f), jy.fs(context, 16.0f), jy.fs(context, 12.0f));
        olo oloVar = new olo(context);
        this.fb = oloVar;
        oloVar.setBackgroundColor(0);
        this.fb.setId(com.bytedance.sdk.openadsdk.utils.olo.fb);
        addView(this.fb, new LinearLayout.LayoutParams(jy.fs(context, 48.0f), jy.fs(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = jy.fs(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(btkVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.btk = zgVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        this.btk.setGravity(16);
        this.btk.setSingleLine(true);
        this.btk.setTextSize(2, 17.0f);
        this.btk.setId(com.bytedance.sdk.openadsdk.utils.olo.btk);
        this.btk.setTextColor(-16777216);
        btkVar.addView(this.btk, new LinearLayout.LayoutParams(-1, -2));
        cyb cybVar = new cyb(context);
        this.zmn = cybVar;
        cybVar.setId(com.bytedance.sdk.openadsdk.utils.olo.nps);
        btkVar.addView(this.zmn, new LinearLayout.LayoutParams(-2, jy.fs(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.fs = zgVar2;
        zgVar2.setGravity(17);
        this.fs.setEllipsize(truncateAt);
        this.fs.setSingleLine(true);
        this.fs.setTextColor(-1);
        this.fs.setTextSize(2, 16.0f);
        this.fs.setId(520093705);
        this.fs.setBackground(zmn(context));
        this.fs.setText(this.zg.fs.gt());
        addView(this.fs, new LinearLayout.LayoutParams(jy.fs(context, 164.0f), jy.fs(context, 36.0f)));
    }

    public void zmn() {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6), PropertyValuesHolder.ofKeyframe("scaleY", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.start();
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.zg = fsVar;
        if (fsVar.fs.es() == 1) {
            fb();
        }
    }

    protected String getButtonTextForNewStyleBar() {
        boolean z;
        String gt;
        String zn = oub.zn(this.zg.oub);
        if (zn == null) {
            zn = "";
        }
        try {
            z = zn.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            z = false;
        }
        if (TextUtils.isEmpty(this.zg.fs.gt())) {
            gt = this.zg.fs.va() != 4 ? "View" : "Install";
        } else {
            gt = this.zg.fs.gt();
            if (gt == null || !oub.nps(gt) || gt.length() <= 2) {
                if (gt != null && !oub.nps(gt) && gt.length() > 7 && z) {
                    gt = getCnOrEnBtnText();
                }
            } else if (z) {
                gt = getCnOrEnBtnText();
            }
        }
        if (z && !oub.nps(gt)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.fs.getLayoutParams();
            layoutParams.bottomMargin = jy.fs(this.zg.oub, 4.0f);
            this.fs.setLayoutParams(layoutParams);
        }
        return gt;
    }

    private String getCnOrEnBtnText() {
        if (this.zg.fs.va() != 4) {
            return "View";
        }
        return "Install";
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void fs() {
        com.bytedance.sdk.openadsdk.core.zn.btk btk = this.zg.rp.btk();
        final com.bytedance.sdk.openadsdk.core.zn.fs fb = this.zg.rp.fb();
        final nqi nqiVar = this.zg.fs;
        if (nqiVar.hsp() == null) {
            return;
        }
        if (nqiVar.es() != 5 && this.fs != null) {
            if (nqiVar.hsp().btk) {
                this.fs.setOnClickListener(btk);
                this.fs.setOnTouchListener(btk);
            } else {
                this.fs.setOnClickListener(fb);
            }
        }
        if (nqiVar.es() == 1) {
            if (nqiVar.hsp().zmn) {
                jy.zmn((View) this, (View.OnClickListener) btk, "TTBaseVideoActivity#mRlDownloadBar");
                jy.zmn((View) this, (View.OnTouchListener) btk, "TTBaseVideoActivity#mRlDownloadBar");
                this.btk.setOnClickListener(btk);
                this.btk.setOnTouchListener(btk);
                this.zmn.setOnClickListener(btk);
                this.zmn.setOnTouchListener(btk);
                this.fb.setOnClickListener(btk);
                this.fb.setOnTouchListener(btk);
                return;
            }
            jy.zmn((View) this, (View.OnClickListener) fb, "TTBaseVideoActivity#mRlDownloadBar");
            this.btk.setOnClickListener(fb);
            this.zmn.setOnClickListener(fb);
            this.fb.setOnClickListener(fb);
            return;
        }
        if (nqiVar.es() == 5) {
            String str = "VAST_ICON";
            if (nqiVar.hsp().btk) {
                com.bytedance.sdk.openadsdk.core.zn.nps npsVar = new com.bytedance.sdk.openadsdk.core.zn.nps("VAST_ACTION_BUTTON", nqiVar.bm(), btk) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fb.3
                };
                com.bytedance.sdk.openadsdk.core.zn.nps npsVar2 = new com.bytedance.sdk.openadsdk.core.zn.nps(str, nqiVar.bm(), btk) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fb.4
                };
                TextView textView = this.fs;
                if (textView != null) {
                    textView.setOnClickListener(npsVar);
                    this.fs.setOnTouchListener(npsVar);
                }
                olo oloVar = this.fb;
                if (oloVar != null) {
                    oloVar.setOnClickListener(npsVar2);
                    this.fb.setOnTouchListener(npsVar2);
                }
                TextView textView2 = this.btk;
                if (textView2 == null || TextUtils.isEmpty(textView2.getText())) {
                    return;
                }
                this.btk.setOnClickListener(npsVar);
                this.btk.setOnTouchListener(npsVar);
                return;
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fb.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/fb$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_fb$5_onClick_a09bca07677bbae231934444da166b27(view);
                }

                public void safedk_fb$5_onClick_a09bca07677bbae231934444da166b27(View p0) {
                    View.OnClickListener onClickListener2 = fb;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(p0);
                    }
                    if (p0 != null && "VAST_ICON".equals(p0.getTag(570425345))) {
                        if (nqiVar.bm() == null || nqiVar.bm().fs() == null) {
                            return;
                        }
                        nqiVar.bm().fs().zmn(fb.this.zg.phc.mw());
                        return;
                    }
                    if (nqiVar.bm() != null) {
                        nqiVar.bm().zmn().nps(fb.this.zg.phc.mw());
                    }
                }
            };
            TextView textView3 = this.fs;
            if (textView3 != null) {
                textView3.setOnClickListener(onClickListener);
            }
            TextView textView4 = this.btk;
            if (textView4 != null && !TextUtils.isEmpty(textView4.getText())) {
                this.btk.setOnClickListener(onClickListener);
            }
            olo oloVar2 = this.fb;
            if (oloVar2 != null) {
                oloVar2.setTag(570425345, "VAST_ICON");
                this.fb.setOnClickListener(fb);
                return;
            }
            return;
        }
        if (nqiVar.hsp().zn) {
            jy.zmn((View) this, (View.OnClickListener) btk, "TTBaseVideoActivity#mRlDownloadBar");
            jy.zmn((View) this, (View.OnTouchListener) btk, "TTBaseVideoActivity#mRlDownloadBar");
        } else {
            jy.zmn((View) this, (View.OnClickListener) fb, "TTBaseVideoActivity#mRlDownloadBar");
        }
    }

    private void hhw() {
        Context context = getContext();
        setPadding(jy.fs(context, 16.0f), jy.fs(context, 16.0f), jy.fs(context, 16.0f), jy.fs(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setOrientation(0);
        btkVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = jy.fs(context, 12.0f);
        addView(btkVar, layoutParams);
        olo oloVar = new olo(context);
        this.fb = oloVar;
        oloVar.setBackgroundColor(0);
        this.fb.setId(com.bytedance.sdk.openadsdk.utils.olo.fb);
        btkVar.addView(this.fb, new LinearLayout.LayoutParams(jy.fs(context, 48.0f), jy.fs(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = jy.fs(context, 12.0f);
        btkVar.addView(btkVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.btk = zgVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        this.btk.setGravity(16);
        this.btk.setSingleLine(true);
        this.btk.setTextSize(2, 17.0f);
        this.btk.setId(com.bytedance.sdk.openadsdk.utils.olo.btk);
        this.btk.setTextColor(-16777216);
        btkVar2.addView(this.btk, new LinearLayout.LayoutParams(-1, -2));
        cyb cybVar = new cyb(context);
        this.zmn = cybVar;
        cybVar.setId(com.bytedance.sdk.openadsdk.utils.olo.nps);
        btkVar2.addView(this.zmn, new LinearLayout.LayoutParams(-2, jy.fs(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.fs = zgVar2;
        zgVar2.setGravity(17);
        this.fs.setEllipsize(truncateAt);
        this.fs.setSingleLine(true);
        this.fs.setTextColor(-1);
        this.fs.setTextSize(2, 16.0f);
        this.fs.setId(520093705);
        this.fs.setBackground(zmn(context));
        this.fs.setText(this.zg.fs.gt());
        addView(this.fs, new LinearLayout.LayoutParams(-1, jy.fs(context, 36.0f)));
    }

    public void zn() {
        Context context = getContext();
        int fs = jy.fs(context, 12.0f);
        setPadding(fs, fs, fs, fs);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        btkVar.setOrientation(0);
        btkVar.setGravity(16);
        addView(btkVar, layoutParams);
        olo oloVar = new olo(context);
        this.fb = oloVar;
        oloVar.setBackgroundColor(0);
        this.fb.setId(com.bytedance.sdk.openadsdk.utils.olo.fb);
        btkVar.addView(this.fb, new LinearLayout.LayoutParams(jy.fs(context, 54.0f), jy.fs(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar2 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = jy.fs(context, 12.0f);
        btkVar.addView(btkVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.btk = zgVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zgVar.setEllipsize(truncateAt);
        this.btk.setGravity(16);
        this.btk.setSingleLine(true);
        this.btk.setTextSize(2, 17.0f);
        this.btk.setId(com.bytedance.sdk.openadsdk.utils.olo.btk);
        this.btk.setTextColor(-16777216);
        btkVar2.addView(this.btk, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.hhw = zgVar2;
        zgVar2.setTextColor(-16777216);
        this.hhw.setTextSize(2, 13.0f);
        this.hhw.setMaxLines(2);
        this.hhw.setAlpha(0.8f);
        this.hhw.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = jy.fs(context, 4.0f);
        btkVar2.addView(this.hhw, layoutParams3);
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar3 = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = jy.fs(context, 12.0f);
        btkVar3.setOrientation(0);
        addView(btkVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.zn = zgVar3;
        zgVar3.setGravity(17);
        this.zn.setEllipsize(truncateAt);
        this.zn.setSingleLine(true);
        this.zn.setTextColor(-16777216);
        this.zn.setTextSize(2, 16.0f);
        this.zn.setBackground(fs(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, jy.fs(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = jy.fs(context, 3.0f);
        btkVar3.addView(this.zn, layoutParams5);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar4 = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.fs = zgVar4;
        zgVar4.setGravity(17);
        this.fs.setEllipsize(truncateAt);
        this.fs.setSingleLine(true);
        this.fs.setTextColor(-1);
        this.fs.setTextSize(2, 16.0f);
        this.fs.setId(520093705);
        this.fs.setBackground(zn(context));
        this.fs.setText(this.zg.fs.gt());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, jy.fs(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = jy.fs(context, 3.0f);
        btkVar3.addView(this.fs, layoutParams6);
    }

    private static Drawable zmn(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(jy.fs(context, 18.0f));
        return gradientDrawable;
    }

    private static Drawable fs(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(jy.fs(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable zn(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(jy.fs(context, 8.0f));
        return gradientDrawable;
    }

    private static class zmn implements com.bytedance.sdk.component.btk.cyb {
        private final WeakReference<ImageView> fb;
        private final String fs;
        private final nqi zmn;
        private final String zn;

        public zmn(ImageView imageView, nqi nqiVar, String str, String str2) {
            this.fb = new WeakReference<>(imageView);
            this.zmn = nqiVar;
            this.fs = str;
            this.zn = str2;
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
            Object fs = rcVar.fs();
            if (fs != null) {
                ImageView imageView = this.fb.get();
                if (fs instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) fs);
                    }
                } else if (fs instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(fs)) {
                        zn$$ExternalSyntheticApiModelOutline0.m(fs).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) fs);
                    }
                }
                com.bytedance.sdk.openadsdk.fb.zn.fs(this.zmn, this.zn, "load_vast_icon_success", (JSONObject) null);
            }
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(int i, String str, @Nullable Throwable th) {
            zmn(i, str, this.fs);
        }

        private void zmn(final int i, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.fb.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i);
                        jSONObject.put("description", i + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.fb.zn.fs(zmn.this.zmn, zmn.this.zn, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }
}
