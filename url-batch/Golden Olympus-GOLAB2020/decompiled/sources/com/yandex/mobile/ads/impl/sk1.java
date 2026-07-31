package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sk1 implements zi0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2076lm f31819a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f31820b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f31821c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f31822a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final uy1 f31823b;

        public a(@NotNull String base64, @NotNull uy1 size) {
            Intrinsics.checkNotNullParameter(base64, "base64");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f31822a = base64;
            this.f31823b = size;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f31822a, aVar.f31822a) && Intrinsics.areEqual(this.f31823b, aVar.f31823b);
        }

        public final int hashCode() {
            return this.f31823b.hashCode() + (this.f31822a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Preview(base64=" + this.f31822a + ", size=" + this.f31823b + ")";
        }
    }

    public /* synthetic */ sk1(Context context) {
        this(context, new C2076lm(context));
    }

    @Override // com.yandex.mobile.ads.impl.zi0
    public final void a(@NotNull String key, @NotNull Bitmap value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f31820b.put(key, value);
    }

    @Override // com.yandex.mobile.ads.impl.zi0
    @Nullable
    public final Bitmap b(@NotNull ej0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String f4 = imageValue.f();
        Bitmap bitmap = (Bitmap) this.f31820b.get(f4);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap a4 = this.f31819a.a(imageValue);
        if (a4 == null) {
            return null;
        }
        this.f31820b.put(f4, a4);
        return a4;
    }

    public sk1(@NotNull Context context, @NotNull C2076lm cacheImageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheImageProvider, "cacheImageProvider");
        this.f31819a = cacheImageProvider;
        this.f31820b = new LinkedHashMap();
        this.f31821c = new LinkedHashMap();
    }

    @Override // com.yandex.mobile.ads.impl.zi0
    public final void a(@NotNull Map<String, Bitmap> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f31820b.putAll(images);
    }

    @Override // com.yandex.mobile.ads.impl.zi0
    public final void a(@NotNull Bitmap value, @NotNull ej0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String c4 = key.c();
        a aVar = c4 != null ? new a(c4, new uy1(key.g(), key.a())) : null;
        if (aVar != null) {
            this.f31821c.put(aVar, value);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zi0
    @Nullable
    public final Bitmap a(@NotNull ej0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String c4 = imageValue.c();
        a aVar = c4 != null ? new a(c4, new uy1(imageValue.g(), imageValue.a())) : null;
        if (aVar != null) {
            return (Bitmap) this.f31821c.get(aVar);
        }
        return null;
    }
}
