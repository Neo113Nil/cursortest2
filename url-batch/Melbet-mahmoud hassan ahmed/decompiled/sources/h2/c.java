package h2;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import c4.w0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.m0;
import o2.r;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f16791a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16792b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f16793c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f16794d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16795e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16796f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16797g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16798h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16799i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16800j;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16801a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16802b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16803c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16804d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16805e;

        /* renamed from: f, reason: collision with root package name */
        public final int f16806f;

        /* renamed from: g, reason: collision with root package name */
        public final int f16807g;

        /* renamed from: h, reason: collision with root package name */
        public final int f16808h;

        /* renamed from: i, reason: collision with root package name */
        public final int f16809i;

        /* renamed from: j, reason: collision with root package name */
        public final int f16810j;

        /* renamed from: k, reason: collision with root package name */
        public final int f16811k;

        private a(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f16801a = i7;
            this.f16802b = i8;
            this.f16803c = i9;
            this.f16804d = i10;
            this.f16805e = i11;
            this.f16806f = i12;
            this.f16807g = i13;
            this.f16808h = i14;
            this.f16809i = i15;
            this.f16810j = i16;
            this.f16811k = i17;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static a a(String str) {
            char c7;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < split.length; i17++) {
                String e7 = l4.b.e(split[i17].trim());
                e7.hashCode();
                switch (e7.hashCode()) {
                    case -1178781136:
                        if (e7.equals("italic")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1026963764:
                        if (e7.equals("underline")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -192095652:
                        if (e7.equals("strikeout")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -70925746:
                        if (e7.equals("primarycolour")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3029637:
                        if (e7.equals("bold")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3373707:
                        if (e7.equals("name")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 366554320:
                        if (e7.equals("fontsize")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 767321349:
                        if (e7.equals("borderstyle")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1767875043:
                        if (e7.equals("alignment")) {
                            c7 = '\b';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1988365454:
                        if (e7.equals("outlinecolour")) {
                            c7 = '\t';
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 0:
                        i13 = i17;
                        break;
                    case 1:
                        i14 = i17;
                        break;
                    case 2:
                        i15 = i17;
                        break;
                    case 3:
                        i9 = i17;
                        break;
                    case 4:
                        i12 = i17;
                        break;
                    case 5:
                        i7 = i17;
                        break;
                    case 6:
                        i11 = i17;
                        break;
                    case w0.f2149o /* 7 */:
                        i16 = i17;
                        break;
                    case w0.f2150p /* 8 */:
                        i8 = i17;
                        break;
                    case '\t':
                        i10 = i17;
                        break;
                }
            }
            if (i7 != -1) {
                return new a(i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, split.length);
            }
            return null;
        }
    }

    static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f16812c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f16813d = Pattern.compile(m0.C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f16814e = Pattern.compile(m0.C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f16815f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f16816a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f16817b;

        private b(int i7, PointF pointF) {
            this.f16816a = i7;
            this.f16817b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f16815f.matcher(str);
            if (matcher.find()) {
                return c.e((String) o2.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f16812c.matcher(str);
            PointF pointF = null;
            int i7 = -1;
            while (matcher.find()) {
                String str2 = (String) o2.a.e(matcher.group(1));
                try {
                    PointF c7 = c(str2);
                    if (c7 != null) {
                        pointF = c7;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a7 = a(str2);
                    if (a7 != -1) {
                        i7 = a7;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i7, pointF);
        }

        private static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f16813d.matcher(str);
            Matcher matcher2 = f16814e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    r.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            return new PointF(Float.parseFloat(((String) o2.a.e(group)).trim()), Float.parseFloat(((String) o2.a.e(group2)).trim()));
        }

        public static String d(String str) {
            return f16812c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i7, Integer num, Integer num2, float f7, boolean z6, boolean z7, boolean z8, boolean z9, int i8) {
        this.f16791a = str;
        this.f16792b = i7;
        this.f16793c = num;
        this.f16794d = num2;
        this.f16795e = f7;
        this.f16796f = z6;
        this.f16797g = z7;
        this.f16798h = z8;
        this.f16799i = z9;
        this.f16800j = i8;
    }

    public static c b(String str, a aVar) {
        o2.a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i7 = aVar.f16811k;
        if (length != i7) {
            r.i("SsaStyle", m0.C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i7), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f16801a].trim();
            int i8 = aVar.f16802b;
            int e7 = i8 != -1 ? e(split[i8].trim()) : -1;
            int i9 = aVar.f16803c;
            Integer h7 = i9 != -1 ? h(split[i9].trim()) : null;
            int i10 = aVar.f16804d;
            Integer h8 = i10 != -1 ? h(split[i10].trim()) : null;
            int i11 = aVar.f16805e;
            float i12 = i11 != -1 ? i(split[i11].trim()) : -3.4028235E38f;
            int i13 = aVar.f16806f;
            boolean z6 = i13 != -1 && f(split[i13].trim());
            int i14 = aVar.f16807g;
            boolean z7 = i14 != -1 && f(split[i14].trim());
            int i15 = aVar.f16808h;
            boolean z8 = i15 != -1 && f(split[i15].trim());
            int i16 = aVar.f16809i;
            boolean z9 = i16 != -1 && f(split[i16].trim());
            int i17 = aVar.f16810j;
            return new c(trim, e7, h7, h8, i12, z6, z7, z8, z9, i17 != -1 ? g(split[i17].trim()) : -1);
        } catch (RuntimeException e8) {
            r.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e8);
            return null;
        }
    }

    private static boolean c(int i7) {
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case w0.f2149o /* 7 */:
            case w0.f2150p /* 8 */:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i7) {
        return i7 == 1 || i7 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        r.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e7) {
            r.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        r.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            o2.a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(o4.d.d(((parseLong >> 24) & 255) ^ 255), o4.d.d(parseLong & 255), o4.d.d((parseLong >> 8) & 255), o4.d.d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            r.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e7) {
            r.j("SsaStyle", "Failed to parse font size: '" + str + "'", e7);
            return -3.4028235E38f;
        }
    }
}
