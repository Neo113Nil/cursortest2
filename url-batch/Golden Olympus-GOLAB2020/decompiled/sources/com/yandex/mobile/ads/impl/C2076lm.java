package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2076lm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28643a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2076lm(Context context) {
        this(context, r0);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    @Nullable
    public final Bitmap a(@NotNull ej0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        d82 c4 = wc1.f34002c.a(this.f28643a).c();
        String f4 = imageValue.f();
        Bitmap a4 = c4.a(f4);
        if (a4 == null || a4.getWidth() != 1 || a4.getHeight() != 1) {
            return a4;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a4, imageValue.g(), imageValue.a(), false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        c4.a(f4, createScaledBitmap);
        return createScaledBitmap;
    }

    public C2076lm(@NotNull Context context, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f28643a = appContext;
    }
}
