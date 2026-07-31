package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidImageBitmap.android.kt */
@RequiresApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0001¢\u0006\u0002\b\u0011J\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0012H\u0001¢\u0006\u0002\b\u0011J\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0001¢\u0006\u0002\b\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "toFrameworkColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Api26Bitmap {
    public static final Api26Bitmap INSTANCE = new Api26Bitmap();

    private Api26Bitmap() {
    }

    @DoNotInline
    @NotNull
    /* renamed from: createBitmap-x__-hDU$ui_graphics_release, reason: not valid java name */
    public static final Bitmap m1386createBitmapx__hDU$ui_graphics_release(int width, int height, int bitmapConfig, boolean hasAlpha, @NotNull ColorSpace colorSpace) {
        Bitmap createBitmap;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, width, height, AndroidImageBitmap_androidKt.m1358toBitmapConfig1JJdX4A(bitmapConfig), hasAlpha, toFrameworkColorSpace$ui_graphics_release(colorSpace));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }

    @DoNotInline
    @NotNull
    public static final ColorSpace composeColorSpace$ui_graphics_release(@NotNull Bitmap bitmap) {
        android.graphics.ColorSpace colorSpace;
        ColorSpace composeColorSpace$ui_graphics_release;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (composeColorSpace$ui_graphics_release = composeColorSpace$ui_graphics_release(colorSpace)) == null) ? ColorSpaces.INSTANCE.getSrgb() : composeColorSpace$ui_graphics_release;
    }

    @DoNotInline
    @NotNull
    public static final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(@NotNull ColorSpace colorSpace) {
        ColorSpace.Named named;
        android.graphics.ColorSpace colorSpace2;
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
            named = ColorSpace.Named.SRGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
            named = ColorSpace.Named.ACES;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
            named = ColorSpace.Named.ACESCG;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
            named = ColorSpace.Named.BT2020;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
            named = ColorSpace.Named.BT709;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
            named = ColorSpace.Named.DCI_P3;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else {
            named = Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
        }
        colorSpace2 = android.graphics.ColorSpace.get(named);
        Intrinsics.checkNotNullExpressionValue(colorSpace2, "get(frameworkNamedSpace)");
        return colorSpace2;
    }

    @DoNotInline
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace$ui_graphics_release(@NotNull android.graphics.ColorSpace colorSpace) {
        ColorSpace.Named named;
        android.graphics.ColorSpace colorSpace2;
        ColorSpace.Named named2;
        android.graphics.ColorSpace colorSpace3;
        ColorSpace.Named named3;
        android.graphics.ColorSpace colorSpace4;
        ColorSpace.Named named4;
        android.graphics.ColorSpace colorSpace5;
        ColorSpace.Named named5;
        android.graphics.ColorSpace colorSpace6;
        ColorSpace.Named named6;
        android.graphics.ColorSpace colorSpace7;
        ColorSpace.Named named7;
        android.graphics.ColorSpace colorSpace8;
        ColorSpace.Named named8;
        android.graphics.ColorSpace colorSpace9;
        ColorSpace.Named named9;
        android.graphics.ColorSpace colorSpace10;
        ColorSpace.Named named10;
        android.graphics.ColorSpace colorSpace11;
        ColorSpace.Named named11;
        android.graphics.ColorSpace colorSpace12;
        ColorSpace.Named named12;
        android.graphics.ColorSpace colorSpace13;
        ColorSpace.Named named13;
        android.graphics.ColorSpace colorSpace14;
        ColorSpace.Named named14;
        android.graphics.ColorSpace colorSpace15;
        ColorSpace.Named named15;
        android.graphics.ColorSpace colorSpace16;
        ColorSpace.Named named16;
        android.graphics.ColorSpace colorSpace17;
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        named = ColorSpace.Named.SRGB;
        colorSpace2 = android.graphics.ColorSpace.get(named);
        if (Intrinsics.areEqual(colorSpace, colorSpace2)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        named2 = ColorSpace.Named.ACES;
        colorSpace3 = android.graphics.ColorSpace.get(named2);
        if (Intrinsics.areEqual(colorSpace, colorSpace3)) {
            return ColorSpaces.INSTANCE.getAces();
        }
        named3 = ColorSpace.Named.ACESCG;
        colorSpace4 = android.graphics.ColorSpace.get(named3);
        if (Intrinsics.areEqual(colorSpace, colorSpace4)) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        named4 = ColorSpace.Named.ADOBE_RGB;
        colorSpace5 = android.graphics.ColorSpace.get(named4);
        if (Intrinsics.areEqual(colorSpace, colorSpace5)) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        named5 = ColorSpace.Named.BT2020;
        colorSpace6 = android.graphics.ColorSpace.get(named5);
        if (Intrinsics.areEqual(colorSpace, colorSpace6)) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        named6 = ColorSpace.Named.BT709;
        colorSpace7 = android.graphics.ColorSpace.get(named6);
        if (Intrinsics.areEqual(colorSpace, colorSpace7)) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        named7 = ColorSpace.Named.CIE_LAB;
        colorSpace8 = android.graphics.ColorSpace.get(named7);
        if (Intrinsics.areEqual(colorSpace, colorSpace8)) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        named8 = ColorSpace.Named.CIE_XYZ;
        colorSpace9 = android.graphics.ColorSpace.get(named8);
        if (Intrinsics.areEqual(colorSpace, colorSpace9)) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        named9 = ColorSpace.Named.DCI_P3;
        colorSpace10 = android.graphics.ColorSpace.get(named9);
        if (Intrinsics.areEqual(colorSpace, colorSpace10)) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        named10 = ColorSpace.Named.DISPLAY_P3;
        colorSpace11 = android.graphics.ColorSpace.get(named10);
        if (Intrinsics.areEqual(colorSpace, colorSpace11)) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        named11 = ColorSpace.Named.EXTENDED_SRGB;
        colorSpace12 = android.graphics.ColorSpace.get(named11);
        if (Intrinsics.areEqual(colorSpace, colorSpace12)) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        colorSpace13 = android.graphics.ColorSpace.get(named12);
        if (Intrinsics.areEqual(colorSpace, colorSpace13)) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        named13 = ColorSpace.Named.LINEAR_SRGB;
        colorSpace14 = android.graphics.ColorSpace.get(named13);
        if (Intrinsics.areEqual(colorSpace, colorSpace14)) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        named14 = ColorSpace.Named.NTSC_1953;
        colorSpace15 = android.graphics.ColorSpace.get(named14);
        if (Intrinsics.areEqual(colorSpace, colorSpace15)) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        named15 = ColorSpace.Named.PRO_PHOTO_RGB;
        colorSpace16 = android.graphics.ColorSpace.get(named15);
        if (Intrinsics.areEqual(colorSpace, colorSpace16)) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        named16 = ColorSpace.Named.SMPTE_C;
        colorSpace17 = android.graphics.ColorSpace.get(named16);
        if (Intrinsics.areEqual(colorSpace, colorSpace17)) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }
}
