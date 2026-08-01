package com.bytedance.sdk.component.adexpress.dynamic.Jd;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.icD;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.ktor.http.LinkHeader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LayoutUnitSizeUtils.java */
/* loaded from: classes.dex */
public class qh {
    private static String icD;
    private static final Set<String> pvs = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    /* JADX WARN: Removed duplicated region for block: B:183:0x0462  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static icD.vG pvs(String str, String str2, String str3, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar, double d, int i2, double d2, String str4, Ju ju) {
        String str5;
        int i3;
        int i4;
        int i5;
        float optDouble;
        float optDouble2;
        float optDouble3;
        float f;
        float f2;
        float f3;
        com.bytedance.sdk.component.adexpress.dynamic.vG.sUS NB;
        String str6 = str;
        int i6 = i;
        String Jd = ju.Jd();
        int yiw = ju.yiw();
        if (com.bytedance.sdk.component.adexpress.Jd.icD() && i2 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new icD.vG(0.0f, 0.0f);
        }
        icD.vG vGVar = new icD.vG();
        if (str6.startsWith("<svg") || pvs.contains(str2)) {
            try {
                if ("close".equals(str2)) {
                    float optDouble4 = (float) new JSONObject(str3).optDouble("fontSize");
                    vGVar.pvs = optDouble4;
                    vGVar.icD = optDouble4;
                    return vGVar;
                }
            } catch (Exception unused) {
            }
            vGVar.pvs = 10.0f;
            vGVar.icD = 10.0f;
            return vGVar;
        }
        if ("logo".equals(str2)) {
            if (!com.bytedance.sdk.component.adexpress.Jd.icD() && ((!TextUtils.isEmpty(str) && str6.contains("adx:")) || icD())) {
                if (icD()) {
                    return pvs(vGVar, str6, str3, icD);
                }
                return pvs(vGVar, str6, str3, "");
            }
            vGVar.pvs = "union".equals(str6) ? 10.0f : 20.0f;
            vGVar.icD = 10.0f;
            if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                String str7 = str2 + str6;
                float icD2 = (float) icD(str3);
                if (str7.contains("logoad")) {
                    return pvs(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_logo_en"), str3);
                }
                vGVar.icD = icD2;
            }
            return vGVar;
        }
        if ("development-name".equals(str2)) {
            str5 = "";
            str6 = uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_text_privacy_development") + str6;
        } else {
            str5 = "";
        }
        if ("app-version".equals(str2)) {
            i3 = yiw;
            str6 = uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_text_privacy_app_version") + str6;
        } else {
            i3 = yiw;
        }
        if ("score-count".equals(str2)) {
            try {
                i4 = Integer.parseInt(str6);
            } catch (NumberFormatException unused2) {
                i4 = 0;
            }
            if (com.bytedance.sdk.component.adexpress.Jd.icD() && i4 < 0) {
                return new icD.vG(0.0f, 0.0f);
            }
            return pvs("(" + String.format(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_comment_num"), Integer.valueOf(i4)) + ")", str3);
        }
        if ("score-count-type-2".equals(str2)) {
            try {
                i5 = Integer.parseInt(str6);
            } catch (NumberFormatException unused3) {
                i5 = 0;
            }
            if (com.bytedance.sdk.component.adexpress.Jd.icD() && i5 < 0) {
                return new icD.vG(0.0f, 0.0f);
            }
            return pvs("(" + String.format(new DecimalFormat("###,###,###").format(i5), Integer.valueOf(i5)) + ")", str3);
        }
        if ("feedback-dislike".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                icD.vG vGVar2 = new icD.vG();
                float icD3 = (float) icD(str3);
                vGVar2.pvs = icD3;
                vGVar2.icD = icD3;
                return vGVar2;
            }
            return pvs(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_feedback"), str3);
        }
        if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
            if (ju.pvs() && com.bytedance.sdk.component.adexpress.Jd.sUS.icD(Jd)) {
                return ((int) (d + 0.5d)) - i3 < 10 ? pvs(String.format(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_full_skip"), "0"), str3) : pvs(String.format(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_full_skip"), "00"), str3);
            }
            if (d < 10.0d) {
                return pvs("0S", str3);
            }
            return pvs("00S", str3);
        }
        if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
            return pvs("| " + uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_screen_skip_tx"), str3);
        }
        if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
            return pvs("| ".concat(String.valueOf(String.format(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_full_skip_count_down"), "00"))), str3);
        }
        if ("skip-with-time-skip-btn".equals(str2)) {
            icD.vG pvs2 = pvs("| " + uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_screen_skip_tx"), str3);
            if (com.bytedance.sdk.component.adexpress.Jd.icD()) {
                try {
                    pvs2.icD = (float) ((pvs2.icD * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                } catch (Throwable unused4) {
                }
                pvs2.pvs = pvs2.icD;
            }
            return pvs2;
        }
        if ("skip".equals(str2)) {
            return pvs(uc.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), "tt_reward_screen_skip_tx"), str3);
        }
        if ("timedown".equals(str2)) {
            return pvs("0.0", str3);
        }
        if ("text_star".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.Jd.icD() && (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d2 > 5.0d)) {
                return new icD.vG(0.0f, 0.0f);
            }
            return pvs("0.0", str3);
        }
        if (TextUtils.equals("privacy-detail", str2)) {
            return pvs("Permission list | Privacy policy", str3);
        }
        if ("arrowButton".equals(str2)) {
            return pvs("Download", str3);
        }
        if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.Jd.icD() && TextUtils.isEmpty(str6) && (NB = soVar.Wyp().NB()) != null) {
            str6 = NB.HWd() != null ? soVar.Wyp().NB().HWd().optString(com.bytedance.sdk.component.adexpress.Jd.yiw.vG(com.bytedance.sdk.component.adexpress.Jd.pvs())) : str5;
        }
        if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || FirebaseAnalytics.Param.SOURCE.equals(str2) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2)) {
            return pvs(str6, str3);
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            int length = str6.length();
            optDouble = (float) jSONObject.optDouble("fontSize");
            float optDouble5 = (float) jSONObject.optDouble("letterSpacing");
            optDouble2 = (float) jSONObject.optDouble("lineHeight");
            optDouble3 = (float) jSONObject.optDouble("maxWidth");
            f = (length * (optDouble + optDouble5)) - optDouble5;
            com.bytedance.sdk.component.utils.Ju.pvs("DynamicBaseWidget", "getDomSizeFromNative letterSpacing==" + optDouble5 + ",lineHeight==" + optDouble2 + ",maxWidth ==" + optDouble3 + ",totalStrLength" + f);
        } catch (JSONException unused5) {
        }
        if ("muted".equals(str2)) {
            vGVar.pvs = optDouble;
            vGVar.icD = optDouble;
            return vGVar;
        }
        if ("star".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.Jd.icD() && (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d2 > 5.0d || i2 != 4)) {
                return new icD.vG(0.0f, 0.0f);
            }
            icD.vG pvs3 = pvs("str", str3);
            pvs3.pvs = optDouble * 5.0f;
            return pvs3;
        }
        if ("icon".equals(str2)) {
            vGVar.pvs = optDouble;
            vGVar.icD = optDouble;
            return vGVar;
        }
        if (z) {
            int i7 = ((int) (f / optDouble3)) + 1;
            if (z2 && i7 >= i6) {
                i7 = i6;
            }
            f2 = (float) (optDouble2 * optDouble * i7 * 1.2d);
        } else {
            f2 = (float) (optDouble2 * optDouble * 1.2d);
            if (f <= optDouble3) {
                f3 = f;
                if (LinkHeader.Parameters.Title.equals(str2)) {
                    try {
                        icD.vG pvs4 = pvs(str6.replace('\n', ' '), str3, false);
                        if (z) {
                            int i8 = ((int) (f / optDouble3)) + 1;
                            if (!z2 || i8 < i6) {
                                i6 = i8;
                            }
                            pvs4.icD *= i6;
                        }
                        return pvs4;
                    } catch (Exception unused6) {
                    }
                }
                vGVar.pvs = f3;
                vGVar.icD = f2;
                return vGVar;
            }
        }
        f3 = optDouble3;
        if (LinkHeader.Parameters.Title.equals(str2)) {
        }
        vGVar.pvs = f3;
        vGVar.icD = f2;
        return vGVar;
    }

    public static String pvs(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    private static icD.vG pvs(icD.vG vGVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            vGVar.pvs = 0.0f;
            vGVar.icD = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = pvs(str);
            }
            if (TextUtils.isEmpty(str3)) {
                vGVar.pvs = 0.0f;
                vGVar.icD = 0.0f;
            } else {
                return pvs(str3, str2);
            }
        }
        return vGVar;
    }

    public static icD.vG pvs(String str, String str2) {
        return pvs(str, str2, false);
    }

    public static icD.vG pvs(String str, String str2, boolean z) {
        icD.vG vGVar = new icD.vG();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] pvs2 = pvs(str, (float) icD(str2), z);
            vGVar.pvs = pvs2[0];
            vGVar.icD = pvs2[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                vGVar.icD = 0.0f;
            }
        } catch (Exception unused) {
        }
        return vGVar;
    }

    public static double icD(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    public static int[] pvs(String str, float f, boolean z) {
        int[] icD2 = icD(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), icD2[0]), com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), icD2[1])};
    }

    public static int[] icD(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.Jd.pvs());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static String pvs() {
        return icD;
    }

    public static boolean icD() {
        return !TextUtils.isEmpty(icD);
    }
}
