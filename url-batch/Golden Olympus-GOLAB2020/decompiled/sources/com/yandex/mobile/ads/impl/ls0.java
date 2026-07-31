package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ls0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final js0 f28728a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lg1 f28729b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private ks0 f28730c;

    public /* synthetic */ ls0(Context context, String str) {
        this(context, str, new js0(context, str), new lg1(context), null);
    }

    private final ks0 a() {
        wd0 a4 = this.f28728a.a();
        if (a4 == null) {
            return null;
        }
        boolean a5 = this.f28729b.a();
        boolean b4 = this.f28729b.b();
        if (a5 || b4) {
            return a4.a();
        }
        return null;
    }

    @Nullable
    public final ks0 b() {
        ks0 ks0Var = this.f28730c;
        return ks0Var != null ? ks0Var : a();
    }

    public final void c() {
        this.f28730c = a();
        this.f28730c = a();
    }

    public ls0(@NotNull Context context, @NotNull String locationServicesClassName, @NotNull js0 locationServices, @NotNull lg1 permissionExtractor, @Nullable ks0 ks0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(locationServices, "locationServices");
        Intrinsics.checkNotNullParameter(permissionExtractor, "permissionExtractor");
        this.f28728a = locationServices;
        this.f28729b = permissionExtractor;
        this.f28730c = ks0Var;
    }
}
