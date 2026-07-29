package com.cmplay.policy.gdpr;

import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class HtmlUtil {

    public enum Color {
        GreenBright("#64bb12"),
        Black("#000000"),
        Red("#FF0000"),
        White("#FFFFFF"),
        Orange("#e82213"),
        Yellow("#e3a82a"),
        LightYellow("#b88b36"),
        WarningYellow("#FFB523"),
        Gray("#D8D8D8"),
        BottomBtnColor("#999999"),
        TextBlue("#3F70FF"),
        TextBlue2("#4395ff"),
        TextBlue3("#1A64A8");

        public final String color;

        Color(String str) {
            this.color = str;
        }
    }

    public static String fmtColor(CharSequence charSequence, Color color) {
        return String.format("<font color=\"%s\">%s</font>", color.color, charSequence);
    }

    public static String fmtB(CharSequence charSequence) {
        return String.format("<b>%s</b>", charSequence);
    }

    public static Spanned fromHtml(String str) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        try {
            Spanned fromHtml = Html.fromHtml(str);
            if (fromHtml != null) {
                return fromHtml;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return new SpannableString(str);
    }
}
