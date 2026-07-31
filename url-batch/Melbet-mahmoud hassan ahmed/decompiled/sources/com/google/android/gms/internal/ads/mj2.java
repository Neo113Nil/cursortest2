package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mj2<T> implements kv3<lj2<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f8603a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Set<ij2<? extends hj2<T>>>> f8604b;

    public mj2(yv3<Executor> yv3Var, yv3<Set<ij2<? extends hj2<T>>>> yv3Var2) {
        this.f8603a = yv3Var;
        this.f8604b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lj2<T> a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new lj2<>(dc3Var, ((wv3) this.f8604b).a());
    }
}
