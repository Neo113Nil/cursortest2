package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vd0 implements gs0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ls0 f33581a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f33582b;

    public /* synthetic */ vd0(Context context, String str) {
        this(context, str, new ls0(context, str));
    }

    @Override // com.yandex.mobile.ads.impl.gs0
    @Nullable
    public final Location a() {
        Location location;
        synchronized (this.f33582b) {
            ks0 b4 = this.f33581a.b();
            if (b4 == null || !b4.b()) {
                location = null;
            } else {
                location = b4.a();
                this.f33581a.c();
            }
        }
        return location;
    }

    public vd0(@NotNull Context context, @NotNull String locationServicesClassName, @NotNull ls0 locationTaskManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(locationTaskManager, "locationTaskManager");
        this.f33581a = locationTaskManager;
        this.f33582b = new Object();
    }
}
