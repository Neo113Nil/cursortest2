package curtains.internal;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import curtains.DispatchState;
import curtains.TouchEventInterceptor;
import curtains.WindowsKt$onDecorViewReady$$inlined$run$lambda$1;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import okio.internal.DefaultSocket;
import papa.internal.InputTracker$listener$1$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public final class WindowCallbackWrapper implements Window.Callback {
    public static final WeakHashMap callbackCache;
    public static final Lazy jetpackWrappedField$delegate;
    public static final Lazy jetpackWrapperClass$delegate;
    public static final Object listenersLock;
    public final Window.Callback delegate;
    public final Window.Callback delegate$1;
    public final DefaultSocket listeners$1 = new DefaultSocket();

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        jetpackWrapperClass$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) WindowSpy$windowField$2.INSTANCE$4);
        jetpackWrappedField$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) WindowSpy$windowField$2.INSTANCE$3);
        callbackCache = new WeakHashMap();
        listenersLock = new Object();
    }

    public WindowCallbackWrapper(Window.Callback callback) {
        this.delegate$1 = callback;
        this.delegate = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.delegate$1.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.delegate;
        if (keyEvent == null) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        Iterator it = ((CopyOnWriteArrayList) this.listeners$1.closeBits).iterator();
        it.getClass();
        return (it.hasNext() ? ((InputTracker$listener$1$$ExternalSyntheticLambda1) it.next()).intercept(keyEvent, new WindowCallbackWrapper$dispatchKeyEvent$dispatch$1(this, it, 0)) : DispatchState.Companion.from$curtains_release(callback.dispatchKeyEvent(keyEvent))) instanceof DispatchState.Consumed;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.delegate$1.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.delegate$1.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.delegate;
        if (motionEvent == null) {
            return callback.dispatchTouchEvent(motionEvent);
        }
        Iterator it = ((CopyOnWriteArrayList) this.listeners$1.socket).iterator();
        it.getClass();
        return (it.hasNext() ? ((TouchEventInterceptor) it.next()).intercept(motionEvent, new WindowCallbackWrapper$dispatchKeyEvent$dispatch$1(this, it, 1)) : DispatchState.Companion.from$curtains_release(callback.dispatchTouchEvent(motionEvent))) instanceof DispatchState.Consumed;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.delegate$1.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.delegate$1.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.delegate$1.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.delegate$1.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Iterator it = ((CopyOnWriteArrayList) this.listeners$1.source).iterator();
        while (it.hasNext()) {
            ((WindowsKt$onDecorViewReady$$inlined$run$lambda$1) it.next()).onContentChanged();
        }
        this.delegate.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.delegate$1.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.delegate$1.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.delegate$1.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.delegate$1.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return this.delegate$1.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        this.delegate$1.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.delegate$1.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.delegate$1.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        this.delegate$1.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.delegate$1.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.delegate$1.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.listeners$1.sink).iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        this.delegate.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.delegate$1.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.delegate$1.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.delegate$1.onWindowStartingActionMode(callback, i);
    }
}
