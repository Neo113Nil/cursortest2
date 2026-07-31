package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c02 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2393zh f23994a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2026jk f23995b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d02 f23996c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ej0 f23997d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Bitmap f23998e;

    public c02(@NotNull C2393zh axisBackgroundColorProvider, @NotNull C2026jk bestSmartCenterProvider, @NotNull d02 smartCenterMatrixScaler, @NotNull ej0 imageValue, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(axisBackgroundColorProvider, "axisBackgroundColorProvider");
        Intrinsics.checkNotNullParameter(bestSmartCenterProvider, "bestSmartCenterProvider");
        Intrinsics.checkNotNullParameter(smartCenterMatrixScaler, "smartCenterMatrixScaler");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f23994a = axisBackgroundColorProvider;
        this.f23995b = bestSmartCenterProvider;
        this.f23996c = smartCenterMatrixScaler;
        this.f23997d = imageValue;
        this.f23998e = bitmap;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Nullable View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        C1833bi a4;
        xz1 b4;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        boolean z4 = (i6 - i4 == i10 - i8 && i7 - i5 == i11 - i9) ? false : true;
        boolean z5 = (i7 == i5 || i4 == i6) ? false : true;
        if (z4 && z5) {
            RectF rectF = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
            if (rectF.height() == 0.0f) {
                return;
            }
            C2393zh c2393zh = this.f23994a;
            ej0 imageValue = this.f23997d;
            c2393zh.getClass();
            Intrinsics.checkNotNullParameter(imageValue, "imageValue");
            f02 e4 = imageValue.e();
            if (e4 != null && (a4 = e4.a()) != null) {
                boolean z6 = (a4.a() == null || a4.d() == null || !Intrinsics.areEqual(a4.a(), a4.d())) ? false : true;
                boolean z7 = (a4.b() == null || a4.c() == null || !Intrinsics.areEqual(a4.b(), a4.c())) ? false : true;
                if (z6 || z7) {
                    C2393zh c2393zh2 = this.f23994a;
                    ej0 ej0Var = this.f23997d;
                    c2393zh2.getClass();
                    String a5 = C2393zh.a(rectF, ej0Var);
                    f02 e5 = this.f23997d.e();
                    if (e5 == null || (b4 = e5.b()) == null) {
                        return;
                    }
                    if (a5 != null) {
                        this.f23996c.a(imageView, this.f23998e, b4, a5);
                        return;
                    } else {
                        this.f23996c.a(imageView, this.f23998e, b4);
                        return;
                    }
                }
            }
            xz1 a6 = this.f23995b.a(rectF, this.f23997d);
            if (a6 != null) {
                this.f23996c.a(imageView, this.f23998e, a6);
            }
        }
    }
}
