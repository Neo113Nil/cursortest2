package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d02 f23111a = new d02();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2393zh f23112b = new C2393zh();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2026jk f23113c = new C2026jk();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private c02 f23114d;

    public final void a(@NotNull ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this.f23114d);
    }

    public final void a(@NotNull Bitmap originalBitmap, @NotNull ImageView view, @NotNull ej0 imageValue) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        c02 c02Var = new c02(this.f23112b, this.f23113c, this.f23111a, imageValue, originalBitmap);
        this.f23114d = c02Var;
        view.addOnLayoutChangeListener(c02Var);
        if (view.getLayoutParams().width == -1 || view.getLayoutParams().height == -1 || view.getLayoutParams().width == -2 || view.getLayoutParams().height == -2) {
            view.setImageBitmap(originalBitmap);
        }
    }
}
