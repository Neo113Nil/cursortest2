package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.EntityList;
import androidx.compose.ui.node.LayoutNodeEntity;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SemanticsEntity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsEntity;", "Landroidx/compose/ui/node/LayoutNodeEntity;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/semantics/SemanticsModifier;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "onDetach", "()V", "onAttach", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "", "getUseMinimumTouchTarget", "()Z", "useMinimumTouchTarget", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SemanticsEntity extends LayoutNodeEntity<SemanticsEntity, SemanticsModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsEntity(LayoutNodeWrapper wrapped, SemanticsModifier modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    private final boolean getUseMinimumTouchTarget() {
        return SemanticsConfigurationKt.getOrNull(((SemanticsModifier) getModifier()).getSemanticsConfiguration(), SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public final SemanticsConfiguration collapsedSemanticsConfiguration() {
        SemanticsEntity semanticsEntity = (SemanticsEntity) getNext();
        SemanticsEntity semanticsEntity2 = null;
        if (semanticsEntity == null) {
            LayoutNodeWrapper wrapped = getLayoutNodeWrapper().getWrapped();
            if (wrapped != null) {
                while (wrapped != null && !EntityList.m1994has0OSVbXo(wrapped.getEntities(), EntityList.INSTANCE.m2004getSemanticsEntityTypeEEbPh1w())) {
                    wrapped = wrapped.getWrapped();
                }
                if (wrapped != null && (semanticsEntity = (SemanticsEntity) EntityList.m1996head0OSVbXo(wrapped.getEntities(), EntityList.INSTANCE.m2004getSemanticsEntityTypeEEbPh1w())) != null) {
                    LayoutNodeWrapper layoutNodeWrapper = semanticsEntity.getLayoutNodeWrapper();
                    while (layoutNodeWrapper != null) {
                        if (semanticsEntity != null) {
                            semanticsEntity2 = semanticsEntity;
                            break;
                        }
                        layoutNodeWrapper = layoutNodeWrapper.getWrapped();
                        semanticsEntity = layoutNodeWrapper != null ? (SemanticsEntity) EntityList.m1996head0OSVbXo(layoutNodeWrapper.getEntities(), EntityList.INSTANCE.m2004getSemanticsEntityTypeEEbPh1w()) : null;
                    }
                }
            }
        } else {
            LayoutNodeWrapper layoutNodeWrapper2 = semanticsEntity.getLayoutNodeWrapper();
            while (layoutNodeWrapper2 != null) {
                if (semanticsEntity != null) {
                    semanticsEntity2 = semanticsEntity;
                    break;
                }
                layoutNodeWrapper2 = layoutNodeWrapper2.getWrapped();
                semanticsEntity = layoutNodeWrapper2 != null ? (SemanticsEntity) EntityList.m1996head0OSVbXo(layoutNodeWrapper2.getEntities(), EntityList.INSTANCE.m2004getSemanticsEntityTypeEEbPh1w()) : null;
            }
        }
        if (semanticsEntity2 == null || ((SemanticsModifier) getModifier()).getSemanticsConfiguration().getIsClearingSemantics()) {
            return ((SemanticsModifier) getModifier()).getSemanticsConfiguration();
        }
        SemanticsConfiguration copy = ((SemanticsModifier) getModifier()).getSemanticsConfiguration().copy();
        copy.collapsePeer$ui_release(semanticsEntity2.collapsedSemanticsConfiguration());
        return copy;
    }

    @Override // androidx.compose.ui.node.LayoutNodeEntity
    public void onDetach() {
        super.onDetach();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onSemanticsChange();
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeEntity
    public void onAttach() {
        super.onAttach();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onSemanticsChange();
        }
    }

    public String toString() {
        return super.toString() + " id: " + ((SemanticsModifier) getModifier()).getId() + " config: " + ((SemanticsModifier) getModifier()).getSemanticsConfiguration();
    }

    public final Rect touchBoundsInRoot() {
        if (!getIsAttached()) {
            return Rect.INSTANCE.getZero();
        }
        if (!getUseMinimumTouchTarget()) {
            return LayoutCoordinatesKt.boundsInRoot(getLayoutNodeWrapper());
        }
        return getLayoutNodeWrapper().touchBoundsInRoot();
    }
}
