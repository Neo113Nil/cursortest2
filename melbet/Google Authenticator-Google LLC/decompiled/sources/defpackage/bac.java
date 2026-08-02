package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bac {
    public final wq b;
    public final brn c;
    public final brn d;
    public final brn e;
    public final afr f;
    public final afr h;
    private final bbz i;
    private final brn j;
    public final afr g = new afr((byte[]) null, (char[]) null);
    public final bkx a = new bkx();

    public bac() {
        bmm bmmVar = new bmm(new ws(20), new bex(2), new bmk());
        this.b = bmmVar;
        this.h = new afr(bmmVar);
        this.d = new brn((byte[]) null, (byte[]) null, (byte[]) null);
        this.f = new afr((short[]) null);
        this.c = new brn((byte[]) null);
        this.i = new bbz();
        this.e = new brn((char[]) null);
        this.j = new brn((byte[]) null, (byte[]) null);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f.v(arrayList);
    }

    public final bbw a(Object obj) {
        return this.i.a(obj);
    }

    public final List b() {
        List d = this.j.d();
        if (d.isEmpty()) {
            throw new azy();
        }
        return d;
    }

    public final List c(Object obj) {
        List E = this.h.E(obj.getClass());
        if (E.isEmpty()) {
            throw new azz(obj);
        }
        int size = E.size();
        List list = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            bge bgeVar = (bge) E.get(i);
            if (bgeVar.a(obj)) {
                if (z) {
                    list = new ArrayList(size - i);
                }
                list.add(bgeVar);
                z = false;
            }
        }
        if (list.isEmpty()) {
            throw new azz(obj, E);
        }
        return list;
    }

    public final void d(Class cls, bax baxVar) {
        this.d.g(cls, baxVar);
    }

    public final void e(Class cls, bbo bboVar) {
        this.c.c(cls, bboVar);
    }

    public final void f(Class cls, Class cls2, bgf bgfVar) {
        this.h.F(cls, cls2, bgfVar);
    }

    public final void g(String str, Class cls, Class cls2, bbn bbnVar) {
        this.f.u(str, bbnVar, cls, cls2);
    }

    public final void h(Class cls, Class cls2, bbn bbnVar) {
        this.f.w(bbnVar, cls, cls2);
    }

    public final void i(baz bazVar) {
        this.j.e(bazVar);
    }

    public final void j(bbv bbvVar) {
        this.i.b(bbvVar);
    }

    public final void k(Class cls, Class cls2, bjs bjsVar) {
        this.e.j(cls, cls2, bjsVar);
    }
}
