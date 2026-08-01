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
import com.derinko.gbini.n1casino.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x3 implements Window.Callback {
    public final Window.Callback f;
    public h60 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ d4 k;

    public x3(d4 d4Var, Window.Callback callback) {
        this.k = d4Var;
        if (callback != null) {
            this.f = callback;
        } else {
            t8.k("Window callback may not be null");
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
        ma0.a(this.f, list, menu, i);
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
            d4 d4Var = this.k;
            d4Var.A();
            o8 o8Var = d4Var.s;
            if (o8Var == null || !o8Var.a0(keyCode, keyEvent)) {
                c4 c4Var = d4Var.Q;
                if (c4Var == null || !d4Var.F(c4Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (d4Var.Q == null) {
                        c4 z = d4Var.z(0);
                        d4Var.G(z, keyEvent);
                        boolean F = d4Var.F(z, keyEvent.getKeyCode(), keyEvent);
                        z.k = false;
                        if (F) {
                        }
                    }
                    return false;
                }
                c4 c4Var2 = d4Var.Q;
                if (c4Var2 != null) {
                    c4Var2.l = true;
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
        if (i != 0 || (menu instanceof mt)) {
            return this.f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        h60 h60Var = this.g;
        if (h60Var != null) {
            View view = i == 0 ? new View(h60Var.f.s.a.getContext()) : null;
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
            d4 d4Var = this.k;
            d4Var.A();
            o8 o8Var = d4Var.s;
            if (o8Var != null) {
                o8Var.s(true);
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
        d4 d4Var = this.k;
        if (i == 108) {
            d4Var.A();
            o8 o8Var = d4Var.s;
            if (o8Var != null) {
                o8Var.s(false);
                return;
            }
            return;
        }
        if (i == 0) {
            c4 z = d4Var.z(i);
            if (z.m) {
                d4Var.s(z, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        na0.a(this.f, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        mt mtVar = menu instanceof mt ? (mt) menu : null;
        if (i == 0 && mtVar == null) {
            return false;
        }
        if (mtVar != null) {
            mtVar.x = true;
        }
        h60 h60Var = this.g;
        if (h60Var != null && i == 0) {
            i60 i60Var = h60Var.f;
            if (!i60Var.v) {
                i60Var.s.l = true;
                i60Var.v = true;
            }
        }
        boolean onPreparePanel = this.f.onPreparePanel(i, view, menu);
        if (mtVar != null) {
            mtVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        mt mtVar = this.k.z(0).h;
        if (mtVar != null) {
            d(list, mtVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return la0.a(this.f, searchEvent);
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
        d4 d4Var = this.k;
        Context context = d4Var.p;
        if (i != 0) {
            return la0.b(this.f, callback, i);
        }
        we weVar = new we();
        weVar.g = context;
        weVar.f = callback;
        weVar.h = new ArrayList();
        weVar.i = new u20(0);
        l1 l1Var = d4Var.y;
        if (l1Var != null) {
            l1Var.a();
        }
        q4 q4Var = new q4(d4Var, weVar);
        d4Var.A();
        o8 o8Var = d4Var.s;
        if (o8Var != null) {
            d4Var.y = o8Var.w0(q4Var);
        }
        if (d4Var.y == null) {
            l90 l90Var = d4Var.C;
            if (l90Var != null) {
                l90Var.b();
            }
            l1 l1Var2 = d4Var.y;
            if (l1Var2 != null) {
                l1Var2.a();
            }
            int i2 = 1;
            if (d4Var.z == null) {
                if (d4Var.M) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        kd kdVar = new kd(context, 0);
                        kdVar.getTheme().setTo(newTheme);
                        context = kdVar;
                    }
                    d4Var.z = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    d4Var.A = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    d4Var.A.setContentView(d4Var.z);
                    d4Var.A.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    d4Var.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    d4Var.A.setHeight(-2);
                    d4Var.B = new q3(d4Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) d4Var.E.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        d4Var.A();
                        o8 o8Var2 = d4Var.s;
                        Context J = o8Var2 != null ? o8Var2.J() : null;
                        if (J != null) {
                            context = J;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        d4Var.z = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (d4Var.z != null) {
                l90 l90Var2 = d4Var.C;
                if (l90Var2 != null) {
                    l90Var2.b();
                }
                d4Var.z.e();
                Context context2 = d4Var.z.getContext();
                ActionBarContextView actionBarContextView = d4Var.z;
                r30 r30Var = new r30();
                r30Var.h = context2;
                r30Var.i = actionBarContextView;
                r30Var.j = q4Var;
                mt mtVar = new mt(actionBarContextView.getContext());
                mtVar.l = 1;
                r30Var.m = mtVar;
                mtVar.e = r30Var;
                if (((we) q4Var.g).v(r30Var, mtVar)) {
                    r30Var.g();
                    d4Var.z.c(r30Var);
                    d4Var.y = r30Var;
                    boolean z = d4Var.D && (viewGroup = d4Var.E) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = d4Var.z;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        l90 a = x80.a(d4Var.z);
                        a.a(1.0f);
                        d4Var.C = a;
                        a.d(new s3(i2, d4Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        d4Var.z.setVisibility(0);
                        if (d4Var.z.getParent() instanceof View) {
                            View view = (View) d4Var.z.getParent();
                            WeakHashMap weakHashMap = x80.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (d4Var.A != null) {
                        d4Var.q.getDecorView().post(d4Var.B);
                    }
                } else {
                    d4Var.y = null;
                }
            }
            d4Var.I();
            d4Var.y = d4Var.y;
        }
        d4Var.I();
        l1 l1Var3 = d4Var.y;
        if (l1Var3 != null) {
            return weVar.k(l1Var3);
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
