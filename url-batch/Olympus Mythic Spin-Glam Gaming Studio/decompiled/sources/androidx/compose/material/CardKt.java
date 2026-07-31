package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001af\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Card", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardKt {
    /* renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m764CardFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, Function2 content, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1956755640);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Shape medium = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long m800getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU() : j;
        SurfaceKt.m988SurfaceFjzlyU(modifier2, medium, m800getSurface0d7_KjU, (i2 & 8) != 0 ? ColorsKt.m814contentColorForek8zF_U(m800getSurface0d7_KjU, composer, (i >> 6) & 14) : j2, (i2 & 16) != 0 ? null : borderStroke, (i2 & 32) != 0 ? Dp.m2507constructorimpl(1) : f, content, composer, i & 4194302, 0);
        composer.endReplaceableGroup();
    }
}
