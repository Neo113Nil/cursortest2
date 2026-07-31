package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fc1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f25746a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f25747b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f25748c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final dr0 f25749d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final lj0 f25750e;

    public /* synthetic */ fc1(C2286v2 c2286v2, C2360y7 c2360y7, List list, dr0 dr0Var) {
        this(c2286v2, c2360y7, list, dr0Var, new lj0());
    }

    public final boolean a() {
        if (!this.f25746a.t()) {
            return false;
        }
        if (!this.f25747b.R()) {
            return true;
        }
        Set<ej0> a4 = this.f25750e.a(this.f25748c, this.f25749d);
        if (a4.isEmpty()) {
            return false;
        }
        Iterator<T> it = a4.iterator();
        while (it.hasNext()) {
            if (!((ej0) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fc1(@NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull List<? extends C2276uf<?>> assets, @Nullable dr0 dr0Var, @NotNull lj0 imageValuesProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(imageValuesProvider, "imageValuesProvider");
        this.f25746a = adConfiguration;
        this.f25747b = adResponse;
        this.f25748c = assets;
        this.f25749d = dr0Var;
        this.f25750e = imageValuesProvider;
    }
}
