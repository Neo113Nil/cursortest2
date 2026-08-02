package kotlin.time;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.airbnb.lottie.utils.Utils;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InstantParseResult;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes9.dex */
public abstract class InstantKt {
    public static final int[] POWERS_OF_TEN = {1, 10, 100, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 10000, 100000, 1000000, 10000000, 100000000, Utils.SECOND_IN_NANOS};
    public static final int[] asciiDigitPositionsInIsoStringAfterYear = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] colonsInIsoOffsetString = {3, 6};
    public static final int[] asciiDigitsInIsoOffsetString = {1, 2, 4, 5, 7, 8};

    public static final String access$formatIso(Instant instant) {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        instant.getClass();
        long j2 = instant.epochSeconds;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int m = Recorder$$ExternalSyntheticOutline1.m(i2, 5, 2, 153);
        int i3 = ((m + 2) % 12) + 1;
        int i4 = (i2 - (((m * EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE) + 5) / 10)) + 1;
        int i5 = (int) (j7 + j + (m / 10));
        int i6 = i / 3600;
        int i7 = i - (i6 * 3600);
        int i8 = i7 / 60;
        int i9 = i7 - (i8 * 60);
        int i10 = instant.nanosecondsOfSecond;
        int i11 = 0;
        if (Math.abs(i5) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i5 >= 0) {
                sb2.append(i5 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i5 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i5 >= 10000) {
                sb.append('+');
            }
            sb.append(i5);
        }
        sb.append('-');
        formatIso$lambda$0$appendTwoDigits(sb, sb, i3);
        sb.append('-');
        formatIso$lambda$0$appendTwoDigits(sb, sb, i4);
        sb.append('T');
        formatIso$lambda$0$appendTwoDigits(sb, sb, i6);
        sb.append(':');
        formatIso$lambda$0$appendTwoDigits(sb, sb, i8);
        sb.append(':');
        formatIso$lambda$0$appendTwoDigits(sb, sb, i9);
        if (i10 != 0) {
            sb.append('.');
            while (true) {
                int i12 = i11 + 1;
                iArr = POWERS_OF_TEN;
                if (i10 % iArr[i12] != 0) {
                    break;
                }
                i11 = i12;
            }
            int i13 = i11 - (i11 % 3);
            String valueOf = String.valueOf((i10 / iArr[i13]) + iArr[9 - i13]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append(Matrix.MATRIX_TYPE_ZERO);
        return sb.toString();
    }

    public static final InstantParseResult access$parseIso(CharSequence charSequence) {
        int i;
        int i2;
        int m;
        int i3;
        char charAt;
        char charAt2;
        if (charSequence.length() == 0) {
            return new InstantParseResult.Failure(charSequence, "An empty string is not a valid Instant");
        }
        int i4 = 0;
        char charAt3 = charSequence.charAt(0);
        if (charAt3 == '+' || charAt3 == '-') {
            i = 1;
        } else {
            i = 0;
            charAt3 = ' ';
        }
        int i5 = 0;
        int i6 = i;
        while (i6 < charSequence.length() && '0' <= (charAt2 = charSequence.charAt(i6)) && charAt2 < ':') {
            i5 = (i5 * 10) + (charSequence.charAt(i6) - '0');
            i6++;
        }
        int i7 = i6 - i;
        if (i7 > 10) {
            return parseIso$parseFailure(charSequence, "Expected at most 10 digits for the year number, got " + i7 + " digits");
        }
        if (i7 == 10 && Intrinsics.compare((int) charSequence.charAt(i), 50) >= 0) {
            return parseIso$parseFailure(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i7 + " digits");
        }
        if (i7 < 4) {
            return parseIso$parseFailure(charSequence, "The year number must be padded to 4 digits, got " + i7 + " digits");
        }
        if (charAt3 == '+' && i7 == 4) {
            return parseIso$parseFailure(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (charAt3 == ' ' && i7 != 4) {
            return parseIso$parseFailure(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (charAt3 == '-') {
            i5 = -i5;
        }
        int i8 = i6 + 16;
        if (charSequence.length() < i8) {
            return parseIso$parseFailure(charSequence, "The input string is too short");
        }
        InstantParseResult.Failure parseIso$expect = parseIso$expect(charSequence, "'-'", i6, new InstantKt$$ExternalSyntheticLambda0(i4));
        if (parseIso$expect != null) {
            return parseIso$expect;
        }
        InstantParseResult.Failure parseIso$expect2 = parseIso$expect(charSequence, "'-'", i6 + 3, new InstantKt$$ExternalSyntheticLambda0(21));
        if (parseIso$expect2 != null) {
            return parseIso$expect2;
        }
        InstantParseResult.Failure parseIso$expect3 = parseIso$expect(charSequence, "'T' or 't'", i6 + 6, new InstantKt$$ExternalSyntheticLambda0(22));
        if (parseIso$expect3 != null) {
            return parseIso$expect3;
        }
        InstantParseResult.Failure parseIso$expect4 = parseIso$expect(charSequence, "':'", i6 + 9, new InstantKt$$ExternalSyntheticLambda0(23));
        if (parseIso$expect4 != null) {
            return parseIso$expect4;
        }
        InstantParseResult.Failure parseIso$expect5 = parseIso$expect(charSequence, "':'", i6 + 12, new InstantKt$$ExternalSyntheticLambda0(24));
        if (parseIso$expect5 != null) {
            return parseIso$expect5;
        }
        for (int i9 = 0; i9 < 10; i9++) {
            InstantParseResult.Failure parseIso$expect6 = parseIso$expect(charSequence, "an ASCII digit", asciiDigitPositionsInIsoStringAfterYear[i9] + i6, new InstantKt$$ExternalSyntheticLambda0(25));
            if (parseIso$expect6 != null) {
                return parseIso$expect6;
            }
        }
        int parseIso$twoDigitNumber = parseIso$twoDigitNumber(i6 + 1, charSequence);
        int parseIso$twoDigitNumber2 = parseIso$twoDigitNumber(i6 + 4, charSequence);
        int parseIso$twoDigitNumber3 = parseIso$twoDigitNumber(i6 + 7, charSequence);
        int parseIso$twoDigitNumber4 = parseIso$twoDigitNumber(i6 + 10, charSequence);
        int parseIso$twoDigitNumber5 = parseIso$twoDigitNumber(i6 + 13, charSequence);
        int i10 = i6 + 15;
        if (charSequence.charAt(i10) == '.') {
            i10 = i8;
            int i11 = 0;
            while (i10 < charSequence.length() && '0' <= (charAt = charSequence.charAt(i10)) && charAt < ':') {
                i11 = (i11 * 10) + (charSequence.charAt(i10) - '0');
                i10++;
            }
            int i12 = i10 - i8;
            if (1 > i12 || i12 >= 10) {
                return parseIso$parseFailure(charSequence, "1..9 digits are supported for the fraction of the second, got " + i12 + " digits");
            }
            i2 = i11 * POWERS_OF_TEN[9 - i12];
        } else {
            i2 = 0;
        }
        if (i10 >= charSequence.length()) {
            return parseIso$parseFailure(charSequence, "The UTC offset at the end of the string is missing");
        }
        char charAt4 = charSequence.charAt(i10);
        if (charAt4 == '+' || charAt4 == '-') {
            int length = charSequence.length() - i10;
            if (length > 9) {
                return parseIso$parseFailure(charSequence, "The UTC offset string \"" + truncateForErrorMessage(16, charSequence.subSequence(i10, charSequence.length()).toString()) + "\" is too long");
            }
            if (length % 3 != 0) {
                return parseIso$parseFailure(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i10, charSequence.length()).toString() + '\"');
            }
            int i13 = 0;
            for (int i14 = 2; i13 < i14; i14 = 2) {
                int i15 = i10 + colonsInIsoOffsetString[i13];
                if (i15 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i15) != ':') {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i15, "Expected ':' at index ", ", got '");
                    m2m.append(charSequence.charAt(i15));
                    m2m.append('\'');
                    return parseIso$parseFailure(charSequence, m2m.toString());
                }
                i13++;
            }
            int i16 = 0;
            while (i16 < 6 && (i3 = asciiDigitsInIsoOffsetString[i16] + i10) < charSequence.length()) {
                char charAt5 = charSequence.charAt(i3);
                int i17 = i16;
                if ('0' > charAt5 || charAt5 >= ':') {
                    StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i3, "Expected an ASCII digit at index ", ", got '");
                    m2m2.append(charSequence.charAt(i3));
                    m2m2.append('\'');
                    return parseIso$parseFailure(charSequence, m2m2.toString());
                }
                i16 = i17 + 1;
            }
            int parseIso$twoDigitNumber6 = parseIso$twoDigitNumber(i10 + 1, charSequence);
            int parseIso$twoDigitNumber7 = length > 3 ? parseIso$twoDigitNumber(i10 + 4, charSequence) : 0;
            int parseIso$twoDigitNumber8 = length > 6 ? parseIso$twoDigitNumber(i10 + 7, charSequence) : 0;
            if (parseIso$twoDigitNumber7 > 59) {
                return parseIso$parseFailure(charSequence, "Expected offset-minute-of-hour in 0..59, got " + parseIso$twoDigitNumber7);
            }
            if (parseIso$twoDigitNumber8 > 59) {
                return parseIso$parseFailure(charSequence, "Expected offset-second-of-minute in 0..59, got " + parseIso$twoDigitNumber8);
            }
            if (parseIso$twoDigitNumber6 > 17 && (parseIso$twoDigitNumber6 != 18 || parseIso$twoDigitNumber7 != 0 || parseIso$twoDigitNumber8 != 0)) {
                return parseIso$parseFailure(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i10, charSequence.length()).toString());
            }
            m = Boxes$$ExternalSyntheticOutline1.m(parseIso$twoDigitNumber7, 60, parseIso$twoDigitNumber6 * 3600, parseIso$twoDigitNumber8) * (charAt4 == '-' ? -1 : 1);
        } else {
            if (charAt4 != 'Z' && charAt4 != 'z') {
                return parseIso$parseFailure(charSequence, "Expected the UTC offset at position " + i10 + ", got '" + charAt4 + '\'');
            }
            int i18 = i10 + 1;
            if (charSequence.length() != i18) {
                return parseIso$parseFailure(charSequence, "Extra text after the instant at position " + i18);
            }
            m = 0;
        }
        if (1 > parseIso$twoDigitNumber || parseIso$twoDigitNumber >= 13) {
            return parseIso$parseFailure(charSequence, "Expected a month number in 1..12, got " + parseIso$twoDigitNumber);
        }
        if (1 <= parseIso$twoDigitNumber2) {
            int i19 = i5 & 3;
            if (parseIso$twoDigitNumber2 <= (parseIso$twoDigitNumber != 2 ? (parseIso$twoDigitNumber == 4 || parseIso$twoDigitNumber == 6 || parseIso$twoDigitNumber == 9 || parseIso$twoDigitNumber == 11) ? 30 : 31 : i19 == 0 && (i5 % 100 != 0 || i5 % 400 == 0) ? 29 : 28)) {
                if (parseIso$twoDigitNumber3 > 23) {
                    return parseIso$parseFailure(charSequence, "Expected hour in 0..23, got " + parseIso$twoDigitNumber3);
                }
                if (parseIso$twoDigitNumber4 > 59) {
                    return parseIso$parseFailure(charSequence, "Expected minute-of-hour in 0..59, got " + parseIso$twoDigitNumber4);
                }
                if (parseIso$twoDigitNumber5 > 59) {
                    return parseIso$parseFailure(charSequence, "Expected second-of-minute in 0..59, got " + parseIso$twoDigitNumber5);
                }
                long j = i5;
                long j2 = 365 * j;
                long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (((parseIso$twoDigitNumber * 367) - 362) / 12) + (parseIso$twoDigitNumber2 - 1);
                if (parseIso$twoDigitNumber > 2) {
                    j3 = (i19 != 0 || (i5 % 100 == 0 && i5 % 400 != 0)) ? j3 - 2 : (-1) + j3;
                }
                return new InstantParseResult.Success((((j3 - 719528) * 86400) + Boxes$$ExternalSyntheticOutline1.m(parseIso$twoDigitNumber4, 60, parseIso$twoDigitNumber3 * 3600, parseIso$twoDigitNumber5)) - m, i2);
            }
        }
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(parseIso$twoDigitNumber, i5, "Expected a valid day-of-month for month ", " of year ", ", got ");
        m107m.append(parseIso$twoDigitNumber2);
        return parseIso$parseFailure(charSequence, m107m.toString());
    }

    public static int compareTo(ComparableTimeMark comparableTimeMark, ComparableTimeMark comparableTimeMark2) {
        comparableTimeMark2.getClass();
        long mo4161minusUwyO8pc = comparableTimeMark.mo4161minusUwyO8pc(comparableTimeMark2);
        Duration.Companion.getClass();
        return Duration.m4164compareToLRDsOJo(mo4161minusUwyO8pc, 0L);
    }

    public static final void formatIso$lambda$0$appendTwoDigits(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    public static void getIso() {
        LongParser longParser = LongParser.iso;
    }

    public static final InstantParseResult.Failure parseIso$expect(CharSequence charSequence, String str, int i, Function1 function1) {
        char charAt = charSequence.charAt(i);
        if (((Boolean) function1.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return parseIso$parseFailure(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i);
    }

    public static final InstantParseResult.Failure parseIso$parseFailure(CharSequence charSequence, String str) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, " when parsing an Instant from \"");
        m108m.append(truncateForErrorMessage(64, charSequence));
        m108m.append('\"');
        return new InstantParseResult.Failure(charSequence, m108m.toString());
    }

    public static final int parseIso$twoDigitNumber(int i, CharSequence charSequence) {
        return (charSequence.charAt(i + 1) - '0') + ((charSequence.charAt(i) - '0') * 10);
    }

    public static final String truncateForErrorMessage(int i, CharSequence charSequence) {
        if (charSequence.length() <= i) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i).toString() + "...";
    }
}
