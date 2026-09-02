package m0;

import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: m0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1284F {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14327a = Pattern.compile("([a-z])=\\s?((?:.|\f)++)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f14328b = Pattern.compile("^([a-z])=$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14329c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::((?:.|\f)*+))?");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14330d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        throw T.G.b("Malformed SDP line: ".concat(r10), null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1283E a(String str) {
        char c4;
        char c5;
        C1282D c1282d = new C1282D();
        String str2 = z.f14484h;
        if (!str.contains(str2)) {
            str2 = z.f14483g;
        }
        String str3 = J.f3263a;
        char c6 = 65535;
        String[] split = str.split(str2, -1);
        int length = split.length;
        K3.f fVar = null;
        int i4 = 0;
        boolean z = false;
        while (true) {
            v2.F f4 = c1282d.f14304b;
            if (i4 >= length) {
                if (fVar != null) {
                    try {
                        f4.b(fVar.a());
                    } catch (IllegalArgumentException | IllegalStateException e4) {
                        throw T.G.b(null, e4);
                    }
                }
                try {
                    return new C1283E(c1282d);
                } catch (IllegalArgumentException | IllegalStateException e5) {
                    throw T.G.b(null, e5);
                }
            }
            String trim = split[i4].trim();
            if (!trim.isEmpty()) {
                Matcher matcher = f14327a.matcher(trim);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    group.getClass();
                    String group2 = matcher.group(2);
                    group2.getClass();
                    switch (group.hashCode()) {
                        case 97:
                            if (group.equals("a")) {
                                c4 = 11;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 98:
                            if (group.equals("b")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 99:
                            if (group.equals("c")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND /* 100 */:
                        case 102:
                        case 103:
                        case 104:
                        case 106:
                        case 108:
                        case 110:
                        case 113:
                        case 119:
                        case 120:
                        case 121:
                        default:
                            c4 = 65535;
                            break;
                        case 101:
                            if (group.equals("e")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 105:
                            if (group.equals("i")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 107:
                            if (group.equals("k")) {
                                c4 = '\n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 109:
                            if (group.equals("m")) {
                                c4 = '\f';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 111:
                            if (group.equals("o")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 112:
                            if (group.equals("p")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 114:
                            if (group.equals("r")) {
                                c4 = '\r';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 115:
                            if (group.equals("s")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case BuildConfig.API_LEVEL /* 116 */:
                            if (group.equals("t")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 117:
                            if (group.equals("u")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 118:
                            if (group.equals("v")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 122:
                            if (group.equals("z")) {
                                c4 = 14;
                                break;
                            }
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            c5 = 65535;
                            if (!CommonUrlParts.Values.FALSE_INTEGER.equals(group2)) {
                                throw T.G.b("SDP version " + group2 + " is not supported.", null);
                            }
                            continue;
                            i4++;
                            c6 = c5;
                        case 1:
                            c5 = 65535;
                            c1282d.f14307e = group2;
                            continue;
                            i4++;
                            c6 = c5;
                        case 2:
                            c5 = 65535;
                            c1282d.f14306d = group2;
                            continue;
                            i4++;
                            c6 = c5;
                        case 3:
                            c5 = 65535;
                            if (!z) {
                                if (fVar == null) {
                                    c1282d.f14312j = group2;
                                    continue;
                                } else {
                                    fVar.f1556g = group2;
                                }
                            }
                            i4++;
                            c6 = c5;
                        case 4:
                            c5 = 65535;
                            c1282d.f14309g = Uri.parse(group2);
                            continue;
                            i4++;
                            c6 = c5;
                        case 5:
                            c5 = 65535;
                            c1282d.f14313k = group2;
                            continue;
                            i4++;
                            c6 = c5;
                        case 6:
                            c5 = 65535;
                            c1282d.f14314l = group2;
                            continue;
                            i4++;
                            c6 = c5;
                        case 7:
                            c5 = 65535;
                            if (!z) {
                                if (fVar == null) {
                                    c1282d.f14310h = group2;
                                    continue;
                                } else {
                                    fVar.f1557h = group2;
                                }
                            }
                            i4++;
                            c6 = c5;
                        case '\b':
                            if (!z) {
                                c5 = 65535;
                                String[] split2 = group2.split(":\\s?", -1);
                                AbstractC0124a.h(split2.length == 2);
                                int parseInt = Integer.parseInt(split2[1]);
                                if (fVar == null) {
                                    c1282d.f14305c = parseInt * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                                    continue;
                                } else {
                                    fVar.f1552c = parseInt * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                                }
                                i4++;
                                c6 = c5;
                            }
                            break;
                        case '\t':
                            c1282d.f14308f = group2;
                            break;
                        case '\n':
                            if (!z) {
                                if (fVar != null) {
                                    fVar.f1558i = group2;
                                    break;
                                } else {
                                    c1282d.f14311i = group2;
                                    break;
                                }
                            }
                            break;
                        case 11:
                            if (!z) {
                                Matcher matcher2 = f14329c.matcher(group2);
                                if (!matcher2.matches()) {
                                    throw T.G.b("Malformed Attribute line: ".concat(trim), null);
                                }
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                String group4 = matcher2.group(2);
                                if (group4 == null) {
                                    group4 = "";
                                }
                                if (fVar != null) {
                                    ((HashMap) fVar.f1555f).put(group3, group4);
                                    break;
                                } else {
                                    c1282d.f14303a.put(group3, group4);
                                    break;
                                }
                            }
                            break;
                        case '\f':
                            if (fVar != null) {
                                try {
                                    f4.b(fVar.a());
                                } catch (IllegalArgumentException | IllegalStateException e6) {
                                    throw T.G.b(null, e6);
                                }
                            }
                            Matcher matcher3 = f14330d.matcher(group2);
                            if (!matcher3.matches()) {
                                throw T.G.b("Malformed SDP media description line: ".concat(group2), null);
                            }
                            String group5 = matcher3.group(1);
                            group5.getClass();
                            String group6 = matcher3.group(2);
                            group6.getClass();
                            String group7 = matcher3.group(3);
                            group7.getClass();
                            String group8 = matcher3.group(4);
                            group8.getClass();
                            try {
                                fVar = new K3.f(Integer.parseInt(group6), Integer.parseInt(group8), group5, group7);
                            } catch (NumberFormatException e7) {
                                AbstractC0108a.t("SDPParser", "Malformed SDP media description line: ".concat(group2), e7);
                                fVar = null;
                            }
                            if (fVar != null) {
                                z = false;
                                break;
                            } else {
                                z = true;
                                break;
                            }
                    }
                    c5 = 65535;
                    i4++;
                    c6 = c5;
                } else {
                    Matcher matcher4 = f14328b.matcher(trim);
                    if (!matcher4.matches() || !Objects.equals(matcher4.group(1), "i")) {
                    }
                }
            }
            c5 = c6;
            i4++;
            c6 = c5;
        }
    }
}
