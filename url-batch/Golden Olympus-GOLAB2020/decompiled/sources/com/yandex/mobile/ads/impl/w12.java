package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class w12 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33875b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f33876c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f33877d;

    /* renamed from: e, reason: collision with root package name */
    public final float f33878e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33879f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33880g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33881h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f33882i;

    /* renamed from: j, reason: collision with root package name */
    public final int f33883j;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f33884a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33885b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33886c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33887d;

        /* renamed from: e, reason: collision with root package name */
        public final int f33888e;

        /* renamed from: f, reason: collision with root package name */
        public final int f33889f;

        /* renamed from: g, reason: collision with root package name */
        public final int f33890g;

        /* renamed from: h, reason: collision with root package name */
        public final int f33891h;

        /* renamed from: i, reason: collision with root package name */
        public final int f33892i;

        /* renamed from: j, reason: collision with root package name */
        public final int f33893j;

        /* renamed from: k, reason: collision with root package name */
        public final int f33894k;

        private a(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f33884a = i4;
            this.f33885b = i5;
            this.f33886c = i6;
            this.f33887d = i7;
            this.f33888e = i8;
            this.f33889f = i9;
            this.f33890g = i10;
            this.f33891h = i11;
            this.f33892i = i12;
            this.f33893j = i13;
            this.f33894k = i14;
        }

        public static a a(String str) {
            char c4;
            String[] split = TextUtils.split(str.substring(7), StringUtils.COMMA);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < split.length; i14++) {
                String b4 = C2207rf.b(split[i14].trim());
                b4.getClass();
                switch (b4.hashCode()) {
                    case -1178781136:
                        if (b4.equals("italic")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1026963764:
                        if (b4.equals("underline")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -192095652:
                        if (b4.equals("strikeout")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -70925746:
                        if (b4.equals("primarycolour")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 3029637:
                        if (b4.equals("bold")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 3373707:
                        if (b4.equals("name")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 366554320:
                        if (b4.equals("fontsize")) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 767321349:
                        if (b4.equals("borderstyle")) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1767875043:
                        if (b4.equals("alignment")) {
                            c4 = '\b';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1988365454:
                        if (b4.equals("outlinecolour")) {
                            c4 = '\t';
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
                        i10 = i14;
                        break;
                    case 1:
                        i11 = i14;
                        break;
                    case 2:
                        i12 = i14;
                        break;
                    case 3:
                        i6 = i14;
                        break;
                    case 4:
                        i9 = i14;
                        break;
                    case 5:
                        i4 = i14;
                        break;
                    case 6:
                        i8 = i14;
                        break;
                    case 7:
                        i13 = i14;
                        break;
                    case '\b':
                        i5 = i14;
                        break;
                    case '\t':
                        i7 = i14;
                        break;
                }
            }
            if (i4 != -1) {
                return new a(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, split.length);
            }
            return null;
        }
    }

    static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f33895c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f33896d;

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f33897e;

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f33898f;

        /* renamed from: a, reason: collision with root package name */
        public final int f33899a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f33900b;

        static {
            int i4 = u82.f32873a;
            Locale locale = Locale.US;
            f33896d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f33897e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f33898f = Pattern.compile("\\\\an(\\d+)");
        }

        private b(int i4, PointF pointF) {
            this.f33899a = i4;
            this.f33900b = pointF;
        }

        public static b a(String str) {
            int i4;
            Matcher matcher = f33895c.matcher(str);
            PointF pointF = null;
            int i5 = -1;
            while (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                try {
                    PointF b4 = b(group);
                    if (b4 != null) {
                        pointF = b4;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    Matcher matcher2 = f33898f.matcher(group);
                    if (matcher2.find()) {
                        String group2 = matcher2.group(1);
                        group2.getClass();
                        try {
                            i4 = Integer.parseInt(group2.trim());
                        } catch (NumberFormatException unused2) {
                        }
                        switch (i4) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                break;
                            default:
                                ms0.d("SsaStyle", "Ignoring unknown alignment: " + group2);
                                break;
                        }
                    }
                    i4 = -1;
                    if (i4 != -1) {
                        i5 = i4;
                    } else {
                        continue;
                    }
                } catch (RuntimeException unused3) {
                }
            }
            return new b(i5, pointF);
        }

        private static PointF b(String str) {
            String group;
            String group2;
            Matcher matcher = f33896d.matcher(str);
            Matcher matcher2 = f33897e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    ms0.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }

        public static String c(String str) {
            return f33895c.matcher(str).replaceAll("");
        }
    }

    private w12(String str, int i4, Integer num, Integer num2, float f4, boolean z4, boolean z5, boolean z6, boolean z7, int i5) {
        this.f33874a = str;
        this.f33875b = i4;
        this.f33876c = num;
        this.f33877d = num2;
        this.f33878e = f4;
        this.f33879f = z4;
        this.f33880g = z5;
        this.f33881h = z6;
        this.f33882i = z7;
        this.f33883j = i5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0068. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[Catch: RuntimeException -> 0x006c, TryCatch #4 {RuntimeException -> 0x006c, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:15:0x0083, B:17:0x0087, B:18:0x0094, B:20:0x0098, B:21:0x00a5, B:23:0x00a9, B:25:0x00af, B:27:0x00ce, B:29:0x00d4, B:32:0x00e1, B:34:0x00e5, B:76:0x00b6, B:80:0x0071), top: B:8:0x004b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[Catch: RuntimeException -> 0x006c, TryCatch #4 {RuntimeException -> 0x006c, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:15:0x0083, B:17:0x0087, B:18:0x0094, B:20:0x0098, B:21:0x00a5, B:23:0x00a9, B:25:0x00af, B:27:0x00ce, B:29:0x00d4, B:32:0x00e1, B:34:0x00e5, B:76:0x00b6, B:80:0x0071), top: B:8:0x004b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9 A[Catch: RuntimeException -> 0x006c, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x006c, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:15:0x0083, B:17:0x0087, B:18:0x0094, B:20:0x0098, B:21:0x00a5, B:23:0x00a9, B:25:0x00af, B:27:0x00ce, B:29:0x00d4, B:32:0x00e1, B:34:0x00e5, B:76:0x00b6, B:80:0x0071), top: B:8:0x004b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[Catch: RuntimeException -> 0x006c, TryCatch #4 {RuntimeException -> 0x006c, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:15:0x0083, B:17:0x0087, B:18:0x0094, B:20:0x0098, B:21:0x00a5, B:23:0x00a9, B:25:0x00af, B:27:0x00ce, B:29:0x00d4, B:32:0x00e1, B:34:0x00e5, B:76:0x00b6, B:80:0x0071), top: B:8:0x004b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5 A[Catch: RuntimeException -> 0x006c, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x006c, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:15:0x0083, B:17:0x0087, B:18:0x0094, B:20:0x0098, B:21:0x00a5, B:23:0x00a9, B:25:0x00af, B:27:0x00ce, B:29:0x00d4, B:32:0x00e1, B:34:0x00e5, B:76:0x00b6, B:80:0x0071), top: B:8:0x004b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb A[Catch: RuntimeException -> 0x010a, TryCatch #3 {RuntimeException -> 0x010a, blocks: (B:39:0x00f7, B:41:0x00fb, B:44:0x010e, B:46:0x0112, B:49:0x0123, B:51:0x0127, B:53:0x012d, B:60:0x0153, B:57:0x013f), top: B:38:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112 A[Catch: RuntimeException -> 0x010a, TryCatch #3 {RuntimeException -> 0x010a, blocks: (B:39:0x00f7, B:41:0x00fb, B:44:0x010e, B:46:0x0112, B:49:0x0123, B:51:0x0127, B:53:0x012d, B:60:0x0153, B:57:0x013f), top: B:38:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127 A[Catch: RuntimeException -> 0x010a, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x010a, blocks: (B:39:0x00f7, B:41:0x00fb, B:44:0x010e, B:46:0x0112, B:49:0x0123, B:51:0x0127, B:53:0x012d, B:60:0x0153, B:57:0x013f), top: B:38:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w12 a(String str, a aVar) {
        w12 w12Var;
        int i4;
        int i5;
        float f4;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int parseInt;
        if (!str.startsWith("Style:")) {
            throw new IllegalArgumentException();
        }
        String[] split = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = split.length;
        int i10 = aVar.f33894k;
        if (length != i10) {
            int length2 = split.length;
            int i11 = u82.f32873a;
            Locale locale = Locale.US;
            ms0.d("SsaStyle", "Skipping malformed 'Style:' line (expected " + i10 + " values, found " + length2 + "): '" + str + "'");
            return null;
        }
        try {
            String trim = split[aVar.f33884a].trim();
            int i12 = aVar.f33885b;
            try {
                if (i12 != -1) {
                    String trim2 = split[i12].trim();
                    try {
                        i4 = Integer.parseInt(trim2.trim());
                    } catch (NumberFormatException unused) {
                    }
                    switch (i4) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            break;
                        default:
                            ms0.d("SsaStyle", "Ignoring unknown alignment: " + trim2);
                            break;
                    }
                    int i13 = aVar.f33886c;
                    Integer b4 = i13 == -1 ? b(split[i13].trim()) : null;
                    int i14 = aVar.f33887d;
                    Integer b5 = i14 == -1 ? b(split[i14].trim()) : null;
                    i5 = aVar.f33888e;
                    if (i5 != -1) {
                        String trim3 = split[i5].trim();
                        try {
                            f4 = Float.parseFloat(trim3);
                        } catch (NumberFormatException e4) {
                            ms0.b("SsaStyle", "Failed to parse font size: '" + trim3 + "'", e4);
                        }
                        float f5 = f4;
                        i6 = aVar.f33889f;
                        z4 = false;
                        if (i6 != -1 && a(split[i6].trim())) {
                            z4 = true;
                        }
                        i7 = aVar.f33890g;
                        if (i7 != -1) {
                            if (a(split[i7].trim())) {
                                z5 = true;
                                w12Var = null;
                                int i15 = aVar.f33891h;
                                boolean z6 = i15 == -1 && a(split[i15].trim());
                                int i16 = aVar.f33892i;
                                boolean z7 = i16 == -1 && a(split[i16].trim());
                                i8 = aVar.f33893j;
                                if (i8 != -1) {
                                    String trim4 = split[i8].trim();
                                    try {
                                        parseInt = Integer.parseInt(trim4.trim());
                                    } catch (NumberFormatException unused2) {
                                    }
                                    if (parseInt == 1 || parseInt == 3) {
                                        i9 = parseInt;
                                        return new w12(trim, i4, b4, b5, f5, z4, z5, z6, z7, i9);
                                    }
                                    ms0.d("SsaStyle", "Ignoring unknown BorderStyle: " + trim4);
                                }
                                i9 = -1;
                                return new w12(trim, i4, b4, b5, f5, z4, z5, z6, z7, i9);
                            }
                        }
                        z5 = false;
                        w12Var = null;
                        int i152 = aVar.f33891h;
                        if (i152 == -1) {
                        }
                        int i162 = aVar.f33892i;
                        if (i162 == -1) {
                        }
                        i8 = aVar.f33893j;
                        if (i8 != -1) {
                        }
                        i9 = -1;
                        return new w12(trim, i4, b4, b5, f5, z4, z5, z6, z7, i9);
                    }
                    f4 = -3.4028235E38f;
                    float f52 = f4;
                    i6 = aVar.f33889f;
                    z4 = false;
                    if (i6 != -1) {
                        z4 = true;
                    }
                    i7 = aVar.f33890g;
                    if (i7 != -1) {
                    }
                    z5 = false;
                    w12Var = null;
                    int i1522 = aVar.f33891h;
                    if (i1522 == -1) {
                    }
                    int i1622 = aVar.f33892i;
                    if (i1622 == -1) {
                    }
                    i8 = aVar.f33893j;
                    if (i8 != -1) {
                    }
                    i9 = -1;
                    return new w12(trim, i4, b4, b5, f52, z4, z5, z6, z7, i9);
                }
                int i15222 = aVar.f33891h;
                if (i15222 == -1) {
                }
                int i16222 = aVar.f33892i;
                if (i16222 == -1) {
                }
                i8 = aVar.f33893j;
                if (i8 != -1) {
                }
                i9 = -1;
                return new w12(trim, i4, b4, b5, f52, z4, z5, z6, z7, i9);
            } catch (RuntimeException e5) {
                e = e5;
                ms0.b("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                return w12Var;
            }
            i4 = -1;
            int i132 = aVar.f33886c;
            if (i132 == -1) {
            }
            int i142 = aVar.f33887d;
            if (i142 == -1) {
            }
            i5 = aVar.f33888e;
            if (i5 != -1) {
            }
            f4 = -3.4028235E38f;
            float f522 = f4;
            i6 = aVar.f33889f;
            z4 = false;
            if (i6 != -1) {
            }
            i7 = aVar.f33890g;
            if (i7 != -1) {
            }
            z5 = false;
            w12Var = null;
        } catch (RuntimeException e6) {
            e = e6;
            w12Var = null;
            ms0.b("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return w12Var;
        }
    }

    public static Integer b(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (parseLong > 4294967295L) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(pp0.a(((parseLong >> 24) & 255) ^ 255), pp0.a(parseLong & 255), pp0.a((parseLong >> 8) & 255), pp0.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            ms0.b("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }

    private static boolean a(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e4) {
            ms0.b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }
}
