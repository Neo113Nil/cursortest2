package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3313G;
import o2.AbstractC3333i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x2.AbstractC3517c;
import x2.InterfaceC3515a;

/* loaded from: classes3.dex */
public final class mx implements kx {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vr0 f29292a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io1 f29293b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rw f29294c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC3313G f29295d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private gx f29296e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC3515a f29297f;

    public mx(@NotNull vr0 localDataSource, @NotNull io1 remoteDataSource, @NotNull rw dataMerger, @NotNull AbstractC3313G ioDispatcher) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(dataMerger, "dataMerger");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f29292a = localDataSource;
        this.f29293b = remoteDataSource;
        this.f29294c = dataMerger;
        this.f29295d = ioDispatcher;
        this.f29297f = AbstractC3517c.b(false, 1, null);
    }

    @Override // com.yandex.mobile.ads.impl.kx
    @Nullable
    public final Object a(boolean z4, @NotNull kotlin.coroutines.jvm.internal.d dVar) {
        return AbstractC3333i.g(this.f29295d, new lx(this, z4, null), dVar);
    }

    @Override // com.yandex.mobile.ads.impl.kx
    public final boolean a() {
        return this.f29292a.a().c().a();
    }

    @Override // com.yandex.mobile.ads.impl.kx
    public final void a(boolean z4) {
        this.f29292a.a(z4);
    }
}
