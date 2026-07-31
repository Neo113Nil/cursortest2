package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ke f44176a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final bf f44177b;

    public gf(@NotNull ke dataSource, @NotNull bf mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f44176a = dataSource;
        this.f44177b = mapper;
    }
}
