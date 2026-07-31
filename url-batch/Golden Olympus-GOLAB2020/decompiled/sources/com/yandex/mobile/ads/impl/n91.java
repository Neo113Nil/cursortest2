package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r61 f29524a;

    public /* synthetic */ n91(Context context, mp1 mp1Var) {
        this(context, mp1Var, new r61(context, mp1Var));
    }

    @Nullable
    public final n61 a(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        String I3 = adResponse.I();
        if (I3 == null || I3.length() == 0) {
            return null;
        }
        return this.f29524a.a(I3, new C1858cj(adResponse, adResponse.C(), adResponse.y()));
    }

    public n91(@NotNull Context context, @NotNull mp1 reporter, @NotNull r61 nativeAdResponseParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdResponseParser, "nativeAdResponseParser");
        this.f29524a = nativeAdResponseParser;
    }
}
