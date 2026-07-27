package G;

import f0.C0570A;
import f0.C0589j;
import f0.C0590k;
import f0.C0591l;
import f0.C0592m;
import f0.C0593n;
import f0.C0598s;
import f0.C0599t;
import j2.InterfaceC0714d;
import java.util.AbstractMap;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l.AbstractC0792s;
import l.C0757B;
import l.InterfaceC0756A;
import l.InterfaceC0793t;
import z2.C1442z;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0714d, InterfaceC0793t {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2781d;

    public W0(int i2) {
        switch (i2) {
            case 1:
                this.f2781d = new ArrayList(32);
                break;
            case 4:
                this.f2781d = new ArrayList(20);
                break;
            default:
                this.f2781d = new ArrayList();
                break;
        }
    }

    public void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = this.f2781d;
        arrayList.add(name);
        arrayList.add(kotlin.text.y.M(value).toString());
    }

    public m3.l b() {
        return new m3.l((String[]) this.f2781d.toArray(new String[0]));
    }

    public void c() {
        this.f2781d.add(C0589j.f6414c);
    }

    public void d(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f2781d.add(new C0590k(f4, f5, f6, f7, f8, f9));
    }

    public void e(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f2781d.add(new C0598s(f4, f5, f6, f7, f8, f9));
    }

    public void f(float f4) {
        this.f2781d.add(new C0591l(f4));
    }

    public void g(float f4) {
        this.f2781d.add(new C0599t(f4));
    }

    @Override // l.InterfaceC0793t
    public InterfaceC0756A get(int i2) {
        return (C0757B) this.f2781d.get(i2);
    }

    public void h(float f4, float f5) {
        this.f2781d.add(new C0592m(f4, f5));
    }

    public void i(float f4, float f5) {
        this.f2781d.add(new f0.u(f4, f5));
    }

    public void j(float f4, float f5) {
        this.f2781d.add(new C0593n(f4, f5));
    }

    @Override // j2.InterfaceC0714d
    public Object k(g2.e eVar, Object obj, Object obj2) {
        this.f2781d.add(new AbstractMap.SimpleImmutableEntry(eVar, obj));
        return null;
    }

    public void l(float f4, float f5, float f6, float f7) {
        this.f2781d.add(new f0.x(f4, f5, f6, f7));
    }

    public void m(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2781d;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (name.equalsIgnoreCase((String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
    }

    public void n(float f4) {
        this.f2781d.add(new C0570A(f4));
    }

    public void o(float f4) {
        this.f2781d.add(new f0.z(f4));
    }

    public W0(ArrayList arrayList) {
        this.f2781d = arrayList;
    }

    public W0(float f4, float f5, AbstractC0792s abstractC0792s) {
        IntRange h4 = kotlin.ranges.b.h(0, abstractC0792s.b());
        ArrayList arrayList = new ArrayList(C1442z.h(h4, 10));
        R2.b it = h4.iterator();
        while (it.f3947i) {
            arrayList.add(new C0757B(f4, f5, abstractC0792s.a(it.b())));
        }
        this.f2781d = arrayList;
    }
}
