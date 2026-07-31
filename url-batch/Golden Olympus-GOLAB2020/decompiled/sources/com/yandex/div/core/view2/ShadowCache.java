package com.yandex.div.core.view2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ShadowCache {

    @NotNull
    public static final ShadowCache INSTANCE = new ShadowCache();

    @NotNull
    private static final Paint paint = new Paint();

    @NotNull
    private static final Map<ShadowCacheKey, NinePatch> shadowMap = new LinkedHashMap();

    @Metadata
    public static final class ShadowCacheKey {
        private final float blur;

        @NotNull
        private final float[] radii;

        public ShadowCacheKey(@NotNull float[] radii, float f4) {
            Intrinsics.checkNotNullParameter(radii, "radii");
            this.radii = radii;
            this.blur = f4;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof ShadowCacheKey)) {
                return false;
            }
            ShadowCacheKey shadowCacheKey = (ShadowCacheKey) obj;
            return this.blur == shadowCacheKey.blur && Arrays.equals(this.radii, shadowCacheKey.radii);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.radii) * 31) + Float.hashCode(this.blur);
        }
    }

    private ShadowCache() {
    }

    private final void blur(Bitmap bitmap, Context context, Bitmap bitmap2, float f4) {
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.A_8(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, bitmap2);
        create2.setRadius(f4);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(bitmap2);
        createFromBitmap2.destroy();
        createFromBitmap.destroy();
        create2.destroy();
    }

    private final NinePatch createNewShadow(Context context, float[] fArr, float f4) {
        float max = f4 + Math.max(fArr[1] + fArr[2], fArr[5] + fArr[6]);
        float max2 = f4 + Math.max(fArr[0] + fArr[7], fArr[3] + fArr[4]);
        if (max <= 0.0f || max2 <= 0.0f) {
            return null;
        }
        float j4 = g.j(f4, 1.0f, 25.0f);
        float f5 = f4 <= 25.0f ? 1.0f : 25.0f / f4;
        float f6 = f4 * 2;
        int i4 = (int) ((max + f6) * f5);
        int i5 = (int) ((f6 + max2) * f5);
        Bitmap.Config config = Bitmap.Config.ALPHA_8;
        Bitmap createBitmap = Bitmap.createBitmap(i4, i5, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          ….Config.ALPHA_8\n        )");
        Bitmap createBitmap2 = Bitmap.createBitmap(i4, i5, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(\n          ….Config.ALPHA_8\n        )");
        drawNewShadow(createBitmap, max, max2, fArr, j4, f5);
        blur(createBitmap, context, createBitmap2, j4);
        createBitmap.recycle();
        if (f5 < 1.0f) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap2, (int) (createBitmap2.getWidth() / f5), (int) (createBitmap2.getHeight() / f5), true);
            createBitmap2.recycle();
            createBitmap2 = createScaledBitmap;
        }
        return toNinePatch(createBitmap2);
    }

    private final byte[] createNinePatchChunk(int i4, int i5) {
        int i6 = i5 / 2;
        int i7 = i4 / 2;
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i7 - 1);
        order.putInt(i7 + 1);
        order.putInt(i6 - 1);
        order.putInt(i6 + 1);
        for (int i8 = 0; i8 < 9; i8++) {
            order.putInt(1);
        }
        byte[] array = order.array();
        Intrinsics.checkNotNullExpressionValue(array, "buffer.array()");
        return array;
    }

    private final void drawNewShadow(Bitmap bitmap, float f4, float f5, float[] fArr, float f6, float f7) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        roundRectShape.resize(f4, f5);
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmap);
        int save = canvas.save();
        canvas.translate(f6, f6);
        try {
            save = canvas.save();
            canvas.scale(f7, f7, 0.0f, 0.0f);
            roundRectShape.draw(canvas, paint);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    private final NinePatch toNinePatch(Bitmap bitmap) {
        return new NinePatch(bitmap, createNinePatchChunk(bitmap.getWidth(), bitmap.getHeight()));
    }

    @Nullable
    public final NinePatch getShadow(@NotNull Context context, @NotNull float[] radii, float f4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(radii, "radii");
        ShadowCacheKey shadowCacheKey = new ShadowCacheKey(radii, f4);
        Map<ShadowCacheKey, NinePatch> map = shadowMap;
        NinePatch ninePatch = map.get(shadowCacheKey);
        if (ninePatch != null) {
            return ninePatch;
        }
        NinePatch createNewShadow = createNewShadow(context, radii, f4);
        if (createNewShadow == null) {
            return null;
        }
        map.put(shadowCacheKey, createNewShadow);
        return createNewShadow;
    }
}
