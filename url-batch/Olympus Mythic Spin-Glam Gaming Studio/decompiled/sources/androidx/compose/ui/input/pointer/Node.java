package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.ironsource.Y3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0018\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\u001c\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110,8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "<init>", "(Landroidx/compose/ui/input/pointer/PointerInputFilter;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "oldEvent", "newEvent", "", "hasPositionChanged", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "", "clearCache", "()V", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "isInBounds", "dispatchMainEventPass", "(Ljava/util/Map;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "buildCache", "dispatchCancel", "markIsIn", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/runtime/collection/MutableVector;", "pointerIds", "Landroidx/compose/runtime/collection/MutableVector;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "", "relevantChanges", "Ljava/util/Map;", Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "wasIn", "Z", "isIn", "hasExited", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Node extends NodeParent {
    private LayoutCoordinates coordinates;
    private boolean hasExited;
    private boolean isIn;
    private PointerEvent pointerEvent;
    private final MutableVector pointerIds;
    private final PointerInputFilter pointerInputFilter;
    private final Map relevantChanges;
    private boolean wasIn;

    public Node(PointerInputFilter pointerInputFilter) {
        Intrinsics.checkNotNullParameter(pointerInputFilter, "pointerInputFilter");
        this.pointerInputFilter = pointerInputFilter;
        this.pointerIds = new MutableVector(new PointerId[16], 0);
        this.relevantChanges = new LinkedHashMap();
        this.isIn = true;
        this.hasExited = true;
    }

    public final PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final MutableVector getPointerIds() {
        return this.pointerIds;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean buildCache(Map changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        Object obj;
        boolean z;
        int type;
        PointerEventType.Companion companion;
        int m1858getExit7fucELk;
        PointerInputChange m1873copyOHpmEuE;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean buildCache = super.buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds);
        if (!this.pointerInputFilter.getIsAttached()) {
            return true;
        }
        this.coordinates = this.pointerInputFilter.getLayoutCoordinates();
        Iterator it = changes.entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            long value = ((PointerId) entry.getKey()).getValue();
            PointerInputChange pointerInputChange = (PointerInputChange) entry.getValue();
            if (this.pointerIds.contains(PointerId.m1865boximpl(value))) {
                ArrayList arrayList = new ArrayList();
                List historical = pointerInputChange.getHistorical();
                for (int size = historical.size(); i < size; size = size) {
                    HistoricalChange historicalChange = (HistoricalChange) historical.get(i);
                    long uptimeMillis = historicalChange.getUptimeMillis();
                    LayoutCoordinates layoutCoordinates = this.coordinates;
                    Intrinsics.checkNotNull(layoutCoordinates);
                    arrayList.add(new HistoricalChange(uptimeMillis, layoutCoordinates.mo1947localPositionOfR5De75A(parentCoordinates, historicalChange.getPosition()), null));
                    i++;
                    historical = historical;
                }
                Map map = this.relevantChanges;
                PointerId m1865boximpl = PointerId.m1865boximpl(value);
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                long mo1947localPositionOfR5De75A = layoutCoordinates2.mo1947localPositionOfR5De75A(parentCoordinates, pointerInputChange.getPreviousPosition());
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates3);
                m1873copyOHpmEuE = pointerInputChange.m1873copyOHpmEuE((r34 & 1) != 0 ? pointerInputChange.id : 0L, (r34 & 2) != 0 ? pointerInputChange.uptimeMillis : 0L, (r34 & 4) != 0 ? pointerInputChange.position : layoutCoordinates3.mo1947localPositionOfR5De75A(parentCoordinates, pointerInputChange.getPosition()), (r34 & 8) != 0 ? pointerInputChange.pressed : false, (r34 & 16) != 0 ? pointerInputChange.previousUptimeMillis : 0L, (r34 & 32) != 0 ? pointerInputChange.previousPosition : mo1947localPositionOfR5De75A, (r34 & 64) != 0 ? pointerInputChange.previousPressed : false, (r34 & 128) != 0 ? pointerInputChange.type : 0, arrayList, (r34 & 512) != 0 ? pointerInputChange.scrollDelta : 0L);
                map.put(m1865boximpl, m1873copyOHpmEuE);
            }
        }
        if (!this.relevantChanges.isEmpty()) {
            for (int size2 = this.pointerIds.getSize() - 1; -1 < size2; size2--) {
                if (!changes.containsKey(PointerId.m1865boximpl(((PointerId) this.pointerIds.getContent()[size2]).getValue()))) {
                    this.pointerIds.removeAt(size2);
                }
            }
            PointerEvent pointerEvent = new PointerEvent(CollectionsKt.toList(this.relevantChanges.values()), internalPointerEvent);
            List changes2 = pointerEvent.getChanges();
            int size3 = changes2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size3) {
                    obj = null;
                    break;
                }
                obj = changes2.get(i2);
                if (internalPointerEvent.m1837issuesEnterExitEvent0FcD4WY(((PointerInputChange) obj).getId())) {
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            if (pointerInputChange2 != null) {
                if (!isInBounds) {
                    this.isIn = false;
                } else if (!this.isIn && (pointerInputChange2.getPressed() || pointerInputChange2.getPreviousPressed())) {
                    Intrinsics.checkNotNull(this.coordinates);
                    z = true;
                    this.isIn = !PointerEventKt.m1849isOutOfBoundsO0kMr_c(pointerInputChange2, r2.mo1946getSizeYbymL2g());
                    if (this.isIn != this.wasIn) {
                        int type2 = pointerEvent.getType();
                        PointerEventType.Companion companion2 = PointerEventType.INSTANCE;
                        if (PointerEventType.m1853equalsimpl0(type2, companion2.m1859getMove7fucELk()) || PointerEventType.m1853equalsimpl0(pointerEvent.getType(), companion2.m1857getEnter7fucELk()) || PointerEventType.m1853equalsimpl0(pointerEvent.getType(), companion2.m1858getExit7fucELk())) {
                            if (this.isIn) {
                                m1858getExit7fucELk = companion2.m1857getEnter7fucELk();
                            } else {
                                m1858getExit7fucELk = companion2.m1858getExit7fucELk();
                            }
                            pointerEvent.m1848setTypeEhbLWgg$ui_release(m1858getExit7fucELk);
                        }
                    }
                    type = pointerEvent.getType();
                    companion = PointerEventType.INSTANCE;
                    if (!PointerEventType.m1853equalsimpl0(type, companion.m1857getEnter7fucELk()) && this.wasIn && !this.hasExited) {
                        pointerEvent.m1848setTypeEhbLWgg$ui_release(companion.m1859getMove7fucELk());
                    } else if (PointerEventType.m1853equalsimpl0(pointerEvent.getType(), companion.m1858getExit7fucELk()) && this.isIn && pointerInputChange2.getPressed()) {
                        pointerEvent.m1848setTypeEhbLWgg$ui_release(companion.m1859getMove7fucELk());
                    }
                }
                z = true;
                if (this.isIn != this.wasIn) {
                }
                type = pointerEvent.getType();
                companion = PointerEventType.INSTANCE;
                if (!PointerEventType.m1853equalsimpl0(type, companion.m1857getEnter7fucELk())) {
                }
                if (PointerEventType.m1853equalsimpl0(pointerEvent.getType(), companion.m1858getExit7fucELk())) {
                    pointerEvent.m1848setTypeEhbLWgg$ui_release(companion.m1859getMove7fucELk());
                }
            } else {
                z = true;
            }
            boolean z2 = (buildCache || !PointerEventType.m1853equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m1859getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent)) ? z : false;
            this.pointerEvent = pointerEvent;
            return z2;
        }
        this.pointerIds.clear();
        getChildren().clear();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent oldEvent, PointerEvent newEvent) {
        if (oldEvent == null || oldEvent.getChanges().size() != newEvent.getChanges().size()) {
            return true;
        }
        int size = newEvent.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m1294equalsimpl0(((PointerInputChange) oldEvent.getChanges().get(i)).getPosition(), ((PointerInputChange) newEvent.getChanges().get(i)).getPosition())) {
                return true;
            }
        }
        return false;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector children;
        int size;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.relevantChanges.isEmpty() && this.pointerInputFilter.getIsAttached()) {
            PointerEvent pointerEvent = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent);
            LayoutCoordinates layoutCoordinates = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates);
            this.pointerInputFilter.mo1887onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, layoutCoordinates.mo1946getSizeYbymL2g());
            if (this.pointerInputFilter.getIsAttached() && (size = (children = getChildren()).getSize()) > 0) {
                Object[] content = children.getContent();
                do {
                    ((Node) content[i]).dispatchFinalEventPass(internalPointerEvent);
                    i++;
                } while (i < size);
            }
            z = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(Map changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector children;
        int size;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        int i = 0;
        if (this.relevantChanges.isEmpty() || !this.pointerInputFilter.getIsAttached()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        Intrinsics.checkNotNull(pointerEvent);
        LayoutCoordinates layoutCoordinates = this.coordinates;
        Intrinsics.checkNotNull(layoutCoordinates);
        long mo1946getSizeYbymL2g = layoutCoordinates.mo1946getSizeYbymL2g();
        this.pointerInputFilter.mo1887onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, mo1946getSizeYbymL2g);
        if (this.pointerInputFilter.getIsAttached() && (size = (children = getChildren()).getSize()) > 0) {
            Object[] content = children.getContent();
            do {
                Node node = (Node) content[i];
                Map map = this.relevantChanges;
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                node.dispatchMainEventPass(map, layoutCoordinates2, internalPointerEvent, isInBounds);
                i++;
            } while (i < size);
        }
        if (this.pointerInputFilter.getIsAttached()) {
            this.pointerInputFilter.mo1887onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, mo1946getSizeYbymL2g);
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Object[] content = children.getContent();
            int i = 0;
            do {
                ((Node) content[i]).dispatchCancel();
                i++;
            } while (i < size);
        }
        this.pointerInputFilter.onCancel();
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i);
            if (!pointerInputChange.getPressed() && (!internalPointerEvent.m1837issuesEnterExitEvent0FcD4WY(pointerInputChange.getId()) || !this.isIn)) {
                this.pointerIds.remove(PointerId.m1865boximpl(pointerInputChange.getId()));
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m1853equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m1858getExit7fucELk());
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
