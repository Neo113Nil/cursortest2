package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ex0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<e51, Object> f25488a = new WeakHashMap<>();

    public final void a(@NotNull e51 nativeAdEventController) {
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        this.f25488a.put(nativeAdEventController, null);
    }

    public final void b() {
        for (e51 e51Var : this.f25488a.keySet()) {
            e51Var.c();
            e51Var.a();
        }
    }

    public final void c() {
        Iterator<e51> it = this.f25488a.keySet().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public final void d() {
        Iterator<e51> it = this.f25488a.keySet().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public final void a() {
        Iterator<e51> it = this.f25488a.keySet().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void a(@Nullable C1795a4 c1795a4) {
        Iterator<e51> it = this.f25488a.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(c1795a4);
        }
    }
}
