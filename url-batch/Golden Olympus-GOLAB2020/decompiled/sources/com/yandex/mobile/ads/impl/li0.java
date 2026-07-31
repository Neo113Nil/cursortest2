package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.ironsource.InterfaceC1490j3;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class li0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final cj0 f28596a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bj0 f28597b;

    public /* synthetic */ li0(Context context, cj0 cj0Var) {
        this(context, cj0Var, new bj0(context));
    }

    @Nullable
    public final ej0 a(@NotNull Map<String, Bitmap> imageValues, @Nullable MediatedNativeAdImage mediatedNativeAdImage) {
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        if (mediatedNativeAdImage != null) {
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            this.f28596a.getClass();
            if (width > 0 && height > 0) {
                return new ej0(width, height, url, this.f28597b.a(width, height), InterfaceC1490j3.d.b.f16818j);
            }
            Bitmap bitmap = imageValues.get(url);
            if (bitmap != null) {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                return new ej0(width2, height2, url, this.f28597b.a(width2, height2), InterfaceC1490j3.d.b.f16818j);
            }
        }
        return null;
    }

    public li0(@NotNull Context context, @NotNull cj0 imageSizeValidator, @NotNull bj0 imageSizeTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageSizeValidator, "imageSizeValidator");
        Intrinsics.checkNotNullParameter(imageSizeTypeProvider, "imageSizeTypeProvider");
        this.f28596a = imageSizeValidator;
        this.f28597b = imageSizeTypeProvider;
    }
}
