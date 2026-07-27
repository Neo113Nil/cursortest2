package s0;

import W2.InterfaceC0302y;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i0.C0675a;
import j0.C0706a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155m extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1166s f10264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1155m(C1166s c1166s, int i2) {
        super(1);
        this.f10263d = i2;
        this.f10264e = c1166s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        X.b bVar;
        switch (this.f10263d) {
            case 0:
                int i2 = ((C0675a) obj).f7000a;
                boolean z4 = false;
                boolean z5 = i2 == 1;
                C1166s c1166s = this.f10264e;
                if (z5) {
                    z4 = c1166s.isInTouchMode();
                } else if (i2 == 2) {
                    z4 = c1166s.isInTouchMode() ? c1166s.requestFocusFromTouch() : true;
                }
                return Boolean.valueOf(z4);
            case 1:
                KeyEvent keyEvent = ((j0.b) obj).f7136a;
                C1166s c1166s2 = this.f10264e;
                c1166s2.getClass();
                long A4 = j0.c.A(keyEvent);
                if (C0706a.a(A4, C0706a.f7128h)) {
                    bVar = new X.b(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (C0706a.a(A4, C0706a.f7126f)) {
                    bVar = new X.b(4);
                } else if (C0706a.a(A4, C0706a.f7125e)) {
                    bVar = new X.b(3);
                } else {
                    bVar = C0706a.a(A4, C0706a.f7123c) ? true : C0706a.a(A4, C0706a.f7131k) ? new X.b(5) : C0706a.a(A4, C0706a.f7124d) ? true : C0706a.a(A4, C0706a.f7132l) ? new X.b(6) : C0706a.a(A4, C0706a.f7127g) ? true : C0706a.a(A4, C0706a.f7129i) ? true : C0706a.a(A4, C0706a.f7133m) ? new X.b(7) : C0706a.a(A4, C0706a.f7122b) ? true : C0706a.a(A4, C0706a.f7130j) ? new X.b(8) : null;
                }
                if (bVar == null || !j0.c.w(j0.c.C(keyEvent), 2)) {
                    return Boolean.FALSE;
                }
                Y.d v4 = c1166s2.v();
                X.h focusOwner = c1166s2.getFocusOwner();
                C1159o c1159o = new C1159o(bVar, 1);
                int i4 = bVar.f4312a;
                Boolean c4 = ((androidx.compose.ui.focus.b) focusOwner).c(i4, v4, c1159o);
                if (c4 != null ? c4.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!(X.b.a(i4, 1) ? true : X.b.a(i4, 2))) {
                    return Boolean.FALSE;
                }
                Integer J3 = X.d.J(i4);
                if (J3 == null) {
                    throw new IllegalStateException("Invalid focus direction");
                }
                int intValue = J3.intValue();
                Rect B = v4 != null ? Z.K.B(v4) : null;
                if (B == null) {
                    throw new IllegalStateException("Invalid rect");
                }
                View view = c1166s2;
                while (true) {
                    if (view != null) {
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = c1166s2.getRootView();
                        Intrinsics.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                        if (view != null) {
                            if (!view.equals(c1166s2)) {
                                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                    if (parent == c1166s2) {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        view = null;
                    }
                }
                if (Intrinsics.a(view, c1166s2)) {
                    view = null;
                }
                if ((view == null || !X.d.E(view, Integer.valueOf(intValue), B)) && ((androidx.compose.ui.focus.b) c1166s2.getFocusOwner()).a(i4, false, false)) {
                    Boolean c5 = ((androidx.compose.ui.focus.b) c1166s2.getFocusOwner()).c(i4, null, new C1159o(bVar, 0));
                    return Boolean.valueOf(c5 != null ? c5.booleanValue() : true);
                }
                return Boolean.TRUE;
            case 2:
                Function0 function0 = (Function0) obj;
                C1166s c1166s3 = this.f10264e;
                Handler handler = c1166s3.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = c1166s3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new P0.z(function0, 1));
                    }
                }
                return Unit.f7487a;
            default:
                C1166s c1166s4 = this.f10264e;
                return new Q(c1166s4, c1166s4.getTextInputService(), (InterfaceC0302y) obj);
        }
    }
}
