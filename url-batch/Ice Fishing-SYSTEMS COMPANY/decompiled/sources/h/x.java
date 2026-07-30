package h;

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
import k.AbstractC4614b;
import k.AbstractC4624l;
import k.AbstractC4625m;
import k.AbstractC4626n;

/* loaded from: classes.dex */
public final class x implements Window.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final Window.Callback f38132n;

    /* renamed from: u, reason: collision with root package name */
    public I0.j f38133u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38134v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f38135w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f38136x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4535B f38137y;

    public x(LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B, Window.Callback callback) {
        this.f38137y = layoutInflaterFactory2C4535B;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f38132n = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f38134v = true;
            callback.onContentChanged();
        } finally {
            this.f38134v = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f38132n.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f38132n.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        AbstractC4625m.a(this.f38132n, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f38132n.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z8 = this.f38135w;
        Window.Callback callback = this.f38132n;
        return z8 ? callback.dispatchKeyEvent(keyEvent) : this.f38137y.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f38132n.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38137y;
            layoutInflaterFactory2C4535B.C();
            AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
            if (abstractC4542a == null || !abstractC4542a.i(keyCode, keyEvent)) {
                C4534A c4534a = layoutInflaterFactory2C4535B.f38009s0;
                if (c4534a == null || !layoutInflaterFactory2C4535B.H(c4534a, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C4535B.f38009s0 == null) {
                        C4534A B8 = layoutInflaterFactory2C4535B.B(0);
                        layoutInflaterFactory2C4535B.I(B8, keyEvent);
                        boolean H6 = layoutInflaterFactory2C4535B.H(B8, keyEvent.getKeyCode(), keyEvent);
                        B8.f37961k = false;
                        if (H6) {
                        }
                    }
                    return false;
                }
                C4534A c4534a2 = layoutInflaterFactory2C4535B.f38009s0;
                if (c4534a2 != null) {
                    c4534a2.f37962l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f38132n.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f38132n.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f38132n.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f38132n.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f38132n.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f38132n.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f38134v) {
            this.f38132n.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof l.l)) {
            return this.f38132n.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        I0.j jVar = this.f38133u;
        if (jVar != null) {
            View view = i == 0 ? new View(((C4541H) jVar.f1233u).f38031a.f39353a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f38132n.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f38132n.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f38132n.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38137y;
        if (i == 108) {
            layoutInflaterFactory2C4535B.C();
            AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
            if (abstractC4542a != null) {
                abstractC4542a.c(true);
            }
        } else {
            layoutInflaterFactory2C4535B.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f38136x) {
            this.f38132n.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38137y;
        if (i == 108) {
            layoutInflaterFactory2C4535B.C();
            AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
            if (abstractC4542a != null) {
                abstractC4542a.c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            layoutInflaterFactory2C4535B.getClass();
            return;
        }
        C4534A B8 = layoutInflaterFactory2C4535B.B(i);
        if (B8.f37963m) {
            layoutInflaterFactory2C4535B.t(B8, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z8) {
        AbstractC4626n.a(this.f38132n, z8);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        l.l lVar = menu instanceof l.l ? (l.l) menu : null;
        if (i == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f38961Q = true;
        }
        I0.j jVar = this.f38133u;
        if (jVar != null && i == 0) {
            C4541H c4541h = (C4541H) jVar.f1233u;
            if (!c4541h.f38034d) {
                c4541h.f38031a.f39363l = true;
                c4541h.f38034d = true;
            }
        }
        boolean onPreparePanel = this.f38132n.onPreparePanel(i, view, menu);
        if (lVar != null) {
            lVar.f38961Q = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        l.l lVar = this.f38137y.B(0).f37959h;
        if (lVar != null) {
            d(list, lVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC4624l.a(this.f38132n, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f38132n.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z8) {
        this.f38132n.onWindowFocusChanged(z8);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38137y;
        layoutInflaterFactory2C4535B.getClass();
        if (i != 0) {
            return AbstractC4624l.b(this.f38132n, callback, i);
        }
        f4.p pVar = new f4.p(layoutInflaterFactory2C4535B.f37973D, callback);
        AbstractC4614b m8 = layoutInflaterFactory2C4535B.m(pVar);
        if (m8 != null) {
            return pVar.c(m8);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f38132n.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
