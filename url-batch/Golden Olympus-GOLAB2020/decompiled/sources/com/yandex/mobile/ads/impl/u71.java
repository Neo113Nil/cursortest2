package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u71 implements i41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i51 f32851a;

    public /* synthetic */ u71(vu1 vu1Var) {
        this(vu1Var, new i51(vu1Var));
    }

    @Override // com.yandex.mobile.ads.impl.i41
    public final void a(@NotNull Context context, @NotNull h41 nativeAdBlock, @NotNull zi0 imageProvider, @NotNull g41 nativeAdBinderFactory, @NotNull h51 h51Var, @NotNull t41 t41Var, @NotNull v41 nativeAdCreationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdBinderFactory, "nativeAdBinderFactory");
        h51 nativeAdFactoriesProvider = h51Var;
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        t41 nativeAdControllers = t41Var;
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(nativeAdCreationListener, "nativeAdCreationListener");
        List<u31> e4 = nativeAdBlock.c().e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = e4.iterator();
        while (it.hasNext()) {
            f61 a4 = this.f32851a.a(context, nativeAdBlock, imageProvider, nativeAdBinderFactory, nativeAdFactoriesProvider, nativeAdControllers, (u31) it.next());
            if (a4 != null) {
                arrayList.add(a4);
            }
            nativeAdFactoriesProvider = h51Var;
            nativeAdControllers = t41Var;
        }
        if (arrayList.isEmpty()) {
            nativeAdCreationListener.a(C1942g7.x());
        } else {
            nativeAdCreationListener.a(arrayList);
        }
    }

    public u71(@NotNull vu1 sdkEnvironmentModule, @NotNull i51 nativeAdFactory) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(nativeAdFactory, "nativeAdFactory");
        this.f32851a = nativeAdFactory;
    }
}
