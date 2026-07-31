package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yo implements InterfaceC2237t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35272a;

    public yo(@NotNull String actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f35272a = actionType;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2237t
    @NotNull
    public final String a() {
        return this.f35272a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo) && Intrinsics.areEqual(this.f35272a, ((yo) obj).f35272a);
    }

    public final int hashCode() {
        return this.f35272a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CloseAction(actionType=" + this.f35272a + ")";
    }
}
