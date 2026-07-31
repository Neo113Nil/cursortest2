package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.yandex.div.core.timer.TimerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J-\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\tH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "shareWithSiblings", "", "getShareWithSiblings", "()Z", "state", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "dispatchToView", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onCancel", "onPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", TimerController.RESET_COMMAND, "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1887onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        boolean z;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        List changes = pointerEvent.getChanges();
        if (!this.this$0.getDisallowIntercept()) {
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i);
                if (!PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) && !PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                }
            }
            z = false;
            if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
                if (pass == PointerEventPass.Initial && z) {
                    dispatchToView(pointerEvent);
                }
                if (pass == PointerEventPass.Final && !z) {
                    dispatchToView(pointerEvent);
                }
            }
            if (pass != PointerEventPass.Final) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (!PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) changes.get(i2))) {
                        return;
                    }
                }
                reset();
                return;
            }
            return;
        }
        z = true;
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
        }
        if (pass != PointerEventPass.Final) {
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long uptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(uptimeMillis, new Function1() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MotionEvent) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull MotionEvent motionEvent) {
                    Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                    PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent);
                }
            });
            reset();
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (((PointerInputChange) changes.get(i)).isConsumed()) {
                if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        long mo1948localToRootMKHz9U = layoutCoordinates.mo1948localToRootMKHz9U(Offset.INSTANCE.m1308getZeroF1C5BW0());
                        final PointerInteropFilter pointerInteropFilter = this.this$0;
                        PointerInteropUtils_androidKt.m1888toCancelMotionEventScoped4ec7I(pointerEvent, mo1948localToRootMKHz9U, new Function1() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((MotionEvent) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull MotionEvent motionEvent) {
                                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                                PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent);
                            }
                        });
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                }
                this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        LayoutCoordinates layoutCoordinates2 = getLayoutCoordinates();
        if (layoutCoordinates2 != null) {
            long mo1948localToRootMKHz9U2 = layoutCoordinates2.mo1948localToRootMKHz9U(Offset.INSTANCE.m1308getZeroF1C5BW0());
            final PointerInteropFilter pointerInteropFilter2 = this.this$0;
            PointerInteropUtils_androidKt.m1889toMotionEventScoped4ec7I(pointerEvent, mo1948localToRootMKHz9U2, new Function1() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MotionEvent) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull MotionEvent motionEvent) {
                    PointerInteropFilter.DispatchToViewState dispatchToViewState;
                    Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                    if (motionEvent.getActionMasked() == 0) {
                        PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = PointerInteropFilter$pointerInputFilter$1.this;
                        if (((Boolean) pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent)).booleanValue()) {
                            dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
                        } else {
                            dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
                        }
                        pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
                        return;
                    }
                    pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent);
                }
            });
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((PointerInputChange) changes.get(i2)).consume();
                }
                InternalPointerEvent internalPointerEvent = pointerEvent.getInternalPointerEvent();
                if (internalPointerEvent == null) {
                    return;
                }
                internalPointerEvent.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept());
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set");
    }
}
