package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Forward.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"_forward", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Forward", "Landroidx/compose/material/icons/Icons$TwoTone;", "getForward$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getForward", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ForwardKt {
    private static ImageVector _forward;

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.Forward", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.Forward", imports = {"androidx.compose.material.icons.automirrored.twotone.Forward"}))
    public static /* synthetic */ void getForward$annotations(Icons.TwoTone twoTone) {
    }

    public static final ImageVector getForward(Icons.TwoTone twoTone) {
        ImageVector imageVector = _forward;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Forward", Dp.m8227constructorimpl(24.0f), Dp.m8227constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m5419getBlack0d7_KjU(), null);
        int m5769getButtKaPHkGw = StrokeCap.INSTANCE.m5769getButtKaPHkGw();
        int m5779getBevelLxFBmk8 = StrokeJoin.INSTANCE.m5779getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(1.17f);
        pathBuilder.lineTo(17.17f, 12.0f);
        pathBuilder.lineTo(14.0f, 8.83f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m6131addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5769getButtKaPHkGw, m5779getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.INSTANCE.m5419getBlack0d7_KjU(), null);
        int m5769getButtKaPHkGw2 = StrokeCap.INSTANCE.m5769getButtKaPHkGw();
        int m5779getBevelLxFBmk82 = StrokeJoin.INSTANCE.m5779getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 12.0f);
        pathBuilder2.lineToRelative(-8.0f, -8.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.lineToRelative(8.0f, -8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 14.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineTo(8.83f);
        pathBuilder2.lineTo(17.17f, 12.0f);
        pathBuilder2.lineTo(14.0f, 15.17f);
        pathBuilder2.verticalLineTo(14.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m6131addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5769getButtKaPHkGw2, m5779getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forward = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
