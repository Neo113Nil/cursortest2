package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class pe implements qe {

    /* renamed from: a, reason: collision with root package name */
    private final long f18641a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final te f18642b;

    public pe(long j4, @NotNull te recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.f18641a = j4;
        this.f18642b = recoveryStrategy;
    }

    @Override // com.ironsource.qe
    public long a() {
        return this.f18641a;
    }

    @Override // com.ironsource.qe
    @NotNull
    public te b() {
        return this.f18642b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pe(@NotNull se feature) {
        this(feature.a(), feature.b());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }
}
