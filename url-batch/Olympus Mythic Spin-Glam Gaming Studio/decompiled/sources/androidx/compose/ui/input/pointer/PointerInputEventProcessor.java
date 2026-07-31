package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PointerInputEventProcessor.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/ProcessResult;", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "process", "", "processCancel", "()V", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "isProcessing", "Z", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PointerInputEventProcessor {
    private final HitPathTracker hitPathTracker;
    private final HitTestResult hitResult;
    private boolean isProcessing;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer;
    private final LayoutNode root;

    public PointerInputEventProcessor(LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        this.hitPathTracker = new HitPathTracker(root.getCoordinates());
        this.pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
        this.hitResult = new HitTestResult();
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m1885processBIzXfog(PointerInputEvent pointerEvent, PositionCalculator positionCalculator, boolean isInBounds) {
        boolean z;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z2 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerEvent, positionCalculator);
            Collection<PointerInputChange> values = produce.getChanges().values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                for (PointerInputChange pointerInputChange : values) {
                    if (pointerInputChange.getPressed() || pointerInputChange.getPreviousPressed()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            for (PointerInputChange pointerInputChange2 : produce.getChanges().values()) {
                if (z || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2)) {
                    LayoutNode.m2013hitTestM_7yMNQ$ui_release$default(this.root, pointerInputChange2.getPosition(), this.hitResult, PointerType.m1898equalsimpl0(pointerInputChange2.getType(), PointerType.INSTANCE.m1905getTouchT8wyACA()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m1836addHitPathKNwqfcY(pointerInputChange2.getId(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.removeDetachedPointerInputFilters();
            boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, isInBounds);
            if (!produce.getSuppressMovementConsumption()) {
                Collection<PointerInputChange> values2 = produce.getChanges().values();
                if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                    for (PointerInputChange pointerInputChange3 : values2) {
                        if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange3) && pointerInputChange3.isConsumed()) {
                            break;
                        }
                    }
                }
            }
            z2 = false;
            int ProcessResult = PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z2);
            this.isProcessing = false;
            return ProcessResult;
        } catch (Throwable th) {
            this.isProcessing = false;
            throw th;
        }
    }

    public final void processCancel() {
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}
