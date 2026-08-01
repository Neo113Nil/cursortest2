package f;

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
import androidx.fragment.app.w0;
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w implements Window.Callback {

    /* renamed from: f, reason: collision with root package name */
    public final Window.Callback f1649f;
    public boolean g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1650i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f1651j;

    public w(b0 b0Var, Window.Callback callback) {
        this.f1651j = b0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f1649f = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.g = true;
            callback.onContentChanged();
        } finally {
            this.g = false;
        }
    }

    public final boolean b(int i4, Menu menu) {
        return this.f1649f.onMenuOpened(i4, menu);
    }

    public final void c(int i4, Menu menu) {
        this.f1649f.onPanelClosed(i4, menu);
    }

    public final void d(List list, Menu menu, int i4) {
        i.l.a(this.f1649f, list, menu, i4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1649f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.h;
        Window.Callback callback = this.f1649f;
        return z3 ? callback.dispatchKeyEvent(keyEvent) : this.f1651j.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z3;
        j.m mVar;
        boolean performShortcut;
        if (!this.f1649f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            b0 b0Var = this.f1651j;
            b0Var.z();
            l0 l0Var = b0Var.f1560t;
            if (l0Var != null) {
                k0 k0Var = l0Var.f1623n;
                if (k0Var == null || (mVar = k0Var.f1613i) == null) {
                    performShortcut = false;
                } else {
                    mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = mVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            a0 a0Var = b0Var.S;
            if (a0Var == null || !b0Var.E(a0Var, keyEvent.getKeyCode(), keyEvent)) {
                if (b0Var.S == null) {
                    a0 y3 = b0Var.y(0);
                    b0Var.F(y3, keyEvent);
                    boolean E = b0Var.E(y3, keyEvent.getKeyCode(), keyEvent);
                    y3.f1528k = false;
                }
                z3 = false;
                if (z3) {
                    return false;
                }
            } else {
                a0 a0Var2 = b0Var.S;
                if (a0Var2 != null) {
                    a0Var2.f1529l = true;
                }
            }
            z3 = true;
            if (z3) {
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1649f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1649f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1649f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1649f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1649f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f1649f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.g) {
            this.f1649f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0 || (menu instanceof j.m)) {
            return this.f1649f.onCreatePanelMenu(i4, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i4) {
        return this.f1649f.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f1649f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f1649f.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i4, Menu menu) {
        b(i4, menu);
        if (i4 == 108) {
            b0 b0Var = this.f1651j;
            b0Var.z();
            l0 l0Var = b0Var.f1560t;
            if (l0Var != null) {
                ArrayList arrayList = l0Var.f1627r;
                if (true != l0Var.f1626q) {
                    l0Var.f1626q = true;
                    if (arrayList.size() > 0) {
                        throw w0.d(arrayList, 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        if (this.f1650i) {
            this.f1649f.onPanelClosed(i4, menu);
            return;
        }
        c(i4, menu);
        b0 b0Var = this.f1651j;
        if (i4 != 108) {
            if (i4 == 0) {
                a0 y3 = b0Var.y(i4);
                if (y3.f1530m) {
                    b0Var.r(y3, false);
                    return;
                }
                return;
            }
            return;
        }
        b0Var.z();
        l0 l0Var = b0Var.f1560t;
        if (l0Var != null) {
            ArrayList arrayList = l0Var.f1627r;
            if (l0Var.f1626q) {
                l0Var.f1626q = false;
                if (arrayList.size() > 0) {
                    throw w0.d(arrayList, 0);
                }
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        i.m.a(this.f1649f, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        j.m mVar = menu instanceof j.m ? (j.m) menu : null;
        if (i4 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f2209x = true;
        }
        boolean onPreparePanel = this.f1649f.onPreparePanel(i4, view, menu);
        if (mVar != null) {
            mVar.f2209x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        j.m mVar = this.f1651j.y(0).h;
        if (mVar != null) {
            d(list, mVar, i4);
        } else {
            d(list, menu, i4);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return i.k.a(this.f1649f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1649f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f1649f.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        ViewGroup viewGroup;
        b0 b0Var = this.f1651j;
        if (!b0Var.E || i4 != 0) {
            return i.k.b(this.f1649f, callback, i4);
        }
        Context context = b0Var.f1556p;
        androidx.emoji2.text.w wVar = new androidx.emoji2.text.w();
        wVar.g = context;
        wVar.f368f = callback;
        wVar.h = new ArrayList();
        wVar.f369i = new n.j(0);
        i.a aVar = b0Var.f1566z;
        if (aVar != null) {
            aVar.a();
        }
        a2.s sVar = new a2.s((LayoutInflater.Factory2) b0Var, (Object) wVar, 12);
        b0Var.z();
        l0 l0Var = b0Var.f1560t;
        int i5 = 1;
        if (l0Var != null) {
            k0 k0Var = l0Var.f1623n;
            if (k0Var != null) {
                k0Var.a();
            }
            l0Var.h.setHideOnContentScrollEnabled(false);
            l0Var.f1620k.e();
            k0 k0Var2 = new k0(l0Var, l0Var.f1620k.getContext(), sVar);
            j.m mVar = k0Var2.f1613i;
            mVar.w();
            try {
                if (((androidx.emoji2.text.w) k0Var2.f1614j.g).p(k0Var2, mVar)) {
                    l0Var.f1623n = k0Var2;
                    k0Var2.g();
                    l0Var.f1620k.c(k0Var2);
                    l0Var.l0(true);
                } else {
                    k0Var2 = null;
                }
                b0Var.f1566z = k0Var2;
            } finally {
                mVar.v();
            }
        }
        if (b0Var.f1566z == null) {
            k0.l0 l0Var2 = b0Var.D;
            if (l0Var2 != null) {
                l0Var2.b();
            }
            i.a aVar2 = b0Var.f1566z;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (b0Var.A == null) {
                if (b0Var.O) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        i.c cVar = new i.c(context, 0);
                        cVar.getTheme().setTo(newTheme);
                        context = cVar;
                    }
                    b0Var.A = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    b0Var.B = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    b0Var.B.setContentView(b0Var.A);
                    b0Var.B.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    b0Var.A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    b0Var.B.setHeight(-2);
                    b0Var.C = new q(b0Var, i5);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) b0Var.G.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        b0Var.z();
                        l0 l0Var3 = b0Var.f1560t;
                        Context m02 = l0Var3 != null ? l0Var3.m0() : null;
                        if (m02 != null) {
                            context = m02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        b0Var.A = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (b0Var.A != null) {
                k0.l0 l0Var4 = b0Var.D;
                if (l0Var4 != null) {
                    l0Var4.b();
                }
                b0Var.A.e();
                Context context2 = b0Var.A.getContext();
                ActionBarContextView actionBarContextView = b0Var.A;
                i.d dVar = new i.d();
                dVar.h = context2;
                dVar.f2034i = actionBarContextView;
                dVar.f2035j = sVar;
                j.m mVar2 = new j.m(actionBarContextView.getContext());
                mVar2.f2197l = 1;
                dVar.f2038m = mVar2;
                mVar2.f2192e = dVar;
                if (wVar.p(dVar, mVar2)) {
                    dVar.g();
                    b0Var.A.c(dVar);
                    b0Var.f1566z = dVar;
                    if (b0Var.F && (viewGroup = b0Var.G) != null && viewGroup.isLaidOut()) {
                        b0Var.A.setAlpha(0.0f);
                        k0.l0 a4 = k0.j0.a(b0Var.A);
                        a4.a(1.0f);
                        b0Var.D = a4;
                        a4.d(new s(i5, b0Var));
                    } else {
                        b0Var.A.setAlpha(1.0f);
                        b0Var.A.setVisibility(0);
                        if (b0Var.A.getParent() instanceof View) {
                            View view = (View) b0Var.A.getParent();
                            WeakHashMap weakHashMap = k0.j0.f2752a;
                            k0.z.c(view);
                        }
                    }
                    if (b0Var.B != null) {
                        b0Var.f1557q.getDecorView().post(b0Var.C);
                    }
                } else {
                    b0Var.f1566z = null;
                }
            }
            b0Var.H();
            b0Var.f1566z = b0Var.f1566z;
        }
        b0Var.H();
        i.a aVar3 = b0Var.f1566z;
        if (aVar3 != null) {
            return wVar.g(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1649f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
