package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class qv implements xc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fp f18889a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18890b;

    public qv(@NotNull fp folderRootUrl, @NotNull String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f18889a = folderRootUrl;
        this.f18890b = version;
    }

    @NotNull
    public final String a() {
        return this.f18890b;
    }

    @Override // com.ironsource.xc
    @NotNull
    public String value() {
        return this.f18889a.a() + "/versions/" + this.f18890b + "/mobileController.html";
    }
}
