package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class BitmapEffectHelper {

    @NotNull
    private final RenderScript renderScript;

    public BitmapEffectHelper(@NotNull RenderScript renderScript) {
        Intrinsics.checkNotNullParameter(renderScript, "renderScript");
        this.renderScript = renderScript;
    }

    @NotNull
    public final Bitmap blurBitmap(@NotNull Bitmap bitmap, int i4) {
        float f4;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (i4 == 0) {
            return bitmap;
        }
        if (i4 > 25) {
            f4 = (i4 * 1.0f) / 25;
            i4 = 25;
        } else {
            f4 = 1.0f;
        }
        Bitmap result = f4 == 1.0f ? bitmap.copy(bitmap.getConfig(), false) : Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f4), (int) (bitmap.getHeight() / f4), false);
        Allocation createFromBitmap = Allocation.createFromBitmap(this.renderScript, result);
        Allocation createTyped = Allocation.createTyped(this.renderScript, createFromBitmap.getType());
        RenderScript renderScript = this.renderScript;
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        create.setRadius(i4);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(result);
        createFromBitmap.destroy();
        createTyped.destroy();
        create.destroy();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    @NotNull
    public final Bitmap mirrorBitmap$div_release(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …lter = */ false\n        )");
        createBitmap.setDensity(160);
        return createBitmap;
    }
}
