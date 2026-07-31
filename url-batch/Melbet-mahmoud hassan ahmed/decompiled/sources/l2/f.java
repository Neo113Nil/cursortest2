package l2;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c2.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l2.f;
import o2.a0;
import o2.m0;
import o2.r;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f18561a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f18562b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f18563c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f18564d;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f18565c = new Comparator() { // from class: l2.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e7;
                e7 = f.b.e((f.b) obj, (f.b) obj2);
                return e7;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final c f18566a;

        /* renamed from: b, reason: collision with root package name */
        private final int f18567b;

        private b(c cVar, int i7) {
            this.f18566a = cVar;
            this.f18567b = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f18566a.f18569b, bVar2.f18566a.f18569b);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f18568a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18569b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18570c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f18571d;

        private c(String str, int i7, String str2, Set<String> set) {
            this.f18569b = i7;
            this.f18568a = str;
            this.f18570c = str2;
            this.f18571d = set;
        }

        public static c a(String str, int i7) {
            String str2;
            String trim = str.trim();
            o2.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] Q0 = m0.Q0(trim, "\\.");
            String str3 = Q0[0];
            HashSet hashSet = new HashSet();
            for (int i8 = 1; i8 < Q0.length; i8++) {
                hashSet.add(Q0[i8]);
            }
            return new c(str3, i7, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    private static final class d implements Comparable<d> {

        /* renamed from: f, reason: collision with root package name */
        public final int f18572f;

        /* renamed from: g, reason: collision with root package name */
        public final l2.d f18573g;

        public d(int i7, l2.d dVar) {
            this.f18572f = i7;
            this.f18573g = dVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f18572f, dVar.f18572f);
        }
    }

    private static final class e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f18576c;

        /* renamed from: a, reason: collision with root package name */
        public long f18574a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f18575b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f18577d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f18578e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f18579f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f18580g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f18581h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f18582i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f18583j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f18584k = Integer.MIN_VALUE;

        private static float b(float f7, int i7) {
            if (f7 == -3.4028235E38f || i7 != 0 || (f7 >= 0.0f && f7 <= 1.0f)) {
                return f7 != -3.4028235E38f ? f7 : i7 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i7) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            r.i("WebvttCueParser", "Unknown textAlignment: " + i7);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i7, float f7) {
            if (i7 == 0) {
                return 1.0f - f7;
            }
            if (i7 == 1) {
                return f7 <= 0.5f ? f7 * 2.0f : (1.0f - f7) * 2.0f;
            }
            if (i7 == 2) {
                return f7;
            }
            throw new IllegalStateException(String.valueOf(i7));
        }

        private static float e(int i7) {
            if (i7 != 4) {
                return i7 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 3) {
                return 2;
            }
            if (i7 != 4) {
                return i7 != 5 ? 1 : 2;
            }
            return 0;
        }

        public l2.e a() {
            return new l2.e(g().a(), this.f18574a, this.f18575b);
        }

        public b.C0043b g() {
            float f7 = this.f18581h;
            if (f7 == -3.4028235E38f) {
                f7 = e(this.f18577d);
            }
            int i7 = this.f18582i;
            if (i7 == Integer.MIN_VALUE) {
                i7 = f(this.f18577d);
            }
            b.C0043b r7 = new b.C0043b().p(c(this.f18577d)).h(b(this.f18578e, this.f18579f), this.f18579f).i(this.f18580g).k(f7).l(i7).n(Math.min(this.f18583j, d(i7, f7))).r(this.f18584k);
            CharSequence charSequence = this.f18576c;
            if (charSequence != null) {
                r7.o(charSequence);
            }
            return r7;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18563c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18564d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i7, int i8) {
        Object foregroundColorSpan;
        for (String str : set) {
            Map<String, Integer> map = f18563c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(map.get(str).intValue());
            } else {
                Map<String, Integer> map2 = f18564d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(map2.get(str).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i7, i8, 33);
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        char c7;
        str.hashCode();
        switch (str) {
            case "gt":
                c7 = '>';
                break;
            case "lt":
                c7 = '<';
                break;
            case "amp":
                c7 = '&';
                break;
            case "nbsp":
                c7 = ' ';
                break;
            default:
                r.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c7);
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<l2.d> list2) {
        int i7 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f18565c);
        int i8 = cVar.f18569b;
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if ("rt".equals(((b) arrayList.get(i10)).f18566a.f18568a)) {
                b bVar = (b) arrayList.get(i10);
                int g7 = g(i(list2, str, bVar.f18566a), i7, 1);
                int i11 = bVar.f18566a.f18569b - i9;
                int i12 = bVar.f18567b - i9;
                CharSequence subSequence = spannableStringBuilder.subSequence(i11, i12);
                spannableStringBuilder.delete(i11, i12);
                spannableStringBuilder.setSpan(new g2.b(subSequence.toString(), g7), i8, i11, 33);
                i9 += subSequence.length();
                i8 = i11;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[LOOP:0: B:38:0x0097->B:40:0x009d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<l2.d> list2) {
        int i7;
        int length;
        int i8;
        List<d> h7;
        Object styleSpan;
        i7 = cVar.f18569b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f18568a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                h7 = h(list2, str, cVar);
                for (i8 = 0; i8 < h7.size(); i8++) {
                    e(spannableStringBuilder, h7.get(i8).f18573g, i7, length);
                }
                break;
            case "b":
                styleSpan = new StyleSpan(1);
                spannableStringBuilder.setSpan(styleSpan, i7, length, 33);
                h7 = h(list2, str, cVar);
                while (i8 < h7.size()) {
                }
                break;
            case "c":
                a(spannableStringBuilder, cVar.f18571d, i7, length);
                h7 = h(list2, str, cVar);
                while (i8 < h7.size()) {
                }
                break;
            case "i":
                styleSpan = new StyleSpan(2);
                spannableStringBuilder.setSpan(styleSpan, i7, length, 33);
                h7 = h(list2, str, cVar);
                while (i8 < h7.size()) {
                }
                break;
            case "u":
                styleSpan = new UnderlineSpan();
                spannableStringBuilder.setSpan(styleSpan, i7, length, 33);
                h7 = h(list2, str, cVar);
                while (i8 < h7.size()) {
                }
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                h7 = h(list2, str, cVar);
                while (i8 < h7.size()) {
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(SpannableStringBuilder spannableStringBuilder, l2.d dVar, int i7, int i8) {
        Object absoluteSizeSpan;
        if (dVar == null) {
            return;
        }
        if (dVar.i() != -1) {
            g2.c.a(spannableStringBuilder, new StyleSpan(dVar.i()), i7, i8, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i7, i8, 33);
        }
        if (dVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i8, 33);
        }
        if (dVar.k()) {
            g2.c.a(spannableStringBuilder, new ForegroundColorSpan(dVar.c()), i7, i8, 33);
        }
        if (dVar.j()) {
            g2.c.a(spannableStringBuilder, new BackgroundColorSpan(dVar.a()), i7, i8, 33);
        }
        if (dVar.d() != null) {
            g2.c.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i7, i8, 33);
        }
        int f7 = dVar.f();
        if (f7 == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) dVar.e(), true);
        } else {
            if (f7 != 2) {
                if (f7 == 3) {
                    absoluteSizeSpan = new RelativeSizeSpan(dVar.e() / 100.0f);
                }
                if (dVar.b()) {
                    return;
                }
                spannableStringBuilder.setSpan(new g2.a(), i7, i8, 33);
                return;
            }
            absoluteSizeSpan = new RelativeSizeSpan(dVar.e());
        }
        g2.c.a(spannableStringBuilder, absoluteSizeSpan, i7, i8, 33);
        if (dVar.b()) {
        }
    }

    private static int f(String str, int i7) {
        int indexOf = str.indexOf(62, i7);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int g(int i7, int i8, int i9) {
        if (i7 != -1) {
            return i7;
        }
        if (i8 != -1) {
            return i8;
        }
        if (i9 != -1) {
            return i9;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> h(List<l2.d> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            l2.d dVar = list.get(i7);
            int h7 = dVar.h(str, cVar.f18568a, cVar.f18571d, cVar.f18570c);
            if (h7 > 0) {
                arrayList.add(new d(h7, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int i(List<l2.d> list, String str, c cVar) {
        List<d> h7 = h(list, str, cVar);
        for (int i7 = 0; i7 < h7.size(); i7++) {
            l2.d dVar = h7.get(i7).f18573g;
            if (dVar.g() != -1) {
                return dVar.g();
            }
        }
        return -1;
    }

    private static String j(String str) {
        String trim = str.trim();
        o2.a.a(!trim.isEmpty());
        return m0.R0(trim, "[ \\.]")[0];
    }

    private static boolean k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    static c2.b l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f18576c = charSequence;
        return eVar.g().a();
    }

    private static l2.e m(String str, Matcher matcher, a0 a0Var, List<l2.d> list) {
        e eVar = new e();
        try {
            eVar.f18574a = i.d((String) o2.a.e(matcher.group(1)));
            eVar.f18575b = i.d((String) o2.a.e(matcher.group(2)));
            p((String) o2.a.e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String o7 = a0Var.o();
                if (TextUtils.isEmpty(o7)) {
                    eVar.f18576c = q(str, sb.toString(), list);
                    return eVar.a();
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(o7.trim());
            }
        } catch (NumberFormatException unused) {
            r.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static l2.e n(a0 a0Var, List<l2.d> list) {
        String o7 = a0Var.o();
        if (o7 == null) {
            return null;
        }
        Pattern pattern = f18561a;
        Matcher matcher = pattern.matcher(o7);
        if (matcher.matches()) {
            return m(null, matcher, a0Var, list);
        }
        String o8 = a0Var.o();
        if (o8 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(o8);
        if (matcher2.matches()) {
            return m(o7.trim(), matcher2, a0Var, list);
        }
        return null;
    }

    static b.C0043b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    private static void p(String str, e eVar) {
        Matcher matcher = f18562b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) o2.a.e(matcher.group(1));
            String str3 = (String) o2.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f18577d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f18583j = i.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f18584k = w(str3);
                } else {
                    r.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                r.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString q(String str, String str2, List<l2.d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < str2.length()) {
            char charAt = str2.charAt(i7);
            if (charAt == '&') {
                i7++;
                int indexOf = str2.indexOf(59, i7);
                int indexOf2 = str2.indexOf(32, i7);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i7, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i7 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i7++;
            } else {
                int i8 = i7 + 1;
                if (i8 < str2.length()) {
                    boolean z6 = str2.charAt(i8) == '/';
                    i8 = f(str2, i8);
                    int i9 = i8 - 2;
                    boolean z7 = str2.charAt(i9) == '/';
                    int i10 = i7 + (z6 ? 2 : 1);
                    if (!z7) {
                        i9 = i8 - 1;
                    }
                    String substring = str2.substring(i10, i9);
                    if (!substring.trim().isEmpty()) {
                        String j7 = j(substring);
                        if (k(j7)) {
                            if (z6) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f18568a.equals(j7)) {
                                        break;
                                    }
                                }
                            } else if (!z7) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i7 = i8;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                r.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f18580g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f18578e = i.c(str);
            eVar.f18579f = 0;
        } else {
            eVar.f18578e = Integer.parseInt(str);
            eVar.f18579f = 1;
        }
    }

    private static int t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                r.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f18582i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f18581h = i.c(str);
    }

    private static int v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                r.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        r.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
