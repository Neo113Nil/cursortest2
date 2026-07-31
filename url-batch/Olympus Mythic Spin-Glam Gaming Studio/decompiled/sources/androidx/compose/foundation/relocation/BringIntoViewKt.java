package androidx.compose.foundation.relocation;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: BringIntoView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"(\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "ModifierLocalBringIntoViewParent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalBringIntoViewParent", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalBringIntoViewParent$annotations", "()V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BringIntoViewKt {
    private static final ProvidableModifierLocal ModifierLocalBringIntoViewParent = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.foundation.relocation.BringIntoViewKt$ModifierLocalBringIntoViewParent$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final BringIntoViewParent mo4828invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal getModifierLocalBringIntoViewParent() {
        return ModifierLocalBringIntoViewParent;
    }
}
