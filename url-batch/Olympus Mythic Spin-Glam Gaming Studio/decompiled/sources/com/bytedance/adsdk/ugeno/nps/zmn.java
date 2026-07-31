package com.bytedance.adsdk.ugeno.nps;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes13.dex */
public class zmn {

    /* renamed from: com.bytedance.adsdk.ugeno.nps.zmn$zmn, reason: collision with other inner class name */
    public static class C0112zmn {
        public int[] fs;
        public GradientDrawable.Orientation zmn;
        public float[] zn;
    }

    public static int zmn(String str) {
        return zmn(str, -16777216);
    }

    public static int zmn(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.equals(X3.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i2 = 1; i2 < charArray.length; i2++) {
                sb.append(charArray[i2]);
                sb.append(charArray[i2]);
            }
            return Color.parseColor(sb.toString());
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (!str.startsWith("rgba")) {
            return -16777216;
        }
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(StringUtils.COMMA);
        if (split == null || split.length != 4) {
            return i;
        }
        return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2]));
    }

    public static C0112zmn fs(String str) {
        int indexOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String substring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(substring)) {
                return null;
            }
            int zmn = zmn(substring, '%');
            int indexOf2 = substring.indexOf(StringUtils.COMMA);
            String substring2 = substring.substring(0, indexOf2);
            C0112zmn c0112zmn = new C0112zmn();
            c0112zmn.zmn = fb(substring2);
            String substring3 = substring.substring(indexOf2 + 1);
            int[] iArr = new int[zmn];
            float[] fArr = new float[zmn];
            for (int i = 0; i < zmn; i++) {
                int indexOf3 = substring3.indexOf("%");
                String trim = substring3.substring(0, indexOf3 + 1).trim();
                if (trim.contains("rgba")) {
                    indexOf = trim.indexOf(")");
                } else {
                    indexOf = trim.indexOf(" ");
                }
                int i2 = indexOf + 1;
                iArr[i] = zmn(trim.substring(0, i2).trim());
                fArr[i] = zn.zmn(trim.substring(i2, trim.indexOf("%")).trim(), 0.0f) / 100.0f;
                int i3 = indexOf3 + 2;
                if (substring3.length() <= i3) {
                    break;
                }
                substring3 = substring3.substring(i3);
            }
            if (zmn < 2) {
                return null;
            }
            c0112zmn.fs = iArr;
            c0112zmn.zn = fArr;
            return c0112zmn;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zmn(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    public static boolean zn(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation fb(String str) {
        int parseInt;
        try {
            if (str.contains("deg")) {
                parseInt = Integer.parseInt(str.substring(0, str.length() - 3).trim());
            } else {
                parseInt = Integer.parseInt(str);
            }
            if (parseInt == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (parseInt == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            if (parseInt == 45) {
                return GradientDrawable.Orientation.BL_TR;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int zmn(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i2 = 255;
        }
        return (i & 16777215) | (i2 << 24);
    }
}
