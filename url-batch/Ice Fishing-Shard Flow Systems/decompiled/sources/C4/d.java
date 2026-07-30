package C4;

import D6.q;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f300a;

    public d(int i2) {
        switch (i2) {
            case 1:
                this.f300a = new ArrayList();
                break;
            case 2:
                this.f300a = new ArrayList(20);
                break;
            default:
                this.f300a = new ArrayList();
                break;
        }
    }

    public void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        P0.f.m(this, name, value);
    }

    public b b() {
        ArrayList arrayList = this.f300a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new b(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = b.f296i;
        for (int i2 = 0; i2 < array.length; i2 += 2) {
            H4.e eVar = (H4.e) array[i2];
            if (eVar != null && eVar.f991b.isEmpty()) {
                array[i2] = null;
            }
        }
        return new b(array, b.f296i);
    }

    public D4.a c() {
        ArrayList arrayList = this.f300a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new D4.a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = D4.a.f354l;
        for (int i2 = 0; i2 < array.length; i2 += 2) {
            E4.a aVar = (E4.a) array[i2];
            if (aVar != null && aVar.f701b.isEmpty()) {
                array[i2] = null;
            }
        }
        return new D4.a(array, D4.a.f354l);
    }

    public q d() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return new q((String[]) this.f300a.toArray(new String[0]));
    }

    public void e(H4.e eVar, Object obj) {
        ArrayList arrayList = this.f300a;
        if (eVar == null || eVar.f991b.isEmpty() || obj == null) {
            return;
        }
        arrayList.add(eVar);
        arrayList.add(obj);
    }

    public void f(String str, String str2) {
        e(H4.e.a(e.f301d, str), str2);
    }

    public void g(f fVar) {
        if (fVar == null) {
            return;
        }
        fVar.forEach(new c(0, this));
    }

    public void h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f300a;
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

    public void i(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        P0.f.v(name);
        P0.f.w(value, name);
        h(name);
        P0.f.m(this, name, value);
    }
}
