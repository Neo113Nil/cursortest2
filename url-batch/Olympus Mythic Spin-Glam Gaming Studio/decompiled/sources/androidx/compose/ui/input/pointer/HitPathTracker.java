package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilters", "", "addHitPath-KNwqfcY", "(JLjava/util/List;)V", "addHitPath", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "dispatchChanges", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "processCancel", "()V", "removeDetachedPointerInputFilters", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/input/pointer/NodeParent;", "root", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HitPathTracker {
    private final NodeParent root;
    private final LayoutCoordinates rootCoordinates;

    public HitPathTracker(LayoutCoordinates rootCoordinates) {
        Intrinsics.checkNotNullParameter(rootCoordinates, "rootCoordinates");
        this.rootCoordinates = rootCoordinates;
        this.root = new NodeParent();
    }

    /* renamed from: addHitPath-KNwqfcY, reason: not valid java name */
    public final void m1836addHitPathKNwqfcY(long pointerId, List pointerInputFilters) {
        Object obj;
        Intrinsics.checkNotNullParameter(pointerInputFilters, "pointerInputFilters");
        NodeParent nodeParent = this.root;
        int size = pointerInputFilters.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            PointerInputFilter pointerInputFilter = (PointerInputFilter) pointerInputFilters.get(i);
            if (z) {
                MutableVector children = nodeParent.getChildren();
                int size2 = children.getSize();
                if (size2 > 0) {
                    Object[] content = children.getContent();
                    int i2 = 0;
                    do {
                        obj = content[i2];
                        if (Intrinsics.areEqual(((Node) obj).getPointerInputFilter(), pointerInputFilter)) {
                            break;
                        } else {
                            i2++;
                        }
                    } while (i2 < size2);
                }
                obj = null;
                Node node = (Node) obj;
                if (node != null) {
                    node.markIsIn();
                    if (!node.getPointerIds().contains(PointerId.m1865boximpl(pointerId))) {
                        node.getPointerIds().add(PointerId.m1865boximpl(pointerId));
                    }
                    nodeParent = node;
                } else {
                    z = false;
                }
            }
            Node node2 = new Node(pointerInputFilter);
            node2.getPointerIds().add(PointerId.m1865boximpl(pointerId));
            nodeParent.getChildren().add(node2);
            nodeParent = node2;
        }
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        if (this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return this.root.dispatchFinalEventPass(internalPointerEvent) || this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, isInBounds);
        }
        return false;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        this.root.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }
}
