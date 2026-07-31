package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wb1 implements re1, f11 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<xb1> f33987a = new CopyOnWriteArrayList<>();

    public final void a(@NotNull xb1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33987a.add(listener);
    }

    public final void b(@NotNull xb1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f33987a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.re1
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.f11
    public final void a() {
        Iterator<xb1> it = this.f33987a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.re1
    public final void a(boolean z4) {
        Iterator<xb1> it = this.f33987a.iterator();
        while (it.hasNext()) {
            it.next().a(z4);
        }
    }
}
