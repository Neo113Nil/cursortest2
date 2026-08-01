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
import com.winworm.neongrid.R;
import j.AbstractC0144a;
import j.C0146c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0166m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2276a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2277b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2278c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0092A f2279e;

    public v(LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A, Window.Callback callback) {
        this.f2279e = layoutInflaterFactory2C0092A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2276a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2277b = true;
            callback.onContentChanged();
        } finally {
            this.f2277b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2276a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2276a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2276a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2276a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2278c;
        Window.Callback callback = this.f2276a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2279e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0166m menuC0166m;
        boolean performShortcut;
        if (this.f2276a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = this.f2279e;
        layoutInflaterFactory2C0092A.z();
        K k2 = layoutInflaterFactory2C0092A.f2163o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 == null || (menuC0166m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0166m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0166m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0092A.f2137N;
        if (zVar == null || !layoutInflaterFactory2C0092A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0092A.f2137N == null) {
                z y2 = layoutInflaterFactory2C0092A.y(0);
                layoutInflaterFactory2C0092A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0092A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2290k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0092A.f2137N;
        if (zVar2 != null) {
            zVar2.f2291l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2276a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2276a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2276a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2276a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2276a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2276a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2277b) {
            this.f2276a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0166m)) {
            return this.f2276a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2276a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2276a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2276a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = this.f2279e;
        if (i == 108) {
            layoutInflaterFactory2C0092A.z();
            K k2 = layoutInflaterFactory2C0092A.f2163o;
            if (k2 != null && true != k2.f2207l) {
                k2.f2207l = true;
                ArrayList arrayList = k2.f2208m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0092A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2276a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = this.f2279e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0092A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0092A.y(i);
            if (y2.f2292m) {
                layoutInflaterFactory2C0092A.q(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0092A.z();
        K k2 = layoutInflaterFactory2C0092A.f2163o;
        if (k2 == null || !k2.f2207l) {
            return;
        }
        k2.f2207l = false;
        ArrayList arrayList = k2.f2208m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2276a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0166m menuC0166m = menu instanceof MenuC0166m ? (MenuC0166m) menu : null;
        if (i == 0 && menuC0166m == null) {
            return false;
        }
        if (menuC0166m != null) {
            menuC0166m.f2733x = true;
        }
        boolean onPreparePanel = this.f2276a.onPreparePanel(i, view, menu);
        if (menuC0166m != null) {
            menuC0166m.f2733x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0166m menuC0166m = this.f2279e.y(0).h;
        if (menuC0166m != null) {
            d(list, menuC0166m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2276a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2276a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2276a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = this.f2279e;
        if (!layoutInflaterFactory2C0092A.f2174z || i != 0) {
            return j.k.b(this.f2276a, callback, i);
        }
        Context context = layoutInflaterFactory2C0092A.f2159k;
        U.u uVar = new U.u();
        uVar.f884b = context;
        uVar.f883a = callback;
        uVar.f885c = new ArrayList();
        uVar.d = new o.k();
        AbstractC0144a abstractC0144a = layoutInflaterFactory2C0092A.f2169u;
        if (abstractC0144a != null) {
            abstractC0144a.a();
        }
        B.j jVar = new B.j(layoutInflaterFactory2C0092A, uVar);
        layoutInflaterFactory2C0092A.z();
        K k2 = layoutInflaterFactory2C0092A.f2163o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 != null) {
                j2.a();
            }
            k2.f2201c.setHideOnContentScrollEnabled(false);
            k2.f2203f.e();
            J j3 = new J(k2, k2.f2203f.getContext(), jVar);
            MenuC0166m menuC0166m = j3.d;
            menuC0166m.w();
            try {
                if (((U.u) j3.f2194e.f45b).q(j3, menuC0166m)) {
                    k2.i = j3;
                    j3.g();
                    k2.f2203f.c(j3);
                    k2.v0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0092A.f2169u = j3;
            } finally {
                menuC0166m.v();
            }
        }
        if (layoutInflaterFactory2C0092A.f2169u == null) {
            C0005c0 c0005c0 = layoutInflaterFactory2C0092A.f2173y;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            AbstractC0144a abstractC0144a2 = layoutInflaterFactory2C0092A.f2169u;
            if (abstractC0144a2 != null) {
                abstractC0144a2.a();
            }
            if (layoutInflaterFactory2C0092A.f2170v == null) {
                boolean z2 = layoutInflaterFactory2C0092A.f2133J;
                Context context2 = layoutInflaterFactory2C0092A.f2159k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0146c c0146c = new C0146c(context2, 0);
                        c0146c.getTheme().setTo(newTheme);
                        context2 = c0146c;
                    }
                    layoutInflaterFactory2C0092A.f2170v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0092A.f2171w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    layoutInflaterFactory2C0092A.f2171w.setContentView(layoutInflaterFactory2C0092A.f2170v);
                    layoutInflaterFactory2C0092A.f2171w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0092A.f2170v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0092A.f2171w.setHeight(-2);
                    layoutInflaterFactory2C0092A.f2172x = new p(layoutInflaterFactory2C0092A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0092A.f2126B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0092A.z();
                        K k3 = layoutInflaterFactory2C0092A.f2163o;
                        Context w02 = k3 != null ? k3.w0() : null;
                        if (w02 != null) {
                            context2 = w02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0092A.f2170v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0092A.f2170v != null) {
                C0005c0 c0005c02 = layoutInflaterFactory2C0092A.f2173y;
                if (c0005c02 != null) {
                    c0005c02.b();
                }
                layoutInflaterFactory2C0092A.f2170v.e();
                Context context3 = layoutInflaterFactory2C0092A.f2170v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0092A.f2170v;
                j.d dVar = new j.d();
                dVar.f2582c = context3;
                dVar.d = actionBarContextView;
                dVar.f2583e = jVar;
                MenuC0166m menuC0166m2 = new MenuC0166m(actionBarContextView.getContext());
                menuC0166m2.f2721l = 1;
                dVar.h = menuC0166m2;
                menuC0166m2.f2716e = dVar;
                if (((U.u) jVar.f45b).q(dVar, menuC0166m2)) {
                    dVar.g();
                    layoutInflaterFactory2C0092A.f2170v.c(dVar);
                    layoutInflaterFactory2C0092A.f2169u = dVar;
                    if (layoutInflaterFactory2C0092A.f2125A && (viewGroup = layoutInflaterFactory2C0092A.f2126B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0092A.f2170v.setAlpha(RecyclerView.f1559A0);
                        C0005c0 a2 = T.a(layoutInflaterFactory2C0092A.f2170v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0092A.f2173y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0092A));
                    } else {
                        layoutInflaterFactory2C0092A.f2170v.setAlpha(1.0f);
                        layoutInflaterFactory2C0092A.f2170v.setVisibility(0);
                        if (layoutInflaterFactory2C0092A.f2170v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0092A.f2170v.getParent();
                            WeakHashMap weakHashMap = T.f440a;
                            K.F.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0092A.f2171w != null) {
                        layoutInflaterFactory2C0092A.f2160l.getDecorView().post(layoutInflaterFactory2C0092A.f2172x);
                    }
                } else {
                    layoutInflaterFactory2C0092A.f2169u = null;
                }
            }
            layoutInflaterFactory2C0092A.H();
            layoutInflaterFactory2C0092A.f2169u = layoutInflaterFactory2C0092A.f2169u;
        }
        layoutInflaterFactory2C0092A.H();
        AbstractC0144a abstractC0144a3 = layoutInflaterFactory2C0092A.f2169u;
        if (abstractC0144a3 != null) {
            return uVar.g(abstractC0144a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2276a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
