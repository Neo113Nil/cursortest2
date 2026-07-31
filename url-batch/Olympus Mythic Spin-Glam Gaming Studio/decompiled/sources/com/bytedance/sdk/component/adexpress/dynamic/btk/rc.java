package com.bytedance.sdk.component.adexpress.dynamic.btk;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.btk.fs;
import com.bytedance.sdk.component.adexpress.fs.mw;
import com.bytedance.sdk.component.utils.doe;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.sglib.easymobile.androidnative.gdpr.SplitContent;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rc {
    private static String fs;
    private static final Set<String> zmn = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:185|(1:188)|189)(2:214|(1:216)(5:217|191|(5:201|202|203|(3:205|(1:211)(1:208)|209)|212)|199|200))|190|191|(3:193|195|197)|201|202|203|(0)|212) */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0444 A[Catch: Exception -> 0x0455, TryCatch #5 {Exception -> 0x0455, blocks: (B:203:0x043a, B:205:0x0444, B:209:0x044e), top: B:202:0x043a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fs.zn zmn(String str, String str2, String str3, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, double d, int i2, double d2, String str4, mw mwVar) {
        String str5;
        float optDouble;
        float optDouble2;
        float optDouble3;
        float f;
        float f2;
        float f3;
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk;
        String str6 = str;
        int i3 = i;
        String fb = mwVar.fb();
        int nps = mwVar.nps();
        if (com.bytedance.sdk.component.adexpress.fb.fs() && i2 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new fs.zn(0.0f, 0.0f);
        }
        fs.zn znVar = new fs.zn();
        if (str6.startsWith("<svg") || zmn.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.fb.fs() && "close-fill".equals(str2))) {
                    float optDouble4 = (float) PangleNetworkBridge.jsonObjectInit(str3).optDouble("fontSize");
                    znVar.zmn = optDouble4;
                    znVar.fs = optDouble4;
                    return znVar;
                }
            } catch (Exception unused) {
            }
            znVar.zmn = 10.0f;
            znVar.fs = 10.0f;
            return znVar;
        }
        if ("logo".equals(str2)) {
            if (!com.bytedance.sdk.component.adexpress.fb.fs() && ((!TextUtils.isEmpty(str) && str6.contains("adx:")) || fs())) {
                if (fs()) {
                    return zmn(znVar, str6, str3, fs);
                }
                return zmn(znVar, str6, str3, "");
            }
            znVar.zmn = "union".equals(str6) ? 14.0f : 20.0f;
            znVar.fs = 10.0f;
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                String kjb = mwVar.kjb();
                if ("union".equals(str6) && TextUtils.isEmpty(kjb)) {
                    znVar.zmn = 0.0f;
                }
                String str7 = str2 + str6;
                float fs2 = (float) fs(str3);
                if (str7.contains("logoad")) {
                    String zak = mwVar.zak();
                    if (TextUtils.isEmpty(zak)) {
                        znVar.zmn = 0.0f;
                    } else {
                        return zmn(zak, str3);
                    }
                }
                znVar.fs = fs2;
            }
            return znVar;
        }
        if ("development-name".equals(str2)) {
            str6 = doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_text_privacy_development") + str6;
        }
        if ("app-version".equals(str2)) {
            StringBuilder sb = new StringBuilder();
            str5 = "";
            sb.append(doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_text_privacy_app_version"));
            sb.append(str6);
            str6 = sb.toString();
        } else {
            str5 = "";
        }
        int i4 = 0;
        if ("score-count".equals(str2)) {
            try {
                i4 = Integer.parseInt(str6);
            } catch (NumberFormatException unused2) {
            }
            if (com.bytedance.sdk.component.adexpress.fb.fs() && i4 < 0) {
                return new fs.zn(0.0f, 0.0f);
            }
            return zmn("(" + String.format(doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_comment_num"), Integer.valueOf(i4)) + ")", str3);
        }
        if ("score-count-type-2".equals(str2)) {
            try {
                i4 = Integer.parseInt(str6);
            } catch (NumberFormatException unused3) {
            }
            if (com.bytedance.sdk.component.adexpress.fb.fs() && i4 < 0) {
                return new fs.zn(0.0f, 0.0f);
            }
            return zmn("(" + String.format(new DecimalFormat("###,###,###").format(i4), Integer.valueOf(i4)) + ")", str3);
        }
        if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.fb.fs()) {
            fs.zn znVar2 = new fs.zn();
            float fs3 = (float) fs(str3);
            znVar2.zmn = fs3;
            znVar2.fs = fs3;
            return znVar2;
        }
        if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
            if (!mwVar.zmn() || !com.bytedance.sdk.component.adexpress.fb.hhw.fs(fb)) {
                if (d < 10.0d) {
                    return zmn("0S", str3);
                }
                return zmn("00S", str3);
            }
            if (((int) (d + 0.5d)) - nps < 10) {
                if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                    return zmn("0s", str3);
                }
                return zmn(String.format(doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_full_skip"), "0"), str3);
            }
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                return zmn("00s", str3);
            }
            return zmn(String.format(doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_full_skip"), "00"), str3);
        }
        if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
            return zmn("| " + doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_screen_skip_tx"), str3);
        }
        if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
            return zmn("| ".concat(String.format(doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_full_skip_count_down"), "00")), str3);
        }
        if ("skip-with-time-skip-btn".equals(str2)) {
            fs.zn zmn2 = zmn("| " + doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_screen_skip_tx"), str3);
            if (com.bytedance.sdk.component.adexpress.fb.fs()) {
                try {
                    zmn2.fs = (float) ((zmn2.fs * PangleNetworkBridge.jsonObjectInit(str3).optDouble("lineHeight")) / 1.2d);
                } catch (Throwable unused4) {
                }
                zmn2.zmn = zmn2.fs;
            }
            return zmn2;
        }
        if ("skip".equals(str2)) {
            return zmn(doe.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), "tt_reward_screen_skip_tx"), str3);
        }
        if ("timedown".equals(str2)) {
            return zmn("0.0", str3);
        }
        if ("text_star".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.fb.fs() && (d2 < 0.0d || d2 > 5.0d)) {
                return new fs.zn(0.0f, 0.0f);
            }
            return zmn("0.0", str3);
        }
        if (TextUtils.equals("privacy-detail", str2)) {
            return zmn("Permission list | Privacy policy", str3);
        }
        if ("arrowButton".equals(str2)) {
            return zmn("Download", str3);
        }
        if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.fb.fs() && TextUtils.isEmpty(str6) && (btk = zgVar.iv().btk()) != null) {
            str6 = btk.rje() != null ? zgVar.iv().btk().rje().optString(com.bytedance.sdk.component.adexpress.fb.nps.zn(com.bytedance.sdk.component.adexpress.fb.zmn())) : str5;
        }
        if ("fillButton".equals(str2) || "text".equals(str2) || SplitContent.BUTTON_VALUE.equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && (!com.bytedance.sdk.component.adexpress.fb.fs() || !"open_ad".equals(fb))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
            return zmn(str6, str3);
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str3);
            int length = str6.length();
            optDouble = (float) jsonObjectInit.optDouble("fontSize");
            float optDouble5 = (float) jsonObjectInit.optDouble("letterSpacing");
            optDouble2 = (float) jsonObjectInit.optDouble("lineHeight");
            optDouble3 = (float) jsonObjectInit.optDouble("maxWidth");
            f = (length * (optDouble + optDouble5)) - optDouble5;
        } catch (JSONException unused5) {
        }
        if ("muted".equals(str2)) {
            znVar.zmn = optDouble;
            znVar.fs = optDouble;
            return znVar;
        }
        if ("star".equals(str2)) {
            if (com.bytedance.sdk.component.adexpress.fb.fs() && (d2 < 0.0d || d2 > 5.0d || i2 != 4)) {
                return new fs.zn(0.0f, 0.0f);
            }
            fs.zn zmn3 = zmn("str", str3);
            zmn3.zmn = optDouble * 5.0f;
            return zmn3;
        }
        if ("icon".equals(str2)) {
            znVar.zmn = optDouble;
            znVar.fs = optDouble;
            return znVar;
        }
        if (z) {
            int i5 = ((int) (f / optDouble3)) + 1;
            if (z2 && i5 >= i3) {
                i5 = i3;
            }
            f2 = (float) (optDouble2 * optDouble * i5 * 1.2d);
        } else {
            f2 = (float) (optDouble2 * optDouble * 1.2d);
            if (f <= optDouble3) {
                f3 = f;
                if (!"title".equals(str2) || (com.bytedance.sdk.component.adexpress.fb.fs() && "open_ad".equals(fb) && "source".equals(str2))) {
                    fs.zn zmn4 = zmn(str6.replace('\n', ' '), str3, false);
                    if (z) {
                        int i6 = ((int) (f / optDouble3)) + 1;
                        if (!z2 || i6 < i3) {
                            i3 = i6;
                        }
                        zmn4.fs *= i3;
                    }
                    return zmn4;
                }
                znVar.zmn = f3;
                znVar.fs = f2;
                return znVar;
            }
        }
        f3 = optDouble3;
        if (!"title".equals(str2)) {
        }
        fs.zn zmn42 = zmn(str6.replace('\n', ' '), str3, false);
        if (z) {
        }
        return zmn42;
    }

    public static String zmn(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    private static fs.zn zmn(fs.zn znVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            znVar.zmn = 0.0f;
            znVar.fs = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = zmn(str);
            }
            if (TextUtils.isEmpty(str3)) {
                znVar.zmn = 0.0f;
                znVar.fs = 0.0f;
            } else {
                return zmn(str3, str2);
            }
        }
        return znVar;
    }

    public static fs.zn zmn(String str, String str2) {
        return zmn(str, str2, false);
    }

    public static fs.zn zmn(String str, String str2, boolean z) {
        fs.zn znVar = new fs.zn();
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str2);
            int[] zmn2 = zmn(str, (float) fs(str2), z);
            znVar.zmn = zmn2[0];
            znVar.fs = zmn2[1];
            if (jsonObjectInit.optDouble("lineHeight", 1.0d) == 0.0d) {
                znVar.fs = 0.0f;
            }
        } catch (Exception unused) {
        }
        return znVar;
    }

    public static double fs(String str) {
        try {
            return Double.parseDouble(PangleNetworkBridge.jsonObjectInit(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] zmn(String str, float f, boolean z) {
        int[] fs2 = fs(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), fs2[0]), com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), fs2[1])};
    }

    public static int[] fs(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.fb.zmn());
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

    public static String zmn() {
        return fs;
    }

    public static boolean fs() {
        return !TextUtils.isEmpty(fs);
    }
}
