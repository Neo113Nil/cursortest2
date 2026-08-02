package h0;

import D0.RunnableC0061v;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201i implements InterfaceC0200h {

    /* renamed from: a, reason: collision with root package name */
    public final int f2311a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2312b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2313c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f2314d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f2315e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f2316f;

    /* renamed from: g, reason: collision with root package name */
    public final Serializable f2317g;

    public C0201i(int i2, int i3) {
        this.f2314d = new LinkedList();
        this.f2315e = new HashSet();
        this.f2316f = new HashSet();
        this.f2317g = new HashMap();
        this.f2313c = "Sqflite";
        this.f2311a = i2;
        this.f2312b = i3;
    }

    @Override // h0.InterfaceC0200h
    public synchronized void a() {
        try {
            Iterator it = ((HashSet) this.f2315e).iterator();
            while (it.hasNext()) {
                ((C0199g) it.next()).a();
            }
            Iterator it2 = ((HashSet) this.f2316f).iterator();
            while (it2.hasNext()) {
                ((C0199g) it2.next()).a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // h0.InterfaceC0200h
    public void b(C0197e c0197e, Runnable runnable) {
        C0198f c0198f = new C0198f(c0197e == null ? null : new B.m(20, c0197e), runnable);
        synchronized (this) {
            ((LinkedList) this.f2314d).add(c0198f);
            Iterator it = new HashSet((HashSet) this.f2315e).iterator();
            while (it.hasNext()) {
                d((C0199g) it.next());
            }
        }
    }

    public synchronized C0198f c(C0199g c0199g) {
        C0198f c0198f;
        C0199g c0199g2;
        try {
            ListIterator listIterator = ((LinkedList) this.f2314d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                c0198f = (C0198f) listIterator.next();
                c0199g2 = c0198f.a() != null ? (C0199g) ((HashMap) this.f2317g).get(c0198f.a()) : null;
                if (c0199g2 == null) {
                    break;
                }
            } while (c0199g2 != c0199g);
            listIterator.remove();
            return c0198f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(C0199g c0199g) {
        try {
            C0198f c2 = c(c0199g);
            if (c2 != null) {
                ((HashSet) this.f2316f).add(c0199g);
                ((HashSet) this.f2315e).remove(c0199g);
                if (c2.a() != null) {
                    ((HashMap) this.f2317g).put(c2.a(), c0199g);
                }
                c0199g.f2308d.post(new RunnableC0061v(2, c0199g, c2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // h0.InterfaceC0200h
    public synchronized void start() {
        for (int i2 = 0; i2 < this.f2311a; i2++) {
            C0199g c0199g = new C0199g(((String) this.f2313c) + i2, this.f2312b);
            c0199g.b(new RunnableC0061v(3, this, c0199g));
            ((HashSet) this.f2315e).add(c0199g);
        }
    }

    public C0201i(Integer num, int i2, Boolean bool, Integer num2, int i3, Integer num3, Boolean bool2) {
        this.f2313c = num;
        this.f2311a = i2;
        this.f2314d = bool;
        this.f2315e = num2;
        this.f2312b = i3;
        this.f2316f = num3;
        this.f2317g = bool2;
    }
}
