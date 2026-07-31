package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: PinnableParent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"(\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/foundation/lazy/layout/PinnableParent;", "ModifierLocalPinnableParent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalPinnableParent", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalPinnableParent$annotations", "()V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PinnableParentKt {
    private static final ProvidableModifierLocal ModifierLocalPinnableParent = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.foundation.lazy.layout.PinnableParentKt$ModifierLocalPinnableParent$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final PinnableParent mo4828invoke() {
            return null;
        }
    });

    public static final ProvidableModifierLocal getModifierLocalPinnableParent() {
        return ModifierLocalPinnableParent;
    }
}
