package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class P2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3021ul f38112a;

    public P2(@NotNull InterfaceC3021ul interfaceC3021ul) {
        this.f38112a = interfaceC3021ul;
    }

    @NotNull
    public abstract String a(@NotNull String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@NotNull String str, boolean z4) {
        return ((Nd) this.f38112a).c(str, z4);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@NotNull String str, int i4) {
        return ((Nd) this.f38112a).c(str, i4);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@NotNull String str, long j4) {
        return ((Nd) this.f38112a).c(a(str), j4);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        return ((Nd) this.f38112a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@NotNull String str, boolean z4) {
        Nd nd = (Nd) this.f38112a;
        ((AbstractC2782lf) ((InterfaceC3021ul) nd.b(nd.f(a(str)), z4))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@NotNull String str, int i4) {
        Nd nd = (Nd) this.f38112a;
        ((AbstractC2782lf) ((InterfaceC3021ul) nd.b(nd.f(str), i4))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@NotNull String str, long j4) {
        Nd nd = (Nd) this.f38112a;
        ((AbstractC2782lf) ((InterfaceC3021ul) nd.b(nd.f(a(str)), j4))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@NotNull String str, @Nullable String str2) {
        Nd nd = (Nd) this.f38112a;
        ((AbstractC2782lf) ((InterfaceC3021ul) nd.b(nd.f(a(str)), str2))).b();
    }
}
