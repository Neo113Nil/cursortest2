package coil.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.size.Dimension;
import coil.size.Dimensions;
import coil.size.Size;
import coil.transition.TransitionTarget;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* compiled from: AsyncImagePainter.kt */
/* loaded from: classes4.dex */
public abstract class AsyncImagePainterKt {
    private static final AsyncImagePainterKt$FakeTransitionTarget$1 FakeTransitionTarget = new TransitionTarget() { // from class: coil.compose.AsyncImagePainterKt$FakeTransitionTarget$1
        @Override // coil.target.Target
        public void onError(Drawable drawable) {
            TransitionTarget.DefaultImpls.onError(this, drawable);
        }

        @Override // coil.target.Target
        public void onStart(Drawable drawable) {
            TransitionTarget.DefaultImpls.onStart(this, drawable);
        }

        @Override // coil.target.Target
        public void onSuccess(Drawable drawable) {
            TransitionTarget.DefaultImpls.onSuccess(this, drawable);
        }
    };

    /* renamed from: rememberAsyncImagePainter-5jETZwI, reason: not valid java name */
    public static final AsyncImagePainter m2906rememberAsyncImagePainter5jETZwI(Object obj, ImageLoader imageLoader, Function1 function1, Function1 function12, ContentScale contentScale, int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2020614074);
        if ((i3 & 4) != 0) {
            function1 = AsyncImagePainter.Companion.getDefaultTransform();
        }
        if ((i3 & 8) != 0) {
            function12 = null;
        }
        if ((i3 & 16) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        if ((i3 & 32) != 0) {
            i = DrawScope.INSTANCE.m1710getDefaultFilterQualityfv9h1I();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:131)");
        }
        ImageRequest requestOf = UtilsKt.requestOf(obj, composer, 8);
        validateRequest(requestOf);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new AsyncImagePainter(requestOf, imageLoader);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) rememberedValue;
        asyncImagePainter.setTransform$coil_compose_base_release(function1);
        asyncImagePainter.setOnState$coil_compose_base_release(function12);
        asyncImagePainter.setContentScale$coil_compose_base_release(contentScale);
        asyncImagePainter.m2903setFilterQualityvDHp3xo$coil_compose_base_release(i);
        asyncImagePainter.setPreview$coil_compose_base_release(((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue());
        asyncImagePainter.setImageLoader$coil_compose_base_release(imageLoader);
        asyncImagePainter.setRequest$coil_compose_base_release(requestOf);
        asyncImagePainter.onRemembered();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asyncImagePainter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toSizeOrNull-uvyYCjk, reason: not valid java name */
    public static final Size m2907toSizeOrNulluvyYCjk(long j) {
        if (j == androidx.compose.ui.geometry.Size.INSTANCE.m1340getUnspecifiedNHjbRc()) {
            return Size.ORIGINAL;
        }
        if (!m2905isPositiveuvyYCjk(j)) {
            return null;
        }
        float m1335getWidthimpl = androidx.compose.ui.geometry.Size.m1335getWidthimpl(j);
        Dimension Dimension = (Float.isInfinite(m1335getWidthimpl) || Float.isNaN(m1335getWidthimpl)) ? Dimension.Undefined.INSTANCE : Dimensions.Dimension(MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1335getWidthimpl(j)));
        float m1333getHeightimpl = androidx.compose.ui.geometry.Size.m1333getHeightimpl(j);
        return new Size(Dimension, (Float.isInfinite(m1333getHeightimpl) || Float.isNaN(m1333getHeightimpl)) ? Dimension.Undefined.INSTANCE : Dimensions.Dimension(MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1333getHeightimpl(j))));
    }

    private static final void validateRequest(ImageRequest imageRequest) {
        Object data = imageRequest.getData();
        if (data instanceof ImageRequest.Builder) {
            unsupportedData("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (data instanceof ImageBitmap) {
            unsupportedData$default("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (data instanceof ImageVector) {
            unsupportedData$default("ImageVector", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (data instanceof Painter) {
            unsupportedData$default("Painter", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (imageRequest.getTarget() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }

    static /* synthetic */ Void unsupportedData$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return unsupportedData(str, str2);
    }

    private static final Void unsupportedData(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    /* renamed from: isPositive-uvyYCjk, reason: not valid java name */
    private static final boolean m2905isPositiveuvyYCjk(long j) {
        return ((double) androidx.compose.ui.geometry.Size.m1335getWidthimpl(j)) >= 0.5d && ((double) androidx.compose.ui.geometry.Size.m1333getHeightimpl(j)) >= 0.5d;
    }
}
