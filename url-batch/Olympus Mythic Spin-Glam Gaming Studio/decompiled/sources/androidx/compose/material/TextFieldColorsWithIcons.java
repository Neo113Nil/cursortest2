package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\nJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/material/TextFieldColorsWithIcons;", "Landroidx/compose/material/TextFieldColors;", "leadingIconColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trailingIconColor", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes10.dex */
public interface TextFieldColorsWithIcons extends TextFieldColors {
    State leadingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    State trailingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static State leadingIconColor(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            composer.startReplaceableGroup(1279189910);
            State leadingIconColor = textFieldColorsWithIcons.leadingIconColor(z, z2, composer, (i & 126) | ((i >> 3) & 896));
            composer.endReplaceableGroup();
            return leadingIconColor;
        }
    }
}
