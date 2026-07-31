package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2757kg implements Fg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2938rg f39351a;

    public C2757kg(C2938rg c2938rg) {
        this.f39351a = c2938rg;
    }

    @Override // io.appmetrica.analytics.impl.Fg
    public final void a(@Nullable Ag ag) {
        C2938rg c2938rg = this.f39351a;
        C2938rg.a(c2938rg, ag, (InterfaceC2731jg) c2938rg.f39733d.getValue());
    }

    @Override // io.appmetrica.analytics.impl.Fg
    public final void a(@NotNull Throwable th) {
        C2938rg c2938rg = this.f39351a;
        C2938rg.a(c2938rg, null, (InterfaceC2731jg) c2938rg.f39733d.getValue());
    }
}
