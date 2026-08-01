package g;

import K.C0005c0;
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
import androidx.recyclerview.widget.RecyclerView;
import com.playbag.tripgear.R;
import j.AbstractC0142a;
import j.C0144c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0164m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2236a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2237b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2238c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0090A f2239e;

    public v(LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A, Window.Callback callback) {
        this.f2239e = layoutInflaterFactory2C0090A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2236a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2237b = true;
            callback.onContentChanged();
        } finally {
            this.f2237b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2236a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2236a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2236a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2236a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2238c;
        Window.Callback callback = this.f2236a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2239e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0164m menuC0164m;
        boolean performShortcut;
        if (this.f2236a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = this.f2239e;
        layoutInflaterFactory2C0090A.z();
        K k2 = layoutInflaterFactory2C0090A.f2123o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 == null || (menuC0164m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0164m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0164m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0090A.f2097N;
        if (zVar == null || !layoutInflaterFactory2C0090A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0090A.f2097N == null) {
                z y2 = layoutInflaterFactory2C0090A.y(0);
                layoutInflaterFactory2C0090A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0090A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2250k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0090A.f2097N;
        if (zVar2 != null) {
            zVar2.f2251l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2236a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2236a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2236a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2236a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2236a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2236a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2237b) {
            this.f2236a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0164m)) {
            return this.f2236a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2236a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2236a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2236a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = this.f2239e;
        if (i == 108) {
            layoutInflaterFactory2C0090A.z();
            K k2 = layoutInflaterFactory2C0090A.f2123o;
            if (k2 != null && true != k2.f2167l) {
                k2.f2167l = true;
                ArrayList arrayList = k2.f2168m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0090A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2236a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = this.f2239e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0090A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0090A.y(i);
            if (y2.f2252m) {
                layoutInflaterFactory2C0090A.r(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0090A.z();
        K k2 = layoutInflaterFactory2C0090A.f2123o;
        if (k2 == null || !k2.f2167l) {
            return;
        }
        k2.f2167l = false;
        ArrayList arrayList = k2.f2168m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2236a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0164m menuC0164m = menu instanceof MenuC0164m ? (MenuC0164m) menu : null;
        if (i == 0 && menuC0164m == null) {
            return false;
        }
        if (menuC0164m != null) {
            menuC0164m.f2705x = true;
        }
        boolean onPreparePanel = this.f2236a.onPreparePanel(i, view, menu);
        if (menuC0164m != null) {
            menuC0164m.f2705x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0164m menuC0164m = this.f2239e.y(0).h;
        if (menuC0164m != null) {
            d(list, menuC0164m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2236a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2236a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2236a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = this.f2239e;
        if (!layoutInflaterFactory2C0090A.f2134z || i != 0) {
            return j.k.b(this.f2236a, callback, i);
        }
        Context context = layoutInflaterFactory2C0090A.f2119k;
        U.u uVar = new U.u();
        uVar.f875b = context;
        uVar.f874a = callback;
        uVar.f876c = new ArrayList();
        uVar.d = new o.k();
        AbstractC0142a abstractC0142a = layoutInflaterFactory2C0090A.f2129u;
        if (abstractC0142a != null) {
            abstractC0142a.a();
        }
        B.j jVar = new B.j(layoutInflaterFactory2C0090A, uVar, 11);
        layoutInflaterFactory2C0090A.z();
        K k2 = layoutInflaterFactory2C0090A.f2123o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 != null) {
                j2.a();
            }
            k2.f2161c.setHideOnContentScrollEnabled(false);
            k2.f2163f.e();
            J j3 = new J(k2, k2.f2163f.getContext(), jVar);
            MenuC0164m menuC0164m = j3.d;
            menuC0164m.w();
            try {
                if (((U.u) j3.f2154e.f31b).q(j3, menuC0164m)) {
                    k2.i = j3;
                    j3.g();
                    k2.f2163f.c(j3);
                    k2.x0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0090A.f2129u = j3;
            } finally {
                menuC0164m.v();
            }
        }
        if (layoutInflaterFactory2C0090A.f2129u == null) {
            C0005c0 c0005c0 = layoutInflaterFactory2C0090A.f2133y;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            AbstractC0142a abstractC0142a2 = layoutInflaterFactory2C0090A.f2129u;
            if (abstractC0142a2 != null) {
                abstractC0142a2.a();
            }
            if (layoutInflaterFactory2C0090A.f2130v == null) {
                boolean z2 = layoutInflaterFactory2C0090A.f2093J;
                Context context2 = layoutInflaterFactory2C0090A.f2119k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0144c c0144c = new C0144c(context2, 0);
                        c0144c.getTheme().setTo(newTheme);
                        context2 = c0144c;
                    }
                    layoutInflaterFactory2C0090A.f2130v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0090A.f2131w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    layoutInflaterFactory2C0090A.f2131w.setContentView(layoutInflaterFactory2C0090A.f2130v);
                    layoutInflaterFactory2C0090A.f2131w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0090A.f2130v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0090A.f2131w.setHeight(-2);
                    layoutInflaterFactory2C0090A.f2132x = new p(layoutInflaterFactory2C0090A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0090A.f2086B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0090A.z();
                        K k3 = layoutInflaterFactory2C0090A.f2123o;
                        Context y02 = k3 != null ? k3.y0() : null;
                        if (y02 != null) {
                            context2 = y02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0090A.f2130v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0090A.f2130v != null) {
                C0005c0 c0005c02 = layoutInflaterFactory2C0090A.f2133y;
                if (c0005c02 != null) {
                    c0005c02.b();
                }
                layoutInflaterFactory2C0090A.f2130v.e();
                Context context3 = layoutInflaterFactory2C0090A.f2130v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0090A.f2130v;
                j.d dVar = new j.d();
                dVar.f2544c = context3;
                dVar.d = actionBarContextView;
                dVar.f2545e = jVar;
                MenuC0164m menuC0164m2 = new MenuC0164m(actionBarContextView.getContext());
                menuC0164m2.f2693l = 1;
                dVar.h = menuC0164m2;
                menuC0164m2.f2688e = dVar;
                if (((U.u) jVar.f31b).q(dVar, menuC0164m2)) {
                    dVar.g();
                    layoutInflaterFactory2C0090A.f2130v.c(dVar);
                    layoutInflaterFactory2C0090A.f2129u = dVar;
                    if (layoutInflaterFactory2C0090A.f2085A && (viewGroup = layoutInflaterFactory2C0090A.f2086B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0090A.f2130v.setAlpha(RecyclerView.f1530C0);
                        C0005c0 a2 = T.a(layoutInflaterFactory2C0090A.f2130v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0090A.f2133y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0090A));
                    } else {
                        layoutInflaterFactory2C0090A.f2130v.setAlpha(1.0f);
                        layoutInflaterFactory2C0090A.f2130v.setVisibility(0);
                        if (layoutInflaterFactory2C0090A.f2130v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0090A.f2130v.getParent();
                            WeakHashMap weakHashMap = T.f423a;
                            K.F.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0090A.f2131w != null) {
                        layoutInflaterFactory2C0090A.f2120l.getDecorView().post(layoutInflaterFactory2C0090A.f2132x);
                    }
                } else {
                    layoutInflaterFactory2C0090A.f2129u = null;
                }
            }
            layoutInflaterFactory2C0090A.H();
            layoutInflaterFactory2C0090A.f2129u = layoutInflaterFactory2C0090A.f2129u;
        }
        layoutInflaterFactory2C0090A.H();
        AbstractC0142a abstractC0142a3 = layoutInflaterFactory2C0090A.f2129u;
        if (abstractC0142a3 != null) {
            return uVar.g(abstractC0142a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2236a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
