package com.ironsource;

import com.ironsource.ms;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class lr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tr f17114a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lr(@NotNull lr sdkConfig) {
        this(sdkConfig.f17114a);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    @NotNull
    public final C1498k4 a() {
        return this.f17114a.a().b().c();
    }

    @NotNull
    public final C1449d4 b() {
        return this.f17114a.a().b().b();
    }

    @NotNull
    public final mc c() {
        return this.f17114a.b();
    }

    @NotNull
    public final ms d() {
        return this.f17114a.c();
    }

    @NotNull
    public final hm e() {
        return this.f17114a.a().b().e();
    }

    @NotNull
    public final ms.a f() {
        ms.a h4 = this.f17114a.c().h();
        Intrinsics.checkNotNullExpressionValue(h4, "sdkInitResponse.fullResponse.origin");
        return h4;
    }

    @NotNull
    protected final tr g() {
        return this.f17114a;
    }

    public lr(@NotNull tr sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f17114a = sdkInitResponse;
    }
}
