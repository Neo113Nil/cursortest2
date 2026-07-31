package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;

/* compiled from: NestedScrollInteropConnection.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "interruptOngoingScrolls", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroidx/core/view/NestedScrollingChildHelper;", "nestedScrollChildHelper", "Landroidx/core/view/NestedScrollingChildHelper;", "", "consumedScrollCache", "[I", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    private final int[] consumedScrollCache;
    private final NestedScrollingChildHelper nestedScrollChildHelper;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo374onPreScrollOzD1aCk(long available, int source) {
        int m2134getScrollAxesk4lQ0M;
        int m2136toViewTypeGyEprt8;
        int m2136toViewTypeGyEprt82;
        long m2135toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m2134getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m2134getScrollAxesk4lQ0M(available);
        m2136toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m2136toViewTypeGyEprt8(source);
        if (nestedScrollingChildHelper.startNestedScroll(m2134getScrollAxesk4lQ0M, m2136toViewTypeGyEprt8)) {
            ArraysKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1297getXimpl(available));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1298getYimpl(available));
            int[] iArr = this.consumedScrollCache;
            m2136toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m2136toViewTypeGyEprt8(source);
            nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m2136toViewTypeGyEprt82);
            m2135toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m2135toOffsetUv8p0NA(this.consumedScrollCache, available);
            return m2135toOffsetUv8p0NA;
        }
        return Offset.INSTANCE.m1308getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo277onPostScrollDzOQY0M(long consumed, long available, int source) {
        int m2134getScrollAxesk4lQ0M;
        int m2136toViewTypeGyEprt8;
        int m2136toViewTypeGyEprt82;
        long m2135toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m2134getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m2134getScrollAxesk4lQ0M(available);
        m2136toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m2136toViewTypeGyEprt8(source);
        if (nestedScrollingChildHelper.startNestedScroll(m2134getScrollAxesk4lQ0M, m2136toViewTypeGyEprt8)) {
            ArraysKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1297getXimpl(consumed));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1298getYimpl(consumed));
            int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1297getXimpl(available));
            int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1298getYimpl(available));
            m2136toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m2136toViewTypeGyEprt8(source);
            nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m2136toViewTypeGyEprt82, this.consumedScrollCache);
            m2135toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m2135toOffsetUv8p0NA(this.consumedScrollCache, available);
            return m2135toOffsetUv8p0NA;
        }
        return Offset.INSTANCE.m1308getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo373onPreFlingQWom1Mo(long j, Continuation continuation) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m2605getXimpl(j));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m2606getYimpl(j));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(viewVelocity, viewVelocity2)) {
            j = Velocity.INSTANCE.m2612getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m2599boximpl(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo276onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m2605getXimpl(j2));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m2606getYimpl(j2));
        if (!nestedScrollingChildHelper.dispatchNestedFling(viewVelocity, viewVelocity2, true)) {
            j2 = Velocity.INSTANCE.m2612getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m2599boximpl(j2);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }
}
