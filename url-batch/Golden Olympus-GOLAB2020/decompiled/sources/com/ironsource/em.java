package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class em implements rc<dm> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16075a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zp f16076b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1455e3 f16077c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16078d;

    public em(@NotNull String adm, @NotNull zp providerName, @NotNull InterfaceC1455e3 adapterConfigs, boolean z4) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.f16075a = adm;
        this.f16076b = providerName;
        this.f16077c = adapterConfigs;
        this.f16078d = z4;
    }

    @Override // com.ironsource.rc
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dm a() {
        vi a4 = this.f16077c.a(this.f16076b);
        new C1551s0(this.f16075a, a4, this.f16078d).a();
        if (a4 != null) {
            return new dm(a4.c(), a4.b(), a4.e(), a4.a(), false, 16, null);
        }
        return null;
    }
}
