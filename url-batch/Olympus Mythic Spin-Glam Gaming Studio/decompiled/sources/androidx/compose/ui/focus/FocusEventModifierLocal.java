package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusEventModifier.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "onFocusEvent", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusModifier;", "modifiers", "addFocusModifiers", "(Landroidx/compose/runtime/collection/MutableVector;)V", "removeFocusModifiers", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "focusModifier", "addFocusModifier", "(Landroidx/compose/ui/focus/FocusModifier;)V", "removeFocusModifier", "propagateFocusEvent", "()V", "notifyIfNoFocusModifiers", "Lkotlin/jvm/functions/Function1;", "getOnFocusEvent", "()Lkotlin/jvm/functions/Function1;", "parent", "Landroidx/compose/ui/focus/FocusEventModifierLocal;", "children", "Landroidx/compose/runtime/collection/MutableVector;", "focusModifiers", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/ui/focus/FocusEventModifierLocal;", "value", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusEventModifierLocal implements ModifierLocalProvider<FocusEventModifierLocal>, ModifierLocalConsumer {
    private final MutableVector children;
    private final MutableVector focusModifiers;
    private final Function1 onFocusEvent;
    private FocusEventModifierLocal parent;

    /* compiled from: FocusEventModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public FocusEventModifierLocal getValue() {
        return this;
    }

    public FocusEventModifierLocal(Function1 onFocusEvent) {
        Intrinsics.checkNotNullParameter(onFocusEvent, "onFocusEvent");
        this.onFocusEvent = onFocusEvent;
        this.children = new MutableVector(new FocusEventModifierLocal[16], 0);
        this.focusModifiers = new MutableVector(new FocusModifier[16], 0);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return FocusEventModifierKt.getModifierLocalFocusEvent();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) scope.getCurrent(FocusEventModifierKt.getModifierLocalFocusEvent());
        if (!Intrinsics.areEqual(focusEventModifierLocal, this.parent)) {
            FocusEventModifierLocal focusEventModifierLocal2 = this.parent;
            if (focusEventModifierLocal2 != null) {
                focusEventModifierLocal2.children.remove(this);
                focusEventModifierLocal2.removeFocusModifiers(this.focusModifiers);
            }
            this.parent = focusEventModifierLocal;
            if (focusEventModifierLocal != null) {
                focusEventModifierLocal.children.add(this);
                focusEventModifierLocal.addFocusModifiers(this.focusModifiers);
            }
        }
        this.parent = (FocusEventModifierLocal) scope.getCurrent(FocusEventModifierKt.getModifierLocalFocusEvent());
    }

    public final void addFocusModifier(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.add(focusModifier);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.addFocusModifier(focusModifier);
        }
    }

    private final void addFocusModifiers(MutableVector modifiers) {
        MutableVector mutableVector = this.focusModifiers;
        mutableVector.addAll(mutableVector.getSize(), modifiers);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.addFocusModifiers(modifiers);
        }
    }

    public final void removeFocusModifier(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.remove(focusModifier);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.removeFocusModifier(focusModifier);
        }
    }

    private final void removeFocusModifiers(MutableVector modifiers) {
        this.focusModifiers.removeAll(modifiers);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.removeFocusModifiers(modifiers);
        }
    }

    public final void propagateFocusEvent() {
        FocusStateImpl focusStateImpl;
        Boolean bool;
        int size = this.focusModifiers.getSize();
        if (size != 0) {
            int i = 0;
            if (size == 1) {
                focusStateImpl = ((FocusModifier) this.focusModifiers.getContent()[0]).getFocusState();
            } else {
                MutableVector mutableVector = this.focusModifiers;
                int size2 = mutableVector.getSize();
                FocusModifier focusModifier = null;
                Boolean bool2 = null;
                if (size2 > 0) {
                    Object[] content = mutableVector.getContent();
                    FocusModifier focusModifier2 = null;
                    do {
                        FocusModifier focusModifier3 = (FocusModifier) content[i];
                        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier3.getFocusState().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                bool2 = Boolean.FALSE;
                                focusModifier2 = focusModifier3;
                                break;
                            case 5:
                                if (bool2 == null) {
                                    bool2 = Boolean.TRUE;
                                    break;
                                }
                                break;
                            case 6:
                                bool2 = Boolean.FALSE;
                                break;
                        }
                        i++;
                    } while (i < size2);
                    bool = bool2;
                    focusModifier = focusModifier2;
                } else {
                    bool = null;
                }
                if (focusModifier == null || (focusStateImpl = focusModifier.getFocusState()) == null) {
                    if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                        focusStateImpl = FocusStateImpl.Deactivated;
                    } else {
                        focusStateImpl = FocusStateImpl.Inactive;
                    }
                }
            }
        } else {
            focusStateImpl = FocusStateImpl.Inactive;
        }
        this.onFocusEvent.invoke(focusStateImpl);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.propagateFocusEvent();
        }
    }

    public final void notifyIfNoFocusModifiers() {
        if (this.focusModifiers.isEmpty()) {
            this.onFocusEvent.invoke(FocusStateImpl.Inactive);
        }
    }
}
