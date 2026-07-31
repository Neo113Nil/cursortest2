package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC1822b7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private jg0 f23617b;

    public final void a(@Nullable jg0 jg0Var) {
        this.f23617b = jg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jg0 jg0Var = this.f23617b;
        if (jg0Var != null) {
            jg0Var.a(C1942g7.l());
        }
    }
}
