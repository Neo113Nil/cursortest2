package g;

import M.Q;
import M.Y;
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
import com.winfour.neondrop.R;
import j.AbstractC0144a;
import j.AbstractC0154k;
import j.AbstractC0155l;
import j.AbstractC0156m;
import j.C0146c;
import j.C0147d;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2338a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2339b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2340c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0101A f2341e;

    public v(LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A, Window.Callback callback) {
        this.f2341e = layoutInflaterFactory2C0101A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2338a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2339b = true;
            callback.onContentChanged();
        } finally {
            this.f2339b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2338a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2338a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        AbstractC0155l.a(this.f2338a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2338a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2340c;
        Window.Callback callback = this.f2338a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2341e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        k.m mVar;
        boolean performShortcut;
        if (this.f2338a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = this.f2341e;
        layoutInflaterFactory2C0101A.z();
        K k2 = layoutInflaterFactory2C0101A.f2225o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 == null || (mVar = j2.d) == null) {
                performShortcut = false;
            } else {
                mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = mVar.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0101A.f2199N;
        if (zVar == null || !layoutInflaterFactory2C0101A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0101A.f2199N == null) {
                z y2 = layoutInflaterFactory2C0101A.y(0);
                layoutInflaterFactory2C0101A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0101A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2352k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0101A.f2199N;
        if (zVar2 != null) {
            zVar2.f2353l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2338a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2338a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2338a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2338a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2338a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2338a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2339b) {
            this.f2338a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof k.m)) {
            return this.f2338a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2338a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2338a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2338a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = this.f2341e;
        if (i == 108) {
            layoutInflaterFactory2C0101A.z();
            K k2 = layoutInflaterFactory2C0101A.f2225o;
            if (k2 != null && true != k2.f2269l) {
                k2.f2269l = true;
                ArrayList arrayList = k2.f2270m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0101A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2338a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = this.f2341e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0101A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0101A.y(i);
            if (y2.f2354m) {
                layoutInflaterFactory2C0101A.r(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0101A.z();
        K k2 = layoutInflaterFactory2C0101A.f2225o;
        if (k2 == null || !k2.f2269l) {
            return;
        }
        k2.f2269l = false;
        ArrayList arrayList = k2.f2270m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        AbstractC0156m.a(this.f2338a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        k.m mVar = menu instanceof k.m ? (k.m) menu : null;
        if (i == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f2785x = true;
        }
        boolean onPreparePanel = this.f2338a.onPreparePanel(i, view, menu);
        if (mVar != null) {
            mVar.f2785x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        k.m mVar = this.f2341e.y(0).h;
        if (mVar != null) {
            d(list, mVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0154k.a(this.f2338a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2338a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2338a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = this.f2341e;
        if (!layoutInflaterFactory2C0101A.f2236z || i != 0) {
            return AbstractC0154k.b(this.f2338a, callback, i);
        }
        Context context = layoutInflaterFactory2C0101A.f2221k;
        T0.g gVar = new T0.g();
        gVar.f825b = context;
        gVar.f824a = callback;
        gVar.f826c = new ArrayList();
        gVar.d = new q.k();
        AbstractC0144a abstractC0144a = layoutInflaterFactory2C0101A.f2231u;
        if (abstractC0144a != null) {
            abstractC0144a.a();
        }
        D.j jVar = new D.j(layoutInflaterFactory2C0101A, gVar);
        layoutInflaterFactory2C0101A.z();
        K k2 = layoutInflaterFactory2C0101A.f2225o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 != null) {
                j2.a();
            }
            k2.f2263c.setHideOnContentScrollEnabled(false);
            k2.f2265f.e();
            J j3 = new J(k2, k2.f2265f.getContext(), jVar);
            k.m mVar = j3.d;
            mVar.w();
            try {
                if (((T0.g) j3.f2256e.f133b).q(j3, mVar)) {
                    k2.i = j3;
                    j3.g();
                    k2.f2265f.c(j3);
                    k2.y0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0101A.f2231u = j3;
            } finally {
                mVar.v();
            }
        }
        if (layoutInflaterFactory2C0101A.f2231u == null) {
            Y y2 = layoutInflaterFactory2C0101A.f2235y;
            if (y2 != null) {
                y2.b();
            }
            AbstractC0144a abstractC0144a2 = layoutInflaterFactory2C0101A.f2231u;
            if (abstractC0144a2 != null) {
                abstractC0144a2.a();
            }
            if (layoutInflaterFactory2C0101A.f2232v == null) {
                boolean z2 = layoutInflaterFactory2C0101A.f2195J;
                Context context2 = layoutInflaterFactory2C0101A.f2221k;
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
                    layoutInflaterFactory2C0101A.f2232v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0101A.f2233w = popupWindow;
                    S.m.d(popupWindow, 2);
                    layoutInflaterFactory2C0101A.f2233w.setContentView(layoutInflaterFactory2C0101A.f2232v);
                    layoutInflaterFactory2C0101A.f2233w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0101A.f2232v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0101A.f2233w.setHeight(-2);
                    layoutInflaterFactory2C0101A.f2234x = new p(layoutInflaterFactory2C0101A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0101A.f2188B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0101A.z();
                        K k3 = layoutInflaterFactory2C0101A.f2225o;
                        Context z02 = k3 != null ? k3.z0() : null;
                        if (z02 != null) {
                            context2 = z02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0101A.f2232v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0101A.f2232v != null) {
                Y y3 = layoutInflaterFactory2C0101A.f2235y;
                if (y3 != null) {
                    y3.b();
                }
                layoutInflaterFactory2C0101A.f2232v.e();
                Context context3 = layoutInflaterFactory2C0101A.f2232v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0101A.f2232v;
                C0147d c0147d = new C0147d();
                c0147d.f2628c = context3;
                c0147d.d = actionBarContextView;
                c0147d.f2629e = jVar;
                k.m mVar2 = new k.m(actionBarContextView.getContext());
                mVar2.f2773l = 1;
                c0147d.h = mVar2;
                mVar2.f2768e = c0147d;
                if (((T0.g) jVar.f133b).q(c0147d, mVar2)) {
                    c0147d.g();
                    layoutInflaterFactory2C0101A.f2232v.c(c0147d);
                    layoutInflaterFactory2C0101A.f2231u = c0147d;
                    if (layoutInflaterFactory2C0101A.f2187A && (viewGroup = layoutInflaterFactory2C0101A.f2188B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0101A.f2232v.setAlpha(0.0f);
                        Y a2 = Q.a(layoutInflaterFactory2C0101A.f2232v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0101A.f2235y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0101A));
                    } else {
                        layoutInflaterFactory2C0101A.f2232v.setAlpha(1.0f);
                        layoutInflaterFactory2C0101A.f2232v.setVisibility(0);
                        if (layoutInflaterFactory2C0101A.f2232v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0101A.f2232v.getParent();
                            WeakHashMap weakHashMap = Q.f513a;
                            M.D.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0101A.f2233w != null) {
                        layoutInflaterFactory2C0101A.f2222l.getDecorView().post(layoutInflaterFactory2C0101A.f2234x);
                    }
                } else {
                    layoutInflaterFactory2C0101A.f2231u = null;
                }
            }
            layoutInflaterFactory2C0101A.H();
            layoutInflaterFactory2C0101A.f2231u = layoutInflaterFactory2C0101A.f2231u;
        }
        layoutInflaterFactory2C0101A.H();
        AbstractC0144a abstractC0144a3 = layoutInflaterFactory2C0101A.f2231u;
        if (abstractC0144a3 != null) {
            return gVar.g(abstractC0144a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2338a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
