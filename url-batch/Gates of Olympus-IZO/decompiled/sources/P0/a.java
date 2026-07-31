package P0;

import I.I;
import b.InterfaceC0243c;
import h1.C0438i;
import java.util.Iterator;
import m.s0;
import u.C0921C;
import u.C0925G;
import u.C0950s;
import u0.C0967d0;
import u0.Z0;

/* loaded from: classes.dex */
public final class a implements I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3022b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f3021a = i3;
        this.f3022b = obj;
    }

    @Override // I.I
    public final void a() {
        switch (this.f3021a) {
            case 0:
                q qVar = (q) this.f3022b;
                qVar.dismiss();
                n nVar = qVar.f3064j;
                Z0 z02 = nVar.f8280f;
                if (z02 != null) {
                    z02.c();
                }
                nVar.f8280f = null;
                nVar.requestLayout();
                break;
            case 1:
                Iterator it = ((c.f) this.f3022b).f4201b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0243c) it.next()).cancel();
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                s0 s0Var = (s0) this.f3022b;
                s0Var.i();
                s0Var.f5841a.e();
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0950s) this.f3022b).f8088d = null;
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                ((C0925G) this.f3022b).f8010c = null;
                break;
            case 5:
                C0921C c0921c = (C0921C) this.f3022b;
                int g3 = c0921c.f8002d.g();
                for (int i3 = 0; i3 < g3; i3++) {
                    c0921c.b();
                }
                break;
            default:
                ((C0967d0) this.f3022b).f8319a.b();
                break;
        }
    }
}
