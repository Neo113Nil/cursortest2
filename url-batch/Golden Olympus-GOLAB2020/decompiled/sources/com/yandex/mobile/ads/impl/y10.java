package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.mobile.ads.impl.vi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y10 implements DivImageLoader {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yy1 f34768a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ps0 f34769b;

    public static final class a implements vi0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f34770a;

        a(ImageView imageView) {
            this.f34770a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.qq1.a
        public final void a(@Nullable hi2 hi2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.vi0.d
        public final void a(@Nullable vi0.c cVar, boolean z4) {
            Bitmap b4 = cVar.b();
            if (b4 != null) {
                this.f34770a.setImageBitmap(b4);
            }
        }
    }

    public static final class b implements vi0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DivImageDownloadCallback f34771a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34772b;

        b(String str, DivImageDownloadCallback divImageDownloadCallback) {
            this.f34771a = divImageDownloadCallback;
            this.f34772b = str;
        }

        @Override // com.yandex.mobile.ads.impl.qq1.a
        public final void a(@Nullable hi2 hi2Var) {
            this.f34771a.onError();
        }

        @Override // com.yandex.mobile.ads.impl.vi0.d
        public final void a(@Nullable vi0.c cVar, boolean z4) {
            Bitmap b4 = cVar.b();
            if (b4 != null) {
                this.f34771a.onSuccess(new CachedBitmap(b4, Uri.parse(this.f34772b), z4 ? BitmapSource.MEMORY : BitmapSource.NETWORK));
            }
        }
    }

    public y10(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34768a = wc1.f34002c.a(context).b();
        this.f34769b = new ps0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(kotlin.jvm.internal.G imageContainer, y10 this$0, String imageUrl, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageUrl, "$imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "$imageView");
        imageContainer.f41132b = this$0.f34768a.a(imageUrl, new a(imageView), 0, 0);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* bridge */ /* synthetic */ Boolean hasSvgSupport() {
        return super.hasSvgSupport();
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NonNull
    public /* bridge */ /* synthetic */ LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i4) {
        return super.loadImage(str, divImageDownloadCallback, i4);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NonNull
    public /* bridge */ /* synthetic */ LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i4) {
        return super.loadImageBytes(str, divImageDownloadCallback, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(kotlin.jvm.internal.G imageContainer) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        vi0.c cVar = (vi0.c) imageContainer.f41132b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @NotNull
    public final LoadReference loadImage(@NotNull final String imageUrl, @NotNull final ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        final kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
        this.f34769b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Kl
            @Override // java.lang.Runnable
            public final void run() {
                y10.a(kotlin.jvm.internal.G.this, this, imageUrl, imageView);
            }
        });
        return new LoadReference() { // from class: com.yandex.mobile.ads.impl.Ll
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                y10.a(kotlin.jvm.internal.G.this);
            }
        };
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public final LoadReference loadImageBytes(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return a(imageUrl, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(kotlin.jvm.internal.G imageContainer) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        vi0.c cVar = (vi0.c) imageContainer.f41132b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public final LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return a(imageUrl, callback);
    }

    private final LoadReference a(final String str, final DivImageDownloadCallback divImageDownloadCallback) {
        final kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
        this.f34769b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ml
            @Override // java.lang.Runnable
            public final void run() {
                y10.a(kotlin.jvm.internal.G.this, this, str, divImageDownloadCallback);
            }
        });
        return new LoadReference() { // from class: com.yandex.mobile.ads.impl.Nl
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                y10.a(y10.this, g4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(kotlin.jvm.internal.G imageContainer, y10 this$0, String imageUrl, DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageUrl, "$imageUrl");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        imageContainer.f41132b = this$0.f34768a.a(imageUrl, new b(imageUrl, callback), 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(y10 this$0, final kotlin.jvm.internal.G imageContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        this$0.f34769b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ol
            @Override // java.lang.Runnable
            public final void run() {
                y10.b(kotlin.jvm.internal.G.this);
            }
        });
    }
}
