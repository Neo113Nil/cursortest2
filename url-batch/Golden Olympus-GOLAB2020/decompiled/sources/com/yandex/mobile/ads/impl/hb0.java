package com.yandex.mobile.ads.impl;

import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1353t;
import androidx.lifecycle.InterfaceC1354u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hb0 implements InterfaceC1354u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f26693a = new a();

    public static final class a extends AbstractC1346l {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC1346l.b f26694a = AbstractC1346l.b.STARTED;

        a() {
        }

        @Override // androidx.lifecycle.AbstractC1346l
        public final void addObserver(@NotNull InterfaceC1353t observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
        }

        @Override // androidx.lifecycle.AbstractC1346l
        @NotNull
        public final AbstractC1346l.b getCurrentState() {
            return this.f26694a;
        }

        @Override // androidx.lifecycle.AbstractC1346l
        public final void removeObserver(@NotNull InterfaceC1353t observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
        }
    }

    @Override // androidx.lifecycle.InterfaceC1354u
    @NotNull
    public final AbstractC1346l getLifecycle() {
        return this.f26693a;
    }
}
