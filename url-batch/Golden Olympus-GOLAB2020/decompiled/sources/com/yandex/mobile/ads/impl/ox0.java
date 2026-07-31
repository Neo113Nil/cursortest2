package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ox0 implements InterfaceC2216s1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final yw0<?> f30220a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lx0 f30221b;

    public ox0(@Nullable yw0<?> yw0Var, @NotNull lx0 mediatedAdapterInfoReportDataProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f30220a = yw0Var;
        this.f30221b = mediatedAdapterInfoReportDataProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2216s1
    @NotNull
    public final Map<String, Object> a() {
        jp1 jp1Var = new jp1((Map) null, 3);
        yw0<?> yw0Var = this.f30220a;
        if (yw0Var != null) {
            xy0 c4 = yw0Var.c();
            bx0 a4 = this.f30220a.a();
            jp1Var.b(c4.e(), com.ironsource.ge.f16389B1);
            jp1Var.b(c4.i(), "adapter_parameters");
            this.f30221b.getClass();
            jp1Var.a(new HashMap(lx0.a(a4)));
        }
        return jp1Var.b();
    }
}
