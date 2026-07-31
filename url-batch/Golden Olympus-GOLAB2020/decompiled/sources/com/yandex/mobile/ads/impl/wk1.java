package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import j2.AbstractC3185a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wk1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2002ik f34103a;

    public /* synthetic */ wk1() {
        this(new C2002ik());
    }

    @NotNull
    public final Bitmap a(@NotNull Bitmap bitmap, @NotNull ej0 imageValue) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || imageValue.g() == 0 || imageValue.a() == 0) {
            return bitmap;
        }
        if (imageValue.a() * bitmap.getWidth() == bitmap.getHeight() * imageValue.g()) {
            return bitmap;
        }
        this.f34103a.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        uy1 size = new uy1(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && imageValue.g() != 0 && imageValue.a() != 0) {
            Iterator it = new IntRange(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (imageValue.g() * 100) / imageValue.a()))).iterator();
            double d4 = 1.0d;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int a4 = ((kotlin.collections.E) it).a();
                if ((imageValue.a() * a4) % imageValue.g() == 0) {
                    size = new uy1(a4, (imageValue.a() * a4) / imageValue.g());
                    break;
                }
                double a5 = (imageValue.a() * a4) / imageValue.g();
                int b4 = AbstractC3185a.b(a5);
                double abs = Math.abs(b4 - a5) / a5;
                if (abs < d4) {
                    size = new uy1(a4, b4);
                    d4 = abs;
                }
            }
        }
        uy1 uy1Var = new uy1(bitmap.getWidth(), bitmap.getHeight());
        Intrinsics.checkNotNullParameter(uy1Var, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        uy1 uy1Var2 = (uy1) Z1.a.i(new uy1(size.b(), (uy1Var.a() * size.b()) / uy1Var.b()), new uy1((uy1Var.b() * size.a()) / uy1Var.a(), size.a()));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, uy1Var2.b(), uy1Var2.a(), false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (createScaledBitmap.getWidth() - size.b()) / 2, (createScaledBitmap.getHeight() - size.a()) / 2, size.b(), size.a(), (Matrix) null, false);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    public wk1(@NotNull C2002ik bestSizeForScalePreviewCalculator) {
        Intrinsics.checkNotNullParameter(bestSizeForScalePreviewCalculator, "bestSizeForScalePreviewCalculator");
        this.f34103a = bestSizeForScalePreviewCalculator;
    }
}
