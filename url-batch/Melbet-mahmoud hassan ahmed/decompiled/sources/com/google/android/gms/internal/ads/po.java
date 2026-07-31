package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class po {

    /* renamed from: b, reason: collision with root package name */
    int f10299b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f10298a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List<oo> f10300c = new LinkedList();

    public final oo a(boolean z6) {
        synchronized (this.f10298a) {
            oo ooVar = null;
            if (this.f10300c.size() == 0) {
                io0.b("Queue empty");
                return null;
            }
            int i7 = 0;
            if (this.f10300c.size() < 2) {
                oo ooVar2 = this.f10300c.get(0);
                if (z6) {
                    this.f10300c.remove(0);
                } else {
                    ooVar2.i();
                }
                return ooVar2;
            }
            int i8 = Integer.MIN_VALUE;
            int i9 = 0;
            for (oo ooVar3 : this.f10300c) {
                int b7 = ooVar3.b();
                if (b7 > i8) {
                    i7 = i9;
                }
                int i10 = b7 > i8 ? b7 : i8;
                if (b7 > i8) {
                    ooVar = ooVar3;
                }
                i9++;
                i8 = i10;
            }
            this.f10300c.remove(i7);
            return ooVar;
        }
    }

    public final void b(oo ooVar) {
        synchronized (this.f10298a) {
            if (this.f10300c.size() >= 10) {
                int size = this.f10300c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                io0.b(sb.toString());
                this.f10300c.remove(0);
            }
            int i7 = this.f10299b;
            this.f10299b = i7 + 1;
            ooVar.j(i7);
            ooVar.n();
            this.f10300c.add(ooVar);
        }
    }

    public final boolean c(oo ooVar) {
        synchronized (this.f10298a) {
            Iterator<oo> it = this.f10300c.iterator();
            while (it.hasNext()) {
                oo next = it.next();
                if (y2.t.p().h().L()) {
                    if (!y2.t.p().h().v() && ooVar != next && next.f().equals(ooVar.f())) {
                        it.remove();
                        return true;
                    }
                } else if (ooVar != next && next.d().equals(ooVar.d())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean d(oo ooVar) {
        synchronized (this.f10298a) {
            return this.f10300c.contains(ooVar);
        }
    }
}
