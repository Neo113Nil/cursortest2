package com.yandex.mobile.ads.impl;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.uu;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class a32 extends jy1 {

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f23141o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f23142p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    private final StringBuilder f23143m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<String> f23144n = new ArrayList<>();

    private static long a(Matcher matcher, int i4) {
        String group = matcher.group(i4 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i4 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i4 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i4 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    @Override // com.yandex.mobile.ads.impl.jy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final c32 a(byte[] bArr, int i4, boolean z4) {
        String j4;
        String str;
        os0 os0Var;
        char c4;
        sf1 sf1Var;
        char c5;
        int i5;
        int c6;
        float f4;
        int b4;
        uu a4;
        a32 a32Var = this;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        os0 os0Var2 = new os0(0);
        sf1 sf1Var2 = new sf1(i4, bArr);
        while (true) {
            String j5 = sf1Var2.j();
            if (j5 != null) {
                if (j5.length() != 0) {
                    try {
                        Integer.parseInt(j5);
                        j4 = sf1Var2.j();
                    } catch (NumberFormatException unused) {
                        ms0.d("SubripDecoder", "Skipping invalid index: ".concat(j5));
                    }
                    if (j4 == null) {
                        ms0.d("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f23141o.matcher(j4);
                        if (!matcher.matches()) {
                            ms0.d("SubripDecoder", "Skipping invalid timing: ".concat(j4));
                            a32Var = this;
                            i6 = 0;
                        } else {
                            os0Var2.a(a(matcher, 1));
                            os0Var2.a(a(matcher, 6));
                            a32Var.f23143m.setLength(i6);
                            a32Var.f23144n.clear();
                            for (String j6 = sf1Var2.j(); !TextUtils.isEmpty(j6); j6 = sf1Var2.j()) {
                                if (a32Var.f23143m.length() > 0) {
                                    a32Var.f23143m.append("<br>");
                                }
                                StringBuilder sb = a32Var.f23143m;
                                ArrayList<String> arrayList2 = a32Var.f23144n;
                                String trim = j6.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = f23142p.matcher(trim);
                                int i7 = i6;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i7;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i7 += length;
                                }
                                sb.append(sb2.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(a32Var.f23143m.toString());
                            int i8 = i6;
                            while (true) {
                                if (i8 < a32Var.f23144n.size()) {
                                    str = a32Var.f23144n.get(i8);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i8++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            uu.a a5 = new uu.a().a(fromHtml);
                            if (str == null) {
                                a4 = a5.a();
                                os0Var = os0Var2;
                                sf1Var = sf1Var2;
                            } else {
                                os0Var = os0Var2;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c4 = 0;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c4 = 6;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c4 = 3;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c4 = 1;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c4 = 7;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c4 = 4;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c4 = 2;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c4 = '\b';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c4 = 5;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    default:
                                        c4 = 65535;
                                        break;
                                }
                                sf1Var = sf1Var2;
                                if (c4 == 0 || c4 == 1 || c4 == 2) {
                                    a5.b(0);
                                } else if (c4 != 3 && c4 != 4 && c4 != 5) {
                                    a5.b(1);
                                } else {
                                    a5.b(2);
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c5 = 0;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c5 = 1;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c5 = 2;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c5 = 6;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c5 = 7;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c5 = '\b';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c5 = 3;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c5 = 4;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c5 = 5;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    default:
                                        c5 = 65535;
                                        break;
                                }
                                if (c5 == 0 || c5 == 1) {
                                    i5 = 2;
                                } else {
                                    i5 = 2;
                                    if (c5 != 2) {
                                        if (c5 != 3 && c5 != 4 && c5 != 5) {
                                            a5.a(1);
                                        } else {
                                            a5.a(0);
                                        }
                                        i5 = 2;
                                        c6 = a5.c();
                                        float f5 = 0.5f;
                                        if (c6 != 0) {
                                            f4 = 0.08f;
                                        } else if (c6 == 1) {
                                            f4 = 0.5f;
                                        } else {
                                            if (c6 != i5) {
                                                throw new IllegalArgumentException();
                                            }
                                            f4 = 0.92f;
                                        }
                                        uu.a b5 = a5.b(f4);
                                        b4 = a5.b();
                                        if (b4 != 0) {
                                            f5 = 0.08f;
                                        } else if (b4 != 1) {
                                            if (b4 != 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f5 = 0.92f;
                                        }
                                        a4 = b5.a(0, f5).a();
                                    }
                                }
                                a5.a(i5);
                                c6 = a5.c();
                                float f52 = 0.5f;
                                if (c6 != 0) {
                                }
                                uu.a b52 = a5.b(f4);
                                b4 = a5.b();
                                if (b4 != 0) {
                                }
                                a4 = b52.a(0, f52).a();
                            }
                            arrayList.add(a4);
                            arrayList.add(uu.f33246s);
                            a32Var = this;
                            os0Var2 = os0Var;
                            sf1Var2 = sf1Var;
                            i6 = 0;
                        }
                    }
                }
            }
        }
        return new b32((uu[]) arrayList.toArray(new uu[i6]), os0Var2.b());
    }
}
