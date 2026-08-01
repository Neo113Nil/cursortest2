package g;

import K.S;
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
import com.neonpulse.gridlogic.R;
import j.AbstractC0139a;
import j.C0141c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0160m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2475a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2476b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2477c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0116A f2478e;

    public v(LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A, Window.Callback callback) {
        this.f2478e = layoutInflaterFactory2C0116A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2475a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2476b = true;
            callback.onContentChanged();
        } finally {
            this.f2476b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2475a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2475a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2475a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2475a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2477c;
        Window.Callback callback = this.f2475a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2478e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0160m menuC0160m;
        boolean performShortcut;
        if (this.f2475a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.f2478e;
        layoutInflaterFactory2C0116A.z();
        K k2 = layoutInflaterFactory2C0116A.f2362o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 == null || (menuC0160m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0160m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0160m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0116A.f2336N;
        if (zVar == null || !layoutInflaterFactory2C0116A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0116A.f2336N == null) {
                z y2 = layoutInflaterFactory2C0116A.y(0);
                layoutInflaterFactory2C0116A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0116A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2489k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0116A.f2336N;
        if (zVar2 != null) {
            zVar2.f2490l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2475a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2475a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2475a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2475a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2475a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2475a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2476b) {
            this.f2475a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0160m)) {
            return this.f2475a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2475a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2475a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2475a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.f2478e;
        if (i == 108) {
            layoutInflaterFactory2C0116A.z();
            K k2 = layoutInflaterFactory2C0116A.f2362o;
            if (k2 != null && true != k2.f2406l) {
                k2.f2406l = true;
                ArrayList arrayList = k2.f2407m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0116A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2475a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.f2478e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0116A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0116A.y(i);
            if (y2.f2491m) {
                layoutInflaterFactory2C0116A.p(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0116A.z();
        K k2 = layoutInflaterFactory2C0116A.f2362o;
        if (k2 == null || !k2.f2406l) {
            return;
        }
        k2.f2406l = false;
        ArrayList arrayList = k2.f2407m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2475a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0160m menuC0160m = menu instanceof MenuC0160m ? (MenuC0160m) menu : null;
        if (i == 0 && menuC0160m == null) {
            return false;
        }
        if (menuC0160m != null) {
            menuC0160m.f2681x = true;
        }
        boolean onPreparePanel = this.f2475a.onPreparePanel(i, view, menu);
        if (menuC0160m != null) {
            menuC0160m.f2681x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0160m menuC0160m = this.f2478e.y(0).h;
        if (menuC0160m != null) {
            d(list, menuC0160m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2475a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2475a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2475a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.f2478e;
        if (!layoutInflaterFactory2C0116A.f2373z || i != 0) {
            return j.k.b(this.f2475a, callback, i);
        }
        Context context = layoutInflaterFactory2C0116A.f2358k;
        T.u uVar = new T.u();
        uVar.f829b = context;
        uVar.f828a = callback;
        uVar.f830c = new ArrayList();
        uVar.d = new o.k();
        AbstractC0139a abstractC0139a = layoutInflaterFactory2C0116A.f2368u;
        if (abstractC0139a != null) {
            abstractC0139a.a();
        }
        B.j jVar = new B.j(layoutInflaterFactory2C0116A, uVar, 15);
        layoutInflaterFactory2C0116A.z();
        K k2 = layoutInflaterFactory2C0116A.f2362o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 != null) {
                j2.a();
            }
            k2.f2400c.setHideOnContentScrollEnabled(false);
            k2.f2402f.e();
            J j3 = new J(k2, k2.f2402f.getContext(), jVar);
            MenuC0160m menuC0160m = j3.d;
            menuC0160m.w();
            try {
                if (((T.u) j3.f2393e.f25b).q(j3, menuC0160m)) {
                    k2.i = j3;
                    j3.g();
                    k2.f2402f.c(j3);
                    k2.l0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0116A.f2368u = j3;
            } finally {
                menuC0160m.v();
            }
        }
        if (layoutInflaterFactory2C0116A.f2368u == null) {
            Z z2 = layoutInflaterFactory2C0116A.f2372y;
            if (z2 != null) {
                z2.b();
            }
            AbstractC0139a abstractC0139a2 = layoutInflaterFactory2C0116A.f2368u;
            if (abstractC0139a2 != null) {
                abstractC0139a2.a();
            }
            if (layoutInflaterFactory2C0116A.f2369v == null) {
                boolean z3 = layoutInflaterFactory2C0116A.f2332J;
                Context context2 = layoutInflaterFactory2C0116A.f2358k;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0141c c0141c = new C0141c(context2, 0);
                        c0141c.getTheme().setTo(newTheme);
                        context2 = c0141c;
                    }
                    layoutInflaterFactory2C0116A.f2369v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0116A.f2370w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    layoutInflaterFactory2C0116A.f2370w.setContentView(layoutInflaterFactory2C0116A.f2369v);
                    layoutInflaterFactory2C0116A.f2370w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0116A.f2369v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0116A.f2370w.setHeight(-2);
                    layoutInflaterFactory2C0116A.f2371x = new p(layoutInflaterFactory2C0116A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0116A.f2325B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0116A.z();
                        K k3 = layoutInflaterFactory2C0116A.f2362o;
                        Context m02 = k3 != null ? k3.m0() : null;
                        if (m02 != null) {
                            context2 = m02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0116A.f2369v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0116A.f2369v != null) {
                Z z4 = layoutInflaterFactory2C0116A.f2372y;
                if (z4 != null) {
                    z4.b();
                }
                layoutInflaterFactory2C0116A.f2369v.e();
                Context context3 = layoutInflaterFactory2C0116A.f2369v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0116A.f2369v;
                j.d dVar = new j.d();
                dVar.f2531c = context3;
                dVar.d = actionBarContextView;
                dVar.f2532e = jVar;
                MenuC0160m menuC0160m2 = new MenuC0160m(actionBarContextView.getContext());
                menuC0160m2.f2669l = 1;
                dVar.h = menuC0160m2;
                menuC0160m2.f2664e = dVar;
                if (((T.u) jVar.f25b).q(dVar, menuC0160m2)) {
                    dVar.g();
                    layoutInflaterFactory2C0116A.f2369v.c(dVar);
                    layoutInflaterFactory2C0116A.f2368u = dVar;
                    if (layoutInflaterFactory2C0116A.f2324A && (viewGroup = layoutInflaterFactory2C0116A.f2325B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0116A.f2369v.setAlpha(0.0f);
                        Z a2 = S.a(layoutInflaterFactory2C0116A.f2369v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0116A.f2372y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0116A));
                    } else {
                        layoutInflaterFactory2C0116A.f2369v.setAlpha(1.0f);
                        layoutInflaterFactory2C0116A.f2369v.setVisibility(0);
                        if (layoutInflaterFactory2C0116A.f2369v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0116A.f2369v.getParent();
                            WeakHashMap weakHashMap = S.f422a;
                            K.E.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0116A.f2370w != null) {
                        layoutInflaterFactory2C0116A.f2359l.getDecorView().post(layoutInflaterFactory2C0116A.f2371x);
                    }
                } else {
                    layoutInflaterFactory2C0116A.f2368u = null;
                }
            }
            layoutInflaterFactory2C0116A.H();
            layoutInflaterFactory2C0116A.f2368u = layoutInflaterFactory2C0116A.f2368u;
        }
        layoutInflaterFactory2C0116A.H();
        AbstractC0139a abstractC0139a3 = layoutInflaterFactory2C0116A.f2368u;
        if (abstractC0139a3 != null) {
            return uVar.g(abstractC0139a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2475a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
