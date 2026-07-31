package ru.rustore.sdk.imaging.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.imaging.internal.g;
import ru.rustore.sdk.imaging.model.ImageRequest;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43659a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f43660b;

    public g(Context context, Handler mainHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainHandler, "mainHandler");
        this.f43659a = context;
        this.f43660b = mainHandler;
    }

    public static final void b(ImageRequest imageRequest) {
        Drawable error;
        ImageView imageView$sdk_public_imaging_release = imageRequest.getImageView$sdk_public_imaging_release();
        if (imageView$sdk_public_imaging_release == null || !imageView$sdk_public_imaging_release.isAttachedToWindow() || (error = imageRequest.getError()) == null) {
            return;
        }
        imageView$sdk_public_imaging_release.setImageDrawable(error);
    }

    public static final void d(ImageRequest imageRequest) {
        Drawable placeholder;
        ImageView imageView$sdk_public_imaging_release = imageRequest.getImageView$sdk_public_imaging_release();
        if (imageView$sdk_public_imaging_release == null || !imageView$sdk_public_imaging_release.isAttachedToWindow() || (placeholder = imageRequest.getPlaceholder()) == null) {
            return;
        }
        imageView$sdk_public_imaging_release.setImageDrawable(placeholder);
        imageView$sdk_public_imaging_release.setTag(-10001, Boolean.TRUE);
    }

    public final void a(final ImageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f43660b.post(new Runnable() { // from class: A3.d
            @Override // java.lang.Runnable
            public final void run() {
                g.b(ImageRequest.this);
            }
        });
    }

    public final void c(final ImageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f43660b.post(new Runnable() { // from class: A3.c
            @Override // java.lang.Runnable
            public final void run() {
                g.d(ImageRequest.this);
            }
        });
    }

    public final void a(final Bitmap bitmap, final ImageRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f43660b.post(new Runnable() { // from class: A3.b
            @Override // java.lang.Runnable
            public final void run() {
                g.a(ImageRequest.this, this, bitmap);
            }
        });
    }

    public static final void a(ImageRequest imageRequest, g gVar, Bitmap bitmap) {
        ImageView imageView$sdk_public_imaging_release = imageRequest.getImageView$sdk_public_imaging_release();
        if (imageView$sdk_public_imaging_release == null || !imageView$sdk_public_imaging_release.isAttachedToWindow()) {
            return;
        }
        Object tag = imageView$sdk_public_imaging_release.getTag(-10001);
        boolean areEqual = Intrinsics.areEqual(tag instanceof Boolean ? (Boolean) tag : null, Boolean.TRUE);
        imageView$sdk_public_imaging_release.setTag(-10001, null);
        imageView$sdk_public_imaging_release.setImageDrawable(null);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(gVar.f43659a.getResources(), bitmap);
        if (imageRequest.getCrossfade() && areEqual) {
            Drawable drawable = imageView$sdk_public_imaging_release.getDrawable();
            if (drawable != null) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                imageView$sdk_public_imaging_release.setImageDrawable(transitionDrawable);
                transitionDrawable.startTransition(300);
                return;
            }
            imageView$sdk_public_imaging_release.setImageDrawable(bitmapDrawable);
            return;
        }
        imageView$sdk_public_imaging_release.setImageDrawable(bitmapDrawable);
    }
}
