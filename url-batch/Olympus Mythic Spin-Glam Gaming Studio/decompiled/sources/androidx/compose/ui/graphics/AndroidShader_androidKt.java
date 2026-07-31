package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidShader.android.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aO\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a \u0010\u0018\u001a\u00020\u00172\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a(\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a:\u0010 \u001a\u0004\u0018\u00010\u001f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a0\u0010#\u001a\u00020\"2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$*\n\u0010%\"\u00020\n2\u00020\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "from", "to", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualLinearGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualSweepGradientShader", "", "countTransparentColors", "(Ljava/util/List;)I", "numTransparentColors", "", "makeTransparentColors", "(Ljava/util/List;I)[I", "stops", "", "makeTransparentStops", "(Ljava/util/List;Ljava/util/List;I)[F", "", "validateColorStops", "(Ljava/util/List;Ljava/util/List;)V", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m1382ActualLinearGradientShaderVjE6UOU(long j, long j2, List colors, List list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.LinearGradient(Offset.m1297getXimpl(j), Offset.m1298getYimpl(j), Offset.m1297getXimpl(j2), Offset.m1298getYimpl(j2), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m1385toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m1383ActualRadialGradientShader8uybcMk(long j, float f, List colors, List list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.RadialGradient(Offset.m1297getXimpl(j), Offset.m1298getYimpl(j), f, makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m1385toAndroidTileMode0vamqd0(i));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m1384ActualSweepGradientShader9KIMszo(long j, List colors, List list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.SweepGradient(Offset.m1297getXimpl(j), Offset.m1298getYimpl(j), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors));
    }

    public static final int countTransparentColors(List colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt.getLastIndex(colors);
        for (int i2 = 1; i2 < lastIndex; i2++) {
            if (Color.m1448getAlphaimpl(((Color) colors.get(i2)).getValue()) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final int[] makeTransparentColors(List colors, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = ColorKt.m1471toArgb8_81llA(((Color) colors.get(i3)).getValue());
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i];
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int size2 = colors.size();
        int i4 = 0;
        while (i3 < size2) {
            long value = ((Color) colors.get(i3)).getValue();
            if (Color.m1448getAlphaimpl(value) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m1471toArgb8_81llA(Color.m1445copywmQWz5c$default(((Color) colors.get(1)).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i3 == lastIndex) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m1471toArgb8_81llA(Color.m1445copywmQWz5c$default(((Color) colors.get(i3 - 1)).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = ColorKt.m1471toArgb8_81llA(Color.m1445copywmQWz5c$default(((Color) colors.get(i3 - 1)).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i4 += 2;
                    iArr2[i5] = ColorKt.m1471toArgb8_81llA(Color.m1445copywmQWz5c$default(((Color) colors.get(i3 + 1)).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ColorKt.m1471toArgb8_81llA(value);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final float[] makeTransparentStops(List list, List colors, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i == 0) {
            if (list != null) {
                return CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int lastIndex = CollectionsKt.getLastIndex(colors);
        int i2 = 1;
        for (int i3 = 1; i3 < lastIndex; i3++) {
            long value = ((Color) colors.get(i3)).getValue();
            float floatValue = list != null ? ((Number) list.get(i3)).floatValue() : i3 / CollectionsKt.getLastIndex(colors);
            int i4 = i2 + 1;
            fArr[i2] = floatValue;
            if (Color.m1448getAlphaimpl(value) == 0.0f) {
                i2 += 2;
                fArr[i4] = floatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? ((Number) list.get(CollectionsKt.getLastIndex(colors))).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
