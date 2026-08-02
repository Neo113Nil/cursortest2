package O1;

import android.os.HandlerThread;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import x1.C1245f;
import x1.C1246g;
import x1.InterfaceC1247h;

/* loaded from: classes.dex */
public final class c implements InterfaceC1247h {

    /* renamed from: a, reason: collision with root package name */
    public final int f1141a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1142b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1143c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f1144d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f1145e;
    public final Serializable f;

    /* renamed from: g, reason: collision with root package name */
    public final Serializable f1146g;

    public c(int i3, int i4) {
        this.f1144d = new LinkedList();
        this.f1145e = new HashSet();
        this.f = new HashSet();
        this.f1146g = new HashMap();
        this.f1143c = "Sqflite";
        this.f1141a = i3;
        this.f1142b = i4;
    }

    @Override // x1.InterfaceC1247h
    public synchronized void a() {
        for (int i3 = 0; i3 < this.f1141a; i3++) {
            C1246g c1246g = new C1246g(((String) this.f1143c) + i3, this.f1142b);
            c1246g.a(new A1.a(this, 21, c1246g));
            ((HashSet) this.f1145e).add(c1246g);
        }
    }

    @Override // x1.InterfaceC1247h
    public synchronized void b() {
        try {
            Iterator it = ((HashSet) this.f1145e).iterator();
            while (it.hasNext()) {
                C1246g c1246g = (C1246g) it.next();
                synchronized (c1246g) {
                    HandlerThread handlerThread = c1246g.f10740c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        c1246g.f10740c = null;
                        c1246g.f10741d = null;
                    }
                }
            }
            Iterator it2 = ((HashSet) this.f).iterator();
            while (it2.hasNext()) {
                C1246g c1246g2 = (C1246g) it2.next();
                synchronized (c1246g2) {
                    HandlerThread handlerThread2 = c1246g2.f10740c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        c1246g2.f10740c = null;
                        c1246g2.f10741d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // x1.InterfaceC1247h
    public synchronized void d(C1245f c1245f) {
        ((LinkedList) this.f1144d).add(c1245f);
        Iterator it = new HashSet((HashSet) this.f1145e).iterator();
        while (it.hasNext()) {
            f((C1246g) it.next());
        }
    }

    public synchronized C1245f e(C1246g c1246g) {
        C1245f c1245f;
        C1246g c1246g2;
        try {
            ListIterator listIterator = ((LinkedList) this.f1144d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                c1245f = (C1245f) listIterator.next();
                c1246g2 = c1245f.a() != null ? (C1246g) ((HashMap) this.f1146g).get(c1245f.a()) : null;
                if (c1246g2 == null) {
                    break;
                }
            } while (c1246g2 != c1246g);
            listIterator.remove();
            return c1245f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f(C1246g c1246g) {
        try {
            C1245f e3 = e(c1246g);
            if (e3 != null) {
                ((HashSet) this.f).add(c1246g);
                ((HashSet) this.f1145e).remove(c1246g);
                if (e3.a() != null) {
                    ((HashMap) this.f1146g).put(e3.a(), c1246g);
                }
                c1246g.f10741d.post(new A1.a(c1246g, 20, e3));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public c(Integer num, int i3, Boolean bool, Integer num2, int i4, Integer num3, Boolean bool2) {
        this.f1143c = num;
        this.f1141a = i3;
        this.f = bool;
        this.f1144d = num2;
        this.f1142b = i4;
        this.f1145e = num3;
        this.f1146g = bool2;
    }
}
