package androidx.compose.ui.modifier;

import androidx.compose.runtime.State;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;

/* compiled from: ModifierLocalProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00028\u00008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"androidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value$delegate", "Landroidx/compose/runtime/State;", "getValue", "()Ljava/lang/Object;", "value", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModifierLocalProviderKt$modifierLocalProvider$1 extends InspectorValueInfo implements ModifierLocalProvider<Object> {
    private final ProvidableModifierLocal key;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final State value;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return this.key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this.value.getValue();
    }
}
