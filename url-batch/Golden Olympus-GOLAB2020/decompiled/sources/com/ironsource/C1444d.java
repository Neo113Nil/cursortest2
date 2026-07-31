package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1444d implements xc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fp f15811a;

    public C1444d(@NotNull fp folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.f15811a = folderRootUrl;
    }

    @Override // com.ironsource.xc
    @NotNull
    public String value() {
        return this.f15811a.a() + "/abTestMap.json";
    }
}
