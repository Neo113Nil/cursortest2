package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xx0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final t30 f34708a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cj0 f34709b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Point f34710c;

    public /* synthetic */ xx0(Context context) {
        this(context, new t30(), new cj0());
    }

    @NotNull
    public final LinkedHashSet a(@NotNull List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = images.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            if (url.length() > 0) {
                this.f34709b.getClass();
                if (width <= 0 || height <= 0) {
                    Point point = this.f34710c;
                    linkedHashSet.add(new ej0(point.x, point.y, url, null, 120));
                }
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public final LinkedHashMap b(@NotNull List nativeAdImages) {
        Intrinsics.checkNotNullParameter(nativeAdImages, "nativeAdImages");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = nativeAdImages.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            Drawable drawable = mediatedNativeAdImage.getDrawable();
            String url = mediatedNativeAdImage.getUrl();
            if (drawable != null && url.length() > 0) {
                this.f34708a.getClass();
                Bitmap a4 = t30.a(drawable);
                if (a4 != null) {
                    linkedHashMap.put(url, a4);
                }
            }
        }
        return linkedHashMap;
    }

    public xx0(@NotNull Context context, @NotNull t30 drawableConverter, @NotNull cj0 imageSizeValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawableConverter, "drawableConverter");
        Intrinsics.checkNotNullParameter(imageSizeValidator, "imageSizeValidator");
        this.f34708a = drawableConverter;
        this.f34709b = imageSizeValidator;
        this.f34710c = ah1.b(context);
    }
}
