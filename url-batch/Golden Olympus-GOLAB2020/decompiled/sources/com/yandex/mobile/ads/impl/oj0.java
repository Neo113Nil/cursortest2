package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface oj0 {

    public static final class a implements oj0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, Bitmap> f30061a;

        public a(@NotNull Map<String, Bitmap> images) {
            Intrinsics.checkNotNullParameter(images, "images");
            this.f30061a = images;
        }

        @NotNull
        public final Map<String, Bitmap> a() {
            return this.f30061a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f30061a, ((a) obj).f30061a);
        }

        public final int hashCode() {
            return this.f30061a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(images=" + this.f30061a + ")";
        }
    }
}
