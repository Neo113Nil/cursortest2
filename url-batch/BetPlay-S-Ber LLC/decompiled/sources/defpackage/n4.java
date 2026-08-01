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
import com.awerser.monnit.betplay.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n4 implements Window.Callback {
    public final Window.Callback f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final /* synthetic */ t4 j;

    public n4(t4 t4Var, Window.Callback callback) {
        this.j = t4Var;
        if (callback != null) {
            this.f = callback;
        } else {
            o8.j("Window callback may not be null");
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
        ta0.a(this.f, list, menu, i);
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
        au auVar;
        boolean performShortcut;
        if (!this.f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            t4 t4Var = this.j;
            t4Var.z();
            xa0 xa0Var = t4Var.t;
            if (xa0Var != null) {
                wa0 wa0Var = xa0Var.i;
                if (wa0Var == null || (auVar = wa0Var.i) == null) {
                    performShortcut = false;
                } else {
                    auVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = auVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            s4 s4Var = t4Var.S;
            if (s4Var == null || !t4Var.E(s4Var, keyEvent.getKeyCode(), keyEvent)) {
                if (t4Var.S == null) {
                    s4 y = t4Var.y(0);
                    t4Var.F(y, keyEvent);
                    boolean E = t4Var.E(y, keyEvent.getKeyCode(), keyEvent);
                    y.k = false;
                }
                z = false;
                if (z) {
                    return false;
                }
            } else {
                s4 s4Var2 = t4Var.S;
                if (s4Var2 != null) {
                    s4Var2.l = true;
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
        if (i != 0 || (menu instanceof au)) {
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
            t4 t4Var = this.j;
            t4Var.z();
            xa0 xa0Var = t4Var.t;
            if (xa0Var != null) {
                ArrayList arrayList = xa0Var.m;
                if (true != xa0Var.l) {
                    xa0Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        o8.c();
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
        t4 t4Var = this.j;
        if (i != 108) {
            if (i == 0) {
                s4 y = t4Var.y(i);
                if (y.m) {
                    t4Var.r(y, false);
                    return;
                }
                return;
            }
            return;
        }
        t4Var.z();
        xa0 xa0Var = t4Var.t;
        if (xa0Var != null) {
            ArrayList arrayList = xa0Var.m;
            if (xa0Var.l) {
                xa0Var.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                o8.c();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        ua0.a(this.f, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        au auVar = menu instanceof au ? (au) menu : null;
        if (i == 0 && auVar == null) {
            return false;
        }
        if (auVar != null) {
            auVar.x = true;
        }
        boolean onPreparePanel = this.f.onPreparePanel(i, view, menu);
        if (auVar != null) {
            auVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        au auVar = this.j.y(0).h;
        if (auVar != null) {
            d(list, auVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return sa0.a(this.f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f.onWindowFocusChanged(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        p1 onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        p1 p1Var;
        t4 t4Var = this.j;
        Context context = t4Var.p;
        if (!t4Var.E || i != 0) {
            return sa0.b(this.f, callback, i);
        }
        h8 h8Var = new h8();
        h8Var.g = context;
        h8Var.f = callback;
        h8Var.h = new ArrayList();
        h8Var.i = new h30(0);
        v3 v3Var = t4Var.s;
        p1 p1Var2 = t4Var.z;
        if (p1Var2 != null) {
            p1Var2.a();
        }
        h5 h5Var = new h5((LayoutInflater.Factory2) t4Var, (Object) h8Var, 3);
        t4Var.z();
        xa0 xa0Var = t4Var.t;
        int i2 = 1;
        if (xa0Var != null) {
            wa0 wa0Var = xa0Var.i;
            if (wa0Var != null) {
                wa0Var.a();
            }
            xa0Var.c.setHideOnContentScrollEnabled(false);
            xa0Var.f.e();
            wa0 wa0Var2 = new wa0(xa0Var, xa0Var.f.getContext(), h5Var);
            au auVar = wa0Var2.i;
            auVar.w();
            try {
                if (((h8) wa0Var2.j.g).h(wa0Var2, auVar)) {
                    xa0Var.i = wa0Var2;
                    wa0Var2.h();
                    xa0Var.f.c(wa0Var2);
                    xa0Var.a(true);
                } else {
                    wa0Var2 = null;
                }
                t4Var.z = wa0Var2;
                if (wa0Var2 != null) {
                    v3Var.onSupportActionModeStarted(wa0Var2);
                }
            } finally {
                auVar.v();
            }
        }
        if (t4Var.z == null) {
            t90 t90Var = t4Var.D;
            if (t90Var != null) {
                t90Var.b();
            }
            p1 p1Var3 = t4Var.z;
            if (p1Var3 != null) {
                p1Var3.a();
            }
            if (!t4Var.W) {
                try {
                    onWindowStartingSupportActionMode = v3Var.onWindowStartingSupportActionMode(h5Var);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    t4Var.z = onWindowStartingSupportActionMode;
                } else {
                    if (t4Var.A == null) {
                        if (t4Var.O) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                od odVar = new od(context, 0);
                                odVar.getTheme().setTo(newTheme);
                                context = odVar;
                            }
                            t4Var.A = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                            t4Var.B = popupWindow;
                            popupWindow.setWindowLayoutType(2);
                            t4Var.B.setContentView(t4Var.A);
                            t4Var.B.setWidth(-1);
                            context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                            t4Var.A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            t4Var.B.setHeight(-2);
                            t4Var.C = new g4(t4Var, i2);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) t4Var.G.findViewById(R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                t4Var.z();
                                xa0 xa0Var2 = t4Var.t;
                                Context b = xa0Var2 != null ? xa0Var2.b() : null;
                                if (b != null) {
                                    context = b;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                t4Var.A = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (t4Var.A != null) {
                        t90 t90Var2 = t4Var.D;
                        if (t90Var2 != null) {
                            t90Var2.b();
                        }
                        t4Var.A.e();
                        Context context2 = t4Var.A.getContext();
                        ActionBarContextView actionBarContextView = t4Var.A;
                        a40 a40Var = new a40();
                        a40Var.h = context2;
                        a40Var.i = actionBarContextView;
                        a40Var.j = h5Var;
                        au auVar2 = new au(actionBarContextView.getContext());
                        auVar2.l = 1;
                        a40Var.m = auVar2;
                        auVar2.e = a40Var;
                        if (((h8) h5Var.g).h(a40Var, auVar2)) {
                            a40Var.h();
                            t4Var.A.c(a40Var);
                            t4Var.z = a40Var;
                            boolean z = t4Var.F && (viewGroup = t4Var.G) != null && viewGroup.isLaidOut();
                            ActionBarContextView actionBarContextView2 = t4Var.A;
                            if (z) {
                                actionBarContextView2.setAlpha(0.0f);
                                t90 a = e90.a(t4Var.A);
                                a.a(1.0f);
                                t4Var.D = a;
                                a.d(new i4(i2, t4Var));
                            } else {
                                actionBarContextView2.setAlpha(1.0f);
                                t4Var.A.setVisibility(0);
                                if (t4Var.A.getParent() instanceof View) {
                                    View view = (View) t4Var.A.getParent();
                                    WeakHashMap weakHashMap = e90.a;
                                    view.requestApplyInsets();
                                }
                            }
                            if (t4Var.B != null) {
                                t4Var.q.getDecorView().post(t4Var.C);
                            }
                        } else {
                            t4Var.z = null;
                        }
                    }
                }
                p1Var = t4Var.z;
                if (p1Var != null) {
                    v3Var.onSupportActionModeStarted(p1Var);
                }
                t4Var.H();
                t4Var.z = t4Var.z;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            p1Var = t4Var.z;
            if (p1Var != null) {
            }
            t4Var.H();
            t4Var.z = t4Var.z;
        }
        t4Var.H();
        p1 p1Var4 = t4Var.z;
        if (p1Var4 != null) {
            return h8Var.d(p1Var4);
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
