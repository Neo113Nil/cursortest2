package g;

import android.content.Context;
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
import j.AbstractC0170b;
import java.util.ArrayList;
import java.util.List;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class x implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2600a;

    /* renamed from: b, reason: collision with root package name */
    public C0148I f2601b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2602c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2603d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0142C f2605f;

    public x(LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C, Window.Callback callback) {
        this.f2605f = layoutInflaterFactory2C0142C;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2600a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2602c = true;
            callback.onContentChanged();
        } finally {
            this.f2602c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2600a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2600a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.m.a(this.f2600a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2600a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2603d;
        Window.Callback callback = this.f2600a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2605f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f2600a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.f2605f;
        layoutInflaterFactory2C0142C.B();
        AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
        if (abstractC0149a != null && abstractC0149a.i(keyCode, keyEvent)) {
            return true;
        }
        C0141B c0141b = layoutInflaterFactory2C0142C.f2449M;
        if (c0141b != null && layoutInflaterFactory2C0142C.G(c0141b, keyEvent.getKeyCode(), keyEvent)) {
            C0141B c0141b2 = layoutInflaterFactory2C0142C.f2449M;
            if (c0141b2 == null) {
                return true;
            }
            c0141b2.f2431l = true;
            return true;
        }
        if (layoutInflaterFactory2C0142C.f2449M == null) {
            C0141B A2 = layoutInflaterFactory2C0142C.A(0);
            layoutInflaterFactory2C0142C.H(A2, keyEvent);
            boolean G2 = layoutInflaterFactory2C0142C.G(A2, keyEvent.getKeyCode(), keyEvent);
            A2.f2430k = false;
            if (G2) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2600a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2600a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2600a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2600a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2600a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2600a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2602c) {
            this.f2600a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0202m)) {
            return this.f2600a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C0148I c0148i = this.f2601b;
        if (c0148i != null) {
            View view = i == 0 ? new View(c0148i.f2500a.f2501a.f3352a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f2600a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2600a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2600a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.f2605f;
        if (i == 108) {
            layoutInflaterFactory2C0142C.B();
            AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
            if (abstractC0149a != null) {
                abstractC0149a.c(true);
            }
        } else {
            layoutInflaterFactory2C0142C.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f2604e) {
            this.f2600a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.f2605f;
        if (i == 108) {
            layoutInflaterFactory2C0142C.B();
            AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
            if (abstractC0149a != null) {
                abstractC0149a.c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            layoutInflaterFactory2C0142C.getClass();
            return;
        }
        C0141B A2 = layoutInflaterFactory2C0142C.A(i);
        if (A2.f2432m) {
            layoutInflaterFactory2C0142C.t(A2, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.n.a(this.f2600a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0202m menuC0202m = menu instanceof MenuC0202m ? (MenuC0202m) menu : null;
        if (i == 0 && menuC0202m == null) {
            return false;
        }
        if (menuC0202m != null) {
            menuC0202m.f3082x = true;
        }
        C0148I c0148i = this.f2601b;
        if (c0148i != null && i == 0) {
            J j2 = c0148i.f2500a;
            if (!j2.f2504d) {
                j2.f2501a.f3361l = true;
                j2.f2504d = true;
            }
        }
        boolean onPreparePanel = this.f2600a.onPreparePanel(i, view, menu);
        if (menuC0202m != null) {
            menuC0202m.f3082x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0202m menuC0202m = this.f2605f.A(0).h;
        if (menuC0202m != null) {
            d(list, menuC0202m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.l.a(this.f2600a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2600a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2600a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.f2605f;
        layoutInflaterFactory2C0142C.getClass();
        if (i != 0) {
            return j.l.b(this.f2600a, callback, i);
        }
        Context context = layoutInflaterFactory2C0142C.f2471k;
        T.v vVar = new T.v();
        vVar.f825b = context;
        vVar.f824a = callback;
        vVar.f826c = new ArrayList();
        vVar.f827d = new o.k();
        AbstractC0170b l2 = layoutInflaterFactory2C0142C.l(vVar);
        if (l2 != null) {
            return vVar.k(l2);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2600a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
