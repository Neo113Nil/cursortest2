package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3759pp {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f33512a;

    /* renamed from: b, reason: collision with root package name */
    public final C3709ot f33513b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2510Co f33514c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f33515d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f33516e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f33517f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f33518g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33519h;
    public final boolean i;

    public C3759pp(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f33518g) {
            try {
                if (this.f33519h) {
                    return;
                }
                this.f33515d.add(new C2765Ro(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        if (this.i) {
            PA.T(Thread.currentThread() == this.f33512a);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f33515d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C2765Ro c2765Ro = (C2765Ro) it.next();
            if (c2765Ro.f27423a.equals(obj)) {
                c2765Ro.f27426d = true;
                InterfaceC2510Co interfaceC2510Co = this.f33514c;
                if (interfaceC2510Co != null && c2765Ro.f27425c) {
                    c2765Ro.f27425c = false;
                    interfaceC2510Co.C(c2765Ro.f27423a, c2765Ro.f27424b.u());
                }
                copyOnWriteArraySet.remove(c2765Ro);
            }
        }
    }

    public final void c(int i, InterfaceC3865ro interfaceC3865ro) {
        if (this.i) {
            PA.T(Thread.currentThread() == this.f33512a);
        }
        this.f33517f.add(new RunnableC3003bp(i, 0, new CopyOnWriteArraySet(this.f33515d), interfaceC3865ro));
    }

    public final void d() {
        if (this.i) {
            PA.T(Thread.currentThread() == this.f33512a);
        }
        ArrayDeque arrayDeque = this.f33517f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.f33514c != null) {
            C3709ot c3709ot = this.f33513b;
            c3709ot.getClass();
            Handler handler = c3709ot.f33230a;
            if (!handler.hasMessages(1)) {
                C3333ht g9 = C3709ot.g();
                Message obtainMessage = handler.obtainMessage(1);
                g9.f31278a = obtainMessage;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                g9.f31278a = null;
                C3709ot.f(g9);
            }
        }
        ArrayDeque arrayDeque2 = this.f33516e;
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

    public final void e() {
        if (this.i) {
            PA.T(Thread.currentThread() == this.f33512a);
        }
        synchronized (this.f33518g) {
            this.f33519h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f33515d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C2765Ro c2765Ro = (C2765Ro) it.next();
            InterfaceC2510Co interfaceC2510Co = this.f33514c;
            c2765Ro.f27426d = true;
            if (interfaceC2510Co != null && c2765Ro.f27425c) {
                c2765Ro.f27425c = false;
                interfaceC2510Co.C(c2765Ro.f27423a, c2765Ro.f27424b.u());
            }
        }
        copyOnWriteArraySet.clear();
    }

    public C3759pp(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, T2 t22, InterfaceC2510Co interfaceC2510Co, boolean z8) {
        this.f33512a = thread;
        this.f33515d = copyOnWriteArraySet;
        this.f33514c = interfaceC2510Co;
        this.f33518g = new Object();
        this.f33516e = new ArrayDeque();
        this.f33517f = new ArrayDeque();
        this.f33513b = (looper == null || t22 == null || interfaceC2510Co == null) ? null : t22.A(looper, new C3597mp(0, this));
        this.i = z8;
    }
}
