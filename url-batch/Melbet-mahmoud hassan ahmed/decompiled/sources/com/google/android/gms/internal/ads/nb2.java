package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class nb2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final xv1 f9021a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f9022b;

    /* renamed from: c, reason: collision with root package name */
    private final l92<T> f9023c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<ma2<T>> f9024d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f9025e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f9026f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9027g;

    public nb2(Looper looper, xv1 xv1Var, l92<T> l92Var) {
        this(new CopyOnWriteArraySet(), looper, xv1Var, l92Var);
    }

    private nb2(CopyOnWriteArraySet<ma2<T>> copyOnWriteArraySet, Looper looper, xv1 xv1Var, l92<T> l92Var) {
        this.f9021a = xv1Var;
        this.f9024d = copyOnWriteArraySet;
        this.f9023c = l92Var;
        this.f9025e = new ArrayDeque<>();
        this.f9026f = new ArrayDeque<>();
        this.f9022b = xv1Var.a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.i62
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                nb2.g(nb2.this, message);
                return true;
            }
        });
    }

    public static /* synthetic */ boolean g(nb2 nb2Var, Message message) {
        Iterator<ma2<T>> it = nb2Var.f9024d.iterator();
        while (it.hasNext()) {
            it.next().b(nb2Var.f9023c);
            if (nb2Var.f9022b.E(0)) {
                return true;
            }
        }
        return true;
    }

    public final nb2<T> a(Looper looper, l92<T> l92Var) {
        return new nb2<>(this.f9024d, looper, this.f9021a, l92Var);
    }

    public final void b(T t6) {
        if (this.f9027g) {
            return;
        }
        Objects.requireNonNull(t6);
        this.f9024d.add(new ma2<>(t6));
    }

    public final void c() {
        if (this.f9026f.isEmpty()) {
            return;
        }
        if (!this.f9022b.E(0)) {
            h52 h52Var = this.f9022b;
            h52Var.J(h52Var.d(0));
        }
        boolean isEmpty = this.f9025e.isEmpty();
        this.f9025e.addAll(this.f9026f);
        this.f9026f.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.f9025e.isEmpty()) {
            this.f9025e.peekFirst().run();
            this.f9025e.removeFirst();
        }
    }

    public final void d(final int i7, final k82<T> k82Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f9024d);
        this.f9026f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.j72
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i8 = i7;
                k82 k82Var2 = k82Var;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((ma2) it.next()).a(i8, k82Var2);
                }
            }
        });
    }

    public final void e() {
        Iterator<ma2<T>> it = this.f9024d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f9023c);
        }
        this.f9024d.clear();
        this.f9027g = true;
    }

    public final void f(T t6) {
        Iterator<ma2<T>> it = this.f9024d.iterator();
        while (it.hasNext()) {
            ma2<T> next = it.next();
            if (next.f8468a.equals(t6)) {
                next.c(this.f9023c);
                this.f9024d.remove(next);
            }
        }
    }
}
