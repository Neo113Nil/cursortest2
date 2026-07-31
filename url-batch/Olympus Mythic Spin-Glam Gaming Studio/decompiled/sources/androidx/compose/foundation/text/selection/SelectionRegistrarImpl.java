package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectionRegistrarImpl.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u0015J=\u0010%\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0003J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\u0015R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\u000604j\u0002`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R?\u0010@\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b\u0018\u00010?8\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010:\u001a\u0004\bG\u0010<\"\u0004\bH\u0010>RK\u0010J\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020!\u0018\u00010I8\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010Q\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR0\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010:\u001a\u0004\bX\u0010<\"\u0004\bY\u0010>R0\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010:\u001a\u0004\b[\u0010<\"\u0004\b\\\u0010>RC\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020^0]2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020^0]8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010c\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "<init>", "()V", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "", "unsubscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "", "nextSelectableId", "()J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;", "selectableId", "notifyPositionChange", "(J)V", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "notifySelectionUpdateStart-d-4ec7I", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "newPosition", "previousPosition", "", "isStartHandle", "notifySelectionUpdate-5iVPX68", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "sorted", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "", "_selectables", "Ljava/util/List;", "", "_selectableMap", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "incrementId", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/Function1;", "onPositionChangeCallback", "Lkotlin/jvm/functions/Function1;", "getOnPositionChangeCallback$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnPositionChangeCallback$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "onSelectionUpdateStartCallback", "Lkotlin/jvm/functions/Function3;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkotlin/jvm/functions/Function3;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lkotlin/jvm/functions/Function3;)V", "onSelectionUpdateSelectAll", "getOnSelectionUpdateSelectAll$foundation_release", "setOnSelectionUpdateSelectAll$foundation_release", "Lkotlin/Function5;", "onSelectionUpdateCallback", "Lkotlin/jvm/functions/Function5;", "getOnSelectionUpdateCallback$foundation_release", "()Lkotlin/jvm/functions/Function5;", "setOnSelectionUpdateCallback$foundation_release", "(Lkotlin/jvm/functions/Function5;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "afterSelectableUnsubscribe", "getAfterSelectableUnsubscribe$foundation_release", "setAfterSelectableUnsubscribe$foundation_release", "", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "getSubselections", "()Ljava/util/Map;", "setSubselections", "(Ljava/util/Map;)V", "subselections", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "getSelectableMap$foundation_release", "selectableMap", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private Function1 afterSelectableUnsubscribe;
    private Function1 onPositionChangeCallback;
    private Function1 onSelectableChangeCallback;
    private Function5 onSelectionUpdateCallback;
    private Function0 onSelectionUpdateEndCallback;
    private Function1 onSelectionUpdateSelectAll;
    private Function3 onSelectionUpdateStartCallback;
    private boolean sorted;
    private final List _selectables = new ArrayList();
    private final Map _selectableMap = new LinkedHashMap();
    private AtomicLong incrementId = new AtomicLong(1);

    /* renamed from: subselections$delegate, reason: from kotlin metadata */
    private final MutableState subselections = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);

    /* renamed from: getSelectables$foundation_release, reason: from getter */
    public final List get_selectables() {
        return this._selectables;
    }

    /* renamed from: getSelectableMap$foundation_release, reason: from getter */
    public final Map get_selectableMap() {
        return this._selectableMap;
    }

    public final void setOnPositionChangeCallback$foundation_release(Function1 function1) {
        this.onPositionChangeCallback = function1;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(Function3 function3) {
        this.onSelectionUpdateStartCallback = function3;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(Function1 function1) {
        this.onSelectionUpdateSelectAll = function1;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(Function5 function5) {
        this.onSelectionUpdateCallback = function5;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(Function0 function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final void setOnSelectableChangeCallback$foundation_release(Function1 function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(Function1 function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Map getSubselections() {
        return (Map) this.subselections.getValue();
    }

    public void setSubselections(Map map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.subselections.setValue(map);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable subscribe(Selectable selectable) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        if (selectable.getSelectableId() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        if (this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
        this._selectableMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(Selectable selectable) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        if (this._selectableMap.containsKey(Long.valueOf(selectable.getSelectableId()))) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(Long.valueOf(selectable.getSelectableId()));
            Function1 function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    public final List sort(final LayoutCoordinates containerLayoutCoordinates) {
        Intrinsics.checkNotNullParameter(containerLayoutCoordinates, "containerLayoutCoordinates");
        if (!this.sorted) {
            CollectionsKt.sortWith(this._selectables, new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m681sort$lambda2;
                    m681sort$lambda2 = SelectionRegistrarImpl.m681sort$lambda2(LayoutCoordinates.this, (Selectable) obj, (Selectable) obj2);
                    return m681sort$lambda2;
                }
            });
            this.sorted = true;
        }
        return get_selectables();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sort$lambda-2, reason: not valid java name */
    public static final int m681sort$lambda2(LayoutCoordinates containerLayoutCoordinates, Selectable a, Selectable b) {
        long m1308getZeroF1C5BW0;
        long m1308getZeroF1C5BW02;
        Intrinsics.checkNotNullParameter(containerLayoutCoordinates, "$containerLayoutCoordinates");
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        LayoutCoordinates layoutCoordinates = a.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = b.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            m1308getZeroF1C5BW0 = containerLayoutCoordinates.mo1947localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m1308getZeroF1C5BW0());
        } else {
            m1308getZeroF1C5BW0 = Offset.INSTANCE.m1308getZeroF1C5BW0();
        }
        if (layoutCoordinates2 != null) {
            m1308getZeroF1C5BW02 = containerLayoutCoordinates.mo1947localPositionOfR5De75A(layoutCoordinates2, Offset.INSTANCE.m1308getZeroF1C5BW0());
        } else {
            m1308getZeroF1C5BW02 = Offset.INSTANCE.m1308getZeroF1C5BW0();
        }
        if (Offset.m1298getYimpl(m1308getZeroF1C5BW0) == Offset.m1298getYimpl(m1308getZeroF1C5BW02)) {
            return ComparisonsKt.compareValues(Float.valueOf(Offset.m1297getXimpl(m1308getZeroF1C5BW0)), Float.valueOf(Offset.m1297getXimpl(m1308getZeroF1C5BW02)));
        }
        return ComparisonsKt.compareValues(Float.valueOf(Offset.m1298getYimpl(m1308getZeroF1C5BW0)), Float.valueOf(Offset.m1298getYimpl(m1308getZeroF1C5BW02)));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long selectableId) {
        this.sorted = false;
        Function1 function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-d-4ec7I */
    public void mo680notifySelectionUpdateStartd4ec7I(LayoutCoordinates layoutCoordinates, long startPosition, SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Function3 function3 = this.onSelectionUpdateStartCallback;
        if (function3 != null) {
            function3.invoke(layoutCoordinates, Offset.m1288boximpl(startPosition), adjustment);
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long selectableId) {
        Function1 function1 = this.onSelectionUpdateSelectAll;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-5iVPX68 */
    public boolean mo679notifySelectionUpdate5iVPX68(LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Function5 function5 = this.onSelectionUpdateCallback;
        if (function5 != null) {
            return ((Boolean) function5.invoke(layoutCoordinates, Offset.m1288boximpl(newPosition), Offset.m1288boximpl(previousPosition), Boolean.valueOf(isStartHandle), adjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        Function0 function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.mo4828invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long selectableId) {
        Function1 function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }
}
