package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class mq implements vi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1441c3 f18072a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zq f18073b;

    public mq(@NotNull C1441c3 adapterConfig, @NotNull zq adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f18072a = adapterConfig;
        this.f18073b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC1448d3
    public boolean a() {
        return !this.f18072a.j();
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public String b() {
        String a4 = this.f18072a.a();
        Intrinsics.checkNotNullExpressionValue(a4, "adapterConfig.adSourceNameForEvents");
        return a4;
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public xi c() {
        return xi.f20316b.a(this.f18072a.d());
    }

    @Override // com.ironsource.InterfaceC1448d3
    public boolean d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC1570u
    public long e() {
        return this.f18073b.i();
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public String f() {
        String f4 = this.f18072a.f();
        Intrinsics.checkNotNullExpressionValue(f4, "adapterConfig.providerName");
        return f4;
    }
}
