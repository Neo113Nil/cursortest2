package g;

import K.C0001a0;
import K.T;
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
import com.luckycalc.loanfinance.R;
import j.AbstractC0137a;
import j.C0139c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0157m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2340a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2341b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2342c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0109A f2343e;

    public v(LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A, Window.Callback callback) {
        this.f2343e = layoutInflaterFactory2C0109A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2340a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2341b = true;
            callback.onContentChanged();
        } finally {
            this.f2341b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2340a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2340a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2340a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2340a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2342c;
        Window.Callback callback = this.f2340a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2343e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0157m menuC0157m;
        boolean performShortcut;
        if (this.f2340a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = this.f2343e;
        layoutInflaterFactory2C0109A.z();
        K k2 = layoutInflaterFactory2C0109A.f2227o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 == null || (menuC0157m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0157m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0157m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0109A.f2201N;
        if (zVar == null || !layoutInflaterFactory2C0109A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0109A.f2201N == null) {
                z y2 = layoutInflaterFactory2C0109A.y(0);
                layoutInflaterFactory2C0109A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0109A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2354k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0109A.f2201N;
        if (zVar2 != null) {
            zVar2.f2355l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2340a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2340a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2340a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2340a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2340a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2340a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2341b) {
            this.f2340a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0157m)) {
            return this.f2340a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2340a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2340a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2340a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = this.f2343e;
        if (i == 108) {
            layoutInflaterFactory2C0109A.z();
            K k2 = layoutInflaterFactory2C0109A.f2227o;
            if (k2 != null && true != k2.f2271l) {
                k2.f2271l = true;
                ArrayList arrayList = k2.f2272m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0109A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2340a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = this.f2343e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0109A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0109A.y(i);
            if (y2.f2356m) {
                layoutInflaterFactory2C0109A.r(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0109A.z();
        K k2 = layoutInflaterFactory2C0109A.f2227o;
        if (k2 == null || !k2.f2271l) {
            return;
        }
        k2.f2271l = false;
        ArrayList arrayList = k2.f2272m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2340a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0157m menuC0157m = menu instanceof MenuC0157m ? (MenuC0157m) menu : null;
        if (i == 0 && menuC0157m == null) {
            return false;
        }
        if (menuC0157m != null) {
            menuC0157m.f2701x = true;
        }
        boolean onPreparePanel = this.f2340a.onPreparePanel(i, view, menu);
        if (menuC0157m != null) {
            menuC0157m.f2701x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0157m menuC0157m = this.f2343e.y(0).h;
        if (menuC0157m != null) {
            d(list, menuC0157m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2340a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2340a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2340a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = this.f2343e;
        if (!layoutInflaterFactory2C0109A.f2238z || i != 0) {
            return j.k.b(this.f2340a, callback, i);
        }
        Context context = layoutInflaterFactory2C0109A.f2223k;
        T.t tVar = new T.t();
        tVar.f742b = context;
        tVar.f741a = callback;
        tVar.f743c = new ArrayList();
        tVar.d = new o.k();
        AbstractC0137a abstractC0137a = layoutInflaterFactory2C0109A.f2233u;
        if (abstractC0137a != null) {
            abstractC0137a.a();
        }
        B.j jVar = new B.j(layoutInflaterFactory2C0109A, tVar);
        layoutInflaterFactory2C0109A.z();
        K k2 = layoutInflaterFactory2C0109A.f2227o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 != null) {
                j2.a();
            }
            k2.f2265c.setHideOnContentScrollEnabled(false);
            k2.f2267f.e();
            J j3 = new J(k2, k2.f2267f.getContext(), jVar);
            MenuC0157m menuC0157m = j3.d;
            menuC0157m.w();
            try {
                if (((T.t) j3.f2258e.f30b).q(j3, menuC0157m)) {
                    k2.i = j3;
                    j3.i();
                    k2.f2267f.c(j3);
                    k2.d0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0109A.f2233u = j3;
            } finally {
                menuC0157m.v();
            }
        }
        if (layoutInflaterFactory2C0109A.f2233u == null) {
            C0001a0 c0001a0 = layoutInflaterFactory2C0109A.f2237y;
            if (c0001a0 != null) {
                c0001a0.b();
            }
            AbstractC0137a abstractC0137a2 = layoutInflaterFactory2C0109A.f2233u;
            if (abstractC0137a2 != null) {
                abstractC0137a2.a();
            }
            if (layoutInflaterFactory2C0109A.f2234v == null) {
                boolean z2 = layoutInflaterFactory2C0109A.f2197J;
                Context context2 = layoutInflaterFactory2C0109A.f2223k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0139c c0139c = new C0139c(context2, 0);
                        c0139c.getTheme().setTo(newTheme);
                        context2 = c0139c;
                    }
                    layoutInflaterFactory2C0109A.f2234v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0109A.f2235w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    layoutInflaterFactory2C0109A.f2235w.setContentView(layoutInflaterFactory2C0109A.f2234v);
                    layoutInflaterFactory2C0109A.f2235w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0109A.f2234v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0109A.f2235w.setHeight(-2);
                    layoutInflaterFactory2C0109A.f2236x = new p(layoutInflaterFactory2C0109A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0109A.f2190B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0109A.z();
                        K k3 = layoutInflaterFactory2C0109A.f2227o;
                        Context e02 = k3 != null ? k3.e0() : null;
                        if (e02 != null) {
                            context2 = e02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0109A.f2234v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0109A.f2234v != null) {
                C0001a0 c0001a02 = layoutInflaterFactory2C0109A.f2237y;
                if (c0001a02 != null) {
                    c0001a02.b();
                }
                layoutInflaterFactory2C0109A.f2234v.e();
                Context context3 = layoutInflaterFactory2C0109A.f2234v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0109A.f2234v;
                j.d dVar = new j.d();
                dVar.f2547c = context3;
                dVar.d = actionBarContextView;
                dVar.f2548e = jVar;
                MenuC0157m menuC0157m2 = new MenuC0157m(actionBarContextView.getContext());
                menuC0157m2.f2689l = 1;
                dVar.h = menuC0157m2;
                menuC0157m2.f2684e = dVar;
                if (((T.t) jVar.f30b).q(dVar, menuC0157m2)) {
                    dVar.i();
                    layoutInflaterFactory2C0109A.f2234v.c(dVar);
                    layoutInflaterFactory2C0109A.f2233u = dVar;
                    if (layoutInflaterFactory2C0109A.f2189A && (viewGroup = layoutInflaterFactory2C0109A.f2190B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0109A.f2234v.setAlpha(0.0f);
                        C0001a0 a2 = T.a(layoutInflaterFactory2C0109A.f2234v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0109A.f2237y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0109A));
                    } else {
                        layoutInflaterFactory2C0109A.f2234v.setAlpha(1.0f);
                        layoutInflaterFactory2C0109A.f2234v.setVisibility(0);
                        if (layoutInflaterFactory2C0109A.f2234v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0109A.f2234v.getParent();
                            WeakHashMap weakHashMap = T.f381a;
                            K.F.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0109A.f2235w != null) {
                        layoutInflaterFactory2C0109A.f2224l.getDecorView().post(layoutInflaterFactory2C0109A.f2236x);
                    }
                } else {
                    layoutInflaterFactory2C0109A.f2233u = null;
                }
            }
            layoutInflaterFactory2C0109A.H();
            layoutInflaterFactory2C0109A.f2233u = layoutInflaterFactory2C0109A.f2233u;
        }
        layoutInflaterFactory2C0109A.H();
        AbstractC0137a abstractC0137a3 = layoutInflaterFactory2C0109A.f2233u;
        if (abstractC0137a3 != null) {
            return tVar.g(abstractC0137a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2340a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
