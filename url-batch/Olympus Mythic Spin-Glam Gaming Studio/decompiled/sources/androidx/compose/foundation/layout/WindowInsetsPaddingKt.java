package androidx.compose.foundation.layout;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsetsPadding.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/foundation/layout/WindowInsets;", "ModifierLocalConsumedWindowInsets", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalConsumedWindowInsets", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WindowInsetsPaddingKt {
    private static final ProvidableModifierLocal ModifierLocalConsumedWindowInsets = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final WindowInsets mo4828invoke() {
            return WindowInsetsKt.WindowInsets(0, 0, 0, 0);
        }
    });

    public static final ProvidableModifierLocal getModifierLocalConsumedWindowInsets() {
        return ModifierLocalConsumedWindowInsets;
    }
}
