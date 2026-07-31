package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xi0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vk1 f34575a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wk1 f34576b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1980hl f34577c;

    public /* synthetic */ xi0() {
        this(new vk1(), new wk1(), new C1980hl());
    }

    @Nullable
    public final Bitmap a(@NotNull ej0 imageValue) {
        Object m243constructorimpl;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String c4 = imageValue.c();
        if (c4 == null) {
            return null;
        }
        this.f34575a.getClass();
        Bitmap a4 = vk1.a(c4);
        if (a4 != null) {
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(this.f34576b.a(a4, imageValue));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            bitmap = (Bitmap) m243constructorimpl;
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        this.f34577c.getClass();
        return C1980hl.a(bitmap, 1.0d);
    }

    public xi0(@NotNull vk1 previewBitmapCreator, @NotNull wk1 previewBitmapScaler, @NotNull C1980hl blurredBitmapProvider) {
        Intrinsics.checkNotNullParameter(previewBitmapCreator, "previewBitmapCreator");
        Intrinsics.checkNotNullParameter(previewBitmapScaler, "previewBitmapScaler");
        Intrinsics.checkNotNullParameter(blurredBitmapProvider, "blurredBitmapProvider");
        this.f34575a = previewBitmapCreator;
        this.f34576b = previewBitmapScaler;
        this.f34577c = blurredBitmapProvider;
    }
}
