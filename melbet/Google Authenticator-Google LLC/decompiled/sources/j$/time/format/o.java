package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class o {
    public static final b f = new b(0);
    public o a;
    public final o b;
    public final ArrayList c;
    public final boolean d;
    public int e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
        hashMap.put('Q', fVar);
        hashMap.put('q', fVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.j.a);
    }

    public o() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(a aVar) {
        f fVar = aVar.a;
        if (fVar.b) {
            fVar = new f(fVar.a, false);
        }
        b(fVar);
    }

    public final int b(g gVar) {
        Objects.a(gVar, "pp");
        o oVar = this.a;
        oVar.getClass();
        oVar.c.add(gVar);
        this.a.e = -1;
        return r1.c.size() - 1;
    }

    public final void c(char c) {
        b(new e(c));
    }

    public final void d(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new e(str.charAt(0)));
        } else {
            b(new m(str));
        }
    }

    public final void e(j$.time.temporal.a aVar, HashMap hashMap) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        w wVar = w.FULL;
        b(new n(aVar, wVar, new c(new s(Collections.singletonMap(wVar, linkedHashMap)))));
    }

    public final void f(j jVar) {
        j a;
        o oVar = this.a;
        int i = oVar.e;
        if (i < 0) {
            oVar.e = b(jVar);
            return;
        }
        j jVar2 = (j) oVar.c.get(i);
        int i2 = jVar.b;
        int i3 = jVar.c;
        if (i2 == i3 && jVar.d == v.NOT_NEGATIVE) {
            a = jVar2.b(i3);
            b(jVar.a());
            this.a.e = i;
        } else {
            a = jVar2.a();
            this.a.e = b(jVar);
        }
        this.a.c.set(i, a);
    }

    public final void g(j$.time.temporal.n nVar, int i) {
        Objects.a(nVar, "field");
        if (i >= 1 && i <= 19) {
            f(new j(nVar, i, i, v.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
    }

    public final void h(j$.time.temporal.n nVar, int i, int i2, v vVar) {
        if (i == i2 && vVar == v.NOT_NEGATIVE) {
            g(nVar, i2);
            return;
        }
        Objects.a(nVar, "field");
        Objects.a(vVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 >= i) {
            f(new j(nVar, i, i2, vVar));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public final void i() {
        o oVar = this.a;
        if (oVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = oVar.c.size();
        o oVar2 = this.a;
        if (size <= 0) {
            this.a = oVar2.b;
            return;
        }
        f fVar = new f(oVar2.c, oVar2.d);
        this.a = this.a.b;
        b(fVar);
    }

    public final void j() {
        o oVar = this.a;
        oVar.e = -1;
        this.a = new o(oVar);
    }

    public final a k(u uVar, j$.time.chrono.a aVar) {
        return l(Locale.getDefault(), uVar, aVar);
    }

    public final a l(Locale locale, u uVar, j$.time.chrono.a aVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            i();
        }
        f fVar = new f(this.c, false);
        int i = t.a;
        return new a(fVar, locale, uVar, aVar);
    }

    public o(o oVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = oVar;
        this.d = true;
    }
}
