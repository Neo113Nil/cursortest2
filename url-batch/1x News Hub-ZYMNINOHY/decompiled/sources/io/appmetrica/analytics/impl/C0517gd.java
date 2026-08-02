package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517gd implements ModuleSelfReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Vj f7399a = AbstractC0919w1.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f7400b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th) {
        Vj vj = this.f7399a;
        vj.getClass();
        vj.a(new C0885uj(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        Vj vj = this.f7399a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f7400b).withName(str).build();
        vj.getClass();
        vj.a(new Kj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f7399a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        Vj vj = this.f7399a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f7400b).withName(str).withAttributes(map).build();
        vj.getClass();
        vj.a(new Kj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        Vj vj = this.f7399a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f7400b).withName(str).withValue(str2).build();
        vj.getClass();
        vj.a(new Kj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i3, String str, String str2) {
        Vj vj = this.f7399a;
        ModuleEvent build = ModuleEvent.newBuilder(i3).withName(str).withValue(str2).build();
        vj.getClass();
        vj.a(new Kj(build));
    }
}
