package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class RCTCodelessLoggingEventListener {
    public static final RCTCodelessLoggingEventListener INSTANCE = new RCTCodelessLoggingEventListener();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AutoLoggingOnTouchListener implements View.OnTouchListener {
        private final View.OnTouchListener existingOnTouchListener;
        private final WeakReference<View> hostView;
        private final EventBinding mapping;
        private final WeakReference<View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnTouchListener(EventBinding eventBinding, View view, View view2) {
            eventBinding.getClass();
            view.getClass();
            view2.getClass();
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(view2);
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            view.getClass();
            motionEvent.getClass();
            View view2 = this.rootView.get();
            View view3 = this.hostView.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }

        public final void setSupportCodelessLogging(boolean z) {
            this.supportCodelessLogging = z;
        }
    }

    private RCTCodelessLoggingEventListener() {
    }

    public static final AutoLoggingOnTouchListener getOnTouchListener(EventBinding eventBinding, View view, View view2) {
        if (CrashShieldHandler.isObjectCrashing(RCTCodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            eventBinding.getClass();
            view.getClass();
            view2.getClass();
            return new AutoLoggingOnTouchListener(eventBinding, view, view2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RCTCodelessLoggingEventListener.class);
            return null;
        }
    }
}
