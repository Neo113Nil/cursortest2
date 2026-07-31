package G2;

import S1.A;
import h0.C0448A;
import h0.C0467j;
import h0.C0468k;
import h0.C0470m;
import h0.C0471n;
import h0.C0476s;
import h0.z;
import java.util.ArrayList;
import java.util.Iterator;
import k2.C0571c;
import k2.C0572d;
import m.C0606B;
import m.InterfaceC0605A;
import m.InterfaceC0633s;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class k implements InterfaceC0633s {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2203d;

    public k(int i3) {
        switch (i3) {
            case 1:
                this.f2203d = new ArrayList();
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2203d = new ArrayList(32);
                break;
            default:
                this.f2203d = new ArrayList(20);
                break;
        }
    }

    public void a(String str, String str2) {
        f2.j.f(str, "name");
        f2.j.f(str2, "value");
        ArrayList arrayList = this.f2203d;
        arrayList.add(str);
        arrayList.add(AbstractC0730j.Y(str2).toString());
    }

    public l b() {
        return new l((String[]) this.f2203d.toArray(new String[0]));
    }

    public void c() {
        this.f2203d.add(C0467j.f5990c);
    }

    public void d(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f2203d.add(new C0468k(f3, f4, f5, f6, f7, f8));
    }

    public void e(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f2203d.add(new C0476s(f3, f4, f5, f6, f7, f8));
    }

    public void f(float f3) {
        this.f2203d.add(new h0.t(f3));
    }

    public void g(float f3, float f4) {
        this.f2203d.add(new C0470m(f3, f4));
    }

    @Override // m.InterfaceC0633s
    public InterfaceC0605A get(int i3) {
        return (C0606B) this.f2203d.get(i3);
    }

    public void h(float f3, float f4) {
        this.f2203d.add(new h0.u(f3, f4));
    }

    public void i(float f3, float f4) {
        this.f2203d.add(new C0471n(f3, f4));
    }

    public void j(String str) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f2203d;
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

    public void k(float f3) {
        this.f2203d.add(new C0448A(f3));
    }

    public void l(float f3) {
        this.f2203d.add(new z(f3));
    }

    public k(float f3, float f4, m.r rVar) {
        C0572d g02 = O2.d.g0(0, rVar.b());
        ArrayList arrayList = new ArrayList(S1.n.E0(g02, 10));
        Iterator it = g02.iterator();
        while (((C0571c) it).f6424f) {
            arrayList.add(new C0606B(f3, f4, rVar.a(((A) it).a())));
        }
        this.f2203d = arrayList;
    }
}
