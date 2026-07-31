package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jj0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gj0 f27699a = new gj0();

    public final void a(@NotNull List<? extends C2276uf<?>> assets, @NotNull Map<String, Bitmap> images) {
        List<ej0> a4;
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(images, "images");
        for (C2276uf<?> c2276uf : assets) {
            Object d4 = c2276uf.d();
            if (Intrinsics.areEqual(c2276uf.c(), b9.h.f15446I0) && (d4 instanceof mw0) && (a4 = ((mw0) d4).a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : a4) {
                    this.f27699a.getClass();
                    if (gj0.a((ej0) obj, images)) {
                        arrayList.add(obj);
                    }
                }
                a4.retainAll(arrayList);
            }
        }
    }
}
