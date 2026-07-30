package j$.time.format;

import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class u {
    public static final j$.time.a0 h = new j$.time.a0(1);
    public static final Map i;
    public u a;
    public final u b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.a;
        hashMap.put('Q', hVar);
        hashMap.put('q', hVar);
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
        hashMap.put('g', j$.time.temporal.l.a);
    }

    public u() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        c(dVar);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new f(aVar, i2, i3, z));
        } else {
            j(new f(aVar, i2, i3, z));
        }
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        u uVar = this.a;
        int i2 = uVar.e;
        if (i2 > 0) {
            k kVar = new k(eVar, i2, uVar.f);
            uVar.e = 0;
            uVar.f = (char) 0;
            eVar = kVar;
        }
        ((ArrayList) uVar.c).add(eVar);
        this.a.g = -1;
        return ((ArrayList) r4.c).size() - 1;
    }

    public final void d(char c) {
        c(new c(c));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(str, 1));
        }
    }

    public final void f(g0 g0Var) {
        Objects.requireNonNull(g0Var, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
        if (g0Var != g0.FULL && g0Var != g0.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(g0Var, 0));
    }

    public final void g(String str, String str2) {
        c(new j(str, str2));
    }

    public final void h(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        g0 g0Var = g0.FULL;
        c(new q(aVar, g0Var, new a(new a0(Collections.singletonMap(g0Var, linkedHashMap)))));
    }

    public final void i(j$.time.temporal.q qVar, g0 g0Var) {
        Objects.requireNonNull(g0Var, "textStyle");
        c(new q(qVar, g0Var, b0.c));
    }

    public final void j(i iVar) {
        i d;
        u uVar = this.a;
        int i2 = uVar.g;
        if (i2 < 0) {
            uVar.g = c(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) uVar.c).get(i2);
        int i3 = iVar.b;
        int i4 = iVar.c;
        if (i3 == i4 && iVar.d == f0.NOT_NEGATIVE) {
            d = iVar2.e(i4);
            c(iVar.d());
            this.a.g = i2;
        } else {
            d = iVar2.d();
            this.a.g = c(iVar);
        }
        ((ArrayList) this.a.c).set(i2, d);
    }

    public final void k(j$.time.temporal.q qVar) {
        j(new i(qVar, 1, 19, f0.NORMAL));
    }

    public final void l(j$.time.temporal.q qVar, int i2) {
        Objects.requireNonNull(qVar, "field");
        if (i2 < 1 || i2 > 19) {
            j$.time.h.h("The width must be from 1 to 19 inclusive but was ", i2);
        } else {
            j(new i(qVar, i2, i2, f0.NOT_NEGATIVE));
        }
    }

    public final void m(j$.time.temporal.q qVar, int i2, int i3, f0 f0Var) {
        if (i2 == i3 && f0Var == f0.NOT_NEGATIVE) {
            l(qVar, i3);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(f0Var, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.time.h.h("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i3 < 1 || i3 > 19) {
            j$.time.h.h("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return;
        }
        if (i3 >= i2) {
            j(new i(qVar, i2, i3, f0Var));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void n() {
        u uVar = this.a;
        if (uVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = ((ArrayList) uVar.c).size();
        u uVar2 = this.a;
        if (size <= 0) {
            this.a = uVar2.b;
            return;
        }
        d dVar = new d(uVar2.c, uVar2.d);
        this.a = this.a.b;
        c(dVar);
    }

    public final void o() {
        u uVar = this.a;
        uVar.g = -1;
        this.a = new u(uVar);
    }

    public final DateTimeFormatter p(e0 e0Var, j$.time.chrono.m mVar) {
        return q(Locale.getDefault(), e0Var, mVar);
    }

    public final DateTimeFormatter q(Locale locale, e0 e0Var, j$.time.chrono.m mVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        d dVar = new d(this.c, false);
        c0 c0Var = c0.a;
        return new DateTimeFormatter(dVar, locale, e0Var, mVar);
    }

    public u(u uVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = uVar;
        this.d = true;
    }
}
