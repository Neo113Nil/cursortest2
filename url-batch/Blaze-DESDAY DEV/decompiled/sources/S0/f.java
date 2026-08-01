package S0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d f777a;

    /* renamed from: b, reason: collision with root package name */
    public int f778b = 18;

    /* renamed from: c, reason: collision with root package name */
    public int f779c = 24;
    public final V0.e d = new V0.e();

    /* renamed from: e, reason: collision with root package name */
    public a f780e;

    /* renamed from: f, reason: collision with root package name */
    public a f781f;

    /* renamed from: g, reason: collision with root package name */
    public e f782g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f783j;

    /* renamed from: k, reason: collision with root package name */
    public c f784k;

    public f(d dVar) {
        this.f777a = dVar;
        a aVar = a.d;
        this.f780e = aVar;
        this.f781f = aVar;
        this.f782g = new e(0, 0);
        this.f783j = dVar.d;
        this.f784k = c.f768a;
    }

    public final void a(int i, int i2) {
        if (i < 8) {
            i = 8;
        }
        this.f778b = i;
        if (i2 < 10) {
            i2 = 10;
        }
        this.f779c = i2;
    }

    public final i b() {
        int i = this.f783j - 1;
        this.f783j = i;
        if (i <= 0) {
            this.f784k = c.f770c;
            return i.f789e;
        }
        c();
        e();
        this.f784k = c.f768a;
        return i.d;
    }

    public final void c() {
        V0.e eVar = this.d;
        eVar.clear();
        int i = this.f778b / 2;
        int i2 = this.f779c / 2;
        eVar.addFirst(new e(i, i2));
        eVar.addLast(new e(i - 1, i2));
        eVar.addLast(new e(i - 2, i2));
        a aVar = a.d;
        this.f780e = aVar;
        this.f781f = aVar;
    }

    public final void d(a aVar) {
        a aVar2 = this.f780e;
        aVar2.getClass();
        int ordinal = aVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new U0.b();
                    }
                    if (aVar == a.f765c) {
                        return;
                    }
                } else if (aVar == a.d) {
                    return;
                }
            } else if (aVar == a.f763a) {
                return;
            }
        } else if (aVar == a.f764b) {
            return;
        }
        this.f781f = aVar;
    }

    public final void e() {
        V0.e eVar = this.d;
        ArrayList arrayList = new ArrayList(V0.i.x0(eVar));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            arrayList.add(new U0.c(Integer.valueOf(eVar2.f775a), Integer.valueOf(eVar2.f776b)));
        }
        Set E0 = V0.g.E0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int i = this.f778b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f779c;
            for (int i4 = 0; i4 < i3; i4++) {
                if (!E0.contains(new U0.c(Integer.valueOf(i2), Integer.valueOf(i4)))) {
                    arrayList2.add(new e(i2, i4));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        i1.d dVar = i1.e.f2573a;
        int size = arrayList2.size();
        dVar.getClass();
        this.f782g = (e) arrayList2.get(i1.e.f2574b.a().nextInt(size));
    }
}
