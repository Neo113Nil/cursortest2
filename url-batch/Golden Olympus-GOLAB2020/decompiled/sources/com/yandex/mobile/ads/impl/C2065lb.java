package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.lb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2065lb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28499a;

    public C2065lb(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28499a = context;
    }

    public final void a(@Nullable String str) {
        if (str != null) {
            C2089mb c2089mb = new C2089mb(this.f28499a);
            Context context = this.f28499a;
            new C2017jb(new C2041kb(c2089mb, context, new C1994ib(context, c2089mb), new C1922fb()).a(), c2089mb).a(str);
        }
    }
}
