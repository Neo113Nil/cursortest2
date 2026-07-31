package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PinDrop.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pinDrop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PinDrop", "Landroidx/compose/material/icons/Icons$Sharp;", "getPinDrop", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PinDropKt {
    private static ImageVector _pinDrop;

    public static final ImageVector getPinDrop(Icons.Sharp sharp) {
        ImageVector imageVector = _pinDrop;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PinDrop", Dp.m8227constructorimpl(24.0f), Dp.m8227constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5691getEvenOddRgk1Os = PathFillType.INSTANCE.m5691getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m5419getBlack0d7_KjU(), null);
        int m5769getButtKaPHkGw = StrokeCap.INSTANCE.m5769getButtKaPHkGw();
        int m5779getBevelLxFBmk8 = StrokeJoin.INSTANCE.m5779getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 22.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveToRelative(3.27f, 0.0f, 7.0f, 2.46f, 7.0f, 7.15f);
        pathBuilder.curveToRelative(0.0f, 3.12f, -2.33f, 6.41f, -7.0f, 9.85f);
        pathBuilder.curveToRelative(-4.67f, -3.44f, -7.0f, -6.73f, -7.0f, -9.85f);
        pathBuilder.curveTo(5.0f, 4.46f, 8.73f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m6131addPathoIyEayM$default(builder, pathBuilder.getNodes(), m5691getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5769getButtKaPHkGw, m5779getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinDrop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
