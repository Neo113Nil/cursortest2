package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2185qf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f30758a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2185qf() {
        this(r0);
        InterfaceC3316J a4;
        a4 = fu.a((j50) null);
    }

    public final void a(@NotNull Context context, @NotNull um2 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        AbstractC3337k.d(this.f30758a, null, null, new C2162pf(context, sdkEnvironmentModule, null), 3, null);
    }

    public C2185qf(@NotNull InterfaceC3316J coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f30758a = coroutineScope;
    }
}
