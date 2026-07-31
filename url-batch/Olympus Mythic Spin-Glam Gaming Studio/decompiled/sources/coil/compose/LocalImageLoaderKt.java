package coil.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;

/* compiled from: LocalImageLoader.kt */
/* loaded from: classes15.dex */
public abstract class LocalImageLoaderKt {
    private static final ProvidableCompositionLocal LocalImageLoader = ImageLoaderProvidableCompositionLocal.m2911constructorimpl$default(null, 1, null);

    public static final ProvidableCompositionLocal getLocalImageLoader() {
        return LocalImageLoader;
    }
}
