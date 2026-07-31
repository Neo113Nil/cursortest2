package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PointerEvent.kt */
@Immutable
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B^\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012Bj\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0010\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J}\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010&R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010&R \u0010\u000b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010&R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b.\u0010+R \u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R \u0010\u0010\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b2\u0010&R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R*\u00107\u001a\u0002052\u0006\u00106\u001a\u0002058\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\u0019\u001a\u0004\b9\u0010:R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138GX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010\u0019\u001a\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020\b8F¢\u0006\f\u0012\u0004\b@\u0010\u0019\u001a\u0004\b?\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "", "pressed", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "scrollDelta", "<init>", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "(JJJZJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "consume", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy", "", "toString", "()Ljava/lang/String;", "J", "getId-J3iCeTQ", "()J", "getUptimeMillis", "getPosition-F1C5BW0", "Z", "getPressed", "()Z", "getPreviousUptimeMillis", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "I", "getType-T8wyACA", "()I", "getScrollDelta-F1C5BW0", "_historical", "Ljava/util/List;", "Landroidx/compose/ui/input/pointer/ConsumedData;", "<set-?>", "consumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed$annotations", "getHistorical", "()Ljava/util/List;", "getHistorical$annotations", "isConsumed", "isConsumed$annotations", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointerInputChange {
    private List _historical;
    private ConsumedData consumed;
    private final long id;
    private final long position;
    private final boolean pressed;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, list, j6);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        this.consumed = new ConsumedData(z3, z3);
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & 256) != 0 ? PointerType.INSTANCE.m1905getTouchT8wyACA() : i, (i2 & 512) != 0 ? Offset.INSTANCE.m1308getZeroF1C5BW0() : j6, (DefaultConstructorMarker) null);
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        this._historical = list;
    }

    public final List getHistorical() {
        List list = this._historical;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final boolean isConsumed() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m1873copyOHpmEuE(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List historical, long scrollDelta) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m1870toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m1304toStringimpl(this.position)) + ", pressed=" + this.pressed + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m1304toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m1900toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m1304toStringimpl(this.scrollDelta)) + ')';
    }
}
