package com.ironsource;

import com.ironsource.q7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class kw<Smash extends q7<?>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lw<Smash> f16971a;

    public kw(@NotNull lw<Smash> smashPicker) {
        Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.f16971a = smashPicker;
    }

    @NotNull
    public final List<Smash> a() {
        return this.f16971a.c();
    }

    public final boolean b() {
        return this.f16971a.c().isEmpty() && this.f16971a.a().isEmpty();
    }

    public final boolean c() {
        return this.f16971a.d() == 0;
    }
}
