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
import com.glasspulse.glasspulse.R;
import j.AbstractC0137a;
import j.C0139c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0157m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2453a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2454b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2455c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0112A f2456e;

    public v(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A, Window.Callback callback) {
        this.f2456e = layoutInflaterFactory2C0112A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2453a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2454b = true;
            callback.onContentChanged();
        } finally {
            this.f2454b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2453a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2453a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2453a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2453a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2455c;
        Window.Callback callback = this.f2453a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2456e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        if (this.f2453a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2456e;
        layoutInflaterFactory2C0112A.z();
        K k2 = layoutInflaterFactory2C0112A.f2342o;
        if (k2 != null) {
            J j2 = k2.f2382k;
            if (j2 == null || (menuC0157m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0157m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0157m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0112A.f2316N;
        if (zVar == null || !layoutInflaterFactory2C0112A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0112A.f2316N == null) {
                z y2 = layoutInflaterFactory2C0112A.y(0);
                layoutInflaterFactory2C0112A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0112A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2467k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0112A.f2316N;
        if (zVar2 != null) {
            zVar2.f2468l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2453a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2453a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2453a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2453a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2453a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2453a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2454b) {
            this.f2453a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0157m)) {
            return this.f2453a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2453a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2453a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2453a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2456e;
        if (i == 108) {
            layoutInflaterFactory2C0112A.z();
            K k2 = layoutInflaterFactory2C0112A.f2342o;
            if (k2 != null && true != k2.f2385n) {
                k2.f2385n = true;
                ArrayList arrayList = k2.f2386o;
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
            this.f2453a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2456e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0112A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0112A.y(i);
            if (y2.f2469m) {
                layoutInflaterFactory2C0112A.p(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0112A.z();
        K k2 = layoutInflaterFactory2C0112A.f2342o;
        if (k2 == null || !k2.f2385n) {
            return;
        }
        k2.f2385n = false;
        ArrayList arrayList = k2.f2386o;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2453a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0157m menuC0157m = menu instanceof MenuC0157m ? (MenuC0157m) menu : null;
        if (i == 0 && menuC0157m == null) {
            return false;
        }
        if (menuC0157m != null) {
            menuC0157m.f2668x = true;
        }
        boolean onPreparePanel = this.f2453a.onPreparePanel(i, view, menu);
        if (menuC0157m != null) {
            menuC0157m.f2668x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0157m menuC0157m = this.f2456e.y(0).h;
        if (menuC0157m != null) {
            d(list, menuC0157m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2453a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2453a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2453a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A = this.f2456e;
        if (!layoutInflaterFactory2C0112A.f2353z || i != 0) {
            return j.k.b(this.f2453a, callback, i);
        }
        Context context = layoutInflaterFactory2C0112A.f2338k;
        T.u uVar = new T.u();
        uVar.f817b = context;
        uVar.f816a = callback;
        uVar.f818c = new ArrayList();
        uVar.d = new o.k();
        AbstractC0137a abstractC0137a = layoutInflaterFactory2C0112A.f2348u;
        if (abstractC0137a != null) {
            abstractC0137a.a();
        }
        B.j jVar = new B.j(layoutInflaterFactory2C0112A, uVar, 14);
        layoutInflaterFactory2C0112A.z();
        K k2 = layoutInflaterFactory2C0112A.f2342o;
        if (k2 != null) {
            J j2 = k2.f2382k;
            if (j2 != null) {
                j2.a();
            }
            k2.f2378e.setHideOnContentScrollEnabled(false);
            k2.h.e();
            J j3 = new J(k2, k2.h.getContext(), jVar);
            MenuC0157m menuC0157m = j3.d;
            menuC0157m.w();
            try {
                if (((T.u) j3.f2372e.f53b).q(j3, menuC0157m)) {
                    k2.f2382k = j3;
                    j3.g();
                    k2.h.c(j3);
                    k2.k0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0112A.f2348u = j3;
            } finally {
                menuC0157m.v();
            }
        }
        if (layoutInflaterFactory2C0112A.f2348u == null) {
            Z z2 = layoutInflaterFactory2C0112A.f2352y;
            if (z2 != null) {
                z2.b();
            }
            AbstractC0137a abstractC0137a2 = layoutInflaterFactory2C0112A.f2348u;
            if (abstractC0137a2 != null) {
                abstractC0137a2.a();
            }
            if (layoutInflaterFactory2C0112A.f2349v == null) {
                boolean z3 = layoutInflaterFactory2C0112A.f2312J;
                Context context2 = layoutInflaterFactory2C0112A.f2338k;
                if (z3) {
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
                    layoutInflaterFactory2C0112A.f2349v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0112A.f2350w = popupWindow;
                    Q.l.d(popupWindow, 2);
                    layoutInflaterFactory2C0112A.f2350w.setContentView(layoutInflaterFactory2C0112A.f2349v);
                    layoutInflaterFactory2C0112A.f2350w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0112A.f2349v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0112A.f2350w.setHeight(-2);
                    layoutInflaterFactory2C0112A.f2351x = new p(layoutInflaterFactory2C0112A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0112A.f2305B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0112A.z();
                        K k3 = layoutInflaterFactory2C0112A.f2342o;
                        Context l02 = k3 != null ? k3.l0() : null;
                        if (l02 != null) {
                            context2 = l02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0112A.f2349v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0112A.f2349v != null) {
                Z z4 = layoutInflaterFactory2C0112A.f2352y;
                if (z4 != null) {
                    z4.b();
                }
                layoutInflaterFactory2C0112A.f2349v.e();
                Context context3 = layoutInflaterFactory2C0112A.f2349v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0112A.f2349v;
                j.d dVar = new j.d();
                dVar.f2519c = context3;
                dVar.d = actionBarContextView;
                dVar.f2520e = jVar;
                MenuC0157m menuC0157m2 = new MenuC0157m(actionBarContextView.getContext());
                menuC0157m2.f2656l = 1;
                dVar.h = menuC0157m2;
                menuC0157m2.f2651e = dVar;
                if (((T.u) jVar.f53b).q(dVar, menuC0157m2)) {
                    dVar.g();
                    layoutInflaterFactory2C0112A.f2349v.c(dVar);
                    layoutInflaterFactory2C0112A.f2348u = dVar;
                    if (layoutInflaterFactory2C0112A.f2304A && (viewGroup = layoutInflaterFactory2C0112A.f2305B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0112A.f2349v.setAlpha(0.0f);
                        Z a2 = S.a(layoutInflaterFactory2C0112A.f2349v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0112A.f2352y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0112A));
                    } else {
                        layoutInflaterFactory2C0112A.f2349v.setAlpha(1.0f);
                        layoutInflaterFactory2C0112A.f2349v.setVisibility(0);
                        if (layoutInflaterFactory2C0112A.f2349v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0112A.f2349v.getParent();
                            WeakHashMap weakHashMap = S.f351a;
                            K.E.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0112A.f2350w != null) {
                        layoutInflaterFactory2C0112A.f2339l.getDecorView().post(layoutInflaterFactory2C0112A.f2351x);
                    }
                } else {
                    layoutInflaterFactory2C0112A.f2348u = null;
                }
            }
            layoutInflaterFactory2C0112A.H();
            layoutInflaterFactory2C0112A.f2348u = layoutInflaterFactory2C0112A.f2348u;
        }
        layoutInflaterFactory2C0112A.H();
        AbstractC0137a abstractC0137a3 = layoutInflaterFactory2C0112A.f2348u;
        if (abstractC0137a3 != null) {
            return uVar.g(abstractC0137a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2453a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
