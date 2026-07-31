package coil;

import android.content.Context;

/* compiled from: Coil.kt */
/* loaded from: classes12.dex */
public final class Coil {
    public static final Coil INSTANCE = new Coil();
    private static ImageLoader imageLoader;

    private Coil() {
    }

    public static final ImageLoader imageLoader(Context context) {
        ImageLoader imageLoader2 = imageLoader;
        return imageLoader2 == null ? INSTANCE.newImageLoader(context) : imageLoader2;
    }

    private final synchronized ImageLoader newImageLoader(Context context) {
        ImageLoader imageLoader2 = imageLoader;
        if (imageLoader2 != null) {
            return imageLoader2;
        }
        context.getApplicationContext();
        ImageLoader create = ImageLoaders.create(context);
        imageLoader = create;
        return create;
    }
}
