package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material/SnackbarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "getBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "backgroundColor", "getPrimaryActionColor", "primaryActionColor", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnackbarDefaults {
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();

    private SnackbarDefaults() {
    }

    public final long getBackgroundColor(Composer composer, int i) {
        composer.startReplaceableGroup(1630911716);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        long m1467compositeOverOWjLjI = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(materialTheme.getColors(composer, 6).m795getOnSurface0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m800getSurface0d7_KjU());
        composer.endReplaceableGroup();
        return m1467compositeOverOWjLjI;
    }

    public final long getPrimaryActionColor(Composer composer, int i) {
        long m797getPrimaryVariant0d7_KjU;
        composer.startReplaceableGroup(-810329402);
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (colors.isLight()) {
            m797getPrimaryVariant0d7_KjU = ColorKt.m1467compositeOverOWjLjI(Color.m1445copywmQWz5c$default(colors.m800getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colors.m796getPrimary0d7_KjU());
        } else {
            m797getPrimaryVariant0d7_KjU = colors.m797getPrimaryVariant0d7_KjU();
        }
        composer.endReplaceableGroup();
        return m797getPrimaryVariant0d7_KjU;
    }
}
