package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusTraversal.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001b\u001a\u00020\u0006*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "", "onFound", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusModifier;ILandroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)Z", "focusSearch", "findActiveFocusNode", "(Landroidx/compose/ui/focus/FocusModifier;)Landroidx/compose/ui/focus/FocusModifier;", "findActiveParent", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "(Landroidx/compose/ui/focus/FocusModifier;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/runtime/collection/MutableVector;", "activatedChildren", "(Landroidx/compose/ui/focus/FocusModifier;)Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/key/KeyInputModifier;", "findLastKeyInputModifier", "(Landroidx/compose/ui/focus/FocusModifier;)Landroidx/compose/ui/input/key/KeyInputModifier;", "one", "two", "lastOf", "(Landroidx/compose/ui/input/key/KeyInputModifier;Landroidx/compose/ui/input/key/KeyInputModifier;)Landroidx/compose/ui/input/key/KeyInputModifier;", "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusModifier;)Z", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FocusTraversalKt {

    /* compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m1266focusSearchsMXa3k8(FocusModifier focusSearch, int i, LayoutDirection layoutDirection, Function1 onFound) {
        int m1253getLeftdhqQ8s;
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1247equalsimpl0(i, companion.m1254getNextdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1256getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m1269oneDimensionalFocusSearchOMvw8(focusSearch, i, onFound);
        }
        if (FocusDirection.m1247equalsimpl0(i, companion.m1253getLeftdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1257getRightdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1258getUpdhqQ8s()) ? true : FocusDirection.m1247equalsimpl0(i, companion.m1251getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m1278twoDimensionalFocusSearchOMvw8(focusSearch, i, onFound);
        }
        if (FocusDirection.m1247equalsimpl0(i, companion.m1252getIndhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                m1253getLeftdhqQ8s = companion.m1253getLeftdhqQ8s();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m1253getLeftdhqQ8s = companion.m1257getRightdhqQ8s();
            }
            FocusModifier findActiveFocusNode = findActiveFocusNode(focusSearch);
            if (findActiveFocusNode != null) {
                return TwoDimensionalFocusSearchKt.m1278twoDimensionalFocusSearchOMvw8(findActiveFocusNode, m1253getLeftdhqQ8s, onFound);
            }
        } else if (FocusDirection.m1247equalsimpl0(i, companion.m1255getOutdhqQ8s())) {
            FocusModifier findActiveFocusNode2 = findActiveFocusNode(focusSearch);
            FocusModifier findActiveParent = findActiveFocusNode2 != null ? findActiveParent(findActiveFocusNode2) : null;
            if (!Intrinsics.areEqual(findActiveParent, focusSearch) && findActiveParent != null) {
                return ((Boolean) onFound.invoke(findActiveParent)).booleanValue();
            }
        } else {
            throw new IllegalStateException("Invalid FocusDirection");
        }
        return false;
    }

    public static final FocusModifier findActiveFocusNode(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild != null) {
                    return findActiveFocusNode(focusedChild);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final FocusModifier findActiveParent(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        FocusModifier parent = focusModifier.getParent();
        if (parent == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return findActiveParent(parent);
            case 3:
                return focusModifier;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Rect focusRect(FocusModifier focusModifier) {
        Rect localBoundingBoxOf;
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        return (layoutNodeWrapper == null || (localBoundingBoxOf = LayoutCoordinatesKt.findRoot(layoutNodeWrapper).localBoundingBoxOf(layoutNodeWrapper, false)) == null) ? Rect.INSTANCE.getZero() : localBoundingBoxOf;
    }

    public static final MutableVector activatedChildren(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        MutableVector children = focusModifier.getChildren();
        int size = children.getSize();
        if (size > 0) {
            Object[] content = children.getContent();
            int i = 0;
            int i2 = 0;
            while (!((FocusModifier) content[i2]).getFocusState().isDeactivated()) {
                i2++;
                if (i2 >= size) {
                }
            }
            MutableVector mutableVector = new MutableVector(new FocusModifier[16], 0);
            MutableVector children2 = focusModifier.getChildren();
            int size2 = children2.getSize();
            if (size2 > 0) {
                Object[] content2 = children2.getContent();
                do {
                    FocusModifier focusModifier2 = (FocusModifier) content2[i];
                    if (focusModifier2.getFocusState().isDeactivated()) {
                        mutableVector.addAll(mutableVector.getSize(), activatedChildren(focusModifier2));
                    } else {
                        mutableVector.add(focusModifier2);
                    }
                    i++;
                } while (i < size2);
            }
            return mutableVector;
        }
        return focusModifier.getChildren();
    }

    public static final KeyInputModifier findLastKeyInputModifier(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        KeyInputModifier keyInputModifier = null;
        if (layoutNodeWrapper == null || (layoutNode = layoutNodeWrapper.getLayoutNode()) == null) {
            return null;
        }
        MutableVector keyInputChildren = focusModifier.getKeyInputChildren();
        int size = keyInputChildren.getSize();
        if (size > 0) {
            Object[] content = keyInputChildren.getContent();
            int i = 0;
            do {
                KeyInputModifier keyInputModifier2 = (KeyInputModifier) content[i];
                if (Intrinsics.areEqual(keyInputModifier2.getLayoutNode(), layoutNode)) {
                    keyInputModifier = lastOf(keyInputModifier2, keyInputModifier);
                }
                i++;
            } while (i < size);
        }
        return keyInputModifier != null ? keyInputModifier : focusModifier.getKeyInputModifier();
    }

    public static final boolean isEligibleForFocusSearch(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode layoutNode2;
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper2 = focusModifier.getLayoutNodeWrapper();
        return (layoutNodeWrapper2 == null || (layoutNode = layoutNodeWrapper2.getLayoutNode()) == null || !layoutNode.getIsPlaced() || (layoutNodeWrapper = focusModifier.getLayoutNodeWrapper()) == null || (layoutNode2 = layoutNodeWrapper.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }

    private static final KeyInputModifier lastOf(KeyInputModifier keyInputModifier, KeyInputModifier keyInputModifier2) {
        if (keyInputModifier2 == null) {
            return keyInputModifier;
        }
        LayoutNode layoutNode = keyInputModifier.getLayoutNode();
        KeyInputModifier keyInputModifier3 = keyInputModifier2;
        while (!Intrinsics.areEqual(keyInputModifier3, keyInputModifier)) {
            keyInputModifier3 = keyInputModifier3.getParent();
            if (keyInputModifier3 == null || !Intrinsics.areEqual(keyInputModifier3.getLayoutNode(), layoutNode)) {
                return keyInputModifier;
            }
        }
        return keyInputModifier2;
    }
}
