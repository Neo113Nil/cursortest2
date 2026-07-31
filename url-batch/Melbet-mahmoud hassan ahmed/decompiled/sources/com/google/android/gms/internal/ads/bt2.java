package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class bt2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Deque<cc3<T>> f3520a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable<T> f3521b;

    /* renamed from: c, reason: collision with root package name */
    private final dc3 f3522c;

    public bt2(Callable<T> callable, dc3 dc3Var) {
        this.f3521b = callable;
        this.f3522c = dc3Var;
    }

    public final synchronized cc3<T> a() {
        c(1);
        return this.f3520a.poll();
    }

    public final synchronized void b(cc3<T> cc3Var) {
        this.f3520a.addFirst(cc3Var);
    }

    public final synchronized void c(int i7) {
        int size = i7 - this.f3520a.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f3520a.add(this.f3522c.E(this.f3521b));
        }
    }
}
