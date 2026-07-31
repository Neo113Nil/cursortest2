package A2;

import e2.AbstractC0381e;
import e2.C0379c;
import e2.C0380d;
import h0.C0417A;
import h0.C0429j;
import h1.C0438i;
import h2.AbstractC0447i;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0577B;
import m.InterfaceC0576A;
import m.InterfaceC0608s;

/* loaded from: classes.dex */
public final class n implements InterfaceC0608s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f118a;

    public n(int i3) {
        switch (i3) {
            case 1:
                this.f118a = new ArrayList();
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f118a = new ArrayList(32);
                break;
            default:
                this.f118a = new ArrayList(20);
                break;
        }
    }

    public void a(String str, String str2) {
        Z1.i.f(str, "name");
        Z1.i.f(str2, "value");
        ArrayList arrayList = this.f118a;
        arrayList.add(str);
        arrayList.add(AbstractC0447i.H0(str2).toString());
    }

    public o b() {
        return new o((String[]) this.f118a.toArray(new String[0]));
    }

    public void c() {
        this.f118a.add(C0429j.f4999c);
    }

    public void d(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f118a.add(new h0.k(f3, f4, f5, f6, f7, f8));
    }

    public void e(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f118a.add(new h0.s(f3, f4, f5, f6, f7, f8));
    }

    public void f(float f3) {
        this.f118a.add(new h0.l(f3));
    }

    public void g(float f3) {
        this.f118a.add(new h0.t(f3));
    }

    @Override // m.InterfaceC0608s
    public InterfaceC0576A get(int i3) {
        return (C0577B) this.f118a.get(i3);
    }

    public void h(float f3, float f4) {
        this.f118a.add(new h0.m(f3, f4));
    }

    public void i(float f3, float f4) {
        this.f118a.add(new h0.u(f3, f4));
    }

    public void j(float f3, float f4) {
        this.f118a.add(new h0.n(f3, f4));
    }

    public void k(String str) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f118a;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i3))) {
                arrayList.remove(i3);
                arrayList.remove(i3);
                i3 -= 2;
            }
            i3 += 2;
        }
    }

    public void l(float f3) {
        this.f118a.add(new C0417A(f3));
    }

    public void m(float f3) {
        this.f118a.add(new h0.z(f3));
    }

    public n(float f3, float f4, m.r rVar) {
        C0380d Q2 = AbstractC0381e.Q(0, rVar.b());
        ArrayList arrayList = new ArrayList(M1.n.g0(Q2, 10));
        Iterator it = Q2.iterator();
        while (((C0379c) it).f4773f) {
            arrayList.add(new C0577B(f3, f4, rVar.a(((M1.A) it).a())));
        }
        this.f118a = arrayList;
    }
}
