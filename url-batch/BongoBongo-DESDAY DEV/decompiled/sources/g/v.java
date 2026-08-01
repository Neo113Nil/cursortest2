package g;

import L.C0005c0;
import L.T;
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
import com.winfour.winrandom.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.AbstractC0147a;
import k.C0149c;
import l.MenuC0169m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2357a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2358b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2359c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f2360e;

    public v(A a2, Window.Callback callback) {
        this.f2360e = a2;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2357a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2358b = true;
            callback.onContentChanged();
        } finally {
            this.f2358b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2357a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2357a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        k.l.a(this.f2357a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2357a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2359c;
        Window.Callback callback = this.f2357a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2360e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0169m menuC0169m;
        boolean performShortcut;
        if (this.f2357a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        A a2 = this.f2360e;
        a2.z();
        K k2 = a2.f2238o;
        if (k2 != null) {
            J j2 = k2.f2284m;
            if (j2 == null || (menuC0169m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0169m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0169m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = a2.f2212N;
        if (zVar == null || !a2.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (a2.f2212N == null) {
                z y2 = a2.y(0);
                a2.F(y2, keyEvent);
                boolean E2 = a2.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2372k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = a2.f2212N;
        if (zVar2 != null) {
            zVar2.f2373l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2357a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2357a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2357a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2357a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2357a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2357a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2358b) {
            this.f2357a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0169m)) {
            return this.f2357a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2357a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2357a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2357a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        A a2 = this.f2360e;
        if (i == 108) {
            a2.z();
            K k2 = a2.f2238o;
            if (k2 != null && true != k2.f2287p) {
                k2.f2287p = true;
                ArrayList arrayList = k2.f2288q;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            a2.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2357a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        A a2 = this.f2360e;
        if (i != 108) {
            if (i != 0) {
                a2.getClass();
                return;
            }
            z y2 = a2.y(i);
            if (y2.f2374m) {
                a2.r(y2, false);
                return;
            }
            return;
        }
        a2.z();
        K k2 = a2.f2238o;
        if (k2 == null || !k2.f2287p) {
            return;
        }
        k2.f2287p = false;
        ArrayList arrayList = k2.f2288q;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        k.m.a(this.f2357a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0169m menuC0169m = menu instanceof MenuC0169m ? (MenuC0169m) menu : null;
        if (i == 0 && menuC0169m == null) {
            return false;
        }
        if (menuC0169m != null) {
            menuC0169m.f2836x = true;
        }
        boolean onPreparePanel = this.f2357a.onPreparePanel(i, view, menu);
        if (menuC0169m != null) {
            menuC0169m.f2836x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0169m menuC0169m = this.f2360e.y(0).f2370h;
        if (menuC0169m != null) {
            d(list, menuC0169m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f2357a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2357a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2357a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        A a2 = this.f2360e;
        if (!a2.f2249z || i != 0) {
            return k.k.b(this.f2357a, callback, i);
        }
        Context context = a2.f2234k;
        S0.g gVar = new S0.g();
        gVar.f823b = context;
        gVar.f822a = callback;
        gVar.f824c = new ArrayList();
        gVar.d = new p.k();
        AbstractC0147a abstractC0147a = a2.f2244u;
        if (abstractC0147a != null) {
            abstractC0147a.a();
        }
        C.j jVar = new C.j(a2, gVar);
        a2.z();
        K k2 = a2.f2238o;
        if (k2 != null) {
            J j2 = k2.f2284m;
            if (j2 != null) {
                j2.a();
            }
            k2.f2279g.setHideOnContentScrollEnabled(false);
            k2.f2281j.e();
            J j3 = new J(k2, k2.f2281j.getContext(), jVar);
            MenuC0169m menuC0169m = j3.d;
            menuC0169m.w();
            try {
                if (((S0.g) j3.f2270e.f86b).q(j3, menuC0169m)) {
                    k2.f2284m = j3;
                    j3.g();
                    k2.f2281j.c(j3);
                    k2.m0(true);
                } else {
                    j3 = null;
                }
                a2.f2244u = j3;
            } finally {
                menuC0169m.v();
            }
        }
        if (a2.f2244u == null) {
            C0005c0 c0005c0 = a2.f2248y;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            AbstractC0147a abstractC0147a2 = a2.f2244u;
            if (abstractC0147a2 != null) {
                abstractC0147a2.a();
            }
            if (a2.f2245v == null) {
                boolean z2 = a2.f2208J;
                Context context2 = a2.f2234k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0149c c0149c = new C0149c(context2, 0);
                        c0149c.getTheme().setTo(newTheme);
                        context2 = c0149c;
                    }
                    a2.f2245v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    a2.f2246w = popupWindow;
                    R.m.d(popupWindow, 2);
                    a2.f2246w.setContentView(a2.f2245v);
                    a2.f2246w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    a2.f2245v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    a2.f2246w.setHeight(-2);
                    a2.f2247x = new p(a2, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) a2.f2201B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        a2.z();
                        K k3 = a2.f2238o;
                        Context n02 = k3 != null ? k3.n0() : null;
                        if (n02 != null) {
                            context2 = n02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        a2.f2245v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (a2.f2245v != null) {
                C0005c0 c0005c02 = a2.f2248y;
                if (c0005c02 != null) {
                    c0005c02.b();
                }
                a2.f2245v.e();
                Context context3 = a2.f2245v.getContext();
                ActionBarContextView actionBarContextView = a2.f2245v;
                k.d dVar = new k.d();
                dVar.f2679c = context3;
                dVar.d = actionBarContextView;
                dVar.f2680e = jVar;
                MenuC0169m menuC0169m2 = new MenuC0169m(actionBarContextView.getContext());
                menuC0169m2.f2824l = 1;
                dVar.f2683h = menuC0169m2;
                menuC0169m2.f2818e = dVar;
                if (((S0.g) jVar.f86b).q(dVar, menuC0169m2)) {
                    dVar.g();
                    a2.f2245v.c(dVar);
                    a2.f2244u = dVar;
                    if (a2.f2200A && (viewGroup = a2.f2201B) != null && viewGroup.isLaidOut()) {
                        a2.f2245v.setAlpha(RecyclerView.A0);
                        C0005c0 a3 = T.a(a2.f2245v);
                        a3.a(1.0f);
                        a2.f2248y = a3;
                        a3.d(new r(i2, a2));
                    } else {
                        a2.f2245v.setAlpha(1.0f);
                        a2.f2245v.setVisibility(0);
                        if (a2.f2245v.getParent() instanceof View) {
                            View view = (View) a2.f2245v.getParent();
                            WeakHashMap weakHashMap = T.f490a;
                            L.F.c(view);
                        }
                    }
                    if (a2.f2246w != null) {
                        a2.f2235l.getDecorView().post(a2.f2247x);
                    }
                } else {
                    a2.f2244u = null;
                }
            }
            a2.H();
            a2.f2244u = a2.f2244u;
        }
        a2.H();
        AbstractC0147a abstractC0147a3 = a2.f2244u;
        if (abstractC0147a3 != null) {
            return gVar.g(abstractC0147a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2357a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
