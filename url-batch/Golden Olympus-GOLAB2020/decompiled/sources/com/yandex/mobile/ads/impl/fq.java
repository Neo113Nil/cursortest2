package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.TextUtils;
import com.ironsource.b9;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class fq {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f25892a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f25893b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f25894c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f25895d;

    static {
        HashMap hashMap = new HashMap();
        f25895d = hashMap;
        st0.a(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        st0.a(-16711681, hashMap, "aqua", -8388652, "aquamarine");
        st0.a(-983041, hashMap, "azure", -657956, "beige");
        st0.a(-6972, hashMap, "bisque", -16777216, "black");
        st0.a(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        st0.a(-7722014, hashMap, "blueviolet", -5952982, "brown");
        st0.a(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        st0.a(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        st0.a(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        st0.a(-1828, hashMap, "cornsilk", -2354116, "crimson");
        st0.a(-16711681, hashMap, "cyan", -16777077, "darkblue");
        st0.a(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        st0.a(-5658199, hashMap, "darkgray", -16751616, "darkgreen");
        st0.a(-5658199, hashMap, "darkgrey", -4343957, "darkkhaki");
        st0.a(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        st0.a(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        st0.a(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        st0.a(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        st0.a(-13676721, hashMap, "darkslategray", -13676721, "darkslategrey");
        st0.a(-16724271, hashMap, "darkturquoise", -7077677, "darkviolet");
        st0.a(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        st0.a(-9868951, hashMap, "dimgray", -9868951, "dimgrey");
        st0.a(-14774017, hashMap, "dodgerblue", -5103070, "firebrick");
        st0.a(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        st0.a(-65281, hashMap, "fuchsia", -2302756, "gainsboro");
        st0.a(-460545, hashMap, "ghostwhite", -10496, "gold");
        st0.a(-2448096, hashMap, "goldenrod", -8355712, "gray");
        st0.a(-16744448, hashMap, "green", -5374161, "greenyellow");
        st0.a(-8355712, hashMap, "grey", -983056, "honeydew");
        st0.a(-38476, hashMap, "hotpink", -3318692, "indianred");
        st0.a(-11861886, hashMap, "indigo", -16, "ivory");
        st0.a(-989556, hashMap, "khaki", -1644806, "lavender");
        st0.a(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        st0.a(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        st0.a(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        st0.a(-329006, hashMap, "lightgoldenrodyellow", -2894893, "lightgray");
        st0.a(-7278960, hashMap, "lightgreen", -2894893, "lightgrey");
        st0.a(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        st0.a(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        st0.a(-8943463, hashMap, "lightslategray", -8943463, "lightslategrey");
        st0.a(-5192482, hashMap, "lightsteelblue", -32, "lightyellow");
        st0.a(-16711936, hashMap, "lime", -13447886, "limegreen");
        st0.a(-331546, hashMap, "linen", -65281, "magenta");
        st0.a(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        st0.a(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        st0.a(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        st0.a(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        st0.a(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        st0.a(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        st0.a(-6943, hashMap, "mistyrose", -6987, "moccasin");
        st0.a(-8531, hashMap, "navajowhite", -16777088, "navy");
        st0.a(-133658, hashMap, "oldlace", -8355840, "olive");
        st0.a(-9728477, hashMap, "olivedrab", -23296, "orange");
        st0.a(-47872, hashMap, "orangered", -2461482, "orchid");
        st0.a(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        st0.a(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        st0.a(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        st0.a(-3308225, hashMap, "peru", -16181, "pink");
        st0.a(-2252579, hashMap, "plum", -5185306, "powderblue");
        st0.a(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        st0.a(-65536, hashMap, "red", -4419697, "rosybrown");
        st0.a(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        st0.a(-360334, hashMap, "salmon", -744352, "sandybrown");
        st0.a(-13726889, hashMap, "seagreen", -2578, "seashell");
        st0.a(-6270419, hashMap, "sienna", -4144960, "silver");
        st0.a(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        st0.a(-9404272, hashMap, "slategray", -9404272, "slategrey");
        st0.a(-1286, hashMap, "snow", -16711809, "springgreen");
        st0.a(-12156236, hashMap, "steelblue", -2968436, "tan");
        st0.a(-16744320, hashMap, "teal", -2572328, "thistle");
        st0.a(-40121, hashMap, "tomato", 0, b9.h.f15460T);
        st0.a(-12525360, hashMap, "turquoise", -1146130, "violet");
        st0.a(-663885, hashMap, "wheat", -1, "white");
        st0.a(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    private static int a(String str, boolean z4) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z4 ? f25894c : f25893b).matcher(replace);
            if (matcher.matches()) {
                if (z4) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f25892a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) f25895d.get(C2207rf.b(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String str) {
        return a(str, false);
    }

    public static int a(String str) {
        return a(str, true);
    }
}
