package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c20 implements InterfaceC2143oj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f24030a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q20 f24031b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f24032c;

    public c20(@NotNull String actionType, @NotNull q20 design, @NotNull ArrayList trackingUrls) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f24030a = actionType;
        this.f24031b = design;
        this.f24032c = trackingUrls;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2237t
    @NotNull
    public final String a() {
        return this.f24030a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2143oj
    @NotNull
    public final List<String> b() {
        return this.f24032c;
    }

    @NotNull
    public final q20 c() {
        return this.f24031b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c20)) {
            return false;
        }
        c20 c20Var = (c20) obj;
        return Intrinsics.areEqual(this.f24030a, c20Var.f24030a) && Intrinsics.areEqual(this.f24031b, c20Var.f24031b) && Intrinsics.areEqual(this.f24032c, c20Var.f24032c);
    }

    public final int hashCode() {
        return this.f24032c.hashCode() + ((this.f24031b.hashCode() + (this.f24030a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DivKitAdtuneAction(actionType=" + this.f24030a + ", design=" + this.f24031b + ", trackingUrls=" + this.f24032c + ")";
    }
}
