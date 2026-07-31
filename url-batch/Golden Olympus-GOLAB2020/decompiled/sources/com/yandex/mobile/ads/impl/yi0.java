package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yi0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zi0 f35147a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xi0 f35148b;

    public yi0(@NotNull zi0 imageProvider, @NotNull xi0 imagePreviewCreator) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imagePreviewCreator, "imagePreviewCreator");
        this.f35147a = imageProvider;
        this.f35148b = imagePreviewCreator;
    }

    public final void a(@NotNull Set<ej0> imageValues) {
        Bitmap a4;
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        ArrayList arrayList = new ArrayList();
        for (Object obj : imageValues) {
            if (((ej0) obj).c() != null && (!StringsKt.z(r2))) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ej0 ej0Var = (ej0) obj2;
            if (this.f35147a.a(ej0Var) == null && this.f35147a.b(ej0Var) == null && (a4 = this.f35148b.a(ej0Var)) != null) {
                this.f35147a.a(a4, ej0Var);
            }
        }
    }
}
