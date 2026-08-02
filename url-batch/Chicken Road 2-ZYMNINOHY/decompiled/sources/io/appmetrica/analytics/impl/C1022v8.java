package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import d2.C0389g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import t3.C1443c;
import w3.AbstractC1510g;
import w3.C1505b;
import w3.C1506c;
import w3.C1508e;
import w3.C1509f;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022v8 implements InterfaceC0731k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12871a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final int f12872b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f12873c = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f12874d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final int f12875e = 63;

    /* renamed from: f, reason: collision with root package name */
    public final int f12876f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f12877g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final int f12878h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final int f12879i = 64;

    /* renamed from: j, reason: collision with root package name */
    public final C1509f f12880j = new C1509f("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");

    /* renamed from: k, reason: collision with root package name */
    public final C1509f f12881k = new C1509f("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");

    /* renamed from: l, reason: collision with root package name */
    public final List f12882l = d3.j.W("ru", "by", "kz", "az", "kg", "lv", "md", "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");

    /* renamed from: m, reason: collision with root package name */
    public final String f12883m = "yandex.ru";
    public final String n = "gmail.com";
    public final String o = "googlemail.com";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0731k2
    public final String a(String str) {
        ?? n02;
        String input = AbstractC1510g.r0(str).toString();
        Pattern compile = Pattern.compile("^\\++");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        kotlin.jvm.internal.i.e(input, "input");
        String replaceAll = compile.matcher(input).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        String lowerCase = replaceAll.toLowerCase(Locale.ROOT);
        int k02 = AbstractC1510g.k0(lowerCase, '@', 0, 6);
        if (k02 != -1) {
            String substring = lowerCase.substring(0, k02);
            String substring2 = lowerCase.substring(k02 + 1);
            int length = substring.length();
            if (length >= this.f12878h && length <= this.f12879i) {
                List o02 = AbstractC1510g.o0(substring, new char[]{'.'});
                if (!o02.isEmpty()) {
                    Iterator it = o02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        int length2 = str2.length();
                        if (length2 < this.f12878h) {
                            break;
                        }
                        Character d02 = AbstractC1510g.d0(str2);
                        if (d02 != null && d02.charValue() == '\"') {
                            Character valueOf = str2.length() == 0 ? null : Character.valueOf(str2.charAt(str2.length() - 1));
                            if (valueOf != null && valueOf.charValue() == '\"' && length2 > 2) {
                                int i4 = 1;
                                while (true) {
                                    int i5 = i4 + 2;
                                    if (i5 >= str2.length()) {
                                        break;
                                    }
                                    char charAt = str2.charAt(i4);
                                    if (charAt < ' ' || charAt == '\"' || charAt > '~') {
                                        break;
                                    }
                                    if (charAt == '\\') {
                                        if (i5 == str2.length()) {
                                            break;
                                        }
                                        i4++;
                                        if (str2.charAt(i4) < ' ') {
                                            break;
                                        }
                                    }
                                    i4++;
                                }
                            }
                        }
                        C1509f c1509f = this.f12880j;
                        c1509f.getClass();
                        if (!c1509f.f15950a.matcher(str2).matches()) {
                            break;
                        }
                    }
                }
                if (substring2.length() <= this.f12873c) {
                    String[] strArr = {"."};
                    String str3 = strArr[0];
                    if (str3.length() == 0) {
                        v3.m mVar = new v3.m(new C1506c(substring2, new w3.p(1, d3.g.N(strArr))));
                        n02 = new ArrayList(d3.k.Y(mVar));
                        Iterator it2 = mVar.iterator();
                        while (true) {
                            C1505b c1505b = (C1505b) it2;
                            if (!c1505b.hasNext()) {
                                break;
                            }
                            C1443c range = (C1443c) c1505b.next();
                            kotlin.jvm.internal.i.e(range, "range");
                            n02.add(substring2.subSequence(range.f15424a, range.f15425b + 1).toString());
                        }
                    } else {
                        n02 = AbstractC1510g.n0(substring2, str3);
                    }
                    if (n02.size() >= this.f12874d) {
                        List c02 = d3.i.c0(n02);
                        if (!c02.isEmpty()) {
                            Iterator it3 = c02.iterator();
                            while (it3.hasNext()) {
                                if (!b((String) it3.next())) {
                                    break;
                                }
                            }
                        }
                        String str4 = (String) d3.i.h0(n02);
                        if (str4.length() >= this.f12877g && b(str4)) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= str4.length()) {
                                    break;
                                }
                                if (!Character.isDigit(str4.charAt(i6))) {
                                    String Y2 = w3.o.Y(substring2, this.o, this.n);
                                    C1509f c1509f2 = this.f12881k;
                                    c1509f2.getClass();
                                    Matcher matcher = c1509f2.f15950a.matcher(Y2);
                                    kotlin.jvm.internal.i.d(matcher, "matcher(...)");
                                    C0389g c0389g = !matcher.find(0) ? null : new C0389g(matcher, Y2);
                                    if (c0389g != null) {
                                        if (((C1508e) c0389g.f8265c) == null) {
                                            c0389g.f8265c = new C1508e(c0389g);
                                        }
                                        C1508e c1508e = (C1508e) c0389g.f8265c;
                                        kotlin.jvm.internal.i.b(c1508e);
                                        String str5 = (String) c1508e.get(1);
                                        String str6 = (String) c1508e.get(2);
                                        if (str6.length() <= 0 ? str5.length() > 0 : this.f12882l.contains(str6)) {
                                            Y2 = this.f12883m;
                                        }
                                    }
                                    if (kotlin.jvm.internal.i.a(Y2, this.f12883m)) {
                                        substring = w3.o.Y(substring, ".", TokenBuilder.TOKEN_DELIMITER);
                                    } else if (kotlin.jvm.internal.i.a(Y2, this.n)) {
                                        substring = w3.o.Y(substring, ".", "");
                                    }
                                    int length3 = substring.length();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < length3) {
                                            if (substring.charAt(i7) == '+') {
                                                substring = substring.substring(0, i7);
                                                break;
                                            }
                                            i7++;
                                        } else {
                                            break;
                                        }
                                    }
                                    String str7 = substring + '@' + Y2;
                                    if (str7.length() < this.f12871a || str7.length() > this.f12872b) {
                                        break;
                                    }
                                    return str7;
                                }
                                i6++;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean b(String str) {
        if (str.length() <= this.f12875e && str.length() >= this.f12876f) {
            if (str.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (Character.isLetterOrDigit(str.charAt(0))) {
                if (str.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                if (Character.isLetterOrDigit(str.charAt(AbstractC1510g.e0(str)))) {
                    for (int i4 = 0; i4 < str.length(); i4++) {
                        char charAt = str.charAt(i4);
                        if (Character.isLetterOrDigit(charAt) || charAt == '-') {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
