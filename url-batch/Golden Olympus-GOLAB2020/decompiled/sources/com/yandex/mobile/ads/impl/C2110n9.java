package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2110n9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2144ok f29520a;

    public C2110n9(@NotNull C2144ok biddingSettings) {
        Intrinsics.checkNotNullParameter(biddingSettings, "biddingSettings");
        this.f29520a = biddingSettings;
    }

    @Nullable
    public final C2063l9 a(@Nullable String str) {
        Object obj;
        Iterator<T> it = this.f29520a.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((C2063l9) obj).e(), str)) {
                break;
            }
        }
        return (C2063l9) obj;
    }
}
