package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.impl.qb0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class ir0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final wo f27376a;

    /* renamed from: b, reason: collision with root package name */
    private final we0 f27377b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f27378c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f27379d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f27380e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f27381f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27382g;

    public interface a<T> {
        void invoke(T t4);
    }

    public interface b<T> {
        void a(T t4, qb0 qb0Var);
    }

    private static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f27383a;

        /* renamed from: b, reason: collision with root package name */
        private qb0.a f27384b = new qb0.a();

        /* renamed from: c, reason: collision with root package name */
        private boolean f27385c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27386d;

        public c(T t4) {
            this.f27383a = t4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f27383a.equals(((c) obj).f27383a);
        }

        public final int hashCode() {
            return this.f27383a.hashCode();
        }
    }

    public ir0(Looper looper, wo woVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, woVar, bVar);
    }

    private ir0(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, wo woVar, b<T> bVar) {
        this.f27376a = woVar;
        this.f27379d = copyOnWriteArraySet;
        this.f27378c = bVar;
        this.f27380e = new ArrayDeque<>();
        this.f27381f = new ArrayDeque<>();
        this.f27377b = woVar.a(looper, new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.O7
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean a4;
                a4 = ir0.this.a(message);
                return a4;
            }
        });
    }

    public final void a(T t4) {
        if (this.f27382g) {
            return;
        }
        t4.getClass();
        this.f27379d.add(new c<>(t4));
    }

    public final void b() {
        Iterator<c<T>> it = this.f27379d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.f27378c;
            ((c) next).f27386d = true;
            if (((c) next).f27385c) {
                bVar.a(next.f27383a, ((c) next).f27384b.a());
            }
        }
        this.f27379d.clear();
        this.f27382g = true;
    }

    public final ir0<T> a(Looper looper, b<T> bVar) {
        return new ir0<>(this.f27379d, looper, this.f27376a, bVar);
    }

    public final void a() {
        if (this.f27381f.isEmpty()) {
            return;
        }
        if (!this.f27377b.b()) {
            we0 we0Var = this.f27377b;
            we0Var.a(we0Var.b(0));
        }
        boolean isEmpty = this.f27380e.isEmpty();
        this.f27380e.addAll(this.f27381f);
        this.f27381f.clear();
        if (isEmpty) {
            while (!this.f27380e.isEmpty()) {
                this.f27380e.peekFirst().run();
                this.f27380e.removeFirst();
            }
        }
    }

    public final void b(T t4) {
        Iterator<c<T>> it = this.f27379d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f27383a.equals(t4)) {
                b<T> bVar = this.f27378c;
                ((c) next).f27386d = true;
                if (((c) next).f27385c) {
                    bVar.a(next.f27383a, ((c) next).f27384b.a());
                }
                this.f27379d.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator<c<T>> it = this.f27379d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.f27378c;
            if (!((c) next).f27386d && ((c) next).f27385c) {
                qb0 a4 = ((c) next).f27384b.a();
                ((c) next).f27384b = new qb0.a();
                ((c) next).f27385c = false;
                bVar.a(next.f27383a, a4);
            }
            if (this.f27377b.b()) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i4, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.f27386d) {
                if (i4 != -1) {
                    cVar.f27384b.a(i4);
                }
                cVar.f27385c = true;
                aVar.invoke(cVar.f27383a);
            }
        }
    }

    public final void a(final int i4, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f27379d);
        this.f27381f.add(new Runnable() { // from class: com.yandex.mobile.ads.impl.P7
            @Override // java.lang.Runnable
            public final void run() {
                ir0.a(copyOnWriteArraySet, i4, aVar);
            }
        });
    }
}
