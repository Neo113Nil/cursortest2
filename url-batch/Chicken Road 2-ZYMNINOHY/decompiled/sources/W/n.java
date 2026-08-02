package W;

import a.AbstractC0124a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f3321a;

    /* renamed from: b, reason: collision with root package name */
    public final F f3322b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0119l f3323c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f3324d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f3325e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f3326f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3327g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3328h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3329i;

    public n(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f3327g) {
            try {
                if (this.f3328h) {
                    return;
                }
                this.f3324d.add(new C0120m(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f3326f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.f3323c != null) {
            F f4 = this.f3322b;
            f4.getClass();
            Handler handler = f4.f3257a;
            if (!handler.hasMessages(1)) {
                E b4 = F.b();
                Message obtainMessage = handler.obtainMessage(1);
                b4.f3255a = obtainMessage;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b4.a();
            }
        }
        ArrayDeque arrayDeque2 = this.f3325e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i4, InterfaceC0118k interfaceC0118k) {
        f();
        this.f3326f.add(new RunnableC0117j(new CopyOnWriteArraySet(this.f3324d), i4, interfaceC0118k, 0));
    }

    public final void d() {
        f();
        synchronized (this.f3327g) {
            this.f3328h = true;
        }
        Iterator it = this.f3324d.iterator();
        while (it.hasNext()) {
            C0120m c0120m = (C0120m) it.next();
            InterfaceC0119l interfaceC0119l = this.f3323c;
            c0120m.f3320d = true;
            if (interfaceC0119l != null && c0120m.f3319c) {
                c0120m.f3319c = false;
                interfaceC0119l.b(c0120m.f3317a, c0120m.f3318b.b());
            }
        }
        this.f3324d.clear();
    }

    public final void e(int i4, InterfaceC0118k interfaceC0118k) {
        c(i4, interfaceC0118k);
        b();
    }

    public final void f() {
        if (this.f3329i) {
            AbstractC0124a.t(Thread.currentThread() == this.f3321a);
        }
    }

    public n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, D d4, InterfaceC0119l interfaceC0119l, boolean z) {
        this.f3321a = thread;
        this.f3324d = copyOnWriteArraySet;
        this.f3323c = interfaceC0119l;
        this.f3327g = new Object();
        this.f3325e = new ArrayDeque();
        this.f3326f = new ArrayDeque();
        if (looper == null || d4 == null || interfaceC0119l == null) {
            this.f3322b = null;
        } else {
            this.f3322b = d4.a(looper, new C0116i(0, this));
        }
        this.f3329i = z;
    }
}
