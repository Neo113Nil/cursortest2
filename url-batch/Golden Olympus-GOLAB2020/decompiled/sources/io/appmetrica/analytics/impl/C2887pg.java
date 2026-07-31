package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2887pg implements Fg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2938rg f39621a;

    public C2887pg(C2938rg c2938rg) {
        this.f39621a = c2938rg;
    }

    @Override // io.appmetrica.analytics.impl.Fg
    public final void a(@Nullable Ag ag) {
        C2938rg c2938rg = this.f39621a;
        C2938rg.a(c2938rg, ag, (InterfaceC2731jg) c2938rg.f39734e.getValue());
    }

    @Override // io.appmetrica.analytics.impl.Fg
    public final void a(@NotNull Throwable th) {
        C2938rg c2938rg = this.f39621a;
        C2938rg.a(c2938rg, null, (InterfaceC2731jg) c2938rg.f39734e.getValue());
    }
}
