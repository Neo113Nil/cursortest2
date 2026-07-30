package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lq0 implements KSerializer {
    public static final lq0 PxuCJdSBwIXG = new lq0();
    public static final dq1 lS5Rgt96tfkO = new dq1("kotlin.time.Instant", cq1.cpQdD2nAriOS);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i;
        kq0 rxipThha848g;
        int i2;
        int i3;
        int i4;
        char charAt;
        char charAt2;
        fq0 fq0Var = gq0.Companion;
        String e6tOsSdd2EFb = decoder.e6tOsSdd2EFb();
        fq0Var.getClass();
        e6tOsSdd2EFb.getClass();
        int i5 = 17;
        if (e6tOsSdd2EFb.length() == 0) {
            rxipThha848g = new op0(i5, "An empty string is not a valid Instant", e6tOsSdd2EFb);
        } else {
            char charAt3 = e6tOsSdd2EFb.charAt(0);
            if (charAt3 == '+' || charAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                charAt3 = ' ';
            }
            int i6 = 0;
            int i7 = i;
            while (i7 < e6tOsSdd2EFb.length() && '0' <= (charAt2 = e6tOsSdd2EFb.charAt(i7)) && charAt2 < ':') {
                i6 = (i6 * 10) + (e6tOsSdd2EFb.charAt(i7) - '0');
                i7++;
            }
            int i8 = i7 - i;
            if (i8 > 10) {
                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected at most 10 digits for the year number, got " + i8 + " digits");
            } else if (i8 == 10 && cs0.gPXPFXrUH4XX(e6tOsSdd2EFb.charAt(i), 50) >= 0) {
                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected at most 9 digits for the year number or year 1000000000, got " + i8 + " digits");
            } else if (i8 < 4) {
                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "The year number must be padded to 4 digits, got " + i8 + " digits");
            } else if (charAt3 == '+' && i8 == 4) {
                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 != ' ' || i8 == 4) {
                if (charAt3 == '-') {
                    i6 = -i6;
                }
                int i9 = i7 + 16;
                if (e6tOsSdd2EFb.length() < i9) {
                    rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "The input string is too short");
                } else {
                    op0 rxipThha848g2 = fx1.rxipThha848g(e6tOsSdd2EFb, "'-'", i7, new wnqUPcAvl7HT(18));
                    if (rxipThha848g2 != null) {
                        rxipThha848g = rxipThha848g2;
                    } else {
                        rxipThha848g = fx1.rxipThha848g(e6tOsSdd2EFb, "'-'", i7 + 3, new wnqUPcAvl7HT(19));
                        if (rxipThha848g == null && (rxipThha848g = fx1.rxipThha848g(e6tOsSdd2EFb, "'T' or 't'", i7 + 6, new wnqUPcAvl7HT(20))) == null && (rxipThha848g = fx1.rxipThha848g(e6tOsSdd2EFb, "':'", i7 + 9, new wnqUPcAvl7HT(21))) == null && (rxipThha848g = fx1.rxipThha848g(e6tOsSdd2EFb, "':'", i7 + 12, new wnqUPcAvl7HT(22))) == null) {
                            int[] iArr = fx1.TSizfFm2Yiuu;
                            int i10 = 0;
                            while (true) {
                                if (i10 < 10) {
                                    op0 rxipThha848g3 = fx1.rxipThha848g(e6tOsSdd2EFb, "an ASCII digit", iArr[i10] + i7, new wnqUPcAvl7HT(23));
                                    if (rxipThha848g3 != null) {
                                        rxipThha848g = rxipThha848g3;
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int uVlwi32qvXeJ = fx1.uVlwi32qvXeJ(e6tOsSdd2EFb, i7 + 1);
                                    int uVlwi32qvXeJ2 = fx1.uVlwi32qvXeJ(e6tOsSdd2EFb, i7 + 4);
                                    int uVlwi32qvXeJ3 = fx1.uVlwi32qvXeJ(e6tOsSdd2EFb, i7 + 7);
                                    int uVlwi32qvXeJ4 = fx1.uVlwi32qvXeJ(e6tOsSdd2EFb, i7 + 10);
                                    int uVlwi32qvXeJ5 = fx1.uVlwi32qvXeJ(e6tOsSdd2EFb, i7 + 13);
                                    int i11 = i7 + 15;
                                    if (e6tOsSdd2EFb.charAt(i11) == '.') {
                                        i11 = i9;
                                        int i12 = 0;
                                        while (i11 < e6tOsSdd2EFb.length() && '0' <= (charAt = e6tOsSdd2EFb.charAt(i11)) && charAt < ':') {
                                            i12 = (i12 * 10) + (e6tOsSdd2EFb.charAt(i11) - '0');
                                            i11++;
                                        }
                                        int i13 = i11 - i9;
                                        if (1 > i13 || i13 >= 10) {
                                            rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "1..9 digits are supported for the fraction of the second, got " + i13 + " digits");
                                        } else {
                                            i2 = i12 * fx1.lS5Rgt96tfkO[9 - i13];
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i11 >= e6tOsSdd2EFb.length()) {
                                        rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "The UTC offset at the end of the string is missing");
                                    } else {
                                        char charAt4 = e6tOsSdd2EFb.charAt(i11);
                                        if (charAt4 == '+' || charAt4 == '-') {
                                            int length = e6tOsSdd2EFb.length() - i11;
                                            if (length > 9) {
                                                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "The UTC offset string \"" + fx1.HqMwxkFaipxD(e6tOsSdd2EFb.subSequence(i11, e6tOsSdd2EFb.length()).toString(), 16) + "\" is too long");
                                            } else if (length % 3 != 0) {
                                                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Invalid UTC offset string \"" + e6tOsSdd2EFb.subSequence(i11, e6tOsSdd2EFb.length()).toString() + '\"');
                                            } else {
                                                int[] iArr2 = fx1.Y1f8riQaR6yg;
                                                int i14 = 0;
                                                for (int i15 = 2; i14 < i15; i15 = 2) {
                                                    int i16 = i11 + iArr2[i14];
                                                    if (i16 >= e6tOsSdd2EFb.length()) {
                                                        break;
                                                    }
                                                    if (e6tOsSdd2EFb.charAt(i16) != ':') {
                                                        StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i16, "Expected ':' at index ", ", got '");
                                                        BRwzKIf41E4i.append(e6tOsSdd2EFb.charAt(i16));
                                                        BRwzKIf41E4i.append('\'');
                                                        rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, BRwzKIf41E4i.toString());
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                                int[] iArr3 = fx1.e9gEMXR7LXtO;
                                                int i17 = 0;
                                                while (i17 < 6 && (i4 = iArr3[i17] + i11) < e6tOsSdd2EFb.length()) {
                                                    char charAt5 = e6tOsSdd2EFb.charAt(i4);
                                                    int[] iArr4 = iArr3;
                                                    if ('0' > charAt5 || charAt5 >= ':') {
                                                        StringBuilder BRwzKIf41E4i2 = o0.BRwzKIf41E4i(i4, "Expected an ASCII digit at index ", ", got '");
                                                        BRwzKIf41E4i2.append(e6tOsSdd2EFb.charAt(i4));
                                                        BRwzKIf41E4i2.append('\'');
                                                        rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, BRwzKIf41E4i2.toString());
                                                        break;
                                                    }
                                                    i17++;
                                                    iArr3 = iArr4;
                                                }
                                                int uVlwi32qvXeJ6 = fx1.uVlwi32qvXeJ(e6tOsSdd2EFb, i11 + 1);
                                                int uVlwi32qvXeJ7 = length > 3 ? fx1.uVlwi32qvXeJ(e6tOsSdd2EFb, i11 + 4) : 0;
                                                int uVlwi32qvXeJ8 = length > 6 ? fx1.uVlwi32qvXeJ(e6tOsSdd2EFb, i11 + 7) : 0;
                                                if (uVlwi32qvXeJ7 > 59) {
                                                    rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected offset-minute-of-hour in 0..59, got " + uVlwi32qvXeJ7);
                                                } else if (uVlwi32qvXeJ8 > 59) {
                                                    rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected offset-second-of-minute in 0..59, got " + uVlwi32qvXeJ8);
                                                } else if (uVlwi32qvXeJ6 <= 17 || (uVlwi32qvXeJ6 == 18 && uVlwi32qvXeJ7 == 0 && uVlwi32qvXeJ8 == 0)) {
                                                    i3 = ((uVlwi32qvXeJ7 * 60) + (uVlwi32qvXeJ6 * 3600) + uVlwi32qvXeJ8) * (charAt4 == '-' ? -1 : 1);
                                                    if (1 <= uVlwi32qvXeJ || uVlwi32qvXeJ >= 13) {
                                                        rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected a month number in 1..12, got " + uVlwi32qvXeJ);
                                                    } else {
                                                        if (1 <= uVlwi32qvXeJ2) {
                                                            int i18 = i6 & 3;
                                                            if (uVlwi32qvXeJ2 <= (uVlwi32qvXeJ != 2 ? (uVlwi32qvXeJ == 4 || uVlwi32qvXeJ == 6 || uVlwi32qvXeJ == 9 || uVlwi32qvXeJ == 11) ? 30 : 31 : i18 == 0 && (i6 % 100 != 0 || i6 % 400 == 0) ? 29 : 28)) {
                                                                if (uVlwi32qvXeJ3 > 23) {
                                                                    rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected hour in 0..23, got " + uVlwi32qvXeJ3);
                                                                } else if (uVlwi32qvXeJ4 > 59) {
                                                                    rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected minute-of-hour in 0..59, got " + uVlwi32qvXeJ4);
                                                                } else if (uVlwi32qvXeJ5 > 59) {
                                                                    rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected second-of-minute in 0..59, got " + uVlwi32qvXeJ5);
                                                                } else {
                                                                    long j = i6;
                                                                    long j2 = 365 * j;
                                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (((uVlwi32qvXeJ * 367) - 362) / 12) + (uVlwi32qvXeJ2 - 1);
                                                                    if (uVlwi32qvXeJ > 2) {
                                                                        j3 = (i18 != 0 || (i6 % 100 == 0 && i6 % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                                    }
                                                                    rxipThha848g = new jq0(i2, (((j3 - 719528) * 86400) + (((uVlwi32qvXeJ4 * 60) + (uVlwi32qvXeJ3 * 3600)) + uVlwi32qvXeJ5)) - i3);
                                                                }
                                                            }
                                                        }
                                                        rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected a valid day-of-month for month " + uVlwi32qvXeJ + " of year " + i6 + ", got " + uVlwi32qvXeJ2);
                                                    }
                                                } else {
                                                    rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected an offset in -18:00..+18:00, got " + e6tOsSdd2EFb.subSequence(i11, e6tOsSdd2EFb.length()).toString());
                                                }
                                            }
                                        } else if (charAt4 == 'Z' || charAt4 == 'z') {
                                            int i19 = i11 + 1;
                                            if (e6tOsSdd2EFb.length() == i19) {
                                                i3 = 0;
                                                if (1 <= uVlwi32qvXeJ) {
                                                }
                                                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected a month number in 1..12, got " + uVlwi32qvXeJ);
                                            } else {
                                                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Extra text after the instant at position " + i19);
                                            }
                                        } else {
                                            rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "Expected the UTC offset at position " + i11 + ", got '" + charAt4 + '\'');
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                rxipThha848g = fx1.hVNtCUZb4tYH(e6tOsSdd2EFb, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return rxipThha848g.toInstant();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gq0 gq0Var = (gq0) obj;
        gq0Var.getClass();
        encoder.gPXPFXrUH4XX(gq0Var.toString());
    }
}
