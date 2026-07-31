package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3013ud implements ModuleSelfReporter {

    /* renamed from: a, reason: collision with root package name */
    public final C2551ck f39940a = AbstractC2975t1.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f39941b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable Throwable th) {
        C2551ck c2551ck = this.f39940a;
        c2551ck.getClass();
        c2551ck.a(new Cj(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str) {
        C2551ck c2551ck = this.f39940a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f39941b).withName(str).build();
        c2551ck.getClass();
        c2551ck.a(new Rj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable String str2) {
        this.f39940a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable Map<String, ? extends Object> map) {
        C2551ck c2551ck = this.f39940a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f39941b).withName(str).withAttributes(map).build();
        c2551ck.getClass();
        c2551ck.a(new Rj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable String str2) {
        C2551ck c2551ck = this.f39940a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f39941b).withName(str).withValue(str2).build();
        c2551ck.getClass();
        c2551ck.a(new Rj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i4, @NotNull String str, @Nullable String str2) {
        C2551ck c2551ck = this.f39940a;
        ModuleEvent build = ModuleEvent.newBuilder(i4).withName(str).withValue(str2).build();
        c2551ck.getClass();
        c2551ck.a(new Rj(build));
    }
}
