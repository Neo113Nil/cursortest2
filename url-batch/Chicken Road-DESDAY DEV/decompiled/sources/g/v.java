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
import com.playgen.securelock.R;
import j.AbstractC0140a;
import j.C0142c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0161m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2414a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2415b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2416c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0117A f2417e;

    public v(LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A, Window.Callback callback) {
        this.f2417e = layoutInflaterFactory2C0117A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2414a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2415b = true;
            callback.onContentChanged();
        } finally {
            this.f2415b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2414a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2414a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2414a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2414a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2416c;
        Window.Callback callback = this.f2414a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2417e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0161m menuC0161m;
        boolean performShortcut;
        if (this.f2414a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A = this.f2417e;
        layoutInflaterFactory2C0117A.z();
        K k2 = layoutInflaterFactory2C0117A.f2301o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 == null || (menuC0161m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0161m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0161m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0117A.f2275N;
        if (zVar == null || !layoutInflaterFactory2C0117A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0117A.f2275N == null) {
                z y2 = layoutInflaterFactory2C0117A.y(0);
                layoutInflaterFactory2C0117A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0117A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2428k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0117A.f2275N;
        if (zVar2 != null) {
            zVar2.f2429l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2414a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2414a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2414a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2414a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2414a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2414a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2415b) {
            this.f2414a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0161m)) {
            return this.f2414a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2414a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2414a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2414a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A = this.f2417e;
        if (i == 108) {
            layoutInflaterFactory2C0117A.z();
            K k2 = layoutInflaterFactory2C0117A.f2301o;
            if (k2 != null && true != k2.f2345l) {
                k2.f2345l = true;
                ArrayList arrayList = k2.f2346m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0117A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2414a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A = this.f2417e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0117A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0117A.y(i);
            if (y2.f2430m) {
                layoutInflaterFactory2C0117A.r(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0117A.z();
        K k2 = layoutInflaterFactory2C0117A.f2301o;
        if (k2 == null || !k2.f2345l) {
            return;
        }
        k2.f2345l = false;
        ArrayList arrayList = k2.f2346m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2414a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0161m menuC0161m = menu instanceof MenuC0161m ? (MenuC0161m) menu : null;
        if (i == 0 && menuC0161m == null) {
            return false;
        }
        if (menuC0161m != null) {
            menuC0161m.f2632x = true;
        }
        boolean onPreparePanel = this.f2414a.onPreparePanel(i, view, menu);
        if (menuC0161m != null) {
            menuC0161m.f2632x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0161m menuC0161m = this.f2417e.y(0).h;
        if (menuC0161m != null) {
            d(list, menuC0161m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2414a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2414a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2414a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0117A layoutInflaterFactory2C0117A = this.f2417e;
        if (!layoutInflaterFactory2C0117A.f2312z || i != 0) {
            return j.k.b(this.f2414a, callback, i);
        }
        Context context = layoutInflaterFactory2C0117A.f2297k;
        T.u uVar = new T.u();
        uVar.f802b = context;
        uVar.f801a = callback;
        uVar.f803c = new ArrayList();
        uVar.d = new o.k();
        AbstractC0140a abstractC0140a = layoutInflaterFactory2C0117A.f2307u;
        if (abstractC0140a != null) {
            abstractC0140a.a();
        }
        B.j jVar = new B.j(layoutInflaterFactory2C0117A, uVar, 15);
        layoutInflaterFactory2C0117A.z();
        K k2 = layoutInflaterFactory2C0117A.f2301o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 != null) {
                j2.a();
            }
            k2.f2339c.setHideOnContentScrollEnabled(false);
            k2.f2341f.e();
            J j3 = new J(k2, k2.f2341f.getContext(), jVar);
            MenuC0161m menuC0161m = j3.d;
            menuC0161m.w();
            try {
                if (((T.u) j3.f2332e.f27b).q(j3, menuC0161m)) {
                    k2.i = j3;
                    j3.g();
                    k2.f2341f.c(j3);
                    k2.u0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0117A.f2307u = j3;
            } finally {
                menuC0161m.v();
            }
        }
        if (layoutInflaterFactory2C0117A.f2307u == null) {
            Z z2 = layoutInflaterFactory2C0117A.f2311y;
            if (z2 != null) {
                z2.b();
            }
            AbstractC0140a abstractC0140a2 = layoutInflaterFactory2C0117A.f2307u;
            if (abstractC0140a2 != null) {
                abstractC0140a2.a();
            }
            if (layoutInflaterFactory2C0117A.f2308v == null) {
                boolean z3 = layoutInflaterFactory2C0117A.f2271J;
                Context context2 = layoutInflaterFactory2C0117A.f2297k;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0142c c0142c = new C0142c(context2, 0);
                        c0142c.getTheme().setTo(newTheme);
                        context2 = c0142c;
                    }
                    layoutInflaterFactory2C0117A.f2308v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0117A.f2309w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    layoutInflaterFactory2C0117A.f2309w.setContentView(layoutInflaterFactory2C0117A.f2308v);
                    layoutInflaterFactory2C0117A.f2309w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0117A.f2308v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0117A.f2309w.setHeight(-2);
                    layoutInflaterFactory2C0117A.f2310x = new p(layoutInflaterFactory2C0117A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0117A.f2264B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0117A.z();
                        K k3 = layoutInflaterFactory2C0117A.f2301o;
                        Context v02 = k3 != null ? k3.v0() : null;
                        if (v02 != null) {
                            context2 = v02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0117A.f2308v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0117A.f2308v != null) {
                Z z4 = layoutInflaterFactory2C0117A.f2311y;
                if (z4 != null) {
                    z4.b();
                }
                layoutInflaterFactory2C0117A.f2308v.e();
                Context context3 = layoutInflaterFactory2C0117A.f2308v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0117A.f2308v;
                j.d dVar = new j.d();
                dVar.f2480c = context3;
                dVar.d = actionBarContextView;
                dVar.f2481e = jVar;
                MenuC0161m menuC0161m2 = new MenuC0161m(actionBarContextView.getContext());
                menuC0161m2.f2620l = 1;
                dVar.h = menuC0161m2;
                menuC0161m2.f2615e = dVar;
                if (((T.u) jVar.f27b).q(dVar, menuC0161m2)) {
                    dVar.g();
                    layoutInflaterFactory2C0117A.f2308v.c(dVar);
                    layoutInflaterFactory2C0117A.f2307u = dVar;
                    if (layoutInflaterFactory2C0117A.f2263A && (viewGroup = layoutInflaterFactory2C0117A.f2264B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0117A.f2308v.setAlpha(0.0f);
                        Z a2 = S.a(layoutInflaterFactory2C0117A.f2308v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0117A.f2311y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0117A));
                    } else {
                        layoutInflaterFactory2C0117A.f2308v.setAlpha(1.0f);
                        layoutInflaterFactory2C0117A.f2308v.setVisibility(0);
                        if (layoutInflaterFactory2C0117A.f2308v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0117A.f2308v.getParent();
                            WeakHashMap weakHashMap = S.f369a;
                            K.E.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0117A.f2309w != null) {
                        layoutInflaterFactory2C0117A.f2298l.getDecorView().post(layoutInflaterFactory2C0117A.f2310x);
                    }
                } else {
                    layoutInflaterFactory2C0117A.f2307u = null;
                }
            }
            layoutInflaterFactory2C0117A.H();
            layoutInflaterFactory2C0117A.f2307u = layoutInflaterFactory2C0117A.f2307u;
        }
        layoutInflaterFactory2C0117A.H();
        AbstractC0140a abstractC0140a3 = layoutInflaterFactory2C0117A.f2307u;
        if (abstractC0140a3 != null) {
            return uVar.g(abstractC0140a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2414a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
