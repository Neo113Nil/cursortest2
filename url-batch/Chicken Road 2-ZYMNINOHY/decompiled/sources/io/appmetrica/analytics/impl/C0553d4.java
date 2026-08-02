package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553d4 implements ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1009ul f11649a;

    public C0553d4(InterfaceC1009ul interfaceC1009ul) {
        this.f11649a = interfaceC1009ul;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Xc(str, this.f11649a);
    }
}
