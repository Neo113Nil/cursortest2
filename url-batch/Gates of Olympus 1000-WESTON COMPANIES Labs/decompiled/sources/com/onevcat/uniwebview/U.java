package com.onevcat.uniwebview;

import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class U {
    public static C0063m a(String dataUrl) {
        byte[] data;
        Intrinsics.checkNotNullParameter(dataUrl, "dataUrl");
        MatchResult matchEntire = new Regex("^data:([-\\w]+/[-+\\w.]+)?(;?\\w+=[-\\w]+)*(;base64)?,(.*)").matchEntire(dataUrl);
        if (matchEntire == null) {
            return null;
        }
        String str = matchEntire.getGroupValues().get(1);
        boolean areEqual = Intrinsics.areEqual(";base64", matchEntire.getGroupValues().get(3));
        String str2 = matchEntire.getGroupValues().get(4);
        if (areEqual) {
            data = Base64.decode(str2, 0);
        } else {
            String decode = URLDecoder.decode(str2, StandardCharsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(decode, "decode(dataString, StandardCharsets.UTF_8.name())");
            data = decode.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(data, "this as java.lang.String).getBytes(charset)");
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return new C0063m(str, data);
    }
}
