package androidx.compose.ui.input.focus;

import androidx.compose.ui.input.focus.FocusAwareEvent;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusAwareInputModifier.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u0004BI\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u000fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R(\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "Landroidx/compose/ui/input/focus/FocusAwareEvent;", "T", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Lkotlin/Function1;", "", "onEvent", "onPreEvent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/modifier/ProvidableModifierLocal;)V", "event", "propagatePreEvent", "(Landroidx/compose/ui/input/focus/FocusAwareEvent;)Z", "propagateEvent", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "propagateFocusAwareEvent", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "getOnPreEvent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "focusAwareEventParent", "Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "getValue", "()Landroidx/compose/ui/input/focus/FocusAwareInputModifier;", "value", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FocusAwareInputModifier<T extends FocusAwareEvent> implements ModifierLocalConsumer, ModifierLocalProvider<FocusAwareInputModifier<T>> {
    private FocusAwareInputModifier focusAwareEventParent;
    private final ProvidableModifierLocal key;
    private final Function1 onEvent;
    private final Function1 onPreEvent;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public FocusAwareInputModifier getValue() {
        return this;
    }

    public FocusAwareInputModifier(Function1 function1, Function1 function12, ProvidableModifierLocal key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.onEvent = function1;
        this.onPreEvent = function12;
        this.key = key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return this.key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.focusAwareEventParent = (FocusAwareInputModifier) scope.getCurrent(getKey());
    }

    public final boolean propagateFocusAwareEvent(FocusAwareEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return propagatePreEvent(event) || propagateEvent(event);
    }

    private final boolean propagatePreEvent(FocusAwareEvent event) {
        FocusAwareInputModifier focusAwareInputModifier = this.focusAwareEventParent;
        if (focusAwareInputModifier != null && focusAwareInputModifier.propagatePreEvent(event)) {
            return true;
        }
        Function1 function1 = this.onPreEvent;
        if (function1 != null) {
            return ((Boolean) function1.invoke(event)).booleanValue();
        }
        return false;
    }

    private final boolean propagateEvent(FocusAwareEvent event) {
        Function1 function1 = this.onEvent;
        if (function1 != null && ((Boolean) function1.invoke(event)).booleanValue()) {
            return true;
        }
        FocusAwareInputModifier focusAwareInputModifier = this.focusAwareEventParent;
        if (focusAwareInputModifier != null) {
            return focusAwareInputModifier.propagateEvent(event);
        }
        return false;
    }
}
