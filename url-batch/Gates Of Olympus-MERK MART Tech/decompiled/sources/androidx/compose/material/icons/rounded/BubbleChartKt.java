package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubbleChart.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bubbleChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BubbleChart", "Landroidx/compose/material/icons/Icons$Rounded;", "getBubbleChart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BubbleChartKt {
    private static ImageVector _bubbleChart;

    public static final ImageVector getBubbleChart(Icons.Rounded rounded) {
        ImageVector imageVector = _bubbleChart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BubbleChart", Dp.m8227constructorimpl(24.0f), Dp.m8227constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m5419getBlack0d7_KjU(), null);
        int m5769getButtKaPHkGw = StrokeCap.INSTANCE.m5769getButtKaPHkGw();
        int m5779getBevelLxFBmk8 = StrokeJoin.INSTANCE.m5779getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.2f, 14.4f);
        pathBuilder.moveToRelative(-3.2f, 0.0f);
        pathBuilder.arcToRelative(3.2f, 3.2f, 0.0f, true, true, 6.4f, 0.0f);
        pathBuilder.arcToRelative(3.2f, 3.2f, 0.0f, true, true, -6.4f, 0.0f);
        ImageVector.Builder.m6131addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5769getButtKaPHkGw, m5779getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.INSTANCE.m5419getBlack0d7_KjU(), null);
        int m5769getButtKaPHkGw2 = StrokeCap.INSTANCE.m5769getButtKaPHkGw();
        int m5779getBevelLxFBmk82 = StrokeJoin.INSTANCE.m5779getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.8f, 18.0f);
        pathBuilder2.moveToRelative(-2.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m6131addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5769getButtKaPHkGw2, m5779getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(Color.INSTANCE.m5419getBlack0d7_KjU(), null);
        int m5769getButtKaPHkGw3 = StrokeCap.INSTANCE.m5769getButtKaPHkGw();
        int m5779getBevelLxFBmk83 = StrokeJoin.INSTANCE.m5779getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.2f, 8.8f);
        pathBuilder3.moveToRelative(-4.8f, 0.0f);
        pathBuilder3.arcToRelative(4.8f, 4.8f, 0.0f, true, true, 9.6f, 0.0f);
        pathBuilder3.arcToRelative(4.8f, 4.8f, 0.0f, true, true, -9.6f, 0.0f);
        ImageVector build = ImageVector.Builder.m6131addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5769getButtKaPHkGw3, m5779getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bubbleChart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
