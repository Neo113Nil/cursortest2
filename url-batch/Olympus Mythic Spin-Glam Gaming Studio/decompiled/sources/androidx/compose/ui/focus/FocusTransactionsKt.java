package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusTransactions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001d\u0010\b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u0003\u001a\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\r\u001a\u0013\u0010\u0011\u001a\u00020\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0003¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "", "requestFocus", "(Landroidx/compose/ui/focus/FocusModifier;)V", "activateNode", "deactivateNode", "", "forcedClear", "clearFocus", "(Landroidx/compose/ui/focus/FocusModifier;Z)Z", "grantFocus", "childNode", "grantFocusToChild", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;)Z", "clearChildFocus", "(Landroidx/compose/ui/focus/FocusModifier;)Z", "requestFocusForChild", "requestFocusForOwner", "sendOnFocusEvent", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FocusTransactionsKt {

    /* compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void requestFocus(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if (((layoutNodeWrapper == null || (layoutNode = layoutNodeWrapper.getLayoutNode()) == null) ? null : layoutNode.getOwner()) == null) {
            focusModifier.setFocusRequestedOnPlaced(true);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                sendOnFocusEvent(focusModifier);
                break;
            case 5:
                if (clearChildFocus(focusModifier)) {
                    grantFocus(focusModifier);
                    break;
                }
                break;
            case 6:
                FocusModifier parent = focusModifier.getParent();
                if (parent != null) {
                    requestFocusForChild(parent, focusModifier);
                    break;
                } else if (requestFocusForOwner(focusModifier)) {
                    grantFocus(focusModifier);
                    break;
                }
                break;
        }
    }

    public static final void activateNode(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()];
        if (i == 3) {
            focusModifier.setFocusState(FocusStateImpl.Inactive);
        } else {
            if (i != 4) {
                return;
            }
            focusModifier.setFocusState(FocusStateImpl.ActiveParent);
        }
    }

    public static final void deactivateNode(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        Owner owner;
        FocusManager focusManager;
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 5) {
                focusModifier.setFocusState(FocusStateImpl.DeactivatedParent);
                return;
            } else {
                if (i != 6) {
                    return;
                }
                focusModifier.setFocusState(FocusStateImpl.Deactivated);
                return;
            }
        }
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if (layoutNodeWrapper != null && (layoutNode = layoutNodeWrapper.getLayoutNode()) != null && (owner = layoutNode.getOwner()) != null && (focusManager = owner.getFocusManager()) != null) {
            focusManager.clearFocus(true);
        }
        focusModifier.setFocusState(FocusStateImpl.Deactivated);
    }

    public static /* synthetic */ boolean clearFocus$default(FocusModifier focusModifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusModifier, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean clearFocus(FocusModifier focusModifier, boolean z) {
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
                focusModifier.setFocusState(FocusStateImpl.Inactive);
                return true;
            case 2:
                if (!z) {
                    return z;
                }
                focusModifier.setFocusState(FocusStateImpl.Inactive);
                return z;
            case 3:
            case 6:
                return true;
            case 4:
                if (clearChildFocus(focusModifier)) {
                    focusModifier.setFocusState(FocusStateImpl.Deactivated);
                    return true;
                }
                return false;
            case 5:
                if (clearChildFocus(focusModifier)) {
                    focusModifier.setFocusState(FocusStateImpl.Inactive);
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final void grantFocus(FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl;
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 5:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.");
            default:
                throw new NoWhenBranchMatchedException();
        }
        focusModifier.setFocusState(focusStateImpl);
    }

    private static final boolean grantFocusToChild(FocusModifier focusModifier, FocusModifier focusModifier2) {
        focusModifier.setFocusedChild(focusModifier2);
        grantFocus(focusModifier2);
        return true;
    }

    private static final boolean clearChildFocus(FocusModifier focusModifier) {
        FocusModifier focusedChild = focusModifier.getFocusedChild();
        if (focusedChild == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!clearFocus$default(focusedChild, false, 1, null)) {
            return false;
        }
        focusModifier.setFocusedChild(null);
        return true;
    }

    private static final boolean requestFocusForChild(FocusModifier focusModifier, FocusModifier focusModifier2) {
        if (!focusModifier.getChildren().contains(focusModifier2)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier.getFocusState().ordinal()]) {
            case 1:
                focusModifier.setFocusState(FocusStateImpl.ActiveParent);
                return grantFocusToChild(focusModifier, focusModifier2);
            case 2:
                return false;
            case 3:
                activateNode(focusModifier);
                boolean requestFocusForChild = requestFocusForChild(focusModifier, focusModifier2);
                deactivateNode(focusModifier);
                return requestFocusForChild;
            case 4:
                if (focusModifier.getFocusedChild() == null || clearChildFocus(focusModifier)) {
                    return grantFocusToChild(focusModifier, focusModifier2);
                }
                return false;
            case 5:
                if (clearChildFocus(focusModifier)) {
                    return grantFocusToChild(focusModifier, focusModifier2);
                }
                return false;
            case 6:
                FocusModifier parent = focusModifier.getParent();
                if (parent == null && requestFocusForOwner(focusModifier)) {
                    focusModifier.setFocusState(FocusStateImpl.Active);
                    return requestFocusForChild(focusModifier, focusModifier2);
                }
                if (parent == null || !requestFocusForChild(parent, focusModifier)) {
                    return false;
                }
                return requestFocusForChild(focusModifier, focusModifier2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean requestFocusForOwner(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        Owner owner;
        LayoutNodeWrapper layoutNodeWrapper = focusModifier.getLayoutNodeWrapper();
        if (layoutNodeWrapper == null || (layoutNode = layoutNodeWrapper.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.");
        }
        return owner.requestFocus();
    }

    public static final void sendOnFocusEvent(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "<this>");
        FocusEventModifierLocal focusEventListener = focusModifier.getFocusEventListener();
        if (focusEventListener != null) {
            focusEventListener.propagateFocusEvent();
        }
    }
}
