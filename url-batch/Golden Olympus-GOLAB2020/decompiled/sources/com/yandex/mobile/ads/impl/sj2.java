package com.yandex.mobile.ads.impl;

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
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.sj2;
import com.yandex.mobile.ads.impl.uu;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class sj2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f31770a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f31771b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f31772c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f31773d;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f31774c = new Comparator() { // from class: com.yandex.mobile.ads.impl.Md
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a4;
                a4 = sj2.a.a((sj2.a) obj, (sj2.a) obj2);
                return a4;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final b f31775a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31776b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar.f31775a.f31778b, aVar2.f31775a.f31778b);
        }

        private a(b bVar, int i4) {
            this.f31775a = bVar;
            this.f31776b = i4;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f31777a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31778b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31779c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f31780d;

        private b(String str, int i4, String str2, Set<String> set) {
            this.f31778b = i4;
            this.f31777a = str;
            this.f31779c = str2;
            this.f31780d = set;
        }
    }

    private static final class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name */
        public final int f31781b;

        /* renamed from: c, reason: collision with root package name */
        public final qj2 f31782c;

        public c(int i4, qj2 qj2Var) {
            this.f31781b = i4;
            this.f31782c = qj2Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f31781b, cVar.f31781b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f31785c;

        /* renamed from: a, reason: collision with root package name */
        public long f31783a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f31784b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f31786d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f31787e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f31788f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f31789g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f31790h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f31791i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f31792j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f31793k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:
        
            if (r8 == 0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final uu.a a() {
            Layout.Alignment alignment;
            float f4;
            CharSequence charSequence;
            float f5 = this.f31790h;
            float f6 = -3.4028235E38f;
            if (f5 == -3.4028235E38f) {
                int i4 = this.f31786d;
                f5 = i4 != 4 ? i4 != 5 ? 0.5f : 1.0f : 0.0f;
            }
            int i5 = this.f31791i;
            if (i5 == Integer.MIN_VALUE) {
                int i6 = this.f31786d;
                if (i6 != 1) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                i5 = 1;
                            }
                        }
                    }
                    i5 = 2;
                }
                i5 = 0;
            }
            uu.a aVar = new uu.a();
            int i7 = this.f31786d;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                fr0.a("Unknown textAlignment: ", i7, "WebvttCueParser");
                                alignment = null;
                            }
                        }
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                uu.a b4 = aVar.b(alignment);
                f4 = this.f31787e;
                int i8 = this.f31788f;
                if (f4 != -3.4028235E38f || i8 != 0 || (f4 >= 0.0f && f4 <= 1.0f)) {
                    if (f4 == -3.4028235E38f) {
                        f6 = f4;
                    }
                    uu.a b5 = b4.a(i8, f6).a(this.f31789g).b(f5).b(i5);
                    float f7 = this.f31792j;
                    if (i5 == 0) {
                        f5 = 1.0f - f5;
                    } else if (i5 == 1) {
                        f5 = f5 <= 0.5f ? f5 * 2.0f : (1.0f - f5) * 2.0f;
                    } else if (i5 != 2) {
                        throw new IllegalStateException(String.valueOf(i5));
                    }
                    uu.a c4 = b5.d(Math.min(f7, f5)).c(this.f31793k);
                    charSequence = this.f31785c;
                    if (charSequence != null) {
                        c4.a(charSequence);
                    }
                    return c4;
                }
                f6 = 1.0f;
                uu.a b52 = b4.a(i8, f6).a(this.f31789g).b(f5).b(i5);
                float f72 = this.f31792j;
                if (i5 == 0) {
                }
                uu.a c42 = b52.d(Math.min(f72, f5)).c(this.f31793k);
                charSequence = this.f31785c;
                if (charSequence != null) {
                }
                return c42;
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            uu.a b42 = aVar.b(alignment);
            f4 = this.f31787e;
            int i82 = this.f31788f;
            if (f4 != -3.4028235E38f) {
            }
            if (f4 == -3.4028235E38f) {
            }
            uu.a b522 = b42.a(i82, f6).a(this.f31789g).b(f5).b(i5);
            float f722 = this.f31792j;
            if (i5 == 0) {
            }
            uu.a c422 = b522.d(Math.min(f722, f5)).c(this.f31793k);
            charSequence = this.f31785c;
            if (charSequence != null) {
            }
            return c422;
        }
    }

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
        f31772c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f31773d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void a(SpannableStringBuilder spannableStringBuilder, b bVar, String str, List list, List list2) {
        char c4;
        int i4;
        int i5;
        boolean z4;
        ArrayList arrayList;
        int i6 = bVar.f31778b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f31777a;
        str2.getClass();
        boolean z5 = true;
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
                if (str2.equals(com.ironsource.ge.f16487q)) {
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
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i6, length, 33);
                break;
            case 2:
                for (String str3 : bVar.f31780d) {
                    Map<String, Integer> map = f31772c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i6, length, 33);
                    } else {
                        Map<String, Integer> map2 = f31773d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i6, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
                break;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < list2.size(); i7++) {
                    qj2 qj2Var = (qj2) list2.get(i7);
                    int a4 = qj2Var.a(str, bVar.f31777a, bVar.f31780d, bVar.f31779c);
                    if (a4 > 0) {
                        arrayList2.add(new c(a4, qj2Var));
                    }
                }
                Collections.sort(arrayList2);
                for (int i8 = 0; i8 < arrayList2.size() && ((c) arrayList2.get(i8)).f31782c.g() == -1; i8++) {
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                arrayList3.addAll(list);
                Collections.sort(arrayList3, a.f31774c);
                int i9 = bVar.f31778b;
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList3.size()) {
                    if ("rt".equals(((a) arrayList3.get(i10)).f31775a.f31777a)) {
                        a aVar = (a) arrayList3.get(i10);
                        b bVar2 = aVar.f31775a;
                        z4 = z5;
                        ArrayList arrayList4 = new ArrayList();
                        int i12 = 0;
                        while (i12 < list2.size()) {
                            qj2 qj2Var2 = (qj2) list2.get(i12);
                            ArrayList arrayList5 = arrayList3;
                            int i13 = i12;
                            int a5 = qj2Var2.a(str, bVar2.f31777a, bVar2.f31780d, bVar2.f31779c);
                            if (a5 > 0) {
                                arrayList4.add(new c(a5, qj2Var2));
                            }
                            i12 = i13 + 1;
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        Collections.sort(arrayList4);
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList4.size()) {
                                qj2 qj2Var3 = ((c) arrayList4.get(i14)).f31782c;
                                if (qj2Var3.g() != -1) {
                                    qj2Var3.g();
                                } else {
                                    i14++;
                                }
                            }
                        }
                        int i15 = aVar.f31775a.f31778b - i11;
                        int i16 = aVar.f31776b - i11;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new ts1(), i9, i15, 33);
                        i11 += subSequence.length();
                        i9 = i15;
                    } else {
                        arrayList = arrayList3;
                        z4 = z5;
                    }
                    i10++;
                    z5 = z4;
                    arrayList3 = arrayList;
                }
                break;
            default:
                return;
        }
        ArrayList arrayList6 = new ArrayList();
        for (int i17 = 0; i17 < list2.size(); i17++) {
            qj2 qj2Var4 = (qj2) list2.get(i17);
            int a6 = qj2Var4.a(str, bVar.f31777a, bVar.f31780d, bVar.f31779c);
            if (a6 > 0) {
                arrayList6.add(new c(a6, qj2Var4));
            }
        }
        Collections.sort(arrayList6);
        for (int i18 = 0; i18 < arrayList6.size(); i18 += i5) {
            qj2 qj2Var5 = ((c) arrayList6.get(i18)).f31782c;
            if (qj2Var5 == null) {
                i5 = 1;
            } else {
                if (qj2Var5.h() != -1) {
                    d12.a(spannableStringBuilder, new StyleSpan(qj2Var5.h()), i6, length);
                }
                if (qj2Var5.k()) {
                    i4 = 33;
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i6, length, 33);
                } else {
                    i4 = 33;
                }
                if (qj2Var5.l()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, i4);
                }
                if (qj2Var5.j()) {
                    d12.a(spannableStringBuilder, new ForegroundColorSpan(qj2Var5.c()), i6, length);
                }
                if (qj2Var5.i()) {
                    d12.a(spannableStringBuilder, new BackgroundColorSpan(qj2Var5.a()), i6, length);
                }
                if (qj2Var5.d() != null) {
                    d12.a(spannableStringBuilder, new TypefaceSpan(qj2Var5.d()), i6, length);
                }
                int f4 = qj2Var5.f();
                if (f4 != 1) {
                    if (f4 == 2) {
                        d12.a(spannableStringBuilder, new RelativeSizeSpan(qj2Var5.e()), i6, length);
                    } else if (f4 == 3) {
                        d12.a(spannableStringBuilder, new RelativeSizeSpan(qj2Var5.e() / 100.0f), i6, length);
                    }
                    i5 = 1;
                } else {
                    i5 = 1;
                    d12.a(spannableStringBuilder, new AbsoluteSizeSpan((int) qj2Var5.e(), true), i6, length);
                }
                if (qj2Var5.b()) {
                    spannableStringBuilder.setSpan(new nf0(), i6, length, 33);
                }
            }
        }
    }

    private static void b(String str, d dVar) {
        String substring;
        int i4 = 2;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
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
                    ms0.d("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i4 = Integer.MIN_VALUE;
                    break;
            }
            dVar.f31789g = i4;
            str = str.substring(0, indexOf);
        }
        if (!str.endsWith("%")) {
            dVar.f31787e = Integer.parseInt(str);
            dVar.f31788f = 1;
            return;
        }
        int i5 = uj2.f33155a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        dVar.f31787e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        dVar.f31788f = 0;
    }

    public static rj2 a(sf1 sf1Var, ArrayList arrayList) {
        String j4 = sf1Var.j();
        if (j4 == null) {
            return null;
        }
        Pattern pattern = f31770a;
        Matcher matcher = pattern.matcher(j4);
        if (matcher.matches()) {
            return a(null, matcher, sf1Var, arrayList);
        }
        String j5 = sf1Var.j();
        if (j5 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(j5);
        if (matcher2.matches()) {
            return a(j4.trim(), matcher2, sf1Var, arrayList);
        }
        return null;
    }

    private static rj2 a(String str, Matcher matcher, sf1 sf1Var, ArrayList arrayList) {
        d dVar = new d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.f31783a = uj2.a(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.f31784b = uj2.a(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            a(group3, dVar);
            StringBuilder sb = new StringBuilder();
            String j4 = sf1Var.j();
            while (!TextUtils.isEmpty(j4)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(j4.trim());
                j4 = sf1Var.j();
            }
            dVar.f31785c = a(str, sb.toString(), arrayList);
            return new rj2(dVar.a().a(), dVar.f31783a, dVar.f31784b);
        } catch (NumberFormatException unused) {
            ms0.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static uu.a a(String str) {
        d dVar = new d();
        a(str, dVar);
        return dVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static SpannedString a(String str, String str2, List<qj2> list) {
        int i4;
        int i5;
        String str3;
        int i6;
        int i7 = 2;
        int i8 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                int i11 = i8;
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i10, indexOf);
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                i6 = 0;
                                break;
                            }
                            i6 = -1;
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                i6 = i11;
                                break;
                            }
                            i6 = -1;
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                i6 = 2;
                                break;
                            }
                            i6 = -1;
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                i6 = 3;
                                break;
                            }
                            i6 = -1;
                            break;
                        default:
                            i6 = -1;
                            break;
                    }
                    switch (i6) {
                        case 0:
                            spannableStringBuilder.append('>');
                            break;
                        case 1:
                            spannableStringBuilder.append('<');
                            break;
                        case 2:
                            spannableStringBuilder.append('&');
                            break;
                        case 3:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            ms0.d("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
                i8 = i11;
                i7 = 2;
                i9 = 0;
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10 += i8;
            } else {
                int i12 = i10 + 1;
                if (i12 >= str2.length()) {
                    i4 = i8;
                } else {
                    int i13 = str2.charAt(i12) == '/' ? i8 : i9;
                    int indexOf3 = str2.indexOf(62, i12);
                    i12 = indexOf3 == -1 ? str2.length() : indexOf3 + i8;
                    int i14 = i12 - 2;
                    i4 = i8;
                    int i15 = str2.charAt(i14) == '/' ? i4 : i9;
                    int i16 = i10 + (i13 != 0 ? i7 : i4);
                    if (i15 == 0) {
                        i14 = i12 - 1;
                    }
                    String substring2 = str2.substring(i16, i14);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        if (!trim.isEmpty()) {
                            int i17 = u82.f32873a;
                            String str4 = trim.split("[ \\.]", i7)[i9];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 98:
                                    if (str4.equals("b")) {
                                        i5 = i9;
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                case 99:
                                    if (str4.equals("c")) {
                                        i5 = i4;
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                case 105:
                                    if (str4.equals("i")) {
                                        i5 = i7;
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                case 117:
                                    if (str4.equals("u")) {
                                        i5 = 3;
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                case 118:
                                    if (str4.equals("v")) {
                                        i5 = 4;
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                case 3650:
                                    if (str4.equals("rt")) {
                                        i5 = 5;
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                case 3314158:
                                    if (str4.equals(com.ironsource.ge.f16487q)) {
                                        i5 = 6;
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                case 3511770:
                                    if (str4.equals("ruby")) {
                                        i5 = 7;
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                default:
                                    i5 = -1;
                                    break;
                            }
                            switch (i5) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (i13 != 0) {
                                        while (!arrayDeque.isEmpty()) {
                                            b bVar = (b) arrayDeque.pop();
                                            a(spannableStringBuilder, bVar, str, arrayList, list);
                                            if (!arrayDeque.isEmpty()) {
                                                arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                            } else {
                                                arrayList.clear();
                                            }
                                            if (bVar.f31777a.equals(str4)) {
                                            }
                                        }
                                    } else if (i15 == 0) {
                                        int length = spannableStringBuilder.length();
                                        String trim2 = substring2.trim();
                                        if (!trim2.isEmpty()) {
                                            int indexOf4 = trim2.indexOf(" ");
                                            if (indexOf4 == -1) {
                                                str3 = "";
                                            } else {
                                                String trim3 = trim2.substring(indexOf4).trim();
                                                trim2 = trim2.substring(i9, indexOf4);
                                                str3 = trim3;
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[i9];
                                            HashSet hashSet = new HashSet();
                                            for (int i18 = i4; i18 < split.length; i18++) {
                                                hashSet.add(split[i18]);
                                            }
                                            arrayDeque.push(new b(str5, length, str3, hashSet));
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                default:
                                    i10 = i12;
                                    i8 = i4;
                                    break;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = i12;
                i8 = i4;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(spannableStringBuilder, (b) arrayDeque.pop(), str, arrayList, list);
        }
        a(spannableStringBuilder, new b("", 0, "", Collections.EMPTY_SET), str, Collections.EMPTY_LIST, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void a(String str, d dVar) {
        int i4;
        int i5;
        String substring;
        int i6;
        Matcher matcher = f31771b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
            } catch (NumberFormatException unused) {
                ms0.d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
            if ("line".equals(group)) {
                b(group2, dVar);
            } else if ("align".equals(group)) {
                switch (group2) {
                    case "center":
                    case "middle":
                        i4 = 2;
                        break;
                    case "end":
                        i4 = 3;
                        break;
                    case "left":
                        i4 = 4;
                        break;
                    case "right":
                        i4 = 5;
                        break;
                    case "start":
                        i4 = 1;
                        break;
                    default:
                        ms0.d("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                        i4 = 2;
                        break;
                }
                dVar.f31786d = i4;
            } else {
                if (b9.h.f15451L.equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != r9) {
                        substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring) {
                            case "line-left":
                            case "start":
                                i6 = 0;
                                break;
                            case "center":
                            case "middle":
                                i6 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i6 = 2;
                                break;
                            default:
                                ms0.d("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i6 = Integer.MIN_VALUE;
                                break;
                        }
                        dVar.f31791i = i6;
                        group2 = group2.substring(0, indexOf);
                    }
                    int i7 = uj2.f33155a;
                    if (group2.endsWith("%")) {
                        dVar.f31790h = Float.parseFloat(group2.substring(0, group2.length() - 1)) / 100.0f;
                    } else {
                        throw new NumberFormatException("Percentages must end with %");
                    }
                } else if ("size".equals(group)) {
                    int i8 = uj2.f33155a;
                    if (group2.endsWith("%")) {
                        dVar.f31792j = Float.parseFloat(group2.substring(0, group2.length() - 1)) / 100.0f;
                    } else {
                        throw new NumberFormatException("Percentages must end with %");
                    }
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i5 = 2;
                    } else if (group2.equals("rl")) {
                        i5 = 1;
                    } else {
                        ms0.d("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i5 = Integer.MIN_VALUE;
                    }
                    dVar.f31793k = i5;
                } else {
                    ms0.d("WebvttCueParser", "Unknown cue setting " + group + StringUtils.PROCESS_POSTFIX_DELIMITER + group2);
                }
            }
        }
    }
}
