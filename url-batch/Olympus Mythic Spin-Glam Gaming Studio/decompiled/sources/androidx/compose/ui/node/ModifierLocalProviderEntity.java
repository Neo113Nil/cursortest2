package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import com.yandex.div.core.ScrollDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModifierLocalProviderEntity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "Lkotlin/Function0;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/modifier/ModifierLocalProvider;)V", "Landroidx/compose/ui/modifier/ModifierLocal;", "local", "", "stopIfProvided", "invalidateConsumersOf", "(Landroidx/compose/ui/modifier/ModifierLocal;Z)V", "attach", "()V", "attachDelayed", "detach", "findModifierLocalProvider", "(Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalProvider;", "invoke", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "getModifier", "()Landroidx/compose/ui/modifier/ModifierLocalProvider;", ScrollDirection.NEXT, "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "getNext", "()Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "setNext", "(Landroidx/compose/ui/node/ModifierLocalProviderEntity;)V", "prev", "getPrev", "setPrev", "<set-?>", "isAttached", "Z", "()Z", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/ModifierLocalConsumerEntity;", "consumers", "Landroidx/compose/runtime/collection/MutableVector;", "getConsumers", "()Landroidx/compose/runtime/collection/MutableVector;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ModifierLocalProviderEntity implements Function0 {
    private final MutableVector consumers;
    private boolean isAttached;
    private final LayoutNode layoutNode;
    private final ModifierLocalProvider modifier;
    private ModifierLocalProviderEntity next;
    private ModifierLocalProviderEntity prev;

    public ModifierLocalProviderEntity(LayoutNode layoutNode, ModifierLocalProvider modifier) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.layoutNode = layoutNode;
        this.modifier = modifier;
        this.consumers = new MutableVector(new ModifierLocalConsumerEntity[16], 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        m2062invoke();
        return Unit.INSTANCE;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final ModifierLocalProvider getModifier() {
        return this.modifier;
    }

    public final ModifierLocalProviderEntity getNext() {
        return this.next;
    }

    public final void setNext(ModifierLocalProviderEntity modifierLocalProviderEntity) {
        this.next = modifierLocalProviderEntity;
    }

    public final ModifierLocalProviderEntity getPrev() {
        return this.prev;
    }

    public final void setPrev(ModifierLocalProviderEntity modifierLocalProviderEntity) {
        this.prev = modifierLocalProviderEntity;
    }

    public final MutableVector getConsumers() {
        return this.consumers;
    }

    public final void attach() {
        this.isAttached = true;
        int i = 0;
        invalidateConsumersOf(this.modifier.getKey(), false);
        MutableVector mutableVector = this.consumers;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            do {
                ((ModifierLocalConsumerEntity) content[i]).attach();
                i++;
            } while (i < size);
        }
    }

    public final void attachDelayed() {
        this.isAttached = true;
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            owner.registerOnEndApplyChangesListener(this);
        }
        MutableVector mutableVector = this.consumers;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((ModifierLocalConsumerEntity) content[i]).attachDelayed();
                i++;
            } while (i < size);
        }
    }

    public final void detach() {
        this.isAttached = false;
        MutableVector mutableVector = this.consumers;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((ModifierLocalConsumerEntity) content[i]).detach();
                i++;
            } while (i < size);
        }
        invalidateConsumersOf(this.modifier.getKey(), false);
    }

    private final void invalidateConsumersOf(ModifierLocal local, boolean stopIfProvided) {
        Unit unit;
        MutableVector mutableVector;
        int size;
        if (stopIfProvided && Intrinsics.areEqual(this.modifier.getKey(), local)) {
            return;
        }
        MutableVector mutableVector2 = this.consumers;
        int size2 = mutableVector2.getSize();
        int i = 0;
        if (size2 > 0) {
            Object[] content = mutableVector2.getContent();
            int i2 = 0;
            do {
                ((ModifierLocalConsumerEntity) content[i2]).invalidateConsumersOf(local);
                i2++;
            } while (i2 < size2);
        }
        ModifierLocalProviderEntity modifierLocalProviderEntity = this.next;
        if (modifierLocalProviderEntity != null) {
            modifierLocalProviderEntity.invalidateConsumersOf(local, true);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null || (size = (mutableVector = this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
            return;
        }
        Object[] content2 = mutableVector.getContent();
        do {
            ((LayoutNode) content2[i]).getModifierLocalsHead().invalidateConsumersOf(local, true);
            i++;
        } while (i < size);
    }

    public final ModifierLocalProvider findModifierLocalProvider(ModifierLocal local) {
        ModifierLocalProviderEntity modifierLocalsTail;
        ModifierLocalProvider findModifierLocalProvider;
        Intrinsics.checkNotNullParameter(local, "local");
        if (Intrinsics.areEqual(this.modifier.getKey(), local)) {
            return this.modifier;
        }
        ModifierLocalProviderEntity modifierLocalProviderEntity = this.prev;
        if (modifierLocalProviderEntity != null && (findModifierLocalProvider = modifierLocalProviderEntity.findModifierLocalProvider(local)) != null) {
            return findModifierLocalProvider;
        }
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release == null || (modifierLocalsTail = parent$ui_release.getModifierLocalsTail()) == null) {
            return null;
        }
        return modifierLocalsTail.findModifierLocalProvider(local);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m2062invoke() {
        if (this.isAttached) {
            invalidateConsumersOf(this.modifier.getKey(), false);
        }
    }
}
