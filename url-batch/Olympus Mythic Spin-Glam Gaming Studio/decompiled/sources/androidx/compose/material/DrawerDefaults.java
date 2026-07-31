package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: Drawer.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/material/DrawerDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "Elevation", "F", "getElevation-D9Ej5fM", "()F", "Landroidx/compose/ui/graphics/Color;", "getScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "scrimColor", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawerDefaults {
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();
    private static final float Elevation = Dp.m2507constructorimpl(16);

    private DrawerDefaults() {
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m840getElevationD9Ej5fM() {
        return Elevation;
    }

    public final long getScrimColor(Composer composer, int i) {
        composer.startReplaceableGroup(617225966);
        long m1445copywmQWz5c$default = Color.m1445copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        composer.endReplaceableGroup();
        return m1445copywmQWz5c$default;
    }
}
