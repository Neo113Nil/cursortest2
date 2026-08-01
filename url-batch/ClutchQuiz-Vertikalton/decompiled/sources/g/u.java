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
import com.clutchquizarena.app.R;
import j.AbstractC0147a;
import j.C0149c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0167m;

/* loaded from: classes.dex */
public final class u implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2468a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2469b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2470c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f2471e;

    public u(z zVar, Window.Callback callback) {
        this.f2471e = zVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2468a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2469b = true;
            callback.onContentChanged();
        } finally {
            this.f2469b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2468a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2468a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2468a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2468a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2470c;
        Window.Callback callback = this.f2468a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2471e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0167m menuC0167m;
        boolean performShortcut;
        if (this.f2468a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        z zVar = this.f2471e;
        zVar.z();
        J j2 = zVar.f2528o;
        if (j2 != null) {
            I i = j2.i;
            if (i == null || (menuC0167m = i.d) == null) {
                performShortcut = false;
            } else {
                menuC0167m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0167m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        y yVar = zVar.f2502M;
        if (yVar == null || !zVar.E(yVar, keyEvent.getKeyCode(), keyEvent)) {
            if (zVar.f2502M == null) {
                y y2 = zVar.y(0);
                zVar.F(y2, keyEvent);
                boolean E2 = zVar.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2482k = false;
            }
            z2 = false;
            return !z2;
        }
        y yVar2 = zVar.f2502M;
        if (yVar2 != null) {
            yVar2.f2483l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2468a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2468a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2468a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2468a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2468a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2468a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2469b) {
            this.f2468a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0167m)) {
            return this.f2468a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2468a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2468a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2468a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        z zVar = this.f2471e;
        if (i == 108) {
            zVar.z();
            J j2 = zVar.f2528o;
            if (j2 != null && true != j2.f2402l) {
                j2.f2402l = true;
                ArrayList arrayList = j2.f2403m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            zVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2468a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        z zVar = this.f2471e;
        if (i != 108) {
            if (i != 0) {
                zVar.getClass();
                return;
            }
            y y2 = zVar.y(i);
            if (y2.f2484m) {
                zVar.r(y2, false);
                return;
            }
            return;
        }
        zVar.z();
        J j2 = zVar.f2528o;
        if (j2 == null || !j2.f2402l) {
            return;
        }
        j2.f2402l = false;
        ArrayList arrayList = j2.f2403m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2468a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0167m menuC0167m = menu instanceof MenuC0167m ? (MenuC0167m) menu : null;
        if (i == 0 && menuC0167m == null) {
            return false;
        }
        if (menuC0167m != null) {
            menuC0167m.f2766x = true;
        }
        boolean onPreparePanel = this.f2468a.onPreparePanel(i, view, menu);
        if (menuC0167m != null) {
            menuC0167m.f2766x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0167m menuC0167m = this.f2471e.y(0).h;
        if (menuC0167m != null) {
            d(list, menuC0167m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2468a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2468a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2468a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        z zVar = this.f2471e;
        zVar.getClass();
        if (i != 0) {
            return j.k.b(this.f2468a, callback, i);
        }
        T.w wVar = new T.w(zVar.f2524k, callback);
        AbstractC0147a abstractC0147a = zVar.f2534u;
        if (abstractC0147a != null) {
            abstractC0147a.a();
        }
        B.j jVar = new B.j(zVar, wVar);
        zVar.z();
        J j2 = zVar.f2528o;
        if (j2 != null) {
            I i3 = j2.i;
            if (i3 != null) {
                i3.a();
            }
            j2.f2396c.setHideOnContentScrollEnabled(false);
            j2.f2398f.e();
            I i4 = new I(j2, j2.f2398f.getContext(), jVar);
            MenuC0167m menuC0167m = i4.d;
            menuC0167m.w();
            try {
                if (((T.w) i4.f2389e.f56b).m(i4, menuC0167m)) {
                    j2.i = i4;
                    i4.g();
                    j2.f2398f.c(i4);
                    j2.S(true);
                } else {
                    i4 = null;
                }
                zVar.f2534u = i4;
            } finally {
                menuC0167m.v();
            }
        }
        if (zVar.f2534u == null) {
            Z z2 = zVar.f2538y;
            if (z2 != null) {
                z2.b();
            }
            AbstractC0147a abstractC0147a2 = zVar.f2534u;
            if (abstractC0147a2 != null) {
                abstractC0147a2.a();
            }
            if (zVar.f2535v == null) {
                boolean z3 = zVar.f2498I;
                Context context = zVar.f2524k;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0149c c0149c = new C0149c(context, 0);
                        c0149c.getTheme().setTo(newTheme);
                        context = c0149c;
                    }
                    zVar.f2535v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    zVar.f2536w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    zVar.f2536w.setContentView(zVar.f2535v);
                    zVar.f2536w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    zVar.f2535v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    zVar.f2536w.setHeight(-2);
                    zVar.f2537x = new o(zVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) zVar.f2491A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        zVar.z();
                        J j3 = zVar.f2528o;
                        Context T2 = j3 != null ? j3.T() : null;
                        if (T2 != null) {
                            context = T2;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        zVar.f2535v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (zVar.f2535v != null) {
                Z z4 = zVar.f2538y;
                if (z4 != null) {
                    z4.b();
                }
                zVar.f2535v.e();
                Context context2 = zVar.f2535v.getContext();
                ActionBarContextView actionBarContextView = zVar.f2535v;
                j.d dVar = new j.d();
                dVar.f2597c = context2;
                dVar.d = actionBarContextView;
                dVar.f2598e = jVar;
                MenuC0167m menuC0167m2 = new MenuC0167m(actionBarContextView.getContext());
                menuC0167m2.f2754l = 1;
                dVar.h = menuC0167m2;
                menuC0167m2.f2749e = dVar;
                if (((T.w) jVar.f56b).m(dVar, menuC0167m2)) {
                    dVar.g();
                    zVar.f2535v.c(dVar);
                    zVar.f2534u = dVar;
                    if (zVar.f2539z && (viewGroup = zVar.f2491A) != null && viewGroup.isLaidOut()) {
                        zVar.f2535v.setAlpha(0.0f);
                        Z a2 = S.a(zVar.f2535v);
                        a2.a(1.0f);
                        zVar.f2538y = a2;
                        a2.d(new q(i2, zVar));
                    } else {
                        zVar.f2535v.setAlpha(1.0f);
                        zVar.f2535v.setVisibility(0);
                        if (zVar.f2535v.getParent() instanceof View) {
                            View view = (View) zVar.f2535v.getParent();
                            WeakHashMap weakHashMap = S.f365a;
                            K.E.c(view);
                        }
                    }
                    if (zVar.f2536w != null) {
                        zVar.f2525l.getDecorView().post(zVar.f2537x);
                    }
                } else {
                    zVar.f2534u = null;
                }
            }
            zVar.H();
            zVar.f2534u = zVar.f2534u;
        }
        zVar.H();
        AbstractC0147a abstractC0147a3 = zVar.f2534u;
        if (abstractC0147a3 != null) {
            return wVar.e(abstractC0147a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2468a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
