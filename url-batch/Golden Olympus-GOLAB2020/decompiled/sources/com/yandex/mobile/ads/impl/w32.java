package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class w32 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33911a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33912b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private z32 f33913c;

    /* renamed from: d, reason: collision with root package name */
    private long f33914d;

    public /* synthetic */ w32(String str) {
        this(str, true);
    }

    public final boolean a() {
        return this.f33912b;
    }

    @NotNull
    public final String b() {
        return this.f33911a;
    }

    public final long c() {
        return this.f33914d;
    }

    @Nullable
    public final z32 d() {
        return this.f33913c;
    }

    public abstract long e();

    @NotNull
    public final String toString() {
        return this.f33911a;
    }

    public w32(@NotNull String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f33911a = name;
        this.f33912b = z4;
        this.f33914d = -1L;
    }

    public final void a(@NotNull z32 queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        z32 z32Var = this.f33913c;
        if (z32Var == queue) {
            return;
        }
        if (z32Var != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f33913c = queue;
    }

    public final void a(long j4) {
        this.f33914d = j4;
    }
}
