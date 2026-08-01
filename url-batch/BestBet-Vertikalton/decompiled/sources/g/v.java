package g;

import K.Q;
import K.Z;
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
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import j.AbstractC0164a;
import j.C0166c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0189m;
import u0.C0385x;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2694a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2695b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2696c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0112A f2697e;

    public v(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A, Window.Callback callback) {
        this.f2697e = layoutInflaterFactory2C0112A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2694a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2695b = true;
            callback.onContentChanged();
        } finally {
            this.f2695b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2694a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2694a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2694a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2694a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2696c;
        Window.Callback callback = this.f2694a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2697e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z2;
        MenuC0189m menuC0189m;
        boolean performShortcut;
        if (this.f2694a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2697e;
        layoutInflaterFactory2C0112A.z();
        K k2 = layoutInflaterFactory2C0112A.f2580o;
        if (k2 != null) {
            J j2 = k2.f2622l;
            if (j2 == null || (menuC0189m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0189m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0189m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0112A.f2554N;
        if (zVar == null || !layoutInflaterFactory2C0112A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0112A.f2554N == null) {
                z y2 = layoutInflaterFactory2C0112A.y(0);
                layoutInflaterFactory2C0112A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0112A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2708k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0112A.f2554N;
        if (zVar2 != null) {
            zVar2.f2709l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2694a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2694a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2694a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2694a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2694a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2694a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2695b) {
            this.f2694a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0189m)) {
            return this.f2694a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2694a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2694a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2694a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2697e;
        if (i == 108) {
            layoutInflaterFactory2C0112A.z();
            K k2 = layoutInflaterFactory2C0112A.f2580o;
            if (k2 != null && true != k2.f2625o) {
                k2.f2625o = true;
                ArrayList arrayList = k2.f2626p;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0112A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2694a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2697e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0112A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0112A.y(i);
            if (y2.f2710m) {
                layoutInflaterFactory2C0112A.r(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0112A.z();
        K k2 = layoutInflaterFactory2C0112A.f2580o;
        if (k2 == null || !k2.f2625o) {
            return;
        }
        k2.f2625o = false;
        ArrayList arrayList = k2.f2626p;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2694a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0189m menuC0189m = menu instanceof MenuC0189m ? (MenuC0189m) menu : null;
        if (i == 0 && menuC0189m == null) {
            return false;
        }
        if (menuC0189m != null) {
            menuC0189m.f3183x = true;
        }
        boolean onPreparePanel = this.f2694a.onPreparePanel(i, view, menu);
        if (menuC0189m != null) {
            menuC0189m.f3183x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0189m menuC0189m = this.f2697e.y(0).h;
        if (menuC0189m != null) {
            d(list, menuC0189m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2694a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2694a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2694a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2697e;
        if (!layoutInflaterFactory2C0112A.f2591z || i != 0) {
            return j.k.b(this.f2694a, callback, i);
        }
        Context context = layoutInflaterFactory2C0112A.f2576k;
        T0.m mVar = new T0.m();
        mVar.f1074b = context;
        mVar.f1073a = callback;
        mVar.f1075c = new ArrayList();
        mVar.d = new o.k();
        AbstractC0164a abstractC0164a = layoutInflaterFactory2C0112A.f2586u;
        if (abstractC0164a != null) {
            abstractC0164a.a();
        }
        C0385x c0385x = new C0385x(layoutInflaterFactory2C0112A, mVar);
        layoutInflaterFactory2C0112A.z();
        K k2 = layoutInflaterFactory2C0112A.f2580o;
        if (k2 != null) {
            J j2 = k2.f2622l;
            if (j2 != null) {
                j2.a();
            }
            k2.f2618f.setHideOnContentScrollEnabled(false);
            k2.i.e();
            J j3 = new J(k2, k2.i.getContext(), c0385x);
            MenuC0189m menuC0189m = j3.d;
            menuC0189m.w();
            try {
                if (((T0.m) j3.f2611e.f4231b).t(j3, menuC0189m)) {
                    k2.f2622l = j3;
                    j3.i();
                    k2.i.c(j3);
                    k2.D(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0112A.f2586u = j3;
            } finally {
                menuC0189m.v();
            }
        }
        if (layoutInflaterFactory2C0112A.f2586u == null) {
            Z z2 = layoutInflaterFactory2C0112A.f2590y;
            if (z2 != null) {
                z2.b();
            }
            AbstractC0164a abstractC0164a2 = layoutInflaterFactory2C0112A.f2586u;
            if (abstractC0164a2 != null) {
                abstractC0164a2.a();
            }
            if (layoutInflaterFactory2C0112A.f2587v == null) {
                boolean z3 = layoutInflaterFactory2C0112A.f2550J;
                Context context2 = layoutInflaterFactory2C0112A.f2576k;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0166c c0166c = new C0166c(context2, 0);
                        c0166c.getTheme().setTo(newTheme);
                        context2 = c0166c;
                    }
                    layoutInflaterFactory2C0112A.f2587v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0112A.f2588w = popupWindow;
                    Q.l.d(popupWindow, 2);
                    layoutInflaterFactory2C0112A.f2588w.setContentView(layoutInflaterFactory2C0112A.f2587v);
                    layoutInflaterFactory2C0112A.f2588w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0112A.f2587v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0112A.f2588w.setHeight(-2);
                    layoutInflaterFactory2C0112A.f2589x = new p(layoutInflaterFactory2C0112A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0112A.f2543B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0112A.z();
                        K k3 = layoutInflaterFactory2C0112A.f2580o;
                        Context E2 = k3 != null ? k3.E() : null;
                        if (E2 != null) {
                            context2 = E2;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0112A.f2587v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0112A.f2587v != null) {
                Z z4 = layoutInflaterFactory2C0112A.f2590y;
                if (z4 != null) {
                    z4.b();
                }
                layoutInflaterFactory2C0112A.f2587v.e();
                Context context3 = layoutInflaterFactory2C0112A.f2587v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0112A.f2587v;
                j.d dVar = new j.d();
                dVar.f3026c = context3;
                dVar.d = actionBarContextView;
                dVar.f3027e = c0385x;
                MenuC0189m menuC0189m2 = new MenuC0189m(actionBarContextView.getContext());
                menuC0189m2.f3171l = 1;
                dVar.h = menuC0189m2;
                menuC0189m2.f3166e = dVar;
                if (((T0.m) c0385x.f4231b).t(dVar, menuC0189m2)) {
                    dVar.i();
                    layoutInflaterFactory2C0112A.f2587v.c(dVar);
                    layoutInflaterFactory2C0112A.f2586u = dVar;
                    if (layoutInflaterFactory2C0112A.f2542A && (viewGroup = layoutInflaterFactory2C0112A.f2543B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0112A.f2587v.setAlpha(RecyclerView.f1937A0);
                        Z a2 = Q.a(layoutInflaterFactory2C0112A.f2587v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0112A.f2590y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0112A));
                    } else {
                        layoutInflaterFactory2C0112A.f2587v.setAlpha(1.0f);
                        layoutInflaterFactory2C0112A.f2587v.setVisibility(0);
                        if (layoutInflaterFactory2C0112A.f2587v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0112A.f2587v.getParent();
                            WeakHashMap weakHashMap = Q.f578a;
                            K.D.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0112A.f2588w != null) {
                        layoutInflaterFactory2C0112A.f2577l.getDecorView().post(layoutInflaterFactory2C0112A.f2589x);
                    }
                } else {
                    layoutInflaterFactory2C0112A.f2586u = null;
                }
            }
            layoutInflaterFactory2C0112A.H();
            layoutInflaterFactory2C0112A.f2586u = layoutInflaterFactory2C0112A.f2586u;
        }
        layoutInflaterFactory2C0112A.H();
        AbstractC0164a abstractC0164a3 = layoutInflaterFactory2C0112A.f2586u;
        if (abstractC0164a3 != null) {
            return mVar.h(abstractC0164a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2694a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
