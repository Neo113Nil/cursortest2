package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Shader.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001aQ\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "from", "to", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "LinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "LinearGradientShader", "center", "radius", "RadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "RadialGradientShader", "SweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "SweepGradientShader", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShaderKt {
    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m1575LinearGradientShaderVjE6UOU(long j, long j2, List colors, List list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m1382ActualLinearGradientShaderVjE6UOU(j, j2, colors, list, i);
    }

    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m1576RadialGradientShader8uybcMk(long j, float f, List colors, List list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m1383ActualRadialGradientShader8uybcMk(j, f, colors, list, i);
    }

    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m1577SweepGradientShader9KIMszo(long j, List colors, List list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return AndroidShader_androidKt.m1384ActualSweepGradientShader9KIMszo(j, colors, list);
    }
}
