package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f28834a;

    public m20(@NotNull Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f28834a = url;
    }

    @NotNull
    public final Uri a() {
        return this.f28834a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m20) && Intrinsics.areEqual(this.f28834a, ((m20) obj).f28834a);
    }

    public final int hashCode() {
        return this.f28834a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.f28834a + ")";
    }
}
