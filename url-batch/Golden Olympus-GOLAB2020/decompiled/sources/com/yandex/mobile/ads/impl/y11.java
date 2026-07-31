package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y11 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f34773a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    public static boolean a(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        return f34773a.matcher(htmlResponse).find();
    }
}
