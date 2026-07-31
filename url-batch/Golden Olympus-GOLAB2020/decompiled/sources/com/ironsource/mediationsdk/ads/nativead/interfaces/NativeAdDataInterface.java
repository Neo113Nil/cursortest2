package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface NativeAdDataInterface {

    @Metadata
    public static class Image {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final Drawable f17284a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final Uri f17285b;

        public Image(@Nullable Drawable drawable, @Nullable Uri uri) {
            this.f17284a = drawable;
            this.f17285b = uri;
        }

        @Nullable
        public final Drawable getDrawable() {
            return this.f17284a;
        }

        @Nullable
        public final Uri getUri() {
            return this.f17285b;
        }
    }

    @Nullable
    String getAdvertiser();

    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    Image getIcon();

    @Nullable
    String getTitle();
}
