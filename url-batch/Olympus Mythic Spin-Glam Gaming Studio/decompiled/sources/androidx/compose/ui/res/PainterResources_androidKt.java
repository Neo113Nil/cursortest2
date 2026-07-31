package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import com.yandex.div.core.dagger.Names;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PainterResources.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/Painter;", "painterResource", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", Names.THEME, "res", "Landroidx/compose/ui/graphics/vector/ImageVector;", "loadVectorResource", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/ui/graphics/ImageBitmap;", "loadImageBitmapResource", "(Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PainterResources_androidKt {
    public static final Painter painterResource(int i, Composer composer, int i2) {
        Painter bitmapPainter;
        composer.startReplaceableGroup(473971343);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources res = context.getResources();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) rememberedValue;
        res.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && StringsKt.endsWith$default(charSequence, (CharSequence) ".xml", false, 2, (Object) null)) {
            composer.startReplaceableGroup(-738265321);
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
            Intrinsics.checkNotNullExpressionValue(res, "res");
            bitmapPainter = VectorPainterKt.rememberVectorPainter(loadVectorResource(theme, res, i, composer, ((i2 << 6) & 896) | 72), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-738265196);
            Object valueOf = Integer.valueOf(i);
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(valueOf) | composer.changed(charSequence);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(res, "res");
                rememberedValue2 = loadImageBitmapResource(res, i);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            bitmapPainter = new BitmapPainter((ImageBitmap) rememberedValue2, 0L, 0L, 6, null);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        return bitmapPainter;
    }

    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i, Composer composer, int i2) {
        composer.startReplaceableGroup(2112503116);
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i);
            Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(id)");
            if (!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
            imageVectorEntry = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml);
            imageVectorCache.set(key, imageVectorEntry);
        }
        ImageVector imageVector = imageVectorEntry.getImageVector();
        composer.endReplaceableGroup();
        return imageVector;
    }

    private static final ImageBitmap loadImageBitmapResource(Resources resources, int i) {
        return ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, resources, i);
    }
}
