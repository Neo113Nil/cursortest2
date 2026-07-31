package com.ironsource;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface ol extends NativeAdDataInterface {

    @Metadata
    public static final class a extends NativeAdDataInterface.Image {
        public a(@Nullable Drawable drawable, @Nullable Uri uri) {
            super(drawable, uri);
        }
    }
}
