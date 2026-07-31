package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.Coil;
import coil.ImageLoader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: LocalImageLoader.kt */
/* loaded from: classes12.dex */
public abstract class ImageLoaderProvidableCompositionLocal {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static ProvidableCompositionLocal m2910constructorimpl(ProvidableCompositionLocal providableCompositionLocal) {
        return providableCompositionLocal;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ProvidableCompositionLocal m2911constructorimpl$default(ProvidableCompositionLocal providableCompositionLocal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            providableCompositionLocal = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: coil.compose.ImageLoaderProvidableCompositionLocal.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* renamed from: invoke */
                public final ImageLoader mo4828invoke() {
                    return null;
                }
            });
        }
        return m2910constructorimpl(providableCompositionLocal);
    }

    public static final ImageLoader getCurrent(ProvidableCompositionLocal providableCompositionLocal, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-617597678, i, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        ImageLoader imageLoader = (ImageLoader) composer.consume(providableCompositionLocal);
        if (imageLoader == null) {
            imageLoader = Coil.imageLoader((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageLoader;
    }
}
