package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611k4 implements ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0990yl f7701a;

    public C0611k4(InterfaceC0990yl interfaceC0990yl) {
        this.f7701a = interfaceC0990yl;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C0465ed(str, this.f7701a);
    }
}
