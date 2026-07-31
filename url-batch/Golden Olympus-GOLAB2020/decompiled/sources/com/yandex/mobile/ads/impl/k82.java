package com.yandex.mobile.ads.impl;

import java.net.URI;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k82 f28112a = new k82();

    private k82() {
    }

    @NotNull
    public static String a(@NotNull String url) {
        Object m243constructorimpl;
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.Companion;
            boolean P3 = StringsKt.P(url, "://", false, 2, null);
            if (!P3) {
                url = b(url);
            }
            URI uri = new URI(url);
            if (P3) {
                str = uri.getScheme() + "://";
            } else {
                str = "";
            }
            m243constructorimpl = Result.m243constructorimpl(str + uri.getHost());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = "bad_url";
        }
        return (String) m243constructorimpl;
    }

    private static String b(String str) {
        return "stub://" + str;
    }
}
