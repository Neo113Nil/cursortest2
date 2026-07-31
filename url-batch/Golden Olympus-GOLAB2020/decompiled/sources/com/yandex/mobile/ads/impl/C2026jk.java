package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.jk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2026jk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yz1 f27701a = new yz1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Nullable
    public final xz1 a(@NotNull RectF viewSize, @NotNull ej0 imageValue) {
        List<xz1> c4;
        Intrinsics.checkNotNullParameter(viewSize, "viewRect");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        RectF imageSize = new RectF(0.0f, 0.0f, imageValue.g(), imageValue.a());
        f02 e4 = imageValue.e();
        Object first = 0;
        if (e4 == null || (c4 = e4.c()) == null) {
            return null;
        }
        Iterator<T> it = c4.iterator();
        if (it.hasNext()) {
            first = it.next();
            while (it.hasNext()) {
                xz1 second = (xz1) it.next();
                first = (xz1) first;
                this.f27701a.getClass();
                Intrinsics.checkNotNullParameter(first, "first");
                Intrinsics.checkNotNullParameter(second, "second");
                Intrinsics.checkNotNullParameter(imageSize, "imageSize");
                Intrinsics.checkNotNullParameter(viewSize, "viewSize");
                float a4 = b02.a(first, viewSize, imageSize);
                float a5 = b02.a(second, viewSize, imageSize);
                if (a4 != Float.MAX_VALUE) {
                    if (a4 == a5) {
                        if (first.a() > second.a()) {
                        }
                    } else if (a4 > a5) {
                    }
                }
                first = second;
            }
        }
        return (xz1) first;
    }
}
