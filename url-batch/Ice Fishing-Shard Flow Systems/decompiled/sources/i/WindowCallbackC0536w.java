package i;

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
import java.util.List;
import l.AbstractC0646b;

/* renamed from: i.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowCallbackC0536w implements Window.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final Window.Callback f5484d;

    /* renamed from: e, reason: collision with root package name */
    public C0507I f5485e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5486i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5487l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5488m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0500B f5489n;

    public WindowCallbackC0536w(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B, Window.Callback callback) {
        this.f5489n = layoutInflaterFactory2C0500B;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f5484d = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f5486i = true;
            callback.onContentChanged();
        } finally {
            this.f5486i = false;
        }
    }

    public final boolean b(int i2, Menu menu) {
        return this.f5484d.onMenuOpened(i2, menu);
    }

    public final void c(int i2, Menu menu) {
        this.f5484d.onPanelClosed(i2, menu);
    }

    public final void d(List list, Menu menu, int i2) {
        l.m.a(this.f5484d, list, menu, i2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f5484d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z7 = this.f5487l;
        Window.Callback callback = this.f5484d;
        return z7 ? callback.dispatchKeyEvent(keyEvent) : this.f5489n.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f5484d.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5489n;
            layoutInflaterFactory2C0500B.B();
            AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
            if (abstractC0514a == null || !abstractC0514a.k(keyCode, keyEvent)) {
                C0499A c0499a = layoutInflaterFactory2C0500B.f5324U;
                if (c0499a == null || !layoutInflaterFactory2C0500B.G(c0499a, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C0500B.f5324U == null) {
                        C0499A A7 = layoutInflaterFactory2C0500B.A(0);
                        layoutInflaterFactory2C0500B.H(A7, keyEvent);
                        boolean G4 = layoutInflaterFactory2C0500B.G(A7, keyEvent.getKeyCode(), keyEvent);
                        A7.f5296k = false;
                        if (G4) {
                        }
                    }
                    return false;
                }
                C0499A c0499a2 = layoutInflaterFactory2C0500B.f5324U;
                if (c0499a2 != null) {
                    c0499a2.f5297l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f5484d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f5484d.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f5484d.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f5484d.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f5484d.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f5484d.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f5486i) {
            this.f5484d.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof m.m)) {
            return this.f5484d.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i2) {
        C0507I c0507i = this.f5485e;
        if (c0507i != null) {
            View view = i2 == 0 ? new View(c0507i.f5368a.f5369a.f6886a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f5484d.onCreatePanelView(i2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f5484d.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f5484d.onMenuItemSelected(i2, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) {
        b(i2, menu);
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5489n;
        if (i2 == 108) {
            layoutInflaterFactory2C0500B.B();
            AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
            if (abstractC0514a != null) {
                abstractC0514a.c(true);
            }
        } else {
            layoutInflaterFactory2C0500B.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        if (this.f5488m) {
            this.f5484d.onPanelClosed(i2, menu);
            return;
        }
        c(i2, menu);
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5489n;
        if (i2 == 108) {
            layoutInflaterFactory2C0500B.B();
            AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
            if (abstractC0514a != null) {
                abstractC0514a.c(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            C0499A A7 = layoutInflaterFactory2C0500B.A(i2);
            if (A7.f5298m) {
                layoutInflaterFactory2C0500B.t(A7, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z7) {
        l.n.a(this.f5484d, z7);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        m.m mVar = menu instanceof m.m ? (m.m) menu : null;
        if (i2 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f6433y = true;
        }
        C0507I c0507i = this.f5485e;
        if (c0507i != null && i2 == 0) {
            C0508J c0508j = c0507i.f5368a;
            if (!c0508j.f5372d) {
                c0508j.f5369a.f6896l = true;
                c0508j.f5372d = true;
            }
        }
        boolean onPreparePanel = this.f5484d.onPreparePanel(i2, view, menu);
        if (mVar != null) {
            mVar.f6433y = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        m.m mVar = this.f5489n.A(0).f5294h;
        if (mVar != null) {
            d(list, mVar, i2);
        } else {
            d(list, menu, i2);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return l.l.a(this.f5484d, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f5484d.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z7) {
        this.f5484d.onWindowFocusChanged(z7);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return l.l.b(this.f5484d, callback, i2);
        }
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5489n;
        P0.n nVar = new P0.n(layoutInflaterFactory2C0500B.f5346s, callback);
        AbstractC0646b n7 = layoutInflaterFactory2C0500B.n(nVar);
        if (n7 != null) {
            return nVar.h(n7);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f5484d.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
