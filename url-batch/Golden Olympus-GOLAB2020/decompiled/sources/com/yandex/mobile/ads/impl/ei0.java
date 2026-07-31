package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ei0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d50 f25309a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2264u3 f25310b;

    public ei0(@NotNull d50 environmentConfiguration, @NotNull C2264u3 adHostConfigurator) {
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(adHostConfigurator, "adHostConfigurator");
        this.f25309a = environmentConfiguration;
        this.f25310b = adHostConfigurator;
    }

    public final void a(@NotNull Context context, @NotNull di0 identifiers) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        C2138oe identifiers2 = identifiers.a();
        String c4 = identifiers.c();
        ii0 identifiersType = identifiers.b();
        C2264u3 c2264u3 = this.f25310b;
        c2264u3.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifiers2, "identifiers");
        Intrinsics.checkNotNullParameter(identifiersType, "identifiersType");
        int ordinal = identifiersType.ordinal();
        if (ordinal == 0) {
            a4 = c2264u3.a(context);
        } else {
            if (ordinal != 1) {
                throw new W1.m();
            }
            a4 = identifiers2.a();
            if (a4 == null) {
                a4 = c2264u3.a(context);
            }
        }
        this.f25309a.a(a4);
        this.f25309a.b(identifiers2.b());
        this.f25309a.d(identifiers2.c());
        this.f25309a.c(c4);
    }
}
