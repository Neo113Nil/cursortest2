package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.z61;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.rg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2208rg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Collection<String> f31181a;

    public /* synthetic */ C2208rg() {
        this(CollectionsKt.emptyList());
    }

    @NotNull
    public final z61 a(@NotNull View view, @NotNull x31 viewProvider) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        z61.a aVar = new z61.a(view, t71.f32234c, MapsKt.emptyMap());
        z61.a e4 = aVar.a(viewProvider.h(view)).b(viewProvider.a(view)).c(viewProvider.e(view)).d(viewProvider.n(view)).a(viewProvider.g(view)).b(viewProvider.l(view)).c(viewProvider.o(view)).a(viewProvider.c(view)).a(viewProvider.b(view)).a(viewProvider.k(view)).e(viewProvider.d(view));
        View i4 = viewProvider.i(view);
        if (!(i4 instanceof gn1)) {
            i4 = null;
        }
        e4.a(i4).f(viewProvider.p(view)).g(viewProvider.m(view)).h(viewProvider.j(view)).i(viewProvider.f(view));
        for (String str : this.f31181a) {
            View a4 = viewProvider.a(view, str);
            if (a4 != null) {
                aVar.a(a4, str);
            }
        }
        return new z61(aVar);
    }

    public C2208rg(@NotNull Collection<String> supportedAssetNames) {
        Intrinsics.checkNotNullParameter(supportedAssetNames, "supportedAssetNames");
        this.f31181a = supportedAssetNames;
    }
}
