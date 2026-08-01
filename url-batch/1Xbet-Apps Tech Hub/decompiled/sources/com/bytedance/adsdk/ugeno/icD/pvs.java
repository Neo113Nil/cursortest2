package com.bytedance.adsdk.ugeno.icD;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public class pvs {

    /* compiled from: ColorUtils.java */
    /* renamed from: com.bytedance.adsdk.ugeno.icD.pvs$pvs, reason: collision with other inner class name */
    public static class C0036pvs {
        public int[] icD;
        public GradientDrawable.Orientation pvs;
        public float[] vG;
    }

    public static int pvs(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i = 1; i < charArray.length; i++) {
                sb.append(charArray[i]).append(charArray[i]);
            }
            return Color.parseColor(sb.toString());
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        return (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null && split.length == 4) ? (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0 : ViewCompat.MEASURED_STATE_MASK;
    }

    public static C0036pvs icD(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String substring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        int pvs = pvs(substring, '%');
        int indexOf2 = substring.indexOf(",");
        String substring2 = substring.substring(0, indexOf2);
        C0036pvs c0036pvs = new C0036pvs();
        c0036pvs.pvs = Jd(substring2);
        String substring3 = substring.substring(indexOf2 + 1);
        int[] iArr = new int[pvs];
        float[] fArr = new float[pvs];
        for (int i = 0; i < pvs; i++) {
            int indexOf3 = substring3.indexOf("%");
            String trim = substring3.substring(0, indexOf3 + 1).trim();
            if (trim.contains("rgba")) {
                indexOf = trim.indexOf(")");
            } else {
                indexOf = trim.indexOf(" ");
            }
            int i2 = indexOf + 1;
            iArr[i] = pvs(trim.substring(0, i2).trim());
            fArr[i] = vG.pvs(trim.substring(i2, trim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i3 = indexOf3 + 2;
            if (substring3.length() <= i3) {
                break;
            }
            substring3 = substring3.substring(i3);
        }
        c0036pvs.icD = iArr;
        c0036pvs.vG = fArr;
        return c0036pvs;
    }

    public static int pvs(String str, char c) {
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

    public static boolean vG(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation Jd(String str) {
        try {
            int parseInt = Integer.parseInt(str);
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
}
