package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g10 {
    @NotNull
    public static File a(@NotNull Context context, @NotNull String cacheDirName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheDirName, "cacheDirName");
        return new File(context.getCacheDir().getPath() + File.separator + cacheDirName);
    }
}
