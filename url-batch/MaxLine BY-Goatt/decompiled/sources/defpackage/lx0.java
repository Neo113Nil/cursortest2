package defpackage;

import java.util.ArrayList;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lx0 implements td {
    public final ArrayList m;

    public lx0(float f, float f2, sd sdVar) {
        IntRange f3 = d.f(0, sdVar.b());
        ArrayList arrayList = new ArrayList(rv.l(f3, 10));
        t31 it = f3.iterator();
        while (it.o) {
            arrayList.add(new um0(f, f2, sdVar.a(it.nextInt())));
        }
        this.m = arrayList;
    }

    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = this.m;
        arrayList.add(str);
        arrayList.add(up2.K(str2).toString());
    }

    public void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.length() <= 0) {
            lh.e("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                lh.c(n33.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                return;
            }
        }
        a(str, str2);
    }

    public mx0 c() {
        return new mx0((String[]) this.m.toArray(new String[0]));
    }

    public void d() {
        this.m.add(tz1.c);
    }

    public void e(float f, float f2, float f3, float f4, float f5, float f6) {
        this.m.add(new uz1(f, f2, f3, f4, f5, f6));
    }

    public void f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.m.add(new c02(f, f2, f3, f4, f5, f6));
    }

    public void g(float f) {
        this.m.add(new vz1(f));
    }

    @Override // defpackage.td
    public tm0 get(int i) {
        return (um0) this.m.get(i);
    }

    public void h(float f) {
        this.m.add(new d02(f));
    }

    public void i(float f, float f2) {
        this.m.add(new wz1(f, f2));
    }

    public void j(float f, float f2) {
        this.m.add(new e02(f, f2));
    }

    public void k(float f, float f2) {
        this.m.add(new xz1(f, f2));
    }

    public void l(float f, float f2, float f3, float f4) {
        this.m.add(new zz1(f, f2, f3, f4));
    }

    public void m(float f, float f2, float f3, float f4) {
        this.m.add(new h02(f, f2, f3, f4));
    }

    public void n(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void o(float f) {
        this.m.add(new k02(f));
    }

    public void p(float f) {
        this.m.add(new j02(f));
    }

    public lx0(int i) {
        switch (i) {
            case 1:
                this.m = new ArrayList(32);
                break;
            default:
                this.m = new ArrayList(20);
                break;
        }
    }
}
