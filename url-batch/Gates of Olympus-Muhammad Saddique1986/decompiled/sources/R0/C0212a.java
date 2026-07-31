package R0;

import B.a0;
import I.H;
import androidx.lifecycle.P;
import b.InterfaceC0307c;
import java.util.Iterator;
import t.C0971A;
import u0.C1107j0;
import u0.k1;

/* renamed from: R0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212a implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4061b;

    public /* synthetic */ C0212a(int i3, Object obj) {
        this.f4060a = i3;
        this.f4061b = obj;
    }

    @Override // I.H
    public final void a() {
        switch (this.f4060a) {
            case 0:
                x xVar = (x) this.f4061b;
                xVar.dismiss();
                u uVar = xVar.f4132j;
                k1 k1Var = uVar.f9300f;
                if (k1Var != null) {
                    k1Var.c();
                }
                uVar.f9300f = null;
                uVar.requestLayout();
                break;
            case 1:
                A a3 = (A) this.f4061b;
                k1 k1Var2 = a3.f9300f;
                if (k1Var2 != null) {
                    k1Var2.c();
                }
                a3.f9300f = null;
                a3.requestLayout();
                P.k(a3, null);
                a3.f4045q.removeViewImmediate(a3);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                Iterator it = ((c.f) this.f4061b).f5338b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0307c) it.next()).cancel();
                }
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((t.q) this.f4061b).f8500d = null;
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ((C0971A) this.f4061b).f8421c = null;
                break;
            case 5:
                t.w wVar = (t.w) this.f4061b;
                int g3 = wVar.f8520d.g();
                for (int i3 = 0; i3 < g3; i3++) {
                    wVar.b();
                }
                break;
            case 6:
                ((C1107j0) this.f4061b).f9378a.b();
                break;
            default:
                ((a0) this.f4061b).k();
                break;
        }
    }
}
