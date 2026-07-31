package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.si;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class n7 {
    public int a;
    public int b;
    public final Map c = new LinkedHashMap();
    public final Map d = new LinkedHashMap();
    public final Set e = new LinkedHashSet();

    public final synchronized pi e(pi piVar) {
        if (piVar == null) {
            return null;
        }
        try {
            d(piVar);
            if (b(piVar) > this.b) {
                g(piVar);
            }
            if (this.e.contains(piVar.f())) {
                return null;
            }
            if (i(piVar) <= this.a) {
                return piVar;
            }
            return f(piVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final pi f(pi piVar) {
        ya yaVar = new ya(si.f.i, piVar.f().getValue(), null, null, null, null, 60, null);
        this.e.add(piVar.f());
        return yaVar;
    }

    public n7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void g(pi piVar) {
        h(piVar);
        this.d.remove(piVar.f());
    }

    public final long b(pi piVar) {
        return (piVar.i() - a(piVar)) / 1000;
    }

    public final void h(pi piVar) {
        this.c.put(piVar.f(), Long.valueOf(piVar.i()));
    }

    public final void d(pi piVar) {
        if (this.c.containsKey(piVar.f())) {
            return;
        }
        this.c.put(piVar.f(), Long.valueOf(piVar.i()));
    }

    public final int i(pi piVar) {
        int c = c(piVar) + 1;
        this.d.put(piVar.f(), Integer.valueOf(c));
        return c;
    }

    public final int c(pi piVar) {
        Integer num = (Integer) this.d.get(piVar.f());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final long a(pi piVar) {
        Long l = (Long) this.c.get(piVar.f());
        return l != null ? l.longValue() : piVar.i();
    }
}
