package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.qh;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.ktor.http.LinkHeader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.so += 6;
        if (this.kj.qD()) {
            this.bNS = new AnimationText(context, this.kj.yiw(), this.kj.NB(), 1, this.kj.so());
            ((AnimationText) this.bNS).setMaxLines(1);
        } else {
            this.bNS = new TextView(context);
            ((TextView) this.bNS).setIncludeFontPadding(false);
        }
        this.bNS.setTag(Integer.valueOf(getClickArea()));
        addView(this.bNS, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        int i;
        double d;
        super.Mxy();
        if (TextUtils.isEmpty(getText())) {
            this.bNS.setVisibility(4);
            return true;
        }
        if (this.kj.qD()) {
            qh();
            return true;
        }
        ((TextView) this.bNS).setText(this.kj.sUS());
        ((TextView) this.bNS).setTextDirection(5);
        this.bNS.setTextAlignment(this.kj.so());
        ((TextView) this.bNS).setTextColor(this.kj.yiw());
        ((TextView) this.bNS).setTextSize(this.kj.NB());
        if (!this.kj.OT()) {
            ((TextView) this.bNS).setMaxLines(1);
            ((TextView) this.bNS).setGravity(17);
            ((TextView) this.bNS).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int ny = this.kj.ny();
            if (ny > 0) {
                ((TextView) this.bNS).setLines(ny);
                ((TextView) this.bNS).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        if (this.Ju != null && this.Ju.Wyp() != null) {
            if (com.bytedance.sdk.component.adexpress.Jd.icD() && pvs() && (TextUtils.equals(this.Ju.Wyp().icD(), "text_star") || TextUtils.equals(this.Ju.Wyp().icD(), "score-count") || TextUtils.equals(this.Ju.Wyp().icD(), "score-count-type-1") || TextUtils.equals(this.Ju.Wyp().icD(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (TextUtils.equals(this.Ju.Wyp().icD(), "score-count") || TextUtils.equals(this.Ju.Wyp().icD(), "score-count-type-2")) {
                try {
                    try {
                        i = Integer.parseInt(getText());
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (i < 0) {
                        if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                            setVisibility(8);
                            return true;
                        }
                        this.bNS.setVisibility(0);
                    }
                    if (TextUtils.equals(this.Ju.Wyp().icD(), "score-count-type-2")) {
                        ((TextView) this.bNS).setText(String.format(new DecimalFormat("(###,###,###)").format(i), Integer.valueOf(i)));
                        ((TextView) this.bNS).setGravity(17);
                        return true;
                    }
                    pvs((TextView) this.bNS, i, getContext(), "tt_comment_num");
                } catch (Exception unused2) {
                }
            } else if (TextUtils.equals(this.Ju.Wyp().icD(), "text_star")) {
                try {
                    d = Double.parseDouble(getText());
                } catch (Exception e) {
                    Ju.pvs("DynamicStarView applyNativeStyle", e.toString());
                    d = -1.0d;
                }
                if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                        setVisibility(8);
                        return true;
                    }
                    this.bNS.setVisibility(0);
                }
                ((TextView) this.bNS).setIncludeFontPadding(false);
                ((TextView) this.bNS).setText(String.format("%.1f", Double.valueOf(d)));
            } else if (TextUtils.equals("privacy-detail", this.Ju.Wyp().icD())) {
                ((TextView) this.bNS).setText("Permission list | Privacy policy");
            } else if (TextUtils.equals(this.Ju.Wyp().icD(), "development-name")) {
                ((TextView) this.bNS).setText(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_text_privacy_development") + getText());
            } else if (TextUtils.equals(this.Ju.Wyp().icD(), "app-version")) {
                ((TextView) this.bNS).setText(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.bNS).setText(getText());
            }
            this.bNS.setTextAlignment(this.kj.so());
            ((TextView) this.bNS).setGravity(this.kj.Mxy());
            if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                Wyp();
            }
        }
        return true;
    }

    private boolean pvs() {
        return (this.IP == null || this.IP.getRenderRequest() == null || this.IP.getRenderRequest().Wyp() == 4) ? false : true;
    }

    private void Wyp() {
        int pvs;
        if (TextUtils.equals(this.Ju.Wyp().icD(), FirebaseAnalytics.Param.SOURCE) || TextUtils.equals(this.Ju.Wyp().icD(), LinkHeader.Parameters.Title) || TextUtils.equals(this.Ju.Wyp().icD(), "text_star")) {
            int[] icD = qh.icD(this.kj.sUS(), this.kj.NB(), true);
            int pvs2 = (int) yiw.pvs(getContext(), this.kj.icD());
            int pvs3 = (int) yiw.pvs(getContext(), this.kj.vG());
            int pvs4 = (int) yiw.pvs(getContext(), this.kj.Jd());
            int pvs5 = (int) yiw.pvs(getContext(), this.kj.pvs());
            int min = Math.min(pvs2, pvs5);
            if (TextUtils.equals(this.Ju.Wyp().icD(), FirebaseAnalytics.Param.SOURCE) && (pvs = ((this.so - ((int) yiw.pvs(getContext(), this.kj.NB()))) - pvs2) - pvs5) > 1 && pvs <= min * 2) {
                int i = pvs / 2;
                this.bNS.setPadding(pvs3, pvs2 - i, pvs4, pvs5 - (pvs - i));
                return;
            }
            int i2 = (((icD[1] + pvs2) + pvs5) - this.so) - 2;
            if (i2 <= 1) {
                return;
            }
            if (i2 <= min * 2) {
                int i3 = i2 / 2;
                this.bNS.setPadding(pvs3, pvs2 - i3, pvs4, pvs5 - (i2 - i3));
            } else if (i2 > pvs2 + pvs5) {
                final int i4 = (i2 - pvs2) - pvs5;
                this.bNS.setPadding(pvs3, 0, pvs4, 0);
                if (i4 <= ((int) yiw.pvs(getContext(), 1.0f)) + 1) {
                    ((TextView) this.bNS).setTextSize(this.kj.NB() - 1.0f);
                } else if (i4 <= (((int) yiw.pvs(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.bNS).setTextSize(this.kj.NB() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTextView.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = DynamicTextView.this.bNS.getLayoutParams();
                                layoutParams.height = DynamicTextView.this.so + i4;
                                DynamicTextView.this.bNS.setLayoutParams(layoutParams);
                                DynamicTextView.this.bNS.setTranslationY(-i4);
                                ViewGroup viewGroup = (ViewGroup) DynamicTextView.this.bNS.getParent();
                                ViewGroup viewGroup2 = viewGroup;
                                viewGroup.setClipChildren(false);
                                ViewGroup viewGroup3 = (ViewGroup) DynamicTextView.this.bNS.getParent().getParent();
                                ViewGroup viewGroup4 = viewGroup3;
                                viewGroup3.setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (pvs2 > pvs5) {
                this.bNS.setPadding(pvs3, pvs2 - (i2 - min), pvs4, pvs5 - min);
            } else {
                this.bNS.setPadding(pvs3, pvs2 - min, pvs4, pvs5 - (i2 - min));
            }
        }
        if (TextUtils.equals(this.Ju.Wyp().icD(), "fillButton")) {
            this.bNS.setTextAlignment(2);
            ((TextView) this.bNS).setGravity(17);
        }
    }

    public String getText() {
        String sUS = this.kj.sUS();
        if (TextUtils.isEmpty(sUS)) {
            if (!com.bytedance.sdk.component.adexpress.Jd.icD() && TextUtils.equals(this.Ju.Wyp().icD(), "text_star")) {
                sUS = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.Jd.icD() && TextUtils.equals(this.Ju.Wyp().icD(), "score-count")) {
                sUS = "6870";
            }
        }
        return (TextUtils.equals(this.Ju.Wyp().icD(), LinkHeader.Parameters.Title) || TextUtils.equals(this.Ju.Wyp().icD(), "subtitle")) ? sUS.replace("\n", "") : sUS;
    }

    public void pvs(TextView textView, int i, Context context, String str) {
        textView.setText("(" + String.format(uc.pvs(context, str), Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    private void qh() {
        if (this.bNS instanceof AnimationText) {
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
            ((AnimationText) this.bNS).setMaxLines(1);
            ((AnimationText) this.bNS).setTextColor(this.kj.yiw());
            ((AnimationText) this.bNS).setTextSize(this.kj.NB());
            ((AnimationText) this.bNS).setAnimationText(arrayList);
            ((AnimationText) this.bNS).setAnimationType(this.kj.OhP());
            ((AnimationText) this.bNS).setAnimationDuration(this.kj.od() * 1000);
            ((AnimationText) this.bNS).pvs();
        }
    }
}
