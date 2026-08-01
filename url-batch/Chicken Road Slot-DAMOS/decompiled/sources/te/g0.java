package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f9378a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f9379b = new h1("kotlin.time.Instant", re.d.f8245o);

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        ee.g gVar = (ee.g) obj;
        gVar.getClass();
        oVar.n(gVar.toString());
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        int i3;
        ee.k f3;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        char charAt;
        char charAt2;
        ee.g gVar = ee.g.f3971i;
        String str = (String) lVar.e();
        if (str.length() == 0) {
            f3 = new c6.s("An empty string is not a valid Instant", str);
        } else {
            char charAt3 = str.charAt(0);
            if (charAt3 == '+' || charAt3 == '-') {
                i3 = 1;
            } else {
                i3 = 0;
                charAt3 = ' ';
            }
            int i14 = 0;
            int i15 = i3;
            while (i15 < str.length() && '0' <= (charAt2 = str.charAt(i15)) && charAt2 < ':') {
                i14 = (i14 * 10) + (str.charAt(i15) - '0');
                i15++;
            }
            int i16 = i15 - i3;
            if (i16 > 10) {
                f3 = ee.i.g(str, "Expected at most 10 digits for the year number, got " + i16 + " digits");
            } else if (i16 == 10 && str.charAt(i3) >= '2') {
                f3 = ee.i.g(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i16 + " digits");
            } else if (i16 < 4) {
                f3 = ee.i.g(str, "The year number must be padded to 4 digits, got " + i16 + " digits");
            } else if (charAt3 == '+' && i16 == 4) {
                f3 = ee.i.g(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 != ' ' || i16 == 4) {
                if (charAt3 == '-') {
                    i14 = -i14;
                }
                int i17 = i15 + 16;
                if (str.length() >= i17) {
                    c6.s f10 = ee.i.f(str, "'-'", i15, new a1.f(16));
                    if (f10 == null) {
                        f3 = ee.i.f(str, "'-'", i15 + 3, new a1.f(17));
                        if (f3 == null && (f3 = ee.i.f(str, "'T' or 't'", i15 + 6, new a1.f(18))) == null && (f3 = ee.i.f(str, "':'", i15 + 9, new a1.f(19))) == null && (f3 = ee.i.f(str, "':'", i15 + 12, new a1.f(20))) == null) {
                            for (int i18 = 0; i18 < 10; i18++) {
                                f10 = ee.i.f(str, "an ASCII digit", ee.i.f3976b[i18] + i15, new a1.f(21));
                                if (f10 == null) {
                                }
                            }
                            int h10 = ee.i.h(i15 + 1, str);
                            int h11 = ee.i.h(i15 + 4, str);
                            int h12 = ee.i.h(i15 + 7, str);
                            int h13 = ee.i.h(i15 + 10, str);
                            int h14 = ee.i.h(i15 + 13, str);
                            int i19 = i15 + 15;
                            if (str.charAt(i19) == '.') {
                                i19 = i17;
                                int i20 = 0;
                                while (i19 < str.length() && '0' <= (charAt = str.charAt(i19)) && charAt < ':') {
                                    i20 = (i20 * 10) + (str.charAt(i19) - '0');
                                    i19++;
                                }
                                int i21 = i19 - i17;
                                if (1 > i21 || i21 >= 10) {
                                    f3 = ee.i.g(str, "1..9 digits are supported for the fraction of the second, got " + i21 + " digits");
                                } else {
                                    i10 = i20 * ee.i.f3975a[9 - i21];
                                }
                            } else {
                                i10 = 0;
                            }
                            if (i19 >= str.length()) {
                                f3 = ee.i.g(str, "The UTC offset at the end of the string is missing");
                            } else {
                                char charAt4 = str.charAt(i19);
                                if (charAt4 == '+' || charAt4 == '-') {
                                    int length = str.length() - i19;
                                    if (length > 9) {
                                        f3 = ee.i.g(str, "The UTC offset string \"" + ee.i.j(16, str.subSequence(i19, str.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        f3 = ee.i.g(str, "Invalid UTC offset string \"" + str.subSequence(i19, str.length()).toString() + '\"');
                                    } else {
                                        int i22 = 0;
                                        for (int i23 = 2; i22 < i23; i23 = 2) {
                                            int i24 = i19 + ee.i.f3977c[i22];
                                            if (i24 >= str.length()) {
                                                break;
                                            }
                                            if (str.charAt(i24) != ':') {
                                                StringBuilder i25 = n0.l.i(i24, "Expected ':' at index ", ", got '");
                                                i25.append(str.charAt(i24));
                                                i25.append('\'');
                                                f3 = ee.i.g(str, i25.toString());
                                                break;
                                            }
                                            i22++;
                                        }
                                        int i26 = 0;
                                        while (i26 < 6 && (i12 = ee.i.f3978d[i26] + i19) < str.length()) {
                                            char charAt5 = str.charAt(i12);
                                            int i27 = i26;
                                            if ('0' > charAt5 || charAt5 >= ':') {
                                                StringBuilder i28 = n0.l.i(i12, "Expected an ASCII digit at index ", ", got '");
                                                i28.append(str.charAt(i12));
                                                i28.append('\'');
                                                f3 = ee.i.g(str, i28.toString());
                                                break;
                                            }
                                            i26 = i27 + 1;
                                        }
                                        int h15 = ee.i.h(i19 + 1, str);
                                        int h16 = length > 3 ? ee.i.h(i19 + 4, str) : 0;
                                        int h17 = length > 6 ? ee.i.h(i19 + 7, str) : 0;
                                        if (h16 > 59) {
                                            f3 = ee.i.g(str, "Expected offset-minute-of-hour in 0..59, got " + h16);
                                        } else if (h17 > 59) {
                                            f3 = ee.i.g(str, "Expected offset-second-of-minute in 0..59, got " + h17);
                                        } else if (h15 <= 17 || (h15 == 18 && h16 == 0 && h17 == 0)) {
                                            i11 = ((h16 * 60) + (h15 * 3600) + h17) * (charAt4 == '-' ? -1 : 1);
                                            if (1 <= h10 || h10 >= 13) {
                                                f3 = ee.i.g(str, "Expected a month number in 1..12, got " + h10);
                                            } else {
                                                if (1 <= h11) {
                                                    int i29 = i14 & 3;
                                                    if (h11 <= (h10 != 2 ? (h10 == 4 || h10 == 6 || h10 == 9 || h10 == 11) ? 30 : 31 : i29 == 0 && (i14 % 100 != 0 || i14 % 400 == 0) ? 29 : 28)) {
                                                        if (h12 > 23) {
                                                            f3 = ee.i.g(str, "Expected hour in 0..23, got " + h12);
                                                        } else if (h13 > 59) {
                                                            f3 = ee.i.g(str, "Expected minute-of-hour in 0..59, got " + h13);
                                                        } else if (h14 > 59) {
                                                            f3 = ee.i.g(str, "Expected second-of-minute in 0..59, got " + h14);
                                                        } else {
                                                            long j3 = i14;
                                                            long j10 = 365 * j3;
                                                            if (j3 >= 0) {
                                                                i13 = i11;
                                                                j = ((j3 + 399) / 400) + (((3 + j3) / 4) - ((99 + j3) / 100)) + j10;
                                                            } else {
                                                                i13 = i11;
                                                                j = j10 - ((j3 / (-400)) + ((j3 / (-4)) - (j3 / (-100))));
                                                            }
                                                            long j11 = j + (((h10 * 367) - 362) / 12) + (h11 - 1);
                                                            if (h10 > 2) {
                                                                j11 = (i29 != 0 || (i14 % 100 == 0 && i14 % 400 != 0)) ? j11 - 2 : (-1) + j11;
                                                            }
                                                            f3 = new ee.j(i10, (((j11 - 719528) * 86400) + (((h13 * 60) + (h12 * 3600)) + h14)) - i13);
                                                        }
                                                    }
                                                }
                                                f3 = ee.i.g(str, "Expected a valid day-of-month for month " + h10 + " of year " + i14 + ", got " + h11);
                                            }
                                        } else {
                                            f3 = ee.i.g(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i19, str.length()).toString());
                                        }
                                    }
                                } else if (charAt4 == 'Z' || charAt4 == 'z') {
                                    int i30 = i19 + 1;
                                    if (str.length() == i30) {
                                        i11 = 0;
                                        if (1 <= h10) {
                                        }
                                        f3 = ee.i.g(str, "Expected a month number in 1..12, got " + h10);
                                    } else {
                                        f3 = ee.i.g(str, "Extra text after the instant at position " + i30);
                                    }
                                } else {
                                    f3 = ee.i.g(str, "Expected the UTC offset at position " + i19 + ", got '" + charAt4 + '\'');
                                }
                            }
                        }
                    }
                    f3 = f10;
                    break;
                } else {
                    f3 = ee.i.g(str, "The input string is too short");
                }
            } else {
                f3 = ee.i.g(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return f3.toInstant();
    }

    @Override // pe.a
    public final re.e d() {
        return f9379b;
    }
}
