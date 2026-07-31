package ru.rustore.sdk.pay.internal;

import io.jsonwebtoken.JwtParser;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u4 {
    @NotNull
    public static String a(long j4) {
        String bigDecimal = new BigDecimal(j4).movePointLeft(2).toString();
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "BigDecimal(value).movePo…)\n            .toString()");
        return StringsKt.G(StringsKt.F(bigDecimal, JwtParser.SEPARATOR_CHAR, ',', false, 4, null), ",00", "", false, 4, null) + " ₽";
    }
}
