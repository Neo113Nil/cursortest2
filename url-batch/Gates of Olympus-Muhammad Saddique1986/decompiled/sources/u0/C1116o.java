package u0;

import a0.C0239d;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import l0.C0591a;
import q2.InterfaceC0835w;

/* renamed from: u0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116o extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1123s f9414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1116o(C1123s c1123s, int i3) {
        super(1);
        this.f9413e = i3;
        this.f9414f = c1123s;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        Z.b bVar;
        switch (this.f9413e) {
            case 0:
                KeyEvent keyEvent = ((l0.b) obj).f6574a;
                C1123s c1123s = this.f9414f;
                c1123s.getClass();
                long y3 = l0.c.y(keyEvent);
                if (C0591a.a(y3, C0591a.f6566h)) {
                    bVar = new Z.b(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (C0591a.a(y3, C0591a.f6564f)) {
                    bVar = new Z.b(4);
                } else if (C0591a.a(y3, C0591a.f6563e)) {
                    bVar = new Z.b(3);
                } else {
                    bVar = C0591a.a(y3, C0591a.f6561c) ? true : C0591a.a(y3, C0591a.f6569k) ? new Z.b(5) : C0591a.a(y3, C0591a.f6562d) ? true : C0591a.a(y3, C0591a.f6570l) ? new Z.b(6) : C0591a.a(y3, C0591a.f6565g) ? true : C0591a.a(y3, C0591a.f6567i) ? true : C0591a.a(y3, C0591a.f6571m) ? new Z.b(7) : C0591a.a(y3, C0591a.f6560b) ? true : C0591a.a(y3, C0591a.f6568j) ? new Z.b(8) : null;
                }
                if (bVar == null || !AbstractC0508a.y(l0.c.z(keyEvent), 2)) {
                    return Boolean.FALSE;
                }
                C0239d w2 = c1123s.w();
                Z.h focusOwner = c1123s.getFocusOwner();
                C1114n c1114n = new C1114n(bVar, 1);
                int i3 = bVar.f4666a;
                Boolean c2 = ((androidx.compose.ui.focus.b) focusOwner).c(i3, w2, c1114n);
                if (c2 != null ? c2.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!(Z.b.a(i3, 1) ? true : Z.b.a(i3, 2))) {
                    return Boolean.FALSE;
                }
                Integer J3 = Z.d.J(i3);
                if (J3 == null) {
                    throw new IllegalStateException("Invalid focus direction");
                }
                int intValue = J3.intValue();
                Rect B3 = w2 != null ? b0.M.B(w2) : null;
                if (B3 == null) {
                    throw new IllegalStateException("Invalid rect");
                }
                View view = c1123s;
                while (true) {
                    if (view != null) {
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = c1123s.getRootView();
                        f2.j.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                        if (view != null) {
                            if (!view.equals(c1123s)) {
                                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                    if (parent == c1123s) {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        view = null;
                    }
                }
                if (f2.j.a(view, c1123s)) {
                    view = null;
                }
                if (view != null && Z.d.E(view, Integer.valueOf(intValue), B3)) {
                    return Boolean.TRUE;
                }
                if (!((androidx.compose.ui.focus.b) c1123s.getFocusOwner()).a(i3, false, false)) {
                    return Boolean.TRUE;
                }
                Boolean c3 = ((androidx.compose.ui.focus.b) c1123s.getFocusOwner()).c(i3, null, new C1114n(bVar, 0));
                return Boolean.valueOf(c3 != null ? c3.booleanValue() : true);
            case 1:
                InterfaceC0422a interfaceC0422a = (InterfaceC0422a) obj;
                C1123s c1123s2 = this.f9414f;
                Handler handler = c1123s2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC0422a.b();
                } else {
                    Handler handler2 = c1123s2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new R0.y(interfaceC0422a, 1));
                    }
                }
                return R1.y.f4171a;
            default:
                C1123s c1123s3 = this.f9414f;
                return new S(c1123s3, c1123s3.getTextInputService(), (InterfaceC0835w) obj);
        }
    }
}
