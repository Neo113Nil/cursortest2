package com.chartboost.sdk.impl;

import android.util.Base64;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public class i2 {
    public String b(String encodedString) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(encodedString, "encodedString");
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] decode = Base64.decode(a(encodedString), 2);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            m8023constructorimpl = Result.m8023constructorimpl(new String(decode, Charsets.UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot decode base64 string: " + m8026exceptionOrNullimpl.getLocalizedMessage(), (Throwable) null, 2, (Object) null);
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = "";
        }
        return (String) m8023constructorimpl;
    }

    public String c(String originalString) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bytes = originalString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String encodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
            m8023constructorimpl = Result.m8023constructorimpl(a(encodeToString));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot encode to base64 string: " + m8026exceptionOrNullimpl.getLocalizedMessage(), (Throwable) null, 2, (Object) null);
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = "";
        }
        return (String) m8023constructorimpl;
    }

    public final String a(String str) {
        String replace$default = StringsKt.replace$default(str, "\n", "", false, 4, (Object) null);
        int length = replace$default.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) replace$default.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return replace$default.subSequence(i, length + 1).toString();
    }
}
