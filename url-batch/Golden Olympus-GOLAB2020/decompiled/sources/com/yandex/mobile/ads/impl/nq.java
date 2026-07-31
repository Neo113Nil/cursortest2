package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nq<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q00<V>[] f29726a;

    @SafeVarargs
    public nq(@NotNull q00<V>... designComponentBinders) {
        Intrinsics.checkNotNullParameter(designComponentBinders, "designComponentBinders");
        this.f29726a = designComponentBinders;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        for (q00<V> q00Var : this.f29726a) {
            q00Var.a(container);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        for (q00<V> q00Var : this.f29726a) {
            q00Var.c();
        }
    }
}
