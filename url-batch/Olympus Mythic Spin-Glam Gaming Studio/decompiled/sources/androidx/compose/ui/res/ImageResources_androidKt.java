package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageResources.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "Landroid/content/res/Resources;", "res", "", "id", "Landroidx/compose/ui/graphics/ImageBitmap;", "imageResource", "(Landroidx/compose/ui/graphics/ImageBitmap$Companion;Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, Resources res, int i) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Drawable drawable = res.getDrawable(i, null);
        if (drawable == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Intrinsics.checkNotNullExpressionValue(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
    }
}
