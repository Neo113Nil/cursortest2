package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class pj2 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f30469c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f30470d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f30471a = new sf1();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f30472b = new StringBuilder();

    static String b(sf1 sf1Var, StringBuilder sb) {
        b(sf1Var);
        if (sf1Var.a() == 0) {
            return null;
        }
        String a4 = a(sf1Var, sb);
        if (!"".equals(a4)) {
            return a4;
        }
        return "" + ((char) sf1Var.t());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x030d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00ab, code lost:
    
        if (")".equals(b(r6, r7)) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(sf1 sf1Var) {
        String str;
        String sb;
        char c4;
        int i4 = -1;
        int i5 = 0;
        this.f30472b.setLength(0);
        int d4 = sf1Var.d();
        while (!TextUtils.isEmpty(sf1Var.j())) {
        }
        this.f30471a.a(sf1Var.d(), sf1Var.c());
        this.f30471a.e(d4);
        ArrayList arrayList = new ArrayList();
        while (true) {
            sf1 sf1Var2 = this.f30471a;
            StringBuilder sb2 = this.f30472b;
            b(sf1Var2);
            if (sf1Var2.a() >= 5 && "::cue".equals(sf1Var2.a(5, un.f33183c))) {
                int d5 = sf1Var2.d();
                String b4 = b(sf1Var2, sb2);
                if (b4 != null) {
                    if ("{".equals(b4)) {
                        sf1Var2.e(d5);
                        str = "";
                    } else if ("(".equals(b4)) {
                        int d6 = sf1Var2.d();
                        int e4 = sf1Var2.e();
                        int i6 = i5;
                        while (d6 < e4 && i6 == 0) {
                            int i7 = d6 + 1;
                            i6 = ((char) sf1Var2.c()[d6]) == ')' ? 1 : i5;
                            d6 = i7;
                        }
                        str = sf1Var2.a((d6 + i4) - sf1Var2.d(), un.f33183c).trim();
                    } else {
                        str = null;
                    }
                    if (str == null && "{".equals(b(this.f30471a, this.f30472b))) {
                        qj2 qj2Var = new qj2();
                        if (!"".equals(str)) {
                            int indexOf = str.indexOf(91);
                            if (indexOf != i4) {
                                Matcher matcher = f30469c.matcher(str.substring(indexOf));
                                if (matcher.matches()) {
                                    String group = matcher.group(1);
                                    group.getClass();
                                    qj2Var.d(group);
                                }
                                str = str.substring(i5, indexOf);
                            }
                            int i8 = u82.f32873a;
                            String[] split = str.split("\\.", i4);
                            String str2 = split[i5];
                            int indexOf2 = str2.indexOf(35);
                            if (indexOf2 != i4) {
                                qj2Var.c(str2.substring(i5, indexOf2));
                                qj2Var.b(str2.substring(indexOf2 + 1));
                            } else {
                                qj2Var.c(str2);
                            }
                            if (split.length > 1) {
                                qj2Var.a((String[]) u82.a(split, split.length));
                            }
                        }
                        int i9 = i5;
                        String str3 = null;
                        while (i9 == 0) {
                            int d7 = this.f30471a.d();
                            str3 = b(this.f30471a, this.f30472b);
                            int i10 = (str3 == null || "}".equals(str3)) ? 1 : i5;
                            if (i10 == 0) {
                                this.f30471a.e(d7);
                                sf1 sf1Var3 = this.f30471a;
                                StringBuilder sb3 = this.f30472b;
                                b(sf1Var3);
                                String a4 = a(sf1Var3, sb3);
                                if (!"".equals(a4) && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(b(sf1Var3, sb3))) {
                                    b(sf1Var3);
                                    StringBuilder sb4 = new StringBuilder();
                                    int i11 = i5;
                                    while (true) {
                                        if (i11 == 0) {
                                            int d8 = sf1Var3.d();
                                            String b5 = b(sf1Var3, sb3);
                                            if (b5 == null) {
                                                sb = null;
                                            } else if ("}".equals(b5) || ";".equals(b5)) {
                                                sf1Var3.e(d8);
                                                i11 = 1;
                                            } else {
                                                sb4.append(b5);
                                            }
                                        } else {
                                            sb = sb4.toString();
                                        }
                                    }
                                    if (sb != null && !"".equals(sb)) {
                                        int d9 = sf1Var3.d();
                                        String b6 = b(sf1Var3, sb3);
                                        if (!";".equals(b6)) {
                                            if ("}".equals(b6)) {
                                                sf1Var3.e(d9);
                                            }
                                        }
                                        if (b9.h.f15459S.equals(a4)) {
                                            qj2Var.b(fq.a(sb));
                                        } else if ("background-color".equals(a4)) {
                                            qj2Var.a(fq.a(sb));
                                        } else {
                                            if ("ruby-position".equals(a4)) {
                                                if ("over".equals(sb)) {
                                                    qj2Var.d(1);
                                                } else if ("under".equals(sb)) {
                                                    qj2Var.d(2);
                                                }
                                            } else if ("text-combine-upright".equals(a4)) {
                                                qj2Var.a("all".equals(sb) || sb.startsWith("digits"));
                                            } else if ("text-decoration".equals(a4)) {
                                                if ("underline".equals(sb)) {
                                                    qj2Var.o();
                                                }
                                            } else if ("font-family".equals(a4)) {
                                                qj2Var.a(sb);
                                            } else if ("font-weight".equals(a4)) {
                                                if ("bold".equals(sb)) {
                                                    qj2Var.m();
                                                }
                                            } else if ("font-style".equals(a4)) {
                                                if ("italic".equals(sb)) {
                                                    qj2Var.n();
                                                }
                                            } else if ("font-size".equals(a4)) {
                                                Matcher matcher2 = f30470d.matcher(C2207rf.b(sb));
                                                if (matcher2.matches()) {
                                                    String group2 = matcher2.group(2);
                                                    group2.getClass();
                                                    switch (group2.hashCode()) {
                                                        case 37:
                                                            if (group2.equals("%")) {
                                                                c4 = 0;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 3240:
                                                            if (group2.equals("em")) {
                                                                c4 = 1;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 3592:
                                                            if (group2.equals("px")) {
                                                                c4 = 2;
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
                                                            qj2Var.c(3);
                                                            break;
                                                        case 1:
                                                            qj2Var.c(2);
                                                            break;
                                                        case 2:
                                                            qj2Var.c(1);
                                                            break;
                                                        default:
                                                            throw new IllegalStateException();
                                                    }
                                                    String group3 = matcher2.group(1);
                                                    group3.getClass();
                                                    qj2Var.a(Float.parseFloat(group3));
                                                } else {
                                                    ms0.d("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                }
                                            }
                                            i9 = i10;
                                            i5 = 0;
                                        }
                                    }
                                }
                            }
                            i9 = i10;
                            i5 = 0;
                        }
                        if ("}".equals(str3)) {
                            arrayList.add(qj2Var);
                        }
                        i4 = -1;
                        i5 = 0;
                    }
                }
            }
            str = null;
            if (str == null) {
            }
        }
    }

    static void b(sf1 sf1Var) {
        while (true) {
            for (boolean z4 = true; sf1Var.a() > 0 && z4; z4 = false) {
                char c4 = (char) sf1Var.c()[sf1Var.d()];
                if (c4 != '\t' && c4 != '\n' && c4 != '\f' && c4 != '\r' && c4 != ' ') {
                    int d4 = sf1Var.d();
                    int e4 = sf1Var.e();
                    byte[] c5 = sf1Var.c();
                    int i4 = d4 + 2;
                    if (i4 <= e4) {
                        int i5 = d4 + 1;
                        if (c5[d4] == 47 && c5[i5] == 42) {
                            while (true) {
                                int i6 = i4 + 1;
                                if (i6 >= e4) {
                                    break;
                                }
                                if (((char) c5[i4]) == '*' && ((char) c5[i6]) == '/') {
                                    i4 += 2;
                                    e4 = i4;
                                } else {
                                    i4 = i6;
                                }
                            }
                            sf1Var.f(e4 - sf1Var.d());
                        }
                    }
                } else {
                    sf1Var.f(1);
                }
            }
            return;
        }
    }

    private static String a(sf1 sf1Var, StringBuilder sb) {
        boolean z4 = false;
        sb.setLength(0);
        int d4 = sf1Var.d();
        int e4 = sf1Var.e();
        while (d4 < e4 && !z4) {
            char c4 = (char) sf1Var.c()[d4];
            if ((c4 < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                z4 = true;
            } else {
                d4++;
                sb.append(c4);
            }
        }
        sf1Var.f(d4 - sf1Var.d());
        return sb.toString();
    }
}
