package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2264u3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final us0 f32796a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2255th f32797b;

    public /* synthetic */ C2264u3() {
        this(new us0(), new C2255th());
    }

    @NotNull
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32796a.getClass();
        String a4 = us0.a(context);
        if (a4 == null) {
            a4 = this.f32797b.a(context);
        }
        return a(a4);
    }

    public C2264u3(@NotNull us0 manifestAnalyzer, @NotNull C2255th availableHostSelector) {
        Intrinsics.checkNotNullParameter(manifestAnalyzer, "manifestAnalyzer");
        Intrinsics.checkNotNullParameter(availableHostSelector, "availableHostSelector");
        this.f32796a = manifestAnalyzer;
        this.f32797b = availableHostSelector;
    }

    private static String a(String str) {
        return "https://" + str;
    }
}
