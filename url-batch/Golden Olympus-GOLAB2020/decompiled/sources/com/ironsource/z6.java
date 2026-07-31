package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class z6 implements vi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1441c3 f20506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final u6 f20507b;

    public z6(@NotNull C1441c3 adapterConfig, @NotNull u6 adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f20506a = adapterConfig;
        this.f20507b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC1448d3
    public boolean a() {
        return !this.f20506a.j();
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public String b() {
        String a4 = this.f20506a.a();
        Intrinsics.checkNotNullExpressionValue(a4, "adapterConfig.adSourceNameForEvents");
        return a4;
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public xi c() {
        return xi.f20316b.a(this.f20506a.d());
    }

    @Override // com.ironsource.InterfaceC1448d3
    public boolean d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC1570u
    public long e() {
        return this.f20507b.b();
    }

    @Override // com.ironsource.InterfaceC1448d3
    @NotNull
    public String f() {
        String f4 = this.f20506a.f();
        Intrinsics.checkNotNullExpressionValue(f4, "adapterConfig.providerName");
        return f4;
    }
}
