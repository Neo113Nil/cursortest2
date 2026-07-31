package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s30 implements InterfaceC1860cl<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gt1 f31549a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1932fl f31550b;

    public s30(@NotNull gt1 scaledDrawableBitmapProvider, @NotNull C1932fl bitmapProvider) {
        Intrinsics.checkNotNullParameter(scaledDrawableBitmapProvider, "scaledDrawableBitmapProvider");
        Intrinsics.checkNotNullParameter(bitmapProvider, "bitmapProvider");
        this.f31549a = scaledDrawableBitmapProvider;
        this.f31550b = bitmapProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1860cl
    public final boolean a(@NotNull Drawable drawable, @NotNull Bitmap src) {
        Bitmap src2;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(src, "bitmap");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                src2 = bitmapDrawable.getBitmap();
                Intrinsics.checkNotNullExpressionValue(src2, "getBitmap(...)");
                this.f31550b.getClass();
                Intrinsics.checkNotNullParameter(src2, "src");
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(src2, 1, 1, true);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                this.f31550b.getClass();
                Intrinsics.checkNotNullParameter(src, "src");
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(src, 1, 1, true);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap2, "createScaledBitmap(...)");
                a aVar = new a(createScaledBitmap.getPixel(0, 0));
                a aVar2 = new a(createScaledBitmap2.getPixel(0, 0));
                return Math.abs(aVar.a() - aVar2.a()) <= 20 && Math.abs(aVar.d() - aVar2.d()) <= 20 && Math.abs(aVar.c() - aVar2.c()) <= 20 && Math.abs(aVar.b() - aVar2.b()) <= 20;
            }
        }
        src2 = this.f31549a.a(drawable);
        this.f31550b.getClass();
        Intrinsics.checkNotNullParameter(src2, "src");
        Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(src2, 1, 1, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap3, "createScaledBitmap(...)");
        this.f31550b.getClass();
        Intrinsics.checkNotNullParameter(src, "src");
        Bitmap createScaledBitmap22 = Bitmap.createScaledBitmap(src, 1, 1, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap22, "createScaledBitmap(...)");
        a aVar3 = new a(createScaledBitmap3.getPixel(0, 0));
        a aVar22 = new a(createScaledBitmap22.getPixel(0, 0));
        if (Math.abs(aVar3.a() - aVar22.a()) <= 20) {
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f31551a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31552b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31553c;

        /* renamed from: d, reason: collision with root package name */
        private final int f31554d;

        /* renamed from: e, reason: collision with root package name */
        private final int f31555e;

        public /* synthetic */ a(int i4) {
            this(i4, Color.alpha(i4), Color.red(i4), Color.green(i4), Color.blue(i4));
        }

        public final int a() {
            return this.f31552b;
        }

        public final int b() {
            return this.f31555e;
        }

        public final int c() {
            return this.f31554d;
        }

        public final int d() {
            return this.f31553c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31551a == aVar.f31551a && this.f31552b == aVar.f31552b && this.f31553c == aVar.f31553c && this.f31554d == aVar.f31554d && this.f31555e == aVar.f31555e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f31555e) + sx1.a(this.f31554d, sx1.a(this.f31553c, sx1.a(this.f31552b, Integer.hashCode(this.f31551a) * 31, 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            return "BitmapPixel(color=" + this.f31551a + ", alpha=" + this.f31552b + ", red=" + this.f31553c + ", green=" + this.f31554d + ", blue=" + this.f31555e + ")";
        }

        public a(int i4, int i5, int i6, int i7, int i8) {
            this.f31551a = i4;
            this.f31552b = i5;
            this.f31553c = i6;
            this.f31554d = i7;
            this.f31555e = i8;
        }
    }
}
