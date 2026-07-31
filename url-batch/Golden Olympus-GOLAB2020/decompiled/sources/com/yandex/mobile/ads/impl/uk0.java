package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.yandex.mobile.ads.impl.tk0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f33161a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rk0 f33162b;

    public uk0(@NotNull Context context, @NotNull rk0 fileProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileProvider, "fileProvider");
        this.f33161a = context;
        this.f33162b = fileProvider;
    }

    @NotNull
    public final tk0 a(@NotNull String reportText) {
        Intrinsics.checkNotNullParameter(reportText, "reportText");
        try {
            File a4 = this.f33162b.a();
            File parentFile = a4.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] bytes = reportText.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes.length >= freeSpace) {
                return new tk0.a("Not enough space error");
            }
            f2.i.f(a4, bytes);
            Uri uriForFile = FileProvider.getUriForFile(this.f33161a, this.f33161a.getPackageName() + ".monetization.ads.inspector.fileprovider", a4);
            Intrinsics.checkNotNull(uriForFile);
            return new tk0.c(uriForFile);
        } catch (Exception unused) {
            ap0.c(new Object[0]);
            return new tk0.a("Failed to save report");
        }
    }
}
