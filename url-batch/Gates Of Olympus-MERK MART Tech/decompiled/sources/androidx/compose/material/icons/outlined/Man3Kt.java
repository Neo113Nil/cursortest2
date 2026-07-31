package androidx.compose.material.icons.outlined;

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

/* compiled from: Man3.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_man3", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Man3", "Landroidx/compose/material/icons/Icons$Outlined;", "getMan3", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Man3Kt {
    private static ImageVector _man3;

    public static final ImageVector getMan3(Icons.Outlined outlined) {
        ImageVector imageVector = _man3;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Man3", Dp.m8227constructorimpl(24.0f), Dp.m8227constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m5419getBlack0d7_KjU(), null);
        int m5769getButtKaPHkGw = StrokeCap.INSTANCE.m5769getButtKaPHkGw();
        int m5779getBevelLxFBmk8 = StrokeJoin.INSTANCE.m5779getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveTo(8.9f, 7.0f, 8.0f, 7.9f, 8.0f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveTo(16.0f, 7.9f, 15.1f, 7.0f, 14.0f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m6131addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5769getButtKaPHkGw, m5779getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.INSTANCE.m5419getBlack0d7_KjU(), null);
        int m5769getButtKaPHkGw2 = StrokeCap.INSTANCE.m5769getButtKaPHkGw();
        int m5779getBevelLxFBmk82 = StrokeJoin.INSTANCE.m5779getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 1.751f);
        pathBuilder2.lineToRelative(2.249f, 2.249f);
        pathBuilder2.lineToRelative(-2.249f, 2.249f);
        pathBuilder2.lineToRelative(-2.249f, -2.249f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m6131addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5769getButtKaPHkGw2, m5779getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _man3 = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
