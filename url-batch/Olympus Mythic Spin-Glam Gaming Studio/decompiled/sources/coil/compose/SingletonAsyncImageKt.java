package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingletonAsyncImage.kt */
/* loaded from: classes.dex */
public abstract class SingletonAsyncImageKt {
    /* renamed from: AsyncImage-3HmZ8SU, reason: not valid java name */
    public static final void m2912AsyncImage3HmZ8SU(final Object obj, final String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, final int i2, final int i3) {
        Function1 function13;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-941517612);
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i3 & 8) != 0) {
            i4 = i2 & (-7169);
            function13 = AsyncImagePainter.Companion.getDefaultTransform();
        } else {
            function13 = function1;
            i4 = i2;
        }
        Function1 function14 = (i3 & 16) != 0 ? null : function12;
        Alignment center = (i3 & 32) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 64) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i3 & 128) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i3 & 256) != 0 ? null : colorFilter;
        if ((i3 & 512) != 0) {
            i4 &= -1879048193;
            i5 = DrawScope.INSTANCE.m1710getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941517612, i4, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:99)");
        }
        int i6 = i4 << 3;
        AsyncImageKt.m2900AsyncImageMvsnxeU(obj, str, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), startRestartGroup, 6), modifier2, function13, function14, center, fit, f2, colorFilter2, i5, startRestartGroup, (i4 & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i4 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Function1 function15 = function13;
        final Function1 function16 = function14;
        final Alignment alignment2 = center;
        final ContentScale contentScale2 = fit;
        final float f3 = f2;
        final ColorFilter colorFilter3 = colorFilter2;
        final int i7 = i5;
        endRestartGroup.updateScope(new Function2() { // from class: coil.compose.SingletonAsyncImageKt$AsyncImage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i8) {
                SingletonAsyncImageKt.m2912AsyncImage3HmZ8SU(obj, str, modifier2, function15, function16, alignment2, contentScale2, f3, colorFilter3, i7, composer2, i2 | 1, i3);
            }
        });
    }
}
