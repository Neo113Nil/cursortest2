package h;

import M.P;
import M.W;
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
import com.winpower.neonfit.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l.AbstractC0204a;
import l.C0206c;
import m.MenuC0229m;

/* loaded from: classes.dex */
public final class u implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2821a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2822b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2823c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2824d;
    public final /* synthetic */ z e;

    public u(z zVar, Window.Callback callback) {
        this.e = zVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2821a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2822b = true;
            callback.onContentChanged();
        } finally {
            this.f2822b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2821a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2821a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        l.l.a(this.f2821a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2821a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2823c;
        Window.Callback callback = this.f2821a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0229m menuC0229m;
        boolean performShortcut;
        if (this.f2821a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        z zVar = this.e;
        zVar.z();
        K k2 = zVar.f2881o;
        if (k2 != null) {
            J j = k2.f2754m;
            if (j == null || (menuC0229m = j.f2742d) == null) {
                performShortcut = false;
            } else {
                menuC0229m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0229m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        y yVar = zVar.f2856N;
        if (yVar == null || !zVar.E(yVar, keyEvent.getKeyCode(), keyEvent)) {
            if (zVar.f2856N == null) {
                y y2 = zVar.y(0);
                zVar.F(y2, keyEvent);
                boolean E2 = zVar.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2835k = false;
            }
            z2 = false;
            return !z2;
        }
        y yVar2 = zVar.f2856N;
        if (yVar2 != null) {
            yVar2.f2836l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2821a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2821a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2821a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2821a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2821a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2821a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2822b) {
            this.f2821a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0229m)) {
            return this.f2821a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2821a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2821a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2821a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        z zVar = this.e;
        if (i == 108) {
            zVar.z();
            K k2 = zVar.f2881o;
            if (k2 != null && true != k2.f2757p) {
                k2.f2757p = true;
                ArrayList arrayList = k2.f2758q;
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
        if (this.f2824d) {
            this.f2821a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        z zVar = this.e;
        if (i != 108) {
            if (i != 0) {
                zVar.getClass();
                return;
            }
            y y2 = zVar.y(i);
            if (y2.f2837m) {
                zVar.r(y2, false);
                return;
            }
            return;
        }
        zVar.z();
        K k2 = zVar.f2881o;
        if (k2 == null || !k2.f2757p) {
            return;
        }
        k2.f2757p = false;
        ArrayList arrayList = k2.f2758q;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        l.m.a(this.f2821a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0229m menuC0229m = menu instanceof MenuC0229m ? (MenuC0229m) menu : null;
        if (i == 0 && menuC0229m == null) {
            return false;
        }
        if (menuC0229m != null) {
            menuC0229m.f3368x = true;
        }
        boolean onPreparePanel = this.f2821a.onPreparePanel(i, view, menu);
        if (menuC0229m != null) {
            menuC0229m.f3368x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0229m menuC0229m = this.e.y(0).f2834h;
        if (menuC0229m != null) {
            d(list, menuC0229m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return l.k.a(this.f2821a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2821a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2821a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        z zVar = this.e;
        if (!zVar.f2892z || i != 0) {
            return l.k.b(this.f2821a, callback, i);
        }
        Context context = zVar.f2877k;
        V.v vVar = new V.v();
        vVar.f1306b = context;
        vVar.f1305a = callback;
        vVar.f1307c = new ArrayList();
        vVar.f1308d = new q.k();
        AbstractC0204a abstractC0204a = zVar.f2887u;
        if (abstractC0204a != null) {
            abstractC0204a.a();
        }
        B1.c cVar = new B1.c(zVar, vVar, 13);
        zVar.z();
        K k2 = zVar.f2881o;
        if (k2 != null) {
            J j = k2.f2754m;
            if (j != null) {
                j.a();
            }
            k2.f2750g.setHideOnContentScrollEnabled(false);
            k2.j.e();
            J j2 = new J(k2, k2.j.getContext(), cVar);
            MenuC0229m menuC0229m = j2.f2742d;
            menuC0229m.w();
            try {
                if (((V.v) j2.e.f68b).q(j2, menuC0229m)) {
                    k2.f2754m = j2;
                    j2.i();
                    k2.j.c(j2);
                    k2.h0(true);
                } else {
                    j2 = null;
                }
                zVar.f2887u = j2;
            } finally {
                menuC0229m.v();
            }
        }
        if (zVar.f2887u == null) {
            W w2 = zVar.f2891y;
            if (w2 != null) {
                w2.b();
            }
            AbstractC0204a abstractC0204a2 = zVar.f2887u;
            if (abstractC0204a2 != null) {
                abstractC0204a2.a();
            }
            if (zVar.f2888v == null) {
                boolean z2 = zVar.f2852J;
                Context context2 = zVar.f2877k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0206c c0206c = new C0206c(context2, 0);
                        c0206c.getTheme().setTo(newTheme);
                        context2 = c0206c;
                    }
                    zVar.f2888v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    zVar.f2889w = popupWindow;
                    S.l.d(popupWindow, 2);
                    zVar.f2889w.setContentView(zVar.f2888v);
                    zVar.f2889w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    zVar.f2888v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    zVar.f2889w.setHeight(-2);
                    zVar.f2890x = new o(zVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) zVar.f2845B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        zVar.z();
                        K k3 = zVar.f2881o;
                        Context i02 = k3 != null ? k3.i0() : null;
                        if (i02 != null) {
                            context2 = i02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        zVar.f2888v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (zVar.f2888v != null) {
                W w3 = zVar.f2891y;
                if (w3 != null) {
                    w3.b();
                }
                zVar.f2888v.e();
                Context context3 = zVar.f2888v.getContext();
                ActionBarContextView actionBarContextView = zVar.f2888v;
                l.d dVar = new l.d();
                dVar.f3195c = context3;
                dVar.f3196d = actionBarContextView;
                dVar.e = cVar;
                MenuC0229m menuC0229m2 = new MenuC0229m(actionBarContextView.getContext());
                menuC0229m2.f3356l = 1;
                dVar.f3199h = menuC0229m2;
                menuC0229m2.e = dVar;
                if (((V.v) cVar.f68b).q(dVar, menuC0229m2)) {
                    dVar.i();
                    zVar.f2888v.c(dVar);
                    zVar.f2887u = dVar;
                    if (zVar.f2844A && (viewGroup = zVar.f2845B) != null && viewGroup.isLaidOut()) {
                        zVar.f2888v.setAlpha(0.0f);
                        W a2 = P.a(zVar.f2888v);
                        a2.a(1.0f);
                        zVar.f2891y = a2;
                        a2.d(new q(i2, zVar));
                    } else {
                        zVar.f2888v.setAlpha(1.0f);
                        zVar.f2888v.setVisibility(0);
                        if (zVar.f2888v.getParent() instanceof View) {
                            View view = (View) zVar.f2888v.getParent();
                            WeakHashMap weakHashMap = P.f711a;
                            M.C.c(view);
                        }
                    }
                    if (zVar.f2889w != null) {
                        zVar.f2878l.getDecorView().post(zVar.f2890x);
                    }
                } else {
                    zVar.f2887u = null;
                }
            }
            zVar.H();
            zVar.f2887u = zVar.f2887u;
        }
        zVar.H();
        AbstractC0204a abstractC0204a3 = zVar.f2887u;
        if (abstractC0204a3 != null) {
            return vVar.g(abstractC0204a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2821a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
