package l;

import G.InterfaceC0191c0;
import G.X0;
import a1.AbstractC0397l;
import a1.AbstractC0404s;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import p.C0935k;
import p.C0936l;
import p.C0937m;
import s.C1092H;
import s0.ComponentCallbacks2C1127M;
import s0.ComponentCallbacks2C1128N;
import s1.C1193i;

/* loaded from: classes.dex */
public final class o0 implements G.H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7822c;

    public /* synthetic */ o0(Object obj, int i2, Object obj2) {
        this.f7820a = i2;
        this.f7821b = obj;
        this.f7822c = obj2;
    }

    @Override // G.H
    public final void a() {
        Object obj = this.f7822c;
        Object obj2 = this.f7821b;
        switch (this.f7820a) {
            case 0:
                ((m0) obj2).f7809j.remove((m0) obj);
                break;
            case 1:
                m0 m0Var = (m0) obj2;
                m0Var.getClass();
                f0 f0Var = (f0) ((g0) obj).f7763b.getValue();
                if (f0Var != null) {
                    m0Var.f7808i.remove(f0Var.f7751d);
                    break;
                }
                break;
            case 2:
                ((m0) obj2).f7808i.remove((j0) obj);
                break;
            case 3:
                q.o0 o0Var = (q.o0) obj2;
                int i2 = o0Var.f9316s - 1;
                o0Var.f9316s = i2;
                if (i2 == 0) {
                    int i4 = AbstractC0404s.f4892a;
                    View view = (View) obj;
                    AbstractC0397l.u(view, null);
                    AbstractC0404s.a(view, null);
                    view.removeOnAttachStateChangeListener(o0Var.f9317t);
                    break;
                }
                break;
            case 4:
                ((C1092H) obj2).f9896c.add(obj);
                break;
            case 5:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C1127M) obj);
                break;
            case 6:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C1128N) obj);
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C1193i) obj2).f10516n.f((t1.m) obj);
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                Iterator it = ((List) ((X0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((t1.i) obj).b().b((C1193i) it.next());
                }
                break;
            default:
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) obj2;
                C0937m c0937m = (C0937m) interfaceC0191c0.getValue();
                if (c0937m != null) {
                    C0936l c0936l = new C0936l(c0937m);
                    C0935k c0935k = (C0935k) obj;
                    if (c0935k != null) {
                        c0935k.c(c0936l);
                    }
                    interfaceC0191c0.setValue(null);
                    break;
                }
                break;
        }
    }
}
