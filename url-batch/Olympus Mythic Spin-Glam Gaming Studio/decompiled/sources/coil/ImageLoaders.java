package coil;

import android.content.Context;
import coil.ImageLoader;

/* compiled from: ImageLoaders.kt */
/* loaded from: classes4.dex */
public abstract class ImageLoaders {
    public static final ImageLoader create(Context context) {
        return new ImageLoader.Builder(context).build();
    }
}
