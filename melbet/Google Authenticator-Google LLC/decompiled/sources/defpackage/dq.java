package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.apps.authenticator2.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dq extends fp {
    public boolean a;
    public boolean b;
    final /* synthetic */ dy c;
    public kee d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(dy dyVar, Window.Callback callback) {
        super(callback);
        this.c = dyVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.e.dispatchKeyEvent(keyEvent) : this.c.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            dy dyVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            cs b = dyVar.b();
            if (b == null || !b.o(keyCode, keyEvent)) {
                dw dwVar = dyVar.D;
                if (dwVar == null || !dyVar.P(dwVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (dyVar.D == null) {
                        dw O = dyVar.O(0);
                        dyVar.K(O, keyEvent);
                        boolean P = dyVar.P(O, keyEvent.getKeyCode(), keyEvent);
                        O.k = false;
                        if (!P) {
                        }
                    }
                    return false;
                }
                dw dwVar2 = dyVar.D;
                if (dwVar2 != null) {
                    dwVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof gd)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        kee keeVar = this.d;
        if (keeVar != null) {
            if (i == 0) {
                view = new View(((ef) keeVar.a).c.a());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        cs b;
        super.onMenuOpened(i, menu);
        if (i == 108 && (b = this.c.b()) != null) {
            b.d(true);
        }
        return true;
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        dy dyVar = this.c;
        if (i == 108) {
            cs b = dyVar.b();
            if (b != null) {
                b.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            dw O = dyVar.O(0);
            if (O.m) {
                dyVar.A(O, false);
            }
        }
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        gd gdVar = menu instanceof gd ? (gd) menu : null;
        if (i == 0) {
            if (gdVar == null) {
                return false;
            }
            i = 0;
        }
        if (gdVar != null) {
            gdVar.k = true;
        }
        kee keeVar = this.d;
        if (keeVar != null && i == 0) {
            ef efVar = (ef) keeVar.a;
            if (!efVar.b) {
                efVar.c.f();
                efVar.b = true;
            }
            i = 0;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (gdVar != null) {
            gdVar.k = false;
        }
        return onPreparePanel;
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        gd gdVar = this.c.O(0).h;
        if (gdVar != null) {
            super.onProvideKeyboardShortcuts(list, gdVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        dj djVar;
        dj djVar2;
        dy dyVar = this.c;
        if (!dyVar.v || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        Context context = dyVar.k;
        fi fiVar = new fi(context, callback);
        fg fgVar = dyVar.r;
        if (fgVar != null) {
            fgVar.f();
        }
        dp dpVar = new dp(dyVar, fiVar);
        cs b = dyVar.b();
        if (b != null) {
            dyVar.r = b.c(dpVar);
            if (dyVar.r != null && (djVar2 = dyVar.n) != null) {
                djVar2.o();
            }
        }
        if (dyVar.r == null) {
            dyVar.C();
            fg fgVar2 = dyVar.r;
            if (fgVar2 != null) {
                fgVar2.f();
            }
            if (dyVar.s == null) {
                if (dyVar.B) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        on onVar = new on(context, 0);
                        onVar.getTheme().setTo(newTheme);
                        context = onVar;
                    }
                    dyVar.s = new ActionBarContextView(context);
                    dyVar.t = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    dyVar.t.setWindowLayoutType(2);
                    dyVar.t.setContentView(dyVar.s);
                    dyVar.t.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    dyVar.s.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    dyVar.t.setHeight(-2);
                    dyVar.u = new bo(dyVar, 5, null);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) dyVar.x.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(dyVar.s());
                        dyVar.s = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (dyVar.s != null) {
                dyVar.C();
                dyVar.s.i();
                fh fhVar = new fh(dyVar.s.getContext(), dyVar.s, dpVar);
                if (dpVar.c(fhVar, fhVar.a)) {
                    fhVar.g();
                    dyVar.s.h(fhVar);
                    dyVar.r = fhVar;
                    if (dyVar.L()) {
                        dyVar.s.setAlpha(0.0f);
                        brn s = yq.s(dyVar.s);
                        s.N(1.0f);
                        dyVar.M = s;
                        dyVar.M.P(new dm(dyVar));
                    } else {
                        dyVar.s.setAlpha(1.0f);
                        dyVar.s.setVisibility(0);
                        if (dyVar.s.getParent() instanceof View) {
                            View view = (View) dyVar.s.getParent();
                            int i2 = yq.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (dyVar.t != null) {
                        dyVar.l.getDecorView().post(dyVar.u);
                    }
                } else {
                    dyVar.r = null;
                }
            }
            if (dyVar.r != null && (djVar = dyVar.n) != null) {
                djVar.o();
            }
            dyVar.G();
        }
        dyVar.G();
        fg fgVar3 = dyVar.r;
        if (fgVar3 != null) {
            return fiVar.e(fgVar3);
        }
        return null;
    }

    @Override // defpackage.fp, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
