package com.yandex.mobile.ads.impl;

import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xa2 {
    @Nullable
    public static wa2 a(@NotNull String versionNameStr) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(versionNameStr, "versionNameStr");
        int length = versionNameStr.length();
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (versionNameStr.charAt(i4) == '-') {
                    versionNameStr = versionNameStr.substring(0, i4);
                    Intrinsics.checkNotNullExpressionValue(versionNameStr, "substring(...)");
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        List D02 = StringsKt.D0(versionNameStr, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null);
        String str = (String) CollectionsKt.getOrNull(D02, 0);
        if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
            return null;
        }
        int intValue = intOrNull.intValue();
        Integer intOrNull2 = StringsKt.toIntOrNull((String) (1 <= CollectionsKt.getLastIndex(D02) ? D02.get(1) : "0"));
        if (intOrNull2 == null) {
            return null;
        }
        int intValue2 = intOrNull2.intValue();
        Integer intOrNull3 = StringsKt.toIntOrNull((String) (2 <= CollectionsKt.getLastIndex(D02) ? D02.get(2) : "0"));
        if (intOrNull3 != null) {
            return new wa2(intValue, intValue2, intOrNull3.intValue());
        }
        return null;
    }
}
