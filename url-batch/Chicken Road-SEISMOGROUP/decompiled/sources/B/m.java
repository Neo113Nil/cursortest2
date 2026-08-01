package B;

import android.os.HandlerThread;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final int f45a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f47c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f48d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f49e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f50f;

    /* renamed from: g, reason: collision with root package name */
    public final Serializable f51g;

    public m(int i2, int i3) {
        this.f48d = new LinkedList();
        this.f49e = new HashSet();
        this.f50f = new HashSet();
        this.f51g = new HashMap();
        this.f47c = "Sqflite";
        this.f45a = i2;
        this.f46b = i3;
    }

    @Override // B.l
    public synchronized void a(h hVar) {
        ((LinkedList) this.f48d).add(hVar);
        Iterator it = new HashSet((HashSet) this.f49e).iterator();
        while (it.hasNext()) {
            f((j) it.next());
        }
    }

    @Override // B.l
    public synchronized void b() {
        try {
            Iterator it = ((HashSet) this.f49e).iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                synchronized (jVar) {
                    HandlerThread handlerThread = jVar.f39c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        jVar.f39c = null;
                        jVar.f40d = null;
                    }
                }
            }
            Iterator it2 = ((HashSet) this.f50f).iterator();
            while (it2.hasNext()) {
                j jVar2 = (j) it2.next();
                synchronized (jVar2) {
                    HandlerThread handlerThread2 = jVar2.f39c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        jVar2.f39c = null;
                        jVar2.f40d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // B.l
    public synchronized void c() {
        for (int i2 = 0; i2 < this.f45a; i2++) {
            j jVar = new j(((String) this.f47c) + i2, this.f46b);
            jVar.a(new i(this, jVar));
            ((HashSet) this.f49e).add(jVar);
        }
    }

    public synchronized h e(j jVar) {
        h hVar;
        j jVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f48d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                hVar = (h) listIterator.next();
                jVar2 = hVar.a() != null ? (j) ((HashMap) this.f51g).get(hVar.a()) : null;
                if (jVar2 == null) {
                    break;
                }
            } while (jVar2 != jVar);
            listIterator.remove();
            return hVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f(j jVar) {
        try {
            h e2 = e(jVar);
            if (e2 != null) {
                ((HashSet) this.f50f).add(jVar);
                ((HashSet) this.f49e).remove(jVar);
                if (e2.a() != null) {
                    ((HashMap) this.f51g).put(e2.a(), jVar);
                }
                jVar.f40d.post(new i(0, jVar, e2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public m(Integer num, int i2, Boolean bool, Integer num2, int i3, Integer num3, Boolean bool2) {
        this.f47c = num;
        this.f45a = i2;
        this.f48d = bool;
        this.f49e = num2;
        this.f46b = i3;
        this.f50f = num3;
        this.f51g = bool2;
    }
}
