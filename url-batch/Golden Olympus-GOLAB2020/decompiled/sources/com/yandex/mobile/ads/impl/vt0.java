package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vt0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f33741c = new Object();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wt0 f33742a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ut0 f33743b;

    public vt0(@NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f33742a = new wt0(localStorage);
        this.f33743b = new ut0();
    }

    @NotNull
    public final String a() {
        String a4;
        synchronized (f33741c) {
            a4 = this.f33742a.a();
            if (a4 == null) {
                this.f33743b.getClass();
                a4 = ut0.a();
                this.f33742a.a(a4);
            }
        }
        return a4;
    }
}
