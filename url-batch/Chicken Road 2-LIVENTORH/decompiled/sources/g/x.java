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
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class x implements Window.Callback {

    /* renamed from: f, reason: collision with root package name */
    public final Window.Callback f1690f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1691g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1692h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f1693j;

    public x(c0 c0Var, Window.Callback callback) {
        this.f1693j = c0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f1690f = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f1691g = true;
            callback.onContentChanged();
        } finally {
            this.f1691g = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f1690f.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f1690f.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f1690f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1690f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f1692h;
        Window.Callback callback = this.f1690f;
        return z3 ? callback.dispatchKeyEvent(keyEvent) : this.f1693j.s(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        k.m mVar;
        boolean performShortcut;
        if (!this.f1690f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            c0 c0Var = this.f1693j;
            c0Var.z();
            m0 m0Var = c0Var.f1599t;
            if (m0Var != null) {
                l0 l0Var = m0Var.f1668v;
                if (l0Var == null || (mVar = l0Var.i) == null) {
                    performShortcut = false;
                } else {
                    mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = mVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            b0 b0Var = c0Var.R;
            if (b0Var == null || !c0Var.E(b0Var, keyEvent.getKeyCode(), keyEvent)) {
                if (c0Var.R == null) {
                    b0 y3 = c0Var.y(0);
                    c0Var.F(y3, keyEvent);
                    boolean E = c0Var.E(y3, keyEvent.getKeyCode(), keyEvent);
                    y3.f1574k = false;
                }
                z3 = false;
                if (z3) {
                    return false;
                }
            } else {
                b0 b0Var2 = c0Var.R;
                if (b0Var2 != null) {
                    b0Var2.f1575l = true;
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
        return this.f1690f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1690f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1690f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1690f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1690f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f1690f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1691g) {
            this.f1690f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof k.m)) {
            return this.f1690f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f1690f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f1690f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f1690f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            c0 c0Var = this.f1693j;
            c0Var.z();
            m0 m0Var = c0Var.f1599t;
            if (m0Var != null) {
                ArrayList arrayList = m0Var.f1672z;
                if (true != m0Var.f1671y) {
                    m0Var.f1671y = true;
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
            this.f1690f.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        c0 c0Var = this.f1693j;
        if (i != 108) {
            if (i == 0) {
                b0 y3 = c0Var.y(i);
                if (y3.f1576m) {
                    c0Var.q(y3, false);
                    return;
                }
                return;
            }
            return;
        }
        c0Var.z();
        m0 m0Var = c0Var.f1599t;
        if (m0Var != null) {
            ArrayList arrayList = m0Var.f1672z;
            if (m0Var.f1671y) {
                m0Var.f1671y = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        j.m.a(this.f1690f, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        k.m mVar = menu instanceof k.m ? (k.m) menu : null;
        if (i == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f2081x = true;
        }
        boolean onPreparePanel = this.f1690f.onPreparePanel(i, view, menu);
        if (mVar != null) {
            mVar.f2081x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        k.m mVar = this.f1693j.y(0).f1572h;
        if (mVar != null) {
            d(list, mVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f1690f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1690f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f1690f.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        if (i != 0) {
            return j.k.b(this.f1690f, callback, i);
        }
        c0 c0Var = this.f1693j;
        Context context = c0Var.f1595p;
        a0.j jVar = new a0.j(context, callback);
        j.a aVar = c0Var.f1605z;
        if (aVar != null) {
            aVar.a();
        }
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(c0Var, jVar);
        c0Var.z();
        m0 m0Var = c0Var.f1599t;
        int i4 = 1;
        if (m0Var != null) {
            l0 l0Var = m0Var.f1668v;
            if (l0Var != null) {
                l0Var.a();
            }
            m0Var.f1662p.setHideOnContentScrollEnabled(false);
            m0Var.f1665s.e();
            l0 l0Var2 = new l0(m0Var, m0Var.f1665s.getContext(), qVar);
            k.m mVar = l0Var2.i;
            mVar.w();
            try {
                if (((a0.j) l0Var2.f1657j.f346g).o(l0Var2, mVar)) {
                    m0Var.f1668v = l0Var2;
                    l0Var2.g();
                    m0Var.f1665s.c(l0Var2);
                    m0Var.W(true);
                } else {
                    l0Var2 = null;
                }
                c0Var.f1605z = l0Var2;
            } finally {
                mVar.v();
            }
        }
        if (c0Var.f1605z == null) {
            p0 p0Var = c0Var.D;
            if (p0Var != null) {
                p0Var.b();
            }
            j.a aVar2 = c0Var.f1605z;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (c0Var.A == null) {
                if (c0Var.N) {
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
                    c0Var.A = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    c0Var.B = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    c0Var.B.setContentView(c0Var.A);
                    c0Var.B.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    c0Var.A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    c0Var.B.setHeight(-2);
                    c0Var.C = new q(c0Var, i4);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) c0Var.F.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        c0Var.z();
                        m0 m0Var2 = c0Var.f1599t;
                        Context X = m0Var2 != null ? m0Var2.X() : null;
                        if (X != null) {
                            context = X;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        c0Var.A = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (c0Var.A != null) {
                p0 p0Var2 = c0Var.D;
                if (p0Var2 != null) {
                    p0Var2.b();
                }
                c0Var.A.e();
                Context context2 = c0Var.A.getContext();
                ActionBarContextView actionBarContextView = c0Var.A;
                j.d dVar = new j.d();
                dVar.f1838h = context2;
                dVar.i = actionBarContextView;
                dVar.f1839j = qVar;
                k.m mVar2 = new k.m(actionBarContextView.getContext());
                mVar2.f2069l = 1;
                dVar.f1842m = mVar2;
                mVar2.f2063e = dVar;
                if (jVar.o(dVar, mVar2)) {
                    dVar.g();
                    c0Var.A.c(dVar);
                    c0Var.f1605z = dVar;
                    if (c0Var.E && (viewGroup = c0Var.F) != null && viewGroup.isLaidOut()) {
                        c0Var.A.setAlpha(0.0f);
                        p0 a2 = n0.l0.a(c0Var.A);
                        a2.a(1.0f);
                        c0Var.D = a2;
                        a2.d(new s(i4, c0Var));
                    } else {
                        c0Var.A.setAlpha(1.0f);
                        c0Var.A.setVisibility(0);
                        if (c0Var.A.getParent() instanceof View) {
                            View view = (View) c0Var.A.getParent();
                            WeakHashMap weakHashMap = n0.l0.f2757a;
                            n0.b0.c(view);
                        }
                    }
                    if (c0Var.B != null) {
                        c0Var.f1596q.getDecorView().post(c0Var.C);
                    }
                } else {
                    c0Var.f1605z = null;
                }
            }
            c0Var.H();
            c0Var.f1605z = c0Var.f1605z;
        }
        c0Var.H();
        j.a aVar3 = c0Var.f1605z;
        if (aVar3 != null) {
            return jVar.h(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1690f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
