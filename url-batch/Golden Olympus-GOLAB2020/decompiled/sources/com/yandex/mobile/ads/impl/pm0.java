package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pm0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final List<C2276uf<?>> f30490a;

    /* JADX WARN: Multi-variable type inference failed */
    public pm0(@Nullable List<? extends C2276uf<?>> list) {
        this.f30490a = list;
    }

    @Nullable
    public final C2276uf<?> a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        List<C2276uf<?>> list = this.f30490a;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((C2276uf) next).b(), assetName)) {
                obj = next;
                break;
            }
        }
        return (C2276uf) obj;
    }
}
