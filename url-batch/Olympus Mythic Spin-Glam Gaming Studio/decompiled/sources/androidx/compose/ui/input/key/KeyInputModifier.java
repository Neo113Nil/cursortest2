package androidx.compose.ui.input.key;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import com.ironsource.Y3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B6\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R(\u0010$\u001a\u0004\u0018\u00010\u00002\b\u0010#\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\u0004\u0018\u00010(2\b\u0010#\u001a\u0004\u0018\u00010(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010'\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "onKeyEvent", "onPreviewKeyEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "keyEvent", "processKeyInput-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "processKeyInput", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "propagatePreviewKeyEvent-ZmokQxo", "propagatePreviewKeyEvent", "propagateKeyEvent-ZmokQxo", "propagateKeyEvent", "Landroidx/compose/ui/layout/LayoutCoordinates;", Y3.f, "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Lkotlin/jvm/functions/Function1;", "getOnKeyEvent", "()Lkotlin/jvm/functions/Function1;", "getOnPreviewKeyEvent", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "Landroidx/compose/ui/focus/FocusModifier;", "<set-?>", "parent", "Landroidx/compose/ui/input/key/KeyInputModifier;", "getParent", "()Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "value", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class KeyInputModifier implements ModifierLocalConsumer, ModifierLocalProvider<KeyInputModifier>, OnPlacedModifier {
    private FocusModifier focusModifier;
    private LayoutNode layoutNode;
    private final Function1 onKeyEvent;
    private final Function1 onPreviewKeyEvent;
    private KeyInputModifier parent;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public KeyInputModifier getValue() {
        return this;
    }

    public KeyInputModifier(Function1 function1, Function1 function12) {
        this.onKeyEvent = function1;
        this.onPreviewKeyEvent = function12;
    }

    public final KeyInputModifier getParent() {
        return this.parent;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return KeyInputModifierKt.getModifierLocalKeyInput();
    }

    /* renamed from: processKeyInput-ZmokQxo, reason: not valid java name */
    public final boolean m1815processKeyInputZmokQxo(android.view.KeyEvent keyEvent) {
        FocusModifier findActiveFocusNode;
        KeyInputModifier findLastKeyInputModifier;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusModifier focusModifier = this.focusModifier;
        if (focusModifier == null || (findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusModifier)) == null || (findLastKeyInputModifier = FocusTraversalKt.findLastKeyInputModifier(findActiveFocusNode)) == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.");
        }
        if (findLastKeyInputModifier.m1817propagatePreviewKeyEventZmokQxo(keyEvent)) {
            return true;
        }
        return findLastKeyInputModifier.m1816propagateKeyEventZmokQxo(keyEvent);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        MutableVector keyInputChildren;
        MutableVector keyInputChildren2;
        Intrinsics.checkNotNullParameter(scope, "scope");
        FocusModifier focusModifier = this.focusModifier;
        if (focusModifier != null && (keyInputChildren2 = focusModifier.getKeyInputChildren()) != null) {
            keyInputChildren2.remove(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) scope.getCurrent(FocusModifierKt.getModifierLocalParentFocusModifier());
        this.focusModifier = focusModifier2;
        if (focusModifier2 != null && (keyInputChildren = focusModifier2.getKeyInputChildren()) != null) {
            keyInputChildren.add(this);
        }
        this.parent = (KeyInputModifier) scope.getCurrent(KeyInputModifierKt.getModifierLocalKeyInput());
    }

    /* renamed from: propagatePreviewKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean m1817propagatePreviewKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        KeyInputModifier keyInputModifier = this.parent;
        Boolean valueOf = keyInputModifier != null ? Boolean.valueOf(keyInputModifier.m1817propagatePreviewKeyEventZmokQxo(keyEvent)) : null;
        if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        Function1 function1 = this.onPreviewKeyEvent;
        if (function1 != null) {
            return ((Boolean) function1.invoke(KeyEvent.m1795boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    /* renamed from: propagateKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean m1816propagateKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Function1 function1 = this.onKeyEvent;
        Boolean bool = function1 != null ? (Boolean) function1.invoke(KeyEvent.m1795boximpl(keyEvent)) : null;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        KeyInputModifier keyInputModifier = this.parent;
        if (keyInputModifier != null) {
            return keyInputModifier.m1816propagateKeyEventZmokQxo(keyEvent);
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.layoutNode = ((LayoutNodeWrapper) coordinates).getLayoutNode();
    }
}
