package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
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
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lf implements Window.Callback {
    public final Window.Callback m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final /* synthetic */ qf q;

    public lf(qf qfVar, Window.Callback callback) {
        this.q = qfVar;
        if (callback != null) {
            this.m = callback;
        } else {
            lh.e("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.n = true;
            callback.onContentChanged();
        } finally {
            this.n = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.m.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.m.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        s63.a(this.m, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.m.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.o;
        Window.Callback callback = this.m;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.q.x(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L32;
     */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        fk1 fk1Var;
        boolean performShortcut;
        if (!this.m.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            qf qfVar = this.q;
            qfVar.D();
            w63 w63Var = qfVar.z;
            if (w63Var != null) {
                v63 v63Var = w63Var.i;
                if (v63Var == null || (fk1Var = v63Var.p) == null) {
                    performShortcut = false;
                } else {
                    fk1Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = fk1Var.performShortcut(keyCode, keyEvent, 0);
                }
            }
            pf pfVar = qfVar.Y;
            if (pfVar == null || !qfVar.I(pfVar, keyEvent.getKeyCode(), keyEvent)) {
                if (qfVar.Y == null) {
                    pf C = qfVar.C(0);
                    qfVar.J(C, keyEvent);
                    boolean I = qfVar.I(C, keyEvent.getKeyCode(), keyEvent);
                    C.k = false;
                    if (I) {
                    }
                }
                return false;
            }
            pf pfVar2 = qfVar.Y;
            if (pfVar2 != null) {
                pfVar2.l = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.m.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.m.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.m.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.m.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.m.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.m.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.n) {
            this.m.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof fk1)) {
            return this.m.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.m.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.m.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.m.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            qf qfVar = this.q;
            qfVar.D();
            w63 w63Var = qfVar.z;
            if (w63Var != null) {
                ArrayList arrayList = w63Var.m;
                if (true != w63Var.l) {
                    w63Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        b71.o();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.p) {
            this.m.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        qf qfVar = this.q;
        if (i != 108) {
            if (i == 0) {
                pf C = qfVar.C(i);
                if (C.m) {
                    qfVar.v(C, false);
                    return;
                }
                return;
            }
            return;
        }
        qfVar.D();
        w63 w63Var = qfVar.z;
        if (w63Var != null) {
            ArrayList arrayList = w63Var.m;
            if (w63Var.l) {
                w63Var.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                b71.o();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        t63.a(this.m, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        fk1 fk1Var = menu instanceof fk1 ? (fk1) menu : null;
        if (i == 0 && fk1Var == null) {
            return false;
        }
        if (fk1Var != null) {
            fk1Var.x = true;
        }
        boolean onPreparePanel = this.m.onPreparePanel(i, view, menu);
        if (fk1Var != null) {
            fk1Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        fk1 fk1Var = this.q.C(0).h;
        if (fk1Var != null) {
            d(list, fk1Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return r63.a(this.m, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.m.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.m.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        qf qfVar = this.q;
        Context context = qfVar.w;
        if (!qfVar.K || i != 0) {
            return r63.b(this.m, callback, i);
        }
        js0 js0Var = new js0();
        js0Var.o = context;
        js0Var.n = callback;
        js0Var.m = new ArrayList();
        js0Var.p = new fl2(0);
        i3 i3Var = qfVar.F;
        if (i3Var != null) {
            i3Var.a();
        }
        t21 t21Var = new t21(qfVar, js0Var);
        qfVar.D();
        w63 w63Var = qfVar.z;
        int i2 = 1;
        if (w63Var != null) {
            v63 v63Var = w63Var.i;
            if (v63Var != null) {
                v63Var.a();
            }
            w63Var.c.setHideOnContentScrollEnabled(false);
            w63Var.f.e();
            v63 v63Var2 = new v63(w63Var, w63Var.f.getContext(), t21Var);
            fk1 fk1Var = v63Var2.p;
            fk1Var.w();
            try {
                if (((js0) v63Var2.q.n).D(v63Var2, fk1Var)) {
                    w63Var.i = v63Var2;
                    v63Var2.h();
                    w63Var.f.c(v63Var2);
                    w63Var.a(true);
                } else {
                    v63Var2 = null;
                }
                qfVar.F = v63Var2;
            } finally {
                fk1Var.v();
            }
        }
        if (qfVar.F == null) {
            w53 w53Var = qfVar.J;
            if (w53Var != null) {
                w53Var.b();
            }
            i3 i3Var2 = qfVar.F;
            if (i3Var2 != null) {
                i3Var2.a();
            }
            if (qfVar.G == null) {
                if (qfVar.U) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        n30 n30Var = new n30(context, 0);
                        n30Var.getTheme().setTo(newTheme);
                        context = n30Var;
                    }
                    qfVar.G = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    qfVar.H = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    qfVar.H.setContentView(qfVar.G);
                    qfVar.H.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    qfVar.G.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    qfVar.H.setHeight(-2);
                    qfVar.I = new ef(qfVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) qfVar.M.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        qfVar.D();
                        w63 w63Var2 = qfVar.z;
                        Context b = w63Var2 != null ? w63Var2.b() : null;
                        if (b != null) {
                            context = b;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        qfVar.G = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (qfVar.G != null) {
                w53 w53Var2 = qfVar.J;
                if (w53Var2 != null) {
                    w53Var2.b();
                }
                qfVar.G.e();
                Context context2 = qfVar.G.getContext();
                ActionBarContextView actionBarContextView = qfVar.G;
                io2 io2Var = new io2();
                io2Var.o = context2;
                io2Var.p = actionBarContextView;
                io2Var.q = t21Var;
                fk1 fk1Var2 = new fk1(actionBarContextView.getContext());
                fk1Var2.l = 1;
                io2Var.t = fk1Var2;
                fk1Var2.e = io2Var;
                if (((js0) t21Var.n).D(io2Var, fk1Var2)) {
                    io2Var.h();
                    qfVar.G.c(io2Var);
                    qfVar.F = io2Var;
                    boolean z = qfVar.L && (viewGroup = qfVar.M) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = qfVar.G;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        w53 a = e53.a(qfVar.G);
                        a.a(1.0f);
                        qfVar.J = a;
                        a.d(new gf(i2, qfVar));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        qfVar.G.setVisibility(0);
                        if (qfVar.G.getParent() instanceof View) {
                            View view = (View) qfVar.G.getParent();
                            WeakHashMap weakHashMap = e53.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (qfVar.H != null) {
                        qfVar.x.getDecorView().post(qfVar.I);
                    }
                } else {
                    qfVar.F = null;
                }
            }
            qfVar.L();
            qfVar.F = qfVar.F;
        }
        qfVar.L();
        i3 i3Var3 = qfVar.F;
        if (i3Var3 != null) {
            return js0Var.r(i3Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.m.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
