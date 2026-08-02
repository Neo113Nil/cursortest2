package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* loaded from: classes.dex */
public final class Zc implements ModuleSelfReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Qj f11371a = AbstractC1067x1.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f11372b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th) {
        Qj qj = this.f11371a;
        qj.getClass();
        qj.a(new C0878pj(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        Qj qj = this.f11371a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f11372b).withName(str).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f11371a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        Qj qj = this.f11371a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f11372b).withName(str).withAttributes(map).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        Qj qj = this.f11371a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f11372b).withName(str).withValue(str2).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i4, String str, String str2) {
        Qj qj = this.f11371a;
        ModuleEvent build = ModuleEvent.newBuilder(i4).withName(str).withValue(str2).build();
        qj.getClass();
        qj.a(new Fj(build));
    }
}
