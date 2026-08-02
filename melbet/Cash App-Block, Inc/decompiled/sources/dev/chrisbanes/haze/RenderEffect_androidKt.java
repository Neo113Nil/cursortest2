package dev.chrisbanes.haze;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidRenderEffect;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class RenderEffect_androidKt {
    public static Bitmap noiseTexture;

    /* renamed from: blendWith-moWRBKg, reason: not valid java name */
    public static final RenderEffect m4114blendWithmoWRBKg(RenderEffect renderEffect, RenderEffect renderEffect2, BlendMode blendMode, long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L && !Offset.m622equalsimpl0(j, 0L)) {
            renderEffect2 = RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), renderEffect2);
            renderEffect2.getClass();
        }
        RenderEffect createBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffect, renderEffect2, blendMode);
        createBlendModeEffect.getClass();
        return createBlendModeEffect;
    }

    public static final AndroidRenderEffect createRenderEffect(HazeEffectNode hazeEffectNode, RenderEffectParams renderEffectParams) {
        RenderEffect createBlurEffect;
        float f;
        int i;
        RenderEffect createColorFilterEffect;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        float f2 = renderEffectParams.blurRadius;
        float f3 = renderEffectParams.scale;
        float f4 = f2 * f3;
        if (Dp.m1036compareTo0680j_4(f4, RecyclerView.DECELERATION_RATE) < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("blurRadius needs to be equal or greater than 0.dp");
            return null;
        }
        long m645times7Ah8Wj8 = Size.m645times7Ah8Wj8(renderEffectParams.contentSize, f3);
        float ceil = (float) Math.ceil(Float.intBitsToFloat((int) (m645times7Ah8Wj8 >> 32)));
        long floatToRawIntBits = (Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (m645times7Ah8Wj8 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(ceil) << 32);
        float roundToInt = MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (Offset.m627timestuRUvjQ(renderEffectParams.contentOffset, f3) >> 32)));
        long floatToRawIntBits2 = (Float.floatToRawIntBits(MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (r12 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(roundToInt) << 32);
        if (Dp.m1036compareTo0680j_4(f4, RecyclerView.DECELERATION_RATE) <= 0) {
            createBlurEffect = RenderEffect.createOffsetEffect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        } else {
            try {
                float mo236toPx0680j_4 = ((Density) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f4);
                createBlurEffect = RenderEffect.createBlurEffect(mo236toPx0680j_4, mo236toPx0680j_4, AndroidTileMode_androidKt.m668toAndroidTileMode0vamqd0(renderEffectParams.blurTileMode));
            } catch (IllegalArgumentException e) {
                Handlers$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error whilst calling RenderEffect.createBlurEffect. This is likely because this device does not support a blur radius of ", Dp.m1038toStringimpl(f4), "dp"), e);
                return null;
            }
        }
        createBlurEffect.getClass();
        Context context = (Context) DepthSortedSetKt.currentValueOf(hazeEffectNode, AndroidCompositionLocals_androidKt.LocalContext);
        float f5 = renderEffectParams.noiseFactor;
        float f6 = 0.005f;
        if (f5 >= 0.005f) {
            if (f3 <= RecyclerView.DECELERATION_RATE) {
                f3 = 1.0f;
            }
            Bitmap noiseTexture2 = getNoiseTexture(context);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(noiseTexture2, tileMode, tileMode);
            if (Math.abs(f3 - 1.0f) >= 0.001f) {
                Matrix matrix = new Matrix();
                float f7 = 1.0f / f3;
                matrix.setScale(f7, f7);
                bitmapShader.setLocalMatrix(matrix);
            }
            float coerceIn = RangesKt___RangesKt.coerceIn(f5, RecyclerView.DECELERATION_RATE, 1.0f);
            RenderEffect createShaderEffect = RenderEffect.createShaderEffect(bitmapShader);
            createShaderEffect.getClass();
            if (coerceIn < 1.0f) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setScale(1.0f, 1.0f, 1.0f, coerceIn);
                createShaderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), createShaderEffect);
            }
            createShaderEffect.getClass();
            createBlurEffect = RenderEffect.createBlendModeEffect(createShaderEffect, createBlurEffect, BlendMode.DST_ATOP);
            createBlurEffect.getClass();
        }
        List<HazeTint> list = renderEffectParams.tints;
        float f8 = renderEffectParams.tintAlphaModulate;
        for (HazeTint hazeTint : list) {
            boolean isSpecified = hazeTint.isSpecified();
            int i2 = hazeTint.blendMode;
            if (isSpecified) {
                Brush brush = hazeTint.brush;
                Shader mo671createShaderuvyYCjk = (brush == null || !(brush instanceof ShaderBrush)) ? null : ((ShaderBrush) brush).mo671createShaderuvyYCjk(floatToRawIntBits);
                if (mo671createShaderuvyYCjk != null) {
                    if (f8 >= 1.0f) {
                        createColorFilterEffect = RenderEffect.createShaderEffect(mo671createShaderuvyYCjk);
                        f = f6;
                        i = i2;
                    } else {
                        f = f6;
                        i = i2;
                        createColorFilterEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color.m675copywmQWz5c$default(f8, Color.Blue, 14)), BlendMode.SRC_IN), RenderEffect.createShaderEffect(mo671createShaderuvyYCjk));
                    }
                    createColorFilterEffect.getClass();
                    createBlurEffect = m4114blendWithmoWRBKg(createBlurEffect, createColorFilterEffect, HazeKt.m4113toAndroidBlendModes9anfk8(i), floatToRawIntBits2);
                } else {
                    f = f6;
                    long j = hazeTint.color;
                    if (f8 < 1.0f) {
                        j = Color.m675copywmQWz5c$default(Color.m677getAlphaimpl(j) * f8, j, 14);
                    }
                    if (Color.m677getAlphaimpl(j) >= f) {
                        createBlurEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), HazeKt.m4113toAndroidBlendModes9anfk8(i2)), createBlurEffect);
                        createBlurEffect.getClass();
                    }
                }
            } else {
                f = f6;
            }
            f6 = f;
        }
        Brush brush2 = renderEffectParams.mask;
        BlendMode blendMode = BlendMode.DST_IN;
        if (brush2 != null) {
            Shader mo671createShaderuvyYCjk2 = brush2 instanceof ShaderBrush ? ((ShaderBrush) brush2).mo671createShaderuvyYCjk(floatToRawIntBits) : null;
            if (mo671createShaderuvyYCjk2 != null) {
                RenderEffect createShaderEffect2 = RenderEffect.createShaderEffect(mo671createShaderuvyYCjk2);
                createShaderEffect2.getClass();
                createBlurEffect = m4114blendWithmoWRBKg(createBlurEffect, createShaderEffect2, blendMode, floatToRawIntBits2);
            }
        }
        return new AndroidRenderEffect(createBlurEffect);
    }

    public static final Bitmap getNoiseTexture(Context context) {
        context.getClass();
        Bitmap bitmap = noiseTexture;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.haze_noise);
        noiseTexture = decodeResource;
        decodeResource.getClass();
        return decodeResource;
    }
}
