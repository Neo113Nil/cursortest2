package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes3.dex */
public abstract class E2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0586vl f818a;

    public E2(InterfaceC0586vl interfaceC0586vl) {
        this.f818a = interfaceC0586vl;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((AbstractC0678zd) this.f818a).c(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i) {
        return ((AbstractC0678zd) this.f818a).c(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j) {
        return ((AbstractC0678zd) this.f818a).c(a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC0678zd) this.f818a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z) {
        AbstractC0678zd abstractC0678zd = (AbstractC0678zd) this.f818a;
        ((Ye) ((InterfaceC0586vl) abstractC0678zd.b(abstractC0678zd.f(a(str)), z))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i) {
        AbstractC0678zd abstractC0678zd = (AbstractC0678zd) this.f818a;
        ((Ye) ((InterfaceC0586vl) abstractC0678zd.b(abstractC0678zd.f(str), i))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j) {
        AbstractC0678zd abstractC0678zd = (AbstractC0678zd) this.f818a;
        ((Ye) ((InterfaceC0586vl) abstractC0678zd.b(abstractC0678zd.f(a(str)), j))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC0678zd abstractC0678zd = (AbstractC0678zd) this.f818a;
        ((Ye) ((InterfaceC0586vl) abstractC0678zd.b(abstractC0678zd.f(a(str)), str2))).b();
    }
}
