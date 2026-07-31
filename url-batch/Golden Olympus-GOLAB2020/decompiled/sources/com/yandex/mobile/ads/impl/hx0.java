package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hx0<T extends com.monetization.ads.mediation.base.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<xy0> f26974a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final u70 f26975b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final kx0<T> f26976c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final cx0 f26977d;

    /* renamed from: e, reason: collision with root package name */
    private int f26978e;

    public /* synthetic */ hx0(List list, vx0 vx0Var, qx0 qx0Var) {
        this(list, vx0Var, qx0Var, new kx0(qx0Var), new cx0());
    }

    @Nullable
    public final yw0<T> a(@NotNull Context context, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        while (this.f26978e < this.f26974a.size()) {
            List<xy0> list = this.f26974a;
            int i4 = this.f26978e;
            this.f26978e = i4 + 1;
            xy0 xy0Var = list.get(i4);
            T mediatedAdapter = this.f26976c.a(context, xy0Var, clazz);
            if (mediatedAdapter != null) {
                this.f26977d.getClass();
                Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
                return new yw0<>(mediatedAdapter, xy0Var, new bx0(mediatedAdapter), this.f26975b);
            }
        }
        return null;
    }

    public hx0(@NotNull List mediationNetworks, @NotNull vx0 extrasCreator, @NotNull qx0 mediatedAdapterReporter, @NotNull kx0 mediatedAdapterCreator, @NotNull cx0 mediatedAdDataFactory) {
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(extrasCreator, "extrasCreator");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdapterCreator, "mediatedAdapterCreator");
        Intrinsics.checkNotNullParameter(mediatedAdDataFactory, "mediatedAdDataFactory");
        this.f26974a = mediationNetworks;
        this.f26975b = extrasCreator;
        this.f26976c = mediatedAdapterCreator;
        this.f26977d = mediatedAdDataFactory;
    }
}
