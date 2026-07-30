package com.google.android.gms.internal.ads;

import O.C0357t;
import android.text.Layout;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class L3 implements InterfaceC3774q3 {

    /* renamed from: n, reason: collision with root package name */
    public final XmlPullParserFactory f26100n;

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f26094u = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f26095v = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f26096w = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f26097x = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f26098y = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f26099z = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f26092A = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: B, reason: collision with root package name */
    public static final K3 f26093B = new K3(1, 1, 30.0f);

    public L3() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f26100n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e6) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static N3 b(XmlPullParser xmlPullParser, N3 n32) {
        char c4;
        Matcher matcher;
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        I3 i32;
        char c14;
        C4106wC f6;
        int i;
        char c15;
        int i4;
        int attributeCount = xmlPullParser.getAttributeCount();
        N3 n33 = n32;
        for (int i9 = 0; i9 < attributeCount; i9++) {
            String attributeValue = xmlPullParser.getAttributeValue(i9);
            String attributeName = xmlPullParser.getAttributeName(i9);
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals(com.anythink.expressad.foundation.h.k.f19791d)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    if (com.anythink.expressad.foundation.h.k.f19792e.equals(xmlPullParser.getName())) {
                        n33 = c(n33);
                        n33.f26466l = attributeValue;
                        continue;
                    }
                case 1:
                    n33 = c(n33);
                    try {
                        n33.f26459d = AbstractC2695Nm.a(attributeValue, false);
                        n33.f26460e = true;
                        continue;
                    } catch (IllegalArgumentException unused) {
                        com.anythink.basead.b.c.i.w(attributeValue, "Failed parsing background value: ", "TtmlParser");
                    }
                case 2:
                    n33 = c(n33);
                    try {
                        n33.f26457b = AbstractC2695Nm.a(attributeValue, false);
                        n33.f26458c = true;
                        break;
                    } catch (IllegalArgumentException unused2) {
                        com.anythink.basead.b.c.i.w(attributeValue, "Failed parsing color value: ", "TtmlParser");
                        break;
                    }
                case 3:
                    n33 = c(n33);
                    n33.f26456a = attributeValue;
                    break;
                case 4:
                    try {
                        n33 = c(n33);
                        String str = AbstractC3548lu.f32613a;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        Pattern pattern = f26096w;
                        if (length == 1) {
                            matcher = pattern.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(com.anythink.core.common.d.j.f12535z);
                                throw new C3666o3(sb.toString());
                            }
                            matcher = pattern.matcher(split[1]);
                            AbstractC3217fl.I("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new C3666o3(sb2.toString());
                        }
                        String group = matcher.group(3);
                        if (group == null) {
                            throw null;
                        }
                        int hashCode = group.hashCode();
                        if (hashCode == 37) {
                            if (group.equals("%")) {
                                c9 = 2;
                            }
                            c9 = 65535;
                        } else if (hashCode != 3240) {
                            if (hashCode == 3592 && group.equals("px")) {
                                c9 = 0;
                            }
                            c9 = 65535;
                        } else {
                            if (group.equals("em")) {
                                c9 = 1;
                            }
                            c9 = 65535;
                        }
                        if (c9 == 0) {
                            n33.f26464j = 1;
                        } else if (c9 == 1) {
                            n33.f26464j = 2;
                        } else {
                            if (c9 != 2) {
                                StringBuilder sb3 = new StringBuilder(group.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(group);
                                sb3.append("'.");
                                throw new C3666o3(sb3.toString());
                            }
                            n33.f26464j = 3;
                        }
                        String group2 = matcher.group(1);
                        if (group2 == null) {
                            throw null;
                        }
                        n33.f26465k = Float.parseFloat(group2);
                        break;
                    } catch (C3666o3 unused3) {
                        com.anythink.basead.b.c.i.w(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                        break;
                    }
                    break;
                case 5:
                    n33 = c(n33);
                    n33.f26463h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 6:
                    n33 = c(n33);
                    n33.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    n33 = c(n33);
                    n33.f26469o = d(attributeValue);
                    break;
                case '\b':
                    n33 = c(n33);
                    n33.f26470p = d(attributeValue);
                    break;
                case '\t':
                    String f9 = AbstractC3035cL.f(attributeValue);
                    int hashCode2 = f9.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && f9.equals("none")) {
                            c10 = 0;
                        }
                        c10 = 65535;
                    } else {
                        if (f9.equals("all")) {
                            c10 = 1;
                        }
                        c10 = 65535;
                    }
                    if (c10 != 0) {
                        if (c10 == 1) {
                            n33 = c(n33);
                            n33.f26471q = 1;
                            break;
                        }
                    } else {
                        n33 = c(n33);
                        n33.f26471q = 0;
                        break;
                    }
                    break;
                case '\n':
                    String f10 = AbstractC3035cL.f(attributeValue);
                    switch (f10.hashCode()) {
                        case -618561360:
                            if (f10.equals("baseContainer")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -410956671:
                            if (f10.equals("container")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -250518009:
                            if (f10.equals("delimiter")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -136074796:
                            if (f10.equals("textContainer")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3016401:
                            if (f10.equals("base")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3556653:
                            if (f10.equals(com.anythink.basead.exoplayer.k.o.f8603c)) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    if (c11 != 0) {
                        if (c11 != 1 && c11 != 2) {
                            if (c11 != 3 && c11 != 4) {
                                if (c11 == 5) {
                                    n33 = c(n33);
                                    n33.f26467m = 4;
                                    break;
                                }
                            } else {
                                n33 = c(n33);
                                n33.f26467m = 3;
                                break;
                            }
                        } else {
                            n33 = c(n33);
                            n33.f26467m = 2;
                            break;
                        }
                    } else {
                        n33 = c(n33);
                        n33.f26467m = 1;
                        break;
                    }
                    break;
                case 11:
                    String f11 = AbstractC3035cL.f(attributeValue);
                    int hashCode3 = f11.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && f11.equals("after")) {
                            c12 = 1;
                        }
                        c12 = 65535;
                    } else {
                        if (f11.equals("before")) {
                            c12 = 0;
                        }
                        c12 = 65535;
                    }
                    if (c12 != 0) {
                        if (c12 == 1) {
                            n33 = c(n33);
                            n33.f26468n = 2;
                            break;
                        }
                    } else {
                        n33 = c(n33);
                        n33.f26468n = 1;
                        break;
                    }
                    break;
                case '\f':
                    String f12 = AbstractC3035cL.f(attributeValue);
                    switch (f12.hashCode()) {
                        case -1461280213:
                            if (f12.equals("nounderline")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -1026963764:
                            if (f12.equals("underline")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 913457136:
                            if (f12.equals("nolinethrough")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 1679736913:
                            if (f12.equals("linethrough")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    if (c13 == 0) {
                        n33 = c(n33);
                        n33.f26461f = 1;
                        break;
                    } else if (c13 == 1) {
                        n33 = c(n33);
                        n33.f26461f = 0;
                        break;
                    } else {
                        if (c13 == 2) {
                            n33 = c(n33);
                            n33.f26462g = 1;
                        } else if (c13 == 3) {
                            n33 = c(n33);
                            n33.f26462g = 0;
                        }
                    }
                    break;
                case '\r':
                    n33 = c(n33);
                    Pattern pattern2 = I3.f25514d;
                    if (attributeValue != null) {
                        String f13 = AbstractC3035cL.f(attributeValue.trim());
                        if (!f13.isEmpty()) {
                            AbstractC2917aC l9 = AbstractC2917aC.l(TextUtils.split(f13, I3.f25514d));
                            String str2 = (String) AbstractC2720Pd.n(AbstractC3194fG.f(I3.f25518h, l9), "outside");
                            int hashCode4 = str2.hashCode();
                            if (hashCode4 != -1106037339) {
                                if (hashCode4 == 92734940 && str2.equals("after")) {
                                    c14 = 0;
                                    int i10 = c14 == 0 ? c14 != 1 ? 1 : -2 : 2;
                                    f6 = AbstractC3194fG.f(I3.f25515e, l9);
                                    if (f6.isEmpty()) {
                                        String str3 = (String) new C3081dC(f6, f6.f34960n, f6.f34961u).next();
                                        if (str3.hashCode() == 3387192 && str3.equals("none")) {
                                            i = 0;
                                            i4 = 0;
                                            i32 = new I3(i4, i, i10);
                                            n33.f26472r = i32;
                                            break;
                                        }
                                        i = 0;
                                        i4 = -1;
                                        i32 = new I3(i4, i, i10);
                                        n33.f26472r = i32;
                                    } else {
                                        C4106wC f14 = AbstractC3194fG.f(I3.f25517g, l9);
                                        C4106wC f15 = AbstractC3194fG.f(I3.f25516f, l9);
                                        if (!f14.isEmpty() || !f15.isEmpty()) {
                                            String str4 = (String) AbstractC2720Pd.n(f14, "filled");
                                            i = (str4.hashCode() == 3417674 && str4.equals("open")) ? 2 : 1;
                                            String str5 = (String) AbstractC2720Pd.n(f15, "circle");
                                            int hashCode5 = str5.hashCode();
                                            if (hashCode5 != -905816648) {
                                                if (hashCode5 == 99657 && str5.equals("dot")) {
                                                    c15 = 0;
                                                    i4 = c15 == 0 ? c15 != 1 ? 1 : 3 : 2;
                                                    i32 = new I3(i4, i, i10);
                                                    n33.f26472r = i32;
                                                }
                                                c15 = 65535;
                                                if (c15 == 0) {
                                                }
                                                i32 = new I3(i4, i, i10);
                                                n33.f26472r = i32;
                                            } else {
                                                if (str5.equals("sesame")) {
                                                    c15 = 1;
                                                    if (c15 == 0) {
                                                    }
                                                    i32 = new I3(i4, i, i10);
                                                    n33.f26472r = i32;
                                                }
                                                c15 = 65535;
                                                if (c15 == 0) {
                                                }
                                                i32 = new I3(i4, i, i10);
                                                n33.f26472r = i32;
                                            }
                                        }
                                        i = 0;
                                        i4 = -1;
                                        i32 = new I3(i4, i, i10);
                                        n33.f26472r = i32;
                                    }
                                }
                                c14 = 65535;
                                if (c14 == 0) {
                                }
                                f6 = AbstractC3194fG.f(I3.f25515e, l9);
                                if (f6.isEmpty()) {
                                }
                            } else {
                                if (str2.equals("outside")) {
                                    c14 = 1;
                                    if (c14 == 0) {
                                    }
                                    f6 = AbstractC3194fG.f(I3.f25515e, l9);
                                    if (f6.isEmpty()) {
                                    }
                                }
                                c14 = 65535;
                                if (c14 == 0) {
                                }
                                f6 = AbstractC3194fG.f(I3.f25515e, l9);
                                if (f6.isEmpty()) {
                                }
                            }
                        }
                    }
                    i32 = null;
                    n33.f26472r = i32;
                    break;
                case 14:
                    N3 c16 = c(n33);
                    Matcher matcher2 = f26097x.matcher(attributeValue);
                    float f16 = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 == null) {
                                throw null;
                                break;
                            } else {
                                f16 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            }
                        } catch (NumberFormatException e6) {
                            AbstractC3217fl.O("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e6);
                        }
                    } else {
                        com.anythink.basead.b.c.i.w(attributeValue, "Invalid value for shear: ", "TtmlParser");
                    }
                    c16.f26473s = f16;
                    n33 = c16;
                    break;
                case 15:
                    n33 = c(n33);
                    n33.f26474t = attributeValue;
                    break;
                case 16:
                    n33 = c(n33);
                    n33.f26475u = attributeValue;
                    break;
            }
        }
        return n33;
    }

    public static N3 c(N3 n32) {
        return n32 == null ? new N3() : n32;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Layout.Alignment d(String str) {
        char c4;
        String f6 = AbstractC3035cL.f(str);
        switch (f6.hashCode()) {
            case -1364013995:
                if (f6.equals("center")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 100571:
                if (f6.equals("end")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 3317767:
                if (f6.equals("left")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 108511772:
                if (f6.equals("right")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 109757538:
                if (f6.equals(com.anythink.expressad.foundation.d.d.cg)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        if (c4 == 0 || c4 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c4 == 2 || c4 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c4 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r13.equals(com.anythink.core.common.s.f16407a) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long f(String str, K3 k32) {
        double d2;
        double d3;
        Matcher matcher = f26094u.matcher(str);
        char c4 = 2;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * com.anythink.expressad.f.a.b.f18559P;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d9 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d10 = d9 + parseLong3;
            return (long) ((d10 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r13) / k32.f25870a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / k32.f25871b) / k32.f25870a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f26095v.matcher(str);
        if (!matcher2.matches()) {
            throw new C3666o3("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                c4 = 4;
            }
            c4 = 65535;
        } else if (hashCode == 104) {
            if (group6.equals("h")) {
                c4 = 0;
            }
            c4 = 65535;
        } else if (hashCode == 109) {
            if (group6.equals(com.anythink.expressad.f.a.b.dI)) {
                c4 = 1;
            }
            c4 = 65535;
        } else if (hashCode == 3494) {
            if (group6.equals("ms")) {
                c4 = 3;
            }
            c4 = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group6.equals("t")) {
                c4 = 5;
            }
            c4 = 65535;
        }
        if (c4 == 0) {
            d2 = 3600.0d;
        } else {
            if (c4 != 1) {
                if (c4 == 3) {
                    d3 = 1000.0d;
                } else {
                    if (c4 != 4) {
                        if (c4 == 5) {
                            d3 = k32.f25872c;
                        }
                        return (long) (parseDouble2 * 1000000.0d);
                    }
                    d3 = k32.f25870a;
                }
                parseDouble2 /= d3;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d2 = 60.0d;
        }
        parseDouble2 *= d2;
        return (long) (parseDouble2 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0402 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07cb, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x059b, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x054b, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:164:0x04ee, B:166:0x04f8, B:182:0x053e, B:199:0x042f, B:202:0x0430, B:203:0x0431, B:205:0x043e, B:208:0x0446, B:211:0x0454, B:213:0x045a, B:215:0x0465, B:217:0x0479, B:219:0x047a, B:220:0x047b, B:221:0x0488, B:224:0x0389, B:226:0x038a, B:227:0x038b, B:228:0x0398, B:231:0x03a2, B:234:0x03ab, B:236:0x03b1, B:238:0x03bc, B:240:0x03cc, B:242:0x03cd, B:243:0x03ce, B:244:0x03d6, B:248:0x055e, B:250:0x056b, B:252:0x0576, B:254:0x057c, B:255:0x0588, B:264:0x05c3, B:268:0x05e5, B:287:0x06ce, B:294:0x0656, B:296:0x065e, B:298:0x0675, B:302:0x067e, B:313:0x0689, B:306:0x0697, B:305:0x068e, B:293:0x074d, B:318:0x06ae, B:319:0x06b5, B:320:0x06bf, B:345:0x06e7, B:349:0x06f3, B:352:0x06fc, B:358:0x070f, B:360:0x071f, B:363:0x072f, B:365:0x0734, B:367:0x0738, B:368:0x073f, B:372:0x0716, B:382:0x0199, B:384:0x01a3, B:387:0x01ac, B:389:0x01b2, B:391:0x01bd, B:393:0x01c7, B:395:0x01c8, B:396:0x01c9, B:397:0x0111, B:399:0x011d, B:402:0x0129, B:405:0x012f, B:407:0x013c, B:416:0x015d, B:420:0x0161, B:421:0x0174, B:424:0x0184, B:429:0x017e, B:432:0x0183, B:443:0x076d, B:445:0x0779, B:446:0x0780, B:449:0x0788, B:452:0x078c, B:454:0x0796, B:456:0x07a0, B:459:0x07a7, B:460:0x07a8, B:463:0x07bc, B:466:0x07c9, B:473:0x07e8), top: B:2:0x0009, inners: #6, #10, #12, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a3 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07cb, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x059b, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x054b, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:164:0x04ee, B:166:0x04f8, B:182:0x053e, B:199:0x042f, B:202:0x0430, B:203:0x0431, B:205:0x043e, B:208:0x0446, B:211:0x0454, B:213:0x045a, B:215:0x0465, B:217:0x0479, B:219:0x047a, B:220:0x047b, B:221:0x0488, B:224:0x0389, B:226:0x038a, B:227:0x038b, B:228:0x0398, B:231:0x03a2, B:234:0x03ab, B:236:0x03b1, B:238:0x03bc, B:240:0x03cc, B:242:0x03cd, B:243:0x03ce, B:244:0x03d6, B:248:0x055e, B:250:0x056b, B:252:0x0576, B:254:0x057c, B:255:0x0588, B:264:0x05c3, B:268:0x05e5, B:287:0x06ce, B:294:0x0656, B:296:0x065e, B:298:0x0675, B:302:0x067e, B:313:0x0689, B:306:0x0697, B:305:0x068e, B:293:0x074d, B:318:0x06ae, B:319:0x06b5, B:320:0x06bf, B:345:0x06e7, B:349:0x06f3, B:352:0x06fc, B:358:0x070f, B:360:0x071f, B:363:0x072f, B:365:0x0734, B:367:0x0738, B:368:0x073f, B:372:0x0716, B:382:0x0199, B:384:0x01a3, B:387:0x01ac, B:389:0x01b2, B:391:0x01bd, B:393:0x01c7, B:395:0x01c8, B:396:0x01c9, B:397:0x0111, B:399:0x011d, B:402:0x0129, B:405:0x012f, B:407:0x013c, B:416:0x015d, B:420:0x0161, B:421:0x0174, B:424:0x0184, B:429:0x017e, B:432:0x0183, B:443:0x076d, B:445:0x0779, B:446:0x0780, B:449:0x0788, B:452:0x078c, B:454:0x0796, B:456:0x07a0, B:459:0x07a7, B:460:0x07a8, B:463:0x07bc, B:466:0x07c9, B:473:0x07e8), top: B:2:0x0009, inners: #6, #10, #12, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04f8 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07cb, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x059b, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x054b, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:164:0x04ee, B:166:0x04f8, B:182:0x053e, B:199:0x042f, B:202:0x0430, B:203:0x0431, B:205:0x043e, B:208:0x0446, B:211:0x0454, B:213:0x045a, B:215:0x0465, B:217:0x0479, B:219:0x047a, B:220:0x047b, B:221:0x0488, B:224:0x0389, B:226:0x038a, B:227:0x038b, B:228:0x0398, B:231:0x03a2, B:234:0x03ab, B:236:0x03b1, B:238:0x03bc, B:240:0x03cc, B:242:0x03cd, B:243:0x03ce, B:244:0x03d6, B:248:0x055e, B:250:0x056b, B:252:0x0576, B:254:0x057c, B:255:0x0588, B:264:0x05c3, B:268:0x05e5, B:287:0x06ce, B:294:0x0656, B:296:0x065e, B:298:0x0675, B:302:0x067e, B:313:0x0689, B:306:0x0697, B:305:0x068e, B:293:0x074d, B:318:0x06ae, B:319:0x06b5, B:320:0x06bf, B:345:0x06e7, B:349:0x06f3, B:352:0x06fc, B:358:0x070f, B:360:0x071f, B:363:0x072f, B:365:0x0734, B:367:0x0738, B:368:0x073f, B:372:0x0716, B:382:0x0199, B:384:0x01a3, B:387:0x01ac, B:389:0x01b2, B:391:0x01bd, B:393:0x01c7, B:395:0x01c8, B:396:0x01c9, B:397:0x0111, B:399:0x011d, B:402:0x0129, B:405:0x012f, B:407:0x013c, B:416:0x015d, B:420:0x0161, B:421:0x0174, B:424:0x0184, B:429:0x017e, B:432:0x0183, B:443:0x076d, B:445:0x0779, B:446:0x0780, B:449:0x0788, B:452:0x078c, B:454:0x0796, B:456:0x07a0, B:459:0x07a7, B:460:0x07a8, B:463:0x07bc, B:466:0x07c9, B:473:0x07e8), top: B:2:0x0009, inners: #6, #10, #12, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0199 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07cb, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x059b, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x054b, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:164:0x04ee, B:166:0x04f8, B:182:0x053e, B:199:0x042f, B:202:0x0430, B:203:0x0431, B:205:0x043e, B:208:0x0446, B:211:0x0454, B:213:0x045a, B:215:0x0465, B:217:0x0479, B:219:0x047a, B:220:0x047b, B:221:0x0488, B:224:0x0389, B:226:0x038a, B:227:0x038b, B:228:0x0398, B:231:0x03a2, B:234:0x03ab, B:236:0x03b1, B:238:0x03bc, B:240:0x03cc, B:242:0x03cd, B:243:0x03ce, B:244:0x03d6, B:248:0x055e, B:250:0x056b, B:252:0x0576, B:254:0x057c, B:255:0x0588, B:264:0x05c3, B:268:0x05e5, B:287:0x06ce, B:294:0x0656, B:296:0x065e, B:298:0x0675, B:302:0x067e, B:313:0x0689, B:306:0x0697, B:305:0x068e, B:293:0x074d, B:318:0x06ae, B:319:0x06b5, B:320:0x06bf, B:345:0x06e7, B:349:0x06f3, B:352:0x06fc, B:358:0x070f, B:360:0x071f, B:363:0x072f, B:365:0x0734, B:367:0x0738, B:368:0x073f, B:372:0x0716, B:382:0x0199, B:384:0x01a3, B:387:0x01ac, B:389:0x01b2, B:391:0x01bd, B:393:0x01c7, B:395:0x01c8, B:396:0x01c9, B:397:0x0111, B:399:0x011d, B:402:0x0129, B:405:0x012f, B:407:0x013c, B:416:0x015d, B:420:0x0161, B:421:0x0174, B:424:0x0184, B:429:0x017e, B:432:0x0183, B:443:0x076d, B:445:0x0779, B:446:0x0780, B:449:0x0788, B:452:0x078c, B:454:0x0796, B:456:0x07a0, B:459:0x07a7, B:460:0x07a8, B:463:0x07bc, B:466:0x07c9, B:473:0x07e8), top: B:2:0x0009, inners: #6, #10, #12, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f7 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_ENTER, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07cb, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x059b, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x054b, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:164:0x04ee, B:166:0x04f8, B:182:0x053e, B:199:0x042f, B:202:0x0430, B:203:0x0431, B:205:0x043e, B:208:0x0446, B:211:0x0454, B:213:0x045a, B:215:0x0465, B:217:0x0479, B:219:0x047a, B:220:0x047b, B:221:0x0488, B:224:0x0389, B:226:0x038a, B:227:0x038b, B:228:0x0398, B:231:0x03a2, B:234:0x03ab, B:236:0x03b1, B:238:0x03bc, B:240:0x03cc, B:242:0x03cd, B:243:0x03ce, B:244:0x03d6, B:248:0x055e, B:250:0x056b, B:252:0x0576, B:254:0x057c, B:255:0x0588, B:264:0x05c3, B:268:0x05e5, B:287:0x06ce, B:294:0x0656, B:296:0x065e, B:298:0x0675, B:302:0x067e, B:313:0x0689, B:306:0x0697, B:305:0x068e, B:293:0x074d, B:318:0x06ae, B:319:0x06b5, B:320:0x06bf, B:345:0x06e7, B:349:0x06f3, B:352:0x06fc, B:358:0x070f, B:360:0x071f, B:363:0x072f, B:365:0x0734, B:367:0x0738, B:368:0x073f, B:372:0x0716, B:382:0x0199, B:384:0x01a3, B:387:0x01ac, B:389:0x01b2, B:391:0x01bd, B:393:0x01c7, B:395:0x01c8, B:396:0x01c9, B:397:0x0111, B:399:0x011d, B:402:0x0129, B:405:0x012f, B:407:0x013c, B:416:0x015d, B:420:0x0161, B:421:0x0174, B:424:0x0184, B:429:0x017e, B:432:0x0183, B:443:0x076d, B:445:0x0779, B:446:0x0780, B:449:0x0788, B:452:0x078c, B:454:0x0796, B:456:0x07a0, B:459:0x07a7, B:460:0x07a8, B:463:0x07bc, B:466:0x07c9, B:473:0x07e8), top: B:2:0x0009, inners: #6, #10, #12, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029b A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, LOOP:1: B:78:0x029b->B:95:0x05a8, LOOP_START, PHI: r2 r4 r5 r6 r9 r12 r14 r15 r21 r31
      0x029b: PHI (r2v9 java.lang.String) = (r2v6 java.lang.String), (r2v52 java.lang.String) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r4v15 java.lang.String) = (r4v6 java.lang.String), (r4v38 java.lang.String) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r5v10 java.lang.String) = (r5v1 java.lang.String), (r5v23 java.lang.String) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r6v20 int) = (r6v7 int), (r6v47 int) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r9v23 java.util.HashMap) = (r9v1 java.util.HashMap), (r9v41 java.util.HashMap) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r12v22 java.lang.String) = (r12v8 java.lang.String), (r12v25 java.lang.String) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r14v10 java.lang.String) = (r14v7 java.lang.String), (r14v19 java.lang.String) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r15v7 java.lang.String) = (r15v4 java.lang.String), (r15v12 java.lang.String) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r21v3 int) = (r21v2 int), (r21v4 int) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r31v1 java.util.HashMap) = (r31v0 java.util.HashMap), (r31v4 java.util.HashMap) binds: [B:77:0x0299, B:95:0x05a8] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #16 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0009, B:5:0x0060, B:7:0x006d, B:10:0x0079, B:13:0x0089, B:15:0x0091, B:16:0x009e, B:18:0x00a6, B:21:0x00bc, B:22:0x00d7, B:24:0x00e1, B:25:0x00e5, B:27:0x00f1, B:28:0x00f5, B:32:0x018c, B:37:0x01e3, B:40:0x01f7, B:42:0x01fd, B:44:0x0205, B:46:0x020d, B:48:0x0215, B:50:0x021d, B:52:0x0225, B:54:0x022b, B:56:0x0233, B:58:0x023b, B:60:0x0241, B:62:0x0247, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:74:0x07cb, B:75:0x0293, B:78:0x029b, B:80:0x02a4, B:82:0x02b5, B:84:0x02bf, B:85:0x02cf, B:87:0x02d5, B:89:0x02ed, B:91:0x02f3, B:93:0x059b, B:99:0x02c6, B:101:0x0303, B:104:0x0311, B:108:0x054b, B:111:0x032e, B:113:0x0336, B:115:0x033e, B:117:0x0346, B:122:0x035a, B:126:0x036d, B:128:0x0373, B:130:0x0380, B:132:0x03e8, B:134:0x03ee, B:136:0x03f4, B:138:0x03fc, B:140:0x0402, B:144:0x0411, B:146:0x0417, B:148:0x0424, B:149:0x049b, B:151:0x04a3, B:164:0x04ee, B:166:0x04f8, B:182:0x053e, B:199:0x042f, B:202:0x0430, B:203:0x0431, B:205:0x043e, B:208:0x0446, B:211:0x0454, B:213:0x045a, B:215:0x0465, B:217:0x0479, B:219:0x047a, B:220:0x047b, B:221:0x0488, B:224:0x0389, B:226:0x038a, B:227:0x038b, B:228:0x0398, B:231:0x03a2, B:234:0x03ab, B:236:0x03b1, B:238:0x03bc, B:240:0x03cc, B:242:0x03cd, B:243:0x03ce, B:244:0x03d6, B:248:0x055e, B:250:0x056b, B:252:0x0576, B:254:0x057c, B:255:0x0588, B:264:0x05c3, B:268:0x05e5, B:287:0x06ce, B:294:0x0656, B:296:0x065e, B:298:0x0675, B:302:0x067e, B:313:0x0689, B:306:0x0697, B:305:0x068e, B:293:0x074d, B:318:0x06ae, B:319:0x06b5, B:320:0x06bf, B:345:0x06e7, B:349:0x06f3, B:352:0x06fc, B:358:0x070f, B:360:0x071f, B:363:0x072f, B:365:0x0734, B:367:0x0738, B:368:0x073f, B:372:0x0716, B:382:0x0199, B:384:0x01a3, B:387:0x01ac, B:389:0x01b2, B:391:0x01bd, B:393:0x01c7, B:395:0x01c8, B:396:0x01c9, B:397:0x0111, B:399:0x011d, B:402:0x0129, B:405:0x012f, B:407:0x013c, B:416:0x015d, B:420:0x0161, B:421:0x0174, B:424:0x0184, B:429:0x017e, B:432:0x0183, B:443:0x076d, B:445:0x0779, B:446:0x0780, B:449:0x0788, B:452:0x078c, B:454:0x0796, B:456:0x07a0, B:459:0x07a7, B:460:0x07a8, B:463:0x07bc, B:466:0x07c9, B:473:0x07e8), top: B:2:0x0009, inners: #6, #10, #12, #13, #15 }] */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.google.android.gms.internal.ads.N3, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(byte[] bArr, int i, int i4) {
        String str;
        String str2;
        String str3;
        HashMap hashMap;
        HashMap hashMap2;
        ArrayDeque arrayDeque;
        K3 k32;
        int i9;
        ArrayDeque arrayDeque2;
        J3 j32;
        K3 k33;
        C0357t c0357t;
        int i10;
        boolean equals;
        HashMap hashMap3;
        boolean equals2;
        int i11;
        K3 k34;
        J3 j33;
        J3 j34;
        long j9;
        Object obj;
        char c4;
        String str4;
        String[] strArr;
        String str5;
        String str6;
        String str7;
        String str8;
        String t9;
        String str9;
        String str10;
        String str11;
        String str12;
        int i12;
        HashMap hashMap4;
        float f6;
        float f9;
        M3 m32;
        String t10;
        float f10;
        float f11;
        String t11;
        float f12;
        int i13;
        String t12;
        int i14;
        char c9;
        char c10;
        String t13;
        N3 n32;
        float f13;
        N3 n33;
        String str13;
        String[] split;
        float f14;
        String group;
        int i15;
        boolean z8;
        String t14;
        String group2;
        C0357t c0357t2;
        int i16 = 1;
        String str14 = "";
        String str15 = "http://www.w3.org/ns/ttml#parameter";
        String str16 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser newPullParser = this.f26100n.newPullParser();
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            HashMap hashMap7 = new HashMap();
            hashMap6.put("", new M3("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i4), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            K3 k35 = f26093B;
            r rVar = null;
            K3 k36 = null;
            K3 k37 = k35;
            int i17 = 0;
            int i18 = 15;
            while (eventType != i16) {
                J3 j35 = (J3) arrayDeque3.peek();
                ?? r51 = obj2;
                if (i17 == 0) {
                    int i19 = 0;
                    String name = newPullParser.getName();
                    int i20 = i16;
                    if (eventType == 2) {
                        boolean equals3 = "tt".equals(name);
                        Pattern pattern = f26099z;
                        str = str14;
                        if (equals3) {
                            String attributeValue = newPullParser.getAttributeValue(str15, "frameRate");
                            int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = newPullParser.getAttributeValue(str15, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                arrayDeque2 = arrayDeque3;
                                String str17 = AbstractC3548lu.f32613a;
                                j32 = j35;
                                PA.u("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2 ? i20 : 0);
                                f14 = Integer.parseInt(r6[0]) / Integer.parseInt(r6[i20]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                j32 = j35;
                                f14 = 1.0f;
                            }
                            int i21 = k35.f25871b;
                            String attributeValue3 = newPullParser.getAttributeValue(str15, "subFrameRate");
                            if (attributeValue3 != null) {
                                i21 = Integer.parseInt(attributeValue3);
                            }
                            int i22 = k35.f25872c;
                            float f15 = f14;
                            String attributeValue4 = newPullParser.getAttributeValue(str15, "tickRate");
                            if (attributeValue4 != null) {
                                i22 = Integer.parseInt(attributeValue4);
                            }
                            K3 k38 = new K3(i21, i22, parseInt * f15);
                            String attributeValue5 = newPullParser.getAttributeValue(str15, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = f26092A.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    str2 = str15;
                                    try {
                                        group = matcher.group(i20);
                                        try {
                                        } catch (NumberFormatException unused) {
                                            AbstractC3217fl.I("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i18 = 15;
                                            t14 = AbstractC3194fG.t(newPullParser, "extent");
                                            if (t14 != null) {
                                            }
                                            c0357t2 = r51;
                                            k33 = k36;
                                            c0357t = c0357t2;
                                            i10 = i18;
                                            equals = name.equals("tt");
                                            String str18 = d.c.f18793e;
                                            String str19 = "metadata";
                                            String str20 = "region";
                                            k37 = k33;
                                            String str21 = "head";
                                            hashMap3 = hashMap7;
                                            if (!equals) {
                                                String name2 = newPullParser.getName();
                                                StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                                                sb.append(str16);
                                                sb.append(name2);
                                                AbstractC3217fl.y("TtmlParser", sb.toString());
                                                str3 = str16;
                                                i18 = i10;
                                                hashMap = hashMap6;
                                                k36 = c0357t;
                                                arrayDeque = arrayDeque2;
                                                hashMap2 = hashMap3;
                                                i17 = 1;
                                                i9 = 1;
                                                newPullParser.next();
                                                eventType = newPullParser.getEventType();
                                                hashMap6 = hashMap;
                                                arrayDeque3 = arrayDeque;
                                                hashMap7 = hashMap2;
                                                i16 = i9;
                                                str14 = str;
                                                str15 = str2;
                                                k35 = k32;
                                                str16 = str3;
                                                obj2 = null;
                                            }
                                            equals2 = "head".equals(name);
                                            String str22 = "\\s+";
                                            if (equals2) {
                                            }
                                            k37 = k34;
                                            i18 = i11;
                                            k36 = c0357t;
                                            i9 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap6 = hashMap;
                                            arrayDeque3 = arrayDeque;
                                            hashMap7 = hashMap2;
                                            i16 = i9;
                                            str14 = str;
                                            str15 = str2;
                                            k35 = k32;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                    } catch (NumberFormatException unused2) {
                                        k36 = k38;
                                    }
                                    if (group == null) {
                                        throw r51;
                                    }
                                    int parseInt2 = Integer.parseInt(group);
                                    String group3 = matcher.group(2);
                                    if (group3 == null) {
                                        throw r51;
                                    }
                                    int parseInt3 = Integer.parseInt(group3);
                                    if (parseInt2 == 0) {
                                        i15 = parseInt3;
                                        z8 = false;
                                    } else if (parseInt3 != 0) {
                                        i15 = parseInt3;
                                        z8 = true;
                                    } else {
                                        i15 = 0;
                                        z8 = false;
                                    }
                                    if (z8) {
                                        k36 = k38;
                                        k32 = k35;
                                        i18 = i15;
                                        t14 = AbstractC3194fG.t(newPullParser, "extent");
                                        if (t14 != null) {
                                            Matcher matcher2 = pattern.matcher(t14);
                                            if (matcher2.matches()) {
                                                try {
                                                    group2 = matcher2.group(1);
                                                } catch (NumberFormatException unused3) {
                                                    AbstractC3217fl.I("TtmlParser", "Ignoring malformed tts extent: ".concat(t14));
                                                }
                                                if (group2 == null) {
                                                    throw r51;
                                                }
                                                int parseInt4 = Integer.parseInt(group2);
                                                String group4 = matcher2.group(2);
                                                if (group4 == null) {
                                                    throw r51;
                                                }
                                                c0357t2 = new C0357t(parseInt4, Integer.parseInt(group4));
                                                k33 = k36;
                                                c0357t = c0357t2;
                                            } else {
                                                AbstractC3217fl.I("TtmlParser", "Ignoring non-pixel tts extent: ".concat(t14));
                                            }
                                        }
                                        c0357t2 = r51;
                                        k33 = k36;
                                        c0357t = c0357t2;
                                    } else {
                                        k36 = k38;
                                        try {
                                            throw new IllegalArgumentException(AbstractC3194fG.u("Invalid cell resolution %s %s", Integer.valueOf(parseInt2), Integer.valueOf(i15)));
                                        } catch (NumberFormatException unused4) {
                                            k32 = k35;
                                            AbstractC3217fl.I("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i18 = 15;
                                            t14 = AbstractC3194fG.t(newPullParser, "extent");
                                            if (t14 != null) {
                                            }
                                            c0357t2 = r51;
                                            k33 = k36;
                                            c0357t = c0357t2;
                                            i10 = i18;
                                            equals = name.equals("tt");
                                            String str182 = d.c.f18793e;
                                            String str192 = "metadata";
                                            String str202 = "region";
                                            k37 = k33;
                                            String str212 = "head";
                                            hashMap3 = hashMap7;
                                            if (!equals) {
                                            }
                                            equals2 = "head".equals(name);
                                            String str222 = "\\s+";
                                            if (equals2) {
                                            }
                                            k37 = k34;
                                            i18 = i11;
                                            k36 = c0357t;
                                            i9 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap6 = hashMap;
                                            arrayDeque3 = arrayDeque;
                                            hashMap7 = hashMap2;
                                            i16 = i9;
                                            str14 = str;
                                            str15 = str2;
                                            k35 = k32;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                    }
                                } else {
                                    AbstractC3217fl.I("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            str2 = str15;
                            k36 = k38;
                            k32 = k35;
                            i18 = 15;
                            t14 = AbstractC3194fG.t(newPullParser, "extent");
                            if (t14 != null) {
                            }
                            c0357t2 = r51;
                            k33 = k36;
                            c0357t = c0357t2;
                        } else {
                            str2 = str15;
                            arrayDeque2 = arrayDeque3;
                            k32 = k35;
                            j32 = j35;
                            k33 = k37;
                            c0357t = k36;
                        }
                        i10 = i18;
                        equals = name.equals("tt");
                        String str1822 = d.c.f18793e;
                        String str1922 = "metadata";
                        String str2022 = "region";
                        k37 = k33;
                        String str2122 = "head";
                        hashMap3 = hashMap7;
                        if (!equals && !name.equals("head") && !name.equals("body") && !name.equals("div") && !name.equals("p") && !name.equals("span") && !name.equals("br") && !name.equals(com.anythink.expressad.foundation.h.k.f19792e) && !name.equals("styling") && !name.equals("layout") && !name.equals("region") && !name.equals("metadata") && !name.equals(d.c.f18793e) && !name.equals("data") && !name.equals("information")) {
                            String name22 = newPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name22).length() + 26);
                            sb2.append(str16);
                            sb2.append(name22);
                            AbstractC3217fl.y("TtmlParser", sb2.toString());
                            str3 = str16;
                            i18 = i10;
                            hashMap = hashMap6;
                            k36 = c0357t;
                            arrayDeque = arrayDeque2;
                            hashMap2 = hashMap3;
                            i17 = 1;
                        }
                        equals2 = "head".equals(name);
                        String str2222 = "\\s+";
                        if (equals2) {
                            while (true) {
                                newPullParser.next();
                                if (AbstractC3194fG.r(newPullParser, com.anythink.expressad.foundation.h.k.f19792e)) {
                                    String t15 = AbstractC3194fG.t(newPullParser, com.anythink.expressad.foundation.h.k.f19792e);
                                    str3 = str16;
                                    N3 b9 = b(newPullParser, new N3());
                                    if (t15 != null) {
                                        String trim = t15.trim();
                                        if (trim.isEmpty()) {
                                            str13 = str2122;
                                            split = new String[i19];
                                        } else {
                                            str13 = str2122;
                                            String str23 = AbstractC3548lu.f32613a;
                                            split = trim.split(str2222, -1);
                                        }
                                        str5 = str2222;
                                        int i23 = 0;
                                        for (int length = split.length; i23 < length; length = length) {
                                            b9.c((N3) hashMap5.get(split[i23]));
                                            i23++;
                                        }
                                    } else {
                                        str13 = str2122;
                                        str5 = str2222;
                                    }
                                    String d2 = b9.d();
                                    if (d2 != null) {
                                        hashMap5.put(d2, b9);
                                    }
                                    int i24 = i10;
                                    str8 = str1822;
                                    i11 = i24;
                                    hashMap = hashMap6;
                                    str6 = str1922;
                                    str7 = str2022;
                                    str2122 = str13;
                                    hashMap2 = hashMap3;
                                } else {
                                    String str24 = str2122;
                                    str3 = str16;
                                    str5 = str2222;
                                    if (AbstractC3194fG.r(newPullParser, str2022)) {
                                        str7 = str2022;
                                        String str25 = str1822;
                                        String t16 = AbstractC3194fG.t(newPullParser, "id");
                                        if (t16 == null) {
                                            m32 = r51;
                                            i11 = i10;
                                            hashMap4 = hashMap6;
                                            str11 = str1922;
                                        } else {
                                            String t17 = AbstractC3194fG.t(newPullParser, "origin");
                                            if (t17 == null) {
                                                str9 = t17;
                                                String t18 = AbstractC3194fG.t(newPullParser, com.anythink.expressad.foundation.h.k.f19792e);
                                                if (t18 != null && (n33 = (N3) hashMap5.get(t18)) != null) {
                                                    str10 = n33.a();
                                                    str11 = str1922;
                                                    Pattern pattern2 = f26098y;
                                                    if (str10 == null) {
                                                        hashMap4 = hashMap6;
                                                        Matcher matcher3 = pattern2.matcher(str10);
                                                        i12 = i10;
                                                        Matcher matcher4 = pattern.matcher(str10);
                                                        if (matcher3.matches()) {
                                                            str12 = "Ignoring region with unsupported extent: ";
                                                            try {
                                                                String group5 = matcher3.group(1);
                                                                if (group5 == null) {
                                                                    throw r51;
                                                                }
                                                                f13 = Float.parseFloat(group5) / 100.0f;
                                                                String group6 = matcher3.group(2);
                                                                if (group6 == null) {
                                                                    throw r51;
                                                                }
                                                                f6 = Float.parseFloat(group6) / 100.0f;
                                                                f9 = f13;
                                                            } catch (NumberFormatException unused5) {
                                                                AbstractC3217fl.I("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                            }
                                                        } else {
                                                            str12 = "Ignoring region with unsupported extent: ";
                                                            if (!matcher4.matches()) {
                                                                AbstractC3217fl.I("TtmlParser", "Ignoring region with unsupported origin: ".concat(str10));
                                                            } else if (c0357t == 0) {
                                                                AbstractC3217fl.I("TtmlParser", "Ignoring region with missing tts:extent: ".concat(str10));
                                                            } else {
                                                                try {
                                                                    String group7 = matcher4.group(1);
                                                                    if (group7 == null) {
                                                                        throw r51;
                                                                    }
                                                                    int parseInt5 = Integer.parseInt(group7);
                                                                    String group8 = matcher4.group(2);
                                                                    if (group8 == null) {
                                                                        throw r51;
                                                                    }
                                                                    f13 = parseInt5 / c0357t.f2319a;
                                                                    f6 = Integer.parseInt(group8) / c0357t.f2320b;
                                                                    f9 = f13;
                                                                } catch (NumberFormatException unused6) {
                                                                    AbstractC3217fl.I("TtmlParser", "Ignoring region with malformed origin: ".concat(str10));
                                                                }
                                                            }
                                                            m32 = r51;
                                                            i11 = i12;
                                                        }
                                                    } else {
                                                        str12 = "Ignoring region with unsupported extent: ";
                                                        i12 = i10;
                                                        hashMap4 = hashMap6;
                                                        f6 = 0.0f;
                                                        f9 = 0.0f;
                                                    }
                                                    t10 = AbstractC3194fG.t(newPullParser, "extent");
                                                    if (t10 == null && (t13 = AbstractC3194fG.t(newPullParser, com.anythink.expressad.foundation.h.k.f19792e)) != null && (n32 = (N3) hashMap5.get(t13)) != null) {
                                                        t10 = n32.b();
                                                    }
                                                    if (t10 == null) {
                                                        Matcher matcher5 = pattern2.matcher(t10);
                                                        Matcher matcher6 = pattern.matcher(t10);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                String group9 = matcher5.group(1);
                                                                if (group9 == null) {
                                                                    throw r51;
                                                                }
                                                                float parseFloat = Float.parseFloat(group9) / 100.0f;
                                                                String group10 = matcher5.group(2);
                                                                if (group10 == null) {
                                                                    throw r51;
                                                                }
                                                                f10 = parseFloat;
                                                                f11 = Float.parseFloat(group10) / 100.0f;
                                                            } catch (NumberFormatException unused7) {
                                                                AbstractC3217fl.I("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                            }
                                                        } else {
                                                            if (!matcher6.matches()) {
                                                                AbstractC3217fl.I("TtmlParser", str12.concat(String.valueOf(str10)));
                                                            } else if (c0357t == 0) {
                                                                AbstractC3217fl.I("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(str10)));
                                                            } else {
                                                                try {
                                                                    String group11 = matcher6.group(1);
                                                                    if (group11 == null) {
                                                                        throw r51;
                                                                    }
                                                                    int parseInt6 = Integer.parseInt(group11);
                                                                    String group12 = matcher6.group(2);
                                                                    if (group12 == null) {
                                                                        throw r51;
                                                                    }
                                                                    f11 = Integer.parseInt(group12) / c0357t.f2320b;
                                                                    f10 = parseInt6 / c0357t.f2319a;
                                                                } catch (NumberFormatException unused8) {
                                                                    AbstractC3217fl.I("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(str10)));
                                                                }
                                                            }
                                                            m32 = r51;
                                                            i11 = i12;
                                                        }
                                                    } else {
                                                        f10 = 1.0f;
                                                        f11 = 1.0f;
                                                    }
                                                    t11 = AbstractC3194fG.t(newPullParser, "displayAlign");
                                                    if (t11 != null) {
                                                        String f16 = AbstractC3035cL.f(t11);
                                                        int hashCode = f16.hashCode();
                                                        if (hashCode != -1364013995) {
                                                            if (hashCode == 92734940 && f16.equals("after")) {
                                                                c10 = 1;
                                                                if (c10 != 0) {
                                                                    f12 = f6 + (f11 / 2.0f);
                                                                    i11 = i12;
                                                                    i13 = 1;
                                                                } else if (c10 == 1) {
                                                                    f12 = f6 + f11;
                                                                    i11 = i12;
                                                                    i13 = 2;
                                                                }
                                                                float f17 = 1.0f / i11;
                                                                t12 = AbstractC3194fG.t(newPullParser, "writingMode");
                                                                if (t12 != null) {
                                                                    String f18 = AbstractC3035cL.f(t12);
                                                                    int hashCode2 = f18.hashCode();
                                                                    if (hashCode2 == 3694) {
                                                                        if (f18.equals("tb")) {
                                                                            c9 = 0;
                                                                            if (c9 != 0) {
                                                                            }
                                                                            i14 = 2;
                                                                            m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                        }
                                                                        c9 = 65535;
                                                                        if (c9 != 0) {
                                                                        }
                                                                        i14 = 2;
                                                                        m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                    } else if (hashCode2 != 3553396) {
                                                                        if (hashCode2 == 3553576 && f18.equals("tbrl")) {
                                                                            c9 = 2;
                                                                            if (c9 != 0 || c9 == 1) {
                                                                                i14 = 2;
                                                                            } else if (c9 == 2) {
                                                                                i14 = 1;
                                                                            }
                                                                            m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                        }
                                                                        c9 = 65535;
                                                                        if (c9 != 0) {
                                                                        }
                                                                        i14 = 2;
                                                                        m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                    } else {
                                                                        if (f18.equals("tblr")) {
                                                                            c9 = 1;
                                                                            if (c9 != 0) {
                                                                            }
                                                                            i14 = 2;
                                                                            m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                        }
                                                                        c9 = 65535;
                                                                        if (c9 != 0) {
                                                                        }
                                                                        i14 = 2;
                                                                        m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                                    }
                                                                }
                                                                i14 = Integer.MIN_VALUE;
                                                                m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f17, i14);
                                                            }
                                                            c10 = 65535;
                                                            if (c10 != 0) {
                                                            }
                                                            float f172 = 1.0f / i11;
                                                            t12 = AbstractC3194fG.t(newPullParser, "writingMode");
                                                            if (t12 != null) {
                                                            }
                                                            i14 = Integer.MIN_VALUE;
                                                            m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f172, i14);
                                                        } else {
                                                            if (f16.equals("center")) {
                                                                c10 = 0;
                                                                if (c10 != 0) {
                                                                }
                                                                float f1722 = 1.0f / i11;
                                                                t12 = AbstractC3194fG.t(newPullParser, "writingMode");
                                                                if (t12 != null) {
                                                                }
                                                                i14 = Integer.MIN_VALUE;
                                                                m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f1722, i14);
                                                            }
                                                            c10 = 65535;
                                                            if (c10 != 0) {
                                                            }
                                                            float f17222 = 1.0f / i11;
                                                            t12 = AbstractC3194fG.t(newPullParser, "writingMode");
                                                            if (t12 != null) {
                                                            }
                                                            i14 = Integer.MIN_VALUE;
                                                            m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f17222, i14);
                                                        }
                                                    }
                                                    f12 = f6;
                                                    i11 = i12;
                                                    i13 = 0;
                                                    float f172222 = 1.0f / i11;
                                                    t12 = AbstractC3194fG.t(newPullParser, "writingMode");
                                                    if (t12 != null) {
                                                    }
                                                    i14 = Integer.MIN_VALUE;
                                                    m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f172222, i14);
                                                }
                                            } else {
                                                str9 = t17;
                                            }
                                            str10 = str9;
                                            str11 = str1922;
                                            Pattern pattern22 = f26098y;
                                            if (str10 == null) {
                                            }
                                            t10 = AbstractC3194fG.t(newPullParser, "extent");
                                            if (t10 == null) {
                                                t10 = n32.b();
                                            }
                                            if (t10 == null) {
                                            }
                                            t11 = AbstractC3194fG.t(newPullParser, "displayAlign");
                                            if (t11 != null) {
                                            }
                                            f12 = f6;
                                            i11 = i12;
                                            i13 = 0;
                                            float f1722222 = 1.0f / i11;
                                            t12 = AbstractC3194fG.t(newPullParser, "writingMode");
                                            if (t12 != null) {
                                            }
                                            i14 = Integer.MIN_VALUE;
                                            m32 = new M3(t16, f9, f12, 0, i13, f10, f11, 1, f1722222, i14);
                                        }
                                        if (m32 != null) {
                                            hashMap = hashMap4;
                                            hashMap.put(m32.f26294a, m32);
                                        } else {
                                            hashMap = hashMap4;
                                        }
                                        str2122 = str24;
                                        hashMap2 = hashMap3;
                                        str8 = str25;
                                        str6 = str11;
                                    } else {
                                        String str26 = str1822;
                                        i11 = i10;
                                        hashMap = hashMap6;
                                        str6 = str1922;
                                        str7 = str2022;
                                        if (AbstractC3194fG.r(newPullParser, str6)) {
                                            while (true) {
                                                newPullParser.next();
                                                str8 = str26;
                                                if (!AbstractC3194fG.r(newPullParser, str8) || (t9 = AbstractC3194fG.t(newPullParser, "id")) == null) {
                                                    hashMap2 = hashMap3;
                                                } else {
                                                    hashMap2 = hashMap3;
                                                    hashMap2.put(t9, newPullParser.nextText());
                                                }
                                                if (!AbstractC3194fG.j(newPullParser, str6)) {
                                                    str26 = str8;
                                                    hashMap3 = hashMap2;
                                                }
                                            }
                                        } else {
                                            hashMap2 = hashMap3;
                                            str8 = str26;
                                        }
                                        str2122 = str24;
                                    }
                                }
                                if (AbstractC3194fG.j(newPullParser, str2122)) {
                                    k34 = k37;
                                    arrayDeque = arrayDeque2;
                                } else {
                                    String str27 = str8;
                                    i10 = i11;
                                    str1822 = str27;
                                    str1922 = str6;
                                    hashMap6 = hashMap;
                                    hashMap3 = hashMap2;
                                    str2222 = str5;
                                    str16 = str3;
                                    str2022 = str7;
                                    i19 = 0;
                                }
                            }
                        } else {
                            str3 = str16;
                            i11 = i10;
                            hashMap = hashMap6;
                            String str28 = "\\s+";
                            Object obj3 = "region";
                            hashMap2 = hashMap3;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                N3 b10 = b(newPullParser, r51);
                                String str29 = str;
                                int i25 = 0;
                                long j10 = com.anythink.basead.exoplayer.b.f6539b;
                                long j11 = com.anythink.basead.exoplayer.b.f6539b;
                                String[] strArr2 = null;
                                String str30 = null;
                                long j12 = com.anythink.basead.exoplayer.b.f6539b;
                                while (i25 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i25);
                                        String attributeValue6 = newPullParser.getAttributeValue(i25);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                obj = obj3;
                                                if (attributeName.equals(obj)) {
                                                    c4 = 4;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    obj = obj3;
                                                    c4 = 2;
                                                    break;
                                                }
                                                obj = obj3;
                                                c4 = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    obj = obj3;
                                                    c4 = 1;
                                                    break;
                                                }
                                                obj = obj3;
                                                c4 = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    obj = obj3;
                                                    c4 = 0;
                                                    break;
                                                }
                                                obj = obj3;
                                                c4 = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals(com.anythink.expressad.foundation.h.k.f19792e)) {
                                                    obj = obj3;
                                                    c4 = 3;
                                                    break;
                                                }
                                                obj = obj3;
                                                c4 = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage")) {
                                                    c4 = 5;
                                                    obj = obj3;
                                                    break;
                                                }
                                                obj = obj3;
                                                c4 = 65535;
                                                break;
                                            default:
                                                obj = obj3;
                                                c4 = 65535;
                                                break;
                                        }
                                        if (c4 == 0) {
                                            k34 = k37;
                                            str4 = str28;
                                            j11 = f(attributeValue6, k34);
                                        } else if (c4 == 1) {
                                            k34 = k37;
                                            str4 = str28;
                                            j10 = f(attributeValue6, k34);
                                        } else if (c4 != 2) {
                                            if (c4 == 3) {
                                                try {
                                                    String trim2 = attributeValue6.trim();
                                                    if (trim2.isEmpty()) {
                                                        try {
                                                            strArr = new String[0];
                                                            str4 = str28;
                                                        } catch (C3666o3 e6) {
                                                            e = e6;
                                                            k34 = k37;
                                                            arrayDeque = arrayDeque2;
                                                            AbstractC3217fl.O("TtmlParser", "Suppressing parser error", e);
                                                            k37 = k34;
                                                            i18 = i11;
                                                            k36 = c0357t;
                                                            i17 = 1;
                                                            i9 = 1;
                                                            newPullParser.next();
                                                            eventType = newPullParser.getEventType();
                                                            hashMap6 = hashMap;
                                                            arrayDeque3 = arrayDeque;
                                                            hashMap7 = hashMap2;
                                                            i16 = i9;
                                                            str14 = str;
                                                            str15 = str2;
                                                            k35 = k32;
                                                            str16 = str3;
                                                            obj2 = null;
                                                        }
                                                    } else {
                                                        String str31 = AbstractC3548lu.f32613a;
                                                        str4 = str28;
                                                        strArr = trim2.split(str4, -1);
                                                    }
                                                    if (strArr.length > 0) {
                                                        strArr2 = strArr;
                                                    }
                                                } catch (C3666o3 e9) {
                                                    e = e9;
                                                }
                                            } else if (c4 != 4) {
                                                if (c4 == 5 && attributeValue6.startsWith("#")) {
                                                    str30 = attributeValue6.substring(1);
                                                    k34 = k37;
                                                    str4 = str28;
                                                }
                                                str4 = str28;
                                            } else {
                                                if (hashMap.containsKey(attributeValue6)) {
                                                    str29 = attributeValue6;
                                                    k34 = k37;
                                                    str4 = str28;
                                                }
                                                str4 = str28;
                                            }
                                            k34 = k37;
                                        } else {
                                            k34 = k37;
                                            str4 = str28;
                                            j12 = f(attributeValue6, k34);
                                        }
                                        try {
                                            i25++;
                                            k37 = k34;
                                            obj3 = obj;
                                            str28 = str4;
                                        } catch (C3666o3 e10) {
                                            e = e10;
                                            arrayDeque = arrayDeque2;
                                            AbstractC3217fl.O("TtmlParser", "Suppressing parser error", e);
                                            k37 = k34;
                                            i18 = i11;
                                            k36 = c0357t;
                                            i17 = 1;
                                            i9 = 1;
                                            newPullParser.next();
                                            eventType = newPullParser.getEventType();
                                            hashMap6 = hashMap;
                                            arrayDeque3 = arrayDeque;
                                            hashMap7 = hashMap2;
                                            i16 = i9;
                                            str14 = str;
                                            str15 = str2;
                                            k35 = k32;
                                            str16 = str3;
                                            obj2 = null;
                                        }
                                    } catch (C3666o3 e11) {
                                        e = e11;
                                        k34 = k37;
                                    }
                                }
                                k34 = k37;
                                long j13 = com.anythink.basead.exoplayer.b.f6539b;
                                if (j32 != null) {
                                    j33 = j32;
                                    long j14 = j33.f25719d;
                                    if (j14 != com.anythink.basead.exoplayer.b.f6539b) {
                                        j11 = j11 != com.anythink.basead.exoplayer.b.f6539b ? j11 + j14 : -9223372036854775807L;
                                        if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
                                            j10 += j14;
                                        } else {
                                            j34 = j33;
                                            j10 = -9223372036854775807L;
                                        }
                                    }
                                    j34 = j33;
                                } else {
                                    j33 = j32;
                                    j34 = null;
                                }
                                if (j10 == com.anythink.basead.exoplayer.b.f6539b) {
                                    if (j12 != com.anythink.basead.exoplayer.b.f6539b) {
                                        j9 = j11 + j12;
                                    } else if (j34 != null) {
                                        j9 = j34.f25720e;
                                        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
                                        }
                                    }
                                    j13 = j9;
                                } else {
                                    j13 = j10;
                                }
                                J3 b11 = J3.b(newPullParser.getName(), j11, j13, b10, strArr2, str29, str30, j34);
                                arrayDeque = arrayDeque2;
                                try {
                                    arrayDeque.push(b11);
                                    if (j33 != null) {
                                        if (j33.f25727m == null) {
                                            j33.f25727m = new ArrayList();
                                        }
                                        j33.f25727m.add(b11);
                                    }
                                } catch (C3666o3 e12) {
                                    e = e12;
                                    AbstractC3217fl.O("TtmlParser", "Suppressing parser error", e);
                                    k37 = k34;
                                    i18 = i11;
                                    k36 = c0357t;
                                    i17 = 1;
                                    i9 = 1;
                                    newPullParser.next();
                                    eventType = newPullParser.getEventType();
                                    hashMap6 = hashMap;
                                    arrayDeque3 = arrayDeque;
                                    hashMap7 = hashMap2;
                                    i16 = i9;
                                    str14 = str;
                                    str15 = str2;
                                    k35 = k32;
                                    str16 = str3;
                                    obj2 = null;
                                }
                            } catch (C3666o3 e13) {
                                e = e13;
                                k34 = k37;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        k37 = k34;
                        i18 = i11;
                        k36 = c0357t;
                    } else {
                        str = str14;
                        str2 = str15;
                        str3 = str16;
                        hashMap = hashMap6;
                        hashMap2 = hashMap7;
                        arrayDeque = arrayDeque3;
                        k32 = k35;
                        if (eventType == 4) {
                            if (j35 == null) {
                                throw null;
                            }
                            J3 a9 = J3.a(newPullParser.getText());
                            if (j35.f25727m == null) {
                                j35.f25727m = new ArrayList();
                            }
                            j35.f25727m.add(a9);
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                J3 j36 = (J3) arrayDeque.peek();
                                if (j36 == null) {
                                    throw null;
                                }
                                rVar = new r(j36, hashMap5, hashMap, hashMap2);
                            }
                            arrayDeque.pop();
                        }
                    }
                    i9 = 1;
                } else {
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    hashMap = hashMap6;
                    hashMap2 = hashMap7;
                    arrayDeque = arrayDeque3;
                    k32 = k35;
                    if (eventType == 2) {
                        i9 = 1;
                        i17++;
                    } else {
                        i9 = 1;
                        if (eventType == 3) {
                            i17--;
                        }
                        newPullParser.next();
                        eventType = newPullParser.getEventType();
                        hashMap6 = hashMap;
                        arrayDeque3 = arrayDeque;
                        hashMap7 = hashMap2;
                        i16 = i9;
                        str14 = str;
                        str15 = str2;
                        k35 = k32;
                        str16 = str3;
                        obj2 = null;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                hashMap6 = hashMap;
                arrayDeque3 = arrayDeque;
                hashMap7 = hashMap2;
                i16 = i9;
                str14 = str;
                str15 = str2;
                k35 = k32;
                str16 = str3;
                obj2 = null;
            }
            if (rVar != null) {
                return rVar;
            }
            throw null;
        } catch (IOException e14) {
            throw new IllegalStateException("Unexpected error when reading input.", e14);
        } catch (XmlPullParserException e15) {
            throw new IllegalStateException("Unable to decode source", e15);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3774q3
    public final void e(byte[] bArr, int i, int i4, X1.b bVar) {
        AbstractC2720Pd.h(a(bArr, i, i4), bVar);
    }
}
