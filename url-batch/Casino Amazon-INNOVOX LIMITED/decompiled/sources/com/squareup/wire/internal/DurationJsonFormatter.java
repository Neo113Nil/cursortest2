package com.squareup.wire.internal;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.time.Duration;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;

/* compiled from: DurationJsonFormatter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/DurationJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "<init>", "()V", "toStringOrNumber", "", "value", "fromString", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DurationJsonFormatter implements JsonFormatter<Duration> {
    public static final DurationJsonFormatter INSTANCE = new DurationJsonFormatter();

    private DurationJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public String toStringOrNumber(Duration value) {
        String str;
        Intrinsics.checkNotNullParameter(value, "value");
        long seconds = value.getSeconds();
        int nano = value.getNano();
        if (seconds < 0) {
            if (seconds == Long.MIN_VALUE) {
                str = "-922337203685477580";
                seconds = 8;
            } else {
                seconds = -seconds;
                str = TokenBuilder.TOKEN_DELIMITER;
            }
            if (nano != 0) {
                seconds--;
                nano = 1000000000 - nano;
            }
        } else {
            str = "";
        }
        if (nano == 0) {
            String format = String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        if (nano % DurationKt.NANOS_IN_MILLIS == 0) {
            String format2 = String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000000)}, 3));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return format2;
        }
        if (nano % 1000 == 0) {
            String format3 = String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000)}, 3));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            return format3;
        }
        String format4 = String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
        Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
        return format4;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Duration fromString(String value) {
        int i;
        Intrinsics.checkNotNullParameter(value, "value");
        String str = value;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, 's', 0, false, 6, (Object) null);
        if (indexOf$default != value.length() - 1) {
            throw new NumberFormatException();
        }
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        if (indexOf$default2 == -1) {
            String substring = value.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Duration ofSeconds = Duration.ofSeconds(Long.parseLong(substring));
            Intrinsics.checkNotNullExpressionValue(ofSeconds, "ofSeconds(...)");
            return ofSeconds;
        }
        String substring2 = value.substring(0, indexOf$default2);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        long parseLong = Long.parseLong(substring2);
        int i2 = indexOf$default2 + 1;
        String substring3 = value.substring(i2, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        long parseLong2 = Long.parseLong(substring3);
        if (StringsKt.startsWith$default(value, TokenBuilder.TOKEN_DELIMITER, false, 2, (Object) null)) {
            parseLong2 = -parseLong2;
        }
        int i3 = indexOf$default - i2;
        int i4 = i3;
        while (true) {
            if (i4 >= 9) {
                break;
            }
            parseLong2 *= 10;
            i4++;
        }
        for (i = 9; i < i3; i++) {
            parseLong2 /= 10;
        }
        Duration ofSeconds2 = Duration.ofSeconds(parseLong, parseLong2);
        Intrinsics.checkNotNullExpressionValue(ofSeconds2, "ofSeconds(...)");
        return ofSeconds2;
    }
}
