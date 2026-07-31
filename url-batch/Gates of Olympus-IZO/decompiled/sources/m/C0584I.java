package m;

import I.X0;
import a1.AbstractC0172j;
import a1.AbstractC0179q;
import android.content.Context;
import android.view.View;
import h1.C0438i;
import java.util.Iterator;
import java.util.List;
import q1.C0784h;
import r1.C0857i;

/* renamed from: m.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584I implements I.I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5588c;

    public /* synthetic */ C0584I(Object obj, int i3, Object obj2) {
        this.f5586a = i3;
        this.f5587b = obj;
        this.f5588c = obj2;
    }

    @Override // I.I
    public final void a() {
        Object obj = this.f5588c;
        Object obj2 = this.f5587b;
        switch (this.f5586a) {
            case 0:
                ((C0583H) obj2).f5582a.n((C0580E) obj);
                break;
            case 1:
                ((s0) obj2).f5850j.remove((s0) obj);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                s0 s0Var = (s0) obj2;
                s0Var.getClass();
                k0 k0Var = (k0) ((l0) obj).f5800b.getValue();
                if (k0Var != null) {
                    s0Var.f5849i.remove(k0Var.f5795d);
                    break;
                }
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                r.V v3 = (r.V) obj2;
                int i3 = v3.f7046s - 1;
                v3.f7046s = i3;
                if (i3 == 0) {
                    int i4 = AbstractC0179q.f3561a;
                    View view = (View) obj;
                    AbstractC0172j.u(view, null);
                    AbstractC0179q.a(view, null);
                    view.removeOnAttachStateChangeListener(v3.f7047t);
                    break;
                }
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                ((C0784h) obj2).f6901k.f((r1.m) obj);
                break;
            case 5:
                Iterator it = ((List) ((X0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((C0857i) obj).b().b((C0784h) it.next());
                }
                break;
            case 6:
                ((u.P) obj2).f8033c.add(obj);
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((u0.N) obj);
                break;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((u0.O) obj);
                break;
        }
    }
}
