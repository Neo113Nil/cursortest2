package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.og, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2140og {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gj0 f30020a;

    public /* synthetic */ C2140og() {
        this(new gj0());
    }

    @NotNull
    public final ArrayList a(@NotNull List assets, @NotNull Map images) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(images, "images");
        ArrayList arrayList = new ArrayList();
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            C2276uf c2276uf = (C2276uf) it.next();
            Object d4 = c2276uf.d();
            String c4 = c2276uf.c();
            if (Intrinsics.areEqual("image", c4) && (d4 instanceof ej0)) {
                this.f30020a.getClass();
                if (gj0.a((ej0) d4, images)) {
                    arrayList.add(c2276uf);
                }
            } else {
                if (Intrinsics.areEqual(b9.h.f15446I0, c4) && (d4 instanceof mw0)) {
                    mw0 mw0Var = (mw0) d4;
                    if (mw0Var.a() != null) {
                        Intrinsics.checkNotNull(d4, "null cannot be cast to non-null type com.monetization.ads.network.model.MediaValue");
                        List<ej0> a4 = mw0Var.a();
                        ej0 ej0Var = a4 != null ? (ej0) CollectionsKt.firstOrNull((List) a4) : null;
                        ab2 c5 = mw0Var.c();
                        eu0 b4 = mw0Var.b();
                        if (c5 == null && b4 == null) {
                            if (ej0Var != null) {
                                this.f30020a.getClass();
                                if (gj0.a(ej0Var, images)) {
                                }
                            }
                        }
                        arrayList.add(c2276uf);
                    }
                }
                arrayList.add(c2276uf);
            }
        }
        return arrayList;
    }

    public C2140og(@NotNull gj0 imageValueValidator) {
        Intrinsics.checkNotNullParameter(imageValueValidator, "imageValueValidator");
        this.f30020a = imageValueValidator;
    }
}
