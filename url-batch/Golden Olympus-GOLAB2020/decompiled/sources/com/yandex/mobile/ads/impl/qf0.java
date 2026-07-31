package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qf0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f30759a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final us0 f30760b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf0() {
        this(ew1.a.a(), new us0());
        int i4 = ew1.f25476l;
    }

    @NotNull
    public final List<String> a(@NotNull Context context) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        du1 a5 = this.f30759a.a(context);
        if (a5 == null || (a4 = a5.a()) == null) {
            return CollectionsKt.emptyList();
        }
        this.f30760b.getClass();
        List<String> b4 = us0.b(context);
        if (b4 == null) {
            b4 = a5.w();
        }
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(a4), (Iterable) b4);
    }

    public qf0(@NotNull ew1 sdkSettings, @NotNull us0 manifestAnalyzer) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(manifestAnalyzer, "manifestAnalyzer");
        this.f30759a = sdkSettings;
        this.f30760b = manifestAnalyzer;
    }
}
