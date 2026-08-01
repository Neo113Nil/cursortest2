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
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class h4 implements Window.Callback {
    public final Window.Callback f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final /* synthetic */ n4 j;

    public h4(n4 n4Var, Window.Callback callback) {
        this.j = n4Var;
        if (callback != null) {
            this.f = callback;
        } else {
            g9.i("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.g = true;
            callback.onContentChanged();
        } finally {
            this.g = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        td0.a(this.f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        Window.Callback callback = this.f;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.j.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r5 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z;
        mw mwVar;
        boolean performShortcut;
        if (!this.f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            n4 n4Var = this.j;
            n4Var.z();
            xd0 xd0Var = n4Var.s;
            if (xd0Var != null) {
                wd0 wd0Var = xd0Var.i;
                if (wd0Var == null || (mwVar = wd0Var.i) == null) {
                    performShortcut = false;
                } else {
                    mwVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = mwVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            m4 m4Var = n4Var.R;
            if (m4Var == null || !n4Var.E(m4Var, keyEvent.getKeyCode(), keyEvent)) {
                if (n4Var.R == null) {
                    m4 y = n4Var.y(0);
                    n4Var.F(y, keyEvent);
                    boolean E = n4Var.E(y, keyEvent.getKeyCode(), keyEvent);
                    y.k = false;
                }
                z = false;
                if (z) {
                    return false;
                }
            } else {
                m4 m4Var2 = n4Var.R;
                if (m4Var2 != null) {
                    m4Var2.l = true;
                }
            }
            z = true;
            if (z) {
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
        if (this.g) {
            this.f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof mw)) {
            return this.f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
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
            n4 n4Var = this.j;
            n4Var.z();
            xd0 xd0Var = n4Var.s;
            if (xd0Var != null) {
                ArrayList arrayList = xd0Var.m;
                if (true != xd0Var.l) {
                    xd0Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        g9.b();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.i) {
            this.f.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        n4 n4Var = this.j;
        if (i != 108) {
            if (i == 0) {
                m4 y = n4Var.y(i);
                if (y.m) {
                    n4Var.r(y, false);
                    return;
                }
                return;
            }
            return;
        }
        n4Var.z();
        xd0 xd0Var = n4Var.s;
        if (xd0Var != null) {
            ArrayList arrayList = xd0Var.m;
            if (xd0Var.l) {
                xd0Var.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                g9.b();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        ud0.a(this.f, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        mw mwVar = menu instanceof mw ? (mw) menu : null;
        if (i == 0 && mwVar == null) {
            return false;
        }
        if (mwVar != null) {
            mwVar.x = true;
        }
        boolean onPreparePanel = this.f.onPreparePanel(i, view, menu);
        if (mwVar != null) {
            mwVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        mw mwVar = this.j.y(0).h;
        if (mwVar != null) {
            d(list, mwVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return sd0.a(this.f, searchEvent);
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
        n4 n4Var = this.j;
        Context context = n4Var.p;
        if (!n4Var.D || i != 0) {
            return sd0.b(this.f, callback, i);
        }
        rg rgVar = new rg();
        rgVar.g = context;
        rgVar.f = callback;
        rgVar.h = new ArrayList();
        boolean z = false;
        rgVar.i = new w50(0);
        m1 m1Var = n4Var.y;
        if (m1Var != null) {
            m1Var.a();
        }
        a5 a5Var = new a5(n4Var, rgVar, 5, z);
        n4Var.z();
        xd0 xd0Var = n4Var.s;
        int i2 = 1;
        if (xd0Var != null) {
            wd0 wd0Var = xd0Var.i;
            if (wd0Var != null) {
                wd0Var.a();
            }
            xd0Var.c.setHideOnContentScrollEnabled(false);
            xd0Var.f.e();
            wd0 wd0Var2 = new wd0(xd0Var, xd0Var.f.getContext(), a5Var);
            mw mwVar = wd0Var2.i;
            mwVar.w();
            try {
                if (((rg) wd0Var2.j.g).v(wd0Var2, mwVar)) {
                    xd0Var.i = wd0Var2;
                    wd0Var2.h();
                    xd0Var.f.c(wd0Var2);
                    xd0Var.a(true);
                } else {
                    wd0Var2 = null;
                }
                n4Var.y = wd0Var2;
            } finally {
                mwVar.v();
            }
        }
        if (n4Var.y == null) {
            wc0 wc0Var = n4Var.C;
            if (wc0Var != null) {
                wc0Var.b();
            }
            m1 m1Var2 = n4Var.y;
            if (m1Var2 != null) {
                m1Var2.a();
            }
            if (n4Var.z == null) {
                if (n4Var.N) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        ke keVar = new ke(context, 0);
                        keVar.getTheme().setTo(newTheme);
                        context = keVar;
                    }
                    n4Var.z = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    n4Var.A = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    n4Var.A.setContentView(n4Var.z);
                    n4Var.A.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    n4Var.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    n4Var.A.setHeight(-2);
                    n4Var.B = new a4(n4Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) n4Var.F.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        n4Var.z();
                        xd0 xd0Var2 = n4Var.s;
                        Context b = xd0Var2 != null ? xd0Var2.b() : null;
                        if (b != null) {
                            context = b;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        n4Var.z = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (n4Var.z != null) {
                wc0 wc0Var2 = n4Var.C;
                if (wc0Var2 != null) {
                    wc0Var2.b();
                }
                n4Var.z.e();
                Context context2 = n4Var.z.getContext();
                ActionBarContextView actionBarContextView = n4Var.z;
                t60 t60Var = new t60();
                t60Var.h = context2;
                t60Var.i = actionBarContextView;
                t60Var.j = a5Var;
                mw mwVar2 = new mw(actionBarContextView.getContext());
                mwVar2.l = 1;
                t60Var.m = mwVar2;
                mwVar2.e = t60Var;
                if (((rg) a5Var.g).v(t60Var, mwVar2)) {
                    t60Var.h();
                    n4Var.z.c(t60Var);
                    n4Var.y = t60Var;
                    boolean z2 = n4Var.E && (viewGroup = n4Var.F) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = n4Var.z;
                    if (z2) {
                        actionBarContextView2.setAlpha(0.0f);
                        wc0 a = ic0.a(n4Var.z);
                        a.a(1.0f);
                        n4Var.C = a;
                        a.d(new c4(i2, n4Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        n4Var.z.setVisibility(0);
                        if (n4Var.z.getParent() instanceof View) {
                            View view = (View) n4Var.z.getParent();
                            WeakHashMap weakHashMap = ic0.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (n4Var.A != null) {
                        n4Var.q.getDecorView().post(n4Var.B);
                    }
                } else {
                    n4Var.y = null;
                }
            }
            n4Var.H();
            n4Var.y = n4Var.y;
        }
        n4Var.H();
        m1 m1Var3 = n4Var.y;
        if (m1Var3 != null) {
            return rgVar.k(m1Var3);
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
