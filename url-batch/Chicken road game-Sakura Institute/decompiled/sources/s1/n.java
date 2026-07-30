package s1;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f8290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, int i7) {
        super(1);
        this.f8289g = i7;
        this.f8290h = rVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        x0.b bVar;
        switch (this.f8289g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                KeyEvent keyEvent = ((j1.b) obj).f4986a;
                long Y = j1.c.Y(keyEvent);
                if (j1.a.a(Y, j1.a.f4978h)) {
                    bVar = new x0.b(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (j1.a.a(Y, j1.a.f4976f)) {
                    bVar = new x0.b(4);
                } else if (j1.a.a(Y, j1.a.f4975e)) {
                    bVar = new x0.b(3);
                } else {
                    bVar = j1.a.a(Y, j1.a.f4973c) ? true : j1.a.a(Y, j1.a.f4981k) ? new x0.b(5) : j1.a.a(Y, j1.a.f4974d) ? true : j1.a.a(Y, j1.a.f4982l) ? new x0.b(6) : j1.a.a(Y, j1.a.f4977g) ? true : j1.a.a(Y, j1.a.f4979i) ? true : j1.a.a(Y, j1.a.f4983m) ? new x0.b(7) : j1.a.a(Y, j1.a.f4972b) ? true : j1.a.a(Y, j1.a.f4980j) ? new x0.b(8) : null;
                }
                if (bVar != null) {
                    int i7 = bVar.f9595a;
                    if (j1.c.e0(keyEvent) == 2) {
                        r rVar = this.f8290h;
                        y0.d v5 = rVar.v();
                        Boolean c4 = ((androidx.compose.ui.focus.b) rVar.getFocusOwner()).c(i7, v5, new m(bVar, 5));
                        if (c4 != null ? c4.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i7 == 1 || i7 == 2)) {
                            return Boolean.FALSE;
                        }
                        Integer I = x0.d.I(i7);
                        if (I == null) {
                            throw new IllegalStateException("Invalid focus direction");
                        }
                        int intValue = I.intValue();
                        Rect u8 = v5 != null ? z0.l0.u(v5) : null;
                        if (u8 == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        View view = rVar;
                        while (true) {
                            if (view != null) {
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View rootView = rVar.getRootView();
                                r6.k.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                                if (view != null) {
                                    if (!view.equals(rVar)) {
                                        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                            if (parent == rVar) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                view = null;
                            }
                        }
                        if (r6.k.a(view, rVar)) {
                            view = null;
                        }
                        if (view != null && x0.d.D(view, Integer.valueOf(intValue), u8)) {
                            return Boolean.TRUE;
                        }
                        if (!((androidx.compose.ui.focus.b) rVar.getFocusOwner()).a(i7, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean c6 = ((androidx.compose.ui.focus.b) rVar.getFocusOwner()).c(i7, null, new m(bVar, 4));
                        return Boolean.valueOf(c6 != null ? c6.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 1:
                q6.a aVar = (q6.a) obj;
                r rVar2 = this.f8290h;
                Handler handler = rVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.a();
                } else {
                    Handler handler2 = rVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new p2.t(aVar, 1));
                    }
                }
                return d6.z.f2639a;
            default:
                r rVar3 = this.f8290h;
                return new p0(rVar3, rVar3.getTextInputService(), (c7.x) obj);
        }
    }
}
