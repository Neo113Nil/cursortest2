package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2393zh {
    @Nullable
    public static String a(@NotNull RectF viewRect, @NotNull ej0 imageValue) {
        C1833bi a4;
        xz1 b4;
        float width;
        int c4;
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        f02 e4 = imageValue.e();
        if (e4 == null || (a4 = e4.a()) == null || (b4 = imageValue.e().b()) == null) {
            return null;
        }
        float width2 = viewRect.width();
        float height = viewRect.height();
        float g4 = imageValue.g();
        float a5 = imageValue.a();
        float c5 = b4.c();
        float b5 = b4.b();
        if (width2 == 0.0f || height == 0.0f || g4 == 0.0f || a5 == 0.0f || c5 == 0.0f || b5 == 0.0f) {
            return null;
        }
        if (viewRect.width() / viewRect.height() > b4.c() / b4.b()) {
            width = viewRect.height();
            c4 = b4.b();
        } else {
            width = viewRect.width();
            c4 = b4.c();
        }
        if (width / c4 <= 1.0f) {
            if (width2 / height > c5 / b5) {
                if (Intrinsics.areEqual(a4.c(), a4.b())) {
                    return a4.c();
                }
            } else if (Intrinsics.areEqual(a4.d(), a4.a())) {
                return a4.d();
            }
        } else if (width2 / height > g4 / a5) {
            if (Intrinsics.areEqual(a4.c(), a4.b())) {
                return a4.c();
            }
        } else if (Intrinsics.areEqual(a4.d(), a4.a())) {
            return a4.d();
        }
        return null;
    }
}
