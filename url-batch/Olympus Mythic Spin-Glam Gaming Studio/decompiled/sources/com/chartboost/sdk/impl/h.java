package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.g;
import com.chartboost.sdk.internal.Model.CBError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {
    public static final h a = new h();

    public Object a(String str, i2 base64Wrapper, Function2 onLoadFailure) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(onLoadFailure, "onLoadFailure");
        String str2 = null;
        if (str != null) {
            String b = base64Wrapper.b(str);
            if (b.length() == 0) {
                xb.b("Cannot decode provided bidResponse.", (Throwable) null, 2, (Object) null);
                onLoadFailure.invoke("", CBError.Impression.INVALID_RESPONSE);
                Result.Companion companion = Result.INSTANCE;
                return Result.m8023constructorimpl(ResultKt.createFailure(g.a.b));
            }
            str2 = b;
        }
        return Result.m8023constructorimpl(str2);
    }
}
