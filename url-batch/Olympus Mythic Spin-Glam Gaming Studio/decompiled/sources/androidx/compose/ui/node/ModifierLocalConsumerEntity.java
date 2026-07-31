package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocalConsumerEntity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001+B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00022\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0014\u0010&\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010%R$\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/ui/node/ModifierLocalConsumerEntity;", "Lkotlin/Function0;", "", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", IronSourceConstants.EVENTS_PROVIDER, "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "modifier", "<init>", "(Landroidx/compose/ui/node/ModifierLocalProviderEntity;Landroidx/compose/ui/modifier/ModifierLocalConsumer;)V", "attach", "()V", "attachDelayed", "detach", "Landroidx/compose/ui/modifier/ModifierLocal;", "local", "invalidateConsumersOf", "(Landroidx/compose/ui/modifier/ModifierLocal;)V", "notifyConsumerOfChanges", "invalidateConsumer", "invoke", "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "getProvider", "()Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "setProvider", "(Landroidx/compose/ui/node/ModifierLocalProviderEntity;)V", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "getModifier", "()Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/runtime/collection/MutableVector;", "modifierLocalsRead", "Landroidx/compose/runtime/collection/MutableVector;", "", "<set-?>", "isAttached", "Z", "()Z", "isValid", "T", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "current", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ModifierLocalConsumerEntity implements Function0, OwnerScope, ModifierLocalReadScope {
    private boolean isAttached;
    private final ModifierLocalConsumer modifier;
    private final MutableVector modifierLocalsRead;
    private ModifierLocalProviderEntity provider;
    private static final Function1 onReadValuesChanged = new Function1() { // from class: androidx.compose.ui.node.ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ModifierLocalConsumerEntity) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ModifierLocalConsumerEntity node) {
            Intrinsics.checkNotNullParameter(node, "node");
            node.notifyConsumerOfChanges();
        }
    };
    private static final ModifierLocalReadScope DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.ModifierLocalConsumerEntity$Companion$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public Object getCurrent(ModifierLocal modifierLocal) {
            Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
            return modifierLocal.getDefaultFactory().mo4828invoke();
        }
    };

    public ModifierLocalConsumerEntity(ModifierLocalProviderEntity provider, ModifierLocalConsumer modifier) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.provider = provider;
        this.modifier = modifier;
        this.modifierLocalsRead = new MutableVector(new ModifierLocal[16], 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        m2060invoke();
        return Unit.INSTANCE;
    }

    public final void setProvider(ModifierLocalProviderEntity modifierLocalProviderEntity) {
        Intrinsics.checkNotNullParameter(modifierLocalProviderEntity, "<set-?>");
        this.provider = modifierLocalProviderEntity;
    }

    public final ModifierLocalConsumer getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    /* renamed from: isValid, reason: from getter */
    public boolean getIsAttached() {
        return this.isAttached;
    }

    public final void attach() {
        this.isAttached = true;
        notifyConsumerOfChanges();
    }

    public final void attachDelayed() {
        this.isAttached = true;
        invalidateConsumer();
    }

    public final void detach() {
        this.modifier.onModifierLocalsUpdated(DetachedModifierLocalReadScope);
        this.isAttached = false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    public Object getCurrent(ModifierLocal modifierLocal) {
        Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
        this.modifierLocalsRead.add(modifierLocal);
        ModifierLocalProvider findModifierLocalProvider = this.provider.findModifierLocalProvider(modifierLocal);
        if (findModifierLocalProvider == null) {
            return modifierLocal.getDefaultFactory().mo4828invoke();
        }
        return findModifierLocalProvider.getValue();
    }

    public final void invalidateConsumersOf(ModifierLocal local) {
        Owner owner;
        Intrinsics.checkNotNullParameter(local, "local");
        if (!this.modifierLocalsRead.contains(local) || (owner = this.provider.getLayoutNode().getOwner()) == null) {
            return;
        }
        owner.registerOnEndApplyChangesListener(this);
    }

    public final void notifyConsumerOfChanges() {
        if (this.isAttached) {
            this.modifierLocalsRead.clear();
            LayoutNodeKt.requireOwner(this.provider.getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, onReadValuesChanged, new Function0() { // from class: androidx.compose.ui.node.ModifierLocalConsumerEntity$notifyConsumerOfChanges$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m2061invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2061invoke() {
                    ModifierLocalConsumerEntity.this.getModifier().onModifierLocalsUpdated(ModifierLocalConsumerEntity.this);
                }
            });
        }
    }

    public final void invalidateConsumer() {
        Owner owner = this.provider.getLayoutNode().getOwner();
        if (owner != null) {
            owner.registerOnEndApplyChangesListener(this);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m2060invoke() {
        notifyConsumerOfChanges();
    }
}
