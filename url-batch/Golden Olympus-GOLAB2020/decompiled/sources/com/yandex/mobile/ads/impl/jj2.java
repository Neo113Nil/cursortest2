package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jj2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fl1 f27700a;

    public jj2(@NotNull fl1 processNameProvider) {
        Intrinsics.checkNotNullParameter(processNameProvider, "processNameProvider");
        this.f27700a = processNameProvider;
    }

    public final void a() {
        String a4 = this.f27700a.a();
        String M02 = a4 != null ? StringsKt.M0(a4, StringUtils.PROCESS_POSTFIX_DELIMITER, "") : null;
        if (M02 == null || M02.length() <= 0) {
            return;
        }
        try {
            WebView.setDataDirectorySuffix(M02);
        } catch (Throwable unused) {
        }
    }
}
