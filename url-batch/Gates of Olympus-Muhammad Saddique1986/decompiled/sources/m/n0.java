package m;

import I.InterfaceC0142c0;
import I.W0;
import android.content.Context;
import android.view.View;
import c1.AbstractC0388l;
import c1.AbstractC0394s;
import java.util.Iterator;
import java.util.List;
import t1.C1028h;

/* loaded from: classes.dex */
public final class n0 implements I.H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6858c;

    public /* synthetic */ n0(Object obj, int i3, Object obj2) {
        this.f6856a = i3;
        this.f6857b = obj;
        this.f6858c = obj2;
    }

    @Override // I.H
    public final void a() {
        Object obj = this.f6858c;
        Object obj2 = this.f6857b;
        switch (this.f6856a) {
            case 0:
                ((l0) obj2).f6845j.remove((l0) obj);
                break;
            case 1:
                l0 l0Var = (l0) obj2;
                l0Var.getClass();
                e0 e0Var = (e0) ((f0) obj).f6794b.getValue();
                if (e0Var != null) {
                    l0Var.f6844i.remove(e0Var.f6784d);
                    break;
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((l0) obj2).f6844i.remove((i0) obj);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                r.Y y3 = (r.Y) obj2;
                int i3 = y3.f8021s - 1;
                y3.f8021s = i3;
                if (i3 == 0) {
                    int i4 = AbstractC0394s.f5610a;
                    View view = (View) obj;
                    AbstractC0388l.u(view, null);
                    AbstractC0394s.a(view, null);
                    view.removeOnAttachStateChangeListener(y3.f8022t);
                    break;
                }
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ((t.I) obj2).f8444c.add(obj);
                break;
            case 5:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((u0.N) obj);
                break;
            case 6:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((u0.O) obj);
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C1028h) obj2).f8880k.f((u1.m) obj);
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                Iterator it = ((List) ((W0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((u1.i) obj).b().b((C1028h) it.next());
                }
                break;
            default:
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) obj2;
                q.m mVar = (q.m) interfaceC0142c0.getValue();
                if (mVar != null) {
                    q.l lVar = new q.l(mVar);
                    q.k kVar = (q.k) obj;
                    if (kVar != null) {
                        kVar.c(lVar);
                    }
                    interfaceC0142c0.setValue(null);
                    break;
                }
                break;
        }
    }
}
