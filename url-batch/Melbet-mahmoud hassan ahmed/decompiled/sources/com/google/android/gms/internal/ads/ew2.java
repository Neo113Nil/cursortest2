package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class ew2<E> {

    /* renamed from: d, reason: collision with root package name */
    private static final cc3<?> f4790d = rb3.i(null);

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f4791a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f4792b;

    /* renamed from: c, reason: collision with root package name */
    private final fw2<E> f4793c;

    public ew2(dc3 dc3Var, ScheduledExecutorService scheduledExecutorService, fw2<E> fw2Var) {
        this.f4791a = dc3Var;
        this.f4792b = scheduledExecutorService;
        this.f4793c = fw2Var;
    }

    public final uv2 a(E e7, cc3<?>... cc3VarArr) {
        return new uv2(this, e7, Arrays.asList(cc3VarArr), null);
    }

    public final <I> dw2<I> b(E e7, cc3<I> cc3Var) {
        return new dw2<>(this, e7, cc3Var, Collections.singletonList(cc3Var), cc3Var);
    }

    protected abstract String f(E e7);
}
