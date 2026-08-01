package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class p4 implements Window.Callback {
    public final Window.Callback f;
    public vi0 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ v4 k;

    public p4(v4 v4Var, Window.Callback callback) {
        this.k = v4Var;
        if (callback != null) {
            this.f = callback;
        } else {
            s9.k("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.h = true;
            callback.onContentChanged();
        } finally {
            this.h = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        xn0.a(this.f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.i;
        Window.Callback callback = this.f;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.k.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            v4 v4Var = this.k;
            v4Var.A();
            n9 n9Var = v4Var.s;
            if (n9Var == null || !n9Var.G(keyCode, keyEvent)) {
                u4 u4Var = v4Var.R;
                if (u4Var == null || !v4Var.F(u4Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (v4Var.R == null) {
                        u4 z = v4Var.z(0);
                        v4Var.G(z, keyEvent);
                        boolean F = v4Var.F(z, keyEvent.getKeyCode(), keyEvent);
                        z.k = false;
                        if (F) {
                        }
                    }
                    return false;
                }
                u4 u4Var2 = v4Var.R;
                if (u4Var2 != null) {
                    u4Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.h) {
            this.f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof r10)) {
            return this.f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        vi0 vi0Var = this.g;
        if (vi0Var != null) {
            View view = i == 0 ? new View(vi0Var.f.s.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            v4 v4Var = this.k;
            v4Var.A();
            n9 n9Var = v4Var.s;
            if (n9Var != null) {
                n9Var.j(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.j) {
            this.f.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        v4 v4Var = this.k;
        if (i == 108) {
            v4Var.A();
            n9 n9Var = v4Var.s;
            if (n9Var != null) {
                n9Var.j(false);
                return;
            }
            return;
        }
        if (i == 0) {
            u4 z = v4Var.z(i);
            if (z.m) {
                v4Var.s(z, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        yn0.a(this.f, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        r10 r10Var = menu instanceof r10 ? (r10) menu : null;
        if (i == 0 && r10Var == null) {
            return false;
        }
        if (r10Var != null) {
            r10Var.x = true;
        }
        vi0 vi0Var = this.g;
        if (vi0Var != null && i == 0) {
            wi0 wi0Var = vi0Var.f;
            if (!wi0Var.v) {
                wi0Var.s.l = true;
                wi0Var.v = true;
            }
        }
        boolean onPreparePanel = this.f.onPreparePanel(i, view, menu);
        if (r10Var != null) {
            r10Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        r10 r10Var = this.k.z(0).h;
        if (r10Var != null) {
            d(list, r10Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return wn0.a(this.f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        v4 v4Var = this.k;
        Context context = v4Var.p;
        if (!v4Var.D || i != 0) {
            return wn0.b(this.f, callback, i);
        }
        wi wiVar = new wi();
        wiVar.g = context;
        wiVar.f = callback;
        wiVar.h = new ArrayList();
        wiVar.i = new zd0(0);
        p1 p1Var = v4Var.y;
        if (p1Var != null) {
            p1Var.a();
        }
        i5 i5Var = new i5((LayoutInflater.Factory2) v4Var, (Object) wiVar, 4);
        v4Var.A();
        n9 n9Var = v4Var.s;
        if (n9Var != null) {
            v4Var.y = n9Var.R(i5Var);
        }
        if (v4Var.y == null) {
            vm0 vm0Var = v4Var.C;
            if (vm0Var != null) {
                vm0Var.b();
            }
            p1 p1Var2 = v4Var.y;
            if (p1Var2 != null) {
                p1Var2.a();
            }
            int i2 = 1;
            if (v4Var.z == null) {
                if (v4Var.N) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        cg cgVar = new cg(context, 0);
                        cgVar.getTheme().setTo(newTheme);
                        context = cgVar;
                    }
                    v4Var.z = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    v4Var.A = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    v4Var.A.setContentView(v4Var.z);
                    v4Var.A.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    v4Var.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    v4Var.A.setHeight(-2);
                    v4Var.B = new i4(v4Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) v4Var.F.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        v4Var.A();
                        n9 n9Var2 = v4Var.s;
                        Context t = n9Var2 != null ? n9Var2.t() : null;
                        if (t != null) {
                            context = t;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        v4Var.z = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (v4Var.z != null) {
                vm0 vm0Var2 = v4Var.C;
                if (vm0Var2 != null) {
                    vm0Var2.b();
                }
                v4Var.z.e();
                Context context2 = v4Var.z.getContext();
                ActionBarContextView actionBarContextView = v4Var.z;
                ze0 ze0Var = new ze0();
                ze0Var.h = context2;
                ze0Var.i = actionBarContextView;
                ze0Var.j = i5Var;
                r10 r10Var = new r10(actionBarContextView.getContext());
                r10Var.l = 1;
                ze0Var.m = r10Var;
                r10Var.e = ze0Var;
                if (((wi) i5Var.g).o(ze0Var, r10Var)) {
                    ze0Var.h();
                    v4Var.z.c(ze0Var);
                    v4Var.y = ze0Var;
                    boolean z = v4Var.E && (viewGroup = v4Var.F) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = v4Var.z;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        vm0 a = hm0.a(v4Var.z);
                        a.a(1.0f);
                        v4Var.C = a;
                        a.d(new k4(i2, v4Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        v4Var.z.setVisibility(0);
                        if (v4Var.z.getParent() instanceof View) {
                            View view = (View) v4Var.z.getParent();
                            WeakHashMap weakHashMap = hm0.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (v4Var.A != null) {
                        v4Var.q.getDecorView().post(v4Var.B);
                    }
                } else {
                    v4Var.y = null;
                }
            }
            v4Var.I();
            v4Var.y = v4Var.y;
        }
        v4Var.I();
        p1 p1Var3 = v4Var.y;
        if (p1Var3 != null) {
            return wiVar.h(p1Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
