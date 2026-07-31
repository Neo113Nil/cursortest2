package com.ironsource;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class mf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final mf f18026a = new mf();

    private mf() {
    }

    @NotNull
    public final UUID a() {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        return randomUUID;
    }
}
