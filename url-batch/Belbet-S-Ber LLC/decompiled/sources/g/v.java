package g;

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
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.p0;
import n0.t0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: f, reason: collision with root package name */
    public final Window.Callback f1570f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1571g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f1572j;

    public v(a0 a0Var, Window.Callback callback) {
        this.f1572j = a0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f1570f = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f1571g = true;
            callback.onContentChanged();
        } finally {
            this.f1571g = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f1570f.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f1570f.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f1570f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1570f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.h;
        Window.Callback callback = this.f1570f;
        return z4 ? callback.dispatchKeyEvent(keyEvent) : this.f1572j.s(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        boolean z4;
        k.m mVar;
        boolean performShortcut;
        if (!this.f1570f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            a0 a0Var = this.f1572j;
            a0Var.y();
            k0 k0Var = a0Var.f1463t;
            if (k0Var != null) {
                j0 j0Var = k0Var.f1539j;
                if (j0Var == null || (mVar = j0Var.i) == null) {
                    performShortcut = false;
                } else {
                    mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = mVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            z zVar = a0Var.S;
            if (zVar == null || !a0Var.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
                if (a0Var.S == null) {
                    z x4 = a0Var.x(0);
                    a0Var.F(x4, keyEvent);
                    boolean E = a0Var.E(x4, keyEvent.getKeyCode(), keyEvent);
                    x4.f1584k = false;
                }
                z4 = false;
                if (z4) {
                    return false;
                }
            } else {
                z zVar2 = a0Var.S;
                if (zVar2 != null) {
                    zVar2.f1585l = true;
                }
            }
            z4 = true;
            if (z4) {
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1570f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1570f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1570f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1570f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1570f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f1570f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1571g) {
            this.f1570f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof k.m)) {
            return this.f1570f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f1570f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f1570f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f1570f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            a0 a0Var = this.f1572j;
            a0Var.y();
            k0 k0Var = a0Var.f1463t;
            if (k0Var != null) {
                ArrayList arrayList = k0Var.f1543n;
                if (true != k0Var.f1542m) {
                    k0Var.f1542m = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.i) {
            this.f1570f.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        a0 a0Var = this.f1572j;
        if (i != 108) {
            if (i == 0) {
                z x4 = a0Var.x(i);
                if (x4.f1586m) {
                    a0Var.p(x4, false);
                    return;
                }
                return;
            }
            return;
        }
        a0Var.y();
        k0 k0Var = a0Var.f1463t;
        if (k0Var != null) {
            ArrayList arrayList = k0Var.f1543n;
            if (k0Var.f1542m) {
                k0Var.f1542m = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        j.m.a(this.f1570f, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        k.m mVar = menu instanceof k.m ? (k.m) menu : null;
        if (i == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f2231x = true;
        }
        boolean onPreparePanel = this.f1570f.onPreparePanel(i, view, menu);
        if (mVar != null) {
            mVar.f2231x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        k.m mVar = this.f1572j.x(0).h;
        if (mVar != null) {
            d(list, mVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f1570f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1570f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f1570f.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        a0 a0Var = this.f1572j;
        if (!a0Var.E || i != 0) {
            return j.k.b(this.f1570f, callback, i);
        }
        Context context = a0Var.f1459p;
        a0.k kVar = new a0.k();
        kVar.i = context;
        kVar.f97f = callback;
        kVar.h = new ArrayList();
        kVar.f98g = new q.j(0);
        j.a aVar = a0Var.f1469z;
        if (aVar != null) {
            aVar.a();
        }
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q((LayoutInflater.Factory2) a0Var, (Object) kVar, 6);
        a0Var.y();
        k0 k0Var = a0Var.f1463t;
        int i4 = 1;
        if (k0Var != null) {
            j0 j0Var = k0Var.f1539j;
            if (j0Var != null) {
                j0Var.a();
            }
            k0Var.d.setHideOnContentScrollEnabled(false);
            k0Var.f1538g.e();
            j0 j0Var2 = new j0(k0Var, k0Var.f1538g.getContext(), qVar);
            k.m mVar = j0Var2.i;
            mVar.w();
            try {
                if (((a0.k) j0Var2.f1530j.f466g).s(j0Var2, mVar)) {
                    k0Var.f1539j = j0Var2;
                    j0Var2.g();
                    k0Var.f1538g.c(j0Var2);
                    k0Var.l0(true);
                } else {
                    j0Var2 = null;
                }
                a0Var.f1469z = j0Var2;
            } finally {
                mVar.v();
            }
        }
        if (a0Var.f1469z == null) {
            t0 t0Var = a0Var.D;
            if (t0Var != null) {
                t0Var.b();
            }
            j.a aVar2 = a0Var.f1469z;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (a0Var.A == null) {
                if (a0Var.O) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        j.c cVar = new j.c(context, 0);
                        cVar.getTheme().setTo(newTheme);
                        context = cVar;
                    }
                    a0Var.A = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    a0Var.B = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    a0Var.B.setContentView(a0Var.A);
                    a0Var.B.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    a0Var.A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    a0Var.B.setHeight(-2);
                    a0Var.C = new p(a0Var, i4);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) a0Var.G.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        a0Var.y();
                        k0 k0Var2 = a0Var.f1463t;
                        Context m02 = k0Var2 != null ? k0Var2.m0() : null;
                        if (m02 != null) {
                            context = m02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        a0Var.A = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (a0Var.A != null) {
                t0 t0Var2 = a0Var.D;
                if (t0Var2 != null) {
                    t0Var2.b();
                }
                a0Var.A.e();
                Context context2 = a0Var.A.getContext();
                ActionBarContextView actionBarContextView = a0Var.A;
                j.d dVar = new j.d();
                dVar.h = context2;
                dVar.i = actionBarContextView;
                dVar.f2083j = qVar;
                k.m mVar2 = new k.m(actionBarContextView.getContext());
                mVar2.f2219l = 1;
                dVar.f2086m = mVar2;
                mVar2.f2214e = dVar;
                if (kVar.s(dVar, mVar2)) {
                    dVar.g();
                    a0Var.A.c(dVar);
                    a0Var.f1469z = dVar;
                    if (a0Var.F && (viewGroup = a0Var.G) != null && viewGroup.isLaidOut()) {
                        a0Var.A.setAlpha(0.0f);
                        t0 a5 = p0.a(a0Var.A);
                        a5.a(1.0f);
                        a0Var.D = a5;
                        a5.d(new r(i4, a0Var));
                    } else {
                        a0Var.A.setAlpha(1.0f);
                        a0Var.A.setVisibility(0);
                        if (a0Var.A.getParent() instanceof View) {
                            View view = (View) a0Var.A.getParent();
                            WeakHashMap weakHashMap = p0.f2816a;
                            view.requestApplyInsets();
                        }
                    }
                    if (a0Var.B != null) {
                        a0Var.f1460q.getDecorView().post(a0Var.C);
                    }
                } else {
                    a0Var.f1469z = null;
                }
            }
            a0Var.H();
            a0Var.f1469z = a0Var.f1469z;
        }
        a0Var.H();
        j.a aVar3 = a0Var.f1469z;
        if (aVar3 != null) {
            return kVar.j(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1570f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
