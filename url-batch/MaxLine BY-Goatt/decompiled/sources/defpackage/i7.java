package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i7 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ t7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7(t7 t7Var, int i) {
        super(1);
        this.m = i;
        this.n = t7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fo0 fo0Var;
        int i = this.m;
        boolean z = false;
        t7 t7Var = this.n;
        switch (i) {
            case 0:
                int i2 = ((v21) obj).a;
                if (i2 == 1) {
                    z = t7Var.isInTouchMode();
                } else if (i2 == 2) {
                    z = t7Var.isInTouchMode() ? t7Var.requestFocusFromTouch() : true;
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent = ((x71) obj).a;
                long x = z71.x(keyEvent);
                if (w71.a(x, w71.c)) {
                    fo0Var = new fo0(2);
                } else if (w71.a(x, w71.d)) {
                    fo0Var = new fo0(1);
                } else if (w71.a(x, w71.j)) {
                    fo0Var = new fo0(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    fo0Var = w71.a(x, w71.h) ? new fo0(4) : w71.a(x, w71.g) ? new fo0(3) : (w71.a(x, w71.e) || w71.a(x, w71.m)) ? new fo0(5) : (w71.a(x, w71.f) || w71.a(x, w71.n)) ? new fo0(6) : (w71.a(x, w71.i) || w71.a(x, w71.k) || w71.a(x, w71.o)) ? new fo0(7) : (w71.a(x, w71.b) || w71.a(x, w71.l)) ? new fo0(8) : null;
                }
                if (fo0Var != null) {
                    int i3 = fo0Var.a;
                    if (z71.D(keyEvent) == 2) {
                        Integer V = ll3.V(i3);
                        w72 embeddedViewFocusRect = t7Var.getEmbeddedViewFocusRect();
                        Boolean e = ((po0) t7Var.getFocusOwner()).e(i3, embeddedViewFocusRect, new n7(fo0Var, 1));
                        if (e != null ? e.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (i3 != 1 && i3 != 2) {
                            return Boolean.FALSE;
                        }
                        if (V != null) {
                            int intValue = V.intValue();
                            Object obj2 = io0.f.get();
                            obj2.getClass();
                            io0 io0Var = (io0) obj2;
                            View view = t7Var;
                            while (true) {
                                if (view != null) {
                                    View rootView = t7Var.getRootView();
                                    rootView.getClass();
                                    view = io0Var.b(intValue, view, (ViewGroup) rootView);
                                    if (view != null) {
                                        if (!view.equals(t7Var)) {
                                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == t7Var) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    view = null;
                                }
                            }
                            if (Intrinsics.b(view, t7Var)) {
                                view = null;
                            }
                            if (view != null) {
                                Rect I = embeddedViewFocusRect != null ? bd3.I(embeddedViewFocusRect) : null;
                                if (I == null) {
                                    lh.g("Invalid rect");
                                    return null;
                                }
                                View rootView2 = t7Var.getRootView();
                                rootView2.getClass();
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(t7Var, I);
                                viewGroup.offsetRectIntoDescendantCoords(view, I);
                                if (ll3.T(view, V, I)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((po0) t7Var.getFocusOwner()).b(i3, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean e2 = ((po0) t7Var.getFocusOwner()).e(i3, null, new n7(fo0Var, 0));
                        return Boolean.valueOf(e2 != null ? e2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 2:
                Function0 function0 = (Function0) obj;
                Handler handler = t7Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = t7Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new n4(1, function0));
                    }
                }
                return Unit.a;
            default:
                return new ua(t7Var, t7Var.getTextInputService(), (a50) obj);
        }
    }
}
