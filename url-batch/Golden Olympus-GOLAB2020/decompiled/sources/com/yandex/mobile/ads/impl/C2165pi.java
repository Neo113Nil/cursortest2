package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2165pi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30453a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x20 f30454b;

    public /* synthetic */ C2165pi(C2286v2 c2286v2) {
        this(c2286v2, new x20());
    }

    @Nullable
    public final C2142oi a(@NotNull Context context, @NotNull f61 nativeAdPrivate) {
        q20 q20Var;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        this.f30454b.getClass();
        if (x20.a(context)) {
            List<q20> c4 = nativeAdPrivate.c();
            if (c4 != null) {
                Iterator<T> it = c4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((q20) obj).e(), w00.f33851c.a())) {
                        break;
                    }
                }
                q20Var = (q20) obj;
            } else {
                q20Var = null;
            }
            if (q20Var != null) {
                C1165z4 b4 = q20Var.b();
                C2286v2 c2286v2 = this.f30453a;
                return new C2142oi(b4, c2286v2, new b20(), new l10(c2286v2.p().c(), new tz1()), new qq0());
            }
        }
        return null;
    }

    public C2165pi(@NotNull C2286v2 adConfiguration, @NotNull x20 divKitIntegrationValidator) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(divKitIntegrationValidator, "divKitIntegrationValidator");
        this.f30453a = adConfiguration;
        this.f30454b = divKitIntegrationValidator;
    }
}
