package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ra1 implements xa1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<xa1> f31101a = new CopyOnWriteArrayList<>();

    public final void a(@NotNull xa1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31101a.add(listener);
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void b() {
        Iterator<xa1> it = this.f31101a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a(long j4, long j5) {
        Iterator<xa1> it = this.f31101a.iterator();
        while (it.hasNext()) {
            it.next().a(j4, j5);
        }
    }

    public final void b(@NotNull xa1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31101a.remove(listener);
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a() {
        Iterator<xa1> it = this.f31101a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
