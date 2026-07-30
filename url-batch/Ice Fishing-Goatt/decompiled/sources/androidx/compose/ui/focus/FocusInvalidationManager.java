package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: FocusInvalidationManager.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000eJ%\u0010\u0013\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00150\t2\u0006\u0010\u0014\u001a\u0002H\u0015H\u0002¢\u0006\u0002\u0010\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "invalidateOwnerFocusState", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "focusEventNodes", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusPropertiesNodes", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "Landroidx/compose/ui/focus/FocusTargetNode;", "focusTargetsWithInvalidatedFocusEvents", "hasPendingInvalidation", "", "invalidateNodes", "scheduleInvalidation", "node", "T", "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final Function0<Unit> invalidateOwnerFocusState;
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;
    private final MutableScatterSet<FocusTargetNode> focusTargetNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusEventModifierNode> focusEventNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusPropertiesModifierNode> focusPropertiesNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusTargetNode> focusTargetsWithInvalidatedFocusEvents = ScatterSetKt.mutableScatterSetOf();

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
    }

    public final void scheduleInvalidation(FocusTargetNode node) {
        scheduleInvalidation(this.focusTargetNodes, node);
    }

    public final void scheduleInvalidation(FocusEventModifierNode node) {
        scheduleInvalidation(this.focusEventNodes, node);
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode node) {
        scheduleInvalidation(this.focusPropertiesNodes, node);
    }

    public final boolean hasPendingInvalidation() {
        return this.focusTargetNodes.isNotEmpty() || this.focusPropertiesNodes.isNotEmpty() || this.focusEventNodes.isNotEmpty();
    }

    private final <T> void scheduleInvalidation(MutableScatterSet<T> mutableScatterSet, T t) {
        if (mutableScatterSet.add(t) && this.focusTargetNodes.get_size() + this.focusEventNodes.get_size() + this.focusPropertiesNodes.get_size() == 1) {
            this.onRequestApplyChangesListener.invoke(new FocusInvalidationManager$scheduleInvalidation$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNodes() {
        char c;
        long j;
        long j2;
        int i;
        long[] jArr;
        Object[] objArr;
        String str;
        long[] jArr2;
        Object[] objArr2;
        String str2;
        long j3;
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusStateImpl2;
        Object[] objArr3;
        String str3;
        long j4;
        String str4;
        long j5;
        int i2;
        MutableVector mutableVector;
        long[] jArr3;
        long[] jArr4;
        char c2;
        int i3;
        long[] jArr5;
        int i4;
        long[] jArr6;
        MutableVector mutableVector2;
        MutableScatterSet<FocusPropertiesModifierNode> mutableScatterSet = this.focusPropertiesNodes;
        Object[] objArr4 = mutableScatterSet.elements;
        long[] jArr7 = mutableScatterSet.metadata;
        int length = jArr7.length - 2;
        String str5 = "visitChildren called on an unattached node";
        char c3 = 7;
        int i5 = 16;
        int i6 = 8;
        int i7 = 1;
        int i8 = 0;
        if (length >= 0) {
            int i9 = 0;
            j = 255;
            while (true) {
                long j6 = jArr7[i9];
                j2 = -9187201950435737472L;
                if ((((~j6) << c3) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = i8;
                    while (i11 < i10) {
                        if ((j6 & 255) < 128) {
                            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) objArr4[(i9 << 3) + i11];
                            if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                                FocusPropertiesModifierNode focusPropertiesModifierNode2 = focusPropertiesModifierNode;
                                int m5387constructorimpl = NodeKind.m5387constructorimpl(1024);
                                c2 = c3;
                                Modifier.Node node = focusPropertiesModifierNode2.getNode();
                                MutableVector mutableVector3 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        this.focusTargetNodes.add((FocusTargetNode) node);
                                    } else if ((node.getKindSet() & m5387constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                        Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                                        i4 = i6;
                                        int i12 = i8;
                                        while (delegate != null) {
                                            if ((delegate.getKindSet() & m5387constructorimpl) != 0) {
                                                i12++;
                                                if (i12 == i7) {
                                                    jArr6 = jArr7;
                                                    node = delegate;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        jArr6 = jArr7;
                                                        mutableVector2 = new MutableVector(new Modifier.Node[i5], i8);
                                                    } else {
                                                        jArr6 = jArr7;
                                                        mutableVector2 = mutableVector3;
                                                    }
                                                    if (node != null) {
                                                        if (mutableVector2 != null) {
                                                            Boolean.valueOf(mutableVector2.add(node));
                                                        }
                                                        node = null;
                                                    }
                                                    if (mutableVector2 != null) {
                                                        Boolean.valueOf(mutableVector2.add(delegate));
                                                    }
                                                    mutableVector3 = mutableVector2;
                                                }
                                            } else {
                                                jArr6 = jArr7;
                                            }
                                            delegate = delegate.getChild();
                                            jArr7 = jArr6;
                                            i7 = 1;
                                        }
                                        jArr5 = jArr7;
                                        int i13 = i7;
                                        if (i12 == i13) {
                                            i7 = i13;
                                            i6 = i4;
                                            jArr7 = jArr5;
                                        } else {
                                            node = DelegatableNodeKt.pop(mutableVector3);
                                            i6 = i4;
                                            jArr7 = jArr5;
                                            i7 = 1;
                                        }
                                    }
                                    jArr5 = jArr7;
                                    i4 = i6;
                                    node = DelegatableNodeKt.pop(mutableVector3);
                                    i6 = i4;
                                    jArr7 = jArr5;
                                    i7 = 1;
                                }
                                jArr4 = jArr7;
                                i3 = i6;
                                if (!focusPropertiesModifierNode2.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                }
                                MutableVector mutableVector4 = new MutableVector(new Modifier.Node[i5], i8);
                                Modifier.Node child = focusPropertiesModifierNode2.getNode().getChild();
                                if (child == null) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector4, focusPropertiesModifierNode2.getNode());
                                } else {
                                    mutableVector4.add(child);
                                }
                                while (mutableVector4.isNotEmpty()) {
                                    Modifier.Node node2 = (Modifier.Node) mutableVector4.removeAt(mutableVector4.getSize() - 1);
                                    if ((node2.getAggregateChildKindSet() & m5387constructorimpl) == 0) {
                                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector4, node2);
                                    } else {
                                        while (true) {
                                            if (node2 == null) {
                                                break;
                                            }
                                            if ((node2.getKindSet() & m5387constructorimpl) != 0) {
                                                MutableVector mutableVector5 = null;
                                                while (node2 != null) {
                                                    if (node2 instanceof FocusTargetNode) {
                                                        this.focusTargetNodes.add((FocusTargetNode) node2);
                                                    } else if ((node2.getKindSet() & m5387constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                                        Modifier.Node delegate2 = ((DelegatingNode) node2).getDelegate();
                                                        int i14 = i8;
                                                        while (delegate2 != null) {
                                                            if ((delegate2.getKindSet() & m5387constructorimpl) != 0) {
                                                                i14++;
                                                                if (i14 == 1) {
                                                                    node2 = delegate2;
                                                                } else {
                                                                    if (mutableVector5 == null) {
                                                                        mutableVector5 = new MutableVector(new Modifier.Node[i5], 0);
                                                                    }
                                                                    if (node2 != null) {
                                                                        if (mutableVector5 != null) {
                                                                            Boolean.valueOf(mutableVector5.add(node2));
                                                                        }
                                                                        node2 = null;
                                                                    }
                                                                    if (mutableVector5 != null) {
                                                                        Boolean.valueOf(mutableVector5.add(delegate2));
                                                                    }
                                                                }
                                                            }
                                                            delegate2 = delegate2.getChild();
                                                            i5 = 16;
                                                        }
                                                        if (i14 == 1) {
                                                            i8 = 0;
                                                            i5 = 16;
                                                        }
                                                    }
                                                    node2 = DelegatableNodeKt.pop(mutableVector5);
                                                    i8 = 0;
                                                    i5 = 16;
                                                }
                                            } else {
                                                node2 = node2.getChild();
                                                i8 = 0;
                                                i5 = 16;
                                            }
                                        }
                                    }
                                }
                                j6 >>= i3;
                                i11++;
                                c3 = c2;
                                i6 = i3;
                                jArr7 = jArr4;
                                i7 = 1;
                                i8 = 0;
                                i5 = 16;
                            }
                        }
                        jArr4 = jArr7;
                        c2 = c3;
                        i3 = i6;
                        j6 >>= i3;
                        i11++;
                        c3 = c2;
                        i6 = i3;
                        jArr7 = jArr4;
                        i7 = 1;
                        i8 = 0;
                        i5 = 16;
                    }
                    jArr3 = jArr7;
                    c = c3;
                    if (i10 != i6) {
                        break;
                    }
                } else {
                    jArr3 = jArr7;
                    c = c3;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                c3 = c;
                jArr7 = jArr3;
                i7 = 1;
                i8 = 0;
                i5 = 16;
                i6 = 8;
            }
        } else {
            c = 7;
            j = 255;
            j2 = -9187201950435737472L;
        }
        this.focusPropertiesNodes.clear();
        MutableScatterSet<FocusEventModifierNode> mutableScatterSet2 = this.focusEventNodes;
        Object[] objArr5 = mutableScatterSet2.elements;
        long[] jArr8 = mutableScatterSet2.metadata;
        int length2 = jArr8.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j7 = jArr8[i15];
                if ((((~j7) << c) & j7 & j2) != j2) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j7 & j) < 128) {
                            FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) objArr5[(i15 << 3) + i17];
                            if (focusEventModifierNode.getNode().getIsAttached()) {
                                FocusEventModifierNode focusEventModifierNode2 = focusEventModifierNode;
                                int m5387constructorimpl2 = NodeKind.m5387constructorimpl(1024);
                                Modifier.Node node3 = focusEventModifierNode2.getNode();
                                boolean z = false;
                                boolean z2 = true;
                                FocusTargetNode focusTargetNode = null;
                                MutableVector mutableVector6 = null;
                                while (node3 != null) {
                                    long[] jArr9 = jArr8;
                                    if (node3 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                        if (focusTargetNode != null) {
                                            z = true;
                                        }
                                        if (this.focusTargetNodes.contains(focusTargetNode2)) {
                                            this.focusTargetsWithInvalidatedFocusEvents.add(focusTargetNode2);
                                            z2 = false;
                                        }
                                        objArr3 = objArr5;
                                        str3 = str5;
                                        j4 = j7;
                                        focusTargetNode = focusTargetNode2;
                                    } else if ((node3.getKindSet() & m5387constructorimpl2) == 0 || !(node3 instanceof DelegatingNode)) {
                                        objArr3 = objArr5;
                                        str3 = str5;
                                        j4 = j7;
                                    } else {
                                        Modifier.Node delegate3 = ((DelegatingNode) node3).getDelegate();
                                        objArr3 = objArr5;
                                        int i18 = 0;
                                        while (delegate3 != null) {
                                            if ((delegate3.getKindSet() & m5387constructorimpl2) != 0) {
                                                i18++;
                                                str4 = str5;
                                                if (i18 == 1) {
                                                    node3 = delegate3;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        i2 = i18;
                                                        j5 = j7;
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    } else {
                                                        i2 = i18;
                                                        j5 = j7;
                                                        mutableVector = mutableVector6;
                                                    }
                                                    if (node3 != null) {
                                                        if (mutableVector != null) {
                                                            Boolean.valueOf(mutableVector.add(node3));
                                                        }
                                                        node3 = null;
                                                    }
                                                    if (mutableVector != null) {
                                                        Boolean.valueOf(mutableVector.add(delegate3));
                                                    }
                                                    mutableVector6 = mutableVector;
                                                    i18 = i2;
                                                    delegate3 = delegate3.getChild();
                                                    str5 = str4;
                                                    j7 = j5;
                                                }
                                            } else {
                                                str4 = str5;
                                            }
                                            j5 = j7;
                                            delegate3 = delegate3.getChild();
                                            str5 = str4;
                                            j7 = j5;
                                        }
                                        str3 = str5;
                                        j4 = j7;
                                        if (i18 == 1) {
                                            jArr8 = jArr9;
                                            objArr5 = objArr3;
                                            str5 = str3;
                                            j7 = j4;
                                        }
                                    }
                                    node3 = DelegatableNodeKt.pop(mutableVector6);
                                    jArr8 = jArr9;
                                    objArr5 = objArr3;
                                    str5 = str3;
                                    j7 = j4;
                                }
                                jArr2 = jArr8;
                                objArr2 = objArr5;
                                str2 = str5;
                                j3 = j7;
                                if (!focusEventModifierNode2.getNode().getIsAttached()) {
                                    throw new IllegalStateException(str2.toString());
                                }
                                MutableVector mutableVector7 = new MutableVector(new Modifier.Node[16], 0);
                                Modifier.Node child2 = focusEventModifierNode2.getNode().getChild();
                                if (child2 == null) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector7, focusEventModifierNode2.getNode());
                                } else {
                                    mutableVector7.add(child2);
                                }
                                while (mutableVector7.isNotEmpty()) {
                                    Modifier.Node node4 = (Modifier.Node) mutableVector7.removeAt(mutableVector7.getSize() - 1);
                                    if ((node4.getAggregateChildKindSet() & m5387constructorimpl2) == 0) {
                                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector7, node4);
                                    } else {
                                        while (node4 != null) {
                                            if ((node4.getKindSet() & m5387constructorimpl2) != 0) {
                                                MutableVector mutableVector8 = null;
                                                while (node4 != null) {
                                                    if (node4 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node4;
                                                        if (focusTargetNode != null) {
                                                            z = true;
                                                        }
                                                        if (this.focusTargetNodes.contains(focusTargetNode3)) {
                                                            this.focusTargetsWithInvalidatedFocusEvents.add(focusTargetNode3);
                                                            z2 = false;
                                                        }
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if ((node4.getKindSet() & m5387constructorimpl2) != 0 && (node4 instanceof DelegatingNode)) {
                                                        int i19 = 0;
                                                        for (Modifier.Node delegate4 = ((DelegatingNode) node4).getDelegate(); delegate4 != null; delegate4 = delegate4.getChild()) {
                                                            if ((delegate4.getKindSet() & m5387constructorimpl2) != 0) {
                                                                i19++;
                                                                if (i19 == 1) {
                                                                    node4 = delegate4;
                                                                } else {
                                                                    if (mutableVector8 == null) {
                                                                        mutableVector8 = new MutableVector(new Modifier.Node[16], 0);
                                                                    }
                                                                    if (node4 != null) {
                                                                        if (mutableVector8 != null) {
                                                                            Boolean.valueOf(mutableVector8.add(node4));
                                                                        }
                                                                        node4 = null;
                                                                    }
                                                                    if (mutableVector8 != null) {
                                                                        Boolean.valueOf(mutableVector8.add(delegate4));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (i19 != 1) {
                                                            node4 = DelegatableNodeKt.pop(mutableVector8);
                                                        }
                                                    }
                                                    node4 = DelegatableNodeKt.pop(mutableVector8);
                                                }
                                            } else {
                                                node4 = node4.getChild();
                                            }
                                        }
                                    }
                                }
                                if (z2) {
                                    if (z) {
                                        focusStateImpl2 = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                    } else {
                                        if (focusTargetNode == null || (focusStateImpl = focusTargetNode.getFocusState()) == null) {
                                            focusStateImpl = FocusStateImpl.Inactive;
                                        }
                                        focusStateImpl2 = focusStateImpl;
                                    }
                                    focusEventModifierNode.onFocusEvent(focusStateImpl2);
                                }
                                i17++;
                                j7 = j3 >> 8;
                                jArr8 = jArr2;
                                objArr5 = objArr2;
                                str5 = str2;
                            } else {
                                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                            }
                        }
                        jArr2 = jArr8;
                        objArr2 = objArr5;
                        str2 = str5;
                        j3 = j7;
                        i17++;
                        j7 = j3 >> 8;
                        jArr8 = jArr2;
                        objArr5 = objArr2;
                        str5 = str2;
                    }
                    jArr = jArr8;
                    objArr = objArr5;
                    str = str5;
                    i = 0;
                    if (i16 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr8;
                    objArr = objArr5;
                    str = str5;
                    i = 0;
                }
                if (i15 == length2) {
                    break;
                }
                i15++;
                jArr8 = jArr;
                objArr5 = objArr;
                str5 = str;
            }
        } else {
            i = 0;
        }
        this.focusEventNodes.clear();
        MutableScatterSet<FocusTargetNode> mutableScatterSet3 = this.focusTargetNodes;
        Object[] objArr6 = mutableScatterSet3.elements;
        long[] jArr10 = mutableScatterSet3.metadata;
        int length3 = jArr10.length - 2;
        if (length3 >= 0) {
            int i20 = i;
            while (true) {
                long j8 = jArr10[i20];
                if ((((~j8) << c) & j8 & j2) != j2) {
                    int i21 = 8 - ((~(i20 - length3)) >>> 31);
                    for (int i22 = i; i22 < i21; i22++) {
                        if ((j8 & j) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr6[(i20 << 3) + i22];
                            if (focusTargetNode4.getIsAttached()) {
                                FocusStateImpl focusState = focusTargetNode4.getFocusState();
                                focusTargetNode4.invalidateFocus$ui_release();
                                if (focusState != focusTargetNode4.getFocusState() || this.focusTargetsWithInvalidatedFocusEvents.contains(focusTargetNode4)) {
                                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                                }
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                }
                if (i20 == length3) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.focusTargetNodes.clear();
        this.focusTargetsWithInvalidatedFocusEvents.clear();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodes.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodes.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodes.isEmpty()) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusTarget nodes");
    }
}
