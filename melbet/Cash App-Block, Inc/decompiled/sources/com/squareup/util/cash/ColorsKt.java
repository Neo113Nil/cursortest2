package com.squareup.util.cash;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.graphics.ColorUtils;
import com.squareup.protos.cash.ui.Color;
import kotlin.Pair;
import okio.ByteString;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class ColorsKt {
    /* renamed from: contrastAdjustedColor-ysEtTa8, reason: not valid java name */
    public static final long m3988contrastAdjustedColorysEtTa8(long j, long j2, long j3) {
        return ColorUtils.calculateContrast(ColorKt.m694toArgb8_81llA(j), ColorKt.m694toArgb8_81llA(j3)) > ColorUtils.calculateContrast(ColorKt.m694toArgb8_81llA(j2), ColorKt.m694toArgb8_81llA(j3)) ? j : j2;
    }

    public static final Color toColor(Pair pair) {
        Integer safeParseColor = com.squareup.util.android.StringsKt.safeParseColor((String) pair.first, null);
        safeParseColor.getClass();
        Color.ModeVariant modeVariant = toModeVariant(safeParseColor.intValue());
        Integer safeParseColor2 = com.squareup.util.android.StringsKt.safeParseColor((String) pair.second, null);
        safeParseColor2.getClass();
        return new Color(modeVariant, toModeVariant(safeParseColor2.intValue()), 4);
    }

    public static final Color.ModeVariant toModeVariant(int i) {
        return new Color.ModeVariant(Recorder$$ExternalSyntheticOutline2.m("#", Integer.toHexString(i)), null, null, null, null, 30, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Color toUiColor(com.squareup.cash.multiplatform.accentcolors.Color color) {
        color.getClass();
        String str = null;
        String str2 = null;
        ByteString byteString = null;
        return new Color(new Color.ModeVariant(color.lightSrgb, null, str, str2, null, 30, null), new Color.ModeVariant(color.darkSrgb, str, str2, 0 == true ? 1 : 0, byteString, 30, null), 4);
    }

    public static final Color validate(Color color) {
        color.getClass();
        Color.ModeVariant modeVariant = color.light;
        String str = modeVariant != null ? modeVariant.srgb : null;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            Timber.Forest.e("Invalid color for light variant: " + color, new Object[0]);
            return null;
        }
        Color.ModeVariant modeVariant2 = color.dark;
        String str2 = modeVariant2 != null ? modeVariant2.srgb : null;
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
            return color;
        }
        Timber.Forest.e("Invalid color for dark variant: " + color, new Object[0]);
        Color.ModeVariant modeVariant3 = color.light;
        ByteString unknownFields = color.unknownFields();
        unknownFields.getClass();
        return new Color(modeVariant3, (Color.ModeVariant) null, unknownFields);
    }

    public static final Color toColor(String str) {
        str.getClass();
        Integer safeParseColor = com.squareup.util.android.StringsKt.safeParseColor(str, null);
        safeParseColor.getClass();
        Color.ModeVariant modeVariant = toModeVariant(safeParseColor.intValue());
        Integer safeParseColor2 = com.squareup.util.android.StringsKt.safeParseColor(str, null);
        safeParseColor2.getClass();
        return new Color(modeVariant, toModeVariant(safeParseColor2.intValue()), 4);
    }

    public static final Color toColor(int i) {
        return new Color(toModeVariant(i), toModeVariant(i), 4);
    }
}
