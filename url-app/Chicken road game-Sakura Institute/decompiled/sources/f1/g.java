package f1;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements e6.x, l.r, o5.d {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3153f;

    public /* synthetic */ g(ArrayList arrayList) {
        this.f3153f = arrayList;
    }

    @Override // o5.d
    public Object a(l5.f fVar, Object obj, Object obj2) {
        this.f3153f.add(new AbstractMap.SimpleImmutableEntry(fVar, obj));
        return null;
    }

    public void b(int i7) {
        ArrayList arrayList = this.f3153f;
        if (arrayList.isEmpty() || !(((Number) arrayList.get(0)).intValue() == i7 || ((Number) arrayList.get(arrayList.size() - 1)).intValue() == i7)) {
            int size = arrayList.size();
            arrayList.add(Integer.valueOf(i7));
            while (size > 0) {
                int i8 = ((size + 1) >>> 1) - 1;
                int intValue = ((Number) arrayList.get(i8)).intValue();
                if (i7 <= intValue) {
                    break;
                }
                arrayList.set(size, Integer.valueOf(intValue));
                size = i8;
            }
            arrayList.set(size, Integer.valueOf(i7));
        }
    }

    public void c(String str, String str2) {
        r6.k.f(str, "name");
        r6.k.f(str2, "value");
        ArrayList arrayList = this.f3153f;
        arrayList.add(str);
        arrayList.add(z6.h.W(str2).toString());
    }

    public s7.k d() {
        return new s7.k((String[]) this.f3153f.toArray(new String[0]));
    }

    public void e() {
        this.f3153f.add(k.f3196c);
    }

    public void f(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f3153f.add(new l(f9, f10, f11, f12, f13, f14));
    }

    @Override // e6.x
    public String g(Object obj) {
        return (String) obj;
    }

    @Override // l.r
    public l.b0 get(int i7) {
        return (l.c0) this.f3153f.get(i7);
    }

    public void h(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f3153f.add(new t(f9, f10, f11, f12, f13, f14));
    }

    public void i(float f9) {
        this.f3153f.add(new m(f9));
    }

    public void j(float f9) {
        this.f3153f.add(new u(f9));
    }

    public void k(float f9, float f10) {
        this.f3153f.add(new n(f9, f10));
    }

    @Override // e6.x
    public Iterator l() {
        return this.f3153f.iterator();
    }

    public void m(float f9, float f10) {
        this.f3153f.add(new v(f9, f10));
    }

    public void n(float f9, float f10) {
        this.f3153f.add(new o(f9, f10));
    }

    public void o(float f9, float f10, float f11, float f12) {
        this.f3153f.add(new y(f9, f10, f11, f12));
    }

    public void p(String str) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3153f;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i7))) {
                arrayList.remove(i7);
                arrayList.remove(i7);
                i7 -= 2;
            }
            i7 += 2;
        }
    }

    public int q() {
        int intValue;
        ArrayList arrayList = this.f3153f;
        if (arrayList.size() <= 0) {
            g0.d.w("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) arrayList.get(0)).intValue();
        while (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == intValue2) {
            arrayList.set(0, e6.l.n0(arrayList));
            arrayList.remove(arrayList.size() - 1);
            int size = arrayList.size();
            int size2 = arrayList.size() >>> 1;
            int i7 = 0;
            while (i7 < size2) {
                int intValue3 = ((Number) arrayList.get(i7)).intValue();
                int i8 = (i7 + 1) * 2;
                int i9 = i8 - 1;
                int intValue4 = ((Number) arrayList.get(i9)).intValue();
                if (i8 >= size || (intValue = ((Number) arrayList.get(i8)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        arrayList.set(i7, Integer.valueOf(intValue4));
                        arrayList.set(i9, Integer.valueOf(intValue3));
                        i7 = i9;
                    }
                } else if (intValue > intValue3) {
                    arrayList.set(i7, Integer.valueOf(intValue));
                    arrayList.set(i8, Integer.valueOf(intValue3));
                    i7 = i8;
                }
            }
        }
        return intValue2;
    }

    public void r(float f9) {
        this.f3153f.add(new b0(f9));
    }

    public void s(float f9) {
        this.f3153f.add(new a0(f9));
    }

    public g(int i7) {
        switch (i7) {
            case 1:
                this.f3153f = new ArrayList();
                break;
            case 2:
                this.f3153f = new ArrayList();
                break;
            case 6:
                this.f3153f = new ArrayList(20);
                break;
            default:
                this.f3153f = new ArrayList(32);
                break;
        }
    }

    public g(float f9, float f10, l.q qVar) {
        w6.d o2 = v1.g.o(0, qVar.b());
        ArrayList arrayList = new ArrayList(e6.n.a0(o2, 10));
        Iterator it = o2.iterator();
        while (((w6.c) it).f9526h) {
            arrayList.add(new l.c0(f9, f10, qVar.a(((e6.b0) it).nextInt())));
        }
        this.f3153f = arrayList;
    }
}
