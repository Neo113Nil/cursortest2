package com.squareup.wire.internal;

import com.airbnb.lottie.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.GzipSink;
import okio.RealBufferedSink;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class InstantJsonFormatter implements JsonFormatter {
    public final /* synthetic */ int $r8$classId;
    public static final InstantJsonFormatter INSTANCE$1 = new InstantJsonFormatter(1);
    public static final InstantJsonFormatter INSTANCE$2 = new InstantJsonFormatter(2);
    public static final InstantJsonFormatter INSTANCE = new InstantJsonFormatter(0);
    public static final InstantJsonFormatter INSTANCE$3 = new InstantJsonFormatter(3);
    public static final InstantJsonFormatter INSTANCE$4 = new InstantJsonFormatter(4);
    public static final InstantJsonFormatter INSTANCE$5 = new InstantJsonFormatter(5);
    public static final InstantJsonFormatter INSTANCE$6 = new InstantJsonFormatter(6);
    public static final InstantJsonFormatter INSTANCE$7 = new InstantJsonFormatter(7);
    public static final InstantJsonFormatter INSTANCE$8 = new InstantJsonFormatter(8);
    public static final InstantJsonFormatter INSTANCE$9 = new InstantJsonFormatter(9);

    public /* synthetic */ InstantJsonFormatter(int i) {
        this.$r8$classId = i;
    }

    public BufferedSink encode(Buffer buffer) {
        return new RealBufferedSink(new GzipSink(buffer));
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object fromString(String str) {
        long longValueExact;
        switch (this.$r8$classId) {
            case 0:
                Instant from = Instant.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(str));
                from.getClass();
                return from;
            case 1:
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, 's', 0, false, 6);
                if (indexOf$default != str.length() - 1) {
                    throw new NumberFormatException();
                }
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '.', 0, false, 6);
                if (indexOf$default2 == -1) {
                    Duration ofSeconds = Duration.ofSeconds(Long.parseLong(str.substring(0, indexOf$default)));
                    ofSeconds.getClass();
                    return ofSeconds;
                }
                long parseLong = Long.parseLong(str.substring(0, indexOf$default2));
                int i = indexOf$default2 + 1;
                long parseLong2 = Long.parseLong(str.substring(i, indexOf$default));
                if (StringsKt__StringsJVMKt.startsWith(str, "-", false)) {
                    parseLong2 = -parseLong2;
                }
                int i2 = indexOf$default - i;
                int i3 = i2;
                while (true) {
                    if (i3 >= 9) {
                        for (int i4 = 9; i4 < i2; i4++) {
                            parseLong2 /= 10;
                        }
                        Duration ofSeconds2 = Duration.ofSeconds(parseLong, parseLong2);
                        ofSeconds2.getClass();
                        return ofSeconds2;
                    }
                    parseLong2 *= 10;
                    i3++;
                }
            case 2:
            default:
                return JsonIntegration$UnsignedLongAsNumberJsonFormatter.INSTANCE.fromString(str);
            case 3:
                ByteString.Companion companion = ByteString.Companion;
                return ByteString.Companion.decodeBase64(str);
            case 4:
                return Integer.valueOf(Integer.parseInt(str));
            case 5:
                try {
                    longValueExact = Long.parseLong(str);
                } catch (Exception unused) {
                    longValueExact = new BigDecimal(str).longValueExact();
                }
                return Long.valueOf(longValueExact);
            case 6:
                return str;
            case 7:
                long parseDouble = (long) Double.parseDouble(str);
                if (parseDouble >= 2147483647L) {
                    parseDouble -= 4294967296L;
                }
                return Integer.valueOf((int) parseDouble);
            case 8:
                return Integer.valueOf((int) Long.parseLong(str));
        }
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(Object obj) {
        String str;
        switch (this.$r8$classId) {
            case 0:
                Instant instant = (Instant) obj;
                instant.getClass();
                String format2 = DateTimeFormatter.ISO_INSTANT.format(instant);
                format2.getClass();
                return format2;
            case 1:
                Duration duration = (Duration) obj;
                duration.getClass();
                long seconds = duration.getSeconds();
                int nano = duration.getNano();
                if (seconds < 0) {
                    if (seconds == Long.MIN_VALUE) {
                        str = "-922337203685477580";
                        seconds = 8;
                    } else {
                        seconds = -seconds;
                        str = "-";
                    }
                    if (nano != 0) {
                        seconds--;
                        nano = Utils.SECOND_IN_NANOS - nano;
                    }
                } else {
                    str = "";
                }
                return nano == 0 ? String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2)) : nano % 1000000 == 0 ? String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000000)}, 3)) : nano % IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO == 0 ? String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000)}, 3)) : String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
            case 2:
            default:
                long longValue = ((Number) obj).longValue();
                JsonIntegration$UnsignedLongAsNumberJsonFormatter jsonIntegration$UnsignedLongAsNumberJsonFormatter = JsonIntegration$UnsignedLongAsNumberJsonFormatter.INSTANCE;
                return (longValue < 0 ? JsonIntegration$UnsignedLongAsNumberJsonFormatter.power64.add(BigInteger.valueOf(longValue)) : Long.valueOf(longValue)).toString();
            case 3:
                ByteString byteString = (ByteString) obj;
                byteString.getClass();
                return byteString.base64();
            case 4:
                return String.valueOf(((Number) obj).intValue());
            case 5:
                return String.valueOf(((Number) obj).longValue());
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 7:
                int intValue = ((Number) obj).intValue();
                return intValue < 0 ? Long.valueOf(intValue + 4294967296L) : Integer.valueOf(intValue);
            case 8:
                int intValue2 = ((Number) obj).intValue();
                return intValue2 < 0 ? String.valueOf(intValue2 + 4294967296L) : String.valueOf(intValue2);
        }
    }
}
