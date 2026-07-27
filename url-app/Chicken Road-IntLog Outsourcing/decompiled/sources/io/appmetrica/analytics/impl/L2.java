package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes.dex */
public abstract class L2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1141yl f7059a;

    public L2(InterfaceC1141yl interfaceC1141yl) {
        this.f7059a = interfaceC1141yl;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((Fd) this.f7059a).c(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i2) {
        return ((Fd) this.f7059a).c(str, i2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j2) {
        return ((Fd) this.f7059a).c(a(str), j2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((Fd) this.f7059a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z) {
        Fd fd = (Fd) this.f7059a;
        ((AbstractC0567cf) ((InterfaceC1141yl) fd.b(fd.f(a(str)), z))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i2) {
        Fd fd = (Fd) this.f7059a;
        ((AbstractC0567cf) ((InterfaceC1141yl) fd.b(fd.f(str), i2))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j2) {
        Fd fd = (Fd) this.f7059a;
        ((AbstractC0567cf) ((InterfaceC1141yl) fd.b(fd.f(a(str)), j2))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        Fd fd = (Fd) this.f7059a;
        ((AbstractC0567cf) ((InterfaceC1141yl) fd.b(fd.f(a(str)), str2))).b();
    }
}
