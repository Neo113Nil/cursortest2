package org.apache.a.h;

import java.util.NoSuchElementException;

/* compiled from: BasicHeaderElementIterator.java */
/* loaded from: classes2.dex */
public class d implements org.apache.a.f {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.g f9939a;

    /* renamed from: b, reason: collision with root package name */
    private final r f9940b;

    /* renamed from: c, reason: collision with root package name */
    private org.apache.a.e f9941c;

    /* renamed from: d, reason: collision with root package name */
    private org.apache.a.k.b f9942d;
    private u e;

    public d(org.apache.a.g gVar, r rVar) {
        this.f9941c = null;
        this.f9942d = null;
        this.e = null;
        if (gVar == null) {
            throw new IllegalArgumentException("Header iterator may not be null");
        }
        if (rVar == null) {
            throw new IllegalArgumentException("Parser may not be null");
        }
        this.f9939a = gVar;
        this.f9940b = rVar;
    }

    public d(org.apache.a.g gVar) {
        this(gVar, f.f9944a);
    }

    private void b() {
        this.e = null;
        this.f9942d = null;
        while (this.f9939a.hasNext()) {
            org.apache.a.d a2 = this.f9939a.a();
            if (a2 instanceof org.apache.a.c) {
                org.apache.a.c cVar = (org.apache.a.c) a2;
                this.f9942d = cVar.a();
                this.e = new u(0, this.f9942d.c());
                this.e.a(cVar.b());
                return;
            }
            String d2 = a2.d();
            if (d2 != null) {
                this.f9942d = new org.apache.a.k.b(d2.length());
                this.f9942d.a(d2);
                this.e = new u(0, this.f9942d.c());
                return;
            }
        }
    }

    private void c() {
        org.apache.a.e b2;
        loop0: while (true) {
            if (!this.f9939a.hasNext() && this.e == null) {
                return;
            }
            if (this.e == null || this.e.c()) {
                b();
            }
            if (this.e != null) {
                while (!this.e.c()) {
                    b2 = this.f9940b.b(this.f9942d, this.e);
                    if (b2.a().length() != 0 || b2.b() != null) {
                        break loop0;
                    }
                }
                if (this.e.c()) {
                    this.e = null;
                    this.f9942d = null;
                }
            }
        }
        this.f9941c = b2;
    }

    @Override // org.apache.a.f, java.util.Iterator
    public boolean hasNext() {
        if (this.f9941c == null) {
            c();
        }
        return this.f9941c != null;
    }

    @Override // org.apache.a.f
    public org.apache.a.e a() throws NoSuchElementException {
        if (this.f9941c == null) {
            c();
        }
        if (this.f9941c == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        org.apache.a.e eVar = this.f9941c;
        this.f9941c = null;
        return eVar;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return a();
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
