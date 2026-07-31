package com.yandex.mobile.ads.impl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kr1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final DecimalFormat f28308a;

    public kr1() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f28308a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    @NotNull
    public final String a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < value.length(); i4++) {
                char charAt = value.charAt(i4);
                if (!CharsKt.b(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            String format = this.f28308a.format(Long.parseLong(sb2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        } catch (NumberFormatException e4) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{value}, 1)), "format(...)");
            Object[] args = {e4};
            int i5 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            throw new i61("Native Ad json has not required attributes");
        }
    }
}
