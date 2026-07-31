package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes9.dex */
public class bjh extends hhw {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public bjh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        this.zg += 6;
        if (this.klz.ww()) {
            com.bytedance.sdk.component.adexpress.hhw.zmn zmnVar = new com.bytedance.sdk.component.adexpress.hhw.zmn(context, this.klz.nps(), this.klz.btk(), 1, this.klz.zg());
            this.cn = zmnVar;
            zmnVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.cn = textView;
            textView.setIncludeFontPadding(false);
        }
        this.cn.setTag(Integer.valueOf(getClickArea()));
        addView(this.cn, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        int i;
        double d;
        super.bvs();
        if (TextUtils.isEmpty(getText())) {
            this.cn.setVisibility(4);
            return true;
        }
        if (this.klz.ww()) {
            rc();
            return true;
        }
        ((TextView) this.cn).setText(this.klz.hhw());
        ((TextView) this.cn).setTextDirection(5);
        this.cn.setTextAlignment(this.klz.zg());
        ((TextView) this.cn).setTextColor(this.klz.nps());
        ((TextView) this.cn).setTextSize(this.klz.btk());
        if (!this.klz.doe()) {
            ((TextView) this.cn).setMaxLines(1);
            ((TextView) this.cn).setGravity(17);
            ((TextView) this.cn).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int nqi = this.klz.nqi();
            if (nqi > 0) {
                ((TextView) this.cn).setLines(nqi);
                ((TextView) this.cn).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar = this.mw;
        if (zgVar != null && zgVar.iv() != null) {
            if (com.bytedance.sdk.component.adexpress.fb.fs() && zmn() && (TextUtils.equals(this.mw.iv().fs(), "text_star") || TextUtils.equals(this.mw.iv().fs(), "score-count") || TextUtils.equals(this.mw.iv().fs(), "score-count-type-1") || TextUtils.equals(this.mw.iv().fs(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (TextUtils.equals(this.mw.iv().fs(), "score-count") || TextUtils.equals(this.mw.iv().fs(), "score-count-type-2")) {
                try {
                    try {
                        i = Integer.parseInt(getText());
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (i < 0) {
                        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                            setVisibility(8);
                            return true;
                        }
                        this.cn.setVisibility(0);
                    }
                    if (TextUtils.equals(this.mw.iv().fs(), "score-count-type-2")) {
                        ((TextView) this.cn).setText(String.format(new DecimalFormat("(###,###,###)").format(i), Integer.valueOf(i)));
                        ((TextView) this.cn).setGravity(17);
                        return true;
                    }
                    zmn((TextView) this.cn, i, getContext(), "tt_comment_num");
                } catch (Exception unused2) {
                }
            } else if (TextUtils.equals(this.mw.iv().fs(), "text_star")) {
                try {
                    d = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d = -1.0d;
                }
                if (d < 0.0d || d > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                        setVisibility(8);
                        return true;
                    }
                    this.cn.setVisibility(0);
                }
                ((TextView) this.cn).setIncludeFontPadding(false);
                ((TextView) this.cn).setText(String.format("%.1f", Double.valueOf(d)));
            } else if (TextUtils.equals("privacy-detail", this.mw.iv().fs())) {
                ((TextView) this.cn).setText("Permission list | Privacy policy");
            } else if (TextUtils.equals(this.mw.iv().fs(), "development-name")) {
                ((TextView) this.cn).setText(com.bytedance.sdk.component.utils.doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_text_privacy_development") + getText());
            } else if (TextUtils.equals(this.mw.iv().fs(), "app-version")) {
                ((TextView) this.cn).setText(com.bytedance.sdk.component.utils.doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.cn).setText(getText());
            }
            this.cn.setTextAlignment(this.klz.zg());
            ((TextView) this.cn).setGravity(this.klz.bvs());
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                iv();
            }
        }
        return true;
    }

    private boolean zmn() {
        DynamicRootView dynamicRootView = this.rt;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.rt.getRenderRequest().iv() == 4) ? false : true;
    }

    private void iv() {
        int zmn;
        if (TextUtils.equals(this.mw.iv().fs(), "source") || TextUtils.equals(this.mw.iv().fs(), "title") || TextUtils.equals(this.mw.iv().fs(), "text_star")) {
            int[] fs = com.bytedance.sdk.component.adexpress.dynamic.btk.rc.fs(this.klz.hhw(), this.klz.btk(), true);
            int zmn2 = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), this.klz.fs());
            int zmn3 = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), this.klz.zn());
            int zmn4 = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), this.klz.fb());
            int zmn5 = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), this.klz.zmn());
            int min = Math.min(zmn2, zmn5);
            if (TextUtils.equals(this.mw.iv().fs(), "source") && (zmn = ((this.zg - ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), this.klz.btk()))) - zmn2) - zmn5) > 1 && zmn <= min * 2) {
                int i = zmn / 2;
                this.cn.setPadding(zmn3, zmn2 - i, zmn4, zmn5 - (zmn - i));
                return;
            }
            int i2 = (((fs[1] + zmn2) + zmn5) - this.zg) - 2;
            if (i2 <= 1) {
                return;
            }
            if (i2 <= min * 2) {
                int i3 = i2 / 2;
                this.cn.setPadding(zmn3, zmn2 - i3, zmn4, zmn5 - (i2 - i3));
            } else if (i2 > zmn2 + zmn5) {
                final int i4 = (i2 - zmn2) - zmn5;
                this.cn.setPadding(zmn3, 0, zmn4, 0);
                if (i4 <= ((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), 1.0f)) + 1) {
                    ((TextView) this.cn).setTextSize(this.klz.btk() - 1.0f);
                } else if (i4 <= (((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.cn).setTextSize(this.klz.btk() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bjh.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = bjh.this.cn.getLayoutParams();
                                bjh bjhVar = bjh.this;
                                layoutParams.height = bjhVar.zg + i4;
                                bjhVar.cn.setLayoutParams(layoutParams);
                                bjh.this.cn.setTranslationY(-i4);
                                ((ViewGroup) bjh.this.cn.getParent()).setClipChildren(false);
                                ((ViewGroup) bjh.this.cn.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (zmn2 > zmn5) {
                this.cn.setPadding(zmn3, zmn2 - (i2 - min), zmn4, zmn5 - min);
            } else {
                this.cn.setPadding(zmn3, zmn2 - min, zmn4, zmn5 - (i2 - min));
            }
        }
        if (TextUtils.equals(this.mw.iv().fs(), "fillButton")) {
            this.cn.setTextAlignment(2);
            ((TextView) this.cn).setGravity(17);
        }
    }

    public String getText() {
        String hhw = this.klz.hhw();
        if (TextUtils.isEmpty(hhw)) {
            if (!com.bytedance.sdk.component.adexpress.fb.fs() && TextUtils.equals(this.mw.iv().fs(), "text_star")) {
                hhw = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.fb.fs() && TextUtils.equals(this.mw.iv().fs(), "score-count")) {
                hhw = "6870";
            }
        }
        return (TextUtils.equals(this.mw.iv().fs(), "title") || TextUtils.equals(this.mw.iv().fs(), "subtitle")) ? hhw.replace("\n", "") : hhw;
    }

    public void zmn(TextView textView, int i, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.doe.zmn(context, str), Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    private void rc() {
        if (this.cn instanceof com.bytedance.sdk.component.adexpress.hhw.zmn) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.hhw.zmn) this.cn).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.hhw.zmn) this.cn).setTextColor(this.klz.nps());
            ((com.bytedance.sdk.component.adexpress.hhw.zmn) this.cn).setTextSize(this.klz.btk());
            ((com.bytedance.sdk.component.adexpress.hhw.zmn) this.cn).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.hhw.zmn) this.cn).setAnimationType(this.klz.jy());
            ((com.bytedance.sdk.component.adexpress.hhw.zmn) this.cn).setAnimationDuration(this.klz.oub() * 1000);
            ((com.bytedance.sdk.component.adexpress.hhw.zmn) this.cn).zmn();
        }
    }
}
