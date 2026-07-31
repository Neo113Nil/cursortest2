package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ws {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C1524o0 f20244a;

    public ws(@Nullable C1524o0 c1524o0) {
        this.f20244a = c1524o0;
    }

    @Nullable
    public final C1524o0 a() {
        return this.f20244a;
    }

    @NotNull
    public abstract dt b();

    @NotNull
    public final C1576v a(@NotNull mm<ws, C1576v> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
