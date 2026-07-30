package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusGroupNode.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u001c\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0007H\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0007H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/view/View$OnAttachStateChangeListener;", "()V", "focusedChild", "Landroid/view/View;", "getFocusedChild", "()Landroid/view/View;", "setFocusedChild", "(Landroid/view/View;)V", "applyFocusProperties", "", "focusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "getFocusTargetOfEmbeddedViewWrapper", "Landroidx/compose/ui/focus/FocusTargetNode;", "onAttach", "onDetach", "onEnter", "Landroidx/compose/ui/focus/FocusRequester;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "onEnter-3ESFkO8", "(I)Landroidx/compose/ui/focus/FocusRequester;", "onExit", "onExit-3ESFkO8", "onGlobalFocusChanged", "oldFocus", "newFocus", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {
    private View focusedChild;

    public final View getFocusedChild() {
        return this.focusedChild;
    }

    public final void setFocusedChild(View view) {
        this.focusedChild = view;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setEnter(new FocusGroupPropertiesNode$applyFocusProperties$1(this));
        focusProperties.setExit(new FocusGroupPropertiesNode$applyFocusProperties$2(this));
    }

    /* renamed from: onEnter-3ESFkO8, reason: not valid java name */
    public final FocusRequester m6549onEnter3ESFkO8(int focusDirection) {
        View view;
        Rect currentlyFocusedRect;
        view = FocusGroupNode_androidKt.getView(this);
        if (view.isFocused() || view.hasFocus()) {
            return FocusRequester.INSTANCE.getDefault();
        }
        FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode).getFocusOwner();
        Object requireOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode);
        Intrinsics.checkNotNull(requireOwner, "null cannot be cast to non-null type android.view.View");
        Integer m3525toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m3525toAndroidFocusDirection3ESFkO8(focusDirection);
        currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, (View) requireOwner, view);
        return FocusInteropUtils_androidKt.requestInteropFocus(view, m3525toAndroidFocusDirection3ESFkO8, currentlyFocusedRect) ? FocusRequester.INSTANCE.getDefault() : FocusRequester.INSTANCE.getCancel();
    }

    /* renamed from: onExit-3ESFkO8, reason: not valid java name */
    public final FocusRequester m6550onExit3ESFkO8(int focusDirection) {
        View view;
        Rect currentlyFocusedRect;
        View findNextFocusFromRect;
        boolean containsDescendant;
        view = FocusGroupNode_androidKt.getView(this);
        if (!view.hasFocus()) {
            return FocusRequester.INSTANCE.getDefault();
        }
        FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode).getFocusOwner();
        Object requireOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode);
        Intrinsics.checkNotNull(requireOwner, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) requireOwner;
        if (view instanceof ViewGroup) {
            currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, view2, view);
            Integer m3525toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m3525toAndroidFocusDirection3ESFkO8(focusDirection);
            int intValue = m3525toAndroidFocusDirection3ESFkO8 != null ? m3525toAndroidFocusDirection3ESFkO8.intValue() : 130;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View view3 = this.focusedChild;
            if (view3 != null) {
                findNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) view2, view3, intValue);
            } else {
                findNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) view2, currentlyFocusedRect, intValue);
            }
            if (findNextFocusFromRect != null) {
                containsDescendant = FocusGroupNode_androidKt.containsDescendant(view, findNextFocusFromRect);
                if (containsDescendant) {
                    findNextFocusFromRect.requestFocus(intValue, currentlyFocusedRect);
                    return FocusRequester.INSTANCE.getCancel();
                }
            }
            if (!view2.requestFocus()) {
                throw new IllegalStateException("host view did not take focus".toString());
            }
            return FocusRequester.INSTANCE.getDefault();
        }
        if (!view2.requestFocus()) {
            throw new IllegalStateException("host view did not take focus".toString());
        }
        return FocusRequester.INSTANCE.getDefault();
    }

    private final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        int m5410constructorimpl = NodeKind.m5410constructorimpl(1024);
        if (!focusGroupPropertiesNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = focusGroupPropertiesNode.getNode();
        if ((node.getAggregateChildKindSet() & m5410constructorimpl) != 0) {
            boolean z = false;
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & m5410constructorimpl) != 0) {
                    Modifier.Node node2 = child;
                    MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node2;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((node2.getKindSet() & m5410constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & m5410constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node2 = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node2);
                                            }
                                            node2 = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node2 = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        View view;
        boolean z;
        boolean z2;
        boolean containsDescendant;
        boolean containsDescendant2;
        FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        if (DelegatableNodeKt.requireLayoutNode(focusGroupPropertiesNode).getOwner() == null) {
            return;
        }
        view = FocusGroupNode_androidKt.getView(this);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode).getFocusOwner();
        Owner requireOwner = DelegatableNodeKt.requireOwner(focusGroupPropertiesNode);
        if (oldFocus != null && !Intrinsics.areEqual(oldFocus, requireOwner)) {
            containsDescendant2 = FocusGroupNode_androidKt.containsDescendant(view, oldFocus);
            if (containsDescendant2) {
                z = true;
                if (newFocus != null && !Intrinsics.areEqual(newFocus, requireOwner)) {
                    containsDescendant = FocusGroupNode_androidKt.containsDescendant(view, newFocus);
                    if (containsDescendant) {
                        z2 = true;
                        if (!z && z2) {
                            this.focusedChild = newFocus;
                            return;
                        }
                        if (!z2) {
                            if (z) {
                                this.focusedChild = null;
                                if (getFocusTargetOfEmbeddedViewWrapper().getFocusState().isFocused()) {
                                    focusOwner.mo3528clearFocusI7lrPNg(false, true, false, FocusDirection.INSTANCE.m3519getExitdhqQ8s());
                                    return;
                                }
                                return;
                            }
                            this.focusedChild = null;
                            return;
                        }
                        this.focusedChild = newFocus;
                        FocusTargetNode focusTargetOfEmbeddedViewWrapper = getFocusTargetOfEmbeddedViewWrapper();
                        if (focusTargetOfEmbeddedViewWrapper.getFocusState().getHasFocus()) {
                            return;
                        }
                        FocusTransactionManager focusTransactionManager = focusOwner.getFocusTransactionManager();
                        try {
                            if (focusTransactionManager.ongoingTransaction) {
                                focusTransactionManager.cancelTransaction();
                            }
                            focusTransactionManager.beginTransaction();
                            FocusTransactionsKt.performRequestFocus(focusTargetOfEmbeddedViewWrapper);
                            return;
                        } finally {
                            focusTransactionManager.commitTransaction();
                        }
                    }
                }
                z2 = false;
                if (!z) {
                }
                if (!z2) {
                }
            }
        }
        z = false;
        if (newFocus != null) {
            containsDescendant = FocusGroupNode_androidKt.containsDescendant(view, newFocus);
            if (containsDescendant) {
            }
        }
        z2 = false;
        if (!z) {
        }
        if (!z2) {
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        View view;
        super.onAttach();
        view = FocusGroupNode_androidKt.getView(this);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        View view;
        view = FocusGroupNode_androidKt.getView(this);
        view.removeOnAttachStateChangeListener(this);
        this.focusedChild = null;
        super.onDetach();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        v.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        v.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
