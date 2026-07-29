package org.apache.a.h;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: BasicListHeaderIterator.java */
/* loaded from: classes2.dex */
public class k implements org.apache.a.g {

    /* renamed from: a, reason: collision with root package name */
    protected final List f9956a;

    /* renamed from: b, reason: collision with root package name */
    protected int f9957b;

    /* renamed from: c, reason: collision with root package name */
    protected int f9958c;

    /* renamed from: d, reason: collision with root package name */
    protected String f9959d;

    public k(List list, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Header list must not be null.");
        }
        this.f9956a = list;
        this.f9959d = str;
        this.f9957b = a(-1);
        this.f9958c = -1;
    }

    protected int a(int i) {
        if (i < -1) {
            return -1;
        }
        int size = this.f9956a.size() - 1;
        boolean z = false;
        while (!z && i < size) {
            i++;
            z = b(i);
        }
        if (z) {
            return i;
        }
        return -1;
    }

    protected boolean b(int i) {
        if (this.f9959d == null) {
            return true;
        }
        return this.f9959d.equalsIgnoreCase(((org.apache.a.d) this.f9956a.get(i)).c());
    }

    @Override // org.apache.a.g, java.util.Iterator
    public boolean hasNext() {
        return this.f9957b >= 0;
    }

    @Override // org.apache.a.g
    public org.apache.a.d a() throws NoSuchElementException {
        int i = this.f9957b;
        if (i < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.f9958c = i;
        this.f9957b = a(i);
        return (org.apache.a.d) this.f9956a.get(i);
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return a();
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        if (this.f9958c < 0) {
            throw new IllegalStateException("No header to remove.");
        }
        this.f9956a.remove(this.f9958c);
        this.f9958c = -1;
        this.f9957b--;
    }
}
