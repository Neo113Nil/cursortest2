package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusRequesterModifier.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000fJ\u001b\u0010\u0016\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "addFocusModifier", "(Landroidx/compose/ui/focus/FocusModifier;)V", "Landroidx/compose/runtime/collection/MutableVector;", "newModifiers", "addFocusModifiers", "(Landroidx/compose/runtime/collection/MutableVector;)V", "removeFocusModifier", "removedModifiers", "removeFocusModifiers", "findFocusNode", "()Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "parent", "Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "focusModifiers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "value", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FocusRequesterModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<FocusRequesterModifierLocal> {
    private final MutableVector focusModifiers;
    private final FocusRequester focusRequester;
    private FocusRequesterModifierLocal parent;

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public FocusRequesterModifierLocal getValue() {
        return this;
    }

    public FocusRequesterModifierLocal(FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.focusRequester = focusRequester;
        this.focusModifiers = new MutableVector(new FocusModifier[16], 0);
        focusRequester.getFocusRequesterModifierLocals().add(this);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) scope.getCurrent(FocusRequesterModifierKt.getModifierLocalFocusRequester());
        if (Intrinsics.areEqual(focusRequesterModifierLocal, this.parent)) {
            return;
        }
        FocusRequesterModifierLocal focusRequesterModifierLocal2 = this.parent;
        if (focusRequesterModifierLocal2 != null) {
            focusRequesterModifierLocal2.removeFocusModifiers(this.focusModifiers);
        }
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifiers(this.focusModifiers);
        }
        this.parent = focusRequesterModifierLocal;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return FocusRequesterModifierKt.getModifierLocalFocusRequester();
    }

    public final void addFocusModifier(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.add(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifier(focusModifier);
        }
    }

    public final void addFocusModifiers(MutableVector newModifiers) {
        Intrinsics.checkNotNullParameter(newModifiers, "newModifiers");
        MutableVector mutableVector = this.focusModifiers;
        mutableVector.addAll(mutableVector.getSize(), newModifiers);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifiers(newModifiers);
        }
    }

    public final void removeFocusModifier(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.remove(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.removeFocusModifier(focusModifier);
        }
    }

    public final void removeFocusModifiers(MutableVector removedModifiers) {
        Intrinsics.checkNotNullParameter(removedModifiers, "removedModifiers");
        this.focusModifiers.removeAll(removedModifiers);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.removeFocusModifiers(removedModifiers);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r7.indexOf(r5) < r7.indexOf(r6)) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FocusModifier findFocusNode() {
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        MutableVector mutableVector = this.focusModifiers;
        int size = mutableVector.getSize();
        FocusModifier focusModifier = null;
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                FocusModifier focusModifier2 = (FocusModifier) content[i];
                if (focusModifier != null && (layoutNodeWrapper = focusModifier.getLayoutNodeWrapper()) != null && (layoutNode = layoutNodeWrapper.getLayoutNode()) != null) {
                    LayoutNodeWrapper layoutNodeWrapper2 = focusModifier2.getLayoutNodeWrapper();
                    if (layoutNodeWrapper2 != null && (layoutNode2 = layoutNodeWrapper2.getLayoutNode()) != null) {
                        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
                            layoutNode = layoutNode.getParent$ui_release();
                            Intrinsics.checkNotNull(layoutNode);
                        }
                        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
                            layoutNode2 = layoutNode2.getParent$ui_release();
                            Intrinsics.checkNotNull(layoutNode2);
                        }
                        while (!Intrinsics.areEqual(layoutNode.getParent$ui_release(), layoutNode2.getParent$ui_release())) {
                            layoutNode = layoutNode.getParent$ui_release();
                            Intrinsics.checkNotNull(layoutNode);
                            layoutNode2 = layoutNode2.getParent$ui_release();
                            Intrinsics.checkNotNull(layoutNode2);
                        }
                        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                        Intrinsics.checkNotNull(parent$ui_release);
                        MutableVector mutableVector2 = parent$ui_release.get_children$ui_release();
                    }
                    i++;
                }
                focusModifier = focusModifier2;
                i++;
            } while (i < size);
        }
        return focusModifier;
    }
}
