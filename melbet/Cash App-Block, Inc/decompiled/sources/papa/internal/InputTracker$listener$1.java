package papa.internal;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.JavaViewSpy;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import com.google.android.gms.dynamite.zzo;
import curtains.DispatchState;
import curtains.OnRootViewAddedListener;
import curtains.TouchEventInterceptor;
import curtains.WindowsKt;
import curtains.internal.WindowCallbackWrapper;
import curtains.internal.WindowCallbackWrapper$dispatchKeyEvent$dispatch$1;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.UnsignedKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import papa.Handlers;
import papa.InputEventTrigger;
import papa.InteractionTrace;
import papa.InteractionTriggerWithPayload;
import papa.MainThreadTriggerStack;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class InputTracker$listener$1 implements OnRootViewAddedListener {
    public static final InputTracker$listener$1 INSTANCE = new InputTracker$listener$1();

    @Override // curtains.OnRootViewAddedListener
    public final void onRootViewsChanged(View view, boolean z) {
        view.getClass();
        if (z) {
            view.getClass();
            final Window phoneWindow = WindowsKt.getPhoneWindow(view);
            if (phoneWindow == null || JavaViewSpy.windowAttachCount(view) != 0) {
                return;
            }
            Lazy lazy = WindowCallbackWrapper.jetpackWrapperClass$delegate;
            ((CopyOnWriteArrayList) PapaEvent.getListeners(phoneWindow).socket).add(new TouchEventInterceptor() { // from class: papa.internal.InputTracker$listener$1$$ExternalSyntheticLambda0
                @Override // curtains.TouchEventInterceptor
                public final DispatchState intercept(MotionEvent motionEvent, WindowCallbackWrapper$dispatchKeyEvent$dispatch$1 windowCallbackWrapper$dispatchKeyEvent$dispatch$1) {
                    final InteractionTriggerWithPayload interactionTriggerWithPayload;
                    DispatchState dispatchState;
                    motionEvent.getClass();
                    long nanoTime = System.nanoTime();
                    Duration.Companion companion = Duration.Companion;
                    DurationUnit durationUnit = DurationUnit.NANOSECONDS;
                    long duration = DurationKt.toDuration(nanoTime, durationUnit);
                    final byte b = 0;
                    final int i = 1;
                    boolean z2 = motionEvent.getAction() == 1;
                    Window window = phoneWindow;
                    if (z2) {
                        int i2 = (int) (nanoTime % 2147483647L);
                        SafeTrace.beginAsyncSection("Tap Interaction", i2);
                        long duration2 = DurationKt.toDuration(motionEvent.getEventTime(), DurationUnit.MILLISECONDS);
                        long j = Duration.m4164compareToLRDsOJo(duration2, duration) > 0 ? duration : duration2;
                        zzo zzoVar = new zzo(b, i2);
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.getClass();
                        DurationKt.toDuration(nanoTime, durationUnit);
                        interactionTriggerWithPayload = new InteractionTriggerWithPayload(j, "tap", zzoVar, InputEventTrigger.Companion.m4369createTrackingWhenFrameRenderedSxA4cEA(window, obtain));
                    } else {
                        interactionTriggerWithPayload = null;
                    }
                    Runnable runnable = new Runnable() { // from class: papa.internal.InputTracker$listener$1$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = b;
                            InteractionTriggerWithPayload interactionTriggerWithPayload2 = interactionTriggerWithPayload;
                            switch (i3) {
                                case 0:
                                    ArrayList arrayList = MainThreadTriggerStack.interactionTriggerStack;
                                    interactionTriggerWithPayload2.getClass();
                                    MainThreadTriggerStack.pushTriggeredBy$papa_release(interactionTriggerWithPayload2);
                                    break;
                                default:
                                    interactionTriggerWithPayload2.getClass();
                                    InteractionTrace takeOverInteractionTrace = interactionTriggerWithPayload2.$$delegate_0.takeOverInteractionTrace();
                                    if (takeOverInteractionTrace != null) {
                                        takeOverInteractionTrace.endTrace();
                                    }
                                    MainThreadTriggerStack.popTriggeredBy$papa_release(interactionTriggerWithPayload2);
                                    break;
                            }
                        }
                    };
                    if (interactionTriggerWithPayload != null) {
                        InputTracker.handler.post(runnable);
                    }
                    if (Trace.isEnabled()) {
                        try {
                            String actionToString = MotionEvent.actionToString(motionEvent.getAction());
                            actionToString.getClass();
                            SafeTrace.beginSection(actionToString);
                            if (interactionTriggerWithPayload != null) {
                                ArrayList arrayList = MainThreadTriggerStack.interactionTriggerStack;
                                Handlers.checkOnMainThread();
                                MainThreadTriggerStack.pushTriggeredBy$papa_release(interactionTriggerWithPayload);
                                try {
                                    dispatchState = (DispatchState) windowCallbackWrapper$dispatchKeyEvent$dispatch$1.invoke(motionEvent);
                                    MainThreadTriggerStack.popTriggeredBy$papa_release(interactionTriggerWithPayload);
                                } finally {
                                }
                            } else {
                                dispatchState = (DispatchState) windowCallbackWrapper$dispatchKeyEvent$dispatch$1.invoke(motionEvent);
                            }
                            if (Trace.isEnabled()) {
                                Trace.endSection();
                            }
                        } finally {
                            if (Trace.isEnabled()) {
                                Trace.endSection();
                            }
                        }
                    } else if (interactionTriggerWithPayload != null) {
                        ArrayList arrayList2 = MainThreadTriggerStack.interactionTriggerStack;
                        Handlers.checkOnMainThread();
                        MainThreadTriggerStack.pushTriggeredBy$papa_release(interactionTriggerWithPayload);
                        try {
                            dispatchState = (DispatchState) windowCallbackWrapper$dispatchKeyEvent$dispatch$1.invoke(motionEvent);
                        } finally {
                        }
                    } else {
                        dispatchState = (DispatchState) windowCallbackWrapper$dispatchKeyEvent$dispatch$1.invoke(motionEvent);
                    }
                    if (!z2) {
                        return dispatchState;
                    }
                    Runnable runnable2 = new Runnable() { // from class: papa.internal.InputTracker$listener$1$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i;
                            InteractionTriggerWithPayload interactionTriggerWithPayload2 = interactionTriggerWithPayload;
                            switch (i3) {
                                case 0:
                                    ArrayList arrayList3 = MainThreadTriggerStack.interactionTriggerStack;
                                    interactionTriggerWithPayload2.getClass();
                                    MainThreadTriggerStack.pushTriggeredBy$papa_release(interactionTriggerWithPayload2);
                                    break;
                                default:
                                    interactionTriggerWithPayload2.getClass();
                                    InteractionTrace takeOverInteractionTrace = interactionTriggerWithPayload2.$$delegate_0.takeOverInteractionTrace();
                                    if (takeOverInteractionTrace != null) {
                                        takeOverInteractionTrace.endTrace();
                                    }
                                    MainThreadTriggerStack.popTriggeredBy$papa_release(interactionTriggerWithPayload2);
                                    break;
                            }
                        }
                    };
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (Trace.isEnabled()) {
                        try {
                            SafeTrace.beginSection("findPressedView()");
                            View decorView = window.getDecorView();
                            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                            r11 = viewGroup != null ? UnsignedKt.findPressedView$papa_release(viewGroup) : null;
                        } finally {
                            if (Trace.isEnabled()) {
                                Trace.endSection();
                            }
                        }
                    } else {
                        View decorView2 = window.getDecorView();
                        ViewGroup viewGroup2 = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
                        if (viewGroup2 != null) {
                            r11 = UnsignedKt.findPressedView$papa_release(viewGroup2);
                        }
                    }
                    if (!(r11 instanceof AbsListView)) {
                        InputTracker.handler.post(runnable2);
                        return dispatchState;
                    }
                    long pressedStateDuration = ViewConfiguration.getPressedStateDuration();
                    long m4167getInWholeMillisecondsimpl = (Duration.m4167getInWholeMillisecondsimpl(duration) + pressedStateDuration) - 1;
                    Handler handler = InputTracker.handler;
                    handler.removeCallbacks(runnable);
                    handler.postAtTime(runnable, m4167getInWholeMillisecondsimpl);
                    handler.postAtTime(runnable2, uptimeMillis + pressedStateDuration);
                    return dispatchState;
                }
            });
            ((CopyOnWriteArrayList) PapaEvent.getListeners(phoneWindow).closeBits).add(new InputTracker$listener$1$$ExternalSyntheticLambda1(phoneWindow));
        }
    }
}
