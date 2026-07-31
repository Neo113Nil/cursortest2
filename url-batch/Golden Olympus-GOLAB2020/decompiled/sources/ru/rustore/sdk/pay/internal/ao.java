package ru.rustore.sdk.pay.internal;

import android.webkit.WebResourceRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ao {
    public static boolean a(@Nullable WebResourceRequest webResourceRequest, @NotNull String mainUrl) {
        Intrinsics.checkNotNullParameter(mainUrl, "mainUrl");
        if (webResourceRequest != null) {
            return webResourceRequest.isForMainFrame();
        }
        return true;
    }
}
