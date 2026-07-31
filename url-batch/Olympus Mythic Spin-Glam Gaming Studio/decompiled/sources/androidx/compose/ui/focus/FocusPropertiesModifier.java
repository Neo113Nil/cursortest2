package androidx.compose.ui.focus;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusProperties.kt */
@Stable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B/\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR/\u0010%\u001a\u0004\u0018\u00010\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\"¨\u0006-"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "focusPropertiesScope", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "focusProperties", "calculateProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Lkotlin/jvm/functions/Function1;", "getFocusPropertiesScope", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "parent$delegate", "Landroidx/compose/runtime/MutableState;", "getParent", "()Landroidx/compose/ui/focus/FocusPropertiesModifier;", "setParent", "(Landroidx/compose/ui/focus/FocusPropertiesModifier;)V", "parent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getValue", "value", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FocusPropertiesModifier extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider<FocusPropertiesModifier> {
    private final Function1 focusPropertiesScope;
    private final ProvidableModifierLocal key;

    /* renamed from: parent$delegate, reason: from kotlin metadata */
    private final MutableState parent;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public FocusPropertiesModifier getValue() {
        return this;
    }

    public final Function1 getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusPropertiesModifier(Function1 focusPropertiesScope, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(focusPropertiesScope, "focusPropertiesScope");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.focusPropertiesScope = focusPropertiesScope;
        this.parent = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.key = FocusPropertiesKt.getModifierLocalFocusProperties();
    }

    private final FocusPropertiesModifier getParent() {
        return (FocusPropertiesModifier) this.parent.getValue();
    }

    private final void setParent(FocusPropertiesModifier focusPropertiesModifier) {
        this.parent.setValue(focusPropertiesModifier);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        setParent((FocusPropertiesModifier) scope.getCurrent(FocusPropertiesKt.getModifierLocalFocusProperties()));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return this.key;
    }

    public boolean equals(Object other) {
        return (other instanceof FocusPropertiesModifier) && Intrinsics.areEqual(this.focusPropertiesScope, ((FocusPropertiesModifier) other).focusPropertiesScope);
    }

    public int hashCode() {
        return this.focusPropertiesScope.hashCode();
    }

    public final void calculateProperties(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.focusPropertiesScope.invoke(focusProperties);
        FocusPropertiesModifier parent = getParent();
        if (parent != null) {
            parent.calculateProperties(focusProperties);
        }
    }
}
