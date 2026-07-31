package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3108y4 implements ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3021ul f40252a;

    public C3108y4(@NotNull InterfaceC3021ul interfaceC3021ul) {
        this.f40252a = interfaceC3021ul;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C2961sd(str, this.f40252a);
    }
}
