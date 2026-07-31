package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.o9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2133o9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2144ok f29945a;

    public C2133o9(@NotNull C2144ok biddingSettings) {
        Intrinsics.checkNotNullParameter(biddingSettings, "biddingSettings");
        this.f29945a = biddingSettings;
    }

    @Nullable
    public final rz0 a(@Nullable String str) {
        tz0 d4;
        List<qz0> e4;
        Object obj;
        tz0 d5 = this.f29945a.d();
        if (d5 != null && (d4 = this.f29945a.d()) != null && (e4 = d4.e()) != null) {
            Iterator<T> it = e4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((qz0) obj).d(), str)) {
                    break;
                }
            }
            qz0 qz0Var = (qz0) obj;
            if (qz0Var != null) {
                return new rz0(d5.d(), qz0Var.d(), qz0Var.e());
            }
        }
        return null;
    }
}
