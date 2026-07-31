package androidx.compose.ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PointerInputEventProcessor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "()V", "previousPointerInputData", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "clear", "", "produce", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "PointerInputData", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
final class PointerInputChangeEventProducer {
    private final Map previousPointerInputData = new LinkedHashMap();

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long j;
        boolean down;
        long mo1908screenToLocalMKHz9U;
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = (PointerInputEventData) pointers.get(i);
            PointerInputData pointerInputData = (PointerInputData) this.previousPointerInputData.get(PointerId.m1865boximpl(pointerInputEventData.getId()));
            if (pointerInputData == null) {
                j = pointerInputEventData.getUptime();
                mo1908screenToLocalMKHz9U = pointerInputEventData.getPosition();
                down = false;
            } else {
                long uptime = pointerInputData.getUptime();
                j = uptime;
                down = pointerInputData.getDown();
                mo1908screenToLocalMKHz9U = positionCalculator.mo1908screenToLocalMKHz9U(pointerInputData.getPositionOnScreen());
            }
            linkedHashMap.put(PointerId.m1865boximpl(pointerInputEventData.getId()), new PointerInputChange(pointerInputEventData.getId(), pointerInputEventData.getUptime(), pointerInputEventData.getPosition(), pointerInputEventData.getDown(), j, mo1908screenToLocalMKHz9U, down, false, pointerInputEventData.getType(), pointerInputEventData.getHistorical(), pointerInputEventData.getScrollDelta(), (DefaultConstructorMarker) null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(PointerId.m1865boximpl(pointerInputEventData.getId()), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.getPositionOnScreen(), pointerInputEventData.getDown(), pointerInputEventData.getType(), null));
            } else {
                this.previousPointerInputData.remove(PointerId.m1865boximpl(pointerInputEventData.getId()));
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent);
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    /* compiled from: PointerInputEventProcessor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "", "uptime", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", "", "down", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "<init>", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getUptime", "()J", "getPositionOnScreen-F1C5BW0", "Z", "getDown", "()Z", "I", "getType-T8wyACA", "()I", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        private PointerInputData(long j, long j2, boolean z, int i) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
            this.type = i;
        }

        public final long getUptime() {
            return this.uptime;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name and from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        public final boolean getDown() {
            return this.down;
        }
    }
}
