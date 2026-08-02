package a1;

import V.b;
import V0.k;
import V0.l;
import W.AbstractC0108a;
import W.InterfaceC0113f;
import W.u;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v2.I;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f4256d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f4257e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f4258a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4259b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final u f4260c = new u();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static b d(Spanned spanned, String str) {
        char c4;
        char c5;
        float f4;
        float f5;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        }
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
        int i4 = (c4 == 0 || c4 == 1 || c4 == 2) ? 0 : (c4 == 3 || c4 == 4 || c4 == 5) ? 2 : 1;
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
        int i5 = (c5 == 0 || c5 == 1 || c5 == 2) ? 2 : (c5 == 3 || c5 == 4 || c5 == 5) ? 0 : 1;
        if (i4 == 0) {
            f4 = 0.08f;
        } else if (i4 == 1) {
            f4 = 0.5f;
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException();
            }
            f4 = 0.92f;
        }
        if (i5 == 0) {
            f5 = 0.08f;
        } else if (i5 == 1) {
            f5 = 0.5f;
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException();
            }
            f5 = 0.92f;
        }
        return new b(spanned, null, null, null, f5, 0, i5, f4, i4, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public static long e(Matcher matcher, int i4) {
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

    @Override // V0.l
    public final void b(byte[] bArr, int i4, int i5, k kVar, InterfaceC0113f interfaceC0113f) {
        String n;
        String str;
        C0160a c0160a = this;
        long j4 = kVar.f3208a;
        u uVar = c0160a.f4260c;
        uVar.K(i4 + i5, bArr);
        uVar.M(i4);
        Charset I4 = uVar.I();
        if (I4 == null) {
            I4 = StandardCharsets.UTF_8;
        }
        long j5 = -9223372036854775807L;
        ArrayList arrayList = (j4 == -9223372036854775807L || !kVar.f3209b) ? null : new ArrayList();
        while (true) {
            String n4 = uVar.n(I4);
            if (n4 == null) {
                break;
            }
            if (!n4.isEmpty()) {
                try {
                    Integer.parseInt(n4);
                    n = uVar.n(I4);
                } catch (NumberFormatException unused) {
                    AbstractC0108a.s("SubripParser", "Skipping invalid index: ".concat(n4));
                }
                if (n == null) {
                    AbstractC0108a.s("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f4256d.matcher(n);
                if (matcher.matches()) {
                    long e4 = e(matcher, 1);
                    long e5 = e(matcher, 6);
                    StringBuilder sb = c0160a.f4258a;
                    sb.setLength(0);
                    long j6 = j5;
                    ArrayList arrayList2 = c0160a.f4259b;
                    arrayList2.clear();
                    for (String n5 = uVar.n(I4); !TextUtils.isEmpty(n5); n5 = uVar.n(I4)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = n5.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = f4257e.matcher(trim);
                        int i6 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i6;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i6 += length;
                            j4 = j4;
                        }
                        sb.append(sb2.toString());
                    }
                    long j7 = j4;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i7);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (j7 == j6 || e5 >= j7) {
                        interfaceC0113f.accept(new V0.a(e4, e5 - e4, I.o(d(fromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new V0.a(e4, e5 - e4, I.o(d(fromHtml, str))));
                    }
                    c0160a = this;
                    j5 = j6;
                    j4 = j7;
                } else {
                    AbstractC0108a.s("SubripParser", "Skipping invalid timing: ".concat(n));
                    c0160a = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                interfaceC0113f.accept((V0.a) obj);
            }
        }
    }

    @Override // V0.l
    public final int c() {
        return 1;
    }
}
