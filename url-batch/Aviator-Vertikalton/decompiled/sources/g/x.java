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
import j.AbstractC0169b;
import java.util.ArrayList;
import java.util.List;
import k.MenuC0200m;

/* loaded from: classes.dex */
public final class x implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2596a;

    /* renamed from: b, reason: collision with root package name */
    public C0147I f2597b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2598c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2599d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0141C f2601f;

    public x(LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C, Window.Callback callback) {
        this.f2601f = layoutInflaterFactory2C0141C;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2596a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2598c = true;
            callback.onContentChanged();
        } finally {
            this.f2598c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2596a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2596a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.m.a(this.f2596a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2596a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2599d;
        Window.Callback callback = this.f2596a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2601f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f2596a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = this.f2601f;
        layoutInflaterFactory2C0141C.B();
        AbstractC0148a abstractC0148a = layoutInflaterFactory2C0141C.f2471o;
        if (abstractC0148a != null && abstractC0148a.i(keyCode, keyEvent)) {
            return true;
        }
        C0140B c0140b = layoutInflaterFactory2C0141C.f2445M;
        if (c0140b != null && layoutInflaterFactory2C0141C.G(c0140b, keyEvent.getKeyCode(), keyEvent)) {
            C0140B c0140b2 = layoutInflaterFactory2C0141C.f2445M;
            if (c0140b2 == null) {
                return true;
            }
            c0140b2.f2427l = true;
            return true;
        }
        if (layoutInflaterFactory2C0141C.f2445M == null) {
            C0140B A2 = layoutInflaterFactory2C0141C.A(0);
            layoutInflaterFactory2C0141C.H(A2, keyEvent);
            boolean G2 = layoutInflaterFactory2C0141C.G(A2, keyEvent.getKeyCode(), keyEvent);
            A2.f2426k = false;
            if (G2) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2596a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2596a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2596a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2596a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2596a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2596a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2598c) {
            this.f2596a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0200m)) {
            return this.f2596a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C0147I c0147i = this.f2597b;
        if (c0147i != null) {
            View view = i == 0 ? new View(c0147i.f2496a.f2497a.f3352a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f2596a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2596a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2596a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = this.f2601f;
        if (i == 108) {
            layoutInflaterFactory2C0141C.B();
            AbstractC0148a abstractC0148a = layoutInflaterFactory2C0141C.f2471o;
            if (abstractC0148a != null) {
                abstractC0148a.c(true);
            }
        } else {
            layoutInflaterFactory2C0141C.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f2600e) {
            this.f2596a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = this.f2601f;
        if (i == 108) {
            layoutInflaterFactory2C0141C.B();
            AbstractC0148a abstractC0148a = layoutInflaterFactory2C0141C.f2471o;
            if (abstractC0148a != null) {
                abstractC0148a.c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            layoutInflaterFactory2C0141C.getClass();
            return;
        }
        C0140B A2 = layoutInflaterFactory2C0141C.A(i);
        if (A2.f2428m) {
            layoutInflaterFactory2C0141C.t(A2, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.n.a(this.f2596a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0200m menuC0200m = menu instanceof MenuC0200m ? (MenuC0200m) menu : null;
        if (i == 0 && menuC0200m == null) {
            return false;
        }
        if (menuC0200m != null) {
            menuC0200m.f3078x = true;
        }
        C0147I c0147i = this.f2597b;
        if (c0147i != null && i == 0) {
            J j2 = c0147i.f2496a;
            if (!j2.f2500d) {
                j2.f2497a.f3361l = true;
                j2.f2500d = true;
            }
        }
        boolean onPreparePanel = this.f2596a.onPreparePanel(i, view, menu);
        if (menuC0200m != null) {
            menuC0200m.f3078x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0200m menuC0200m = this.f2601f.A(0).h;
        if (menuC0200m != null) {
            d(list, menuC0200m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.l.a(this.f2596a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2596a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2596a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = this.f2601f;
        layoutInflaterFactory2C0141C.getClass();
        if (i != 0) {
            return j.l.b(this.f2596a, callback, i);
        }
        Context context = layoutInflaterFactory2C0141C.f2467k;
        T.v vVar = new T.v();
        vVar.f824b = context;
        vVar.f823a = callback;
        vVar.f825c = new ArrayList();
        vVar.f826d = new o.k();
        AbstractC0169b n2 = layoutInflaterFactory2C0141C.n(vVar);
        if (n2 != null) {
            return vVar.l(n2);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2596a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
