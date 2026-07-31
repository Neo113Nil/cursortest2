package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0139e4 implements ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0586vl f1230a;

    public C0139e4(InterfaceC0586vl interfaceC0586vl) {
        this.f1230a = interfaceC0586vl;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Yc(str, this.f1230a);
    }
}
