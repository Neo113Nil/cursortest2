package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes.dex */
public abstract class D2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1009ul f10174a;

    public D2(InterfaceC1009ul interfaceC1009ul) {
        this.f10174a = interfaceC1009ul;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((AbstractC1105yd) this.f10174a).c(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i4) {
        return ((AbstractC1105yd) this.f10174a).c(str, i4);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j4) {
        return ((AbstractC1105yd) this.f10174a).c(a(str), j4);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC1105yd) this.f10174a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z) {
        AbstractC1105yd abstractC1105yd = (AbstractC1105yd) this.f10174a;
        ((Xe) ((InterfaceC1009ul) abstractC1105yd.b(abstractC1105yd.f(a(str)), z))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i4) {
        AbstractC1105yd abstractC1105yd = (AbstractC1105yd) this.f10174a;
        ((Xe) ((InterfaceC1009ul) abstractC1105yd.b(abstractC1105yd.f(str), i4))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j4) {
        AbstractC1105yd abstractC1105yd = (AbstractC1105yd) this.f10174a;
        ((Xe) ((InterfaceC1009ul) abstractC1105yd.b(abstractC1105yd.f(a(str)), j4))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC1105yd abstractC1105yd = (AbstractC1105yd) this.f10174a;
        ((Xe) ((InterfaceC1009ul) abstractC1105yd.b(abstractC1105yd.f(a(str)), str2))).b();
    }
}
