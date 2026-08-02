package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* loaded from: classes.dex */
public final class Wc implements ModuleEventServiceHandlerContext {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f11171a;

    /* renamed from: b, reason: collision with root package name */
    public final ModulePreferences f11172b;

    /* renamed from: c, reason: collision with root package name */
    public final ModuleEventServiceHandlerReporter f11173c;

    public Wc(ModulePreferences modulePreferences, ModulePreferences modulePreferences2, ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f11171a = modulePreferences;
        this.f11172b = modulePreferences2;
        this.f11173c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f11173c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f11172b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getModulePreferences() {
        return this.f11171a;
    }
}
