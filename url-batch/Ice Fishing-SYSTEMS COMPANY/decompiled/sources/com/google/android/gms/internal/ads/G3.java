package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class G3 implements InterfaceC3774q3 {

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f25094w = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f25095x = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n, reason: collision with root package name */
    public final StringBuilder f25096n = new StringBuilder();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f25097u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final Lr f25098v = new Lr();

    public static long a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * com.anythink.core.common.g.c.f13422b : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.InterfaceC3774q3
    public final void e(byte[] bArr, int i, int i4, X1.b bVar) {
        String str;
        char c4;
        char c9;
        float f6;
        C2522Dj c2522Dj;
        G3 g32 = this;
        Lr lr = g32.f25098v;
        lr.z(i + i4, bArr);
        lr.E(i);
        Charset q6 = lr.q();
        if (q6 == null) {
            q6 = StandardCharsets.UTF_8;
        }
        while (true) {
            String n9 = lr.n(q6);
            if (n9 == null) {
                return;
            }
            if (!n9.isEmpty()) {
                try {
                    Integer.parseInt(n9);
                    String n10 = lr.n(q6);
                    if (n10 == null) {
                        AbstractC3217fl.I("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f25094w.matcher(n10);
                    if (matcher.matches()) {
                        long a9 = a(matcher, 1);
                        long a10 = a(matcher, 6);
                        StringBuilder sb = g32.f25096n;
                        int i9 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = g32.f25097u;
                        arrayList.clear();
                        String n11 = lr.n(q6);
                        while (!TextUtils.isEmpty(n11)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = n11.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = f25095x.matcher(trim);
                            int i10 = i9;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i10;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i10 += length;
                            }
                            sb.append(sb2.toString());
                            n11 = lr.n(q6);
                            i9 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList.size()) {
                                str = (String) arrayList.get(i11);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i11++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        if (str == null) {
                            c2522Dj = new C2522Dj(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0);
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c4 = 0;
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
                            int i12 = (c4 == 0 || c4 == 1 || c4 == 2) ? 0 : (c4 == 3 || c4 == 4 || c4 == 5) ? 2 : 1;
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c9 = 0;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c9 = 1;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c9 = 2;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c9 = 3;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c9 = 4;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c9 = 5;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                default:
                                    c9 = 65535;
                                    break;
                            }
                            int i13 = (c9 == 0 || c9 == 1 || c9 == 2) ? 2 : (c9 == 3 || c9 == 4 || c9 == 5) ? 0 : 1;
                            float f9 = 0.08f;
                            if (i12 == 0) {
                                f6 = 0.08f;
                            } else if (i12 == 1) {
                                f6 = 0.5f;
                            } else {
                                if (i12 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                f6 = 0.92f;
                            }
                            if (i13 != 0) {
                                if (i13 == 1) {
                                    f9 = 0.5f;
                                } else {
                                    if (i13 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f9 = 0.92f;
                                }
                            }
                            c2522Dj = new C2522Dj(fromHtml, null, null, null, f9, 0, i13, f6, i12, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        bVar.mo2b(new C3558m3(UB.j(c2522Dj), a9, a10 - a9));
                    } else {
                        AbstractC3217fl.I("SubripParser", "Skipping invalid timing: ".concat(n10));
                    }
                } catch (NumberFormatException unused) {
                    AbstractC3217fl.I("SubripParser", "Skipping invalid index: ".concat(n9));
                }
            }
            g32 = this;
        }
    }
}
