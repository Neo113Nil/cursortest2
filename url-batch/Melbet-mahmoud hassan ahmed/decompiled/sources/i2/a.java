package i2;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c2.b;
import c2.g;
import c2.h;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.a0;
import o2.r;
import o2.s;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f17018q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f17019r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o, reason: collision with root package name */
    private final StringBuilder f17020o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<String> f17021p;

    public a() {
        super("SubripDecoder");
        this.f17020o = new StringBuilder();
        this.f17021p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private c2.b C(Spanned spanned, String str) {
        char c7;
        char c8;
        b.C0043b o7 = new b.C0043b().o(spanned);
        if (str == null) {
            return o7.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        if (c7 == 0 || c7 == 1 || c7 == 2) {
            o7.l(0);
        } else if (c7 == 3 || c7 == 4 || c7 == 5) {
            o7.l(2);
        } else {
            o7.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        if (c8 == 0 || c8 == 1 || c8 == 2) {
            o7.i(2);
        } else if (c8 == 3 || c8 == 4 || c8 == 5) {
            o7.i(0);
        } else {
            o7.i(1);
        }
        return o7.k(D(o7.d())).h(D(o7.c()), 0).a();
    }

    static float D(int i7) {
        if (i7 == 0) {
            return 0.08f;
        }
        if (i7 == 1) {
            return 0.5f;
        }
        if (i7 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long E(Matcher matcher, int i7) {
        String group = matcher.group(i7 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) o2.a.e(matcher.group(i7 + 2))) * 60 * 1000) + (Long.parseLong((String) o2.a.e(matcher.group(i7 + 3))) * 1000);
        String group2 = matcher.group(i7 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f17019r.matcher(trim);
        int i7 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i7;
            int length = group.length();
            sb.replace(start, start + length, "");
            i7 += length;
        }
        return sb.toString();
    }

    @Override // c2.g
    protected h A(byte[] bArr, int i7, boolean z6) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        s sVar = new s();
        a0 a0Var = new a0(bArr, i7);
        while (true) {
            String o7 = a0Var.o();
            int i8 = 0;
            if (o7 == null) {
                break;
            }
            if (o7.length() != 0) {
                try {
                    Integer.parseInt(o7);
                    o7 = a0Var.o();
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (o7 == null) {
                    r.i("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f17018q.matcher(o7);
                if (matcher.matches()) {
                    sVar.a(E(matcher, 1));
                    sVar.a(E(matcher, 6));
                    this.f17020o.setLength(0);
                    this.f17021p.clear();
                    while (true) {
                        String o8 = a0Var.o();
                        if (TextUtils.isEmpty(o8)) {
                            break;
                        }
                        if (this.f17020o.length() > 0) {
                            this.f17020o.append("<br>");
                        }
                        this.f17020o.append(F(o8, this.f17021p));
                    }
                    Spanned fromHtml = Html.fromHtml(this.f17020o.toString());
                    String str2 = null;
                    while (true) {
                        if (i8 >= this.f17021p.size()) {
                            break;
                        }
                        String str3 = this.f17021p.get(i8);
                        if (str3.matches("\\{\\\\an[1-9]\\}")) {
                            str2 = str3;
                            break;
                        }
                        i8++;
                    }
                    arrayList.add(C(fromHtml, str2));
                    arrayList.add(c2.b.f1822w);
                } else {
                    sb = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb.append(str);
                    sb.append(o7);
                    r.i("SubripDecoder", sb.toString());
                }
            }
        }
        return new b((c2.b[]) arrayList.toArray(new c2.b[0]), sVar.d());
    }
}
