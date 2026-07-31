package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalPointerInput.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B^\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u001fR \u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+R \u0010\u0011\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b,\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptime", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", X3.i.L, "", "down", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "issuesEnterExit", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "scrollDelta", "<init>", "(JJJJZIZLjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId-J3iCeTQ", "()J", "getUptime", "getPositionOnScreen-F1C5BW0", "getPosition-F1C5BW0", "Z", "getDown", "()Z", "I", "getType-T8wyACA", "getIssuesEnterExit", "Ljava/util/List;", "getHistorical", "()Ljava/util/List;", "getScrollDelta-F1C5BW0", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PointerInputEventData {
    private final boolean down;
    private final List historical;
    private final long id;
    private final boolean issuesEnterExit;
    private final long position;
    private final long positionOnScreen;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, i, z2, list, j5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return PointerId.m1868equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m1294equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m1294equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && PointerType.m1898equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && Intrinsics.areEqual(this.historical, pointerInputEventData.historical) && Offset.m1294equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m1869hashCodeimpl = ((((((PointerId.m1869hashCodeimpl(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m1299hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m1299hashCodeimpl(this.position)) * 31;
        boolean z = this.down;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int m1899hashCodeimpl = (((m1869hashCodeimpl + i) * 31) + PointerType.m1899hashCodeimpl(this.type)) * 31;
        boolean z2 = this.issuesEnterExit;
        return ((((m1899hashCodeimpl + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.historical.hashCode()) * 31) + Offset.m1299hashCodeimpl(this.scrollDelta);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m1870toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m1304toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m1304toStringimpl(this.position)) + ", down=" + this.down + ", type=" + ((Object) PointerType.m1900toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m1304toStringimpl(this.scrollDelta)) + ')';
    }

    private PointerInputEventData(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5) {
        this.id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.type = i;
        this.issuesEnterExit = z2;
        this.historical = list;
        this.scrollDelta = j5;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    public final long getUptime() {
        return this.uptime;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name and from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final boolean getDown() {
        return this.down;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    public final List getHistorical() {
        return this.historical;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }
}
