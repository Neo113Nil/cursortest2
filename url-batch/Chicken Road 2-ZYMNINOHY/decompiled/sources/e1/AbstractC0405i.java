package e1;

import O3.l;
import W.AbstractC0108a;
import W.J;
import W.u;
import a.AbstractC0124a;
import android.graphics.Color;
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
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* renamed from: e1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0405i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f8460a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f8461b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f8462c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f8463d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8462c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8463d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, C0402f c0402f, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c4;
        int i4;
        int i5;
        int i6;
        int i7 = c0402f.f8444b;
        int length = spannableStringBuilder.length();
        String str2 = c0402f.f8443a;
        str2.getClass();
        int i8 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c4 = 7;
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
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i7, length, 33);
                break;
            case 2:
                for (String str3 : c0402f.f8446d) {
                    Map map = f8462c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i7, length, 33);
                    } else {
                        Map map2 = f8463d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i7, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i7, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new V.h(c0402f.f8445c), i7, length, 33);
                break;
            case 7:
                int c5 = c(list2, str, c0402f);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C0401e.f8440c);
                int i9 = c0402f.f8444b;
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    if ("rt".equals(((C0401e) arrayList.get(i10)).f8441a.f8443a)) {
                        C0401e c0401e = (C0401e) arrayList.get(i10);
                        int c6 = c(list2, str, c0401e.f8441a);
                        if (c6 == i8) {
                            c6 = c5 != i8 ? c5 : 1;
                        }
                        int i12 = c0401e.f8441a.f8444b - i11;
                        int i13 = c0401e.f8442b - i11;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i12, i13);
                        spannableStringBuilder.delete(i12, i13);
                        spannableStringBuilder.setSpan(new V.f(subSequence.toString(), c6), i9, i12, 33);
                        i11 = subSequence.length() + i11;
                        i9 = i12;
                    }
                    i10++;
                    i8 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b4 = b(list2, str, c0402f);
        for (int i14 = 0; i14 < b4.size(); i14++) {
            C0399c c0399c = ((C0403g) b4.get(i14)).f8448b;
            int i15 = c0399c.f8433l;
            if (i15 == -1 && c0399c.f8434m == -1) {
                i4 = -1;
            } else {
                i4 = (c0399c.f8434m == 1 ? (char) 2 : (char) 0) | (i15 == 1 ? (char) 1 : (char) 0);
            }
            if (i4 != -1) {
                int i16 = c0399c.f8433l;
                if (i16 == -1 && c0399c.f8434m == -1) {
                    i6 = -1;
                    i5 = 1;
                } else {
                    i5 = 1;
                    i6 = (i16 == 1 ? 1 : 0) | (c0399c.f8434m == 1 ? 2 : 0);
                }
                l.a(spannableStringBuilder, new StyleSpan(i6), i7, length);
            } else {
                i5 = 1;
            }
            if (c0399c.f8431j == i5) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i7, length, 33);
            }
            if (c0399c.f8432k == i5) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
            }
            if (c0399c.f8428g) {
                if (!c0399c.f8428g) {
                    throw new IllegalStateException("Font color not defined");
                }
                l.a(spannableStringBuilder, new ForegroundColorSpan(c0399c.f8427f), i7, length);
            }
            if (c0399c.f8430i) {
                if (!c0399c.f8430i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                l.a(spannableStringBuilder, new BackgroundColorSpan(c0399c.f8429h), i7, length);
            }
            if (c0399c.f8426e != null) {
                l.a(spannableStringBuilder, new TypefaceSpan(c0399c.f8426e), i7, length);
            }
            int i17 = c0399c.n;
            if (i17 == 1) {
                l.a(spannableStringBuilder, new AbsoluteSizeSpan((int) c0399c.o, true), i7, length);
            } else if (i17 == 2) {
                l.a(spannableStringBuilder, new RelativeSizeSpan(c0399c.o), i7, length);
            } else if (i17 == 3) {
                l.a(spannableStringBuilder, new RelativeSizeSpan(c0399c.o / 100.0f), i7, length);
            }
            if (c0399c.f8436q) {
                spannableStringBuilder.setSpan(new V.e(), i7, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, C0402f c0402f) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            C0399c c0399c = (C0399c) list.get(i4);
            String str2 = c0402f.f8443a;
            Set set = c0402f.f8446d;
            String str3 = c0402f.f8445c;
            if (c0399c.f8422a.isEmpty() && c0399c.f8423b.isEmpty() && c0399c.f8424c.isEmpty() && c0399c.f8425d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a3 = C0399c.a(C0399c.a(C0399c.a(0, 1073741824, c0399c.f8422a, str), 2, c0399c.f8423b, str2), 4, c0399c.f8425d, str3);
                size = (a3 == -1 || !set.containsAll(c0399c.f8424c)) ? 0 : a3 + (c0399c.f8424c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new C0403g(size, c0399c));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, C0402f c0402f) {
        ArrayList b4 = b(list, str, c0402f);
        for (int i4 = 0; i4 < b4.size(); i4++) {
            int i5 = ((C0403g) b4.get(i4)).f8448b.f8435p;
            if (i5 != -1) {
                return i5;
            }
        }
        return -1;
    }

    public static C0400d d(String str, Matcher matcher, u uVar, ArrayList arrayList) {
        C0404h c0404h = new C0404h();
        try {
            String group = matcher.group(1);
            group.getClass();
            c0404h.f8449a = AbstractC0407k.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            c0404h.f8450b = AbstractC0407k.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, c0404h);
            StringBuilder sb = new StringBuilder();
            uVar.getClass();
            String n = uVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n)) {
                if (sb.length() > 0) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb.append(n.trim());
                n = uVar.n(StandardCharsets.UTF_8);
            }
            c0404h.f8451c = f(str, sb.toString(), arrayList);
            return new C0400d(c0404h.a().a(), c0404h.f8449a, c0404h.f8450b);
        } catch (IllegalArgumentException unused) {
            AbstractC0108a.s("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0081, code lost:
    
        if (r6.equals("center") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
    
        if (r7.equals("start") == false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, C0404h c0404h) {
        int i4;
        int i5;
        int i6;
        Matcher matcher = f8461b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, c0404h);
                } else {
                    char c4 = 5;
                    boolean z = false;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            case false:
                            case true:
                                i4 = 2;
                                break;
                            case true:
                                i4 = 3;
                                break;
                            case true:
                                i4 = 4;
                                break;
                            case true:
                                i4 = 5;
                                break;
                            case true:
                                i4 = 1;
                                break;
                            default:
                                AbstractC0108a.s("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i4 = 2;
                                break;
                        }
                        c0404h.f8452d = i4;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            substring.getClass();
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c4 = 4;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            switch (c4) {
                                case 0:
                                case 5:
                                    i5 = 0;
                                    break;
                                case 1:
                                case 3:
                                    i5 = 1;
                                    break;
                                case 2:
                                case 4:
                                    i5 = 2;
                                    break;
                                default:
                                    AbstractC0108a.s("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i5 = Integer.MIN_VALUE;
                                    break;
                            }
                            c0404h.f8457i = i5;
                            group2 = group2.substring(0, indexOf);
                        }
                        c0404h.f8456h = AbstractC0407k.b(group2);
                    } else if ("size".equals(group)) {
                        c0404h.f8458j = AbstractC0407k.b(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i6 = 2;
                        } else if (group2.equals("rl")) {
                            i6 = 1;
                        } else {
                            AbstractC0108a.s("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i6 = Integer.MIN_VALUE;
                        }
                        c0404h.f8459k = i6;
                    } else {
                        AbstractC0108a.s("WebvttCueParser", "Unknown cue setting " + group + StringUtils.PROCESS_POSTFIX_DELIMITER + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                AbstractC0108a.s("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List list) {
        char c4;
        char c5;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            String str3 = "";
            if (i4 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (C0402f) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new C0402f("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i4);
            if (charAt == '&') {
                i4++;
                int indexOf = str2.indexOf(59, i4);
                int indexOf2 = str2.indexOf(32, i4);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i4, indexOf);
                    substring.getClass();
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC0108a.s("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i4 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i4++;
            } else {
                int i5 = i4 + 1;
                if (i5 < str2.length()) {
                    boolean z = str2.charAt(i5) == '/';
                    int indexOf3 = str2.indexOf(62, i5);
                    i5 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i6 = i5 - 2;
                    boolean z4 = str2.charAt(i6) == '/';
                    int i7 = i4 + (z ? 2 : 1);
                    if (!z4) {
                        i6 = i5 - 1;
                    }
                    String substring2 = str2.substring(i7, i6);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        AbstractC0124a.h(!trim.isEmpty());
                        String str4 = J.f3263a;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case 98:
                                if (str5.equals("b")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 99:
                                if (str5.equals("c")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 105:
                                if (str5.equals("i")) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 117:
                                if (str5.equals("u")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 118:
                                if (str5.equals("v")) {
                                    c4 = 4;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 3650:
                                if (str5.equals("rt")) {
                                    c4 = 5;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 3314158:
                                if (str5.equals("lang")) {
                                    c4 = 6;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 3511770:
                                if (str5.equals("ruby")) {
                                    c4 = 7;
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
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        C0402f c0402f = (C0402f) arrayDeque.pop();
                                        a(str, c0402f, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C0401e(c0402f, spannableStringBuilder.length()));
                                        }
                                        if (c0402f.f8443a.equals(str5)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z4) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    AbstractC0124a.h(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c5 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c5 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c5];
                                    HashSet hashSet = new HashSet();
                                    for (int i8 = 1; i8 < split.length; i8++) {
                                        hashSet.add(split[i8]);
                                    }
                                    arrayDeque.push(new C0402f(str6, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i4 = i5;
            }
        }
    }

    public static void g(String str, C0404h c0404h) {
        String substring;
        int i4;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            i4 = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i4 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i4 = 0;
                    break;
                default:
                    AbstractC0108a.s("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i4 = Integer.MIN_VALUE;
                    break;
            }
            c0404h.f8455g = i4;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c0404h.f8453e = AbstractC0407k.b(str);
            c0404h.f8454f = 0;
        } else {
            c0404h.f8453e = Integer.parseInt(str);
            c0404h.f8454f = 1;
        }
    }
}
