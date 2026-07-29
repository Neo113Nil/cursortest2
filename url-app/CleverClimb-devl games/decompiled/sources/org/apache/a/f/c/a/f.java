package org.apache.a.f.c.a;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: RouteSpecificPool.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.c.b.b f9806a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    protected final int f9807b;

    /* renamed from: c, reason: collision with root package name */
    protected final org.apache.a.c.a.b f9808c;
    private final Log g = LogFactory.getLog(getClass());

    /* renamed from: d, reason: collision with root package name */
    protected final LinkedList<b> f9809d = new LinkedList<>();
    protected final Queue<h> e = new LinkedList();
    protected int f = 0;

    public f(org.apache.a.c.b.b bVar, org.apache.a.c.a.b bVar2) {
        this.f9806a = bVar;
        this.f9808c = bVar2;
        this.f9807b = bVar2.a(bVar);
    }

    public final org.apache.a.c.b.b a() {
        return this.f9806a;
    }

    public final int b() {
        return this.f9807b;
    }

    public boolean c() {
        return this.f < 1 && this.e.isEmpty();
    }

    public int d() {
        return this.f9808c.a(this.f9806a) - this.f;
    }

    public b a(Object obj) {
        if (!this.f9809d.isEmpty()) {
            ListIterator<b> listIterator = this.f9809d.listIterator(this.f9809d.size());
            while (listIterator.hasPrevious()) {
                b previous = listIterator.previous();
                if (previous.a() == null || org.apache.a.k.f.a(obj, previous.a())) {
                    listIterator.remove();
                    return previous;
                }
            }
        }
        if (d() != 0 || this.f9809d.isEmpty()) {
            return null;
        }
        b remove = this.f9809d.remove();
        remove.b();
        try {
            remove.c().c();
        } catch (IOException e) {
            this.g.debug("I/O error closing connection", e);
        }
        return remove;
    }

    public void a(b bVar) {
        if (this.f < 1) {
            throw new IllegalStateException("No entry created for this pool. " + this.f9806a);
        }
        if (this.f <= this.f9809d.size()) {
            throw new IllegalStateException("No entry allocated from this pool. " + this.f9806a);
        }
        this.f9809d.add(bVar);
    }

    public void b(b bVar) {
        if (!this.f9806a.equals(bVar.d())) {
            throw new IllegalArgumentException("Entry not planned for this pool.\npool: " + this.f9806a + "\nplan: " + bVar.d());
        }
        this.f++;
    }

    public boolean c(b bVar) {
        boolean remove = this.f9809d.remove(bVar);
        if (remove) {
            this.f--;
        }
        return remove;
    }

    public void e() {
        if (this.f < 1) {
            throw new IllegalStateException("There is no entry that could be dropped.");
        }
        this.f--;
    }

    public void a(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Waiting thread must not be null.");
        }
        this.e.add(hVar);
    }

    public boolean f() {
        return !this.e.isEmpty();
    }

    public h g() {
        return this.e.peek();
    }

    public void b(h hVar) {
        if (hVar == null) {
            return;
        }
        this.e.remove(hVar);
    }
}
