package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidColorFilter.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t*\f\b\u0000\u0010\u000b\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "Landroid/graphics/ColorFilter;", "asAndroidColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "actualTintColorFilter-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "actualTintColorFilter", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidColorFilter_androidKt {
    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(colorFilter, "<this>");
        return colorFilter.getNativeColorFilter();
    }

    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final ColorFilter m1355actualTintColorFilterxETnrds(long j, int i) {
        android.graphics.ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = BlendModeColorFilterHelper.INSTANCE.m1423BlendModeColorFilterxETnrds(j, i);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(ColorKt.m1471toArgb8_81llA(j), AndroidBlendMode_androidKt.m1345toPorterDuffModes9anfk8(i));
        }
        return new ColorFilter(porterDuffColorFilter);
    }
}
