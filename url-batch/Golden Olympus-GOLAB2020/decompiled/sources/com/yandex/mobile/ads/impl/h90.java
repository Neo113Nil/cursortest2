package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f26670a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x20 f26671b;

    public /* synthetic */ h90(C2286v2 c2286v2) {
        this(c2286v2, new x20());
    }

    @Nullable
    public final g90 a(@NotNull Context context, @NotNull List<pk1> preloadedDivKitDesigns) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        this.f26671b.getClass();
        if (x20.a(context)) {
            Iterator<T> it = preloadedDivKitDesigns.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((pk1) obj).c().e(), w00.f33851c.a())) {
                    break;
                }
            }
            pk1 pk1Var = (pk1) obj;
            if (pk1Var != null) {
                return new g90(pk1Var, this.f26670a, new b20(), new qq0());
            }
        }
        return null;
    }

    public h90(@NotNull C2286v2 adConfiguration, @NotNull x20 divKitIntegrationValidator) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(divKitIntegrationValidator, "divKitIntegrationValidator");
        this.f26670a = adConfiguration;
        this.f26671b = divKitIntegrationValidator;
    }
}
