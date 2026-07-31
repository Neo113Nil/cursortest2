package x1;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f8525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(t tVar, int i) {
        super(1);
        this.f8524e = i;
        this.f8525f = tVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        d1.b bVar;
        boolean requestFocus;
        switch (this.f8524e) {
            case 0:
                KeyEvent keyEvent = ((o1.b) obj).f5597a;
                long c8 = h0.a.c(keyEvent.getKeyCode());
                if (o1.a.a(c8, o1.a.f5583b)) {
                    bVar = new d1.b(2);
                } else if (o1.a.a(c8, o1.a.f5584c)) {
                    bVar = new d1.b(1);
                } else if (o1.a.a(c8, o1.a.i)) {
                    bVar = new d1.b(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    bVar = o1.a.a(c8, o1.a.f5588g) ? new d1.b(4) : o1.a.a(c8, o1.a.f5587f) ? new d1.b(3) : (o1.a.a(c8, o1.a.f5585d) || o1.a.a(c8, o1.a.f5593m)) ? new d1.b(5) : (o1.a.a(c8, o1.a.f5586e) || o1.a.a(c8, o1.a.f5594n)) ? new d1.b(6) : (o1.a.a(c8, o1.a.f5589h) || o1.a.a(c8, o1.a.f5591k) || o1.a.a(c8, o1.a.f5595o)) ? new d1.b(7) : (o1.a.a(c8, o1.a.f5582a) || o1.a.a(c8, o1.a.f5592l)) ? new d1.b(8) : null;
                }
                if (bVar != null) {
                    int i = bVar.f2057a;
                    if (m.a.E(keyEvent) == 2) {
                        Integer num = i == 5 ? 33 : i == 6 ? 130 : i == 3 ? 17 : i == 4 ? 66 : i == 1 ? 2 : i == 2 ? 1 : null;
                        t tVar = this.f8525f;
                        e1.c embeddedViewFocusRect = tVar.getEmbeddedViewFocusRect();
                        Boolean e8 = ((d1.i) tVar.getFocusOwner()).e(i, embeddedViewFocusRect, new o(bVar, 1));
                        if (e8 != null ? e8.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i == 1 || i == 2)) {
                            return Boolean.FALSE;
                        }
                        if (num != null) {
                            int intValue = num.intValue();
                            Object obj2 = g1.f8414f.get();
                            q6.i.b(obj2);
                            g1 g1Var = (g1) obj2;
                            View view = tVar;
                            while (true) {
                                if (view != null) {
                                    View rootView = tVar.getRootView();
                                    q6.i.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    view = g1Var.b(intValue, view, (ViewGroup) rootView);
                                    if (view != null) {
                                        if (!view.equals(tVar)) {
                                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == tVar) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    view = null;
                                }
                            }
                            if (q6.i.a(view, tVar)) {
                                view = null;
                            }
                            if (view != null) {
                                Rect s5 = embeddedViewFocusRect != null ? f1.p.s(embeddedViewFocusRect) : null;
                                if (s5 == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                View rootView2 = tVar.getRootView();
                                q6.i.c(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(tVar, s5);
                                viewGroup.offsetRectIntoDescendantCoords(view, s5);
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup2 = (ViewGroup) view;
                                    if (viewGroup2.isFocused()) {
                                        requestFocus = true;
                                    } else if (viewGroup2.isFocusable() && !viewGroup2.hasFocus()) {
                                        requestFocus = viewGroup2.requestFocus(num.intValue(), s5);
                                    } else if (view instanceof t) {
                                        requestFocus = ((t) view).requestFocus(num.intValue(), s5);
                                    } else {
                                        View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup2, s5, num.intValue());
                                        int intValue2 = num.intValue();
                                        requestFocus = findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(intValue2, s5) : viewGroup2.requestFocus(intValue2, s5);
                                    }
                                } else {
                                    requestFocus = view.requestFocus(num.intValue(), s5);
                                }
                                if (requestFocus) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((d1.i) tVar.getFocusOwner()).b(i, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean e9 = ((d1.i) tVar.getFocusOwner()).e(i, null, new o(bVar, 0));
                        return Boolean.valueOf(e9 != null ? e9.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            default:
                p6.a aVar = (p6.a) obj;
                t tVar2 = this.f8525f;
                Handler handler = tVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.b();
                } else {
                    Handler handler2 = tVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new s(aVar, 0));
                    }
                }
                return c6.m.f1757a;
        }
    }
}
