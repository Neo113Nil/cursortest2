package androidx.compose.ui.node;

import com.safedk.android.analytics.brandsafety.m;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DepthSortedSet.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R'\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001dj\b\u0012\u0004\u0012\u00020\u0006`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "contains", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", m.l, "(Landroidx/compose/ui/node/LayoutNode;)V", "remove", "pop", "()Landroidx/compose/ui/node/LayoutNode;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "", "", "mapOfOriginalDepth$delegate", "Lkotlin/Lazy;", "getMapOfOriginalDepth", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/TreeSet;", "set", "Landroidx/compose/ui/node/TreeSet;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DepthSortedSet {
    private final Comparator DepthComparator;
    private final boolean extraAssertions;

    /* renamed from: mapOfOriginalDepth$delegate, reason: from kotlin metadata */
    private final Lazy mapOfOriginalDepth = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final Map<LayoutNode, Integer> mo4828invoke() {
            return new LinkedHashMap();
        }
    });
    private final TreeSet set;

    public DepthSortedSet(boolean z) {
        this.extraAssertions = z;
        Comparator<LayoutNode> comparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(LayoutNode l1, LayoutNode l2) {
                Intrinsics.checkNotNullParameter(l1, "l1");
                Intrinsics.checkNotNullParameter(l2, "l2");
                int compare = Intrinsics.compare(l1.getDepth(), l2.getDepth());
                return compare != 0 ? compare : Intrinsics.compare(l1.hashCode(), l2.hashCode());
            }
        };
        this.DepthComparator = comparator;
        this.set = new TreeSet(comparator);
    }

    private final Map getMapOfOriginalDepth() {
        return (Map) this.mapOfOriginalDepth.getValue();
    }

    public final boolean contains(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        boolean contains = this.set.contains(node);
        if (!this.extraAssertions || contains == getMapOfOriginalDepth().containsKey(node)) {
            return contains;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void add(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.extraAssertions) {
            Integer num = (Integer) getMapOfOriginalDepth().get(node);
            if (num == null) {
                getMapOfOriginalDepth().put(node, Integer.valueOf(node.getDepth()));
            } else {
                if (num.intValue() != node.getDepth()) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean remove(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        boolean remove = this.set.remove(node);
        if (this.extraAssertions) {
            Integer num = (Integer) getMapOfOriginalDepth().remove(node);
            if (remove) {
                int depth = node.getDepth();
                if (num == null || num.intValue() != depth) {
                    throw new IllegalStateException("Check failed.");
                }
            } else if (num != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayoutNode pop() {
        LayoutNode node = (LayoutNode) this.set.first();
        Intrinsics.checkNotNullExpressionValue(node, "node");
        remove(node);
        return node;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public String toString() {
        String obj = this.set.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "set.toString()");
        return obj;
    }
}
