package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class qj implements vi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1441c3 f18864a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nj f18865b;

    public qj(@NotNull C1441c3 adapterConfig, @NotNull nj adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f18864a = adapterConfig;
        this.f18865b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC1448d3
    public boolean a() {
        return !this.f18864a.j();
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public String b() {
        String a4 = this.f18864a.a();
        Intrinsics.checkNotNullExpressionValue(a4, "adapterConfig.adSourceNameForEvents");
        return a4;
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public xi c() {
        return xi.f20316b.a(this.f18864a.d());
    }

    @Override // com.ironsource.InterfaceC1448d3
    public boolean d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC1570u
    public long e() {
        return this.f18865b.e();
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public String f() {
        String f4 = this.f18864a.f();
        Intrinsics.checkNotNullExpressionValue(f4, "adapterConfig.providerName");
        return f4;
    }
}
