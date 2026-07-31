package u0;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b0.AbstractC0259J;
import f.AbstractC0382a;
import h.AbstractC0416e;
import l0.C0571a;
import l0.C0572b;

/* renamed from: u0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992q extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0997t f8396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0992q(C0997t c0997t, int i3) {
        super(1);
        this.f8395e = i3;
        this.f8396f = c0997t;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        Z.a aVar;
        boolean requestFocus;
        switch (this.f8395e) {
            case 0:
                KeyEvent keyEvent = ((C0572b) obj).f5541a;
                C0997t c0997t = this.f8396f;
                c0997t.getClass();
                long d3 = AbstractC0416e.d(keyEvent.getKeyCode());
                if (C0571a.a(d3, C0571a.f5533h)) {
                    aVar = new Z.a(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (C0571a.a(d3, C0571a.f5531f)) {
                    aVar = new Z.a(4);
                } else if (C0571a.a(d3, C0571a.f5530e)) {
                    aVar = new Z.a(3);
                } else {
                    aVar = C0571a.a(d3, C0571a.f5528c) ? true : C0571a.a(d3, C0571a.f5536k) ? new Z.a(5) : C0571a.a(d3, C0571a.f5529d) ? true : C0571a.a(d3, C0571a.f5537l) ? new Z.a(6) : C0571a.a(d3, C0571a.f5532g) ? true : C0571a.a(d3, C0571a.f5534i) ? true : C0571a.a(d3, C0571a.f5538m) ? new Z.a(7) : C0571a.a(d3, C0571a.f5527b) ? true : C0571a.a(d3, C0571a.f5535j) ? new Z.a(8) : null;
                }
                if (aVar == null || !AbstractC0382a.i(g2.i.R(keyEvent), 2)) {
                    return Boolean.FALSE;
                }
                a0.d w3 = c0997t.w();
                Z.g focusOwner = c0997t.getFocusOwner();
                C0990p c0990p = new C0990p(aVar, 1);
                int i3 = aVar.f3414a;
                Boolean c3 = ((androidx.compose.ui.focus.a) focusOwner).c(i3, w3, c0990p);
                if (c3 != null ? c3.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!(Z.a.a(i3, 1) ? true : Z.a.a(i3, 2))) {
                    return Boolean.FALSE;
                }
                Integer I3 = Z.c.I(i3);
                if (I3 == null) {
                    throw new IllegalStateException("Invalid focus direction");
                }
                int intValue = I3.intValue();
                Rect D = w3 != null ? AbstractC0259J.D(w3) : null;
                if (D == null) {
                    throw new IllegalStateException("Invalid rect");
                }
                View view = c0997t;
                while (true) {
                    if (view != null) {
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = c0997t.getRootView();
                        Z1.i.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                        if (view != null) {
                            if (!view.equals(c0997t)) {
                                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                    if (parent == c0997t) {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        view = null;
                    }
                }
                if (Z1.i.a(view, c0997t)) {
                    view = null;
                }
                if (view != null) {
                    Integer valueOf = Integer.valueOf(intValue);
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        if (viewGroup.isFocused()) {
                            requestFocus = true;
                        } else if (viewGroup.isFocusable() && !view.hasFocus()) {
                            requestFocus = view.requestFocus(valueOf.intValue(), D);
                        } else if (view instanceof C0997t) {
                            requestFocus = view.requestFocus(valueOf.intValue(), D);
                        } else if (D != null) {
                            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, D, valueOf.intValue());
                            requestFocus = findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(valueOf.intValue(), D) : view.requestFocus(valueOf.intValue(), D);
                        } else {
                            View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, valueOf.intValue());
                            requestFocus = findNextFocus != null ? findNextFocus.requestFocus(valueOf.intValue()) : view.requestFocus(valueOf.intValue());
                        }
                    } else {
                        requestFocus = view.requestFocus(valueOf.intValue(), D);
                    }
                    if (requestFocus) {
                        return Boolean.TRUE;
                    }
                }
                if (!((androidx.compose.ui.focus.a) c0997t.getFocusOwner()).a(i3, false, false)) {
                    return Boolean.TRUE;
                }
                Boolean c4 = ((androidx.compose.ui.focus.a) c0997t.getFocusOwner()).c(i3, null, new C0990p(aVar, 0));
                return Boolean.valueOf(c4 != null ? c4.booleanValue() : true);
            default:
                Y1.a aVar2 = (Y1.a) obj;
                C0997t c0997t2 = this.f8396f;
                Handler handler = c0997t2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar2.b();
                } else {
                    Handler handler2 = c0997t2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new E.u(8, aVar2));
                    }
                }
                return L1.z.f2729a;
        }
    }
}
